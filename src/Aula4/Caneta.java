/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula4;

/**
 *
 * @author Usuario
 */
public class Caneta {
    private String modelo;
    private float ponta;
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public float getPonta(){
        return this.ponta;
    }
    
    public void setPonta(float p){
        this.ponta= p;
    }
    
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " +  this.getPonta());
    
    }
    
}
