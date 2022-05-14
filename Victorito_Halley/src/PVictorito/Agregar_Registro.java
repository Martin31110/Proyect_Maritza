package PVictorito;

public class Agregar_Registro extends javax.swing.JFrame {
    public Agregar_Registro() {
        initComponents();
         setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jPanel1 = new javax.swing.JPanel();
        L2 = new javax.swing.JLabel();
        L9 = new javax.swing.JLabel();
        L1 = new javax.swing.JLabel();
        L10 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L11 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        L4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        L5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        L6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        L7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        L12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        L8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        L13 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L2.setForeground(new java.awt.Color(214, 0, 110));
        L2.setText("AGREGAR REGISTRO");
        jPanel1.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 140, 30));

        L9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_Back_64px.png"))); // NOI18N
        L9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                L9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                L9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                L9MouseExited(evt);
            }
        });
        jPanel1.add(L9, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 440, 60, 50));

        L1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Colores.jpg"))); // NOI18N
        jPanel1.add(L1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 82));

        L10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L10.setText("Nombre del Trabajo:");
        jPanel1.add(L10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        L3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L3.setText("Fecha de entrega:");
        jPanel1.add(L3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 110, 20));

        L11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L11.setText("Nombre del Cliente:");
        jPanel1.add(L11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Trabajo", "Cotizacion" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 112, 90, 20));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 290, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 310, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 310, 10));

        L4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L4.setText("Precio unitario");
        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, 20));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTextField3.setBorder(null);
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 310, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 10));

        jTextField4.setBorder(null);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 120, 30));

        L5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L5.setText("Categoria:");
        jPanel1.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 60, 20));

        jTextField5.setBorder(null);
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 222, 120, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 10));

        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 10));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 120, 10));

        L6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L6.setText("Cantidad");
        jPanel1.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 20));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField2.setBorder(null);
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 266, 110, 30));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 110, 10));

        L7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L7.setText("Precio total (Sin IVA):");
        jPanel1.add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 20));

        jTextField6.setBorder(null);
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 110, 20));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 110, 10));

        L12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L12.setText("Informacion Adicional:");
        jPanel1.add(L12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 240, 100));

        L8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L8.setText("Precio total (con IVA):");
        jPanel1.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 130, 20));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 160, 10));

        jTextField7.setBorder(null);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 342, 160, 30));

        jButton1.setBackground(new java.awt.Color(0, 193, 193));
        jButton1.setText("Subir Registro");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 442, 110, 40));

        jButton2.setBackground(new java.awt.Color(0, 193, 193));
        jButton2.setText("Limpiar los campos");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 442, 140, 40));

        L13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(L13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void L9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L9MouseEntered
       L13.setText("Rregresar al menu");
    }//GEN-LAST:event_L9MouseEntered

    private void L9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L9MouseExited
        L13.setText("");
    }//GEN-LAST:event_L9MouseExited

    private void L9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_L9MouseClicked
       Menu_Principal R4 = new Menu_Principal ();
       R4.setVisible(true);
    }//GEN-LAST:event_L9MouseClicked

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Agregar_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar_Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L10;
    private javax.swing.JLabel L11;
    private javax.swing.JLabel L12;
    private javax.swing.JLabel L13;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JLabel L8;
    private javax.swing.JLabel L9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
