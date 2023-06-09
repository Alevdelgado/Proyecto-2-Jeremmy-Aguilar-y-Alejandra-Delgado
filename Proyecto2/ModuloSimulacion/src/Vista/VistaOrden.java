/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author aleja
 */
public class VistaOrden extends javax.swing.JFrame {

    /**
     * Creates new form VistaOrden
     */
    
    ImagenFondo ejemplo  = new ImagenFondo();
    public VistaOrden() {
        this.setContentPane(ejemplo);
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); // Establece la ventana en modo maximizado
        
        JPanel panelDerecho = new JPanel(new BorderLayout());
        JPanel panelMatriz = new JPanel(new GridLayout(15, 15,0,0 )); // Tamaño de la matriz y espacio entre los botones
        panelMatriz.setOpaque(false);
        //panelMatriz.setPreferredSize(new Dimension(200, 200)); // Ajusta el tamaño del panel de la matriz

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                JButton button = new JButton("Mesa " + (i * 4 + j + 1));
                button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.setBackground(Color.GREEN); // Cambia el color de fondo del botón a verde
                            button.setPreferredSize(new Dimension(50, 50)); // Ajusta el tamaño del botón
                }
            });
            panelMatriz.add(button);
            }
        }
        
        panelDerecho.add(panelMatriz, BorderLayout.CENTER);

        // Agregar JComboBox debajo del panel de la matriz
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Hamburguesa regular");
        comboBox.addItem("Hamburguesa de queso");
        comboBox.addItem("Hamburguesa de pollo");
        comboBox.addItem("Hamburguesa vegana");
        comboBox.addItem("Hamburguesa de camarones");
        comboBox.addItem("Double Deluxe");
        JPanel panelComboBox = new JPanel();
        panelComboBox.setOpaque(false);
        panelComboBox.add(comboBox);
        panelDerecho.add(panelComboBox, BorderLayout.SOUTH);

        panelDerecho.setOpaque(false);
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel1.add(panelDerecho);
        
        
        
        
       /*  // Agregar el panel de la matriz al panel derecho
        panelDerecho.add(panelMatriz, BorderLayout.CENTER);
        panelDerecho.setOpaque(false);
        // Agregar el panel derecho al jPanel1
        jPanel1.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanel1.add(panelDerecho);  */     

   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
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
    // Agregar panelDerecho al jPanel1

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaOrden.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaOrden().setVisible(true);
            }
        }); 
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    class ImagenFondo extends JPanel{
        // Atributos
        private Image imagen;    
         // metodos
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("vistaorden.png")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

}

