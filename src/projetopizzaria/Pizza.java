package projetopizzaria;
import projetopizzaria.Cliente;

import java.util.Scanner;

public class Pizza {
    private Cliente cliente;
    private String sabor;
    private String tamanho;
    private int valor;
    private Scanner scan;


    public Pizza(Cliente cliente, Scanner scan) {
        this.cliente = cliente;
        this.scan = scan;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void lerSabor(){
        int escolha = 0;
        System.out.println("É muito bom te ver, " + cliente.getNome() + ". Veja só os sabores disponíveis de hoje:");
        System.out.println("1 - Calabresa");
        System.out.println("2 - Portuguesa");
        System.out.println("3 - Frango com Catupiry");
        System.out.println("4 - Palmito");
        System.out.println("5 - Choconana (chocolate com banana)");
        System.out.print("Responda aqui: ");
        escolha = scan.nextInt();
        while(escolha < 1 || escolha > 5) {
            System.out.println("Não temos esse sabor. Por favor digite um sabor do nosso cardápio:");
            escolha = scan.nextInt();
        }
        setSabor(deParaSabores(escolha));

    }

    public String deParaSabores(int escolha){
        switch (escolha){
            case 1:
                return "Calabresa";
            case 2:
                return "Portuguesa";
            case 3:
                return "Frango com Catupiry";
            case 4:
                return "Palmito";
            case 5:
                return "Choconana";
            default:
                return "";
        }

    }
    public void lerTamanho(){
        int escolhaTamanho = 0;
        System.out.println("Certo! "+ cliente.getNome() +". De qual tamanho você quer sua pizza?");
        System.out.println("1 - Pequena - RS30,00");
        System.out.println("2 - Media - RS35,00");
        System.out.println("3 - Grande - RS 45,00");
        System.out.print("Responda aqui: ");
        escolhaTamanho = scan.nextInt();
        while(escolhaTamanho < 1 || escolhaTamanho > 3) {
            System.out.println("Por favor digite um tamanho correto:");
            escolhaTamanho = scan.nextInt();
        }
        setTamanho(deParaTamanho(escolhaTamanho));
        setValor(deParaValor(escolhaTamanho));
    }

    public String deParaTamanho(int escolhaTamanho){
        switch (escolhaTamanho){
            case 1:
                return "Pequena";
            case 2:
                return "Media";
            case 3:
                return "Grande";
            default:
                return "";
        }

    }

    public int deParaValor(int escolhaTamanho){
        switch (escolhaTamanho){
            case 1:
                return 30;
            case 2:
                return 35;
            case 3:
                return 45;
            default:
                return 0;
        }

    }
}




