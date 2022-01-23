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
public class Lutador {
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float peso, altura;

    
    //Métodos Públicos
    
    public void apresentar(){
        System.out.println("----------------------------------");
        System.out.println("Lutador: "+ this.getNome());
        System.out.println("Diretamente de : "+ this.getNacionalidade());
        System.out.println("com "+ this.getIdade()+ " anos e "+ this.getAltura()+ " de altura" );
        System.out.println("pesando "+ this.getPeso()+ "KG");
        System.out.println(this.getVitorias()+ " Vitórias");
        System.out.println(this.getDerrotas() + " Derrotas");
        System.out.println(this.getEmpates()+ " Empates!");
    }
    
    public void status(){
        System.out.println("=========================");
        System.out.println(this.getNome()+ " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias()+ " Vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " Vezes");
        System.out.println("Empatou " + this.getEmpates()+ " Vezes");
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    
    //Método Construtor

    public Lutador(String no, String na, int id, int vi,
                   int de, int em, float pe, float al){
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
        this.setPeso(pe);
        this.altura = al;
    }
    
    //Métodos Especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria="Inválido";
        } else if (this.peso <= 70.3){
            this.categoria="Leve";
        }else if (this.peso<=83.9){
            this.categoria="Médio";
        }else if (this.peso<=120.2){
            this.categoria="Pesado";
        }else{
            this.categoria="Inválido";
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    
}
