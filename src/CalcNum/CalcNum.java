/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalcNum;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CalcNum {
    public static void main(String[] args) {
        
        Scanner  m = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n = m.nextDouble();
        double num = n+(n*(20.0/100.0));
        System.out.println("O valor exebido será " + num);
        System.out.println("Digite outro número: ");
        double n2= m.nextDouble();
        double num2 = n2/num ;
        System.out.println("O valor exebido será: " + num2);
    }
    
}
