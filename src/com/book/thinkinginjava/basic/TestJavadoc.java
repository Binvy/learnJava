package com.book.thinkinginjava.basic;

/**
 * @comments: about comments
 * @author: binvy
 * @Date: 2018/2/21
 */
/** A class comment */
public class TestJavadoc {

    /* This is a comment that
    continues across line */
    /*
     * 多行注释
     */

    /** A field comment */
    public int i;


    /**  A method comment  */
    /** 注释文档 */
    public static void main(String[] args) {
        // This is a one-line comment
        // 单行注释
        System.out.println("This is a javadoc about comment");

        System.out.println("This is a javadoc about comment");

    }


    // 嵌入式HTML
    /**
     *  嵌入式HTML
     *  不要在嵌入式HTML中使用标题标签，例如<h1><hr>，因为javadoc会插入自己的标题，可能会发生冲突。
     *  You can <em>even</em> insert a list;
     * <ol>
     *     <li>Item one</>
     *     <li>Item two</>
     *     <li>Item three</>
     * </ol>
     * <pre>
     *      System.out.println(new Date());
     * </pre>
     */

    //一些标签示例
    // 1. @see: 引用其他类
    //    链接到其他文档:"See Also"（参见）条目
    //    e.g.:
    //    @see classname
    //    @see fully-qualified-classname
    //    @see fully-qualified-classname#method-name
    // 2. {@link package.class#member label}
    //    链接到其它文档，用于行内，且用"label"作为超链接文本
    // 3. {@docRoot}
    //    该标签产生到文档根目录的相对路径，用于文档树页面的显示超链接
    // 4. {@inheritDoc}
    //    该标签从当前这个类的最直接的基类中继承相关的文档到当前的文档注释中
    // 5. @version
    //    格式：@version version-information
    //    version-information: 任何你认为使用包含在版本说明中的重要信息
    //    如果javadoc命令行使用了"-version"标记，那么就从生成的HTML文档中特别提取出版本信息
    // 6. @author
    //    格式：@author author-information
    //    author-information: 姓名，也可以是你的电子邮件地址或者其他任何适宜的信息
    //    如果javadoc命令行使用了"-author"标记，那么就从生成的HTML文档中特别提取出版本信息
    // 7. @since
    //    该标签允许你指定程序代码最早使用的版本，可以在HTML Java文档中看到它被用来指定所用的JDK版本的情况
    // 8. @param
    //    该标签用于方法文档中
    //    格式：@param parameter-name description
    //    parameter-name 方法的参数列表中的标识符，description是可延续数行的文本，终止于新的文档标签出现之前，可以使用任意多个这种标签
    // 9. @return
    //    该标签用于方法文档中
    //    格式：@return description
    //    description 用来描述返回值的定义，可以延续数行
    // 10. @throws
    //    异常标签
    //    格式：@throws fully-qualified-class-name description
    //    fully-qualified-class-name 给出一个异常类的无歧义的名字，而该异常在别处定义。description 描述为什么次特殊类型的异常会在方法调用中出现
    // 11. @deprecated
    //    该标签用于指出一些旧特性已由改进的新特性取代，建议用户不要在使用这些旧特性，因为在不久的将来他们可能会被删除
    //    如果使用一个标记为@deprecated的方法，则会引起编译器发布警告。
    //    Java SE5中，Javadoc标签@deprecated已经被@Deprecated注解所代替
    /**
     *
     *
     *
     *
     *
     */
}
