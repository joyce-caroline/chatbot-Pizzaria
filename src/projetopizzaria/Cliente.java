package projetopizzaria;

import java.util.Scanner;

public class Cliente {
    private String nome;
    private String endereco;
    private Scanner scan;

    public Cliente(Scanner scan) {
        this.scan = scan;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void lerEndereco(){
        System.out.println("Digite o seu endereco:");
        setEndereco(scan.nextLine());
    }

    public void lerNome(){
        System.out.println("Qual o seu nome?");
        setNome(scan.nextLine());
    }


}

