
package Vista;

import Controlador.SimulacionController;
import Modelo.Mesa;
import Modelo.Orden;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class OrdenSimulacion extends javax.swing.JFrame {

    public static  String hamburguesa;
    public static List<Integer> hamburguesas;
    public static List<String> ingredientes;
    public static List<List> ingredHamb;
    public Mesa[][] mesas; // clase como casilla aqui almacena los datos de la mesa
    private JButton[][] botones; 
    private SimulacionController controlador;
    ImagenFondo ejemplo  = new ImagenFondo();
    private int precioTotal;
    public int numMesa;
    public int fila;
    public int columna;
    public int filas;
    public int columnas;       

    public OrdenSimulacion() {

        this.setContentPane(ejemplo);
        initComponents();
        hamburguesas = new ArrayList<>();
        ingredientes = new ArrayList<>();
        ingredHamb = new ArrayList<>();
        crearBotonesMesa();
        
        //  Se establece el tamanio de la matriz de botones del panelMesas
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int preferredWidth = (int) (screenSize.width * 0.25);
        int preferredHeight = (int) (screenSize.height*0.4);
        panelMesas.setPreferredSize(new Dimension(preferredWidth, preferredHeight));

    }

    
    
    // Metodo 1  crearBotonesMesa()
    
private void crearBotonesMesa(){
    filas = 5; // Número de filas en la matriz
    columnas =5; // Número de columnas en la matriz
    mesas = new Mesa[filas][columnas];

    setExtendedState(JFrame.MAXIMIZED_BOTH);   
    

    panelMesas.setLayout(new GridLayout(filas, columnas));
    botones = new JButton[filas][columnas]; // Inicialización de la matriz de botones
    controlador = new SimulacionController ();
    for (int i = 0; i < filas; i++) { 
        for (int j = 0; j < columnas; j++) {
      
            numMesa = i * columnas + j + 1;
            Mesa mesa = new Mesa(hamburguesas,ingredHamb, (i * columnas + j + 1),0);
            mesas[i][j] = mesa;
            botones[i][j] = new JButton(); // Crea un nuevo botón
            botones[i][j] = new JButton("M" + (i * columnas + j + 1)); 
            int numeroMesa = i * columnas + j + 1;

            botones[i][j].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    fila = (numeroMesa - 1) / columnas;
                    columna = (numeroMesa - 1) % columnas;
                    Color mostaza = new Color(255, 200, 0);
                    ocuparMesa(fila,columna, mostaza);
                
                }
            });              
            panelMesas.add(botones[i][j]); // Agrega el botón al panel
        }
    } 
    //orden = new Orden(mesas);
}     

// Metodo 2 ocuparMesa  
/* 1. Se encarga de cambiar el color de la mesa como indicativo que 
esta ocupada/ reservada si la mesa esta ocupada debe mostrar un message box que esa mesa esta ocupada
*/
public void ocuparMesa(int fila, int columna, Color color) {
    botones[fila][columna].setBackground(color);
    mesas[fila][columna].setOcupada(true);
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelMesas = new javax.swing.JPanel();
        panelHamb = new javax.swing.JPanel();
        HambRegular = new javax.swing.JComboBox<>();
        HambQueso = new javax.swing.JComboBox<>();
        HambPollo = new javax.swing.JComboBox<>();
        HambVegana = new javax.swing.JComboBox<>();
        HambCamarones = new javax.swing.JComboBox<>();
        HambDeluxe = new javax.swing.JComboBox<>();
        Tocino = new javax.swing.JCheckBox();
        Champiniones = new javax.swing.JCheckBox();
        Pepinillo = new javax.swing.JCheckBox();
        ExtraTorta = new javax.swing.JCheckBox();
        Cebolla = new javax.swing.JCheckBox();
        QuesoChedar = new javax.swing.JCheckBox();
        ordenar = new javax.swing.JToggleButton();
        agregarPersonali = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setOpaque(false);

        panelMesas.setOpaque(false);

        javax.swing.GroupLayout panelMesasLayout = new javax.swing.GroupLayout(panelMesas);
        panelMesas.setLayout(panelMesasLayout);
        panelMesasLayout.setHorizontalGroup(
            panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelMesasLayout.setVerticalGroup(
            panelMesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        panelHamb.setFocusable(false);
        panelHamb.setOpaque(false);

        HambRegular.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        HambRegular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HambRegularActionPerformed(evt);
            }
        });

        HambQueso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        HambQueso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HambQuesoActionPerformed(evt);
            }
        });

        HambPollo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        HambPollo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HambPolloActionPerformed(evt);
            }
        });

        HambVegana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        HambVegana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HambVeganaActionPerformed(evt);
            }
        });

        HambCamarones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        HambCamarones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HambCamaronesActionPerformed(evt);
            }
        });

        HambDeluxe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        HambDeluxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HambDeluxeActionPerformed(evt);
            }
        });

        Tocino.setForeground(new java.awt.Color(255, 255, 255));
        Tocino.setText("Tocino");
        Tocino.setContentAreaFilled(false);
        Tocino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TocinoActionPerformed(evt);
            }
        });

        Champiniones.setForeground(new java.awt.Color(255, 255, 255));
        Champiniones.setText("Champiñones");
        Champiniones.setContentAreaFilled(false);
        Champiniones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChampinionesActionPerformed(evt);
            }
        });

        Pepinillo.setForeground(new java.awt.Color(255, 255, 255));
        Pepinillo.setText("Pepinillo");
        Pepinillo.setContentAreaFilled(false);
        Pepinillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PepinilloActionPerformed(evt);
            }
        });

        ExtraTorta.setForeground(new java.awt.Color(255, 255, 255));
        ExtraTorta.setText("Extra Torta");
        ExtraTorta.setContentAreaFilled(false);
        ExtraTorta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtraTortaActionPerformed(evt);
            }
        });

        Cebolla.setForeground(new java.awt.Color(255, 255, 255));
        Cebolla.setText("Cebolla caramelizada");
        Cebolla.setContentAreaFilled(false);
        Cebolla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CebollaActionPerformed(evt);
            }
        });

        QuesoChedar.setForeground(new java.awt.Color(255, 255, 255));
        QuesoChedar.setText("Queso Chedar");
        QuesoChedar.setContentAreaFilled(false);
        QuesoChedar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuesoChedarActionPerformed(evt);
            }
        });

        ordenar.setText("Ordenar");
        ordenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenarActionPerformed(evt);
            }
        });

        agregarPersonali.setText("Agregar personalizada");
        agregarPersonali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarPersonaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelHambLayout = new javax.swing.GroupLayout(panelHamb);
        panelHamb.setLayout(panelHambLayout);
        panelHambLayout.setHorizontalGroup(
            panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHambLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelHambLayout.createSequentialGroup()
                        .addComponent(HambVegana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HambCamarones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelHambLayout.createSequentialGroup()
                        .addComponent(HambRegular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(HambQueso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117)
                .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HambPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HambDeluxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(274, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHambLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelHambLayout.createSequentialGroup()
                        .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tocino, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QuesoChedar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExtraTorta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(58, 58, 58)
                        .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pepinillo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cebolla, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Champiniones, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelHambLayout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(ordenar))))
                    .addGroup(panelHambLayout.createSequentialGroup()
                        .addComponent(agregarPersonali)
                        .addGap(47, 47, 47)))
                .addGap(21, 21, 21))
        );
        panelHambLayout.setVerticalGroup(
            panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHambLayout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HambRegular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HambQueso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HambPollo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Champiniones)
                    .addComponent(Tocino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExtraTorta)
                    .addComponent(Pepinillo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cebolla)
                    .addComponent(QuesoChedar))
                .addGap(18, 18, 18)
                .addComponent(agregarPersonali)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHambLayout.createSequentialGroup()
                        .addComponent(ordenar)
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelHambLayout.createSequentialGroup()
                        .addGroup(panelHambLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HambVegana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HambCamarones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HambDeluxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelHamb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHamb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(371, Short.MAX_VALUE)
                .addComponent(panelMesas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
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

    private void ExtraTortaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtraTortaActionPerformed
        // Ingrediente: Extra torta
        // precio:  6$ + 5$ precio del pan - torta - pan
        int precio =  6;
        precioTotal += precio;
        
        ingredientes.add("Extra Torta");
       // ingredHamb.add(ingredientes);
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas, ingredHamb, numMesa,precio);
       
//        mesaSeleccionada.getNumeroMesa();        
//        mesa.getPrecio();
//        mesa.getIngredientes();

    }//GEN-LAST:event_ExtraTortaActionPerformed

    private void CebollaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CebollaActionPerformed
        
        int precio = 5;
        precioTotal += precio;
        
        ingredientes.add("Cebolla");
        //ingredHamb.add(ingredientes);
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas, ingredHamb, numMesa,precio);
       
//        mesaSeleccionada.getNumeroMesa();        
//        mesa.getPrecio();
//        mesa.getIngredientes();
    }//GEN-LAST:event_CebollaActionPerformed

    private void ChampinionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChampinionesActionPerformed
        int precio = 4;
        precioTotal += precio;
        
        ingredientes.add("Champiniones");
        //ingredHamb.add(ingredientes);
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas, ingredHamb, numMesa,precio);
       
//        mesaSeleccionada.getNumeroMesa();        
//        mesa.getPrecio();
//        mesa.getIngredientes();
    }//GEN-LAST:event_ChampinionesActionPerformed

    private void HambDeluxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HambDeluxeActionPerformed
       // tipo hamburguesa: Hamburguesa Deluxe
       // precio: 35$ * cantidad

        int cantidadHD = Integer.parseInt(HambDeluxe.getSelectedItem().toString());   
        int precio = 35 * cantidadHD;
        precioTotal += precio;
        hamburguesas.add(6);//"Hamburguesa Deluxe"
        
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas,ingredHamb, numMesa,precio);
//       
//        mesaSeleccionada.getNumeroMesa();
//        mesa.getHamburguesas();
//        
//        mesa.getPrecio();
        

        
    }//GEN-LAST:event_HambDeluxeActionPerformed

    private void ordenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenarActionPerformed

        
        // ahora esta informacion se la envia al controlador de simulacion para que el
        // controlador simulacion se la envie a salon
        if (!ingredientes.isEmpty()){ //
            precioTotal += 5;
            Mesa mesaSeleccionada = mesas[fila][columna];
            numMesa = mesaSeleccionada.getNumeroMesa();
            Mesa ordenMesa= new Mesa(hamburguesas,ingredHamb, numMesa,precioTotal);
           
            // FINAL 
            controlador.guardarInfoOrden(ordenMesa);
            dispose();// cierra la ventana al presionar el boton
        }
        else{
            Mesa mesaSeleccionada = mesas[fila][columna];
            numMesa = mesaSeleccionada.getNumeroMesa();
            Mesa ordenMesa= new Mesa(hamburguesas,ingredHamb, numMesa,precioTotal);
            
            // FINAL 
            controlador.guardarInfoOrden(ordenMesa);
            dispose();// cierra la ventana al presionar el boton
        }
        if(precioTotal == 0){ // no se ordeno nada
            JOptionPane.showMessageDialog(null, "Debe hacer un pedido");

        }
//        if(numMesa == 0 ){ // no se selecciono la mesa
//            JOptionPane.showMessageDialog(null, "Debe seleccionar una mesa");
//        }
        

    }//GEN-LAST:event_ordenarActionPerformed

    private void HambRegularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HambRegularActionPerformed
       // tipo hamburguesa: Hamburguesa Regular 
       // precio: 10$ * cantidad

        int cantidadHR = Integer.parseInt(HambRegular.getSelectedItem().toString());   
        int precio = 10 * cantidadHR;
        precioTotal += precio;
        hamburguesas.add(1);//"Hamburguesa Regular"
        
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas,ingredHamb, numMesa,precio);
       
//        mesaSeleccionada.getNumeroMesa();
//        mesa.getHamburguesas();
//        
//        mesa.getPrecio();
        
        //System.out.println(cantidadHR);

        
    }//GEN-LAST:event_HambRegularActionPerformed

    private void HambQuesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HambQuesoActionPerformed
        
       // tipo hamburguesa: Hamburguesa de Queso
       // precio: 15$ * cantidad

        int cantidadHQ = Integer.parseInt(HambQueso.getSelectedItem().toString());   
        int precio = 15 * cantidadHQ;
        precioTotal += precio;
        hamburguesas.add(2);//"Hamburguesa de Queso"
        
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas,ingredHamb, numMesa, precio);
       
//        mesaSeleccionada.getNumeroMesa();
//        mesa.getHamburguesas();
//        mesa.getPrecio();
        
        //mesa
       // System.out.println(cantidadHQ);

    }//GEN-LAST:event_HambQuesoActionPerformed

    private void HambPolloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HambPolloActionPerformed
      // tipo hamburguesa: Hamburguesa de Pollo
       // precio: 15$ * cantidad

        int cantidadHP = Integer.parseInt(HambPollo.getSelectedItem().toString());   
        int precio = 15 * cantidadHP;
        precioTotal += precio;
        hamburguesas.add(3);//"Hamburguesa de Pollo"
        
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas,ingredHamb, numMesa,precio);
//       
//        mesaSeleccionada.getNumeroMesa();
//        mesa.getHamburguesas();
//        
//        mesa.getPrecio();
        
        //System.out.println(cantidadHR);

        




    }//GEN-LAST:event_HambPolloActionPerformed

    private void HambVeganaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HambVeganaActionPerformed
       
           // tipo hamburguesa: Hamburguesa Vegana 
           // precio: 25$ * cantidad

        int cantidadHV = Integer.parseInt(HambVegana.getSelectedItem().toString());   
        int precio = 25 * cantidadHV;
        precioTotal += precio;
        hamburguesas.add(4);//"Hamburguesa Vegana"
        
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas, ingredHamb,numMesa,precio);
       
//        mesaSeleccionada.getNumeroMesa();
//        mesa.getHamburguesas();
//        mesa.getPrecio();
        
        //System.out.println(cantidadHR);

        
    }//GEN-LAST:event_HambVeganaActionPerformed

    private void HambCamaronesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HambCamaronesActionPerformed
        // tipo hamburguesa: HamburguesaCamarones 
       // precio: 25$ * cantidad

        int cantidadHC = Integer.parseInt(HambCamarones.getSelectedItem().toString());   
        int precio = 25 * cantidadHC;
        precioTotal += precio;
        hamburguesas.add(5 );//"Hamburguesa de Camarones"
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas, ingredHamb, numMesa,precio);
       
//        mesaSeleccionada.getNumeroMesa();
//        mesa.getHamburguesas();
//        
//        mesa.getPrecio();
                
    }//GEN-LAST:event_HambCamaronesActionPerformed

    private void TocinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TocinoActionPerformed
        // Ingrediente: Tocino 
        // precio:  3$ 
        int precio =  3;
        precioTotal += precio;
        
        ingredientes.add("Tocino");
        //ingredHamb.add(ingredientes);
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas, ingredHamb, numMesa,precio);
       
//        mesaSeleccionada.getNumeroMesa();        
//        mesa.getPrecio();
//        mesa.getIngredientes();

        
    }//GEN-LAST:event_TocinoActionPerformed

    private void QuesoChedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuesoChedarActionPerformed
        // Ingrediente: QuesoChedar
        // precio:  3$ 
        int precio = 3;
        precioTotal += precio;
        
        
        ingredientes.add("Queso Chedar");
        //ingredHamb.add(ingredientes);
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas, ingredHamb, numMesa,precio);
       
//        mesaSeleccionada.getNumeroMesa();        
//        mesa.getPrecio();
//        mesa.getIngredientes();

        
    }//GEN-LAST:event_QuesoChedarActionPerformed

    private void PepinilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PepinilloActionPerformed
        // Ingrediente: Pepinillo
        // precio:  5$ 
        int precio = 5;
        precioTotal += precio;
        
        ingredientes.add("Pepinillos");
       // ingredHamb.add(ingredientes);
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas,ingredHamb , numMesa,precio);
       
       // mesaSeleccionada.getNumeroMesa();        
       // mesa.getPrecio();
       // mesa.getIngredientes();       
       
    }//GEN-LAST:event_PepinilloActionPerformed

    private void agregarPersonaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarPersonaliActionPerformed
        // AGREGA UNA LISTA DE INGREDIENTES A LA LISTA DE INGREDIENTES DE INGREDIENTES
        
        
        Tocino.setSelected(false);
        ExtraTorta.setSelected(false);
        Champiniones.setSelected(false);
        Pepinillo.setSelected(false);
        QuesoChedar.setSelected(false);
        Cebolla.setSelected(false);
        ingredHamb.add(ingredientes);
        ingredientes = new ArrayList<>(); 
        Mesa mesaSeleccionada = mesas[fila][columna];
        Mesa mesa = new Mesa(hamburguesas, ingredHamb, numMesa,precioTotal);  
        
        
        
        
        
    }//GEN-LAST:event_agregarPersonaliActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Cebolla;
    private javax.swing.JCheckBox Champiniones;
    private javax.swing.JCheckBox ExtraTorta;
    private javax.swing.JComboBox<String> HambCamarones;
    private javax.swing.JComboBox<String> HambDeluxe;
    private javax.swing.JComboBox<String> HambPollo;
    private javax.swing.JComboBox<String> HambQueso;
    private javax.swing.JComboBox<String> HambRegular;
    private javax.swing.JComboBox<String> HambVegana;
    private javax.swing.JCheckBox Pepinillo;
    private javax.swing.JCheckBox QuesoChedar;
    private javax.swing.JCheckBox Tocino;
    private javax.swing.JToggleButton agregarPersonali;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton ordenar;
    private javax.swing.JPanel panelHamb;
    private javax.swing.JPanel panelMesas;
    // End of variables declaration//GEN-END:variables
}
class ImagenFondo extends JPanel{
        // Atributos
        private Image imagen;    
         // metodos
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("VistaOrde.png")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
}
