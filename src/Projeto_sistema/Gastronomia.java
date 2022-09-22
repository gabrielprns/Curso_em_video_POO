/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projeto_sistema;


/**
 *
 * @author Usuario
 */
public class Gastronomia {
    public static void main(String[] args) {
        //Princípio da inversão de dependência
        Comida sushi_1 = new Sushi();
        Comida sushi_2 = new Sushi();
        Comida sushi_3 = new Sushi();
        
        sushi_1.mudarCor();
        sushi_2.cozinhar();
        sushi_3.testarValidade();
        
        
    }
    
}
