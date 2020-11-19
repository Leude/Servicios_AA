package proyecto.vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.clases.conexion.EmpleadoBD;
import proyecto.clases.principales.Empleado;

public class EmpleadoFormularios extends javax.swing.JFrame {

    EmpleadoBD empleado_bd = new EmpleadoBD();

    public EmpleadoFormularios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Empleados = new javax.swing.JTabbedPane();
        Registro = new javax.swing.JPanel();
        boton_atras = new javax.swing.JButton();
        boton_registrar_registro = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        dato_nombre_registro = new javax.swing.JTextField();
        dato_primer_apellido_registro = new javax.swing.JTextField();
        dato_segundo_apellido_registro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Consulta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_empleados = new javax.swing.JTable();
        boton_consultar_consulta = new javax.swing.JButton();
        boton_consultar_todos_consulta = new javax.swing.JButton();
        encabezado1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        dato_numero_consulta = new javax.swing.JFormattedTextField();
        Bajas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        boton_remover_baja = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        encabezado2 = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        dato_numero_baja = new javax.swing.JFormattedTextField();
        Cambios = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        boton_actualizar_cambio = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dato_nombre_cambio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dato_primer_apellido_cambio = new javax.swing.JTextField();
        dato_segundo_apellido_cambio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        encabezado3 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        dato_numero_cambio = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setForeground(new java.awt.Color(51, 204, 0));

        Registro.setBackground(new java.awt.Color(81, 96, 115));

        boton_atras.setText("Atras");
        boton_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_atrasMouseClicked(evt);
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
        titulo.setText("Registro de Empleado");
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

        dato_nombre_registro.setBackground(new java.awt.Color(51, 51, 51));
        dato_nombre_registro.setForeground(new java.awt.Color(204, 204, 204));
        dato_nombre_registro.setCaretColor(new java.awt.Color(255, 255, 255));

        dato_primer_apellido_registro.setBackground(new java.awt.Color(51, 51, 51));
        dato_primer_apellido_registro.setForeground(new java.awt.Color(204, 204, 204));
        dato_primer_apellido_registro.setCaretColor(new java.awt.Color(255, 255, 255));
        dato_primer_apellido_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        dato_segundo_apellido_registro.setBackground(new java.awt.Color(51, 51, 51));
        dato_segundo_apellido_registro.setForeground(new java.awt.Color(204, 204, 204));
        dato_segundo_apellido_registro.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Nombre:");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Primer Apellido:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Segundo Apellido:");

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_registrar_registro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104))
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dato_primer_apellido_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dato_nombre_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dato_segundo_apellido_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 141, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(dato_nombre_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(dato_primer_apellido_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(dato_segundo_apellido_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar_registro)
                    .addComponent(boton_atras))
                .addGap(205, 205, 205))
        );

        Empleados.addTab("Registros", Registro);

        Consulta.setBackground(new java.awt.Color(81, 96, 115));

        jLabel6.setText("No. Empleado:");

        jLabel5.setText("Puedes ver los datos de cualquier empleado");

        tabla_empleados.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla_empleados.setGridColor(new java.awt.Color(255, 0, 0));
        tabla_empleados.setRowHeight(30);
        tabla_empleados.setSelectionBackground(new java.awt.Color(51, 255, 51));
        tabla_empleados.setSelectionForeground(new java.awt.Color(255, 102, 0));
        jScrollPane2.setViewportView(tabla_empleados);

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

        encabezado1.setBackground(new java.awt.Color(20, 52, 75));

        titulo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo1.setForeground(new java.awt.Color(255, 255, 255));
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Consulta de Empleados");
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

        dato_numero_consulta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        javax.swing.GroupLayout ConsultaLayout = new javax.swing.GroupLayout(Consulta);
        Consulta.setLayout(ConsultaLayout);
        ConsultaLayout.setHorizontalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ConsultaLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(50, 50, 50)
                                .addComponent(dato_numero_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(boton_consultar_consulta)
                                .addGap(45, 45, 45)
                                .addComponent(boton_consultar_todos_consulta))
                            .addComponent(jLabel5)))
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        ConsultaLayout.setVerticalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addComponent(encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_consultar_consulta)
                    .addComponent(boton_consultar_todos_consulta)
                    .addComponent(jLabel6)
                    .addComponent(dato_numero_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );

        Empleados.addTab("Consultas", Consulta);

        Bajas.setBackground(new java.awt.Color(81, 96, 115));

        jLabel17.setText("Nota Adicional:");

        boton_remover_baja.setText("Remover");
        boton_remover_baja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_remover_bajaMouseClicked(evt);
            }
        });

        jLabel18.setText("Numero de Empleado:");

        encabezado2.setBackground(new java.awt.Color(20, 52, 75));

        titulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Remover Empleado");
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

        dato_numero_baja.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        javax.swing.GroupLayout BajasLayout = new javax.swing.GroupLayout(Bajas);
        Bajas.setLayout(BajasLayout);
        BajasLayout.setHorizontalGroup(
            BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BajasLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
            .addComponent(encabezado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BajasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BajasLayout.createSequentialGroup()
                        .addComponent(boton_remover_baja)
                        .addGap(286, 286, 286))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BajasLayout.createSequentialGroup()
                        .addGroup(BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, BajasLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(dato_numero_baja, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(281, 281, 281))))
        );
        BajasLayout.setVerticalGroup(
            BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BajasLayout.createSequentialGroup()
                .addComponent(encabezado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(dato_numero_baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel17)
                .addGap(36, 36, 36)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(boton_remover_baja)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        Empleados.addTab("Bajas", Bajas);

        Cambios.setBackground(new java.awt.Color(81, 96, 115));

        jLabel10.setText("No. Empleado:");

        boton_actualizar_cambio.setText("Actualizar");
        boton_actualizar_cambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_actualizar_cambioMouseClicked(evt);
            }
        });
        boton_actualizar_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizar_cambioActionPerformed(evt);
            }
        });

        jLabel11.setText("Pone el nombre o numero de empleado para modificar ese empleado");

        jLabel12.setText("Actualize los datos aqui:");

        jLabel13.setText("Nombre:");

        jLabel14.setText("Primer Apellido:");

        jLabel15.setText("Segundo Apellido:");

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

        dato_numero_cambio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("####"))));

        javax.swing.GroupLayout CambiosLayout = new javax.swing.GroupLayout(Cambios);
        Cambios.setLayout(CambiosLayout);
        CambiosLayout.setHorizontalGroup(
            CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CambiosLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel12))
                            .addGroup(CambiosLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(dato_numero_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(191, 382, Short.MAX_VALUE))
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(58, 58, 58)
                                .addComponent(dato_primer_apellido_cambio))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(91, 91, 91)
                                .addComponent(dato_nombre_cambio)))
                        .addGap(178, 178, 178))
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CambiosLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(dato_segundo_apellido_cambio)
                                .addGap(178, 178, 178))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(boton_actualizar_cambio)
                                .addGap(141, 141, 141))))))
            .addComponent(encabezado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        CambiosLayout.setVerticalGroup(
            CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiosLayout.createSequentialGroup()
                .addComponent(encabezado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dato_numero_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel12)
                .addGap(40, 40, 40)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(dato_nombre_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(dato_primer_apellido_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dato_segundo_apellido_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(boton_actualizar_cambio)
                .addGap(128, 128, 128))
        );

        Empleados.addTab("Cambios", Cambios);

        getContentPane().add(Empleados, java.awt.BorderLayout.PAGE_START);

        setSize(new java.awt.Dimension(695, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_actualizar_cambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizar_cambioMouseClicked
        if (dato_numero_cambio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay informacion en el numero de empleado");
        } else {
            Empleado empleado = new Empleado();
            empleado.setNombre(dato_nombre_cambio.getText());
            empleado.setPrimer_apellido(dato_primer_apellido_cambio.getText());
            empleado.setSegundo_apellido(dato_segundo_apellido_cambio.getText());
            empleado_bd.cambioEmpleado(empleado, Integer.parseInt(dato_numero_cambio.getText()));
        }
    }//GEN-LAST:event_boton_actualizar_cambioMouseClicked

    private void boton_remover_bajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_remover_bajaMouseClicked
        int variable;
        if (dato_numero_baja.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay informacion en el numero de empleado");
            variable = 0;
        } else {
            variable = Integer.parseInt(dato_numero_baja.getText());
            empleado_bd.bajaEmpleado(variable);
        }
    }//GEN-LAST:event_boton_remover_bajaMouseClicked

    private void boton_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_atrasMouseClicked
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_atrasMouseClicked

    private void boton_registrar_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrar_registroMouseClicked
        Empleado empleado = new Empleado();
        empleado.setNombre(dato_nombre_registro.getText());
        empleado.setPrimer_apellido(dato_primer_apellido_registro.getText());
        empleado.setSegundo_apellido(dato_segundo_apellido_registro.getText());
        empleado_bd.altaEmpleado(empleado);
    }//GEN-LAST:event_boton_registrar_registroMouseClicked

    private void boton_consultar_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_consultar_consultaMouseClicked
        this.mostrarConsultaTabla();
    }//GEN-LAST:event_boton_consultar_consultaMouseClicked

    private void boton_consultar_todos_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_consultar_todos_consultaMouseClicked
        this.mostrarTodosLosEmpleado();
    }//GEN-LAST:event_boton_consultar_todos_consultaMouseClicked

    private void boton_actualizar_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizar_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_actualizar_cambioActionPerformed

    public void mostrarTodosLosEmpleado() {
        ArrayList<Empleado> lista = empleado_bd.listarTodosLosEmpleados();
        Object[][] objetos = new Object[lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            objetos[i][0] = lista.get(i).getId_empleado();
            objetos[i][1] = lista.get(i).getNombre();
            objetos[i][2] = lista.get(i).getPrimer_apellido();
            objetos[i][3] = lista.get(i).getSegundo_apellido();
        }
        tabla_empleados.setModel(new javax.swing.table.DefaultTableModel(
                objetos, new String[]{
                    "Numero de Empleado", "Nombre", "Primer Apellido", "Segundo Apellido"
                }
        ));
    }

    public void mostrarConsultaTabla() {
        int numero_empleado;
        if (dato_numero_consulta.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay informacion en el numero de empleado");
        } else {
            numero_empleado = Integer.parseInt(dato_numero_consulta.getText());
            ArrayList<Empleado> lista = empleado_bd.consultaEmpleado(numero_empleado);
            Object[][] objetos = new Object[lista.size()][4];
            for (int i = 0; i < lista.size(); i++) {
                objetos[i][0] = lista.get(i).getId_empleado();
                objetos[i][1] = lista.get(i).getNombre();
                objetos[i][2] = lista.get(i).getPrimer_apellido();
                objetos[i][3] = lista.get(i).getSegundo_apellido();
            }
            tabla_empleados.setModel(new javax.swing.table.DefaultTableModel(
                    objetos, new String[]{
                        "Numero de Empleado", "Nombre", "Primer Apellido", "Segundo Apellido"
                    }
            ));
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bajas;
    private javax.swing.JPanel Cambios;
    private javax.swing.JPanel Consulta;
    private javax.swing.JTabbedPane Empleados;
    private javax.swing.JPanel Registro;
    private javax.swing.JButton boton_actualizar_cambio;
    private javax.swing.JButton boton_atras;
    private javax.swing.JButton boton_consultar_consulta;
    private javax.swing.JButton boton_consultar_todos_consulta;
    private javax.swing.JButton boton_registrar_registro;
    private javax.swing.JButton boton_remover_baja;
    private javax.swing.JTextField dato_nombre_cambio;
    private javax.swing.JTextField dato_nombre_registro;
    private javax.swing.JFormattedTextField dato_numero_baja;
    private javax.swing.JFormattedTextField dato_numero_cambio;
    private javax.swing.JFormattedTextField dato_numero_consulta;
    private javax.swing.JTextField dato_primer_apellido_cambio;
    private javax.swing.JTextField dato_primer_apellido_registro;
    private javax.swing.JTextField dato_segundo_apellido_cambio;
    private javax.swing.JTextField dato_segundo_apellido_registro;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable tabla_empleados;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
