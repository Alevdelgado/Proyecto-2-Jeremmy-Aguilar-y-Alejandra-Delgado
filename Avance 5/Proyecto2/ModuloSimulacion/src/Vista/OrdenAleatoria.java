package Vista;

import Controlador.SimulacionController;
import Modelo.Mesa;
import Modelo.Orden;
import static Modelo.Orden.informacionString;
import static Modelo.Orden.numMesa;
import static Modelo.Orden.precioTotal;
import static Vista.OrdenSimulacion.hamburguesas;
import static Vista.OrdenSimulacion.ingredientes;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class OrdenAleatoria extends javax.swing.JFrame {
    ImagenFondoOrden ejemplo  = new ImagenFondoOrden();
    private SimulacionController controlador;
    public static int cantidadHamb;
    public static Orden orden;
    
    
    public OrdenAleatoria() {
        this.setContentPane(ejemplo);
        initComponents();
        orden = new Orden();
        controlador = new SimulacionController ();
        hamburguesas = new ArrayList<>();
        ingredientes = new ArrayList<>();
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Establece la ventana en modo maximizado

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        numHamb = new javax.swing.JComboBox<>();
        Aceptar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        hamburguesa = new javax.swing.JScrollPane();
        HambAleatoria = new javax.swing.JTextPane();
        Pedir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        numHamb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numHamb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        numHamb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numHambActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        hamburguesa.setViewportView(HambAleatoria);

        Pedir.setText("Pedir");
        Pedir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PedirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Regresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Pedir, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(numHamb, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103)
                        .addComponent(hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numHamb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hamburguesa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Aceptar)
                    .addComponent(Regresar)
                    .addComponent(Pedir))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numHambActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numHambActionPerformed
       

    }//GEN-LAST:event_numHambActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        cantidadHamb = Integer.parseInt(numHamb.getSelectedItem().toString()); 
        System.out.println("Cantidad de hamburguesas: "+ cantidadHamb);
        
        hamburguesas=orden.generarOrden(cantidadHamb);
        HambAleatoria.setText(informacionString);

        //dispose();

    }//GEN-LAST:event_AceptarActionPerformed

    private void PedirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PedirActionPerformed
        Mesa ordenMesa= new Mesa(hamburguesas,ingredientes, numMesa,precioTotal);
           
            // FINAL 
        controlador.guardarInfoOrden(ordenMesa);
        dispose();


    }//GEN-LAST:event_PedirActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Aceptar;
    private javax.swing.JTextPane HambAleatoria;
    private javax.swing.JToggleButton Pedir;
    private javax.swing.JButton Regresar;
    private javax.swing.JScrollPane hamburguesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> numHamb;
    // End of variables declaration//GEN-END:variables
}

class ImagenFondoOrden extends JPanel{
        // Atributos
        private Image imagen;    
         // metodos
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("OrdenAlea.png")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
}
