package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
    public static void main(String args[])
            throws java.io.IOException {
        double sample8[] = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.1};
        double sum8 = 0;

        for (int i = 0; i < sample8.length; i++) {
            sum8 += sample8[i];
            System.out.println ("Среднее значение: " + sum8 / sample8.length);
        }


        MyClass ob = new MyClass();
        ob.setAlpha(-99);
        System.out.println("ob.alpha: "+ob.getAlpha());

        ob.beta = 88;
        ob.gamma = 99;


        // Тест глава - 5

        // (1) Продемонстрируйте два способа объявления одномерного массива, состоящего из 12 элементов типа double.
        double num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        double num1[] = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        // (2) Покажите, как инициализировать одномерный массив целочисленным значениями от 1 до 5.
        int num2[] = {1, 2, 3, 4, 5};


        int nums[] = {99, 45, 22, 48, 63, 79, 85, 71, 29, 14};
        int min, max;

        min = max = nums[0];
        for (int a = 0; a < 10; a++) {
            if (nums[a] < min) min = nums[a];
            if (nums[a] > max) max = nums[a];
        }
        int sred = max / 2;
        System.out.println("Сред знач: "+sred);


        int d = 64;
        int w = 3;
        int p = 342;
        int r = 277;
        int l = 432;
        int b = 272;

        int k = (d << w);
        System.out.println(k);
        System.out.println(Integer.toBinaryString(d));
        System.out.println(Integer.toBinaryString(w));
        System.out.println("\n");

        System.out.println("342: " + Integer.toBinaryString(p));
        System.out.println(Integer.toBinaryString(~p));

        System.out.println("277: " + Integer.toBinaryString(r));
        System.out.println("432: " + Integer.toBinaryString(l));
        System.out.println("272: " + Integer.toBinaryString(b));
        System.out.println(277 & 432);


//        String msg = "Это про тест";
//        String emsg = "";
//        String dmsg = "";
//        int key = 88;
//
//        System.out.println("Исхoдное сообщение");
//        System.out.println(msg);
//        for(int i=0; i<msg.length(); i++)
//            emsg = emsg + (char) (msg.charAt(i)^key);


        char sh;
        for (int i = 0; i < 10; i++) {
            sh = (char) ('a' + i);
            System.out.println(sh);
        }


        // Не понятный код
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-2548"},
                {"John", "666-9874"},
                {"Richel", "888-4562"}
        };

        int z;
        if (args.length != 1
        )
            System.out.println("Использование: java Phone <имя>");
        else {
            for (z = 0; z < numbers.length; z++) {
                if (numbers[z][0].equals(args[0])) {
                    System.out.println(numbers[z][0] + ": " +
                            numbers[z][1]);
                    break;
                }
            }
            if (z == numbers.length)
                System.out.println("Имя не найдено");
        }


        System.out.println("Программе передaно: " + args.length + " аргумента командной строки");
        for (int i = 0; i < args.length; i++)
            System.out.println("arg[" + i + "]: " + args[i]);

        //исходная строка orgstr остается неизменной, а новая строка
        //substr содержит сформированную подстроку.
        String orgstr = "Java - двигатель интернета";
        String substr = orgstr.substring(7, 26);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
        System.out.println("\n");


        String strs[] = {"Эта", "строка", "является", "тестом."};
        System.out.println("Исходный массив: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");

        strs[2] = "такжe является";
        strs[3] = "тестом!";
        System.out.println("Измененный массив: ");
        for (String s : strs)
            System.out.print(s + " ");
        System.out.println("\n");


        // Практика
        String str = new String("В JAVA строки - это обьекты");
        String str1 = "Иx можно создавать разными способами";
        String str2 = new String(str1);
        int result, idx;
        char ch;

        str1 = "Five Two Three Five";
        idx = str1.indexOf("One");
        System.out.println("Индекс первого прохождения One: " + idx);

        idx = str1.lastIndexOf("Five");
        System.out.println("Индекс последнего прохождения One: " + idx);

        System.out.println("Длина строки: " + str.length());

        // Метод length
        // отображение строки посимвольно
        System.out.println("CHARAT: ");
        for (int i = 0; i < str1.length(); i++)
            System.out.println(str1.charAt(i));
        System.out.println();


        // Метод equals
        if (str2.equals(str1))
            System.out.println("Эквивалентна");
        else
            System.out.println("Не эквивалентна");


        // Метод CompareTo
        result = str.compareTo(str1);
        if (result == 0)
            System.out.println("str and str1 ravniy");
        else if (result < 0)
            System.out.println("str menshe str1");
        else
            System.out.println("str bolshe str1");

        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);


        int nums5[] = {1, 8, 4, 9, 6, 8, 7, 5};
        int val = 5;
        boolean found = false;

        for (int x : nums5) {
            if (x == val) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Значение найдено!");


        int itog = 0;
        int nums4[][] = new int[3][5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums4[i][j] = (i + 1) * (j + 1);

        for (int x[] : nums4) {
            for (int y : x) {
                System.out.println("Значение: " + y);
                itog += y;
            }
        }
        System.out.println("Summa: " + itog);


//        int nums3[] = {1,2,3,4,5,6,7,8,9,10};
//        int sum=0;
//
//        for(int x: nums3) {
//            System.out.println("Значение x: "+x);
//            sum += x;
//        }
//        System.out.println("Summa sum: "+sum);
//        System.out.println();

        int nums3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : nums3) {
            System.out.print(x + " ");
            x = x * 10;
            System.out.println(x);
        }


        int riders[][] = new int[7][];
        riders[0] = new int[10];
        riders[1] = new int[10];
        riders[2] = new int[10];
        riders[3] = new int[10];
        riders[4] = new int[10];
        riders[5] = new int[2];
        riders[6] = new int[2];

        int h, j;

        for (h = 0; h < 5; h++)
            for (j = 0; j < 10; j++)
                riders[h][j] = h + j;
        for (h = 5; h < 7; h++)
            for (j = 0; j < 2; j++)
                riders[h][j] = h + j + 10;
        System.out.println("Количество пассажиров, перевезенных каждым рейсом, в будние дни недели: ");

        for (h = 0; h < 5; h++) {
            for (j = 0; j < 10; j++)
                System.out.println(riders[h][j] + " ");
            System.out.println();
        }
        System.out.println();
        System.out.println("Количество пассажиров, перевезенных каждым рейсом, в выходные дни: ");
        for (h = 5; h < 7; h++) {
            for (j = 0; j < 2; j++)
                System.out.println(riders[h][j] + " ");
            System.out.println();
        }

//        int r;
//        int nums1[] = new int[10];
//        int nums2[] = new int[10];
//        for (r=0; r<nums1.length; r++)
//            nums1[r] = r;
//        if (nums2.length >= nums1.length)
//            for( r = 0; r<nums2.length; r++)
//                nums2[r] = nums1[r] ;
//
//            for (r=0; r<nums2.length; r++)
//                System.out.println(nums2[r]+" ");
//
//        int sqrs[][] = {
//                {1,1},
//                {2,4},
//                {3,6},
//                {4,8},
//                {5,10},
//                {6,12}
//        };
//        int p,w;
//        for (p = 0; p<6; p++){
//            for (w=0; w<2; w++)
//                System.out.print(sqrs[p][w]+" ");
//            System.out.println();
//        }
//

        //
        int t, q;
        int table[][] = new int[3][4];
        for (t = 0; t < 3; ++t) {
            for (q = 0; q < 4; ++q) {
                table[t][q] = (t * 4) + q + 1;
                System.out.println(table[t][q] + " ");
            }
            System.out.println();
        }

        //  Практика  1
        int[] name = new int[]{45, 65, 98, 74};
        System.out.println(name[2]);

        int[] e;
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers of array: ");
        n = in.nextInt();
        e = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter e[" + i + "] = ");
            e[i] = in.nextInt();
        }


        //  Практика 2
        int sample[] = new int[10];
        int i;

        for (i = 0; i < 10; i++)
            sample[i] = i;

        for (i = 0; i < 10; i++)
            System.out.println("Element[" + i + "]: " + sample[i]);


        //  Практика 3
//        int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
//        int min, max;
//
//        min = max = nums[0];
//        for (int a = 0; a < 10; a++) {
//            if (nums[a] < min) min = nums[a];
//            if (nums[a] > max) max = nums[a];
//        }
//        System.out.println("min and max: " + min + " " + max);



    }
        }