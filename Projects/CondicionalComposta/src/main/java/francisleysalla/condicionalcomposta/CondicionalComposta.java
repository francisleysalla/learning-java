/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package francisleysalla.condicionalcomposta;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class CondicionalComposta {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Qual é o seu ano de nascimento?");
        int year = keyboard.nextInt();
        int age = 2023 - year;
        String out = "Sua idade é " + age + " anos, portanto";
        if (age >= 18){
            out += " você é de maior";
        }else{
            out += " você é de menor";
        }
        System.out.println(out);
    }
}
