/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneio.handebol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Time;

/**
 *
 * @author yosh
 */
public class TorneioHandebol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Time> listaTimes = new ArrayList();
        Scanner ler = new Scanner(System.in);
        
        
        System.out.println("Digite o nome dos 12 times que disputarão o torneio.");
        for(int i = 1; i <= 12; i++){
            System.out.println("Time " + i + ": ");
            listaTimes.add(new Time(ler.nextLine()));
        }
    }
    private void realizarJogos(List<Time> listaTimes){
        
    }
}
