package perguntas;

import java.util.Scanner;

public class questao_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Letra A
        int vetorA[] = new int[5];
        vetorA[0] = 1;
        for(int i = 1;i<5;i++ ) {

            vetorA[i] = vetorA[i-1]+2;

        }
        for(int i=0;i<5;i++) {
            System.out.print(" " + vetorA[i]);
        }
        System.out.println();
        // Letra B
        int vetorB[] = new int[7];
        vetorB[0] = 2;
        for(int i = 1;i<7;i++ ) {

            vetorB[i] = vetorB[i-1]*2;

        }
        for(int i=0;i<7;i++) {
            System.out.print(" " + vetorB[i]);
        }
        System.out.println();
        // Letra C
        int vetorC[] = new int[8];
        vetorC[0] = 0;
        int soma = 1;
        for(int i = 1;i<8;i++) {
            vetorC[i] = soma + vetorC[i-1];
            soma = soma+2;
        }
        for(int i = 0;i<8;i++) {
            System.out.print(" " + vetorC[i]);
        }
        System.out.println();

        // Letra D
        int vetorD[] = new int[5];
        vetorD[0]= 4;
        soma = 12;
        for(int i = 1;i<5;i++) {
            vetorD[i] = soma + vetorD[i-1];
            soma = soma+8;
        }
        for(int i = 0;i<5;i++) {
            System.out.print(" " + vetorD[i]);
        }
        System.out.println();

        // Letra E (aproveitei o metodo estatico que criei usado na questão 2 para responder
        int vetorE[] = new int[8];

        for(int i = 1;i<8;i++) {
            vetorE[i-1] = f(i) ;

        }
        for(int i = 0;i<7;i++) {
            System.out.print(" " + vetorE[i]);
        }
        System.out.println();

        // Letra F (Todos os numeros que inica com a letra D, mas não conseguir imaginar uma logica)
        System.out.println(" 2,10, 12, 16, 17, 18, 19, 200");




        sc.close();
    }
    public static int f(int x) {
        if(x<2) {
            return x;
        }else {
            return f(x-1)+f(x-2);
        }


    }
}
