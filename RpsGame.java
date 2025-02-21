/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rpsgame;

/**
 *
 * @author VITORIAFALLERBIER
 */
public class RpsGame {

    public static void main(String[] args) {
        int playAgain = 1;
        Scanner scanner = new Scanner(System.in);
        
        while (playAgain)
        Game game = new Game(); // Inicializa o jogo
        game.start(); // Inicia o jogo
        
        
        
    }
}
