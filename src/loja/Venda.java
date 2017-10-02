/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

import java.util.Date;

/**
 *
 * @author Adriano
 */
public class Venda{
    
    Date data;
    double valorTotalVenda;
    
    public Venda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
        this.data = new Date();
    }

    @Override
    public String toString() {
        return "Venda{" + "data=" + data + ", valorTotalVenda=" + valorTotalVenda + '}';
    }

    
    
}
