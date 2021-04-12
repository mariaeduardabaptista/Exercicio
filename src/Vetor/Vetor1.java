import java.util.Scanner;

public class Vetor1 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int [] vetorA = new int [5];
        int [] vetorB = new int[5];
        int [] vetorC = new int[5];


        for(int i=0; i<5;i++){
            System.out.println("Digite o primeiro valor: "+(i+1));
            vetorA[i] = ler.nextInt();
            System.out.println("Digite o segundo valor: "+(i+1));
            vetorB[i] = ler.nextInt();
        }

        for(int i=0;i<5;i++){
        vetorC[i] = vetorA[i] +vetorB[i];
        System.out.println("A soma dos valores e:" + vetorC[i]);
        }

        ler.close();
    }
}