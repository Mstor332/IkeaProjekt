import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Opret en ArrayList<String> med nogle navne.

        ArrayList<String> navne = new ArrayList<String>();
        navne.add("steffen");
        navne.add("alexander");
        navne.add("koliander");
        navne.add("brian");
        navne.add("willow");
        navne.add("martin");

        // 2. Lad brugeren indtaste et navn.
        System.out.println("Indtast et nyt navn: ");
        String choice = scanner.nextLine().trim().toLowerCase();

        //3. Tjek om navnet findes i listen, og giv en besked.
        if (navne.contains(choice)) {
            System.out.println(choice + " er på listen allerede!");
        } else {
            navne.add(choice);
            System.out.println("Updateret version med nye navne: " + navne);
        }
    }
}
