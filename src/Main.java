public class Main {
    public static void main(String[] args) {
        // task1();
        // task2();
        // task3();
        // task4();
        // task5();
        // task6();
        // task7();
        // task8();
        // task9();
         task10();

    }

    public static void task1() {
        System.out.println("ЗАДАЧА 1");
        //С помощью цикла for выведите в консоль все числа от 1 до 10.
        for (int i = 1; i <= 10; i++) {
            System.out.println("Число " + i);
        }
    }

    public static void task2() {
        System.out.println("ЗАДАЧА 2");
        //С помощью цикла for выведите в консоль все числа от 10 до 1.
        for (int i = 10; i >= 1; i--) {
            System.out.println("Число " + i);
        }
    }

    public static void task3() {
        System.out.println("ЗАДАЧА 3");
        //Выведите в консоль все четные числа от 0 до 17.
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println("Четные числа, которые деляться на два от 0 до 17 " + i);
        }
    }

    public static void task4() {
        System.out.println("ЗАДАЧА 4");
        //Выведите в консоль все числа от 10 до −10 от бо́льшего числа к меньшему
        for (int i = 10; i >= -10; i--) {
            System.out.println("Все числа от 10 до -10 от большего числа к меньшему " + i);
        }
    }

    public static void task5() {
        System.out.println("ЗАДАЧА 5");
        //Напишите программу, которая выводит в консоль все високосные года, начиная с 1904 года до 2096.
        //В консоль результат должен выводиться в формате: «… год является високосным».
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Года, которые являются высокосными с 1904 по 2096 год  " + i);
        }
    }

    public static void task6() {
        System.out.println("ЗАДАЧА 6");
        //Напишите программу, которая выводит в консоль последовательность чисел:
        // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Последовательность чисел с увеличением на 7 от 7 до 98 это -   " + i);
        }
    }

    public static void task7() {
        System.out.println("ЗАДАЧА 7");
        //Напишите программу, которая выводит в консоль последовательность чисел:
        //1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Последовательность чисел операцией умножение на 2 от 1 до 512  это -   " + i);
        }
    }

    public static void task8() {
        System.out.println("ЗАДАЧА 8");
        //Посчитайте с помощью цикла for сумму годовых накоплений,
        //если каждый месяц вы будете откладывать по 29 000 рублей «в банку».
        //Выведите сумму накоплений за каждый месяц в консоль в формате: «Месяц …, сумма накоплений равна … рублей».
        int monthMoney = 0;
        int money = 29000;
        for (int i = 1; i < 12; i = i + 1) {
            monthMoney = monthMoney + money;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + monthMoney + " рублей.");
        }
    }

    public static void task9() {
        System.out.println("ЗАДАЧА 9");
        //Перепишите решение задачи выше при условии, что деньги вы откладывать будете не «в банку»,
        //а в банк под проценты — 12% годовых. Выведите сумму накоплений за каждый месяц в консоль в формате:
        //«Месяц …, сумма накоплений равна … рублей».
        int monthMoney = 0;
        int money = 29000;
        for (int i = 1; i <= 12; i = i + 1) {
            monthMoney = monthMoney + (monthMoney/100)*1;
            monthMoney = monthMoney + money;
            System.out.println("Месяц " + i + " - сумма накоплений равна " + monthMoney + " рублей.");
        }
    }
    public static void task10() {
        System.out.println("ЗАДАЧА 10");
        //Напишите программу, которая выводит в консоль таблицу умножения на 2:
        //2*1=2
        //2*2=4
        //2*3=6
        //2*4=8
        //2*5=10
        //2*6=12
        //2*7=14
        //2*8=16
        //2*9=18
        //2*10=20
        int number = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Таблица умножения " + number + " * " + i + " = " + number * i);
        }
    }
}
