/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operadoresunarios;

/**
 *
 * @author Francisco
 */
public class OperadoresUnarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Differece between prefixed incrementing and postfixed incrementing 
        
        int n1 = 10;
        int n2 = 5;
        System.out.println("Diferença entre pré-incremento e pós-incremento");
        System.out.printf("Pós-incremento (n1 + n2++): ");
        float m1 = n1+ n2++; //The result is 15
        System.out.println(m1);
        n2 = 5;
        System.out.printf("Pré-incremento (n1 + ++n2): ");
        float m2 = n1+ ++n2; //The result is 16
        System.out.println(m2);
        /* The same is true with --:
        * int n1 = 10;
        * int n2 = 5;
        * float m1 = n1+ n2--; // Returns 15.0
        * System.out.println(m1);
        * n2 = 5;
        * float m2 = n1+ --n2; // Returns 14.0
        * System.out.println(m2);
        */
    }
    
}
