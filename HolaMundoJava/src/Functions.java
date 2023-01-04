public class Functions {
    public static void main(String[] args) {
        double y = 3;

        circleArea(y);
        sphereArea(y);
        sphereVolume(y);

        System.out.println("MXN to Dollars: " + convertToDollar(200, "MXN"));
        System.out.println("COP to Dollars: " + convertToDollar(200, "COP"));

    }
    public static double circleArea(double r){
        return Math.PI * Math.pow(r,2);
    }
    public static double sphereArea(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }
    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }

    /**
     * Description: function that convert an amount to dollars
     * @param quantity amount
     * @param currency Money type: only accept MXN or COP
     * @return quantity return value description of this function
     * */
    public static double convertToDollar(double quantity, String currency){
        // MXN COP
        switch (currency){
            case "MXN":
                quantity =quantity *0.052;
                break;
            case "COP":
                quantity =quantity *0.00031;
                break;
        }
        return quantity;
    }
}
