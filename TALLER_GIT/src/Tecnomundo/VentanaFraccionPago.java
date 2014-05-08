package Tecnomundo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milton
 */
public class VentanaFraccionPago extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form VentanaPago
     */
    public VentanaFraccionPago() {
        initComponents();
        setControlador();
    }
    
    public void setControlador(){
        botonCancelar.addActionListener(this);
        botonComPagar.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitulo = new javax.swing.JLabel();
        labelFracciones = new javax.swing.JLabel();
        textFracciones = new javax.swing.JTextField();
        botonComPagar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("FRACCIONES DE PAGO");

        labelFracciones.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelFracciones.setForeground(new java.awt.Color(51, 102, 255));
        labelFracciones.setText("# Fracciones:");

        textFracciones.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        botonComPagar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonComPagar.setText("Comenzar a Pagar");

        botonCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonCancelar.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelFracciones)
                                .addGap(18, 18, 18)
                                .addComponent(textFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(botonComPagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelFracciones)
                    .addComponent(textFracciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonComPagar)
                    .addComponent(botonCancelar))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonComPagar;
    private javax.swing.JLabel labelFracciones;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textFracciones;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Comenzar a Pagar")){
            VentanaPago ventanaPago =  new VentanaPago();
            ventanaPago.setVisible(true);
            ventanaPago.setLocationRelativeTo(this);
        }
        
        if(ae.getActionCommand().equals("Cancelar")){
            this.dispose();
        }
    }
}
