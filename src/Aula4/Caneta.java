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
    private String cor ;
    private boolean Tampada;
    
    public Caneta(String m, String c, float p){
        this.setModelo(m);
        this.setPonta(p);
        this.cor = "Azul";
        this.Tampar();
    }
    
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
    
    protected void Tampar(){
            this.Tampada=true;
        }
    
    protected void Destampar(){
            this.Tampada=false;
        }
    
    public void status(){
        System.out.println("\nSobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " +  this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Está tampada: " + this.Tampada);
    
    }
    
}
