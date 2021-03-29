package Interfaz;

import alarma.CargarArchivos;
import alarma.TablaControl;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Ventana Principal");

        // es de prueba nomas
        //jTableAlarma.setModel(new TablaControl(a1.getArrayalarmas()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTexto7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlarma = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnSalirPrincipal = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMosAlarma = new javax.swing.JTable();
        lbltexto5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTexto1 = new javax.swing.JLabel();
        lblMosEdad = new javax.swing.JLabel();
        lblTexto5 = new javax.swing.JLabel();
        lblTexto4 = new javax.swing.JLabel();
        lblMosTiempo = new javax.swing.JLabel();
        lblTexto6 = new javax.swing.JLabel();
        lblMosTiRestante = new javax.swing.JLabel();
        txtMostrarDetaAla = new javax.swing.JLabel();
        txtMostrarMiAlarma = new javax.swing.JLabel();
        lblReloj = new javax.swing.JLabel();
        btnAtrasPrincipal1 = new javax.swing.JButton();
        btnNuevaAlarma = new javax.swing.JButton();
        lblTexto3 = new javax.swing.JLabel();
        lblTexto2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);

        lblTexto7.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 18)); // NOI18N
        lblTexto7.setForeground(new java.awt.Color(255, 204, 204));
        lblTexto7.setText("Mis Alarmas");

        jTableAlarma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Dia", "Hora", "Sonido", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTableAlarma);
        if (jTableAlarma.getColumnModel().getColumnCount() > 0) {
            jTableAlarma.getColumnModel().getColumn(0).setHeaderValue("Nombre");
            jTableAlarma.getColumnModel().getColumn(1).setHeaderValue("Dia");
            jTableAlarma.getColumnModel().getColumn(2).setHeaderValue("Hora");
            jTableAlarma.getColumnModel().getColumn(3).setHeaderValue("Sonido");
            jTableAlarma.getColumnModel().getColumn(4).setHeaderValue("Estado");
        }

        btnEliminar.setFont(new java.awt.Font("!!! Handwritingg <3", 0, 15)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("!!! Handwritingg <3", 0, 15)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTexto7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTexto7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 390, 180));

        btnSalirPrincipal.setFont(new java.awt.Font("!!! Handwritingg <3", 0, 15)); // NOI18N
        btnSalirPrincipal.setText("Salir");
        btnSalirPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnSalirPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 420, 120, 30));

        jPanel5.setOpaque(false);

        jScrollPane2.setViewportView(jTableMosAlarma);

        lbltexto5.setBackground(new java.awt.Color(102, 255, 255));
        lbltexto5.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 18)); // NOI18N
        lbltexto5.setText("Mi Ultima Alarma");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(lbltexto5)
                .addGap(118, 118, 118))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltexto5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 390, 90));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        lblTexto1.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 20)); // NOI18N
        lblTexto1.setForeground(new java.awt.Color(51, 255, 153));
        lblTexto1.setText("EDAD:");

        lblMosEdad.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 20)); // NOI18N
        lblMosEdad.setForeground(new java.awt.Color(153, 255, 255));
        lblMosEdad.setText("0");

        lblTexto5.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 20)); // NOI18N
        lblTexto5.setForeground(new java.awt.Color(153, 255, 255));
        lblTexto5.setText("anios");

        lblTexto4.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 20)); // NOI18N
        lblTexto4.setForeground(new java.awt.Color(51, 255, 153));
        lblTexto4.setText("Tiempo:");

        lblMosTiempo.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 20)); // NOI18N
        lblMosTiempo.setForeground(new java.awt.Color(153, 255, 255));
        lblMosTiempo.setText("0");

        lblTexto6.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 20)); // NOI18N
        lblTexto6.setForeground(new java.awt.Color(153, 255, 255));
        lblTexto6.setText("minutos");

        lblMosTiRestante.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 36)); // NOI18N
        lblMosTiRestante.setForeground(new java.awt.Color(255, 255, 102));
        lblMosTiRestante.setText("00:00");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMosTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTexto6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTexto1)
                        .addGap(18, 18, 18)
                        .addComponent(lblMosEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(lblTexto5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblMosTiRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTexto1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMosEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTexto5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMosTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTexto6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblTexto4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMosTiRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 50, 190, 210));

        txtMostrarDetaAla.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 16)); // NOI18N
        txtMostrarDetaAla.setForeground(new java.awt.Color(255, 255, 255));
        txtMostrarDetaAla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtMostrarDetaAla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 300, 40));

        txtMostrarMiAlarma.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 36)); // NOI18N
        txtMostrarMiAlarma.setForeground(new java.awt.Color(255, 255, 102));
        txtMostrarMiAlarma.setText("________");
        txtMostrarMiAlarma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(txtMostrarMiAlarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 250, 60));

        lblReloj.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 36)); // NOI18N
        lblReloj.setForeground(new java.awt.Color(0, 204, 204));
        lblReloj.setText("00:00");
        jPanel1.add(lblReloj, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 290, 60));

        btnAtrasPrincipal1.setFont(new java.awt.Font("!!! Handwritingg <3", 0, 15)); // NOI18N
        btnAtrasPrincipal1.setText("Atras");
        btnAtrasPrincipal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnAtrasPrincipal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 120, 30));

        btnNuevaAlarma.setFont(new java.awt.Font("!!! Handwritingg <3", 0, 15)); // NOI18N
        btnNuevaAlarma.setText("Nueva Alarma");
        btnNuevaAlarma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(btnNuevaAlarma, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, 120, 30));

        lblTexto3.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 36)); // NOI18N
        lblTexto3.setForeground(new java.awt.Color(255, 255, 102));
        lblTexto3.setText("ALARMA");
        jPanel1.add(lblTexto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 170, 60));

        lblTexto2.setFont(new java.awt.Font("!!! Handwritingg <3", 1, 18)); // NOI18N
        lblTexto2.setForeground(new java.awt.Color(153, 255, 255));
        lblTexto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/imagen1.jpg"))); // NOI18N
        jPanel1.add(lblTexto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 800, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed


    public JButton getBtnSalirPrincipal() {
        return btnSalirPrincipal;
    }

    public void setBtnSalirPrincipal(JButton btnSalirPrincipal) {
        this.btnSalirPrincipal = btnSalirPrincipal;
    }

    public JButton getBtnAtrasPrincipal() {
        return btnEliminar;
    }

    public void setBtnAtrasPrincipal(JButton btnAtrasPrincipal) {
        this.btnEliminar = btnAtrasPrincipal;
    }

    public JLabel getLblMosEdad() {
        return lblMosEdad;
    }

    public void setLblMosEdad(JLabel lblMosEdad) {
        this.lblMosEdad = lblMosEdad;
    }

    public JLabel getLblMosTiempo() {
        return lblMosTiempo;
    }

    public void setLblMosTiempo(JLabel lblMosTiempo) {
        this.lblMosTiempo = lblMosTiempo;
    }

    public JLabel getLblMosTiRestante() {
        return lblMosTiRestante;
    }

    public void setLblMosTiRestante(JLabel lblMosTiRestante) {
        this.lblMosTiRestante = lblMosTiRestante;
    }

    public JButton getBtnNuevaAlarma() {
        return btnNuevaAlarma;
    }

    public void setBtnNuevaAlarma(JButton btnNuevaAlarma) {
        this.btnNuevaAlarma = btnNuevaAlarma;
    }

    public JTable getjTableAlarma() {
        return jTableAlarma;
    }

    public void setjTableAlarma(JTable jTableAlarma) {
        this.jTableAlarma = jTableAlarma;
    }

    public JLabel getLblReloj() {
        return lblReloj;
    }

    public void setLblReloj(JLabel lblReloj) {
        this.lblReloj = lblReloj;
    }

    public JLabel getTxtMostrar() {
        return txtMostrarMiAlarma;
    }

    public void setTxtMostrar(JLabel txtMostrar) {
        this.txtMostrarMiAlarma = txtMostrar;
    }

   

    public JTable getjTableMosAlarma() {
        return jTableMosAlarma;
    }

    public void setjTableMosAlarma(JTable jTableMosAlarma) {
        this.jTableMosAlarma = jTableMosAlarma;
    }

    public JLabel getTxtMostrarMiAlarma() {
        return txtMostrarMiAlarma;
    }

    public void setTxtMostrarMiAlarma(JLabel txtMostrarMiAlarma) {
        this.txtMostrarMiAlarma = txtMostrarMiAlarma;
    }

    public JButton getBtnEliminar() {
        return btnEliminar;
    }

    public void setBtnEliminar(JButton btnEliminar) {
        this.btnEliminar = btnEliminar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JLabel getTxtMostrarDetaAla() {
        return txtMostrarDetaAla;
    }

    public void setTxtMostrarDetaAla(JLabel txtMostrarDetaAla) {
        this.txtMostrarDetaAla = txtMostrarDetaAla;
    }

    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasPrincipal1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevaAlarma;
    private javax.swing.JButton btnSalirPrincipal;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTableAlarma;
    private javax.swing.JTable jTableMosAlarma;
    private javax.swing.JLabel lblMosEdad;
    private javax.swing.JLabel lblMosTiRestante;
    private javax.swing.JLabel lblMosTiempo;
    private javax.swing.JLabel lblReloj;
    private javax.swing.JLabel lblTexto1;
    private javax.swing.JLabel lblTexto2;
    private javax.swing.JLabel lblTexto3;
    private javax.swing.JLabel lblTexto4;
    private javax.swing.JLabel lblTexto5;
    private javax.swing.JLabel lblTexto6;
    private javax.swing.JLabel lblTexto7;
    private javax.swing.JLabel lbltexto5;
    private javax.swing.JLabel txtMostrarDetaAla;
    private javax.swing.JLabel txtMostrarMiAlarma;
    // End of variables declaration//GEN-END:variables
}
