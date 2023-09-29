package org.sofe3650u.tut3;

import java.util.Scanner;

public class Keyboard {

    public String getNext() {
        Scanner scanner = new Scanner(System.in);
        String toReturn = scanner.next();
        scanner.close();
        return toReturn;
    }

    public int getNextInt() {
        Scanner scanner = new Scanner(System.in);
        int toReturn = scanner.nextInt();
        scanner.close();
        return toReturn;
    }

}
