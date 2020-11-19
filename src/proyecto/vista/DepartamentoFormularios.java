package proyecto.vista;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import proyecto.clases.conexion.DepartamentoBD;
import proyecto.clases.principales.Departamento;

public class DepartamentoFormularios extends javax.swing.JFrame {

    DepartamentoBD departamento_bd = new DepartamentoBD();

    public DepartamentoFormularios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Camios = new javax.swing.JTabbedPane();
        Registro = new javax.swing.JPanel();
        boton_volver = new javax.swing.JButton();
        boton_registrar_registro = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        dato_nombre_registro = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        Consulta = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_departamentos = new javax.swing.JTable();
        boton_consultar_consulta = new javax.swing.JButton();
        boton_consultar_todos_consulta = new javax.swing.JButton();
        encabezado1 = new javax.swing.JPanel();
        titulo1 = new javax.swing.JLabel();
        dato_numero_consulta = new javax.swing.JFormattedTextField();
        Bajas = new javax.swing.JPanel();
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
        encabezado3 = new javax.swing.JPanel();
        titulo3 = new javax.swing.JLabel();
        dato_numero_cambio = new javax.swing.JFormattedTextField();

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
        titulo.setText("Registro de Departamento");
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

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Nombre:");

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
                        .addComponent(boton_registrar_registro, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dato_nombre_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)))
                .addContainerGap())
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(dato_nombre_registro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 219, Short.MAX_VALUE)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar_registro)
                    .addComponent(boton_volver))
                .addGap(205, 205, 205))
        );

        Camios.addTab("Registro", Registro);

        Consulta.setBackground(new java.awt.Color(81, 96, 115));

        jLabel6.setText("Numero de Departamento");

        jLabel5.setText("Busca sus datos del departamento atra vez de su numero");

        tabla_departamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Numero de Departamento", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla_departamentos.setGridColor(new java.awt.Color(255, 0, 0));
        tabla_departamentos.setRowHeight(30);
        tabla_departamentos.setSelectionBackground(new java.awt.Color(51, 255, 51));
        tabla_departamentos.setSelectionForeground(new java.awt.Color(255, 102, 0));
        jScrollPane2.setViewportView(tabla_departamentos);

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
        titulo1.setText("Consulta de Departamentos");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaLayout.createSequentialGroup()
                .addGap(0, 57, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(dato_numero_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(boton_consultar_consulta)
                .addGap(18, 18, 18)
                .addComponent(boton_consultar_todos_consulta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConsultaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(225, 225, 225))
        );
        ConsultaLayout.setVerticalGroup(
            ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConsultaLayout.createSequentialGroup()
                .addComponent(encabezado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boton_consultar_consulta)
                        .addComponent(boton_consultar_todos_consulta)
                        .addComponent(dato_numero_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ConsultaLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        Camios.addTab("Consultas", Consulta);

        Bajas.setBackground(new java.awt.Color(81, 96, 115));

        boton_remover_baja.setText("Remover");
        boton_remover_baja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_remover_bajaMouseClicked(evt);
            }
        });

        jLabel18.setText("Numero de departamento:");

        encabezado2.setBackground(new java.awt.Color(20, 52, 75));

        titulo2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo2.setForeground(new java.awt.Color(255, 255, 255));
        titulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo2.setText("Remover Departamento");
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
            .addComponent(encabezado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BajasLayout.createSequentialGroup()
                .addGroup(BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BajasLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel18))
                    .addGroup(BajasLayout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addGroup(BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_remover_baja)
                            .addComponent(dato_numero_baja, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        BajasLayout.setVerticalGroup(
            BajasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BajasLayout.createSequentialGroup()
                .addComponent(encabezado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(dato_numero_baja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(boton_remover_baja)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        Camios.addTab("Bajas", Bajas);

        Cambios.setBackground(new java.awt.Color(81, 96, 115));

        jLabel10.setText("Numero de Departamento:");

        boton_actualizar_cambio.setText("Actualizar");
        boton_actualizar_cambio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton_actualizar_cambioMouseClicked(evt);
            }
        });

        jLabel11.setText("Ingresa el Numero del Departamento para acualizar los datos");

        jLabel12.setText("Actualize los datos aqui:");

        jLabel13.setText("Nombre:");

        encabezado3.setBackground(new java.awt.Color(20, 52, 75));

        titulo3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo3.setForeground(new java.awt.Color(255, 255, 255));
        titulo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo3.setText("Actualizacion de datos del Departamento");
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

        dato_numero_cambio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

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
                            .addComponent(dato_numero_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(CambiosLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(91, 91, 91)
                        .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CambiosLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addContainerGap(242, Short.MAX_VALUE))
                            .addGroup(CambiosLayout.createSequentialGroup()
                                .addComponent(dato_nombre_cambio)
                                .addGap(178, 178, 178))))))
            .addComponent(encabezado3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CambiosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(boton_actualizar_cambio)
                .addGap(158, 158, 158))
        );
        CambiosLayout.setVerticalGroup(
            CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CambiosLayout.createSequentialGroup()
                .addComponent(encabezado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dato_numero_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jLabel12)
                .addGap(61, 61, 61)
                .addGroup(CambiosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dato_nombre_cambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(74, 74, 74)
                .addComponent(boton_actualizar_cambio)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        Camios.addTab("Cambios", Cambios);

        getContentPane().add(Camios, java.awt.BorderLayout.PAGE_START);

        setSize(new java.awt.Dimension(757, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_actualizar_cambioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_actualizar_cambioMouseClicked
        if (dato_numero_cambio.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay informacion en el numero de departamento");
        } else {
            Departamento departamento = new Departamento();
            departamento.setNombre(dato_nombre_cambio.getText());
            departamento_bd.cambioDepartamento(departamento, Integer.parseInt(dato_numero_cambio.getText()));
        }
    }//GEN-LAST:event_boton_actualizar_cambioMouseClicked

    private void boton_remover_bajaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_remover_bajaMouseClicked
        int variable;
        if (dato_numero_baja.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "No hay informacion en el numero de departamento");
        } else {
            variable = Integer.parseInt(dato_numero_baja.getText());
            departamento_bd.bajaDepartamento(variable);
        }
    }//GEN-LAST:event_boton_remover_bajaMouseClicked

    private void boton_volverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_volverMouseClicked
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_volverMouseClicked

    private void boton_registrar_registroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_registrar_registroMouseClicked
        Departamento departamento = new Departamento();
        departamento.setNombre(dato_nombre_registro.getText());
        departamento_bd.altaDepartamento(departamento);
    }//GEN-LAST:event_boton_registrar_registroMouseClicked

    private void boton_consultar_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_consultar_consultaMouseClicked
        this.mostrarConsultaTabla();
    }//GEN-LAST:event_boton_consultar_consultaMouseClicked

    private void boton_consultar_todos_consultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton_consultar_todos_consultaMouseClicked
        this.mostrarTodosLosDepartamento();
    }//GEN-LAST:event_boton_consultar_todos_consultaMouseClicked

    private void boton_consultar_todos_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultar_todos_consultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_consultar_todos_consultaActionPerformed

    public void mostrarTodosLosDepartamento() {
        ArrayList<Departamento> lista = departamento_bd.listarTodosLosDepartamentos();
        Object[][] objetos = new Object[lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            objetos[i][0] = lista.get(i).getId_departamento();
            objetos[i][1] = lista.get(i).getNombre();

        }
        tabla_departamentos.setModel(new javax.swing.table.DefaultTableModel(
                objetos, new String[]{
                    "Numero de Departamento", "Nombre"
                }
        ));
    }

    public void mostrarConsultaTabla() {
        int numero_departamento;
        if (dato_numero_consulta.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Ingresa el numero de empleado");
        } else {
            numero_departamento = Integer.parseInt(dato_numero_consulta.getText());
            ArrayList<Departamento> lista = departamento_bd.consultaDepartamento(numero_departamento);
            Object[][] objetos = new Object[lista.size()][4];
            for (int i = 0; i < lista.size(); i++) {
                objetos[i][0] = lista.get(i).getId_departamento();
                objetos[i][1] = lista.get(i).getNombre();

            }
            tabla_departamentos.setModel(new javax.swing.table.DefaultTableModel(
                    objetos, new String[]{
                        "Numero de Departamento", "Nombre"
                    }
            ));
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bajas;
    private javax.swing.JPanel Cambios;
    private javax.swing.JTabbedPane Camios;
    private javax.swing.JPanel Consulta;
    private javax.swing.JPanel Registro;
    private javax.swing.JButton boton_actualizar_cambio;
    private javax.swing.JButton boton_consultar_consulta;
    private javax.swing.JButton boton_consultar_todos_consulta;
    private javax.swing.JButton boton_registrar_registro;
    private javax.swing.JButton boton_remover_baja;
    private javax.swing.JButton boton_volver;
    private javax.swing.JTextField dato_nombre_cambio;
    private javax.swing.JTextField dato_nombre_registro;
    private javax.swing.JFormattedTextField dato_numero_baja;
    private javax.swing.JFormattedTextField dato_numero_cambio;
    private javax.swing.JFormattedTextField dato_numero_consulta;
    private javax.swing.JPanel encabezado;
    private javax.swing.JPanel encabezado1;
    private javax.swing.JPanel encabezado2;
    private javax.swing.JPanel encabezado3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla_departamentos;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    // End of variables declaration//GEN-END:variables
}
