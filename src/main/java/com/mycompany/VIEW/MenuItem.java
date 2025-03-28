/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.VIEW;

/**
 *
 * @author Tran Dinh Khanh Du
 */
public class MenuItem extends javax.swing.JPanel {

    /**
     * Creates new form MenuItem
     */
    private String id = "";
    private MenuItem parentItem = null;
    private boolean selected = false;
    
    public MenuItem() {
        initComponents();
    }
    
    public MenuItem(String label) {
        initComponents();
        jLabel1.setText(label);
    }
    
    public MenuItem(String label, String id) {
        initComponents();
        jLabel1.setText(label);
        this.id = id;
    }
    
    public void addSubItems(MenuItem... items) {
        for (MenuItem item: items) {
            item.setParentItem(this);
        }
    }
    
    public void setFontColor(java.awt.Color color) {
        jLabel1.setForeground(color);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MenuItem getParentItem() {
        return parentItem;
    }

    public void setParentItem(MenuItem parentItem) {
        this.parentItem = parentItem;
        setBackground(new java.awt.Color(51,204,0));
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
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

        setBackground(new java.awt.Color(51, 153, 0));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(2147483647, 50));
        setPreferredSize(new java.awt.Dimension(200, 50));
        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("jLabel1");
        add(jLabel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
