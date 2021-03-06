/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Adriano
 */
abstract class Produto extends Estoque{
    
    public int codigo;
    public String nome;
    public double precoVenda;
    public double precoCompra;
    
    public void listaProdutos(List<Produto> produtos){
        for (Produto produto : produtos) {
            System.out.println(produto.toStringCliente()+ "\n");
        }
        
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
        
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public String toStringCliente() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", precoVenda=" + precoVenda + '}';
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", nome=" + nome + ", precoVenda=" + precoVenda + ", precoCompra=" + precoCompra + '}';
    }
    
}
