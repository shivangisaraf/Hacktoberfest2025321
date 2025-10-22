// Java program to convert
// octal number to decimal using
// Integer.parseInt()
public class Geeks
{
    public static void main(String args[])
    {
        // octal value
        String oct = "157";

        // octal to decimal using Integer.parseInt()
        int num = Integer.parseInt(oct, 8);

        System.out.println(
            "Decimal equivalent of Octal value of 157 is: "
            + num);
    }
}
