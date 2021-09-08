package com.company;

public class Main {

	// Code to stack diagram
    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }
    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }
    public static void baffle() {
        System.out.print("wug");
        ping();
    }
    public static void ping() {
        System.out.println(".");
    }
}


// 1. main() -> "no, i " //
// it always starts in main so from the top it prints "No, i"
// 2. answer below
// "no i, wug." //
// it first prints "No, i" because it is the first line of code in the main method. Afterwards it goes to the next method baffle and go through it and print "Wug" and in the last section it takes "."
// "You wugga wug. //
// then it goes back to main and check the 2nd line of code Zoop(); and this is the method in the top and the 2nd line is the text "You wugga " then it takes the next method baffle where it is the print "wug"//
// and then it goes to the last method ping() and print out the "."
// "I wug."//
// then it goes back to main method and vhes again from after Zoop() and the next line of code is print "I, " go through to the method and takes the first line of code and print out "wug"//
// then it goes to the last method and print out the last line "."



