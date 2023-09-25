package com.moretto.kilometraje.igu;

import com.moretto.kilometraje.entidades.Empleado;
import com.moretto.kilometraje.entidades.Vehiculo;
import com.moretto.kilometraje.logica.Controladora;
import java.util.Calendar;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class AgregarRegistro extends javax.swing.JFrame {

    Controladora controladora = null;
    
    public AgregarRegistro() {
        controladora = new Controladora();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        panelKm = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        inputKm = new javax.swing.JTextField();
        panelKm1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        inputChofer = new javax.swing.JComboBox<>();
        panelKm2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        inputAcompaniante = new javax.swing.JComboBox<>();
        panelKm3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        inputVehiculo = new javax.swing.JComboBox<>();
        panelBotones = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        panelKm4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        inputFecha = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kmActualesOutput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        titulo.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 36)); // NOI18N
        titulo.setText("Agregar Registro");

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
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputKm, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelKmLayout.setVerticalGroup(
            panelKmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKmLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelKmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputKm, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelKm1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel6.setText("Seleccione el chofer: ");

        inputChofer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelKm1Layout = new javax.swing.GroupLayout(panelKm1);
        panelKm1.setLayout(panelKm1Layout);
        panelKm1Layout.setHorizontalGroup(
            panelKm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKm1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelKm1Layout.setVerticalGroup(
            panelKm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKm1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelKm1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputChofer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelKm2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel7.setText("Seleccione el acompañante: ");

        inputAcompaniante.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelKm2Layout = new javax.swing.GroupLayout(panelKm2);
        panelKm2.setLayout(panelKm2Layout);
        panelKm2Layout.setHorizontalGroup(
            panelKm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKm2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputAcompaniante, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelKm2Layout.setVerticalGroup(
            panelKm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKm2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelKm2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputAcompaniante, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelKm3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel8.setText("Seleccione el vehiculo: ");

        inputVehiculo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        inputVehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                inputVehiculoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelKm3Layout = new javax.swing.GroupLayout(panelKm3);
        panelKm3.setLayout(panelKm3Layout);
        panelKm3Layout.setHorizontalGroup(
            panelKm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKm3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelKm3Layout.setVerticalGroup(
            panelKm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKm3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelKm3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(0, 14, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        panelKm4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel9.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 24)); // NOI18N
        jLabel9.setText("Seleccione la fecha: ");

        inputFecha.setDateFormatString("d MMM yyyy");
        inputFecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout panelKm4Layout = new javax.swing.GroupLayout(panelKm4);
        panelKm4.setLayout(panelKm4Layout);
        panelKm4Layout.setHorizontalGroup(
            panelKm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKm4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(inputFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelKm4Layout.setVerticalGroup(
            panelKm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelKm4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelKm4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kilometros vehiculo");

        kmActualesOutput.setEditable(false);
        kmActualesOutput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kmActualesOutput)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kmActualesOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(405, 405, 405)
                        .addComponent(titulo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelKm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelKm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelKm2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelKm3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelKm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titulo)
                .addGap(18, 18, 18)
                .addComponent(panelKm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelKm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelKm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelKm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelKm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
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

    private void inputKmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputKmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputKmActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            Double kmFinales = Double.parseDouble(inputKm.getText());
            
            String patente = extraerPatente((String) inputVehiculo.getSelectedItem());
            Vehiculo vehiculo = controladora.buscarVehiculo(patente);
            
            Integer dniChofer = extraerDni((String) inputChofer.getSelectedItem());
            Empleado chofer = controladora.buscarEmpleado(dniChofer);
            
            Empleado acompaniante;
            if(inputAcompaniante.getSelectedItem().equals("")) {
                acompaniante = null;
            } else {
                Integer dniAcompaniante = extraerDni((String) inputAcompaniante.getSelectedItem());
                acompaniante = controladora.buscarEmpleado(dniAcompaniante);
            }
            
            System.out.println(acompaniante);
            
            Calendar fechaRegistro = inputFecha.getCalendar();
            
            Double kmRegistro = kmFinales - vehiculo.getKilometrosVehiculo();
            
            if (confirmarEntrada("Desea guardar el registro", "Confirmar") == 1) {
                if(kmFinales >= vehiculo.getKilometrosVehiculo()) {
                    controladora.guardarRegistro(fechaRegistro, vehiculo, chofer, acompaniante, kmFinales, kmRegistro);
                    controladora.actualizarKmVehiculo(vehiculo, kmFinales);

                    mostrarMensaje("Registro guardado con exito", "Info", "Guardado exitoso");
                    limparCampos();
                } else {
                    mostrarMensaje("Los kilometros no pueden ser menores a los kilometros que ya tiene el vehiculo", "Error", "Error al cargar");
                }
            }    
        } catch (Exception e) {
            mostrarMensaje("Revise los campos", "Error", "Error al cargar");
        }
        
        
        
        
        
        
        
        

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        cargarListadoPersonal();
        cargarListadoVehiculos();
    }//GEN-LAST:event_formWindowOpened

    private void inputVehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_inputVehiculoItemStateChanged
        // TODO add your handling code here:
        if(!inputChofer.getSelectedItem().equals("")) {
            String patente = extraerPatente((String) inputVehiculo.getSelectedItem());
            Vehiculo vehiculo = controladora.buscarVehiculo(patente);
            kmActualesOutput.setText(vehiculo.getKilometrosVehiculo().toString());
        }
        
        
    }//GEN-LAST:event_inputVehiculoItemStateChanged

    
    // Metodos extra
    
    private void cargarListadoPersonal(){
        inputChofer.addItem("");
        inputAcompaniante.addItem("");
        List<Empleado> listaEmpleados = controladora.buscarListaEmpleados();
        for (Empleado empleado : listaEmpleados) {
            inputChofer.addItem(empleado.getNombre() + " " + empleado.getApellido() + " (" + empleado.getDni() + ")");
            inputAcompaniante.addItem(empleado.getNombre() + " " + empleado.getApellido() + " (" + empleado.getDni() + ")");
        }
        
        
    }
    
    private void cargarListadoVehiculos(){
        inputVehiculo.addItem("");
        List<Vehiculo> listaVehiculos = controladora.buscarListaVehiculos();
        for (Vehiculo vehiculo : listaVehiculos) {
            inputVehiculo.addItem(vehiculo.getMarca() + " " + vehiculo.getModelo() + " (" + vehiculo.getPatente() + ")");
        }
    }
    
    private String extraerPatente(String vehiculo){
        int startIndex = vehiculo.lastIndexOf("(") + 1;
        int endIndex = vehiculo.lastIndexOf(")");
        String patente;
        
        if(startIndex >= 0 && endIndex >= 0) {
            patente = vehiculo.substring(startIndex, endIndex);
        } else {
            patente = null;
        }
        
        return patente;
    }
    
    private Integer extraerDni(String empleado) {
        int startIndex = empleado.lastIndexOf("(") + 1;
        int endIndex = empleado.lastIndexOf(")");
        Integer dni;
        
        if(startIndex >= 0 && endIndex >= 0) {
            dni = Integer.parseInt(empleado.substring(startIndex, endIndex));
        } else {
            dni = null;
        }
        return dni;
    }
    
    private void limparCampos() {
        inputKm.setText("");
        inputVehiculo.setSelectedIndex(0);
        inputChofer.setSelectedIndex(0);
        inputAcompaniante.setSelectedIndex(0);
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
    private javax.swing.JComboBox<String> inputAcompaniante;
    private javax.swing.JComboBox<String> inputChofer;
    private com.toedter.calendar.JDateChooser inputFecha;
    private javax.swing.JTextField inputKm;
    private javax.swing.JComboBox<String> inputVehiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField kmActualesOutput;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelKm;
    private javax.swing.JPanel panelKm1;
    private javax.swing.JPanel panelKm2;
    private javax.swing.JPanel panelKm3;
    private javax.swing.JPanel panelKm4;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
