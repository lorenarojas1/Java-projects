public class MathOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;

        // PI Value
        System.out.println(Math.PI); // 3.14159....

        // give an integer to up
        System.out.println(Math.ceil(x)); // 3.0

        // give an integer to down
        System.out.println(Math.floor(x)); // 2.0

        // give the power of a number
        System.out.println(Math.pow(x, y)); // 9.26100000001

        // give the max number
        System.out.println(Math.max(x, y)); // 3.0

        // give the square root
        System.out.println(Math.sqrt(y)); // 1.73....

        // calculate a circle area (PI*r^2)
        System.out.println(Math.PI * Math.pow(y, 2)); // 28.274....

        // calculate a sphere area (PI*r^2)
        System.out.println(4 * Math.PI * Math.pow(y, 2)); // 113.89...

        // calculate a sphere volume (PI*r^2)
        System.out.println((4/3) * Math.PI * Math.pow(y, 3)); // 84.823....
    }}
