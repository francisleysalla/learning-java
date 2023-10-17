/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package francisleysalla.tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Francisley Salla
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("O nome do aluno é: ");
        String nome = input.nextLine();
        System.out.print("A nota do aluno é: ");
        float nota = input.nextFloat();
        System.out.printf("A nota de %s é %.2f \n",nome,nota);
//      System.out.format("A nota de %s é %.2f \n",nome,nota);
    }
}
