/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.culminatinggame2024;
import java.awt.Color;
import java.awt.Graphics;
/**
 *
 * @author alexas
 */

public class Levels {
   
    static boolean levelOne, levelTwo, levelThree, winner = false;

    static int borderX1 = 0, borderY1 = 0, borderWidth1 = 0, borderHeight1 = 0;
    static int borderX2 = 0, borderY2 = 0, borderWidth2 = 0, borderHeight2 = 0;
    static int borderX3 = 0, borderY3 = 0, borderWidth3 = 0, borderHeight3 = 0;
    static int borderX4 = 0, borderY4 = 0, borderWidth4 = 0, borderHeight4 = 0;
    static int endPointBorderX = 600, endPointBorderY = 0, borderW = 200, borderH = 50;
    static int endPointBorderX00 = 600, endPointBorderY00 = 0, borderW00 = 200, borderH00 = 50;
    static int endPointBorderX3 = 600, endPointBorderY3 = 0, borderW3 = 200, borderH3 = 50;
    static int playerX = 30, playerY = 500, playerWidth = 50, playerHeight = 50;
    static String msg = "";
    static int stringX = 0, stringY = 0;
    Graphics graphics;
    
    //The level layout
    Levels(Graphics g) {
        graphics = g;
        printLevel();
        levelOne();
        nextLevel();
        levelTwo();
        nextLevel();
        levelThree();
        //ending
        nextLevel();
        winningLevel();
        death();
    }
        
    public void printLevel() {
        //border one
        graphics.setColor(Color.blue);
        graphics.fillRect(borderX1, borderY1, borderWidth1, borderHeight1);
       
        //border two
        graphics.setColor(Color.blue);
        graphics.fillRect(borderX2, borderY2, borderWidth2, borderHeight2);

        //border three
        graphics.setColor(Color.blue);
        graphics.fillRect(borderX3, borderY3, borderWidth3, borderHeight3);

        //border four
        graphics.setColor(Color.blue);
        graphics.fillRect(borderX4, borderY4, borderWidth4, borderHeight4);
       
        
        graphics.setColor(Color.green);
        graphics.fillRect(endPointBorderX, endPointBorderY, borderW, borderH);

        graphics.setColor(Color.green);
        graphics.fillRect(endPointBorderX00, endPointBorderY00, borderW00, borderH00);

        graphics.setColor(Color.green);
        graphics.fillRect(endPointBorderX3, endPointBorderY3, borderW3, borderH3);

        graphics.setColor(Color.red);
        graphics.fillRect(playerX, playerY, playerWidth, playerHeight);

        graphics.drawString(msg, stringX, stringY);
        

    }

    public void levelOne() {
        borderX1 = 0;
        borderY1 = 0;
        borderWidth1 = 600;
        borderHeight1 = 400;
        
        borderX2 = 800;
        borderY2 = 0;
        borderWidth2 = 400;
        borderHeight2 = 600;
        
         borderX3 = 0;
        borderY3 = 0;
        borderWidth3 = 0;
        borderHeight3 = 0;

        endPointBorderY = 0;
        endPointBorderY00 = 0;
        borderW00 = 0;
        borderH00 = 0;

        endPointBorderX3 = 0;
        endPointBorderY3 = 0;
        borderW3 = 0;
        borderH3 = 0;

        playerWidth = 50;
        playerHeight = 50;
    }

    public void levelTwo() {

         if(levelTwo == true) {
                
        borderX1 = 0;
        borderY1 = 0;
        borderWidth1 = Logic.width;
        borderHeight1 = 250;
        
        borderX2 = 800;
        borderY2 = 250;
        borderWidth2 = 250;
        borderHeight2 = 350;

        borderX3 = 280;
        borderY3 = 400;
        borderWidth3 = 320;
        borderHeight3 = 250;

        endPointBorderY = 0;
        borderH = 0;
        borderW = 0;

        endPointBorderY00 = 580;
        borderW00 = 200;
        borderH00 = 50;

        endPointBorderX3 = 0;
        endPointBorderY3 = 0;
        borderW3 = 0;
        borderH3 = 0;

        playerWidth = 100;
        playerHeight = 100;

         }

    }

    public void levelThree() {

        if(levelThree == true & levelTwo == false && levelOne == false) {

        borderX1 = 0;
        borderY1 = 0;
        borderWidth1 = Logic.width - 450;
        borderHeight1 = 250;
        
        borderX2 = 650;
        borderWidth2 = 450;

        
        borderX3 = 0;
        borderY3 = 200;
        borderWidth3 = 318;
        borderHeight3 = 600;

        borderX4 = 400;
        borderY4 = 302;
        borderWidth4 = 300;
        borderHeight4 = 338;

        endPointBorderX3 = 300;
        endPointBorderY3 = 580;
        borderW3 = 115;
        borderH3 = 50;
        

        }

    }

        public void nextLevel() {

            if(playerX + playerWidth > endPointBorderX && playerX < endPointBorderX + borderW && 
                playerY + playerHeight > endPointBorderY && playerY < endPointBorderY + borderH) {
                    levelOne = false;
                    levelTwo = true;
                    
                
            }

            if(playerX + playerWidth > endPointBorderX00 && playerX < endPointBorderX00 + borderW00 && 
                playerY + playerHeight > endPointBorderY00 && playerY < endPointBorderY00 + borderH00) {
                    levelOne = false;
                    levelTwo = false;
                    levelThree = true;
                    
                    playerX = 600;
                    playerY = 30;
                
            }

            if(playerX + playerWidth > endPointBorderX3 && playerX < endPointBorderX3 + borderW3 && 
                playerY + playerHeight > endPointBorderY3 && playerY < endPointBorderY3 + borderH3) {

                    winner = true;

            }
             
    }
    private void winningLevel() {
            if(winner == true) {

        borderX1 = 0;
        borderY1 = 0;
        borderWidth1 = 0;
        borderHeight1 = 0;

        borderX2 = 0;
        borderWidth2 = 0;


        borderX3 = 0;
        borderY3 = 0;
        borderWidth3 = 0;
        borderHeight3 = 0;

        borderX4 = 0;
        borderY4 = 0;
        borderWidth4 = 0;
        borderHeight4 = 0;

        endPointBorderX3 = 0;
        endPointBorderY3 = 0;
        borderW3 = 0;
        borderH3 = 0;

        stringX = 450;
        stringY = 300;
        msg = "Y O U  W I N";
        
        playerX=0;
        playerY=0;
        playerWidth=0;
        playerHeight=0;
            }
        }
        public void death() {
             if(playerX + playerWidth > borderX1 && playerX < borderX1 + borderWidth1 && 
                playerY + playerHeight > borderY1 && playerY < borderY1 + borderHeight1) {
        
                    playerX = 30;
                    playerY = 450;

                if(levelThree == true) {

                    playerX = 600;
                    playerY = 30;
                }
                
            }

            if(playerX + playerWidth > borderX2 && playerX < borderX2 + borderWidth2 && 
                playerY + playerHeight > borderY2 && playerY < borderY2 + borderHeight2) {
        
                    playerX = 30;
                    playerY = 450;
                if(levelThree == true) {

                    playerX = 600;
                    playerY = 30;
                }
            }
            
            if(playerX + playerWidth > borderX3 && playerX < borderX3 + borderWidth3 && 
                playerY + playerHeight > borderY3 && playerY < borderY3 + borderHeight3) {
        
                    playerX = 30;
                    playerY = 450;

                    if(levelThree == true) {
                    playerX = 600;
                    playerY = 30;
                }
                   
            }

            if(playerX + playerWidth > borderX4 && playerX < borderX4 + borderWidth4 && 
                playerY + playerHeight > borderY4 && playerY < borderY4 + borderHeight4) {
        
                    playerX = 30;
                    playerY = 450;

                    if(levelThree == true) {
                    playerX = 600;
                    playerY = 30;
                }
                   
            }
     if(playerX + playerWidth > 0 && playerX < 0 + Logic.width && 
                playerY + playerHeight > 0 && playerY < 0 + Logic.height) {

                    System.out.println("in the window");
                   System.out.println("PlayerX: " + playerX + ", PlayerY: " + playerY);
            } else {
                    playerX = 30;
                    playerY = 450;

                    if(levelThree == true) {
                    playerX = 600;
                    playerY = 30;
                }
            }
        
        }


}