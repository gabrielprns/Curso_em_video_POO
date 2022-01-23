/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula7_8;

/**
 *
 * @author Usuario
 */
public class UltraCombat {
    
    public static void main(String[] args) {
        Lutador l[]= new Lutador[6];
        
        l[0]= new Lutador("Pretty Boy", "França", 31, 11, 2, 1, 100f, 1.75f );
        l[1]= new Lutador("Pika", "Dresrossa", 60, 20, 6, 1, 100f, 3.30f );
        
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
    }
    
}
