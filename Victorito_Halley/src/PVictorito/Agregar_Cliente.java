
package PVictorito;


public class Agregar_Cliente extends javax.swing.JFrame {

    public Agregar_Cliente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANEL = new javax.swing.JPanel();
        LB1 = new javax.swing.JLabel();
        LB2 = new javax.swing.JLabel();
        LB3 = new javax.swing.JLabel();
        LB4 = new javax.swing.JLabel();
        LB5 = new javax.swing.JLabel();
        LB6 = new javax.swing.JLabel();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        TXTF1 = new javax.swing.JTextField();
        TXTF2 = new javax.swing.JTextField();
        TXTF3 = new javax.swing.JTextField();
        TXTF4 = new javax.swing.JTextField();
        TXTF5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LB1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LB1.setText("Agregar Cliente");

        LB2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LB2.setText("Nombre del Cliente:");

        LB3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LB3.setText("Empresa:");

        LB4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LB4.setText("E-mail:");

        LB5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LB5.setText("Telefono:");

        LB6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LB6.setText("RFC(Opcional):");

        BTN1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN1.setText("Volver");
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });

        BTN2.setBackground(new java.awt.Color(0, 193, 193));
        BTN2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN2.setText("Subir Registro");
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });

        BTN3.setBackground(new java.awt.Color(0, 193, 193));
        BTN3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BTN3.setText("Limpiar todos los Campos");
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });

        TXTF1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TXTF1.setText("Ingrese el nombre del cliente");
        TXTF1.setBorder(null);
        TXTF1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TXTF1.setDoubleBuffered(true);
        TXTF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTF1KeyTyped(evt);
            }
        });

        TXTF2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TXTF2.setText("Ingrese la empresa a la que pertenece el cliente");
        TXTF2.setBorder(null);

        TXTF3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TXTF3.setText("Ingrese el correo del cliente");
        TXTF3.setBorder(null);

        TXTF4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TXTF4.setText("Ingrese el numero del cliente");
        TXTF4.setBorder(null);
        TXTF4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTF4KeyTyped(evt);
            }
        });

        TXTF5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TXTF5.setText("Ingrese el RFC del cliente");
        TXTF5.setBorder(null);

        jLabel1.setText("En los campos E-Mail y telefono es obligatorio llenar alguno de los dos ");

        javax.swing.GroupLayout PANELLayout = new javax.swing.GroupLayout(PANEL);
        PANEL.setLayout(PANELLayout);
        PANELLayout.setHorizontalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PANELLayout.createSequentialGroup()
                        .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PANELLayout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(LB1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PANELLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PANELLayout.createSequentialGroup()
                                        .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(LB2)
                                            .addComponent(LB3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TXTF2, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                                            .addComponent(TXTF1)))
                                    .addGroup(PANELLayout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PANELLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LB4)
                                    .addComponent(LB6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BTN3)
                                    .addGroup(PANELLayout.createSequentialGroup()
                                        .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TXTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TXTF5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LB5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TXTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PANELLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN1)
                            .addComponent(BTN2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PANELLayout.setVerticalGroup(
            PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANELLayout.createSequentialGroup()
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN1))
                .addGap(23, 23, 23)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB2)
                    .addComponent(TXTF1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB3)
                    .addComponent(TXTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB4)
                    .addComponent(TXTF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB5)
                    .addComponent(TXTF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXTF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LB6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(PANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANEL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN2ActionPerformed

    private void TXTF1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTF1KeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_TXTF1KeyTyped

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed

    }//GEN-LAST:event_BTN3ActionPerformed

    private void TXTF4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTF4KeyTyped
        char n = evt.getKeyChar();
        if(( n<  '0' || n> '9')) evt.consume();
    }//GEN-LAST:event_TXTF4KeyTyped

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JLabel LB1;
    private javax.swing.JLabel LB2;
    private javax.swing.JLabel LB3;
    private javax.swing.JLabel LB4;
    private javax.swing.JLabel LB5;
    private javax.swing.JLabel LB6;
    private javax.swing.JPanel PANEL;
    private javax.swing.JTextField TXTF1;
    private javax.swing.JTextField TXTF2;
    private javax.swing.JTextField TXTF3;
    private javax.swing.JTextField TXTF4;
    private javax.swing.JTextField TXTF5;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
