import java.io.PrintStream;
import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String nome;
        char resp;
        int numero;

        System.out.println("Bem vindo ao Meu programa!!");
        System.out.println();
        System.out.println("Digite seu nome:");
        nome = scan.nextLine();
        do {
            System.out.println("Perfeito "+nome+". Agora digite algum número de 0 a 100");
            numero = scan.nextInt();

            for( int i = 0; i <= numero; i++ ){
                System.out.println(i);

            }
            System.out.println();
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
            if (nome.length() >= 6){
                for (int i = 0; i <= numero; i++   ){
                    System.out.println(nome);
                }
            }else{
                System.out.println(nome);
            }
            System.out.println("Deseja repetir?(s/n)");
            resp = scan.next().charAt(0);




        }while(resp != 'n');

    }
}

