public class Booleans {
    public static void main(String[] args) {
        int x = 10;
        int y = 9;
        System.out.println(x > y); // returns true, because 10 is higher than 9
        System.out.println(x == 10); // returns true, because the value of x is equal to 10
        System.out.println(10 == 15);

        int myAge = 25;
        int votingAge = 18;
        System.out.println(votingAge <= myAge);

        if (votingAge <= myAge) {
            System.out.println("Age enough to vote!");
        } else {
            System.out.println("Age not enough to vote!");
        }
    }
}
