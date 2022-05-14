package PVictorito;

public class Menu_Principal extends javax.swing.JFrame {

    public Menu_Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        L5 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        L8 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();
        L11 = new javax.swing.JLabel();
        L13 = new javax.swing.JLabel();
        L14 = new javax.swing.JLabel();
        L12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L1.setText("BIENVENIDO VICTOR");
        jPanel1.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 20));

        L2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono.png"))); // NOI18N
        jPanel1.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 50, 40));

        L3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L3.setText("MENU PRINCIPAL");
        jPanel1.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 120, 20));

        L4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir cliente.PNG"))); // NOI18N
        L4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L4MouseExited(evt);
            }
        });
        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 130));

        L5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verificar.png"))); // NOI18N
        L5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L5MouseExited(evt);
            }
        });
        jPanel1.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 130, 130));

        L6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        L6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L6MouseExited(evt);
            }
        });
        jPanel1.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 140));

        L7.setBackground(new java.awt.Color(255, 255, 255));
        L7.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jPanel1.add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 180, 40));

        L8.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jPanel1.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 180, 40));

        L9.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jPanel1.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 220, 40));

        L10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Multiply_32px.png"))); // NOI18N
        L10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L10MouseClicked(evt);
            }
        });
        jPanel1.add(L10, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 35, 33));

        L11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        L11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L11MouseClicked(evt);
            }
        });
        jPanel1.add(L11, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 40, 30));

        L13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo.png"))); // NOI18N
        jPanel1.add(L13, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 70, 300, 150));

        L14.setBackground(new java.awt.Color(255, 255, 255));
        L14.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        L14.setForeground(new java.awt.Color(255, 255, 255));
        L14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        L14.setText("VICTORITO HALLEY");
        jPanel1.add(L14, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 300, 50));

        L12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/City.png"))); // NOI18N
        jPanel1.add(L12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 300, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
    Eventos para cuano el mouse pase a travez de la etiqueta pase un texto
    */
    private void L4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseEntered
        L7.setText("AÑADIR CLIENTE");
        L7.setForeground(new java.awt.Color(0, 193, 193));
    }//GEN-LAST:event_L4MouseEntered

    private void L4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseExited
        L7.setText("");
    }//GEN-LAST:event_L4MouseExited

    private void L5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseEntered
        L8.setText("AÑADIR REGISTRO");
        L8.setForeground(new java.awt.Color(255, 255, 0));
    }//GEN-LAST:event_L5MouseEntered

    private void L5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseExited
        L8.setText((""));
    }//GEN-LAST:event_L5MouseExited

    private void L6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseEntered
        L9.setText("CONSULTAR REGISTRO");
        L9.setForeground(new java.awt.Color(255, 0, 255));
    }//GEN-LAST:event_L6MouseEntered

    private void L6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseExited
        L9.setText("");
    }//GEN-LAST:event_L6MouseExited
    //Evento para bajar la pestaña del menu principal
    private void L11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L11MouseClicked
        this.setState(Menu_Principal.ICONIFIED);
    }//GEN-LAST:event_L11MouseClicked
    //Evento para salir del programa
    private void L10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L10MouseClicked
       System.exit(0);
    }//GEN-LAST:event_L10MouseClicked

    private void L4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseClicked
        Agregar_Cliente R1 = new Agregar_Cliente();
        R1.setVisible(true);          
    }//GEN-LAST:event_L4MouseClicked

    private void L5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseClicked
        Agregar_Registro R2 = new Agregar_Registro ();
        R2.setVisible(true);
    }//GEN-LAST:event_L5MouseClicked

    private void L6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseClicked
        Consultar_Registro R3 = new Consultar_Registro();
        R3.setVisible(true);
    }//GEN-LAST:event_L6MouseClicked

    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L14;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
