public class SwitchStatement {
    public static void main(String[] args) {
        String colorModeSelected = "Dark";

        switch (colorModeSelected){
            case "Light":
                System.out.println("Choose light Mode");
                break;
            case "Night":
                System.out.println("Choose night Mode");
                break;
            case "Blue Dark":
                System.out.println("Choose blue dark Mode");
                break;
            case "Dark":
                System.out.println("Choose dark Mode");
                break;
            default:
                System.out.println("Choose an option");
        }
    }
}
