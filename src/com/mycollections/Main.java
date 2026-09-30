/**
 *  Java program to create, update, and delete elements of TreeSet.
 */

package com.mycollections;

import java.util.Set;
import java.util.TreeSet;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Create an instance of TreeSet.
        Set<Double> mySet = new TreeSet<>();

        // Add.
        mySet.add(2.0);
        mySet.add(1.9);
        mySet.add(2.7);
        mySet.add(5.4);
        mySet.add(2.4);
        mySet.add(6.4);

        // Print.
        System.out.println(mySet); // Output: [1.9, 2.0, 2.4, 2.7, 5.4, 6.4]

        // Remove.
        mySet.remove(5.4);

        // Print.
        System.out.println(mySet); // Output: [1.9, 2.0, 2.4, 2.7, 6.4]

        // Add.
        mySet.add(2.8);

        // Check if mySet contains 1.9.
        if(mySet.contains(1.9)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Check if mySet contains 1.9.
        if(mySet.contains(2.9)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Clear.
        mySet.clear();
        
    }
}
