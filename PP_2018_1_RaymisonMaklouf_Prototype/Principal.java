
/**
 * Escreva a descrição da classe Principal aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class Principal
{
    public static void main(String[] args) {
        Masculino prototipoMasc = new Masculino();
        Feminino prototipoFem = new Feminino();
        // trocando sexo bilógico masculino p/ feminino
        Genero genero1 = prototipoMasc.clonar();
        genero1.setSexoBiologico("Feminino");
        //exibindo seu novo sexo
        Genero genero3 = prototipoMasc.clonar();
        genero3.setSexoBiologico("indefinido");
        System.out.println(genero3.exibirInfo());
        // trocando sexo bilógico feminino p/ masculino
        Genero genero2 = prototipoFem.clonar();
        genero2.setSexoBiologico("Masculino");
        //exibindo seu novo sexo
        System.out.println(genero2.exibirInfo());
    }
}
