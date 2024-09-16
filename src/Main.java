import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Donner le nom de le zoo : ");
        String zoo=scanner.next();
        System.out.printf("Donner le nombre des cages : ");
        int nbrCages=scanner.nextInt();
        System.out.printf("Le nom de zoo est : " +zoo+"\n");
        System.out.printf("Le nombres de cages est : "+nbrCages);
    }
}