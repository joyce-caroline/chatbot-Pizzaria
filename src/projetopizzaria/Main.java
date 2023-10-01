package projetopizzaria;
import java.util.Scanner;

public class Main {

    final private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\nSeja bem-vindo ao atendimento online PizzaBoa!\n");

        Cliente cliente = new Cliente(scan);
        cliente.lerNome();
        cliente.lerEndereco();

        Pizza pizza = new Pizza(cliente, scan);
        pizza.lerSabor();
        pizza.lerTamanho();

        Pagamento pagamento = new Pagamento(scan);

        Pedido pedido = new Pedido(cliente, pizza, pagamento, scan);
        pedido.lerConsumo();
        pagamento.lerModoPagamento();
        pedido.lerTroco();
        pedido.status();

        scan.close();
    }
}