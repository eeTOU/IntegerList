// ***************************************************************
// ListTest.java
//
// A simple test program that creates an IntList, puts some
// ints in it, and prints the list.
//
// ***************************************************************

import java.util.List;
import java.util.Scanner;

public class ListTest
{
    public static void main(String[] args)
    {
        IntList myList = new SortedIntList(10);
        myList.add(100);
        myList.add(50);
        myList.add(200);
        myList.add(25);
        System.out.println(myList);

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter an integer to add to the list?");
        int element = scan.nextInt();
        myList.add(element);

        System.out.println(myList);





    }
}
