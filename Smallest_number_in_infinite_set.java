package com.company;

import java.util.ArrayList;
import java.util.Collections;

class SmallestInfiniteSet {
    ArrayList<Integer> arr;
    int smallest;
    public SmallestInfiniteSet(){
        arr=new ArrayList<>();
        smallest=1;
    }
    public int popSmallest(){
        int ans=smallest;
        arr.add(smallest);
        Collections.sort(arr);
        int last=arr.get(arr.size()-1);
        for(int i=smallest;i<=last+1;i++){
            if(!arr.contains(i)){
                smallest=i;
                break;
            }
        }
        return ans;
    }
    public void addBack(int num){
        if(arr.contains(num)){
            int index=-1;
            for(int i=0;i<arr.size();i++){
                if(arr.get(i)==num){
                    index=i;
                    break;
                }
            }
            arr.remove(index);
            Collections.sort(arr);
            if(num<=smallest){
                smallest=num;
            }
        }
    }
}

public class Smallest_number_in_infinite_set {
    public static void main(String[] args) {
        SmallestInfiniteSet obj=new SmallestInfiniteSet();
        System.out.println(obj.popSmallest());
        obj.addBack(1);
        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
        obj.addBack(2);
        obj.addBack(3);
        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
    }
}
