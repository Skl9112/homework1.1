package com.company;

public class Main {

    public static void main(String[] args) {
	    int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int n = 7;
	    int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == n)
                continue;
            sum = sum + array[i];
            System.out.println(sum);
        }
        System.out.println("Addition numbers without n number : " + sum);
    }
}
