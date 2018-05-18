
/**
 * Escreva a descrição da classe Gingham aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Gingham extends UsuarioFiltro
{
    public Gingham(Usuario usuario) {
        super(usuario);
    }

    @Override
    public String getFiltro() {
        return "Gingham" + this.getUsuario().getFiltro();
    }
}
