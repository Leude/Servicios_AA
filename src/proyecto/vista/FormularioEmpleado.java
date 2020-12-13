package proyecto.vista;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyecto.clases.conexion.EmpleadoBD;
import proyecto.clases.principales.Empleado;

public class FormularioEmpleado extends javax.swing.JFrame {

    EmpleadoBD empleado_bd = new EmpleadoBD();

    public FormularioEmpleado() {
        initComponents();
        this.mostrarBusquedaEmpleado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JPanel();
        boton_atras = new javax.swing.JButton();
        boton_registrar = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        dato_nombre = new javax.swing.JTextField();
        dato_primer_apellido = new javax.swing.JTextField();
        dato_segundo_apellido = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dato_telefono = new javax.swing.JTextField();
        dato_correo = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        dato_direccion = new javax.swing.JTextField();
        boton_generar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        boton_remover = new javax.swing.JButton();
        boton_cambiar = new javax.swing.JButton();
        boton_consulta = new javax.swing.JButton();
        dato_clave = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        dato_busqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setExtendedState(6);
        setForeground(new java.awt.Color(51, 204, 0));

        Registro.setBackground(new java.awt.Color(81, 96, 115));

        boton_atras.setText("Atras");
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });

        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        encabezado.setBackground(new java.awt.Color(20, 52, 75));

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Formulario de Empleados");
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

        dato_nombre.setBackground(new java.awt.Color(51, 51, 51));
        dato_nombre.setForeground(new java.awt.Color(204, 204, 204));
        dato_nombre.setCaretColor(new java.awt.Color(255, 255, 255));

        dato_primer_apellido.setBackground(new java.awt.Color(51, 51, 51));
        dato_primer_apellido.setForeground(new java.awt.Color(204, 204, 204));
        dato_primer_apellido.setCaretColor(new java.awt.Color(255, 255, 255));
        dato_primer_apellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        dato_segundo_apellido.setBackground(new java.awt.Color(51, 51, 51));
        dato_segundo_apellido.setForeground(new java.awt.Color(204, 204, 204));
        dato_segundo_apellido.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Nombre ➤");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Primer Apellido ➤");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Segundo Apellido ➤");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(204, 204, 204));
        jLabel22.setText("Correo Electronico ➤");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(204, 204, 204));
        jLabel23.setText("Telefono ➤");

        dato_telefono.setBackground(new java.awt.Color(51, 51, 51));
        dato_telefono.setForeground(new java.awt.Color(204, 204, 204));
        dato_telefono.setCaretColor(new java.awt.Color(255, 255, 255));

        dato_correo.setBackground(new java.awt.Color(51, 51, 51));
        dato_correo.setForeground(new java.awt.Color(204, 204, 204));
        dato_correo.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(204, 204, 204));
        jLabel24.setText("Clave ➤");

        dato_direccion.setBackground(new java.awt.Color(51, 51, 51));
        dato_direccion.setForeground(new java.awt.Color(204, 204, 204));
        dato_direccion.setCaretColor(new java.awt.Color(255, 255, 255));

        boton_generar.setText("Generar");
        boton_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_generarActionPerformed(evt);
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabla);

        boton_remover.setText("Remover");
        boton_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_removerActionPerformed(evt);
            }
        });

        boton_cambiar.setText("Cambiar");
        boton_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cambiarActionPerformed(evt);
            }
        });

        boton_consulta.setText("Consultar Todos Los Empleado");
        boton_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultaActionPerformed(evt);
            }
        });

        dato_clave.setBackground(new java.awt.Color(51, 51, 51));
        dato_clave.setForeground(new java.awt.Color(204, 204, 204));
        dato_clave.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(204, 204, 204));
        jLabel25.setText("Dirección ➤");

        dato_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dato_busquedaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dato_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato_primer_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato_segundo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(dato_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_generar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(36, 36, 36)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(boton_remover)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addComponent(dato_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(boton_consulta)
                        .addGap(44, 44, 44))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addContainerGap())))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(dato_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(dato_primer_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(dato_segundo_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(dato_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(dato_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dato_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dato_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(boton_generar))
                        .addGap(43, 43, 43)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_registrar)
                            .addComponent(boton_cambiar)
                            .addComponent(boton_atras))
                        .addGap(0, 208, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_consulta)
                            .addComponent(dato_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_remover)
                        .addContainerGap())))
        );

        getContentPane().add(Registro, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1151, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_generarActionPerformed
        String[] symbols = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        int length = 10;
        Random random = null;
        try {
            random = SecureRandom.getInstanceStrong(); // as of JDK 8, this should return the strongest algorithm available to the JVM
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(FormularioEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int indexRandom = random.nextInt(symbols.length);
            sb.append(symbols[indexRandom]);
        }
        String password = sb.toString();
        dato_clave.setText(password);
    }//GEN-LAST:event_boton_generarActionPerformed

    private void boton_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cambiarActionPerformed
        Empleado empleado = new Empleado();
        empleado.setNombre(dato_nombre.getText());
        empleado.setPrimer_apellido(dato_primer_apellido.getText());
        empleado.setSegundo_apellido(dato_segundo_apellido.getText());
        empleado.setTelefono(dato_telefono.getText());
        empleado.setCorreo(dato_correo.getText());
        empleado.setDireccion(dato_direccion.getText());
        empleado.setClave(dato_clave.getText());
        empleado_bd.cambioEmpleado(empleado, tabla.getValueAt(tabla.getSelectedRow(), 0));
        this.mostrarBusquedaEmpleado();

    }//GEN-LAST:event_boton_cambiarActionPerformed

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_atrasActionPerformed

    private void boton_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultaActionPerformed
        this.mostrarBusquedaEmpleado();
    }//GEN-LAST:event_boton_consultaActionPerformed

    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarActionPerformed
        Empleado empleado = new Empleado();
        empleado.setNombre(dato_nombre.getText());
        empleado.setPrimer_apellido(dato_primer_apellido.getText());
        empleado.setSegundo_apellido(dato_segundo_apellido.getText());
        empleado.setTelefono(dato_telefono.getText());
        empleado.setCorreo(dato_correo.getText());
        empleado.setDireccion(dato_direccion.getText());
        empleado.setClave(dato_clave.getText());
        empleado_bd.altaEmpleado(empleado);
        this.mostrarBusquedaEmpleado();
    }//GEN-LAST:event_boton_registrarActionPerformed

    private void boton_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_removerActionPerformed
        empleado_bd.bajaEmpleado(tabla.getValueAt(tabla.getSelectedRow(), 0));
        this.mostrarBusquedaEmpleado();
    }//GEN-LAST:event_boton_removerActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        dato_nombre.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 1));
        dato_primer_apellido.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 2));
        dato_segundo_apellido.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 3));
        dato_telefono.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 4));
        dato_correo.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 5));
        dato_direccion.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 6));
        dato_clave.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 7));
    }//GEN-LAST:event_tablaMouseClicked

    private void dato_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dato_busquedaKeyReleased
        this.mostrarBusquedaEmpleado();
    }//GEN-LAST:event_dato_busquedaKeyReleased

    public void mostrarBusquedaEmpleado() {
        ArrayList<Empleado> lista = empleado_bd.listarBusquedaDeEmpleados(dato_busqueda.getText());
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
    private javax.swing.JPanel Registro;
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton boton_cambiar;
    private javax.swing.JButton boton_consulta;
    private javax.swing.JButton boton_generar;
    private javax.swing.JButton boton_registrar;
    private javax.swing.JButton boton_remover;
    private javax.swing.JTextField dato_busqueda;
    private javax.swing.JTextField dato_clave;
    private javax.swing.JTextField dato_correo;
    private javax.swing.JTextField dato_direccion;
    private javax.swing.JTextField dato_nombre;
    private javax.swing.JTextField dato_primer_apellido;
    private javax.swing.JTextField dato_segundo_apellido;
    private javax.swing.JTextField dato_telefono;
    private javax.swing.JPanel encabezado;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
