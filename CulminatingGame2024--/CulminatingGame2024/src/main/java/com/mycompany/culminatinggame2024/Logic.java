/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.culminatinggame2024;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author alexa
 */
public class Logic implements Runnable{

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    Levels level;
   
    Thread thread;
    
    boolean running = true;
    
     static int width = 1000, height = 600;
     
    @Override
    public void run() {
       display();
       
       long lastTime = System.nanoTime();
       final double nanoSeconds = 1000000000.0 / 60.0;
       double delta = 0;
       
       //constant game loop
       while(running) {
           long now = System.nanoTime();
           delta += (now - lastTime) / nanoSeconds;
           lastTime = now;
           while(delta > 1) {
               update();
               render();
               delta--;
           }
       }
    }
    
    //updates triggers
    synchronized void update() {
         //movement for player
        if(Controls.moveUp == true) {
            Levels.playerY -= 5;
        } 
        else if(Controls.moveLeft == true) {
            Levels.playerX -= 5;
        }
        else if(Controls.moveDown == true) {
            Levels.playerY += 5;
        }
        else if(Controls.moveRight == true) {
            Levels.playerX += 5;
        }
        
    }
    //renders graphics
    synchronized void render() {
       BufferStrategy bs = frame.getBufferStrategy();
     
       if(bs == null) {
          frame.createBufferStrategy(3);
          return;
       }
       
       Graphics graphics = bs.getDrawGraphics();
      
       graphics.clearRect(0, 0, width, height);
        


        level = new Levels(graphics);

       graphics.dispose();
       bs.show();
       
    }
    
    public void start() {
        thread = new Thread(this);
        thread.start();
    }
    
    public void display() {
      
      Controls controls = new Controls();
       
        panel.setSize(width,height);
        frame.setResizable(false);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(
            JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.addKeyListener(controls);
        frame.setVisible(true);
        
    }
    
}
