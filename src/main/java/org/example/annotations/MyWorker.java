package org.example.annotations;

public class MyWorker {
    void doSomeWork() {
        Doer d1 = new Doer();
        d1.doSomeWork();
    }

    void doSomeWorkTwice() {
        Doer d2 = new Doer();
        d2.doSomeWork();
        d2.doSomeWork();
    }
}
