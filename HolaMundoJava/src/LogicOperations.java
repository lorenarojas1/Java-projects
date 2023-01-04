public class LogicOperations {
    public static void main(String[] args) {
        int a= 8;
        int b = 5;

        // assigned operator
        System.out.println("a is equal to b? -> " + (a == b)); // false
        System.out.println("a is different to b? -> " + (a != b)); // true

        // relational operator
        System.out.println("a is bigger to b? -> " + (a > b)); // true
        System.out.println("a is less to b? -> " + (a < b)); // false
        System.out.println("a is bigger or equal to b? -> " + (a >= b)); // true
        System.out.println("a is less or equal to b? -> " + (a <= b)); // false

        if (a == b){
            System.out.println("a is equal to b");
        }
        else if (a != b){
            System.out.println("a is different to b");
        }
        else if (a > b){
            System.out.println("a is bigger to b");
        }
        else if (a < b){
            System.out.println("a is less to b");
        }
        else if (a >= b){
            System.out.println("a is bigger or equal to b");
        }
        else if (a <= b){
            System.out.println("a is less or equal to b");
        }

    }
}
