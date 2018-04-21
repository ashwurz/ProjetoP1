/**
 *Aqui é criada a classe Carro que é herdada da classe Veiculos
 */
public class Carro extends Veiculos{
    /**
     * Aqui é criado o construtor Carro
     */
    public Carro() {
        super(4,2);///<Aqui é passado como parâmetros para o construtor que herda de Veiculos o número 4 (que representa a sua cor) e o número 2 (que representa a sua velocidade).
        ///<
    }
}