package com.company;
import java.util.*;

public class Arraylist {
        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            ArrayList<Integer> ar = new ArrayList<>();
            System.out.println("~~~Main Menu~~~");
            System.out.println("1.Adding an element\n2.Deleting an element\n3.Searching an element\n4.Display\n5.Exit\n ");
            while (true) {
                System.out.print("Enter the choice: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1: System.out.print("Enter the number you want to add: ");
                            int num = sc.nextInt();
                            ar.add(num);
                            break;
                    case 2: System.out.print("Enter the data you want to delete: ");
                            int num1 = sc.nextInt();
                            int index = ar.indexOf(num1);
                            ar.remove(index);
                            System.out.println("number " + num1 + " has been deleted successfully");
                            break;
                    case 3: System.out.print("Enter the data you want to search: ");
                            int num2 = sc.nextInt();
                            int index1 = ar.indexOf(num2);
                            System.out.println("Data found at index " + (index1+1));
                            break;
                    case 4: int i;
                            System.out.println("Elements are as follows: ");
                            for (i = 0; i < ar.size(); i++) {
                                System.out.println(ar.get(i));
                            }
                            break;
                    case 5: System.exit(0);
                            break;
                    default:
                        System.out.print("Enter a valid choice!!!");
                }
            }
        }
}