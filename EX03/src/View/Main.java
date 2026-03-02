package View;

import java.util.Scanner;
import Controller.Inversor;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String entrada = sc.nextLine();

        Inversor controller = new Inversor();

        String resultado = controller.inverterString(entrada);

        System.out.println("String invertida: " + resultado);

        sc.close();
    }
}