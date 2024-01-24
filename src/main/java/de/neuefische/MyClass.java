package de.neuefische;

public class MyClass {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = new int[5];
        System.out.println(numbers2.length);
        String[] helloWorld = {"Hello", "World"};
        System.out.println(numbers[0]);
        System.out.println(helloWorld[0]);
        numbers[0] = 11;

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int number : numbers){
            System.out.println(number);
        }

        for(String s : helloWorld){
            System.out.println(s);
        }
    }
}