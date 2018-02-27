package com.book.thinkinginjava.basic;

/**
 * @comments:
 * @author: binvy
 * @Date: 2018/2/27
 */
public class TestEnum {
    Spiciness degree;

    public TestEnum(Spiciness degree) {
        this.degree = degree;
    }

    public void describe() {
        System.out.println("The burrito is: ");
        switch (degree) {
            case NOT:
                System.out.println("not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
                break;
            case HOT:
            case FLAMING:
                default:
                System.out.println("maybe too hot");
        }
    }

    public static void main(String[] args) {
        Spiciness spiciness = Spiciness.MEDIUM;
        System.out.println(spiciness);

        for ( Spiciness s: Spiciness.values()
               ) {
            System.out.println(s + ": ordinal-" +  s.ordinal());
        }

        TestEnum plain = new TestEnum(Spiciness.HOT),
                greenChile = new TestEnum(Spiciness.MEDIUM),
                jalapeno = new TestEnum(Spiciness.FLAMING);

        plain.describe();
        greenChile.describe();
        jalapeno.describe();
    }
}
