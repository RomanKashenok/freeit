package com.freeit.lesson16.generics;

import java.util.HashMap;

public class Box<T> {

    private Object[] myMemoryBox;

    public Box(int size) {
        this.myMemoryBox = new Object[size];
    }

    public void addToBox(T toAdd) {
        System.out.println("Sum of internal storage: ");
        for (int i = 0; i < myMemoryBox.length; i++) {
            if (myMemoryBox[i] == null) {
                myMemoryBox[i] = toAdd;
                return;
            }
        }
    }

    public T getFirst() {
        for (int i = 0; i < myMemoryBox.length; i++) {
            if (myMemoryBox[i] != null) {
                T result = (T) myMemoryBox[i];
                myMemoryBox[i] = null;
                return result;
            }
        }
        return null;
    }

    public Object[] getAll() {
        return myMemoryBox;
    }

}
