/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.VIEW.WorkSpace.RightPanelItems;

/**
 *
 * @author ASUS-PC
 */
public class TextPanel extends javax.swing.JPanel {

    /**
     * Creates new form TextPanel
     */
    public TextPanel() {
        initComponents();
    }
    public TextPanel(String labelString) {
        initComponents();
        label.setText(labelString);
    }
    
    public String getString() {
        return txtBox.getText().trim();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        txtBox = new javax.swing.JTextField();
        btnClick = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(2147483647, 50));
        setLayout(new java.awt.BorderLayout());

        label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label.setText("Tìm kiếm");
        add(label, java.awt.BorderLayout.PAGE_START);

        txtBox.setMinimumSize(new java.awt.Dimension(100, 26));
        txtBox.setPreferredSize(new java.awt.Dimension(100, 26));
        add(txtBox, java.awt.BorderLayout.CENTER);

        btnClick.setText("click");
        add(btnClick, java.awt.BorderLayout.LINE_END);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel label;
    private javax.swing.JTextField txtBox;
    // End of variables declaration//GEN-END:variables
}
