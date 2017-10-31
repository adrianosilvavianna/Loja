/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Adriano
 */
public class Jogo extends Produto{

    private final Scanner leia = new Scanner(System.in);
    String categoria;

    public Jogo(String categoria, int cod, String nome, double precoVenda, double precoCompra, int qtd) {
        this.categoria = categoria;
        super.setCodigo(cod);
        super.setNome(nome);
        super.setPrecoCompra(precoCompra);
        super.setPrecoVenda(precoVenda);
        super.setQuantidade(qtd);
        super.setDataCompra(new Date());
    }

    public Jogo() {
        
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
        System.out.println("Quantidade");
        super.setQuantidade(leia.nextInt());
        
        Date data = new Date();
        
        super.setDataCompra(data);
        
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

    public ArrayList venda(ArrayList<Jogo> jogos, ArrayList<CarrinhoCompras> carrinho) {
        
        boolean sair = false;
        int op = -1;
        Jogo jogoFind = null;
        
        System.out.println("O que pretende comprar \n");
        while(!sair){
            String[] opcao = new String[this.contJogos(jogos)];
            int vetor = 0;
            System.out.println("Digite 99 para sair");
            for(Jogo jogo : jogos){                
                opcao[vetor] = jogo.getNome();
                System.out.println(vetor + " - " + opcao[vetor]);
                vetor++;
            }
            System.out.print("\n Informe uma opção: ");
            op = leia.nextInt();
            
            if(op == 00)    
                break;
            
            for(Jogo jogo : jogos){
                
                if(opcao[op].equals(jogo.getNome())){
                    System.out.println("Jogo " + jogo.getNome() + " Selecionado");
                    CarrinhoCompras carrinhoCompras = new CarrinhoCompras(jogo);
                    carrinho.add(carrinhoCompras);
                }
            }
        }
        return carrinho;
        
    }
    
    public int contJogos(ArrayList<Jogo> jogos){
        
        int cont = 0;
        
         for(Jogo jogo : jogos){
            cont++;
          }
         return cont;
    } 

    @Override
    public String toString() {
        return "Jogo{" + "Cod - " + super.getCodigo() + " Nome - " + super.getNome() + " Categoria - " + categoria + " Preco Compra - " + super.getPrecoCompra() + " Preco Venda - " + super.getPrecoVenda() + '}';
    }
    
    String toStringEstoque() {
            return "Produto - Jogo" + "Cod - " + super.getCodigo() + " Nome - " + super.getNome() + " Categoria - " + categoria + " Preco Compra - " + super.getPrecoCompra() + " Preco Venda - " + super.getPrecoVenda() + " Quantidade Disponívvel" + super.getQuantidade() + "Data da Compra" + super.getDataCompra();
    }
}
