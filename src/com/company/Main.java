package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.Integer.parseInt;


public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите адрес файла");
        String input1 = scanner.nextLine();

        File doc = new File(input1);
        Scanner obj = new Scanner(doc);
        ArrayList<Integer> arr = new ArrayList<>();
        while (obj.hasNextLine()) {
            arr.add(parseInt(obj.nextLine()));
        }

        //for (int arrA : arr) {
            //System.out.println(arrA);
        //}

        int k = arr.stream().filter(a -> a != null).mapToInt(a -> a).sum();
        int t = (int) (k / arr.stream().count());

        //System.out.println(t);

        int k1 = arr.stream().filter(a -> a != null).mapToInt(a -> Math.abs(a - t)).sum();
        System.out.println(k1);

    }
}
