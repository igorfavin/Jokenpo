/*
 * Author: Igor Stinieski Favin
 * 04/04/2020
 * Email: igorstinieskifavin@gmail.com
 * Objetivo: Fazer um juiz de Jokenpo que dada a jogada dos dois jogadores informa o resultado da partida.
 */


package jokenpo;

import java.util.Scanner;

public class Jokenpo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String v1, v2;
        
        //Menu com as opções
        System.out.println("-----------JOKENPO-----------");
        System.out.println("Considere as seguintes opções:");
        System.out.println("Pedra = 1");
        System.out.println("Papel = 2");
        System.out.println("Tesoura = 3");
        System.out.println("-----------------------------");
        //Aqui inicia-se a entrada de dados por parte do player 1
        System.out.print("Player 1: ");
        try{
            v1 = entrada.nextLine();
            //Regex basico para validar as entradas do player 1
            if (v1.matches("^[1-3]")){
                try{
                    //Entrada de dados por parte do player 2
                    System.out.print("Player2: ");
                    v2 = entrada.nextLine();
                    //Regex basico para validar as entradas do player 2
                    if(v2.matches("^[1-3]")){
                        switch(v1){
                        case "1":
                            switch(v2){
                                case "1":
                                    System.out.println("Empate!");
                                    break;
                                case "2":
                                    System.out.println("Player 2 WINS!");
                                    break;
                                case "3":
                                    System.out.println("Player 1 WINS!");
                                    break;
                            }
                            break;
                        case "2":
                            switch(v2){
                                case "1":
                                    System.out.println("Player 1 WINS!");
                                    break;
                                case "2":
                                    System.out.println("Empate!");
                                    break;
                                case "3":
                                    System.out.println("Player 2 WINS!");
                                    break;
                            }
                            break;
                        case "3":
                            switch(v2){
                                case "1":
                                    System.out.println("Player 2 WINS!");
                                    break;
                                case "2":
                                    System.out.println("Player 1 WINS!");
                                    break;
                                case "3":
                                    System.out.println("Empate!");
                                    break;
                            }
                            break;
                        }
                    }
                }
                catch(Exception e){
                    System.out.println("Player 2 entrada inválida!");
                }
            }
            else{
                System.out.println("Player 1 entrada inválida!");
            }
        }
        catch(Exception e){
            System.out.println("Player 1 entrada inválida!");
        }
    }
}
