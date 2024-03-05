package perguntas;

import java.util.Scanner;

public class questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();
        char n[] = nome.toCharArray();
        int inicio = 0;
        int fim = n.length-1;

        char usar;
        while(fim>inicio) {
            usar = n[inicio];
            n[inicio] = n[fim];
            n[fim] = usar;
            fim--;
            inicio++;
        }
        nome = new String(n);
        System.out.println(nome);



        sc.close();
    }
}
