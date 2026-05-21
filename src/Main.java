import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bem-Vindo Usuário! qual o seu nome? ");
        String nome = scan.nextLine();

        try {
            System.out.println("Ola " + nome + ", digite o primeiro número: ");
            int num = scan.nextInt();

            System.out.println("Certo " + nome + ", agora digite o segundo número: ");
            int num2 = scan.nextInt();


            if (num > num2) {
                System.out.println(nome + " o número " + num + " é maior que " + num2);
            } else if (num < num2) {
                System.out.println(nome + " o número " + num + " é menor que " + num2);
            } else {
                System.out.println(nome + " os números são iguais --> " + num + " e " + num2);
            }
        }catch (Exception e){
            System.out.println("Erro, só numeros são permitidos");
        }
    }
}