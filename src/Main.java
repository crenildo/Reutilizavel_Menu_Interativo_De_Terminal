import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean onOff = true;

        Scanner scanner = new Scanner(System.in);

        String texto = "Você foi redirecionado ao menu anterior! \n. \n. \n.)";

        //System.out.println(ninjas.length);

        while (onOff) {

            System.out.println("Seja bem-vindo ao sistema de gerenciamento de menu: " +
                    "\n \n 1 - Opção \n 2 - Opção  \n 3 - Opção \n 4 - Opção \n 5 - sair");

            int n1 = Integer.parseInt(scanner.nextLine());
            switch (n1) {
                case 1:
                    System.out.println(texto);
                    break;

                case 2:
                    System.out.println(texto);
                    break;

                case 3:
                    System.out.println(texto);
                    break;

                case 4:
                    System.out.println(texto);
                    break;

                case 5:
                    System.out.println("Obrigado por utilizar o menu interativo!");
                    onOff = false;
                    break;

                default:
                    System.out.println("Você digitou uma opção invalida!");
                    break;
            }
        }
    }
}
