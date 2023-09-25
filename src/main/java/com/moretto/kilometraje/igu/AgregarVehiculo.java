package com.moretto.kilometraje.igu;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import com.moretto.kilometraje.logica.Controladora;

public class AgregarVehiculo extends javax.swing.JFrame {

    Controladora controladora = null;
    
    public AgregarVehiculo() {
        controladora = new Controladora();
        initComponents();
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelPatente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputPatente = new javax.swing.JTextField();
        panelMarca = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        inputMarca = new javax.swing.JTextField();
        panelModelo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        inputModelo = new javax.swing.JTextField();
        panelKm = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        inputKm = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1195, 745));

        titulo.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 36)); // NOI18N
        titulo.setText("Agregar Vehiculo");

        panelPatente.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel2.setText("Ingrese la patente: ");

        inputPatente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inputPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPatenteActionPerformed(evt);
            }
        });
        inputPatente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputPatenteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelPatenteLayout = new javax.swing.GroupLayout(panelPatente);
        panelPatente.setLayout(panelPatenteLayout);
        panelPatenteLayout.setHorizontalGroup(
            panelPatenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPatenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(inputPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelPatenteLayout.setVerticalGroup(
            panelPatenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPatenteLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelPatenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelMarca.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel3.setText("Ingrese la marca: ");

        inputMarca.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inputMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputMarcaActionPerformed(evt);
            }
        });
        inputMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputMarcaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelMarcaLayout = new javax.swing.GroupLayout(panelMarca);
        panelMarca.setLayout(panelMarcaLayout);
        panelMarcaLayout.setHorizontalGroup(
            panelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcaLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelMarcaLayout.setVerticalGroup(
            panelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMarcaLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelMarcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelModelo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel4.setText("Ingrese el modelo: ");

        inputModelo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inputModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputModeloActionPerformed(evt);
            }
        });
        inputModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                inputModeloKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panelModeloLayout = new javax.swing.GroupLayout(panelModelo);
        panelModelo.setLayout(panelModeloLayout);
        panelModeloLayout.setHorizontalGroup(
            panelModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModeloLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelModeloLayout.setVerticalGroup(
            panelModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModeloLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelModeloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        panelKm.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel5.setText("Ingrese los Kilometros: ");

        inputKm.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inputKm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputKmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelKmLayout = new javax.swing.GroupLayout(panelKm);
        panelKm.setLayout(panelKmLayout);
        panelKmLayout.setHorizontalGroup(
            panelKmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(43, 43, 43)
                .addComponent(inputKm, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelKmLayout.setVerticalGroup(
            panelKmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKmLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelKmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputKm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/escoba.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volver.png"))); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(422, 422, 422)
                .addComponent(titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelKm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPatente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(panelPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPatenteActionPerformed

    private void inputMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMarcaActionPerformed

    private void inputModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputModeloActionPerformed

    private void inputKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputKmActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void inputPatenteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPatenteKeyReleased
        // TODO add your handling code here:
        eliminarEspacio(inputPatente);
        
    }//GEN-LAST:event_inputPatenteKeyReleased

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:       
        try {
            String patente = inputPatente.getText();
            String marca = inputMarca.getText();
            String modelo = inputModelo.getText();
            Double km = Double.parseDouble(inputKm.getText());

            if (confirmarEntrada("Desea guardar el vehiculo", "Confirmar") == 1) {
                if(controladora.buscarVehiculo(patente) == null) {
                    controladora.guardarVehiculo(patente, marca, modelo, km);
                    mostrarMensaje("Vehiculo guardado con exito", "Info", "Guardado exitoso");
                    limparCampos();
                } else {
                    mostrarMensaje("Ya existe un vehiculo con esa patente cargado", "Error", "Error al cargar");
                } 
            }
        } catch (Exception e) {
            mostrarMensaje("Error al cargar, verifique los campos", "Error", "Error al cargar");
        }
        
        
        
 
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void inputMarcaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputMarcaKeyReleased
        // TODO add your handling code here:
        eliminarEspacio(inputMarca);
    }//GEN-LAST:event_inputMarcaKeyReleased

    private void inputModeloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputModeloKeyReleased
        // TODO add your handling code here:
        eliminarEspacio(inputModelo);
    }//GEN-LAST:event_inputModeloKeyReleased

    
    private void eliminarEspacio(JTextField campoTexto) {
        String texto = campoTexto.getText();
        texto = texto.replace(" ", "").toUpperCase();
        campoTexto.setText(texto);
        
    }
    
    private void limparCampos() {
        inputKm.setText("");
        inputMarca.setText("");
        inputModelo.setText("");
        inputPatente.setText("");
    }
   
    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if(tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private Integer confirmarEntrada(String mensaje, String titulo) {
        Object [] opciones = {"Si", "No"};
        JOptionPane optionPane = new JOptionPane(mensaje);
        optionPane.setOptionType(JOptionPane.YES_NO_OPTION);
        optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        optionPane.setOptions(opciones);
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
        Object valorSeleccionado = optionPane.getValue();
        if(valorSeleccionado != null) {
            if(valorSeleccionado.toString().equals("Si")) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JTextField inputKm;
    private javax.swing.JTextField inputMarca;
    private javax.swing.JTextField inputModelo;
    private javax.swing.JTextField inputPatente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelKm;
    private javax.swing.JPanel panelMarca;
    private javax.swing.JPanel panelModelo;
    private javax.swing.JPanel panelPatente;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
