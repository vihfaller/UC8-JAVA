/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

import java.util.Scanner;

/**
 *
 * @author VITORIAFALLERBIER
 */
public class Game {
    private int number; //de 1 a 3 aleatorio
    private Player user;
    private ValidateRps validaterps;
    private Scanner scanner;
    
    public Game(){
        this.number = (int) (Math.random()* 3)+1;
        this.user = new Player();
        this.validaterps = new ValidateRps();
        this.scanner = new Scanner (System.in);
    
        
        
    public void start() {//Logica do jogo sera adicionada aqui
        System.out.println("Welcome to rock, paper and scissors" + user.getName() + "!");
        boolean hasWon = false; // Esta variavel verifica se o jogador venceu. Se sim, ela para o loop
        
        while(hasWon == false){
            System.out.print ("Which option do you choose? ");
                    int guess = scanner.nextInt();
                    hasWon = RpsGame.validateRps(guess, RpsGame);
        }
        
        System.out.println ("Good " + user.getName() + "! you beat the machine!");
    }
}
}
