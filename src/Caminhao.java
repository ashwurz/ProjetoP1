/**
 * A classe Caminhao que herda de Veiculos
 */
public class Caminhao extends Veiculos{
    /**
     * Aqui é criado o construtor Caminhao
     */
    public Caminhao() {
        super(5,1);///Aqui é passado como parâmetros para o construtor Caminhao que herda de Veiculos os números 5(que representa a cor do caminhão) e 1 (que representa a sua velocidade).
    }
}