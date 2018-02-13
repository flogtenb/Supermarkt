package com.capgemini;

public class MyClass implements IMyInterface {
    // sta op "implements" en doe alt + enter:  haalt methodes binnen

    /**
     *
     */
    public void sayHello() {
        System.out.println("Hello");
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public int sum(int a, int b) {
        return a+b;
    }

    /**
     *
     * @param wordA
     * @param wordB
     * @return
     */
    public String combine(String wordA, String wordB) {
        return wordA + "" + wordB;
    }
}
