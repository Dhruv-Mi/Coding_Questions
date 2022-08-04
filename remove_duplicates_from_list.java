package com.company;

import java.util.LinkedList;
import java.util.Scanner;

class linked_list{
    int data;
    linked_list next;

    linked_list(int n){
        data=n;
        next=null;
    }
}

public class remove_duplicates_from_list {
    public static linked_list deleteDuplicates(linked_list head){
        linked_list temp=head;
        while(temp!=null&&temp.next!=null){
            while(temp.data == temp.next.data){
                temp.next=temp.next.next;
                if(temp.next==null){
                    break;
                }
            }
            temp=temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        linked_list head=new linked_list(1);
        linked_list node1=new linked_list(1);
        linked_list node2=new linked_list(2);
        linked_list node3=new linked_list(2);
        linked_list node4=new linked_list(2);
        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        linked_list ans=deleteDuplicates(head);
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
