/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12_13;

/**
 *
 * @author Usuario
 */
public class Cachorro extends Mamifero {
    
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
    
    public void reagir(String frase){
        if (frase.equals("Toma Comida")||frase.equals("Olá")){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
    
    }
    
    public void reagir(int hora, int min){
        if (hora<12){
            System.out.println("Abanar");
        }else if(hora>=18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
        
    
    }
    
    public void reagir(boolean Dono){
        if(Dono){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e Latir");
        }
    
    }

    public void reagir(int idade, float peso){
    
    }


    
}
