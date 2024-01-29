public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("This is my first java program");
        System.out.println(234);
        // Tihs is my comment
        /* Multi-line
         * sdsfjsjfalksd
         * gfdgj;dfkg;fa
         * fgsd;fks;afka;sk
         */

        String name = "Refat";
        System.out.println(name);
        int myNumber = 14;
        System.out.println(myNumber);
        myNumber = 30;
        System.out.println("After overwrite myNuner: " + myNumber);

        final int myNumber2 = 2;
        System.out.println(myNumber2);
        // myNumber2 = 20; this cann't be overwrite
        // System.out.println("After overwrite myNuner: " + myNumber2);

        // Other Types variables
        // int myNum = 5;
        // float myFloatNum = 5.99f;
        // char myLetter = 'D';
        // boolean myBool = true;
        // String myText = "Hello";

        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);


        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y

        int a = 10, b = 20, c = 30;
        System.out.println(a+b+c);
    }
}