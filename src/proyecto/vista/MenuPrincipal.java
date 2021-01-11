//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ
package proyecto.vista;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        empleados = new javax.swing.JButton();
        sucursales = new javax.swing.JButton();
        turnos = new javax.swing.JButton();
        departamentos = new javax.swing.JButton();
        asignacion = new javax.swing.JButton();
        control_asistencias = new javax.swing.JButton();
        reporte_asistencias = new javax.swing.JButton();
        reporte_sucursales = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        boton_salir = new javax.swing.JButton();
        reporte_asistencias1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setExtendedState(6);
        setForeground(new java.awt.Color(51, 204, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        empleados.setBackground(new java.awt.Color(255, 255, 255));
        empleados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        empleados.setForeground(new java.awt.Color(51, 51, 255));
        empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/empleado.jpg"))); // NOI18N
        empleados.setText("-¬ Formularios para empleados");
        empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosActionPerformed(evt);
            }
        });

        sucursales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sucursales.setForeground(new java.awt.Color(0, 0, 255));
        sucursales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sucursal2.png"))); // NOI18N
        sucursales.setText("-¬ Formularios para sucursales");
        sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalesActionPerformed(evt);
            }
        });

        turnos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        turnos.setForeground(new java.awt.Color(0, 0, 255));
        turnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/turno.jpg"))); // NOI18N
        turnos.setText("-¬ Formularios para turnos");
        turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnosActionPerformed(evt);
            }
        });

        departamentos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        departamentos.setForeground(new java.awt.Color(0, 0, 255));
        departamentos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/departamento.png"))); // NOI18N
        departamentos.setText("-¬ Formularios para departamentos");
        departamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentosActionPerformed(evt);
            }
        });

        asignacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        asignacion.setForeground(new java.awt.Color(51, 51, 255));
        asignacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asignacion.png"))); // NOI18N
        asignacion.setText("-¬ Formularios de asignacion");
        asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignacionActionPerformed(evt);
            }
        });

        control_asistencias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        control_asistencias.setForeground(new java.awt.Color(51, 51, 255));
        control_asistencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asistencia.png"))); // NOI18N
        control_asistencias.setText("| ° | Control de asistencia");
        control_asistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                control_asistenciasActionPerformed(evt);
            }
        });

        reporte_asistencias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reporte_asistencias.setForeground(new java.awt.Color(102, 102, 255));
        reporte_asistencias.setText("| ° | Reporte de Asistencia");
        reporte_asistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_asistenciasActionPerformed(evt);
            }
        });

        reporte_sucursales.setText("/T\\ Reporte de sucursales");

        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        encabezado.setBackground(new java.awt.Color(20, 52, 75));

        titulo.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Menu Principal");
        titulo.setAlignmentY(0.0F);
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout encabezadoLayout = new javax.swing.GroupLayout(encabezado);
        encabezado.setLayout(encabezadoLayout);
        encabezadoLayout.setHorizontalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        encabezadoLayout.setVerticalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        boton_salir.setBackground(new java.awt.Color(0, 0, 255));
        boton_salir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        boton_salir.setText("Salir");
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });

        reporte_asistencias1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reporte_asistencias1.setForeground(new java.awt.Color(102, 102, 255));
        reporte_asistencias1.setText("| ° | Reporte de Empleados");
        reporte_asistencias1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_asistencias1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(396, 396, 396))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(reporte_sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(departamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reporte_asistencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asignacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                            .addComponent(control_asistencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(reporte_asistencias1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(asignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(control_asistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reporte_asistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1544, 1544, 1544)
                        .addComponent(reporte_sucursales)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salir)
                        .addGap(168, 168, 168))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sucursales, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(boton_salir))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(departamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(reporte_asistencias1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1327, 1121));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadosActionPerformed
        FormularioEmpleado fe = new FormularioEmpleado();
        fe.setVisible(true);
        dispose();
    }//GEN-LAST:event_empleadosActionPerformed

    private void turnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnosActionPerformed
        FormularioTurno ft = new FormularioTurno();
        ft.setVisible(true);
        dispose();
    }//GEN-LAST:event_turnosActionPerformed

    private void asignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignacionActionPerformed
        FormularioAsignacion fa = new FormularioAsignacion();
        fa.setVisible(true);
        dispose();
    }//GEN-LAST:event_asignacionActionPerformed

    private void salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseClicked
        LoginSistema login = new LoginSistema();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_salirMouseClicked

    private void sucursalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalesActionPerformed
        FormularioSucursal fs = new FormularioSucursal();
        fs.setVisible(true);
        dispose();
    }//GEN-LAST:event_sucursalesActionPerformed

    private void departamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamentosActionPerformed
        FormularioDepartamento fd = new FormularioDepartamento();
        fd.setVisible(true);
        dispose();
    }//GEN-LAST:event_departamentosActionPerformed

    private void control_asistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_control_asistenciasActionPerformed
        SistemaAsistencia sa = new SistemaAsistencia();
        sa.setVisible(true);
        dispose();
    }//GEN-LAST:event_control_asistenciasActionPerformed

    private void reporte_asistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_asistenciasActionPerformed
        ReporteAsistencia ra = new ReporteAsistencia();
        ra.setVisible(true);
        dispose();
    }//GEN-LAST:event_reporte_asistenciasActionPerformed

    private void reporte_asistencias1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_asistencias1ActionPerformed
        ReporteEmpleado rse = new ReporteEmpleado();
        rse.setVisible(true);
        dispose();
    }//GEN-LAST:event_reporte_asistencias1ActionPerformed

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
        LoginSistema login = new LoginSistema();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignacion;
    private javax.swing.JButton boton_salir;
    private javax.swing.JButton control_asistencias;
    private javax.swing.JButton departamentos;
    private javax.swing.JButton empleados;
    private javax.swing.JPanel encabezado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reporte_asistencias;
    private javax.swing.JButton reporte_asistencias1;
    private javax.swing.JButton reporte_sucursales;
    private javax.swing.JButton salir;
    private javax.swing.JButton sucursales;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton turnos;
    // End of variables declaration//GEN-END:variables
}
