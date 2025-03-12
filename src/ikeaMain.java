import java.util.Scanner;

public class ikeaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ikeaKatalog katalog2 = new ikeaKatalog();

        //Skal skrive sc og katalog2 igen.
        brugerValg(sc, katalog2);

    }

    public static void visMenu() {
        System.out.println("Vælg en mulighed: ");
        System.out.println("1. Se en liste over møblerne" + "\n" +
                "2. Tilføj møbler." + "\n" +
                "3. Afslut programmet");
    }

    //Scanner sc, ikeaKatalog katalog2, gør at jeg kan bruge den
    //inde i min metode.
    public static void brugerValg(Scanner sc, ikeaKatalog katalog2) {

        boolean running = true;
        while (running) {
            visMenu();

            int choice = sc.nextInt();
            //Skal have en buffer her ellers går den videre fra case 2.
            sc.nextLine();

            switch (choice) {
                case 1:
                    katalog2.visKatalog();
                    break;
    //Jeg laver en ny variabel nyMobel, som er brugerens input.
                case 2:
                    System.out.println("Indtast møbler: ");
                    String nyMobel = sc.nextLine();
                    katalog2.tilfojMobel(nyMobel);
                    break;
                case 3:
                    System.out.println("Afslutter programmet...");
                    running = false;
                    break;
                default:
                    System.out.println("Ugyldigt valg");
            }
        }
    }
}
//EKSTRA TING: Søge efter et specifikt møbel i kataloget.
// 🚽 Fjerne et møbel fra kataloget.
// 🪴 Sortere kataloget alfabetisk.