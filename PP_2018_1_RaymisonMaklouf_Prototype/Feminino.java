
/**
 * Escreva a descrição da classe Feminino aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Feminino extends Genero
{
    protected Feminino(Feminino idGenero){
        this.sexoBiologico = idGenero.getSexoBiologico();
        
    }
    
    public Feminino(){
        sexoBiologico="feminino";
    }
    
    public String exibirInfo(){
        return "\nSexo biológico (mulher): "+getSexoBiologico();
    }
    
    public Genero clonar(){
        return new Feminino(this);
    }
}
