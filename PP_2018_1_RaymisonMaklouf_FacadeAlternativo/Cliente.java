
/**
 * Decidir qual objeto que quero criar, posso ficar criando formas
 * diferentes a todo momento, nessa classe não há necessidade de
 * instanciar nenhuma classe que quero desenhar, pois isso fica
 * dentro da classe "CriandoForma", ela é que vai gerenciar os 
 * objetos que serão criados
 * 
 * @author Raymison Asthon Maklouf Ramos 
 * @version 1.0
 */
public class Cliente
{
    public static void main(String []args){
        
        CriandoForma criarForma = new CriandoForma();
           criarForma.criarHexagono();
           criarForma.criarQuadrilatero();
    }
}
