package com.company;

class MyHashSet {
    /** Initialize your data structure here. */
    public MyHashSet() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return set[key];
    }

    private boolean[] set = new boolean[1000001];
}

public class Design_hashset {
    public static void main(String[] args) {
        MyHashSet myHashSet=new MyHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2);
    }
}
