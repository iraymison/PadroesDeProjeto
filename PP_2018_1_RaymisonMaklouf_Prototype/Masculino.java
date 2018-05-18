
/**
 * Escreva a descrição da classe IdGenero aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Masculino extends Genero
{
    protected Masculino(Masculino idGenero){
        this.sexoBiologico = idGenero.getSexoBiologico();
        
    }
    
    public Masculino(){
        sexoBiologico="masculino";
    }
    
    public String exibirInfo(){
        return "\nSexo biológico (homem): "+getSexoBiologico();
    }
    
    public Genero clonar(){
        return new Masculino(this);
    }
}
