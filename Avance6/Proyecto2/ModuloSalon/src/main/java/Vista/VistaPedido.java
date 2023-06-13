
package Vista;
//import static Controlador.servidorSalon.listaHamburguesas;
//import static Controlador.servidorSalon.numMesa;
//import static Controlador.servidorSalon.precioTotal;
import Controlador.servidorSalon;
import static Controlador.servidorSalon.listaHamburguesas;
import static Controlador.servidorSalon.listaIngredientes;
import static Controlador.servidorSalon.numMesa;
import static Controlador.servidorSalon.precioTotal;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class VistaPedido extends javax.swing.JFrame {
    DefaultTableModel dtm = new DefaultTableModel();
    private int numMesa;
    private List<String> listaHamburguesas;
    private List<List> listaIngredientes;
    private int precioTotal;
    public static servidorSalon tempSocketSalon;
    
    
    
    
    public VistaPedido(int numMesa, List<String> listaHamburguesas, int precioTotal) {
        this.numMesa = numMesa;
        this.listaHamburguesas = listaHamburguesas;
        this.precioTotal = precioTotal;
        initComponents();
        tempSocketSalon = new servidorSalon();
        String[] titulo = new String[] {"Mesa","Orden","Total"};
        dtm.setColumnIdentifiers(titulo);
//        dtm.addRow(new Object[]{numMesa, listaHamburguesas, precioTotal});
        Factura.setModel(dtm);
        //new VistaPedido(numMesa, listaHamburguesas, precioTotal).setVisible(true);
        
        
    }
    
    public void agregarDatos(){
        dtm.addRow(new Object[]{numMesa, listaHamburguesas, precioTotal});
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Factura = new javax.swing.JTable();
        Actualizar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        Aceptar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(Factura);

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar pedido");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        Aceptar.setText("Aceptar");
        Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(cancelar)
                .addGap(18, 18, 18)
                .addComponent(Actualizar)
                .addGap(18, 18, 18)
                .addComponent(Aceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar)
                    .addComponent(cancelar)
                    .addComponent(Aceptar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        // TODO add your handling code here:
        agregarDatos();
    }//GEN-LAST:event_ActualizarActionPerformed

    private void AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarActionPerformed
        
        // Aqui que le envie el numMesa a la cocina
        tempSocketSalon.enviarOrdenCocina(listaHamburguesas,listaIngredientes,numMesa, precioTotal);
        this.dispose();

    }//GEN-LAST:event_AceptarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Aceptar;
    private javax.swing.JButton Actualizar;
    private javax.swing.JTable Factura;
    private javax.swing.JButton cancelar;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
