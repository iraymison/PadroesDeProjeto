import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
/**
 * Quadrilatero implementa a interface, mas irá imprimir um
 * quadrilater.
 * 
* @author Raymison Asthon Maklouf Ramos 
 * @version 1.0
 */
public class Quadrilatero implements FormaIF
{
    public void desenhar(){
           ImageIcon imagem = new ImageIcon("quadrilatero.jpg");
           JOptionPane.showMessageDialog(null,"","Quadrilatero", JOptionPane.INFORMATION_MESSAGE,imagem);
    }
}
