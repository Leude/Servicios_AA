package proyecto.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LoginSistema extends javax.swing.JFrame {

    public LoginSistema() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dato_usuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dato_clave = new javax.swing.JPasswordField();
        boton_acceder = new javax.swing.JButton();
        imagen_01 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 0, 255));
        setForeground(new java.awt.Color(51, 204, 0));
        setName("frame"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(81, 96, 115));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Acceso al Sistema");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario:");

        dato_usuario.setBackground(new java.awt.Color(58, 82, 86));
        dato_usuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        dato_usuario.setForeground(new java.awt.Color(179, 177, 177));
        dato_usuario.setCaretColor(new java.awt.Color(255, 255, 255));
        dato_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato_usuarioActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        dato_clave.setBackground(new java.awt.Color(58, 82, 86));
        dato_clave.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dato_clave.setForeground(new java.awt.Color(179, 177, 177));
        dato_clave.setCaretColor(new java.awt.Color(255, 255, 255));
        dato_clave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dato_claveActionPerformed(evt);
            }
        });

        boton_acceder.setBackground(new java.awt.Color(255, 255, 255));
        boton_acceder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        boton_acceder.setForeground(new java.awt.Color(51, 51, 51));
        boton_acceder.setText("Acceder");
        boton_acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_accederActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boton_acceder)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(98, 98, 98)
                                .addComponent(dato_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dato_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(imagen_01)))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(imagen_01)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dato_clave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(boton_acceder)
                .addGap(39, 39, 39))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(596, 485));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dato_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato_usuarioActionPerformed
        this.boton_accederActionPerformed(evt);
    }//GEN-LAST:event_dato_usuarioActionPerformed

    private void boton_accederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_accederActionPerformed
        String Usuario = "admin";
        String Contraseña = "123";
        String Pass = new String(dato_clave.getPassword());
        if (dato_usuario.getText().equals(Usuario) && Pass.equals(Contraseña)) {
            MenuPrincipal mp = new MenuPrincipal();
            mp.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "El usuario o contraseña son incorrectos");
        }
    }//GEN-LAST:event_boton_accederActionPerformed

    private void dato_claveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dato_claveActionPerformed
        this.boton_accederActionPerformed(evt);
    }//GEN-LAST:event_dato_claveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_acceder;
    private javax.swing.JPasswordField dato_clave;
    private javax.swing.JTextField dato_usuario;
    private javax.swing.JLabel imagen_01;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
