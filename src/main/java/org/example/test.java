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
        /*int num = 8;
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
        System.out.println(digitName);*/
       /* Scanner scanner = new Scanner(System.in);

        boolean a = scanner.nextBoolean();
        boolean b = scanner.nextBoolean();
        boolean c = scanner.nextBoolean();
        boolean i = a&&b&&c;
        boolean o = a||b||c;

        System.out.println(i + " " + o);*/
        //char[][] mas = new char[4][3];
       /* char[][] mas= {
                {'1', '2', '3'},
                {'4', '5', '6'},
                {'7', '8', '9'},
                {'*', '0', '#'}
        };
        System.out.print(Arrays.toString(mas[0])+"\n");`
        System.out.print(Arrays.toString(mas[1])+"\n");
        System.out.print(Arrays.toString(mas[2])+"\n");
        System.out.print(Arrays.toString(mas[3]));
        System.out.print(Arrays.toString(mas[0])+"\n"+Arrays.toString(mas[1])+"\n"+Arrays.toString(mas[2])+"\n"+ Arrays.toString(mas[3]));
*/
        test obj = new test();
        //System.out.println(obj.aggregateSingle("Mark", "22", "Earth"));
        String[] masName = {"mark","oleg","Jhuk"};
        int[] masAge = {22,21,20};
        String[] masPlanet= {"Mars","Earth","Sun"};
        System.out.println(Arrays.toString(obj.aggregateAll(masName,masAge, masPlanet)));
    }
    public String aggregateSingle(String name, int age, String planet){

        return "name -  <" + name.toUpperCase() + ">, age - <" + age+ ">, planet - <"+planet.toUpperCase() + ">";
    }
    public String[] aggregateAll(String[] names, int[] ages, String[] planets){
        String[] mas = {aggregateSingle(names[0], ages[0], planets[0]), aggregateSingle(names[1], ages[1], planets[1]), aggregateSingle(names[2], ages[2], planets[2])};
        return mas;
    
    }
}
