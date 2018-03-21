package com.book.thinkinginjava.classInfo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @comments: 代理
 * @author: binvy
 * @Date: 2018/3/21
 */
public class SimpleProxyDemo {
    public static void consumer(Interface itf) {
        itf.doSomething();
        itf.doSomethingElse("bonobo");
    }
    public static void main(String[] args) {
        RealObject object = new RealObject();
        consumer(object);
        // 创建动态代理： 参数：类加载器， 该代理实现的接口列表（不是类或者抽象类），InvocationHandle接口的一个实现
        // 动态代理可以将所有调用重定向到调用处理器
        Interface real =(Interface)Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(object));
        consumer(real);
    }
}
interface Interface {
    void doSomething();
    void doSomethingElse(String arg);
}
class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("doSomething");
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("doSomethingElse:" + arg);
    }
}
class SimpleProxy implements Interface {
    private Interface proxied;
    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }
    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void doSomethingElse(String arg) {
        System.out.println("SimpleProxy doSomethingElse");
        proxied.doSomethingElse(arg);
    }
}

class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy : " + proxy.getClass() + ". method : " + method + ". args : " + args);
        if (args != null) {
            for ( Object arg : args
                   ) {
                System.out.println("    " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}