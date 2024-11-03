import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        int param1, param2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        param1 = sc.nextInt();

        System.out.print("Digite o segundo parâmetro: ");
        param2 = sc.nextInt();

        sc.close();

        try {
            contar(param1, param2);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
            System.err.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro1 > parametro2) throw new ParametrosInvalidosException();

        int contagem = parametro2 - parametro1;

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
