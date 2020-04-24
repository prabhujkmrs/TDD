package com.prabhuj.tdd.example;

public class Set implements SetInterface {

    private Object[] values;
    private int size;

    public Set() {
        this.values = new Object[5];
        this.size = 0;
    }

    public int size() {
        int count = 0;
        for (Object element : values) {
            if (element != null) {
                count++;
            }
        }
        return count;
    }

    public boolean isEmpty() {
        for (Object element : values) {
            if (element != null) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(Object value) {
        int i = 0;
        while (i < values.length) {
            if (value.equals(values[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    private boolean isFull() {
        return this.size() == values.length;
    }

    private void grow() {
        Object[] tempArray = new Object[size()];
        System.arraycopy(values, 0, tempArray, 0, values.length);
        values = new Object[size() * 2];
        System.arraycopy(tempArray, 0, values, 0, tempArray.length);
    }

    public void add(Object value) {
        if (!contains(value)) {
            if (isFull()) {
                grow();
            }
            values[size] = value;
            size++;
        }
    }

    public void remove(Object value) {
        int i = 0;
        while (i < values.length) {
            if (value.equals(values[i])) {
                for (int j = i; j < values.length - 1; j++) {
                    values[j] = values[j + 1];
                }
            }
            i++;
        }
    }
}
