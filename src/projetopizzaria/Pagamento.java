package projetopizzaria;

import java.util.Scanner;

public class Pagamento {
    private String formaPagamento;
    private int codigoPagamento;
    private Scanner scan;


    public Pagamento(Scanner scan) {
        this.scan = scan;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public int getCodigoPagamento() {
        return codigoPagamento;
    }

    public void setCodigoPagamento(int codigoPagamento) {
        this.codigoPagamento = codigoPagamento;
    }

    public void lerModoPagamento(){
        int escolhaPagamento = 0;
        System.out.println("Como sera feito o pagamento?");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartao");
        System.out.println("3 - Pix");
        System.out.print("Responda aqui: ");
        escolhaPagamento = scan.nextInt();
        while(escolhaPagamento < 1 || escolhaPagamento > 3) {
            System.out.println("Método de Pagamento inválido. Por favor escolha entre as opções:");
            escolhaPagamento = scan.nextInt();
        }
        setFormaPagamento(deParaPagamento(escolhaPagamento));
        setCodigoPagamento(escolhaPagamento);
    }

    public String deParaPagamento(int escolha){
        switch (escolha){
            case 1:
                return "Dinheiro";
            case 2:
                return "Cartao";
            case 3:
                return "Pix";
            default:
                return "";
        }

    }


}
