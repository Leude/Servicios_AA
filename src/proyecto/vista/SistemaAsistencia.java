package proyecto.vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.clases.conexion.AsistenciaBD;
import proyecto.clases.conexion.EmpleadoBD;
import proyecto.clases.conexion.TurnoBD;
import proyecto.clases.principales.Empleado;

public class SistemaAsistencia extends javax.swing.JFrame {

    EmpleadoBD empleado_bd = new EmpleadoBD();
    AsistenciaBD asistencia_bd = new AsistenciaBD();

    public SistemaAsistencia() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dato_clave = new javax.swing.JPasswordField();
        boton_registrar_salida = new javax.swing.JButton();
        imagen_01 = new javax.swing.JLabel();
        rSLabelHora1 = new rojeru_san.RSLabelHora();
        boton_atras1 = new javax.swing.JButton();
        boton_registrar_entrqada = new javax.swing.JButton();
        dato_numero_empleado = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setExtendedState(6);
        setForeground(new java.awt.Color(51, 204, 0));
        setName("frame"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(51, 51, 255));

        jLabel4.setBackground(new java.awt.Color(51, 51, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Control de Asistencia");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("No. Empleado");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("Clave:");

        dato_clave.setBackground(new java.awt.Color(204, 204, 255));
        dato_clave.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dato_clave.setForeground(new java.awt.Color(179, 177, 177));
        dato_clave.setCaretColor(new java.awt.Color(255, 255, 255));
        dato_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato_claveActionPerformed(evt);
            }
        });

        boton_registrar_salida.setBackground(new java.awt.Color(255, 255, 255));
        boton_registrar_salida.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        boton_registrar_salida.setForeground(new java.awt.Color(51, 51, 255));
        boton_registrar_salida.setText("Registrar Hora de Salida");
        boton_registrar_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_salidaActionPerformed(evt);
            }
        });

        rSLabelHora1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        rSLabelHora1.setForeground(new java.awt.Color(0, 204, 0));
        rSLabelHora1.setAlignmentX(0.9F);
        rSLabelHora1.setFont(new java.awt.Font("Roboto Bold", 1, 48)); // NOI18N

        boton_atras1.setForeground(new java.awt.Color(0, 51, 255));
        boton_atras1.setText("Atras");
        boton_atras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atras1ActionPerformed(evt);
            }
        });

        boton_registrar_entrqada.setBackground(new java.awt.Color(255, 255, 255));
        boton_registrar_entrqada.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        boton_registrar_entrqada.setForeground(new java.awt.Color(0, 51, 255));
        boton_registrar_entrqada.setText("Registrar Hora de Entrada");
        boton_registrar_entrqada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_entrqadaActionPerformed(evt);
            }
        });

        dato_numero_empleado.setBackground(new java.awt.Color(204, 204, 255));
        dato_numero_empleado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#"))));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/turno.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(dato_numero_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(89, 89, 89)
                                .addComponent(dato_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(imagen_01)
                        .addGap(0, 925, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(boton_atras1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_registrar_salida)
                        .addGap(112, 112, 112)
                        .addComponent(boton_registrar_entrqada))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(154, 154, 154)
                        .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)
                        .addComponent(imagen_01))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato_numero_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato_clave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar_entrqada)
                    .addComponent(boton_registrar_salida)
                    .addComponent(boton_atras1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1009, 694));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_registrar_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_salidaActionPerformed
        int id;
        String clave;
        boolean bo = false;
        if (dato_numero_empleado.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el numero de empleado");
        } else {
            id = Integer.parseInt(dato_numero_empleado.getText());
            clave = new String(dato_clave.getPassword());
            ArrayList<Empleado> e = empleado_bd.listarBusquedaDeEmpleadosAsignados("");
            for (int i = 0; i < empleado_bd.listarBusquedaDeEmpleadosAsignados("").size(); i++) {
                if (clave.equals(e.get(i).getClave()) && id == e.get(i).getId_empleado()) {
                    asistencia_bd.salidaAsistencia(e.get(i).getId_empleado());
                    bo = true;
                }
            }
            if (bo == false) {

                JOptionPane.showMessageDialog(this, "El usuario o clave incorrecta");

            }
        }
    }//GEN-LAST:event_boton_registrar_salidaActionPerformed

    private void dato_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato_claveActionPerformed
        this.boton_registrar_entrqadaActionPerformed(evt);
    }//GEN-LAST:event_dato_claveActionPerformed

    private void boton_atras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atras1ActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_atras1ActionPerformed

    private void boton_registrar_entrqadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_entrqadaActionPerformed
        int id;
        String clave;
        boolean bo = false;
        if (dato_numero_empleado.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el numero de empleado");
        } else {
            id = Integer.parseInt(dato_numero_empleado.getText());
            clave = new String(dato_clave.getPassword());
            ArrayList<Empleado> e = empleado_bd.listarBusquedaDeEmpleadosAsignados("");
            for (int i = 0; i < empleado_bd.listarBusquedaDeEmpleadosAsignados("").size(); i++) {
                if (clave.equals(e.get(i).getClave()) && id == e.get(i).getId_empleado()) {
                    asistencia_bd.entradaAsistencia(e.get(i).getId_empleado());

                    bo = true;
                }
            }
            if (bo == false) {

                JOptionPane.showMessageDialog(this, "El usuario o clave incorrecta");

            }
        }
    }//GEN-LAST:event_boton_registrar_entrqadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_atras1;
    private javax.swing.JButton boton_registrar_entrqada;
    private javax.swing.JButton boton_registrar_salida;
    private javax.swing.JPasswordField dato_clave;
    private javax.swing.JFormattedTextField dato_numero_empleado;
    private javax.swing.JLabel imagen_01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private rojeru_san.RSLabelHora rSLabelHora1;
    // End of variables declaration//GEN-END:variables
}
