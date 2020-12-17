//INTEGRANTES: JUAN DE DIOS ZARATE GARCES, RICARDO ANGEL ALVAREZ MACEDO, DIEGO IVAN GONZALES ALEMAN Y HUGO ALEJANDRO FLORES HERNANDEZ
package proyecto.vista;

import java.util.ArrayList;
import proyecto.clases.conexion.TurnoBD;
import proyecto.clases.principales.Turno;

public class FormularioTurno extends javax.swing.JFrame {

    TurnoBD turno_bd = new TurnoBD();

    public FormularioTurno() {
        initComponents();
        this.mostrarBusquedaDeTurno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JPanel();
        boton_atras = new javax.swing.JButton();
        boton_registrar = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        dato_turno = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        boton_remover = new javax.swing.JButton();
        boton_cambiar = new javax.swing.JButton();
        boton_consulta = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        dato_hora_inicial = new javax.swing.JFormattedTextField();
        dato_hora_final = new javax.swing.JFormattedTextField();
        dato_busqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setExtendedState(6);
        setForeground(new java.awt.Color(51, 204, 0));

        Registro.setBackground(new java.awt.Color(255, 255, 255));

        boton_atras.setForeground(new java.awt.Color(51, 51, 255));
        boton_atras.setText("Atras");
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });

        boton_registrar.setForeground(new java.awt.Color(51, 51, 255));
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
        titulo.setText("Formulario de Turnos");
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

        dato_turno.setBackground(new java.awt.Color(51, 51, 51));
        dato_turno.setForeground(new java.awt.Color(204, 204, 204));
        dato_turno.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("Identificacion de Turno ➤");

        tabla.setBackground(new java.awt.Color(204, 204, 255));
        tabla.setForeground(new java.awt.Color(204, 204, 255));
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

        boton_remover.setForeground(new java.awt.Color(102, 102, 255));
        boton_remover.setText("Remover");
        boton_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_removerActionPerformed(evt);
            }
        });

        boton_cambiar.setForeground(new java.awt.Color(51, 51, 255));
        boton_cambiar.setText("Cambiar");
        boton_cambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cambiarActionPerformed(evt);
            }
        });

        boton_consulta.setForeground(new java.awt.Color(51, 51, 255));
        boton_consulta.setText("Consultar Todos Los Turno");
        boton_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultaActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 255));
        jLabel25.setText("Hora Inicial ➤");

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 255));
        jLabel26.setText("Hora Final ➤");

        dato_hora_inicial.setBackground(new java.awt.Color(51, 51, 51));
        dato_hora_inicial.setForeground(new java.awt.Color(255, 255, 255));
        try {
            dato_hora_inicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dato_hora_final.setBackground(new java.awt.Color(51, 51, 51));
        dato_hora_final.setForeground(new java.awt.Color(255, 255, 255));
        try {
            dato_hora_final.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        dato_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dato_busquedaKeyReleased(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/turno.jpg"))); // NOI18N

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_cambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63))
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dato_hora_final, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dato_turno, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dato_hora_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(190, 190, 190)))
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_remover)
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addComponent(dato_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boton_consulta)))
                        .addGap(169, 169, 169))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(jScrollPane3)
                        .addGap(44, 44, 44))))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_consulta)
                            .addComponent(dato_busqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_remover)
                        .addContainerGap())
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(dato_turno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(dato_hora_inicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(dato_hora_final, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(124, 124, 124)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_registrar)
                            .addComponent(boton_cambiar)
                            .addComponent(boton_atras))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(19, 19, 19))))
        );

        getContentPane().add(Registro, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1106, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_cambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cambiarActionPerformed
        Turno turno = new Turno();
        turno.setId_turno(dato_turno.getText());
        turno.setHora_inicial(dato_hora_inicial.getText());
        turno.setHora_final(dato_hora_final.getText());
        turno_bd.cambioTurno(turno, (String) tabla.getValueAt(tabla.getSelectedRow(), 0));
        this.mostrarBusquedaDeTurno();
    }//GEN-LAST:event_boton_cambiarActionPerformed

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_atrasActionPerformed

    private void boton_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultaActionPerformed
        this.mostrarBusquedaDeTurno();
    }//GEN-LAST:event_boton_consultaActionPerformed

    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarActionPerformed
        Turno turno = new Turno();
        turno.setId_turno(dato_turno.getText());
        turno.setHora_inicial(dato_hora_inicial.getText());
        turno.setHora_final(dato_hora_final.getText());
        turno_bd.altaTurno(turno);
        this.mostrarBusquedaDeTurno();
    }//GEN-LAST:event_boton_registrarActionPerformed

    private void boton_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_removerActionPerformed
        turno_bd.bajaTurno((String) tabla.getValueAt(tabla.getSelectedRow(), 0));
        this.mostrarBusquedaDeTurno();
    }//GEN-LAST:event_boton_removerActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        dato_turno.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 0));
        dato_hora_inicial.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 1));
        dato_hora_final.setText((String) tabla.getValueAt(tabla.getSelectedRow(), 2));
    }//GEN-LAST:event_tablaMouseClicked

    private void dato_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dato_busquedaKeyReleased
        this.mostrarBusquedaDeTurno();
    }//GEN-LAST:event_dato_busquedaKeyReleased

    public void mostrarBusquedaDeTurno() {
        ArrayList<Turno> lista = turno_bd.listarBusquedaDeTurnos(dato_busqueda.getText());
        Object[][] objetos = new Object[lista.size()][3];
        for (int i = 0; i < lista.size(); i++) {
            objetos[i][0] = lista.get(i).getId_turno();
            objetos[i][1] = lista.get(i).getHora_inicial();
            objetos[i][2] = lista.get(i).getHora_final();
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                objetos, new String[]{
                    "Turno", "Hora Inicial", "Hora Final"
                }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Registro;
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton boton_cambiar;
    private javax.swing.JButton boton_consulta;
    private javax.swing.JButton boton_registrar;
    private javax.swing.JButton boton_remover;
    private javax.swing.JTextField dato_busqueda;
    private javax.swing.JFormattedTextField dato_hora_final;
    private javax.swing.JFormattedTextField dato_hora_inicial;
    private javax.swing.JTextField dato_turno;
    private javax.swing.JPanel encabezado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
