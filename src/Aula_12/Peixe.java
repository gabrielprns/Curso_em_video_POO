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
public class Peixe extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substância");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
    
}
