package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/23
 */
public class TestTerminationCondition {

    public static void main(String[] args) {
        Book book = new Book(true);
        // Proper clean up;
        book.checkIn();
        // Drop the reference, forget to clean up;
        new Book(true);
        // Force garbage collection & finalization;
        System.gc();
    }
}

class Book{
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }
    void checkIn() {
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error: checked out!");
            //super.finalize(); // Call the base-class version
        }
    }
}
