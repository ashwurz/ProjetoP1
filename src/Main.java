import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
//        System.out.print("\033[40;7;31m \033[0m"); // Pinta de vermelho
//        System.out.print("\033[40;7;34m \033[0m"); // Pinta de azul
//        System.out.print("\033[40;7;32m \033[0m"); // Pinta de verde
//        System.out.print("\033[40;7;30m \033[0m"); // Pinta de branco
//        System.out.print("\033[40;7;36m \033[0m"); // Pinta de verde Ã¡gua
//        System.out.print(" "); // Pinta de preto
//        System.out.print("\033[40;7;35m \033[0m"); // Pinta de magenta

        ///vai filhao
        ArrayList <Motocicleta> motinhas = new ArrayList<>();
        ArrayList <Carro> carros = new ArrayList<>();
        ArrayList <Caminhao> caminhoes = new ArrayList<>();
        Mapa mapa = new Mapa();

        for(int i = 0; i < 10; i++){
            motinhas.add(new Motocicleta());
            carros.add(new Carro());
            caminhoes.add(new Caminhao());
        }

        while (!caminhoes.isEmpty() || !motinhas.isEmpty() || !carros.isEmpty())
        {
            mapa.refazMapa();

            for (int i = 0; i < motinhas.size(); i ++)
            {
                motinhas.get(i).acao();
            }
            for (int i = 0; i < carros.size(); i ++)
            {
                carros.get(i).acao();
            }
            for (int i = 0; i < caminhoes.size(); i ++)
            {
                caminhoes.get(i).acao();
            }

            mapa.colocaMapa(motinhas, carros, caminhoes);

            System.out.println("======================================================================");
            System.out.print("\033[40;7;31m  \033[0m Motocicletas vivas:" + motinhas.size() + "    ");
            System.out.print("\033[40;7;32m  \033[0m Carros vivos:" + carros.size() + "    ");
            System.out.print("\033[40;7;34m  \033[0m Caminhoes vivos:" + caminhoes.size() + "    ");
            System.out.println("");

            mapa.impressaoMundo();

            System.out.print("\033[40;7;31m  \033[0m Motocicletas mortos:" + mapa.getContaMotinhaMorre() + "    ");
            System.out.print("\033[40;7;32m  \033[0m Carros mortos:" + mapa.getContaCarroMorre() + "    ");
            System.out.print("\033[40;7;34m  \033[0m Caminhoes mortos:" + mapa.getContaCaminhaoMorre() + "    ");
            System.out.println();
            try {
                Thread.sleep(333);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

        System.out.println("Morreu todo mundo!!! :*( ");

    }
}

