package com.book.thinkinginjava.basic;

/**
 * @comments: 异常的限制
 * @author: binvy
 * @Date: 2018/3/6
 */
class BaseballExceptino extends Exception {}
class Foul extends BaseballExceptino {}
class Strike extends BaseballExceptino {}
abstract class Inning {
    public Inning() throws BaseballExceptino {}
    public void event() throws BaseballExceptino {
        // Does't actually have to throw anything
    }
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}; // Throw no checked exception
}
class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}
interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}
public class StormInning extends Inning implements Storm{
    // OK to add new exceptions for constructors, but you must deal with the base constructor exceptions;
    public StormInning() throws RainedOut, BaseballExceptino { }
    public StormInning (String s) throws Foul, BaseballExceptino {}
    // Regular methods must conform to base class;
    // ! void walk() throws PopFoul {} // Compile error

    // Interface cannot add exceptions to existing methods from the base class;
    // If the method doesn't already exist in the base class, the exception is OK;
    // ! public void event() throws RainedOut {}
    @Override
    public void rainHard() throws RainedOut { }
    // You can choose to not throw any exception, even if the base version does;
    @Override
    public void event() { }
    // Override methods can throw inherited exceptions
    @Override
    public void atBat() throws Strike, Foul { }

    public static void main(String[] args) {
        try {
            StormInning stormInning = new StormInning();
            stormInning.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballExceptino e) {
            System.out.println("Generic baseball exception");
        }
        // Strike not thrown in derived version
        try {
            // What happens if you upcast?
            Inning i = new StormInning();
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (BaseballExceptino e) {
            System.out.println("Generic baseball exception");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        }
    }
}
