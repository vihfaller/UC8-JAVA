/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

/**
 *
 * @author VITORIAFALLERBIER
 */
public class ValidateRps {
    //1 pedra, 2 tesoura, 3 papel
    
    public String escolha(int number) {
        switch(number) {
            case 1: 
                return "Draw, new move!"
                        
                        case 2:
                            return "you won, YOOOO"
                                    
                                    case 3:
                                        return "you "
        }
        
    }
}
    
    
    
    
    // public boolean validateGuess(int guess, int numberToGuess){
    //    if(guess > numberToGuess){ //se (palpite for maior que o numero correto)
    //        System.out.println("Seu palpite é muito alto!");
    //        return false;
    //    } else if (guess < numberToGuess){ //se (palpite for menor que o numero correto)
    //        System.out.println("Seu palpite é muito baixo!");
    //        return false;
    //    } else {
    //        return true; // se nao, correto!
    //  }
    // }

}
