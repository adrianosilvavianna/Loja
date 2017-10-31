/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adriano
 */
public class CarrinhoCompras {

    double valorTotal = 0.0; 
    private static final List<Produto> produtos = new ArrayList<>();
   
    public CarrinhoCompras(Produto produto) {
        produtos.add(produto);
    }

    CarrinhoCompras() {
        
    }

    public void setCarrinho(Produto produto) {
        produtos.add(produto);
        
    }
    
    public void getCarrinhoCompras(){
         for (Produto pdt : produtos) {
            System.out.println(pdt.toString() + "\n");
        }
    }
    
    public void addValorCompra()
    {
        for (Produto pdt : produtos) {
            valorTotal += pdt.precoVenda;
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    @Override
    public String toString() {
        return "CarrinhoCompras{" + "valorTotal=" + valorTotal + '}';
    }

    void finish() {
        produtos.clear();
    }
    
}
