/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula9;

/**
 *
 * @author Usuario
 */
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[4];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 23, "F");
        
        
        l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
        
        l[0].abrir();
        l[0].folhear(200);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
    
}
