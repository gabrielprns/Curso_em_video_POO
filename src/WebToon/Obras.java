/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebToon;

/**
 *
 * @author Usuario
 */
public class Obras {
    //Atributos
    private String nome ;
    private String Autor ;
    private int numVol ;
    
    //Métodos
    public void abrirCap(String n){
        this.setNome(n);
        System.out.println("O capitúlo de "+ this.getNome() +" está aberto ");
    }
    
    public void MostarAutor(String j){
        this.setAutor(j);
        System.out.println("O nome do autor é: " + this.getAutor());
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumVol() {
        return numVol;
    }

    public void setNumVol(int numVol) {
        this.numVol = numVol;
    }
    
    
    
    
    
    
}
