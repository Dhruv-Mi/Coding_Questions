package com.company;

import java.util.ArrayList;

class SnapshotArray{
    ArrayList<Integer[]> snapList;
    Integer[] arr;
    int snapCount;

    public SnapshotArray(int length){
        arr=new Integer[length];
        snapCount=0;
        snapList=new ArrayList<>();
        for(int i=0;i<length;i++){
            arr[i]=0;
        }
    }

    public void set (int index,int val){
        arr[index]=val;
    }

    public int snap(){
        snapCount++;
        Integer[] temp=new Integer[arr.length];
        System.arraycopy(arr, 0, temp, 0, arr.length);
        snapList.add(temp);
        return snapCount-1;
    }

    public int get (int index,int snap_id){
        Integer[] temp=snapList.get(snap_id);
        return temp[index];
    }
}

public class Snapshot_array {
    public static void main(String[] args) {
        SnapshotArray snapshotArr = new SnapshotArray(3); // set the length to be 3
        snapshotArr.set(0,5);  // Set array[0] = 5
        System.out.println(snapshotArr.snap());  // Take a snapshot, return snap_id = 0
        snapshotArr.set(0,6);
        System.out.println(snapshotArr.get(0,0));  // Get the value of array[0] with snap_id = 0, return 5
    }
}
