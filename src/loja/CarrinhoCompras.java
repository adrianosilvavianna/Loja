/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author Adriano
 */
public class CarrinhoCompras extends Produto{

    double valorTotal = 0.0; 
   
    public CarrinhoCompras(int cod, String nome, double precoVenda) {
        super.setCodigo(cod);
        super.setNome(nome);
        super.setPrecoVenda(precoVenda);
    }

    CarrinhoCompras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
    
}
