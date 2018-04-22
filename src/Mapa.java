import java.util.ArrayList;

/**
 * Aqui é criada a classe Mapa
 */
public class Mapa {
    /**
     * Aqui é criado o construtor Mapa, que retorna o mapa
     */
    public Mapa(){
        refazMapa();
        setContaCaminhaoMorre(contaCaminhaoMorre);
        setContaCarroMorre(contaCarroMorre);
        setContaMotinhaMorre(contaMotinhaMorre);
    }

    public void refazMapa(){///<A função refazMapa tem como objetivo, resetar o mapa ao que era inicialmente.
        mapa = new int[][]
                {
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                        {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                };
    }

    private int mapaInicial[][]=///<Mapa 60x60 que será usado como base para toda vez que ocorrer uma batida substituir a posição XY do veículo que foi destruído pela original.
            {
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
                    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            };

    private int mapa[][];///<Mapa 60x60 onde serão inseridos os veículos.
    private int contaCarroMorre = 0;
    private int contaMotinhaMorre = 0;
    private int contaCaminhaoMorre = 0;
    /**
     * A função colocaMapa recebe como parâmetro tem como objetivo realizar a inserção dos veículos no mapa e enquanto isso, realiza a verificação para saber se não ocorreu nenhuma batida e caso tenha ocorrido, realiza a destruição dos veículos, esse método realiza a verificação para saber se o veículo entrou em uma indústria e caso o tenha feito, realiza a sua duplicação.
     * @param motinhas Array de motocicletas.
     * @param carros Array de carros.
     * @param caminhoes Array de caminhões.
     */
    public void colocaMapa(ArrayList<Motocicleta> motinhas, ArrayList<Carro> carros, ArrayList<Caminhao> caminhoes){
        int xAtual,yAtual;///<Variavéis que guardam as posições X e Y no mapa.
        /**
         * Esse FOR percorre todos as motocicletas, pois ele vai desde a posição 0 até o tamanho real do Array de Motocicleta(motinhas).
         */
        for (int i = 0; i < motinhas.size(); i++) {
            xAtual = motinhas.get(i).getposX();///<a variável recebe a posição X da Motocicleta na posição i do Array de Motocicleta(motinhas).
            yAtual = motinhas.get(i).getposY();///<A variável recebe a posição Y da Motocicleta na posição i do Array de Motocicleta(motinhas).
            /**
             * Esse IF verifica se a posição XY do mapa é igual a 0 ou 1
             */
            if (mapa[xAtual][yAtual] == 0 || mapa[xAtual][yAtual] == 1)
            {
                motinhas.get(i).industria = false;///< caso a condição acima tenha sido atendida, a variável industria da Motocicleta na posição i é false.
                mapa[xAtual][yAtual] = motinhas.get(i).cor;///<a posição XY do mapa é preenchida pela motocicleta.
            }
            /**
             * Esse Else If verifica se a posição XY do mapa é igual a 2
             */
            else if (mapa[xAtual][yAtual] == 2)
            {
                /**
                 * Esse If verifica se a variável industria da motocicleta na posição i é false
                 */
                if (!motinhas.get(i).industria)
                {
                    motinhas.add(new Motocicleta());///<Adiciona uma motocicleta no Array de Motocicletas motinhas.
                    motinhas.get(i).industria = true;///<A variável indústria da motocicleta na posição i é igual a true, pois a mesma acabou de passar pela indústria.
                }
                mapa[xAtual][yAtual] = motinhas.get(i).cor;///<A posição XY no mapa é preechido pela motocicleta.
            }
            /**
             * Esse Else If verifica se a posição XY do mapa  é igual a 3
             */
            else if (mapa[xAtual][yAtual] == 3)
            {
                /**
                 * Esse FOR percorre desde a posição 0 até a posião atual de i
                 */
                for (int j = 0; j < i; j++)
                {
                    /**
                     * Esse if verificar se as posições X e Y das motocicletas nas posições i e J são iguais.
                     */
                    if (motinhas.get(j).getposX() == xAtual && motinhas.get(j).getposY() == yAtual)
                    {
                        motinhas.remove(j);///<remove a motocicleta na posição j.
                        break;///<sai do laço.
                    }
                }
                i--;
                motinhas.remove(i);///remove a motocicleta na posição i.
                contaMotinhaMorre += 2;
                i--;

                mapa[xAtual][yAtual] = mapaInicial[xAtual][yAtual];///<como as motocicletas foram destruidas é necessário que os XY do mapa voltem a sua forma original, por isso é igualada as posições XY do mapa com as posições XY do mapaInicial.
            }
        }

        for (int i = 0; i < carros.size(); i++) {
            xAtual = carros.get(i).getposX();///<a variável recebe a posição X da Motocicleta na posição i do Array de Motocicleta(motinhas).
            yAtual = carros.get(i).getposY();

            if (mapa[xAtual][yAtual] == 0 || mapa[xAtual][yAtual] == 1)
            {
                carros.get(i).industria = false;
                mapa[xAtual][yAtual] = carros.get(i).cor;
            }
            else if (mapa[xAtual][yAtual] == 2)
            {
                if (!carros.get(i).industria)
                {
                    carros.add(new Carro());
                    carros.get(i).industria = true;
                }
                mapa[xAtual][yAtual] = carros.get(i).cor;
            }

            else if (mapa[xAtual][yAtual] == 3)
            {
                carros.get(i).industria = false;

                for (int j = 0; j < motinhas.size(); j++)
                {
                    if (motinhas.get(j).getposX() == xAtual && motinhas.get(j).getposY() == yAtual)
                    {
                        motinhas.remove(j);
                        contaMotinhaMorre++;
                        break;
                    }
                }
                mapa[xAtual][yAtual] = carros.get(i).cor;
            }
            else if (mapa[xAtual][yAtual] == 4)
            {
                for (int j = 0; j < i; j++)
                {
                    if (carros.get(j).getposX() == xAtual && carros.get(j).getposY() == yAtual)
                    {
                        carros.remove(j);
                        break;
                    }
                }
                i--;
                carros.remove(i);
                i--;
                contaCarroMorre +=2 ;
                mapa[xAtual][yAtual] = mapaInicial[xAtual][yAtual];
            }
        }

        for (int i = 0; i < caminhoes.size(); i++) {
            xAtual = caminhoes.get(i).getposX();
            yAtual = caminhoes.get(i).getposY();

            if (mapa[xAtual][yAtual] == 0 || mapa[xAtual][yAtual] == 1)
            {
                caminhoes.get(i).industria = false;
                mapa[xAtual][yAtual] = caminhoes.get(i).cor;
            }
            else if (mapa[xAtual][yAtual] == 2)
            {
                if (!caminhoes.get(i).industria)
                {
                    caminhoes.add(new Caminhao());
                    caminhoes.get(i).industria = true;
                }
                mapa[xAtual][yAtual] = caminhoes.get(i).cor;
            }
            else if (mapa[xAtual][yAtual] == 3)
            {
                caminhoes.get(i).industria = false;

                for (int j = 0; j < motinhas.size(); j++)
                {
                    if (motinhas.get(j).getposX() == xAtual && motinhas.get(j).getposY() == yAtual)
                    {
                        motinhas.remove(j);
                        contaMotinhaMorre++;
                        break;
                    }
                }
                mapa[xAtual][yAtual] = caminhoes.get(i).cor;
            }
            else if (mapa[xAtual][yAtual] == 4)
            {
                caminhoes.get(i).industria = false;

                for (int j = 0; j < carros.size(); j++)
                {
                    if (carros.get(j).getposX() == xAtual && carros.get(j).getposY() == yAtual)
                    {
                        carros.remove(j);
                        contaCarroMorre++;
                        break;
                    }
                }
                mapa[xAtual][yAtual] = caminhoes.get(i).cor;
            }
            else if (mapa[xAtual][yAtual] == 5)
            {
                caminhoes.get(i).industria = false;

                for (int j = 0; j < i; j++)
                {
                    if (caminhoes.get(j).getposX() == xAtual && caminhoes.get(j).getposY() == yAtual)
                    {
                        caminhoes.remove(j);
                        break;
                    }
                }
                i--;
                caminhoes.remove(i);
                i--;
                contaCaminhaoMorre += 2;
                mapa[xAtual][yAtual] = mapaInicial[xAtual][yAtual];

            }
        }
    }

    public void setContaCarroMorre(int contaCarroMorre){
        this.contaCarroMorre = contaCarroMorre;
    }

    public void setContaMotinhaMorre(int contaMotinhaMorre){
        this.contaMotinhaMorre = contaMotinhaMorre;
    }

    public void setContaCaminhaoMorre(int contaCaminhaoMorre){
        this.contaCaminhaoMorre = contaCaminhaoMorre;
    }

    public int getContaCarroMorre(){
        return contaCarroMorre;
    }

    public int getContaMotinhaMorre(){
        return contaMotinhaMorre;
    }

    public int getContaCaminhaoMorre(){
        return contaCaminhaoMorre;
    }

    public void impressaoMundo() {
        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                if (mapa[i][j] == 0) {
                    System.out.print("  "); // Pinta de preto
                } else if (mapa[i][j] == 1) {
                    System.out.print("\033[40;7;37m  \033[0m"); // Pinta de cinza claro
                } else if (mapa[i][j] == 2) {
                    System.out.print("\033[40;7;35m  \033[0m"); // Pinta de magenta
                } else if (mapa[i][j] == 3) {
                    System.out.print("\033[40;7;31m  \033[0m"); // Pinta de vermelho
                } else if (mapa[i][j] == 4) {
                    System.out.print("\033[40;7;32m  \033[0m"); // Pinta de verde
                } else if (mapa[i][j] == 5) {
                    System.out.print("\033[40;7;34m  \033[0m"); // Pinta de azul
                }
            }
            System.out.println();
        }
    }


}
