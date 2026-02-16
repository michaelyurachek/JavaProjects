public class Assignment2 {
    public static void main(String[] args) {
        // Exercise 1:
        System.out.println("\nExercise 1:");
        int time = 13;
        if (time <= 11) {
            System.out.println("Good Morning!");
        } else {
            System.out.println("Good Afternoon!");
        }

        // Exercise 2:
        System.out.println("\nExercise 2:");
        time = 19;
        if (time <= 11) {
            System.out.println("Good Morning!");
        } else if (time >= 12 && time <= 18) {
            System.out.println("Good Afternoon!");
        } else {
            System.out.println("Good Evening!");
        }

        // Exercise 3:
        System.out.println("\nExercise 3:");
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        // Exercise 4:
        System.out.println("\nExercise 4:");
        day = 2;
        switch (day) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the weekend!");
        }

        // Exercise 5:
        System.out.println("\nExercise 5:");
        int i = 0;
        while (i <= 5) {
            System.out.println(i + "\n");
            i++;
        }

        // Exercise 6:
        System.out.println("\nExercise 6:");
        for (i = 2; i <= 10; i = i + 2) {
            System.out.println(i + "\n");
        }

        // Exercise 7:
        System.out.println("\nExercise 7:");
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i + "\n");
        }

        // Exercise 8:
        System.out.println("\nExercise 8:");
        for (i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i + "\n");
        }
        
        // Exercise 9:
        System.out.println("\nExercise 9:");
        String[] array1 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (i = 0; i  < array1.length; i++) {
            System.out.println(array1[i] + "\n");
        }

        // Exercise 10:
        System.out.println("\nExercise 10:");
        int b = 1;
        for (int a = 1; a < 4; a++) {
            System.out.println("Iteration " + a + " of the for loop\n");
            while (b <= 5) {
                System.out.println("Inside while loop: " + b + "\n");
                b++;
            }
            b = 1;
        }
    }
}