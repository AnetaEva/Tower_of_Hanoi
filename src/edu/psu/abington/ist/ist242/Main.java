/*
Author: Aneta O'Donnell
Lab 12: Towers of Hanoi
Course: IST 242
Team: 4
Date Developed: 4/8/2020
Last Date Changed: 4/11/2020
Rev: 1
*/



package edu.psu.abington.ist.ist242;

public class Main {

    public static void main(String[] args) {
        // you set up a variable
        int n = 3; //N = 3 the number of disks

        // you call the method from below
        towerOfHanoi(n, 'A', 'C', 'B'); // A, B and C are names of rods
    }

    // METHOD towerofHanoi
    static void towerOfHanoi(int n, char beginning, char end, char auxillary) // input arguments
    {
        // when N = 3 you know its not done yet meaning there are still disks on the call stack
        // you set up your base case (n is equal to the lowest value that n is given in the question (usually 0 or 1).
        if (n == 1)
        {
            // print out tells it when to stop
            System.out.println("Disk 1 from " +  beginning + " to " + end); // move disk 1 (disk 1 is the biggest one at the bottom) from rod A to rod C then go down to 19 and pick up disk 2
            return;
        }

        // Call Stack stores what made the call and knows what to go back to
        // TWO calls, the call stack is what keeps it running, acts like a while loop
        towerOfHanoi(n-1, beginning, auxillary, end); // this is the first set of moves
        System.out.println("Disk " + n + " from " +  beginning + " to " + end); //after 3 moves from A-C pick up disk 2 and move
        towerOfHanoi(n-1, auxillary, end, beginning);
    }
}
