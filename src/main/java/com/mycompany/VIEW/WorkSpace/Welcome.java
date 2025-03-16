/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.VIEW.WorkSpace;

import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Tran Dinh Khanh Du
 */
public class Welcome extends javax.swing.JPanel {

    /**
     * Creates new form Welcome
     */
    private Random random = new Random();
    public Welcome() {
        initComponents();
        Timer timer = new Timer(300, e -> changeColor());
        timer.start();
    }
    
    private void changeColor() {
        Color newColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        setBackground(newColor);
        repaint();
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.add(new Welcome());
        frame.setVisible(true);
        frame.setSize(new Dimension(400,400));
        frame.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 0));
        setLayout(new java.awt.BorderLayout());

        jLabel1.setBackground(new java.awt.Color(153, 255, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Chào mừng đến với cửa hàng thực phẩm LGBT");
        add(jLabel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
