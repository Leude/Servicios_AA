package jfram.clases;

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

        Camios = new javax.swing.JTabbedPane();
        Registro = new javax.swing.JPanel();
        volver = new javax.swing.JButton();
        registro_empleado = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        dato_nombre_empleado_registro = new javax.swing.JTextField();
        dato_primer_apellido_empleado_registro = new javax.swing.JTextField();
        dato_segundo_apellido_empleado_registro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Consulta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dato_numero_empleado_consulta = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_empleados = new javax.swing.JTable();
        consultar_empleado = new javax.swing.JButton();
        consultar_todos_empleado = new javax.swing.JButton();
        encabezado1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        Bajas = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        baja_empleado = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        dato_numero_empleado_baja = new javax.swing.JTextPane();
        encabezado2 = new javax.swing.JPanel();
        titulo2 = new javax.swing.JLabel();
        Cambios = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        cambio_empleado = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dato_nombre_empleado_cambio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        dato_primer_apellido_empleado_cambio = new javax.swing.JTextField();
        dato_segundo_apellido_empleado_cambio = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        dato_numero_empleado_cambio = new javax.swing.JTextPane();
        encabezado3 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setForeground(new java.awt.Color(51, 204, 0));

        Registro.setBackground(new java.awt.Color(81, 96, 115));

        volver.setText("Atras");
        volver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volverMouseClicked(evt);
            }
        });

        registro_empleado.setText("Registrar");
        registro_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registro_empleadoMouseClicked(evt);
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

        dato_nombre_empleado_registro.setBackground(new java.awt.Color(51, 51, 51));
        dato_nombre_empleado_registro.setForeground(new java.awt.Color(204, 204, 204));
        dato_nombre_empleado_registro.setCaretColor(new java.awt.Color(255, 255, 255));

        dato_primer_apellido_empleado_registro.setBackground(new java.awt.Color(51, 51, 51));
        dato_primer_apellido_empleado_registro.setForeground(new java.awt.Color(204, 204, 204));
        dato_primer_apellido_empleado_registro.setCaretColor(new java.awt.Color(255, 255, 255));
        dato_primer_apellido_empleado_registro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        dato_segundo_apellido_empleado_registro.setBackground(new java.awt.Color(51, 51, 51));
        dato_segundo_apellido_empleado_registro.setForeground(new java.awt.Color(204, 204, 204));
        dato_segundo_apellido_empleado_registro.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Nombre:");

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Primer Apellido:");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setText("Segundo Apellido:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(37, 37, 37)
                        .addComponent(dato_nombre_empleado_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dato_primer_apellido_empleado_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                        .addComponent(dato_segundo_apellido_empleado_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato_nombre_empleado_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato_primer_apellido_empleado_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato_segundo_apellido_empleado_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registro_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registro_empleado)
                    .addComponent(volver))
                .addGap(205, 205, 205))
        );

        Camios.addTab("Registro", Registro);

        Consulta.setBackground(new java.awt.Color(81, 96, 115));

        jLabel6.setText("No. Empleado:");

        dato_numero_empleado_consulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dato_numero_empleado_consultaKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(dato_numero_empleado_consulta);

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

        consultar_empleado.setText("Consulta");
        consultar_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_empleadoMouseClicked(evt);
            }
        });

        consultar_todos_empleado.setText("Mostrar Todos");
        consultar_todos_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultar_todos_empleadoMouseClicked(evt);
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

        javax.swing.GroupLayout ConsultaLayout = new javax.swing.GroupLayout(Consulta);
        Consulta.setLayout(ConsultaLayout);
        ConsultaLayout.setHorizontalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(consultar_empleado)
                        .addGap(37, 37, 37)
                        .addComponent(consultar_todos_empleado))
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel5)))
                .addContainerGap(85, Short.MAX_VALUE))
            .addComponent(encabezado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        ConsultaLayout.setVerticalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addComponent(encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(consultar_empleado)
                        .addComponent(consultar_todos_empleado)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        Camios.addTab("Consultas", Consulta);

        Bajas.setBackground(new java.awt.Color(81, 96, 115));

        jLabel17.setText("Nota Adicional:");

        baja_empleado.setText("Eliminar");
        baja_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                baja_empleadoMouseClicked(evt);
            }
        });

        jLabel18.setText("No. Empleado:");

        dato_numero_empleado_baja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dato_numero_empleado_bajaKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(dato_numero_empleado_baja);

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

        javax.swing.GroupLayout BajasLayout = new javax.swing.GroupLayout(Bajas);
        Bajas.setLayout(BajasLayout);
        BajasLayout.setHorizontalGroup(
            BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BajasLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(baja_empleado)
                .addGap(286, 286, 286))
            .addGroup(BajasLayout.createSequentialGroup()
                .addGroup(BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BajasLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BajasLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BajasLayout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(jLabel18)))
                .addContainerGap(242, Short.MAX_VALUE))
            .addComponent(encabezado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BajasLayout.setVerticalGroup(
            BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BajasLayout.createSequentialGroup()
                .addComponent(encabezado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel18)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addComponent(baja_empleado)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        Camios.addTab("Bajas", Bajas);

        Cambios.setBackground(new java.awt.Color(81, 96, 115));

        jLabel10.setText("No. Empleado:");

        cambio_empleado.setText("Registrar");
        cambio_empleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cambio_empleadoMouseClicked(evt);
            }
        });

        jLabel11.setText("Pone el nombre o numero de empleado para modificar ese empleado");

        jLabel12.setText("Actualize los datos aqui:");

        jLabel13.setText("Nombre:");

        jLabel14.setText("Primer Apellido:");

        jLabel15.setText("Segundo Apellido:");

        dato_numero_empleado_cambio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dato_numero_empleado_cambioKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(dato_numero_empleado_cambio);

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

        javax.swing.GroupLayout CambiosLayout = new javax.swing.GroupLayout(Cambios);
        Cambios.setLayout(CambiosLayout);
        CambiosLayout.setHorizontalGroup(
            CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiosLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(37, 37, 37)
                        .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(146, 426, Short.MAX_VALUE))
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(58, 58, 58)
                                .addComponent(dato_primer_apellido_empleado_cambio))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(91, 91, 91)
                                .addComponent(dato_nombre_empleado_cambio)))
                        .addGap(178, 178, 178))
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CambiosLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(dato_segundo_apellido_empleado_cambio)
                                .addGap(178, 178, 178))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cambio_empleado)
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
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(40, 40, 40)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(dato_nombre_empleado_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(dato_primer_apellido_empleado_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(dato_segundo_apellido_empleado_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(cambio_empleado)
                .addGap(128, 128, 128))
        );

        Camios.addTab("Cambios", Cambios);

        getContentPane().add(Camios, java.awt.BorderLayout.PAGE_START);

        setSize(new java.awt.Dimension(784, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dato_numero_empleado_consultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dato_numero_empleado_consultaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puedes ingresar numeros");
        }
    }//GEN-LAST:event_dato_numero_empleado_consultaKeyTyped

    private void cambio_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambio_empleadoMouseClicked
        if (dato_numero_empleado_cambio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay informacion en el numero de empleado");

        } else {
            Empleado empleado = new Empleado();
            empleado.setNombre(dato_nombre_empleado_cambio.getText());
            empleado.setPrimer_apellido(dato_primer_apellido_empleado_cambio.getText());
            empleado.setSegundo_apellido(dato_segundo_apellido_empleado_cambio.getText());
            empleado_bd.cambioEmpleado(empleado, Integer.parseInt(dato_numero_empleado_cambio.getText()));
        }
    }//GEN-LAST:event_cambio_empleadoMouseClicked

    private void dato_numero_empleado_cambioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dato_numero_empleado_cambioKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puedes ingresar numeros");
        }
    }//GEN-LAST:event_dato_numero_empleado_cambioKeyTyped

    private void baja_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_baja_empleadoMouseClicked
        int variable;
        if (dato_numero_empleado_baja.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay informacion en el numero de empleado");
            variable=0;
        } else {
            variable = Integer.parseInt(dato_numero_empleado_baja.getText());
            empleado_bd.bajaEmpleado(variable);
        }
    }//GEN-LAST:event_baja_empleadoMouseClicked

    private void dato_numero_empleado_bajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dato_numero_empleado_bajaKeyTyped
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this, "Solo puedes ingresar numeros");
        }
    }//GEN-LAST:event_dato_numero_empleado_bajaKeyTyped

    private void volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volverMouseClicked
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_volverMouseClicked

    private void registro_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registro_empleadoMouseClicked
        Empleado empleado = new Empleado();
        empleado.setNombre(dato_nombre_empleado_registro.getText());
        empleado.setPrimer_apellido(dato_primer_apellido_empleado_registro.getText());
        empleado.setSegundo_apellido(dato_segundo_apellido_empleado_registro.getText());
        empleado_bd.altaEmpleado(empleado);


    }//GEN-LAST:event_registro_empleadoMouseClicked

    private void consultar_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_empleadoMouseClicked
            this.mostrarConsultaTabla();       
    }//GEN-LAST:event_consultar_empleadoMouseClicked

    private void consultar_todos_empleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultar_todos_empleadoMouseClicked
        this.mostrarTodosLosEmpleado();
    }//GEN-LAST:event_consultar_todos_empleadoMouseClicked

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
        if (dato_numero_empleado_consulta.getText().equals("")) {
            numero_empleado=0;
        }else{
            numero_empleado=Integer.parseInt(dato_numero_empleado_consulta.getText());
        }
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
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bajas;
    private javax.swing.JPanel Cambios;
    private javax.swing.JTabbedPane Camios;
    private javax.swing.JPanel Consulta;
    private javax.swing.JPanel Registro;
    private javax.swing.JButton baja_empleado;
    private javax.swing.JButton cambio_empleado;
    private javax.swing.JButton consultar_empleado;
    private javax.swing.JButton consultar_todos_empleado;
    private javax.swing.JTextField dato_nombre_empleado_cambio;
    private javax.swing.JTextField dato_nombre_empleado_registro;
    private javax.swing.JTextPane dato_numero_empleado_baja;
    private javax.swing.JTextPane dato_numero_empleado_cambio;
    private javax.swing.JTextPane dato_numero_empleado_consulta;
    private javax.swing.JTextField dato_primer_apellido_empleado_cambio;
    private javax.swing.JTextField dato_primer_apellido_empleado_registro;
    private javax.swing.JTextField dato_segundo_apellido_empleado_cambio;
    private javax.swing.JTextField dato_segundo_apellido_empleado_registro;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton registro_empleado;
    private javax.swing.JTable tabla_empleados;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
