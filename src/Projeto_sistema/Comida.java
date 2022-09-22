/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_sistema;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Comida implements ComidaI{
    
    //Principio Aberto-Fechado
    protected String cor;
    protected String temperatura;
    protected boolean validade;
    Scanner sc = new Scanner(System.in);

    protected String getCor() {
        return cor;
    }

    protected void setCor(String cor) {
        this.cor = cor;
    }

    protected String getTemperatura() {
        return temperatura;
    }

    protected void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    protected boolean isValidade() {
        return validade;
    }

    protected void setValidade(boolean validade) {
        this.validade = validade;
    }

    //Princípio de substituição de Liskov
    @Override
    public void cozinhar() {
        System.out.println("Por Favor digite o valor da temperatura: ");
        this.temperatura= sc.next();
        System.out.println("A temperatura do alimento igual a : " + temperatura);
    }

    @Override
    public void mudarCor() {
        System.out.println("Por Favor digite o valor da cor: ");
        this.cor= sc.next();
        System.out.println("A cor do alimento é igual a : " + cor);
    }

    @Override
    public void testarValidade() {
        System.out.println("Por Favor digite o valor da validade: ");
        this.validade= sc.nextBoolean();
        System.out.println("A Validade do alimento é igual: " + validade);
    }

    
}
