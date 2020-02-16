public class StringEquality{

    public static void main(String[] args){

        // create two identical String objects using "new"
        String string1 = new String("Hello");
        String string2 = new String("Hello");

        // test String equality using ==
        System.out.print(string1 + " equals " + string2 + ": ");
        System.out.println(string1 == string2);

        // use shortcut String creation
        String string3 = "Hello";
        String string4 = "Hello";

        // test String equality using ==
        System.out.print(string3 + " equals " + string4 + ": ");
        System.out.println(string3 == string4);
    }
}
