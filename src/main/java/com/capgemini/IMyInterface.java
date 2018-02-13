package com.capgemini;

public interface IMyInterface {
    // the impelemnetation needs to print hello to the screen
    //
    void sayHello();
    // impl needs to calculate
    int sum(int a, int b);
    // combined word of wordA en wordB
    //@param wordA
    //@param wordB

    /** comment
     *
     * @param wordA
     * @param wordB
     * @return
     */
    String combine(String wordA, String wordB);

}
