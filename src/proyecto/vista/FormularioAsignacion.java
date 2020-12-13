package proyecto.vista;

import java.util.ArrayList;
import proyecto.clases.conexion.DepartamentoBD;
import proyecto.clases.conexion.EmpleadoBD;
import proyecto.clases.conexion.GerenteBD;
import proyecto.clases.conexion.SucursalBD;
import proyecto.clases.conexion.SupervisorBD;
import proyecto.clases.conexion.TrabajadorBD;
import proyecto.clases.conexion.TurnoBD;
import proyecto.clases.principales.Empleado;
import proyecto.clases.principales.Gerente;
import proyecto.clases.principales.Supervisor;
import proyecto.clases.principales.Trabajador;

public class FormularioAsignacion extends javax.swing.JFrame {

    TurnoBD turno_bd = new TurnoBD();
    EmpleadoBD empleado_bd = new EmpleadoBD();
    SucursalBD sucursal_bd = new SucursalBD();
    DepartamentoBD departamento_bd = new DepartamentoBD();
    TrabajadorBD trabajador_bd = new TrabajadorBD();
    GerenteBD gerente_bd = new GerenteBD();
    SupervisorBD supervisor_bd = new SupervisorBD();

    public FormularioAsignacion() {
        initComponents();
        box_departamento.setEnabled(false);
        box_sucursal.setEnabled(false);
        box_turno.setEnabled(false);
        tabla.setEnabled(false);
        this.actalizarBoxDepartamentos();
        this.actalizarBoxSucursales();
        this.actalizarBoxTurnos();
        this.mostrarBusquedaEmpleadoSinAsignar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        atras = new javax.swing.JButton();
        box_sucursal = new javax.swing.JComboBox();
        box_turno = new javax.swing.JComboBox();
        radio_supervisor = new javax.swing.JRadioButton();
        radio_gerente = new javax.swing.JRadioButton();
        radio_trabajador = new javax.swing.JRadioButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        box_departamento = new javax.swing.JComboBox();
        boton_asignar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        dato_busqueda = new javax.swing.JTextField();
        boton_consulta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setExtendedState(6);
        setForeground(new java.awt.Color(51, 204, 0));

        jPanel1.setBackground(new java.awt.Color(81, 96, 115));

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        box_sucursal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una Sucursal" }));

        box_turno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione un Turno" }));

        buttonGroup1.add(radio_supervisor);
        radio_supervisor.setText("Supervisor");
        radio_supervisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_supervisorActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_gerente);
        radio_gerente.setText("Gerente");
        radio_gerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_gerenteActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_trabajador);
        radio_trabajador.setText("Trabajador");
        radio_trabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_trabajadorActionPerformed(evt);
            }
        });

        encabezado.setBackground(new java.awt.Color(20, 52, 75));

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Asignacion de Puesto de Trabajo");
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

        box_departamento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Departamento" }));

        boton_asignar.setText("Asignar");
        boton_asignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_asignarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Numero de Empleado", "Nombre", "Primer Apellido", "Segundo Apellido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(255, 0, 0));
        tabla.setRowHeight(30);
        tabla.setSelectionBackground(new java.awt.Color(51, 255, 51));
        tabla.setSelectionForeground(new java.awt.Color(255, 102, 0));
        jScrollPane3.setViewportView(tabla);

        dato_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dato_busquedaKeyReleased(evt);
            }
        });

        boton_consulta.setText("Actualizar Tabla");
        boton_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(141, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radio_trabajador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radio_supervisor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radio_gerente))
                            .addComponent(box_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(box_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_asignar)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dato_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(boton_consulta))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_consulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_supervisor)
                            .addComponent(radio_trabajador)
                            .addComponent(radio_gerente))
                        .addGap(56, 56, 56)
                        .addComponent(box_sucursal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(box_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(box_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(atras)
                            .addComponent(boton_asignar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(72, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(978, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_asignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_asignarActionPerformed
        if (radio_trabajador.isSelected()) {
            Trabajador trabajador = new Trabajador();
            trabajador.setId_empleado(empleado_bd.listarBusquedaDeEmpleados(tabla.getValueAt(tabla.getSelectedRow(), 0).toString()).get(0).getId_empleado());
            trabajador.setId_departamento(departamento_bd.listarBusquedaDeDepartamentos(box_departamento.getSelectedItem().toString()).get(0).getId_departamento());
            trabajador.setId_sucursal(sucursal_bd.listarBusquedaDeSucursales(box_sucursal.getSelectedItem().toString()).get(0).getId_sucursal());
            trabajador.setId_turno(box_turno.getSelectedItem().toString());
            trabajador_bd.altaTrabajador(trabajador);
        }
        if (radio_gerente.isSelected()) {
            Gerente gerente = new Gerente();
            gerente.setId_empleado(empleado_bd.listarBusquedaDeEmpleados(tabla.getValueAt(tabla.getSelectedRow(),0).toString()).get(0).getId_empleado());
            gerente.setId_sucursal(sucursal_bd.listarBusquedaDeSucursales(box_sucursal.getSelectedItem().toString()).get(0).getId_sucursal());
            gerente.setId_turno(box_turno.getSelectedItem().toString());
            gerente_bd.altaGerente(gerente);
        }
        if (radio_supervisor.isSelected()) {
            Supervisor supervisor = new Supervisor();
            supervisor.setId_empleado(empleado_bd.listarBusquedaDeEmpleados(tabla.getValueAt(tabla.getSelectedRow(), 0).toString()).get(0).getId_empleado());
            supervisor.setId_sucursal(sucursal_bd.listarBusquedaDeSucursales(box_sucursal.getSelectedItem().toString()).get(0).getId_sucursal());
            supervisor.setId_turno(box_turno.getSelectedItem().toString());
            supervisor_bd.altaSupervisor(supervisor);
        }
        mostrarBusquedaEmpleadoSinAsignar();
    }//GEN-LAST:event_boton_asignarActionPerformed

    private void radio_trabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_trabajadorActionPerformed
        box_sucursal.setEnabled(true);
        box_turno.setEnabled(true);
        box_departamento.setEnabled(true);
        tabla.setEnabled(true);
    }//GEN-LAST:event_radio_trabajadorActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasActionPerformed

    private void radio_supervisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_supervisorActionPerformed
        box_sucursal.setEnabled(true);
        box_turno.setEnabled(true);
        tabla.setEnabled(true);
        box_departamento.setEnabled(false);    }//GEN-LAST:event_radio_supervisorActionPerformed

    private void radio_gerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_gerenteActionPerformed
        box_sucursal.setEnabled(true);
        box_turno.setEnabled(true);
        tabla.setEnabled(true);
        box_departamento.setEnabled(false);    }//GEN-LAST:event_radio_gerenteActionPerformed

    private void dato_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dato_busquedaKeyReleased
        this.mostrarBusquedaEmpleadoSinAsignar();
    }//GEN-LAST:event_dato_busquedaKeyReleased

    private void boton_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultaActionPerformed
        this.mostrarBusquedaEmpleadoSinAsignar();
    }//GEN-LAST:event_boton_consultaActionPerformed

    private void actalizarBoxDepartamentos() {
        for (int i = 0; i < departamento_bd.listarTodosLosDepartamentos().size(); i++) {
            box_departamento.addItem(departamento_bd.listarTodosLosDepartamentos().get(i).getNombre());
        }
    }

    private void actalizarBoxSucursales() {
        for (int i = 0; i < sucursal_bd.listarTodasLasSucursales().size(); i++) {
            box_sucursal.addItem(sucursal_bd.listarTodasLasSucursales().get(i).getNombre());
        }
    }

    private void actalizarBoxTurnos() {
        for (int i = 0; i < turno_bd.listarTodosLosTurnos().size(); i++) {
            box_turno.addItem(turno_bd.listarTodosLosTurnos().get(i).getId_turno());
        }
    }

    public void mostrarBusquedaEmpleadoSinAsignar() {
        ArrayList<Empleado> lista = empleado_bd.listarBusquedaDeEmpleadosSinAsignar(dato_busqueda.getText());
        Object[][] objetos = new Object[lista.size()][8];
        for (int i = 0; i < lista.size(); i++) {
            objetos[i][0] = lista.get(i).getId_empleado();
            objetos[i][1] = lista.get(i).getNombre();
            objetos[i][2] = lista.get(i).getPrimer_apellido();
            objetos[i][3] = lista.get(i).getSegundo_apellido();
            objetos[i][4] = lista.get(i).getTelefono();
            objetos[i][5] = lista.get(i).getCorreo();
            objetos[i][6] = lista.get(i).getDireccion();
            objetos[i][7] = lista.get(i).getClave();
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                objetos, new String[]{
                    "No. Empleado", "Nombre", "Primer Apellido", "Segundo Apellido", "Telefono", "Correo", "Dirección", "Clave"
                }
        ));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton boton_asignar;
    private javax.swing.JButton boton_consulta;
    private javax.swing.JComboBox box_departamento;
    private javax.swing.JComboBox box_sucursal;
    private javax.swing.JComboBox box_turno;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dato_busqueda;
    private javax.swing.JPanel encabezado;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton radio_gerente;
    private javax.swing.JRadioButton radio_supervisor;
    private javax.swing.JRadioButton radio_trabajador;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
