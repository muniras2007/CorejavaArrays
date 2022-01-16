package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //Q1. Write a program that creates an array of integers with a length of 3.
        // Assign the values 1, 2, and 3 to the indexes. Print out each array element.

//         int [] num = {1,2,3};
//        System.out.println(num[0]);
//        System.out.println(num [1]);
//        System.out.println(num[2]);
        // Q2. Write a program that returns the middle element in an array.
        //           Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7

//        int num [] = {13,5,7,68,2};
//        System.out.println(num[2]);

//        Q3. Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”.
//        Print out the array length. Make a copy using the clone( ) method.
//            Use the Arrays.toString( ) method on the new array to verify that the original array was copied.

//        String color[]= { "red","green","blue","yellow"};
//        int length = color.length;
//            //output array length
//        System.out.println("Length of color{\"red\",\"green\",\"blue\",\"yellow\"}:"+ length);
//        //making a copy using the clone method
//        String clone_color[]=color.clone();
//        System.out.println(Arrays.toString(clone_color));

//        Q4.Write a program that creates an integer array with 5 elements (i.e., numbers).
//            The numbers can be any integers.
//                Print out the value at the first index and the last index using length - 1 as the index.
//                Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).
//                Notice the type of exception which is produced.
//                Now try to assign a value to the array index 5. You should get the same type of exception.

//                int myArray []= {6,8,5,3,9};
//                int length = myArray.length;
//                //First Element: a[0]
//                     //System.out.println(myArray[0]);
//
//                //Last Element: a[a.length-1]
//                       //System.out.println(myArray[myArray.length-1]);
//                        //value at index=length(myArray[myArray.length]).
//                             System.out.println(myArray[myArray.length]);
//                             //assigning a value to the index of 5:
//                               // int myArray []= {6,8,5,3,9,2};(also gives the same exception Index 6 out of bounds for length 6
//
////                    Q5.Write a program where you create an integer array with a length of 5.
////        Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
//        int myArray[] = {4, 7, 8, 2, 9};
//
//        // use index as the maximum value
//        int i;
//        for (i = 0; i <= 4; i++) {
//            System.out.println("Index number " + i + " is " +myArray[i]);
//        }
//                    Q6. Write a program where you create an integer array of 5 numbers.
//                    Loop through the array and assign the value of the loop control variable multiplied by 2 to the corresponding index in the array.
//                                        int myArray []= {4,6,7,8,2};
//                                        int i;
//                                        for(i=0; i<=4; i++){
//                                            System.out.println(" Index number " +  i + " is " + 2*myArray[i]);
//                                        }


//                Q7.Write a program where you create an array of 5 elements.
//                Loop through the array and print the value of each element, except for the middle (index 2) element.

//                        int myArray[] = {3,7,4,9,8};
//                        int i;
//                      for(i=0; i<=4;i++) {
//            if (i > 1 && i < 3) {
//                continue;
//            } else {
////
////
//                System.out.println(myArray[i]);
//            }
//        }


//                Q8.Write a program that creates a String array of 5 elements and
//                swaps the first element with the middle element without creating a new array.


//                          String myArray[] = {"This","girl","knows","her","code"};
//                          String temp=myArray[0];
//                          myArray[0]=myArray[2];
//                          myArray[2]=temp;
//                         System.out.println(Arrays.toString(myArray));


//                Q9.Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
//                Print the array in ascending order, print the smallest and the largest element of the array.
//                The output will look like the following:
//                  Array in ascending order: 0, 1, 2, 4, 9, 13
//                        int myArray[]= {4,2,9,13,1,0};
//                        Arrays.sort(myArray);
//                    System.out.println(Arrays.toString(myArray));
//
////               The smallest number is 0
//        System.out.println("The smallest number is "+myArray[0]);
//
////                  The biggest number is 13
//        System.out.println("The biggest number is "+myArray[5]);
//
//
//
//            Q10. Create an array that includes an integer, 3 strings, and 1 double.
//            Print the array.

//                Object myObject[]= new Object[5];
//                myObject[0]=5;
//                myObject[1]="hi";
//                myObject[2]="there";
//                myObject[3]="are";
//                myObject[4]=3.25;
//
//        System.out.println(Arrays.toString(myObject));


    }
}
