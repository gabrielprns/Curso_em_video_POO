/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoYoutube;

/**
 *
 * @author Usuario
 */
public class ProjetoYoutube {
    
    public static void main(String[] args) {
        Video v[]= new Video[6];
        Gafanhoto g[] = new Gafanhoto[6];
        g[0]= new Gafanhoto("Gabriel", 30 , "M", "@G");
        v[1]= new Video("Aula 1");
        
        Visualizacao vis = new Visualizacao(g[0],v[1]);
        System.out.println(vis.toString());
    }
    
}
