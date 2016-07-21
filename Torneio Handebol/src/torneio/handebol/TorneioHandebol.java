package torneio.handebol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import modelo.Time;

public class TorneioHandebol {

    public static void main(String[] args) {
        List<Time> listaTimes = new ArrayList();
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o nome dos 12 times que disputarão o torneio.");
        for (int i = 1; i <= 12; i++) {
            System.out.println("Time " + i + ": ");
            listaTimes.add(new Time(ler.nextLine()));
        }

        realizarJogos(listaTimes);  //Realizando os jogos entre os times
        Collections.sort(listaTimes); //Ordenando a lista de times (tabela)

        System.out.print("Qual relatorio deseja exibir? ->[1~3]<- pressione 0 para sair: ");
        int opcao = ler.nextInt();
        Time t;
        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    System.out.println("Times                   V    E    D   GM   GS  Pontos");
                    for (int i = 0; i < 3; i++) {
                        t = listaTimes.get(i);
                        System.out.printf("%-15s %9d %4d %4d %4d %4d %5d\n",t.getNome(), t.getVitorias(), t.getEmpates(), t.getDerrotas(),
                                t.getGolsMarcados(), t.getGolsSofridos(), t.getPontos());
                    }
                    break;
                case 2:
                    System.out.println("Times                   V    E    D   GM   GS  Pontos");
                    for (int i = listaTimes.size() - 3; i < listaTimes.size(); i++) {
                        t = listaTimes.get(i);
                        System.out.printf("%-15s %9d %4d %4d %4d %4d %5d\n", t.getNome(), t.getVitorias(), t.getEmpates(), t.getDerrotas(),
                                t.getGolsMarcados(), t.getGolsSofridos(), t.getPontos());
                    }
                    break;
                case 3:
                    System.out.println("Times                   V    E    D   GM   GS  Pontos");
                    for (int i = 0; i < listaTimes.size(); i++) {
                        t = listaTimes.get(i);
                        System.out.printf("%-15s %9d %4d %4d %4d %4d %5d\n", t.getNome(), t.getVitorias(), t.getEmpates(), t.getDerrotas(),
                                t.getGolsMarcados(), t.getGolsSofridos(), t.getPontos());
                    }
            }
            System.out.print("Qual relatorio deseja exibir? ->[1~3]<- pressione 0 para sair: ");
            opcao = ler.nextInt();

        }
    }

    public static void realizarJogos(List<Time> listaTimes) {
        for (int i = 0; i < listaTimes.size(); i++) {
            for (int j = i + 1; j < listaTimes.size(); j++) {
                listaTimes.get(i).jogar(listaTimes.get(j));
            }
        }
    }
}
