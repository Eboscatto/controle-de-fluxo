import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao controle de fluxo!!!");

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try{
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {

            // lançar a exceção personalizada
            throw  new ParametrosInvalidosException();
        }
        //validar se parametroUm é maior que parametroDois e lançar a exceção
        int contagem = parametroDois - parametroUm;

        //realizar o FOR  para imprimir os números com base na varável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número: " + i);
        }
    }
}


