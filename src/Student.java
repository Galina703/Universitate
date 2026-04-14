import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Rularea sau oprirea programului
        System.out.println("Intrare in program..");
        System.out.println("Introducere Facultate (Matematica/Informatica:");
        String facultate = scanner.nextLine();

        //Confirmarea si continuarea
        System.out.println(" A fost aleasa  Facultatea " + facultate + ".");
        System.out.println("Doriti sa introduceti studenti noi ? (Da/Nu ): ");
        String optiune = scanner.nextLine();
        if(optiune .equalsIgnoreCase("Da")) {
            System.out.println("Creati numele grupei noi :");
            String numeGrupa = scanner.nextLine();

            // Adaugarea obiectelor de tip student
            System.out.println("Grupa " + numeGrupa + " a fot creata");
        }



        System.out.println("Iesire din program..");

    }
}
