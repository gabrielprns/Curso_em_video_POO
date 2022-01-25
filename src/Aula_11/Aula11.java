/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_11;

/**
 *
 * @author Usuario
 */
public class Aula11 {
    public static void main(String[] args) {
        Bolsista aluno = new Bolsista();
        
        aluno.setNome("Gabriel");
        aluno.setMatricula(11112);
        aluno.setCurso("Informática");
        aluno.setBolsa(12.5f);
        aluno.pagarMensalidade();
        System.out.println(aluno.status());
        System.out.println(aluno.statusPessoa());
    }
    
}
