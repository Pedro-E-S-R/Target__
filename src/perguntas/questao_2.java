package perguntas;

import java.util.Scanner;

public class questao_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int vetor[] = new int[30];
        int ponto = 0;
        for(int i = 0;i<30;i++ ) {
            vetor[i] = f(i);
            if(n == vetor[i]) {
                ponto = vetor[i];
            }
        }

        if(n == ponto) {
            System.out.println("PERTENCE A SEQUENCIA DE FIBONACCI");
        }else {
            System.out.println("NAO PERTENCE A SEQUENCIA DE FIBONACCI");
        }



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
