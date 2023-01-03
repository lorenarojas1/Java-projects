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

    }
}
