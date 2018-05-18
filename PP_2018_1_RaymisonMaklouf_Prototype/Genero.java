
/**
 * Classe abstrata Genero - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Genero
{
    protected String sexoBiologico;
    
    
    public abstract String exibirInfo();
    
    public abstract Genero clonar();
    
    /**
     * @return the sexoBiologico
     */
    public String getSexoBiologico() {
        return sexoBiologico;
    }

    /**
     * @param sexoBiologico the sexoBiologico to set
     */
    public void setSexoBiologico(String sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }

}
