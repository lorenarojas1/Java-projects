public class UpdatingVariables {
    public static void main(String[] args) {
        // Updating number data:
        int salary = 1000;
        salary = salary + 200;
        System.out.println(salary); // 1200

        salary += 300;
        System.out.println(salary); // 1500

        // Pension: $ 50 discount
        salary -= 50;
        System.out.println(salary); // 1450

        // 2 extra hrs $30 C/u
        // food: $45
        salary += (30*2) - 45;
        System.out.println(salary); // 1465

        // Updating String variables:
        String employeeName = "Elizabeth ";
        employeeName += "Rojas ";
        System.out.println(employeeName); // Elizabeth Rojas

        employeeName += "Espinoza";
        System.out.println(employeeName); // Elizabeth Rojas Espinoza

        employeeName = "Lorena " + employeeName;
        System.out.println(employeeName); // Lorena Elizabeth Rojas Espinoza

    }
}
