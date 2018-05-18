
/**
 * Classe abstrata Usuario - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Usuario
{
   private String nome;
    
    public abstract String getFiltro();

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
