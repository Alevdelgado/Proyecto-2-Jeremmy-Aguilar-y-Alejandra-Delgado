/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.threadSocket;
import static controlador.threadSocket.numMesa;
import static controlador.threadSocket.tempX;
import static controlador.threadSocket.tempY;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ventCocina extends javax.swing.JFrame implements ActionListener {

 
    JButton[][] botonesPedidos;
    String matrizStrPedidos[][] = new String[5][5];
    public static String mensajeComPedido;
    public static int filas;
    public static int columnas;
    
    threadSocket tempSocket;
    
    public ventCocina() {
        initComponents();
        
        crearBotPedidos();
       // cambiarBoton(mensajeComPedido, tempX,tempY);

    }
    
    public void setSocket(threadSocket tempS){
        tempSocket = tempS;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frameBotonesPedidos = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tituloCocina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout frameBotonesPedidosLayout = new javax.swing.GroupLayout(frameBotonesPedidos);
        frameBotonesPedidos.setLayout(frameBotonesPedidosLayout);
        frameBotonesPedidosLayout.setHorizontalGroup(
            frameBotonesPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        frameBotonesPedidosLayout.setVerticalGroup(
            frameBotonesPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        tituloCocina.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloCocina.setText("Cocina");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(tituloCocina)
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloCocina)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(frameBotonesPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(frameBotonesPedidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ventCocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventCocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventCocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventCocina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventCocina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel frameBotonesPedidos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tituloCocina;
    // End of variables declaration//GEN-END:variables

    public void crearBotPedidos(){ 
        
       filas = 5; // Número de filas en la matriz
       columnas =5; // Número de columnas en la matriz
        
        
        frameBotonesPedidos.setLayout(new GridLayout(filas, columnas));

        botonesPedidos = new JButton[filas][columnas]; // Inicialización de la matriz de botones
        for (int i = 0; i < filas; i++) { 
            for (int j = 0; j < columnas; j++) {
                botonesPedidos[i][j] = new JButton(); // Crea un nuevo botón
                botonesPedidos[i][j] = new JButton("Mesa "+ (i * columnas + j + 1)); 
                botonesPedidos[i][j].addActionListener(this);
                matrizStrPedidos[i][j] = "";//llena la mtriz para la info de los pedidos
                botonesPedidos[i][j].setBackground(Color.WHITE);
                botonesPedidos[i][j].setPreferredSize(new Dimension(50, 50)); // Establece el ancho y alto deseados
                frameBotonesPedidos.add(botonesPedidos[i][j]); // Agrega el botón al panel
            }
        } 
        
    }
    
    public void cambiarBoton(String tempPed, int tempI, int tempJ){
        Color nuevoColor ;//= Color.RED; // Color deseado para el botón
        if (tempPed == ""){
            nuevoColor = Color.WHITE;
        }
        else{
            nuevoColor = Color.RED;
        }
        botonesPedidos[tempI][tempJ].setBackground(nuevoColor); // Cambia el color del botón específico
        matrizStrPedidos[tempI][tempJ] = tempPed;
    }
    
     public void actionPerformed(ActionEvent e) {   // Al presionar el boton de la matriz de botones de la mesa 
        JButton sourceButton = (JButton) e.getSource();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (sourceButton == botonesPedidos[i][j]) {
                    if (matrizStrPedidos[i][j] != ""){
                        numMesa = i * columnas + j + 1;
                        mensajeComPedido = "Pedido de la mesa " + numMesa; // listo lo calcula bien
                       // cambiarBoton(mensajeComPedido, i,j);
                        ventanaCompPedido tempVentana = new ventanaCompPedido(matrizStrPedidos[i][j],this, tempSocket, i, j);
                        tempVentana.setVisible(true);
                        this.dispose();
                    }
                    
                    break; // Termina el bucle una vez que se encuentra el botón presionado
                }
            }
        }
    }
    
}
