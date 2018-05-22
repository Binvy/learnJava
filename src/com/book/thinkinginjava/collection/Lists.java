package com.book.thinkinginjava.collection;

import java.util.*;

/**
 * @comments: List的功能方法
 * @author: binvy
 * @Date: 2018/4/20
 */
public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<String> a) {
        // Add at location 1
        a.add(1, "x");
        // Add at end
        a.add("x");
        // Add a Collection
        a.addAll(Countries.names(25));
        // Add a Collection starting at location 3
        a.addAll(3, Countries.names(25));
        // Is it in there
        b = a.contains("1");
        // Is the entire collection in there
        b = a.containsAll(Countries.names(25));
        // Lists allow random access, which is cheap
        // for ArrayList, expensive for LinkedList
        // Get (typed) object at location 1
        s = a.get(1);
        // Tell index of object
        i = a.indexOf("1");
        // Any element inside
        b = a.isEmpty();
        // Ordinary iterator
        it = a.iterator();
        // ListIterator
        lit = a.listIterator();
        // ListIterator start at location 3
        lit = a.listIterator(3);
        // Last match
        i = a.lastIndexOf("1");
        // Remove location 1
        a.remove(1);
        // Remove this object
        a.remove("1");
        // Set location 1 to "y"
        a.set(1, "y");
        // Key everything that's in the argument
        // (The intersection of the two sets)
        a.retainAll(Countries.names(25));
        // Remove everything that's in the argument
        a.removeAll(Countries.names(25));
        // How big is it?
        i = a.size();
        // Remove all elements
        a.clear();
    }
    public static void iterMotion(List<String> a) {
        ListIterator<String> it = a.listIterator();
        b = it.hasNext();
        b = it.hasPrevious();
        s = it.next();
        i = it.nextIndex();
        s = it.previous();
        i = it.previousIndex();
    }
    public static void iterManipulation(List<String> a) {
        ListIterator<String> it = a.listIterator();
        it.add("47");
        // Must move to an element after add()
        it.next();
        // Remove the element after the newly produced one
        it.remove();
        // Must move to an element after remove()
        it.next();
        // Change the element after the deleted one
        it.set("47");
    }
    public static void testVisual(List<String> a) {
        System.out.println(a);
        List<String> b = Countries.names(25);
        System.out.println("b = " + b);
        a.addAll(b);
        a.addAll(b);
        System.out.println(a);
        // Insert, remove, and replace elements
        // using a ListIterator
        ListIterator<String> x = a.listIterator(a.size() / 2);
        x.add("one");
        System.out.println(a);
        System.out.println(x.next());
        x.remove();
        System.out.println(x.next());
        x.set("47");
        System.out.println(a);
        // Traverse the list backwards
        x = a.listIterator(a.size());
        while (x.hasPrevious()) {
            System.out.print(x.previous() + " ");
        }
        System.out.println();
        System.out.println("testVisual finished");
    }

    /**
     * There are some things that only LinkedLists can do
     */
    public static void testLinkedList() {
        LinkedList<String> ll = new LinkedList<>();
        ll.addAll(Countries.names(25));
        System.out.println(ll);
        // Treat it like a stack, pushing
        ll.addFirst("one");
        ll.addFirst("two");
        System.out.println(ll);
        // Like "peeking" at the top of a stack
        System.out.println(ll.getFirst());
        // Like popping a stack
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeFirst());
        // Treat it like a queue, pulling elements
        // off the tail end;
        System.out.println(ll.removeLast());
        System.out.println(ll);
    }
    public static void main(String[] args) {
        // Make and fill a new list each time
        basicTest(new LinkedList<>(Countries.names(25)));
        basicTest(new ArrayList<>(Countries.names(25)));
        iterMotion(new LinkedList<>(Countries.names(25)));
        iterMotion(new ArrayList<>(Countries.names(25)));
        iterManipulation(new LinkedList<>(Countries.names(25)));
        iterManipulation(new ArrayList<>(Countries.names(25)));
        testVisual(new LinkedList<>(Countries.names(25)));
        testLinkedList();
    }
}
