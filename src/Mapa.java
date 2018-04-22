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

    private int mapaInicial[][]=///<Mapa 30x30 que será usado como base para toda vez que ocorrer uma batida substituir a posição XY do veículo que foi destruído pela original.
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

    private int mapa[][];///<Mapa 30x30 onde serão inseridos os veículos.
    private int contaCarroMorre = 0;///<Variável que tem como objetivo fazer a contagem de carros destruídos.
    private int contaMotinhaMorre = 0;///<Variável que tem como objetivo fazer a contagem de motocicletas destruídas.
    private int contaCaminhaoMorre = 0;///<Variável que tem como objetivo fazer a contagem de caminhões destruídos
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
                i--;///<remove a contagem de um i,pois ocorreu uma batida e um motocicleta foi destruída.
                motinhas.remove(i);///remove a motocicleta na posição i.
                contaMotinhaMorre += 2;///<Faz a contagem de duas motocicletas que foram destruidas.
                i--;///<remove a contagem de um i, pois ocorreu uma batida e um motocicleta foi destruida.

                mapa[xAtual][yAtual] = mapaInicial[xAtual][yAtual];///<como as motocicletas foram destruidas é necessário que os XY do mapa voltem a sua forma original, por isso é igualada as posições XY do mapa com as posições XY do mapaInicial.
            }
        }
        /**
         * Esse for percorre todos os carros, contidos no array de carros.
         */
        for (int i = 0; i < carros.size(); i++) {
            xAtual = carros.get(i).getposX();///<a variável recebe a posição X do carro na posição i do Array de Carro(carros).
            yAtual = carros.get(i).getposY();///<A variável recebe a posição Y do carro na posição i do Array de Carro(carros).
            /**
             * Esse If verifica se a posição XY no mapa é igual a 1 ou igual a 0.
             */
            if (mapa[xAtual][yAtual] == 0 || mapa[xAtual][yAtual] == 1)
            {
                carros.get(i).industria = false;///<Seta a variável indústria do carro na posição i do array de carros igual a false.
                mapa[xAtual][yAtual] = carros.get(i).cor;///<A posição XY é preenchida pelo carro.
            }
            /**
             * Esse ELSE IF verifica se a posição XY no mapa é igual a 2.
             */
            else if (mapa[xAtual][yAtual] == 2)
            {
                /**
                 * Esse IF verifica se a variável indústria do carro na posição i do array de carros é igual a false.
                 */
                if (!carros.get(i).industria)
                {
                    carros.add(new Carro());///<Adicional mais um carro no array de carros.
                    carros.get(i).industria = true;///<Seta a variável indústria do carro na posição i do array de carros para "true".
                }
                mapa[xAtual][yAtual] = carros.get(i).cor;///<A posição XY no mapa é preenchida pelo carro.
            }
            /**
             * Esse ELSE IF verifica se a posição XY no mapa é igual a 3.
             */
            else if (mapa[xAtual][yAtual] == 3)
            {
                carros.get(i).industria = false;///<Seta a variável indústria do carro na posição i do array de carros para "false".
                /**
                 * Esse for percorre todas as motocicletas contidas no array de motocicletas.
                 */
                for (int j = 0; j < motinhas.size(); j++)
                {
                    /**
                     * Verifica se a posição XY da motocicleta na posiçaõ j do array de motocicletas é igual a posição XY do carro na posição i do array de carros.
                     */
                    if (motinhas.get(j).getposX() == xAtual && motinhas.get(j).getposY() == yAtual)
                    {
                        motinhas.remove(j);///<Remove a motocicleta na posição j do array de motocicleta.
                        contaMotinhaMorre++;///<Adiciona mais um no contador de motocicletas destruídas.
                        break;///<Sai do laço.
                    }
                }
                mapa[xAtual][yAtual] = carros.get(i).cor;///<Preenche a posição XY do mapa com o carro.
            }
            /**
             * Esse ELSE IF verifica se a posição XY no mapa é igual a 4.
             */
            else if (mapa[xAtual][yAtual] == 4)
            {
                /**
                 * Esse FOR percorre todos os carros no array de carros até a posição i.
                 */
                for (int j = 0; j < i; j++)
                {
                    /**
                     * Esse IF verifica se a posição XY do carro na posição j do array de carros é igual a posição XY do carro na atual posição i no array de carros.
                     */
                    if (carros.get(j).getposX() == xAtual && carros.get(j).getposY() == yAtual)
                    {
                        carros.remove(j);///<remove o carro na posição j do array de carros.
                        break;///<sai do laço.
                    }
                }
                i--;///<remove a contagem de um i, pois um carro foi destruído.
                carros.remove(i);///<Remove o carro na posição i do array de carros.
                i--;///<remove a contagem de um i, pois um carro foi destruído.
                contaCarroMorre +=2 ;///<Adiciona mais dois no contador de carros de destruídos.
                mapa[xAtual][yAtual] = mapaInicial[xAtual][yAtual];///<Como ambos os carros foram destruídos, é necessário que que a posição XY volte a sua forma original, por isso é igualado a posição XY do mapaInicial.
            }
        }
        /**
         * Esse FOR percorre todos os caminhões contidos no array caminhoes.
         */
        for (int i = 0; i < caminhoes.size(); i++) {
            xAtual = caminhoes.get(i).getposX();///<Recebe a posição X do caminhão.
            yAtual = caminhoes.get(i).getposY();///<Recebe a posição Y do caminhão.
            /**
             * Esse IF verifica se a posição XY no mapa é igual a 0 ou 1.
             */
            if (mapa[xAtual][yAtual] == 0 || mapa[xAtual][yAtual] == 1)
            {
                caminhoes.get(i).industria = false;///<Seta a variável indústria do caminhão na posição i igual a "false".
                mapa[xAtual][yAtual] = caminhoes.get(i).cor;///<A posição XY no mapa é preenchida pelo caminhão.
            }
            /**
             * Esse ELSE IF verifica se a posição XY mo mapa é igual a 2.
             */
            else if (mapa[xAtual][yAtual] == 2)
            {
                /**
                 * Esse IF verifica se a variável indústria do caminhão na posição i do array de caminhões é "false".
                 */
                if (!caminhoes.get(i).industria)
                {
                    caminhoes.add(new Caminhao());///<Adiciona mais um caminhão no array de caminhões.
                    caminhoes.get(i).industria = true;///< Seta a variável indústria do caminhão na posição i do array de caminhões igual a "true".
                }
                mapa[xAtual][yAtual] = caminhoes.get(i).cor;///<Preenche a posição XY no mapa com o caminhão na posição i do array de caminhões.
            }
            /**
             * Esse ELSE IF verifica se a posição XY no mapa é igual a 3.
             */
            else if (mapa[xAtual][yAtual] == 3)
            {
                caminhoes.get(i).industria = false;///<Seta a variável indústria do caminhão na posição i do array de caminhões igual a "false".
                /**
                 * Esse FOR percorre todas as motocicletas contidas no array de motocicletas.
                 */
                for (int j = 0; j < motinhas.size(); j++)
                {
                    /**
                     * Esse IF verifica se a posição XY da motocicleta na posição j do array de motocicleta é igual a posição XY do caminhão na posição i do array de caminhões.
                     */
                    if (motinhas.get(j).getposX() == xAtual && motinhas.get(j).getposY() == yAtual)
                    {
                        motinhas.remove(j);///<Remove uma motocicleta na posição j do array de motocicletas.
                        contaMotinhaMorre++;///<Adiciona um no contador de motocicletas destruídas.
                        break;///<Sai do laço.
                    }
                }
                mapa[xAtual][yAtual] = caminhoes.get(i).cor;///<Preenche a posição XY do mapa com o caminhão.
            }
            /**
             * Esse ELSE IF verifica se a posição XY no mapa é igual a 4.
             */
            else if (mapa[xAtual][yAtual] == 4)
            {
                caminhoes.get(i).industria = false;///<Seta a variável indústria do caminhão na posição i do array de caminhões como "false".
                /**
                 * Esse FOR  percorre todos os carros contidos no array de carros.
                 */
                for (int j = 0; j < carros.size(); j++)
                {
                    /**
                     * Esse IF verifica se a posição XY do carro na posição j do array de carros é igual a posição XY do caminhão na posição i do array de caminhões.
                     */
                    if (carros.get(j).getposX() == xAtual && carros.get(j).getposY() == yAtual)
                    {
                        carros.remove(j);///<Remove o carro na posiçao j do array de carros.
                        contaCarroMorre++;///<Adiciona mais um no contador de carros destruídos.
                        break;///<Sai do laço.
                    }
                }
                mapa[xAtual][yAtual] = caminhoes.get(i).cor;///<Preenche a posição XY no mapa com o caminhão na posição i do array de caminhões.
            }
            /**
             * Esse ELSE IF verifica se a posição XY no mapa é igual a 5.
             */
            else if (mapa[xAtual][yAtual] == 5)
            {
                caminhoes.get(i).industria = false;///<Seta a variável indústria do caminhão na posiçãp i do array de caminhões igual a "false".
                /**
                 * Esse FOR percorre todos os caminhões no array de caminhões até a posição i.
                 */
                for (int j = 0; j < i; j++)
                {
                    /**
                     * Esse IF verifica se a posição XY do caminhão na posição i do array de caminhões é igual a posição XY do caminhão na posição j do array de caminhões.
                     */
                    if (caminhoes.get(j).getposX() == xAtual && caminhoes.get(j).getposY() == yAtual)
                    {
                        caminhoes.remove(j);///<Remove o caminhão na posição j do array de caminhões.
                        break;///<Sai do laço.
                    }
                }
                i--;///<Remove a contagem de um i, pois ocorreu uma batida e um caminhão foi destruído.
                caminhoes.remove(i);///<Remove o caminhão na posição i do array de caminhões.
                i--;///<Remove a contage de um i, pois ocorreu uma batida de um caminhão foi destruído.
                contaCaminhaoMorre += 2;///<Adiciona mais dois na contagem de caminhões destruídos.
                mapa[xAtual][yAtual] = mapaInicial[xAtual][yAtual];///<Como ocorreu uma batida entre dois caminhões e ambos foram destruídos é necessário que a posição XY retorne a sua forma original, por isso é igualado com a posição XY do mapaInicial.

            }
        }
    }

    /**
     * A função setContaCarroMorre seta o contador de carros que foram destruídos.
     * @param contaCarroMorre contator de carros destruídos.
     */
    public void setContaCarroMorre(int contaCarroMorre){
        this.contaCarroMorre = contaCarroMorre;
    }

    /**
     * A função setContaMotinhasMorre seta o contador de motocicletas que foram destruídas.
     * @param contaMotinhaMorre contador de carros destruídos.
     */
    public void setContaMotinhaMorre(int contaMotinhaMorre){
        this.contaMotinhaMorre = contaMotinhaMorre;
    }

    /**
     * A função setContaCaminhaoMorre seta o contador de caminhões que foram destruídos.
     * @param contaCaminhaoMorre contador de caminhões destruídos.
     */
    public void setContaCaminhaoMorre(int contaCaminhaoMorre){
        this.contaCaminhaoMorre = contaCaminhaoMorre;
    }

    /**
     * A função getContaCarroMorre é do tipo int e retorna o contador de carros destruiídos.
     * @return retorna o contador de carros destruídos.
     */
    public int getContaCarroMorre(){
        return contaCarroMorre;
    }

    /**
     * A função getContaMotinhasMorre é do tipo int e retorna o contator de motocicletas destruídas.
     * @return retorna o contador de motocicletas destruídas.
     */
    public int getContaMotinhaMorre(){
        return contaMotinhaMorre;
    }

    /**
     * A função getContaCarminhaoMorre é do tipo int e retorna o contador de caminhões que foram destruídos.
     * @return retorna o contador de caminhões destruídos.
     */
    public int getContaCaminhaoMorre(){
        return contaCaminhaoMorre;
    }

    /**
     * A função impressaoMundo realiza a impressão do Mapa.
     */
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
