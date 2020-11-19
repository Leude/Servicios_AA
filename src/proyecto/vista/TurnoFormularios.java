package proyecto.vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.clases.conexion.TurnoBD;
import proyecto.clases.principales.Turno;

public class TurnoFormularios extends javax.swing.JFrame {

    TurnoBD turno_bd = new TurnoBD();

    public TurnoFormularios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Turnos = new javax.swing.JTabbedPane();
        Registro = new javax.swing.JPanel();
        boton_volver = new javax.swing.JButton();
        boton_registrar_registro = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dato_nombre_registro = new javax.swing.JTextField();
        dato_hora_inicial_registro = new javax.swing.JFormattedTextField();
        dato_hora_final_registro = new javax.swing.JFormattedTextField();
        Bajas = new javax.swing.JPanel();
        boton_remover_baja = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        encabezado2 = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        dato_nombre_baja = new javax.swing.JTextField();
        Cambios = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        boton_actualizar_cambio = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        encabezado3 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        dato_nombre_cambio = new javax.swing.JTextField();
        dato_nombre_antes_cambio = new javax.swing.JTextField();
        dato_hora_inicial_cambio = new javax.swing.JFormattedTextField();
        dato_hora_final_cambio = new javax.swing.JFormattedTextField();
        Consulta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_turnos = new javax.swing.JTable();
        boton_consultar_consulta = new javax.swing.JButton();
        boton_consultar_todos_consulta = new javax.swing.JButton();
        encabezado1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        dato_nombre_consulta = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setForeground(new java.awt.Color(51, 204, 0));

        Registro.setBackground(new java.awt.Color(81, 96, 115));

        boton_volver.setText("Atras");
        boton_volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_volverMouseClicked(evt);
            }
        });

        boton_registrar_registro.setText("Registrar");
        boton_registrar_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_registrar_registroMouseClicked(evt);
            }
        });

        encabezado.setBackground(new java.awt.Color(20, 52, 75));

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registro de Turno");
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

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Nombre de Identificacion del Turno ➤");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Hora Inicial ➤");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Hora Final ➤");

        try {
            dato_hora_inicial_registro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dato_hora_inicial_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato_hora_inicial_registroActionPerformed(evt);
            }
        });

        try {
            dato_hora_final_registro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dato_hora_final_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato_hora_final_registroActionPerformed(evt);
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
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(boton_volver, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_registrar_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dato_hora_inicial_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dato_nombre_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dato_hora_final_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99)))
                .addContainerGap())
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dato_nombre_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(dato_hora_inicial_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(dato_hora_final_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar_registro)
                    .addComponent(boton_volver))
                .addGap(205, 205, 205))
        );

        Turnos.addTab("Registro", Registro);

        Bajas.setBackground(new java.awt.Color(81, 96, 115));

        boton_remover_baja.setText("Remover");
        boton_remover_baja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_remover_bajaMouseClicked(evt);
            }
        });
        boton_remover_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_remover_bajaActionPerformed(evt);
            }
        });

        jLabel18.setText("Identificacion de Turno:");

        encabezado2.setBackground(new java.awt.Color(20, 52, 75));

        titulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Remover Turno");
        titulo2.setAlignmentY(0.0F);
        titulo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout encabezado2Layout = new javax.swing.GroupLayout(encabezado2);
        encabezado2.setLayout(encabezado2Layout);
        encabezado2Layout.setHorizontalGroup(
            encabezado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        encabezado2Layout.setVerticalGroup(
            encabezado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titulo2)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BajasLayout = new javax.swing.GroupLayout(Bajas);
        Bajas.setLayout(BajasLayout);
        BajasLayout.setHorizontalGroup(
            BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BajasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boton_remover_baja)
                .addGap(286, 286, 286))
            .addGroup(BajasLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel18)
                .addContainerGap(282, Short.MAX_VALUE))
            .addComponent(encabezado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BajasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dato_nombre_baja)
                .addGap(19, 19, 19))
        );
        BajasLayout.setVerticalGroup(
            BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BajasLayout.createSequentialGroup()
                .addComponent(encabezado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(dato_nombre_baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215)
                .addComponent(boton_remover_baja)
                .addContainerGap(210, Short.MAX_VALUE))
        );

        Turnos.addTab("Bajas", Bajas);

        Cambios.setBackground(new java.awt.Color(81, 96, 115));

        jLabel10.setText("Identificacion Turno ➤");

        boton_actualizar_cambio.setText("Actualizar");
        boton_actualizar_cambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_actualizar_cambioMouseClicked(evt);
            }
        });

        jLabel11.setText("Pone el nombre o numero de empleado para modificar ese empleado");

        jLabel12.setText("Actualize los datos aqui:");

        jLabel13.setText("Identificacion Turno ➤");

        jLabel14.setText("Hora Inicial ➤");

        jLabel15.setText("Hora Final ➤");

        encabezado3.setBackground(new java.awt.Color(20, 52, 75));

        titulo3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo3.setForeground(new java.awt.Color(255, 255, 255));
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3.setText("Actualizacion de datos del Empleado");
        titulo3.setAlignmentY(0.0F);
        titulo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout encabezado3Layout = new javax.swing.GroupLayout(encabezado3);
        encabezado3.setLayout(encabezado3Layout);
        encabezado3Layout.setHorizontalGroup(
            encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        encabezado3Layout.setVerticalGroup(
            encabezado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titulo3)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        try {
            dato_hora_inicial_cambio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dato_hora_inicial_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato_hora_inicial_cambioActionPerformed(evt);
            }
        });

        try {
            dato_hora_final_cambio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dato_hora_final_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato_hora_final_cambioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CambiosLayout = new javax.swing.GroupLayout(Cambios);
        Cambios.setLayout(CambiosLayout);
        CambiosLayout.setHorizontalGroup(
            CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(98, 98, 98)
                        .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dato_hora_inicial_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dato_hora_final_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dato_nombre_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 265, Short.MAX_VALUE))
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(CambiosLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(37, 37, 37)
                                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(dato_nombre_antes_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(encabezado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_actualizar_cambio)
                .addGap(145, 145, 145))
        );
        CambiosLayout.setVerticalGroup(
            CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiosLayout.createSequentialGroup()
                .addComponent(encabezado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato_nombre_antes_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dato_nombre_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(dato_hora_inicial_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dato_hora_final_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(boton_actualizar_cambio)
                .addGap(142, 142, 142))
        );

        Turnos.addTab("Cambios", Cambios);

        Consulta.setBackground(new java.awt.Color(81, 96, 115));

        jLabel6.setText("Identidwaficacion del Turno:");

        tabla_turnos.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_turnos.setGridColor(new java.awt.Color(255, 0, 0));
        tabla_turnos.setRowHeight(30);
        tabla_turnos.setSelectionBackground(new java.awt.Color(51, 255, 51));
        tabla_turnos.setSelectionForeground(new java.awt.Color(255, 102, 0));
        jScrollPane2.setViewportView(tabla_turnos);

        boton_consultar_consulta.setText("Consultar");
        boton_consultar_consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_consultar_consultaMouseClicked(evt);
            }
        });

        boton_consultar_todos_consulta.setText("Consultar a Todos");
        boton_consultar_todos_consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_consultar_todos_consultaMouseClicked(evt);
            }
        });
        boton_consultar_todos_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultar_todos_consultaActionPerformed(evt);
            }
        });

        encabezado1.setBackground(new java.awt.Color(20, 52, 75));

        titulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Consulta de Turnos");
        titulo1.setAlignmentY(0.0F);
        titulo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout encabezado1Layout = new javax.swing.GroupLayout(encabezado1);
        encabezado1.setLayout(encabezado1Layout);
        encabezado1Layout.setHorizontalGroup(
            encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        encabezado1Layout.setVerticalGroup(
            encabezado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezado1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titulo1)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ConsultaLayout = new javax.swing.GroupLayout(Consulta);
        Consulta.setLayout(ConsultaLayout);
        ConsultaLayout.setHorizontalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaLayout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dato_nombre_consulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_consultar_consulta)
                .addGap(26, 26, 26)
                .addComponent(boton_consultar_todos_consulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ConsultaLayout.setVerticalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addComponent(encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton_consultar_consulta)
                        .addComponent(boton_consultar_todos_consulta))
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dato_nombre_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        Turnos.addTab("Consultas", Consulta);

        getContentPane().add(Turnos, java.awt.BorderLayout.PAGE_START);

        setSize(new java.awt.Dimension(753, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_actualizar_cambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizar_cambioMouseClicked
        Turno turno = new Turno();
        turno.setId_turno(dato_nombre_cambio.getText());
        turno.setHora_inicial(dato_hora_inicial_cambio.getText());
        turno.setHora_final(dato_hora_final_cambio.getText());
        turno_bd.cambioTurno(turno, dato_nombre_antes_cambio.getText());
    }//GEN-LAST:event_boton_actualizar_cambioMouseClicked

    private void boton_remover_bajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_remover_bajaMouseClicked
        if (dato_nombre_baja.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay informacion en el numero de empleado");
        } else {
            turno_bd.bajaTurno(dato_nombre_baja.getText());
        }
    }//GEN-LAST:event_boton_remover_bajaMouseClicked

    private void boton_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_volverMouseClicked
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_volverMouseClicked

    private void boton_registrar_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrar_registroMouseClicked
        Turno turno = new Turno();
        turno.setId_turno(dato_nombre_registro.getText());
        turno.setHora_inicial(dato_hora_inicial_registro.getText());
        turno.setHora_final(dato_hora_final_registro.getText());
        turno_bd.altaTurno(turno);
    }//GEN-LAST:event_boton_registrar_registroMouseClicked

    private void boton_consultar_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_consultar_consultaMouseClicked
        this.mostrarConsultaTabla();
    }//GEN-LAST:event_boton_consultar_consultaMouseClicked

    private void boton_consultar_todos_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_consultar_todos_consultaMouseClicked
        this.mostrarTodosLosTurno();
    }//GEN-LAST:event_boton_consultar_todos_consultaMouseClicked

    private void dato_hora_inicial_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato_hora_inicial_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dato_hora_inicial_registroActionPerformed

    private void dato_hora_final_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato_hora_final_registroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dato_hora_final_registroActionPerformed

    private void dato_hora_inicial_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato_hora_inicial_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dato_hora_inicial_cambioActionPerformed

    private void dato_hora_final_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato_hora_final_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dato_hora_final_cambioActionPerformed

    private void boton_remover_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_remover_bajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_remover_bajaActionPerformed

    private void boton_consultar_todos_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultar_todos_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_consultar_todos_consultaActionPerformed

    public void mostrarTodosLosTurno() {
        ArrayList<Turno> lista = turno_bd.listarTodosLosTurnos();
        Object[][] objetos = new Object[lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            objetos[i][0] = lista.get(i).getId_turno();
            objetos[i][1] = lista.get(i).getHora_inicial();
            objetos[i][2] = lista.get(i).getHora_final();

        }
        tabla_turnos.setModel(new javax.swing.table.DefaultTableModel(
                objetos, new String[]{
                    "Numero de Turno", "Hora Inicial", "Hora Final"
                }
        ));
    }

    public void mostrarConsultaTabla() {

        ArrayList<Turno> lista = turno_bd.consultaTurno(dato_nombre_consulta.getText());
        Object[][] objetos = new Object[lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            objetos[i][0] = lista.get(i).getId_turno();
            objetos[i][1] = lista.get(i).getHora_inicial();
            objetos[i][2] = lista.get(i).getHora_final();

        }
        tabla_turnos.setModel(new javax.swing.table.DefaultTableModel(
                objetos, new String[]{
                    "Numero de Turno", "Hora Inicial", "Hora Final"
                }
        ));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bajas;
    private javax.swing.JPanel Cambios;
    private javax.swing.JPanel Consulta;
    private javax.swing.JPanel Registro;
    private javax.swing.JTabbedPane Turnos;
    private javax.swing.JButton boton_actualizar_cambio;
    private javax.swing.JButton boton_consultar_consulta;
    private javax.swing.JButton boton_consultar_todos_consulta;
    private javax.swing.JButton boton_registrar_registro;
    private javax.swing.JButton boton_remover_baja;
    private javax.swing.JButton boton_volver;
    private javax.swing.JFormattedTextField dato_hora_final_cambio;
    private javax.swing.JFormattedTextField dato_hora_final_registro;
    private javax.swing.JFormattedTextField dato_hora_inicial_cambio;
    private javax.swing.JFormattedTextField dato_hora_inicial_registro;
    private javax.swing.JTextField dato_nombre_antes_cambio;
    private javax.swing.JTextField dato_nombre_baja;
    private javax.swing.JTextField dato_nombre_cambio;
    private javax.swing.JTextField dato_nombre_consulta;
    private javax.swing.JTextField dato_nombre_registro;
    private javax.swing.JPanel encabezado;
    private javax.swing.JPanel encabezado1;
    private javax.swing.JPanel encabezado2;
    private javax.swing.JPanel encabezado3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_turnos;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
