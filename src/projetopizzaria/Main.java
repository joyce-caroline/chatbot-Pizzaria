package projetopizzaria;
import java.util.Scanner;

public class Main {

    final private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        Cliente cliente = new Cliente(scan);
        Pizza pizza = new Pizza(cliente, scan);
        Pagamento pagamento = new Pagamento(scan);
        Pedido pedido = new Pedido(cliente, pizza, pagamento, scan);

        System.out.println("\nSeja bem-vindo ao atendimento online PizzaBoa!\n");

        cliente.lerNome();
        pizza.lerSabor();
        pizza.lerTamanho();
        pedido.lerConsumo();
        cliente.lerEndereco();
        pagamento.lerModoPagamento();
        pedido.lerTroco();
        pedido.status();
        scan.close();
    }
}