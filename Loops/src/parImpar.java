import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contLoop =0;
        int count = 0;
        int numero = 0;
        int soma=0;
        int quantiPares=0, quantiImpares=0;

        System.out.println("Digite a Quantidade de Loop ");
        contLoop = scan.nextInt();

    do{
        System.out.println("Digite um número a somar ");
        numero = scan.nextInt();

        soma= soma+numero;
        count++;


        if (numero%2==0) quantiPares++;
                else quantiImpares ++;

    }while (count<contLoop);
        System.out.println("A quantidade par: " + quantiPares);
        System.out.println("A quantidade impar:  " + quantiImpares);

    }



}
