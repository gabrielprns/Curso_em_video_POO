/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula2;

/**
 *
 * @author Usuario
 */
public class caneta {
        String cor, modelo ;
        float Ponta ;
        int carga;
        boolean Tampada;
        
        
        void rabiscar(){
        }
        
        void Tampar(){
            this.Tampada=true;
        }
        
        void Destampar(){
            this.Tampada=false;
        }
        
        void Status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("A cor da caneta é: " + this.cor);
            System.out.println("Está tampada? " + this.Tampada);
            System.out.println("Ponta: " + this.Ponta);
            System.out.println("Carga: " + this.carga);
        }
}
