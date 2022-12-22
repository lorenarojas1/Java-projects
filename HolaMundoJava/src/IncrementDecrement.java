public class IncrementDecrement {
    public static void main(String[] args) {

        // Postfijo
        int lives = 5;
        lives = lives - 1;
        System.out.println(lives); // 4

        // Decrement
        lives--;
        System.out.println(lives); // 3

        // Increment
        lives++;
        System.out.println(lives); // 4

        //Increment profix
        // win a gift to win a live
        int gift = 100 + lives++;
        System.out.println("Gifs: " + gift + ", lives: " + lives); // Gift: 104, lives: 5

        // Increment prefix:
        int giftI = 100 + ++lives;
        System.out.println("Gift: " + giftI + ", lives: " + lives); // Gift: 106, lives: 6
    }
}
