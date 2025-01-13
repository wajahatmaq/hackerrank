package com.problems.multithreading;

public class SynchronizedExchangerStatic {

    private static Object object = null;

    public static synchronized void setObject(Object object) {
        object = object;
    }

    public static void setObj(Object object){
        synchronized (SynchronizedExchangerStatic.class) {
            object = object;
        }
    }

    public static synchronized Object getObject() {
        return object;
    }

    public static Object getObj(){
        synchronized (SynchronizedExchangerStatic.class) {
            return object;
        }
    }
}
