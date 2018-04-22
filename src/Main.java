import java.util.ArrayList;

/**
 * A classe Main é onde tudo é executado.
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList <Motocicleta> motinhas = new ArrayList<>();///É criado o arrayList de motocicletas.
        ArrayList <Carro> carros = new ArrayList<>();///É criado o arrayList de carros.
        ArrayList <Caminhao> caminhoes = new ArrayList<>();///É criado o arrayList de caminhões.
        Mapa mapa = new Mapa();///É criado um objeto mapa.
        /**
         * Esse FOR percorre de 0 até 10.
         */
        for(int i = 0; i < 10; i++){
            motinhas.add(new Motocicleta());///É adicionado um objeto Motocicleta no arrayList de motocicletas.
            carros.add(new Carro());///É adicionado um objeto Carro no arrayList de carros.
            caminhoes.add(new Caminhao());///É adicionado um objeto Caminhao no arrayList de caminhões.
        }
        /**
         * Esse WHILE é executado enquanto o arrayList de caminhões OU o arrayList de motocicletas OU o arrayList de carros NÃO estiverem vazios.
         */
        while (!caminhoes.isEmpty() || !motinhas.isEmpty() || !carros.isEmpty())
        {
            mapa.refazMapa();///Chama a função refazMapa.
            /**
             * Esse FOR percorre todas as motocicletas contidas no array de motocicletas.
             */
            for (int i = 0; i < motinhas.size(); i ++)
            {
                motinhas.get(i).acao();///Chama a função acao da motocicleta na posição i do arrayList de motocicletas.
            }
            /**
             * Esse FOR percorre todos os carros contidos no arrayList de carros.
             */
            for (int i = 0; i < carros.size(); i ++)
            {
                carros.get(i).acao();///Chama a função acao do carro na posição i do arrayList de carros.
            }
            /**
             * Esse FOR percorre todos os caminhões contidos no arrayList de caminhões.
             */
            for (int i = 0; i < caminhoes.size(); i ++)
            {
                caminhoes.get(i).acao();///Chama a função acao do caminhão na posição i do arrayList de caminhões.
            }

            mapa.colocaMapa(motinhas, carros, caminhoes);///Chama a função colocaMapa e é passado como parâmetro os arraysLists de carros, caminhoes e motinhas.

            System.out.println("======================================================================");
            System.out.print("\033[40;7;31m  \033[0m Motocicletas vivas:" + motinhas.size() + "    ");///Impressão do contador de motocicletas "vivas".
            System.out.print("\033[40;7;32m  \033[0m Carros vivos:" + carros.size() + "    ");///Impressão do contador de carros "vivos".
            System.out.print("\033[40;7;34m  \033[0m Caminhoes vivos:" + caminhoes.size() + "    ");///Impressão do contador de caminhões "vivos"
            System.out.println();

            mapa.impressaoMundo();///Chama a função impressaoMundo, que realiza a impressão do Mapa

            System.out.print("\033[40;7;31m  \033[0m Motocicletas mortas:" + mapa.getContaMotinhaMorre() + "    ");///Impressão do contador de motocicletas destruídas.
            System.out.print("\033[40;7;32m  \033[0m Carros mortos:" + mapa.getContaCarroMorre() + "    ");///Impressão do contador de carros destruídos.
            System.out.print("\033[40;7;34m  \033[0m Caminhoes mortos:" + mapa.getContaCaminhaoMorre() + "    ");///Impressão do contador de caminhões destruídos.
            System.out.println();
            /**
             * Função que da um "delay" no loop WHILE.
             */
            try {
                Thread.sleep(333);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("Morreu todo mundo!!! :*( ");

    }
}