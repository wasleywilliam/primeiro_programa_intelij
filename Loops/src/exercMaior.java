import java.util.Scanner;

public class exercMaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int count=0;
        int maior=0;
        int media;
        int somatorio = 0;
        do {
            System.out.println("Número ");
            numero = scan.nextInt();
            count++;
            somatorio = somatorio+numero;
            if (numero>maior) maior = numero;

       }while (count <5);
        media=somatorio /count;

        System.out.println("O maior número é "+maior);
        System.out.println("A Média é "+media);
        System.out.println("A contagem foi "+count);
        System.out.println("A Somatório foi "+somatorio );

    }

}




