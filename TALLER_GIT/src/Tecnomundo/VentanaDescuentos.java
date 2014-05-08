package Tecnomundo;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Milton
 */
public class VentanaDescuentos extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form VentanaDescuentos
     */
    public VentanaDescuentos() {
        initComponents();
        
        setControlador();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    public void setControlador(){
        botonGuardar.addActionListener(this);
        botonCancelar.addActionListener(this);
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
        labelFechaIni = new javax.swing.JLabel();
        labelFechaFin = new javax.swing.JLabel();
        labelCategoria = new javax.swing.JLabel();
        labelDescuento = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        chooserFechaInicio = new com.toedter.calendar.JDateChooser();
        chooserFechaFin = new com.toedter.calendar.JDateChooser();
        comboCategoria = new javax.swing.JComboBox();
        textDescuento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelTitulo.setText("DESCUENTOS");

        labelFechaIni.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelFechaIni.setForeground(new java.awt.Color(51, 102, 255));
        labelFechaIni.setText("Fecha Inicio:");

        labelFechaFin.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelFechaFin.setForeground(new java.awt.Color(51, 102, 255));
        labelFechaFin.setText("Fecha Fin:");

        labelCategoria.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelCategoria.setForeground(new java.awt.Color(51, 102, 255));
        labelCategoria.setText("Categoría:");

        labelDescuento.setFont(new java.awt.Font("Kalinga", 0, 14)); // NOI18N
        labelDescuento.setForeground(new java.awt.Color(51, 102, 255));
        labelDescuento.setText("% Descuento:");

        botonGuardar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonGuardar.setText("Guardar");

        botonCancelar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonCancelar.setText("Cancelar");

        chooserFechaInicio.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        chooserFechaFin.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        comboCategoria.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        textDescuento.setFont(new java.awt.Font("Kalinga", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonGuardar)
                                .addGap(75, 75, 75)
                                .addComponent(botonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFechaIni)
                                    .addComponent(labelFechaFin)
                                    .addComponent(labelCategoria)
                                    .addComponent(labelDescuento))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chooserFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chooserFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textDescuento))))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chooserFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFechaIni, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chooserFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCategoria)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDescuento)
                    .addComponent(textDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonCancelar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private com.toedter.calendar.JDateChooser chooserFechaFin;
    private com.toedter.calendar.JDateChooser chooserFechaInicio;
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelDescuento;
    private javax.swing.JLabel labelFechaFin;
    private javax.swing.JLabel labelFechaIni;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textDescuento;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae){     
            
        if(ae.getActionCommand().equals("Guardar")){
            JOptionPane.showMessageDialog(null, "Implementame! D:");
        }
        
        if(ae.getActionCommand().equals("Cancelar")){
            this.dispose();
        }
    }
}
