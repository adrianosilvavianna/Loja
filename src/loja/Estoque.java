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
public class Estoque {
    
    Date dataCompra;
    int quantidade;
    
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
    
    public void estoqueBaixo(Produto pg){
        
        if(pg.quantidade <= 1){
            System.out.println("O produto - "+ pg.nome +" - Esta acabando - Possui apenas "+ pg.quantidade + " unidades .");
        }
    }
    
}
