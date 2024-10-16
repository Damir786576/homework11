public class Main {
    // 1 task
    public static void checkYear(int[] years) {
        for (int i = 0; i < years.length; i++) {
            if (years[i] % 4 == 0 && (years[i] % 100 != 0 || years[i] % 400 == 0)) {
                System.out.println(years[i] + " год — високосный год");
            } else {
                System.out.println(years[i] + " год — невисокосный год");
            }
        }

    }

    public static void main(String[] args) {
        int[] year = {2020, 1789, 4000, 100, 400, 6356, 56, 365648, 647};
        checkYear(year);
        // in the task, i'm create check year. Leap Year or not Leap.

        // 2 task
        byte client = 0;
        short clientYear = 2024;
        currentSystem(client, clientYear);

        // 3 task
        byte distanceCar = 95;
        currentDays(distanceCar);


    }
    // 2 task
    public static void currentSystem(byte system, short currentYear) {
        String message;
        if (system ==1) {
            message  = "Android";
        } else {
            message = "iOS";
        }
        if (currentYear <=2015) {
            message = "Установите облегченную версию приложения для " + message + " по ссылке";
        } else {
            message = "Установите версию приложения для " + message + " по ссылке";
        }
        System.out.println(message);

        // in the task, i'm write code for system current version
    }
    // 3 task
    public static void currentDays(byte Distance) {
        if (Distance < 20) {
            System.out.println("Потребуется дней: " + 1);
        } else if (Distance >= 20 && Distance < 60) {
            System.out.println("Потребуется дней: " + 2);
        } else if (Distance >= 60 && Distance < 100) {
            System.out.println("Потребуется дней: " + 3);
        } else {
            System.out.println("Потребуется дней: " + 4);
        }
        // in the task, i'm write code, how much day need for deliveries
    }
}