package edu.AnastasiiaTkachuk;

public class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
