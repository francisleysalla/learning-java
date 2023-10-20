/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package francisleysalla.condicionalsimples;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class CondicionalSimples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite as suas notas:");
        float nota1 = in.nextFloat();
        float nota2 = in.nextFloat();
        float media = (nota1+nota2)/2;
        System.out.println("Sua média foi: " + media);
        if (media > 9){
            System.out.println("Parabéns, pequeno gafanhoto.");
        }
        
    }
}
