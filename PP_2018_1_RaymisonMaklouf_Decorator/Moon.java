
/**
 * Escreva a descrição da classe Moon aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Moon extends UsuarioFiltro
{
    public Moon(Usuario usuario) {
        super(usuario);
    }

    @Override
    public String getFiltro() {
        return "Moon" + this.getUsuario().getFiltro();
    }
}
