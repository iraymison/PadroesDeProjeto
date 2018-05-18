import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 * Hexagono irá implementar a interface, mas no caso irá imprimir
 * um hexagono, claro.
 * 
* @author Raymison Asthon Maklouf Ramos 
 * @version 1.0
 */
public class Hexagono
{
    public void desenhar(){
           ImageIcon imagem = new ImageIcon("hexagono.jpg");
           JOptionPane.showMessageDialog(null,"","Hexágono", JOptionPane.INFORMATION_MESSAGE,imagem);
           
    }
}
