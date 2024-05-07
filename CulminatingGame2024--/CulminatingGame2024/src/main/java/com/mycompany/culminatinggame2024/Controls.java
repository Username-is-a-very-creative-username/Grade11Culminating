package com.mycompany.culminatinggame2024;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controls implements KeyListener {
    
    static boolean moveUp, moveLeft, moveDown, moveRight;

     @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            moveUp = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            moveLeft = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            moveDown = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            moveRight = true;
        }

    }

        @Override
        public void keyReleased(KeyEvent e) {
            
        if (e.getKeyCode() == KeyEvent.VK_W) {
            moveUp = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_A) {
            moveLeft = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            moveDown = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            moveRight = false;
        }
    }

}
