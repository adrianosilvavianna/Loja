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
public class Compra {
    
    double valorTotal;
    int numeroParcelas;
    
    //a vista
    public Compra(double valorTotal){
        this.valorTotal = valorTotal;
    }
    
    //parcelado
    public Compra(int qtdParcelas, double valorParcela){
        this.numeroParcelas = qtdParcelas;
        this.valorTotal = valorParcela * qtdParcelas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public void setNumeroParcelas(int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
    }
    
    
    
}
