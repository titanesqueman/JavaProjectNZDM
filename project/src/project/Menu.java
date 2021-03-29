/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author nicol
 */
public class Menu extends JFrame {
    JFrame frameMenu;
    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 150;
    //private JPanel panel;
    //constructor

    public Menu() {
        frameMenu = new JFrame();
        frameMenu.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frameMenu.setTitle("Menu");
        frameMenu.setDefaultCloseOperation(frameMenu.EXIT_ON_CLOSE);
        frameMenu.setVisible(true);
    }

}