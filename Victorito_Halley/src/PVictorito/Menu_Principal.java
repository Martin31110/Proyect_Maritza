package PVictorito;

public class Menu_Principal extends javax.swing.JFrame {

    public Menu_Principal() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L1.setText("BIENVENIDO VICTOR");
        jPanel1.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, 20));

        L2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono.png"))); // NOI18N
        jPanel1.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 50, 40));

        L3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L3.setText("MENU PRINCIPAL");
        jPanel1.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 120, 20));

        L4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir cliente.PNG"))); // NOI18N
        L4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L4MouseExited(evt);
            }
        });
        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 140, 130));

        L5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verificar.png"))); // NOI18N
        L5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L5MouseExited(evt);
            }
        });
        jPanel1.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 130, 130));

        L6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        L6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L6MouseExited(evt);
            }
        });
        jPanel1.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, 140));

        L7.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jPanel1.add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 180, 40));

        L8.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jPanel1.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 180, 40));

        L9.setFont(new java.awt.Font("Traditional Arabic", 0, 18)); // NOI18N
        jPanel1.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 220, 40));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 310, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseEntered
        L7.setText("AÑADIR CLIENTE");
    }//GEN-LAST:event_L4MouseEntered

    private void L4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L4MouseExited
        L7.setText("");
    }//GEN-LAST:event_L4MouseExited

    private void L5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseEntered
        L8.setText("AÑADIR REGISTRO");
    }//GEN-LAST:event_L5MouseEntered

    private void L5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L5MouseExited
        L8.setText((""));
    }//GEN-LAST:event_L5MouseExited

    private void L6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseEntered
        L9.setText("CONSULTAR REGISTRO");
    }//GEN-LAST:event_L6MouseEntered

    private void L6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L6MouseExited
        L9.setText("");
    }//GEN-LAST:event_L6MouseExited

   
     
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
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
