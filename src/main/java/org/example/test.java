package org.example;
import java.util.Scanner;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
       /* *Scanner in = new Scanner(System.in);
        System.out.println("Input name");
        String name = in.nextLine();
        System.out.println("Input age");
        int age = in.nextInt();
        System.out.println("Input height");
        float height = in.nextFloat();
        System.out.println("Input name: "+ name + "\nAge: " + age+ "\nHeight: "+height);
        in.close();
        int[] mas = {2, 4, 3, 1};
        System.out.println(mas[mas.length-1]);
      ;
        int[] arrSource = {1, 2, 3, 4, 5};
        int[] arrTarget = Arrays.copyOf(arrSource, arrSource.length);
        arrSource[0] = 100;
        System.out.println(arrTarget[0]);
        System.out.println(Arrays.toString(arrTarget));
        int number =5;
        System.out.println(number % 2 == 0 ? "even" : "odd");*/
        int num = 8;
        String digitName;

        switch(num) {
            case 0:
                digitName = "zero";
                break;
            case 1:
                digitName = "one";
                break;
            case 2:
                digitName = "two";
                break;
            case 3:
                digitName = "three";
                break;
            case 4:
                digitName = "four";
                break;
            case 5:
                digitName = "five";
                break;
            case 6:
                digitName = "six";
                break;
            case 7:
                digitName = "seven";
                break;
            case 8:
                digitName = "eight";
                break;
            case 9:
                digitName = "nine";
                break;
            default:
                digitName = "Unknown";
        }
        System.out.println(digitName);
    }
}
