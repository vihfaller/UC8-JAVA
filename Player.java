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
public class Player {
    private String name;
    
    public Player(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        this.name = scanner.nextLine();
    }
    
    public String getName(){
        return name;
    }
    
    
}

  