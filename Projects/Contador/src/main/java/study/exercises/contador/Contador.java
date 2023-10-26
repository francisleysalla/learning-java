/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package study.exercises.contador;

/**
 *
 * @author Francisco
 */
public class Contador {

    public static void main(String[] args) {
        int cont = 0;
        //Learning how to use a repetition structure
        while (cont <= 100){
            cont++;
            //Stopping the current iteration
            if (cont == 4 || cont > 8 && cont < 20){
                continue;
            }
            //Stopping the entire loop
            if (cont == 90){
                break;
            }
            System.out.println(cont);
        }
    }
}
