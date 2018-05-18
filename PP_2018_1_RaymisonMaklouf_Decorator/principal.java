
/**
 * Escreva a descrição da classe principal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class principal
{
    public static void main(String args[]){
        // instanciação do usuario 1
        Usuario raymison = new Raymison();
        // informações antes de usar o filtro
        retornaInformacoes(raymison);
        // usando o filtro
        raymison = new Clarendon(raymison);
        //raymison = new Moon(raymison);
        //raymison = new Gingham(raymison);
        //informações após usar o filtro
        retornaInformacoes(raymison);
        // instanciação do usuario 2
         Usuario larissa = new Larissa();
        // informações antes de usar o filtro
        retornaInformacoes(larissa);
        // usando o filtro
        larissa = new Lark(larissa);
        //larissa = new Reyes(larissa);
        //informações após usar o filtro
        retornaInformacoes(larissa);
    }
    public static void retornaInformacoes(Usuario usuario){
        System.out.println("Nome: "+usuario.getNome()+
                "\nFiltro: "+usuario.getFiltro());
        System.out.println("****************************");
    }
}
