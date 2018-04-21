/**
 *Aqui é criada a classe Motocicleta que é herdada da classe Veiculos
 */
public class Motocicleta extends Veiculos{
    /**
     * Aqui é criado o construtor Motocicleta
     */
    public Motocicleta(){
        super(3,3);///<Aqui é passado como parâmetros para o construtor que herda de Veiculos o número 3(que representa a sua cor) e 3(que representa a velocidade da motocicleta).
        ///<
    }
}