import java.util.ArrayList;

public class Main{

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("UC2 - Add Passenger Bogies to Train");
        System.out.println("========================================\n");

        ArrayList<String> passengerBogies = new ArrayList<>();

        System.out.println("Adding passenger bogies...");
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("\nCurrent bogies in train:");
        System.out.println(passengerBogies);

        System.out.println("\nRemoving 'AC Chair' bogie...");
        passengerBogies.remove("AC Chair");

        System.out.println("\nBogies after removal:");
        System.out.println(passengerBogies);

        System.out.println("\nChecking if 'Sleeper' bogie exists...");
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("Sleeper bogie is present in the train.");
        } else {
            System.out.println("Sleeper bogie is NOT present in the train.");
        }

        System.out.println("\nFinal train consist:");
        System.out.println(passengerBogies);
    }
}