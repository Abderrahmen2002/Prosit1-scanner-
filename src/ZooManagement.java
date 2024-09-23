import java.util.Scanner;
public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Donner le nom de le zoo : ");
        String zoo = scanner.next();
        int nbrCages = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.printf("Donner le nombre des cages : ");
            if (scanner.hasNextInt()) {
                nbrCages = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Veuillez entrer un entier.");
                scanner.next();
            }
        }
        System.out.printf("Le nom du zoo est : " + zoo + "\n");
        System.out.printf("Le nombre de cages est : " + nbrCages);
    }
}
