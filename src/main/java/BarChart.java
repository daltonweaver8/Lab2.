
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dalto
 */
public class BarChart {
public static void main(String[] args) {
int Store1, Store2, Store3, Store4, Store5;
//
Scanner in = new Scanner(System.in);
System.out.print("Enter today’s sales for stores 1: ");
Store1 = in.nextInt();
System.out.print("Enter today’s sales for stores 2: ");
Store2 = in.nextInt();
System.out.print("Enter today’s sales for stores 3: ");
Store3 = in.nextInt();
System.out.print("Enter today’s sales for stores 4: ");
Store4 = in.nextInt();
System.out.print("Enter today’s sales for stores 5: ");
Store5 = in.nextInt();
System.out.println();
System.out.println("Sales Bar Chart");

for(int i = 1; i < 6; ++i) {
System.out.printf("Store %d: ", i);
if(i == 1) {
bar(Store1);
}
if(i == 2) {
bar(Store2);
}
if(i == 3) {
bar(Store3);
}
if(i == 4) {
bar(Store4);
}
if(i == 5) {
bar(Store5);
}
} 
}
public static void bar(int n) {
for(int i = 0; i < n / 100; ++i) {
System.out.print("*");
              }
System.out.println();
       }
}