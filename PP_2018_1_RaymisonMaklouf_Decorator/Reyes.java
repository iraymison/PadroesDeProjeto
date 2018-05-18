
/**
 * Escreva a descrição da classe Reyes aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Reyes extends UsuarioFiltro
{
    public Reyes(Usuario usuario) {
        super(usuario);
    }

    @Override
    public String getFiltro() {
        return "Reyes" + this.getUsuario().getFiltro();
    }
}
