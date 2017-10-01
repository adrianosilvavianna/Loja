/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Adriano
 */
public class Jogo extends Produto{

    private final Scanner leia = new Scanner(System.in);
    String categoria;

    public Jogo(String categoria, int cod, String nome, double precoVenda, double precoCompra) {
        this.categoria = categoria;
        super.setCodigo(cod);
        super.setNome(nome);
        super.setPrecoCompra(precoCompra);
        super.setPrecoVenda(precoVenda);
    }

    public Jogo() {
        
    }

    @Override
    public String toString() {
        return "Jogo{" + "Cod" + super.getCodigo() + "Nome" + super.getNome() + "categoria=" + categoria + "Preco Compra" + super.getPrecoCompra() + "Preco Venda" + super.getPrecoVenda() + '}';
    }

    @SuppressWarnings("empty-statement")
    void cadastrar(ArrayList<Jogo> jogos) {
        
        Jogo jogo = new Jogo();
        
        System.out.println("Codigo :");
        super.setCodigo(leia.nextInt());
        System.out.println("Qual Categoria?");
        jogo.setCategoria(leia.next());
        System.out.println("Nome :");
        super.setNome(leia.next());
        System.out.println("Preco de compra : (Ex: 19,90)");
        super.setPrecoCompra(leia.nextDouble());
        System.out.println("Preco de venda : (Ex: 19,90)");
        super.setPrecoVenda(leia.nextDouble());
        
        if(jogos.add(jogo)){
            System.out.println("Jogo " + super.getNome() + " Cadastrado com sucesso \n");
        };
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    void excluir(ArrayList<Jogo> jogos) {
        Jogo jogoFind = null;
        System.out.println("Digite o cod do jogo :");
        int codigo = leia.nextInt();
        
        for (Jogo jogo : jogos) {
            
            int cod = jogo.getCodigo();
            
            if(cod == codigo){
                System.out.println("Jogo Encontrado");
                jogoFind = jogo;
            }
        } 
        
        if(jogos.remove(jogoFind)){
            System.out.println("Jogo Excluido com sucesso \n");
        }
        
    }
}
