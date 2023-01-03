public class Casting {
    public static void main(String[] args) {

        // Need to deliver 30 dogs
        // how many dogs do you deliver a month?
        double monthlyDogs = 30.0 / 12.0;
        System.out.println(monthlyDogs); // 2.5 - It's not possible to part a dog

        // ESTIMATED
        int estimatedMonthlydogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlydogs); // 2

        // Exactitude
        int a = 30;
        int b = 12;

        System.out.println(a/b); // 2
        System.out.println((double) a/b); // 2.5

        double c = a/b;
        System.out.println(c); // 2.0

        double d = (double) a/b;
        System.out.println(d); // 2.5

        // automatic Cast of  char to int
        char n = '1';
        int nI = n;

        System.out.println(nI); // 49 - value 1 en ASCII - alt + 49 = 1

        // specific cast of char to short
        short nS = (short) n;
        System.out.println(nS); // 49

        // Examples
        char letter = 'z';
        int letterToInt = letter;
        System.out.println("char to int: " + letterToInt); // 122 - alt + 122 = z

        int i = 250;
        long iL = i;
        short iS = (short) iL;
        System.out.println("int to long: " + iL); // 250
        System.out.println("long to short: " + iS); // 250

        double amount = 301.067;
        long amountL = (long) amount;
        System.out.println("double to long: " + amountL); // 301

        int calculate = 100;
        calculate += 5000.66;
        float calculateF = (float) calculate;
        System.out.println("int to int: " + calculate); // 5100
        System.out.println("int to float: " + calculateF); // 5100.0

        int calculateC = 100;
        double calculateD = calculateC + 5000.66;
        float calculateE = (float) calculateD;
        System.out.println("int to double: " + calculateD); // 5100.66
        System.out.println("int to float: " + calculateF); // 5100.0


        int product = 737;
        product *= 100;
        byte productB = (byte) product;
        System.out.println("int to int: " + product); // 73700
        System.out.println("int to byte: " + productB); // -28

        double partition = 298.638;
        partition /= 25;
        long partitionL = (long) partition;
        System.out.println("double to double: " + partition); // 11.9455...
        System.out.println("double to long: " + partitionL); // 11
    }
}
