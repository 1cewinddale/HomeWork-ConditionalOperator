public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        System.out.println("Если возраст человека равен " + age);
        if (age >= 18) {
            System.out.println("Вы Совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Вам нужно подождать");
        }

    }

    public static void task2() {
        System.out.println("Задача 2");
        int tempAir = 4;
        System.out.println("На улице " + tempAir + " градусов");
        if (tempAir < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        short speedlimit = 59;
        System.out.println("Если скорость " + speedlimit);
        if (speedlimit >= 60) {
            System.out.println("штраф");
        }
        if (speedlimit < 60) {
            System.out.println("можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        short age = 2;
        System.out.println("Если возраст человека равен " + age);
        if (age >= 2 && age <= 6) {
            System.out.println("то ему нужно ходить в детский сад");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("то ему нужно ходить в школу");
        }
        if (age > 18 && age <= 24) {
            System.out.println("то его место в университете");
        }
        if (age > 24) {
            System.out.println("ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("задание 5");
        short age = 14;
        System.out.println("Если возраст ребёнка равен " + age + " то ему ");
        if (age < 5) {
            System.out.println("нельзя кататься на аттракционе");
        }
        if (age >= 5 && age < 14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        }
        if (age >= 14) {
            System.out.println("можно кататься на аттракционе без сопровождения взрослого  ");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        short trainCapacity = 102;
        short standingPlace = 42;
        short seat = 60;
        System.out.println("");
        if (trainCapacity >=102) {
            System.out.println("Вагон полностью занят");
        }
        if (seat >=60) {
            System.out.println();



        }

    }
}