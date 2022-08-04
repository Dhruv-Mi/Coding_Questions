package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class LinkedListNode<t>{
    t data;
    LinkedListNode<t> next;

    public LinkedListNode(t data){
        this.data=data;
        this.next=null;
    }
}
public class Singly_Linked_List {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            LinkedListNode<Integer> head1=null;
            head1=insert(head1);
            int m,n;
            m= sc.nextInt();
            LinkedListNode<Integer> temp=kReverse(head1,m);
            print(temp);
        }
    }

    public static LinkedListNode<Integer> insert(LinkedListNode<Integer> head) {
        Scanner sc=new Scanner(System.in);
        int data= sc.nextInt();
        LinkedListNode<Integer> tail=head;
        while(data!=-1){
            LinkedListNode<Integer> temp=new LinkedListNode<>(data);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
            data=sc.nextInt();
        }
        return head;
    }

    public static int length(LinkedListNode<Integer> head){
        //Your code goes here
        int count=0;
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }

    public static void print(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void printIthNode(LinkedListNode<Integer> head,int i){
        LinkedListNode<Integer> temp=head;
        int len=length(head);
        if(len<i||head==null){
            return;
        }
        else {
            for (int j = 0; j < i; j++) {
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head,int pos){
        LinkedListNode<Integer> temp=head;
        int len=length(head);
        if(pos==0 && head!=null){
            head=head.next;
            return head;
        }
        else if(len-1<pos||head==null){
            return head;
        }
        else{
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            return head;
        }
    }

    public static int findNode(LinkedListNode<Integer> head,int n){
        LinkedListNode<Integer> temp=head;
        int index=0;
        while(temp!=null){
            if(temp.data==n){
                return index;
            }
            else{
                temp=temp.next;
                index++;
            }
        }
        return -1;
    }

    public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head,int n){
        int len=length(head);
        int index=len-n-1,i=0;
        LinkedListNode<Integer> temp1=head,temp,temp2=head;
        if(len==0||n==0){
            return head;
        }
        else {
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            while (i < index) {
                temp1 = temp1.next;
                i++;
            }
            temp = temp1.next;
            temp1.next = null;
            temp2.next = head;
            return temp;
        }
    }

    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head){
        LinkedListNode<Integer> temp=head;
        if(head==null||head.next==null){
            return head;
        }
        else {
            while (temp.next != null) {
                if (temp.data != temp.next.data) {
                    temp = temp.next;
                }
                else {
                    temp.next = temp.next.next;
                }
            }
            return head;
        }
    }

    public static void printReverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> curr=head,prev=null;
        while(curr!=null){
            LinkedListNode<Integer> temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        print(prev);
    }

    public static LinkedListNode<Integer> returnReverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> curr=head,prev=null;
        while(curr!=null){
            LinkedListNode<Integer> temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }

    public static boolean isPalindrome(LinkedListNode<Integer> head){
        LinkedListNode<Integer> node=head;
        ArrayList<Integer> arr = new ArrayList<>();
        while (node!=null)
        {
            arr.add(node.data);
            node=node.next;
        }
        int start=0, end=arr.size()-1;
        while(start<end)
        {
            if (arr.get(start)!=arr.get(end))
            {
                return false;
            }
            else
            {
                start=start+1;
                end=end-1;
            }
        }
        return true;
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head){
        if (head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2){
        if(head1==null){
            return head2;
        }
        else if (head2==null) {
            return head1;
        }
        else{
            LinkedListNode<Integer> temp1=head1;
            LinkedListNode<Integer> temp2=head2;
            LinkedListNode<Integer> temp=null;
            LinkedListNode<Integer> head=temp;
            while(temp1!=null&&temp2!=null){
                if(temp1.data<=temp2.data){
                    if(temp==null){
                        temp=temp1;
                        head=temp;
                    }
                    else{
                        head.next=temp1;
                        head=head.next;
                    }
                    temp1=temp1.next;
                }
                else  {
                    if(temp==null){
                        temp=temp2;
                        head=temp;
                    }
                    else{
                        head.next=temp2;
                        head=head.next;
                    }
                    temp2=temp2.next;
                }
            }
            if(temp1==null){
                while(temp2!=null){
                    head.next=temp2;
                    temp2=temp2.next;
                    head=head.next;
                }
            }
            else{
                while(temp1!=null){
                    head.next=temp1;
                    temp1=temp1.next;
                    head=head.next;
                }
            }
            return temp;
        }
    }

    public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head,int pos){
        LinkedListNode<Integer> temp=head;
        if(head==null){
            return head;
        }
        if(pos==0){
            temp=temp.next;
            return temp;
        }
        LinkedListNode<Integer> temp2=deleteNodeRec(head.next,--pos);
        head.next=temp2;
        return head;
    }

    public static LinkedListNode<Integer> reverseLinkedListRec(LinkedListNode<Integer> head){
        if(head.next==null||head==null){
            return head;
        }
        LinkedListNode<Integer> temp2=reverseLinkedListRec(head.next);
        LinkedListNode<Integer> lastnode=temp2;
        while(lastnode.next!=null){
            lastnode=lastnode.next;
        }
        lastnode.next= head;
        head.next=null;
        return temp2;
    }

    public static int findNodeRec(LinkedListNode<Integer> head,int n) {
        if (head == null) //Empty linked list
        {
            return -1;
        }

        if (head.data==n) {
            return 0;
        }
        int smallIndex = findNodeRec(head.next, n);
        if (smallIndex == -1) {
            return smallIndex;
        }
        else {
            return smallIndex + 1;
        }
    }

    public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head){
        LinkedListNode<Integer> evenhead=null;
        LinkedListNode<Integer> eventail=null;
        LinkedListNode<Integer> oddhead=null;
        LinkedListNode<Integer> oddtail=null;
        LinkedListNode<Integer> temp=head;
        while(temp!=null){
            if(temp.data%2!=0){
                if(oddhead==null){
                    oddhead=temp;
                    oddtail=temp;
                }
                else{
                    oddtail.next=temp;
                    oddtail=temp;
                }
                temp=temp.next;
            }
            else{
                if(evenhead==null){
                    evenhead=temp;
                    eventail=temp;
                }
                else{
                    eventail.next=temp;
                    eventail=temp;
                }
                temp=temp.next;
            }
        }
        if(oddhead==null){
            return evenhead;
        } else if (evenhead==null)
        {
            return oddhead;
        }
        else {
            eventail.next = null;
            assert oddtail != null;
            oddtail.next = evenhead;
            return oddhead;
        }
    }

    public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head,int M,int N) {
        if (M == 0) {
            return null;
        }
        if (N == 0) {
            return head;
        }
        else {
            LinkedListNode<Integer> node = head, delNode = null;
            while (node != null) {
                for (int i = 0; i < M - 1 && node != null; i++) {
                    node = node.next;
                }
                if (node == null) {
                    break;
                }
                delNode = node.next;
                for (int i = 0; i < N && delNode != null; i++) {
                    delNode = delNode.next;
                }
                node.next = delNode;
                node = delNode;
            }
            return head;
        }
    }

    public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head,int i,int j){
        LinkedListNode<Integer> temp;
        LinkedListNode<Integer> prev,prev2;
        LinkedListNode<Integer> swapnode;
        LinkedListNode<Integer> ahead1,ahead2;
        if(head==null||head.next==null||i==j||length(head)<=i||length(head)<=j){
            return head;
        }
        else if (j<i) {
            int temp1=j;
            j=i;
            i=temp1;
        }
        if(i==0){
            temp=head;
            prev=head;
            int k=0;
            while(k<j-1){
                prev=prev.next;
                k++;
            }
            swapnode=prev.next;
            ahead1=temp.next;
            ahead2=swapnode.next;
            prev.next=temp;
            temp.next=ahead2;
            swapnode.next=ahead1;
            head=swapnode;
        }
        else if(j-i==1){
            prev=head;
            LinkedListNode<Integer> node1;
            LinkedListNode<Integer> node2;
            int k=0;
            while(k<i-1){
                prev=prev.next;
                k++;
            }
            node1=prev.next;
            node2=node1.next;
            ahead1=node2.next;
            prev.next=node2;
            node2.next=node1;
            node1.next=ahead1;
        }
        else{
            prev=head;
            prev2=head;
            LinkedListNode<Integer> node1;
            LinkedListNode<Integer> node2;
            int k=0;
            while(k<i-1){
                prev=prev.next;
                k++;
            }
            int l=0;
            while(l<j-1){
                prev2=prev2.next;
                l++;
            }
            node1=prev.next;
            node2=prev2.next;
            ahead1=node1.next;
            ahead2=node2.next;
            prev.next=node2;
            node2.next=ahead1;
            prev2.next=node1;
            node1.next=ahead2;
        }
        return head;
    }

    public static LinkedListNode<Integer> findTail(LinkedListNode<Integer> head, int k)
    {
        for (int i=0;i<k && head.next!=null;i++)
        {
            head=head.next;
        }
        return head;
    }
    public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head,int k){
        if (head==null || k==0 || k==1)
        {
            return head;
        }
        else if (k>length(head)) {
            return reverseLinkedListRec(head);
        }
        LinkedListNode<Integer> node=head,nextNode=null,tail=null,prevTail=null,newHead=null;
        while(node!=null)
        {
            tail=findTail(node,k-1);
            nextNode=tail.next;
            tail.next=null;
            newHead=reverseLinkedListRec(node);
            if (node==head)
            {
                tail=head;
                tail.next=nextNode;
                head=newHead;

            }
            else
            {
                tail=node;
                tail.next=nextNode;
                prevTail.next=newHead;

            }
            node=nextNode;
            prevTail=tail;
        }
        return head;
    }

    public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head) {
        if (head==null || head.next==null)
        {
            return head;
        }
        int n=length(head);
        LinkedListNode<Integer> node1=null,node2=null,temp=null;
        int data1=0,data2=0;
        for (int i=0;i<n;i++)
        {
            node1=head;
            node2=head.next;
            for (int j=0;j<n-i;j++)
            {
                data1=node1.data;
                data2=node2.data;
                if (data1>data2)
                {
                    node1.data=data2;
                    node2.data=data1;
                }
                node1=node1.next;
                node2=node2.next;
            }
        }
        return head;
    }
}
