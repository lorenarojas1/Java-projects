public class DataTypes {
    public static void main(String[] args) {
        // JAVA 8
        // integer
        int n = 1234567890; // 10 numbers
        long nL = 12345678901L; // more 10 numbers
        short nS = 1234;
        // decimal numbers
        double nD = 123.456;
        float nF = 123.456F;

        // JAVA 10
        var salary = 1000; // int 1000
        var salaryD = 1000.0; // double 1000.0

        // pension 3%
        var pension = salary*0.03; // double 30.0
        var totalSalary = salary - pension; //double 970.0

        System.out.println(salary);
        System.out.println(pension);
        System.out.println(totalSalary);

        var employeeName = "Lorena Rojas";
        System.out.println("Employee: " + employeeName + ", Salary: " + totalSalary);
    }
}
