package projetopizzaria;
import projetopizzaria.Cliente;
import projetopizzaria.Pizza;
import projetopizzaria.Pagamento;

import java.util.Scanner;

public class Pedido {
    private Cliente cliente;
    private Pizza pizza;
    private Pagamento pagamento;
    private int troco;
    private int valorTaxa;
    private int valorTotal;
    private String consumo;

    private Scanner scan;

    public Pedido(Cliente cliente, Pizza pizza, Pagamento pagamento, Scanner scan) {
        this.cliente = cliente;
        this.pizza = pizza;
        this.pagamento = pagamento;
        this.scan = scan;
    }

    public int getTroco() {
        return troco;
    }

    public void setTroco(int troco) {
        this.troco = troco;
    }

    public String getConsumo() {
        return consumo;
    }

    public void setConsumo(String consumo) {
        this.consumo = consumo;
    }

    public int getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(int valorTaxa) {
        this.valorTaxa = valorTaxa;
    }

    public int getValorTotal() {
        return valorTaxa + pizza.getValor();
    }

    public void lerTroco (){
        setTroco(0);
        if(pagamento.getCodigoPagamento() == 1) {
            System.out.println("O valor total do pedido e de R$" + getValorTotal());
            System.out.println("Sera necessario troco para qual quantia?");
            System.out.println("Responda aqui: ");
            setTroco(scan.nextInt());
        }
    }

    public void lerConsumo(){
        int escolhaConsumo = 0;
        System.out.println("Consumir no local ou entrega ?");
        System.out.println("1 - Consumir no local");
        System.out.println("2 - Entrega");
        System.out.print("Responda aqui: ");
        escolhaConsumo = scan.nextInt();
        while(escolhaConsumo < 1 || escolhaConsumo > 2) {
            System.out.println("Escolha inválida. Escolha novamente:");
            escolhaConsumo = scan.nextInt();
        }
        setConsumo(deParaConsumo(escolhaConsumo));
        setValorTaxa(0);
        if(escolhaConsumo == 2){
            setValorTaxa(3);
        }
    }

    public String deParaConsumo(int escolha){
        switch (escolha){
            case 1:
                return "Consumir no local";
            case 2:
                return "Entrega";
            default:
                return "";
        }

    }

    void status(){
        System.out.println("-----DADOS DO PEDIDO-----");
        System.out.println("Pedido no nome de: "+ cliente.getNome());
        System.out.println("Sabor da pizza: "+ pizza.getSabor());
        System.out.println("Tamanho: "+pizza.getTamanho());
        System.out.println("Valor da pizza: R$"+pizza.getValor()+",00");
        System.out.println("Taxa de entrega: R$"+getValorTaxa()+",00");
        System.out.println("Valor total do pedido: R$"+getValorTotal()+",00");
        System.out.println("Forma de pagamento: "+pagamento.getFormaPagamento());
        System.out.println(getTroco() == 0 ? "Sem troco":"Troco para: R$"+ getTroco()+",00");
        System.out.println("Endereço de entrega: "+cliente.getEndereco());
        System.out.println("O pedido esta sendo preparado e logo estara pronto!");
        System.out.println("-----Obrigado pela preferencia----- ");
    }


}