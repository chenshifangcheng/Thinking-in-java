package com.chenwan.interfaces;//Cannot use interface as it's Java's key, so modify to interfaces

// If removed public key word, then this interface will be default package 
public interface Instrument {
    int VALUE = 5; // default public&static&final

    void play(); // default public, so inherit class must be only public
                // 因为Java中不允许降低访问权限

    class B {
        private int a;
    }
    // public class com.chenwan.interfaces.Instrument$B {
    //     public com.chenwan.interfaces.Instrument$B();
    // }
}