import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        int[] vetorA = new int[10];
        int[] numPrimos = new int[10];
        Scanner ler = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Digite numero " + (i+1));
            vetorA[i] = ler.nextInt();
        }

        for(int i=0; i<10; i++);{
        System.out.println("Os numeros primos são" );
        numPrimos[i] = ler.nextInt();
        }

        ler.close();

    }
    
}
