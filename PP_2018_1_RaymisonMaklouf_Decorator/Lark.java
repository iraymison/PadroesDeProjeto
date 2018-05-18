
/**
 * Escreva a descrição da classe Lark aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Lark extends UsuarioFiltro
{
    public Lark(Usuario usuario) {
        super(usuario);
    }

    @Override
    public String getFiltro() {
        return "Lark" + this.getUsuario().getFiltro();
    }
}
