/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_12;

/**
 *
 * @author Usuario
 */
public class Reptil extends Animal{

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comedo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    
}
