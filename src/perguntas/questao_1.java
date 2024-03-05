package perguntas;

public class questao_1 {
    public static void main(String[] args) {

        int INDICE = 13;
        int SOMA = 0, K = 0;
        while(K < INDICE){
            K = K+1;
            SOMA = SOMA + K;
        }

        System.out.println("Soma é: "+SOMA);

    }
}
