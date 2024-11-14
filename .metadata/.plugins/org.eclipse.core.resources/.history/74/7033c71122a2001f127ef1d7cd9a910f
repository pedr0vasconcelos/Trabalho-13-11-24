package app;

import model.BichinhoVirtual;
import service.BichinhoService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crie seu novo bichinho");
        System.out.print("Insira o nome: ");
        String nome = scanner.nextLine();
        System.out.print("Insira a classe: ");
        String classe = scanner.nextLine();
        System.out.print("Insira a família: ");
        String familia = scanner.nextLine();

        BichinhoVirtual bichinho = new BichinhoVirtual(nome, classe, familia);
        BichinhoService service = new BichinhoService();

        while (bichinho.isVivo()) {
            System.out.println("\nO que o " + nome + " vai fazer agora?");
            System.out.println("1- Comer\n2- Correr\n3- Dormir\n4- Morrer");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    service.comer(bichinho);
                    break;
                case 2:
                    service.correr(bichinho);
                    break;
                case 3:
                    service.dormir(bichinho);
                    break;
                case 4:
                    service.morrer(bichinho);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
