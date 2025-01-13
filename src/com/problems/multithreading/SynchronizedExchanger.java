package com.problems.multithreading;

public class SynchronizedExchanger {

    private Object object=null;

    public synchronized void setObject(Object object) {
        this.object = object;
    }

    public void setObj(Object object){
        synchronized (this) {
            this.object = object;
        }
    }

    public synchronized Object getObject() {
        return object;
    }

    public  Object getObj(){
        synchronized (this) {
            return object;
        }
    }
}
