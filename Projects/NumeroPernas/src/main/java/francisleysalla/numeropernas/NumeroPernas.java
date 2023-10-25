/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package francisleysalla.numeropernas;

import java.util.Scanner;

/**
 *
 * @author Francisco
 */
public class NumeroPernas {

    public static void main(String[] args) {
        String tipo;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Digite quantas pernas a criatura tem: ");
        int legs = keyboard.nextInt();
    //Maneira normal de utilizar um switch:
        /*
            switch (legs){
            case 1:
                tipo = " Saci";
                break;
            case 2:
                tipo = " Bípede";
                break;
            case 4:
                tipo = " Quadrúpede";
                break;
            case 6,8:
                tipo = "a Aranha";
                break;
            default:
                tipo = " ET";
        }
        */
    //Using a switch to attribute values to a variable:
    tipo = switch (legs){
        case 1 -> " Saci";
        case 2 -> " Bípede";
        case 4 -> " Quadrúpede";
        case 6,8 -> "a Aranha";
        default -> " ET";
    };
        System.out.println("A criatura é um"+tipo);
    }
}
