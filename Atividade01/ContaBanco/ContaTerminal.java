package Atividade01.ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);    
        
        System.out.println("* Conta Banco *");

        System.out.println("\nInsira o número da conta:");
        int numero = input.nextInt();       

        System.out.println("\nInsira o número da Agência: ");
        String agencia = input.next();

        System.out.println("\nInsira o nome do cliente:");
        input.nextLine();       //leitura para limpar buffer do teclado
        String nome = input.nextLine();

        System.out.println("\nInforme o saldo da conta: ");
        double saldo = input.nextDouble();

        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        input.close();
    }
}