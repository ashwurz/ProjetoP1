import java.util.Random;
/**
 * Aqui é o inicio da classe Veiculo
 */
public class Veiculos {

    public Random numAleatorio = new Random();///< Um objeto que tem como função gerar um número aleatório, para que com esse número aleatório seja definido o movimento dque o veículo vai realizar.
    ///<
    /**
     * Aqui é criado o construtor Veiculos, que tem como parâmetros a cor e a velocidade
     */
    public Veiculos(int cor, int velocidade)
    {
        setIndustria(true);
        setVelocidade(velocidade);
        setCor(cor);
        setposX(numAleatorio.nextInt(30));
        setposY(numAleatorio.nextInt(30));
    }

    public void setVelocidade(int velocidade) {///< Função que define a velocidade do veiculo, é passa um valor int como parâmetro.
        this.velocidade = velocidade;          ///<
    }

    public void setCor(int cor) {///<Função que define a cor de veiculo, é passado um valor em int como parâmetro para representar a cor.
        this.cor = cor;         ///<
    }

    public void setposX(int posx) {///<Função que define a posição inicial X do veículo, a posição X do veículo é definida de forma aleatóia, através do objeto numAleatorio.
        this.posx = posx;         ///<
    }

    public void setposY(int posy) {///<Função que define a posição inicial Y do veículo, a posição Y do veículo é definida de forma aleatóia, através do objeto numAleatorio.
        this.posy = posy;         ///<
    }

    public void setIndustria(boolean industria) {///< Função que define a partir de um valor Boolean se um objeto criado a partir de veículo pode se clonar quando passar por uma indústria.
        this.industria = industria;             ///<
    }                                           ///<

    public int getVelocidade() {///<Função que retorna o valor da velocidade do veículo.
        return velocidade;     ///<
    }                           ///<

    public int getposX() {///< Função que retorna o valor da posição inicial X.
        return posx;     ///<
    }                   ///<

    public int getposY() {///< Função que retorna o valor da posição inicial Y.
        return posy;     ///<
    }                   ///<

    public int getCor() {///<Função que retorna o valor que corresponde a cor do veiculo.
        return cor;     ///<
    }                   ///<

    /**
    /A função acao é do tipo void e define o movimento do veículo baseado em um número aleatório que é gerado a partir do objeto numAleatorio
     */
    public void acao(){
        int move = numAleatorio.nextInt(4);///<A variável move é do tipo int e vai ser usada para definir o movimento do veículo, pois a mesma recebe um número aleatório que é gerado entre 0 e 3.
        ///<
        if (move == 0){///< Condição que define o movimento para cima.
            posy -= getVelocidade();///<caso a variável move seja igual a 0, a posição y é setada como a atual menos a sua velocidade, o que faz com que o movimento seja para cima.
            if (posy < 0){///<Condição que verifica se a posição Y é inferior a 0.
                posy += 30; ///<caso a condição acima tenha sido atendida, é adicionado em 30 para que o veículo surja do lado oposto.
            }                   ///<
            else if (posy > 29){///<Condição que verifica se a posição Y é superior a 29.
                posy -= 30;///<caso a condição acima tenha sido atendida, é subtraido em 30 para que o veículo surja do lado oposto.
            }                   ///<
        }                           ///<
        else if (move == 1){///<Condição que define o movimento para baixo.
            posy += getVelocidade();///<Caso a variável move seja igual a 1, a posição y é setada como a atual mais a sua velocidade, o que faz com que o seu movimento seja para baixo.
            if (posy < 0){///<Condição que verifica se a posição Y é inferior a 0.
                posy += 30; ///<caso a condição acima tenha sido atendida, é adicionado em 30 para que o veículo surja do lado oposto.
            }                   ///<
            else if (posy > 29){///<Condição que verifica se a posição Y é superior a 29.
                posy -= 30;///<caso a condição acima tenha sido atendida, é subtraido em 30 para que o veículo surja do lado oposto.
            }                   ///<
        }                       ///<
        else if (move == 2){///<Condição que define o movimento do veículo para a direita.
            posx += getVelocidade();///<Caso a variável move seja igual a 2, a posição x é setada como a atual mais sua velocidade, o que faz com que o movimento seja para a direita.
            if (posx < 0){///<Condição que verifica se a posição X é inferior a 0.
                posx += 30;///< caso a condição acima tenha sido atendida, é adicionado 30 para que o veículo surja do lado oposto.
            }               ///<
            else if (posx > 29){///<Condição que verifica se a posição X é superior a 29.
                posx -= 30;///<caso a condição acima tenha sido atendiada, é subtraido em 30 para que o veículo surja do lado oposto.
            }                       ///<
        }                           ///<
        else if (move == 3){///<Condição que define o movimento do veículo para a esquerda.
            posx -= getVelocidade();///<Caso a variável move seja igual a 3, a posição x é setada como a atual menos a sua velocidade, o que faz com que o movimento seja para a esquerda.
            if (posx < 0){///<Condição que verifica se a posição X é inferior a 0.
                posx += 30;///<Caso a condição acima tenha sido atendida,é adicionado 30 para que o veículo surja do lado oposto.
            }               ///<
            else if (posx > 29){///<Condição que verifica se a posição X é superior a 29.
                posx -= 30;     ///<caso a condição acima tenha sido atendiada, é subtraido em 30 para que o veículo surja do lado oposto.
            }                   ///<
        }                       ///<

    }

    protected int posx;///<Variável que guarda a posição X do veículo.
    ///<
    protected int posy;///<Variável que guarda a posição Y do veículo.
    ///<
    protected int velocidade;///<Variável que guarda a velocidade do veículo.
    ///<
    protected int cor;///<Variável que guarda o valor em int que representa a cor do carro.
    ///<
    protected boolean industria;///<Variável que guarda o valor em Boolean que mostra se o veículo já passou pela indústria ou não.
    ///<
}

