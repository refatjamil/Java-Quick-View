public class Casting {
    public static void main(MyStrings[] args) {

        int myInt = 12;
        double myDouble = myInt;
        System.out.println(myInt);
        System.out.println(myDouble);


        double myD = 9.78d;
        int myI = (int) myD; // Manual casting: double to int
    
        System.out.println(myD);   // Outputs 9.78
        System.out.println(myI);      // Outputs 9
      }

    }

