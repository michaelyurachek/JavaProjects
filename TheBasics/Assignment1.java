public class Assignment1 {
    public static void main(String[] args) {
        // Challenge 1a
        int number1 = 5;
        int number2 = 3;
        System.out.println("The sum of two variables is " + (number1 + number2));
        
        // Challenge 1b
        double number3 = 4.5;
        System.out.println("The sum of three variables is " + (number1 + number2 + number3));

        // Challenge 1c
        boolean imTrue = true;
        boolean imNo = false;
        System.out.println(imTrue);
        System.out.println(imNo);

        // Challenge 1d
        char char1 = 65, char2 = 66, char3 = 67;

        System.out.println(char1 + " " + char2 + " " + char3);

        // Challenge 1e
        int num4 = 55;
        int num5 = 1;
        System.out.println(num4 > num5);

        // Challenge 1f
        String fName = "Michael";
        String lName = "Yurachek";
        System.out.println(fName + " " + lName);

        // Challenge 1g
        String con1 = "Bob";
        int con2 = 5;
        System.out.println(con1 + con2);

        // Challenge 1h
        String escapeChar = "I made \"Quote\" a quote";
        System.out.println(escapeChar);

        // Challenge 1i
        int num6 = 10;
        int num7 = 9;
        if (num6 > num7) {
            System.out.println(num6 + " is greater than " + num7);
        } else {
            System.out.println(num6 + " is less than " + num7);
        }
    }
}