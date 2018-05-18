
/**
 * Escreva a descrição da classe UsuarioFiltro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public abstract class UsuarioFiltro extends Usuario
{
    private Usuario usuario;
    
    public UsuarioFiltro(Usuario usuario){
        this.usuario=usuario;
        this.setNome(usuario.getNome());
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }
}
