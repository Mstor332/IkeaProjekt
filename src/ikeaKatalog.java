import java.util.ArrayList;

public class ikeaKatalog {
    ArrayList<String> katalog = new ArrayList<String>();

    //· ArrayList<String> katalog – En liste over møbler.
    public ikeaKatalog() {
        katalog.add("KÆMPE stor seng");
        katalog.add("SUPER lille seng");
        katalog.add("MEGA lille sofa");
        katalog.add("EKSTREM medium kommode");

    }

    //Ligegyldig? · visKatalog() – Udskriver listen af møbler
    public void visKatalog() {
        System.out.println("Møbel Katalog:");
        for (String item : katalog) {
            System.out.println("- " + item);
        }
    }
// tilføjMøbel(String navn) – Tilføjer et møbel til listen.
    public void tilfojMobel(String mobel) {
        katalog.add(mobel);
        System.out.println(mobel + " er tilføjet!");
    }
}


