
/**
 * A classe CriandoForma conterá dois atributos privados, eles
 * serão do tipo da interface, terei um construtor que vai
 * instanciar um objeto da sua respectiva classe, meus atributos
 * serão instanciados de acordo com as minhas formas possíveis
 * de serem criadas.
 * 
 * @author Raymison Asthon Maklouf Ramos 
 * @version 1.0
 */
public class CriandoForma
{
    private FormaIF hexagono;
    private FormaIF quadrilatero;
    
    public CriandoForma(){
        hexagono = new Hexagono();
        quadrilatero = new Quadrilatero();
        
    }
    // chama o método desenhar do hexagono
    public void criarHexagono(){
        hexagono.desenhar();
        
    }
    // chama o método desenhar do quadrilatero
    public void criarQuadrilatero(){
        quadrilatero.desenhar();
        
    }
    
}
