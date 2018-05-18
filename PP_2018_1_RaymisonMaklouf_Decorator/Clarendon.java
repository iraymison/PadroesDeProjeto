
/**
 * Escreva a descrição da classe Claredon aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Clarendon extends UsuarioFiltro
{
    public Clarendon(Usuario usuario) {
        super(usuario);
    }

    @Override
    public String getFiltro() {
        return "Claredon" + this.getUsuario().getFiltro();
    }
}
