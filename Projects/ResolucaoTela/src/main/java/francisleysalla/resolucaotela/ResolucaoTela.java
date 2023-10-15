/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package francisleysalla.resolucaotela;
import java.awt.*;
/**
 *
 * @author Francisco
 */
public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
        
        System.out.println("O tamanho da tela do sistema é " 
                + (int)size.getWidth()+ " por " 
                + (int)size.getHeight());
    }
}
