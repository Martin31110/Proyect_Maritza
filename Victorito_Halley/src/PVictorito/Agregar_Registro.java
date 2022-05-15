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
        TXT1 = new javax.swing.JTextField();
        SP1 = new javax.swing.JSeparator();
        SP2 = new javax.swing.JSeparator();
        L4 = new javax.swing.JLabel();
        TXT2 = new javax.swing.JTextField();
        SP3 = new javax.swing.JSeparator();
        TXT3 = new javax.swing.JTextField();
        L5 = new javax.swing.JLabel();
        TXT4 = new javax.swing.JTextField();
        SP4 = new javax.swing.JSeparator();
        SP5 = new javax.swing.JSeparator();
        SP6 = new javax.swing.JSeparator();
        L6 = new javax.swing.JLabel();
        TXT6 = new javax.swing.JTextField();
        SP7 = new javax.swing.JSeparator();
        L7 = new javax.swing.JLabel();
        TXT7 = new javax.swing.JTextField();
        SP8 = new javax.swing.JSeparator();
        L12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXTA1 = new javax.swing.JTextArea();
        L8 = new javax.swing.JLabel();
        SP9 = new javax.swing.JSeparator();
        TXT8 = new javax.swing.JTextField();
        BT1 = new javax.swing.JButton();
        BT2 = new javax.swing.JButton();
        L13 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        L2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L2.setForeground(new java.awt.Color(255, 255, 0));
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

        TXT1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TXT1.setBorder(null);
        jPanel1.add(TXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 290, 30));

        SP1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 310, 10));

        SP2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 310, 10));

        L4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L4.setText("Precio unitario");
        jPanel1.add(L4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 100, 20));

        TXT2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        TXT2.setBorder(null);
        jPanel1.add(TXT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 310, 30));

        SP3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 10));

        TXT3.setBorder(null);
        TXT3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT3KeyTyped(evt);
            }
        });
        jPanel1.add(TXT3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 120, 30));

        L5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L5.setText("Categoria:");
        jPanel1.add(L5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 60, 20));

        TXT4.setBorder(null);
        TXT4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT4KeyTyped(evt);
            }
        });
        jPanel1.add(TXT4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 222, 120, 30));

        SP4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 10));

        SP5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, 10));

        SP6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 120, 10));

        L6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L6.setText("Cantidad");
        jPanel1.add(L6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 20));

        TXT6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        TXT6.setBorder(null);
        TXT6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT6KeyTyped(evt);
            }
        });
        jPanel1.add(TXT6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 266, 110, 30));

        SP7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 110, 10));

        L7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L7.setText("Precio total (Sin IVA):");
        jPanel1.add(L7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 20));

        TXT7.setBorder(null);
        TXT7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXT7KeyTyped(evt);
            }
        });
        jPanel1.add(TXT7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 110, 20));

        SP8.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 110, 10));

        L12.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L12.setText("Informacion Adicional:");
        jPanel1.add(L12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 130, 20));

        TXTA1.setColumns(20);
        TXTA1.setRows(5);
        TXTA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TXTA1KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(TXTA1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 240, 100));

        L8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L8.setText("Precio total (con IVA):");
        jPanel1.add(L8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 130, 20));

        SP9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(SP9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 160, 10));

        TXT8.setBorder(null);
        jPanel1.add(TXT8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 342, 160, 30));

        BT1.setBackground(new java.awt.Color(0, 193, 193));
        BT1.setText("Subir Registro");
        jPanel1.add(BT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 442, 110, 40));

        BT2.setBackground(new java.awt.Color(0, 193, 193));
        BT2.setText("Limpiar los campos");
        BT2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.add(BT2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 442, 140, 40));

        L13.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        L13.setForeground(new java.awt.Color(255, 255, 0));
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
 /*Evento para que solo ingrese numeros en los campos donde solo iran numeros
    */
    private void TXT4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT4KeyTyped
        char n = evt.getKeyChar();
        if(( n<  '0' || n> '9')) evt.consume();
    }//GEN-LAST:event_TXT4KeyTyped

    private void TXT3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT3KeyTyped
        char n = evt.getKeyChar();
        if(( n<  '0' || n> '9')) evt.consume();
    }//GEN-LAST:event_TXT3KeyTyped

    private void TXT6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT6KeyTyped
        char n = evt.getKeyChar();
        if(( n<  '0' || n> '9')) evt.consume();
    }//GEN-LAST:event_TXT6KeyTyped

    private void TXT7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXT7KeyTyped
        char n = evt.getKeyChar();
        if(( n<  '0' || n> '9')) evt.consume();
    }//GEN-LAST:event_TXT7KeyTyped
//Evento y metodo para que solo sean letras en los campos donde solo seran letras
    private void TXTA1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TXTA1KeyTyped
        char c = evt.getKeyChar();
        if ((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_TXTA1KeyTyped

    
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
    private javax.swing.JButton BT1;
    private javax.swing.JButton BT2;
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
    private javax.swing.JSeparator SP1;
    private javax.swing.JSeparator SP2;
    private javax.swing.JSeparator SP3;
    private javax.swing.JSeparator SP4;
    private javax.swing.JSeparator SP5;
    private javax.swing.JSeparator SP6;
    private javax.swing.JSeparator SP7;
    private javax.swing.JSeparator SP8;
    private javax.swing.JSeparator SP9;
    private javax.swing.JTextField TXT1;
    private javax.swing.JTextField TXT2;
    private javax.swing.JTextField TXT3;
    private javax.swing.JTextField TXT4;
    private javax.swing.JTextField TXT6;
    private javax.swing.JTextField TXT7;
    private javax.swing.JTextField TXT8;
    private javax.swing.JTextArea TXTA1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
