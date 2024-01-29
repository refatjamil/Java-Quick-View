public class MyStrings {
    public static void main(String[] args) {

        String helloWorld = "Hello World!";
        System.out.println(helloWorld);
        System.out.println(helloWorld.toUpperCase());
        System.out.println(helloWorld.toLowerCase());

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());


        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate"));

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        int x = 10;
        int y = 20;
        int sum = x + y;
        System.out.println(sum);

        String xx = "10";
        String yy = "20";
        String zz = xx + yy;
        System.out.println(zz);

        System.out.println(x + xx);
        System.out.println(yy + y);
    }
}
