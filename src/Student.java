import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

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
            System.out.println("Introduceti numele studentului:" );
            String nume = scanner.nextLine();

            System.out.println("Introduceti anul nasterii:");
            LocalDate dataNasterii= LocalDate.of(2001,5,15);
            //Data curenta
            LocalDate dataCurenta= LocalDate.now();

            // Calculam perioada dintre cele doua date
            Period perioada = Period.between(dataNasterii,dataCurenta);

            //Extragerea anilor
            int virsta = perioada.getYears();

            System.out.println("Virsta este : " + virsta +"ani.");


            System.out.println();


        }



        System.out.println("Iesire din program..");

    }
}
