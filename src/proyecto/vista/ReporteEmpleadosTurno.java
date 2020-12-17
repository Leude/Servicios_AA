package proyecto.vista;

import java.util.ArrayList;
import proyecto.clases.conexion.TurnoBD;
import proyecto.clases.principales.Turno;

public class ReporteEmpleadosTurno extends javax.swing.JFrame {

    TurnoBD turno_bd = new TurnoBD();

    public ReporteEmpleadosTurno() {
        initComponents();
        mostrarTodosLosTurno();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JPanel();
        boton_atras = new javax.swing.JButton();
        boton_registrar = new javax.swing.JButton();
        encabezado = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setExtendedState(6);
        setForeground(new java.awt.Color(51, 204, 0));

        Registro.setBackground(new java.awt.Color(255, 255, 255));

        boton_atras.setForeground(new java.awt.Color(0, 0, 255));
        boton_atras.setText("Atras");
        boton_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_atrasActionPerformed(evt);
            }
        });

        boton_registrar.setForeground(new java.awt.Color(0, 0, 255));
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
        titulo.setText("Reporte de Sucursales");
        titulo.setAlignmentY(0.0F);
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout encabezadoLayout = new javax.swing.GroupLayout(encabezado);
        encabezado.setLayout(encabezadoLayout);
        encabezadoLayout.setHorizontalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(encabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(107, 107, 107))
        );
        encabezadoLayout.setVerticalGroup(
            encabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, encabezadoLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(36, 36, 36))
        );

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 255));
        jLabel19.setText("Sucursales ➤");

        jComboBox1.setForeground(new java.awt.Color(0, 0, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione la susursal", "Sucursal 1", "Sucursal 2", "Sucursal 3" }));

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 255));
        jLabel20.setText("Gerentes ➤");

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(102, 102, 255));
        jLabel21.setText("Trabajadores ➤");

        jLabel22.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 255));
        jLabel22.setText("Sucursal: <SUCURSAL>");

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 255));
        jLabel23.setText("Supervisores ➤");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.jpg"))); // NOI18N

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro);
        Registro.setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(encabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addComponent(boton_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153)
                                .addComponent(boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(196, 196, 196)))
                        .addGap(151, 151, 151)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(468, 468, 468)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegistroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addComponent(encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(61, 61, 61)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(3, 3, 3)
                .addComponent(jLabel20)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar)
                    .addComponent(boton_atras))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Registro, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1106, 656));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void boton_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_atrasActionPerformed
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_boton_atrasActionPerformed

    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarActionPerformed
        Turno turno = new Turno();
        turno.setId_turno(dato_turno.getText());
        turno.setHora_inicial(dato_hora_inicial.getText());
        turno.setHora_final(dato_hora_final.getText());
        turno_bd.altaTurno(turno);
        this.mostrarTodosLosTurno();
    }//GEN-LAST:event_boton_registrarActionPerformed

    public void mostrarTodosLosTurno() {
        ArrayList<Turno> lista = turno_bd.listarTodosLosTurnos();
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
    private javax.swing.JButton boton_registrar;
    private javax.swing.JPanel encabezado;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
