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
        reporte_empleados = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setForeground(new java.awt.Color(51, 204, 0));

        jPanel1.setBackground(new java.awt.Color(81, 96, 115));

        empleados.setText("-¬ Formularios para empleados");
        empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadosActionPerformed(evt);
            }
        });

        sucursales.setText("-¬ Formularios para sucursales");
        sucursales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalesActionPerformed(evt);
            }
        });

        turnos.setText("-¬ Formularios para turnos");
        turnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnosActionPerformed(evt);
            }
        });

        departamentos.setText("-¬ Formularios para departamentos");
        departamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamentosActionPerformed(evt);
            }
        });

        asignacion.setText("-¬ Formularios de asignacion");
        asignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignacionActionPerformed(evt);
            }
        });

        control_asistencias.setText("| ° | Control de asistencia");
        control_asistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                control_asistenciasActionPerformed(evt);
            }
        });

        reporte_asistencias.setText("| ° | Reporte de asistencia");
        reporte_asistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_asistenciasActionPerformed(evt);
            }
        });

        reporte_sucursales.setText("/T\\ Reporte de sucursales");

        reporte_empleados.setText("+* Reporte de los empleados asignados por turno");
        reporte_empleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporte_empleadosActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirMouseClicked(evt);
            }
        });

        encabezado.setBackground(new java.awt.Color(20, 52, 75));

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Menu");
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
                .addGap(36, 36, 36)
                .addComponent(titulo)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(empleados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(departamentos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sucursales, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(turnos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(asignacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(reporte_empleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reporte_asistencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(control_asistencias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reporte_sucursales, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(salir)
                .addContainerGap(376, Short.MAX_VALUE))
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleados)
                    .addComponent(control_asistencias))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sucursales))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(reporte_asistencias)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(departamentos)
                        .addGap(18, 18, 18)
                        .addComponent(turnos))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(reporte_empleados)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asignacion)
                    .addComponent(reporte_sucursales))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(48, 48, 48))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(718, 448));
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

    private void reporte_empleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporte_empleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reporte_empleadosActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asignacion;
    private javax.swing.JButton control_asistencias;
    private javax.swing.JButton departamentos;
    private javax.swing.JButton empleados;
    private javax.swing.JPanel encabezado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reporte_asistencias;
    private javax.swing.JButton reporte_empleados;
    private javax.swing.JButton reporte_sucursales;
    private javax.swing.JButton salir;
    private javax.swing.JButton sucursales;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton turnos;
    // End of variables declaration//GEN-END:variables
}
