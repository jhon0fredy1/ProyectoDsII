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
public class VentanaAsistenteBodega extends javax.swing.JFrame implements ActionListener{
    VentanaIngresarSistema ventanaAnterior;
    /**
     * Creates new form NewJFrame
     */
    public VentanaAsistenteBodega(VentanaIngresarSistema ventanaAnterior) {
        this.ventanaAnterior = ventanaAnterior;
        initComponents();
        setControlador();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    public void setControlador(){
        
        botonCerrar.addActionListener(this);
        itemConsProd.addActionListener(this);
        itemCrearProd.addActionListener(this);
        itemDelProd.addActionListener(this);
        itemIngrCant.addActionListener(this);
        itemModifProd.addActionListener(this);
    
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
        etiquetaImagenUsr = new javax.swing.JLabel();
        etiquetaTM = new javax.swing.JLabel();
        botonCerrar = new javax.swing.JButton();
        BarraMenu = new javax.swing.JMenuBar();
        menuProductos = new javax.swing.JMenu();
        itemCrearProd = new javax.swing.JMenuItem();
        itemModifProd = new javax.swing.JMenuItem();
        itemConsProd = new javax.swing.JMenuItem();
        itemDelProd = new javax.swing.JMenuItem();
        itemIngrCant = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        labelTitulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(0, 51, 102));
        labelTitulo.setText("ASISTENTE DE BÓDEGA");

        etiquetaImagenUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/banner_home_bodegas.png"))); // NOI18N

        etiquetaTM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoTecnomundo.png"))); // NOI18N

        botonCerrar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        botonCerrar.setForeground(new java.awt.Color(204, 255, 255));
        botonCerrar.setText("Cerrar Sesión");

        menuProductos.setForeground(new java.awt.Color(0, 51, 102));
        menuProductos.setText("Productos");
        menuProductos.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        itemCrearProd.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        itemCrearProd.setForeground(new java.awt.Color(0, 51, 102));
        itemCrearProd.setText("Crear Producto");
        menuProductos.add(itemCrearProd);

        itemModifProd.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        itemModifProd.setForeground(new java.awt.Color(0, 51, 102));
        itemModifProd.setText("Modificar Producto");
        menuProductos.add(itemModifProd);

        itemConsProd.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        itemConsProd.setForeground(new java.awt.Color(0, 51, 102));
        itemConsProd.setText("Consultar Producto");
        menuProductos.add(itemConsProd);

        itemDelProd.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        itemDelProd.setForeground(new java.awt.Color(0, 51, 102));
        itemDelProd.setText("Eliminar Producto");
        menuProductos.add(itemDelProd);

        itemIngrCant.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        itemIngrCant.setForeground(new java.awt.Color(0, 51, 102));
        itemIngrCant.setText("Ingresar Cantidad de Producto en Sucursal");
        menuProductos.add(itemIngrCant);

        BarraMenu.add(menuProductos);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(etiquetaTM, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(etiquetaImagenUsr))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(labelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(labelTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(etiquetaImagenUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(etiquetaTM)))
                .addGap(18, 18, 18)
                .addComponent(botonCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Funciones");

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JButton botonCerrar;
    private javax.swing.JLabel etiquetaImagenUsr;
    private javax.swing.JLabel etiquetaTM;
    private javax.swing.JMenuItem itemConsProd;
    private javax.swing.JMenuItem itemCrearProd;
    private javax.swing.JMenuItem itemDelProd;
    private javax.swing.JMenuItem itemIngrCant;
    private javax.swing.JMenuItem itemModifProd;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JMenu menuProductos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getActionCommand().equals("Cerrar Sesión")){
            this.dispose();
            ventanaAnterior.setVisible(true);
        }
        
        if(ae.getActionCommand().equals("Crear Producto")){
           VentanaAdminProducto ventanaCrearProducto = new VentanaAdminProducto("Crear");
           ventanaCrearProducto.setVisible(true);
           ventanaCrearProducto.setLocationRelativeTo(this);
        }
        
        if(ae.getActionCommand().equals("Modificar Producto")){
           VentanaIDAdminProducto ventanaIDModificarProducto = new VentanaIDAdminProducto("Modificar");
           ventanaIDModificarProducto.setVisible(true);
           ventanaIDModificarProducto.setLocationRelativeTo(this);
        }
        
        if(ae.getActionCommand().equals("Consultar Producto")){
           VentanaIDAdminProducto ventanaIDConsultarProducto = new VentanaIDAdminProducto("Consultar");
           ventanaIDConsultarProducto.setVisible(true);
           ventanaIDConsultarProducto.setLocationRelativeTo(this);
        }
        
        if(ae.getActionCommand().equals("Eliminar Producto")){
           VentanaIDAdminProducto ventanaIDEliminarProducto = new VentanaIDAdminProducto("Eliminar");
           ventanaIDEliminarProducto.setVisible(true);
           ventanaIDEliminarProducto.setLocationRelativeTo(this);
        }
        
        if(ae.getActionCommand().equals("Ingresar Cantidad de Producto en Sucursal")){
           VentanaIngresarCantProducto ventanaIngresarCantidad = new VentanaIngresarCantProducto();
           ventanaIngresarCantidad.setVisible(true);
           ventanaIngresarCantidad.setLocationRelativeTo(this);
        }
        
    }
}
