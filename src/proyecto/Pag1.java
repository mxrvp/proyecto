
package proyecto;

import java.awt.Color;

public class Pag1 extends javax.swing.JPanel {


    public Pag1() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        txtPasword = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        txtCedula = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtDriccion = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        btnnCrear = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtPaswordConfirmada = new javax.swing.JPasswordField();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setPreferredSize(new java.awt.Dimension(1763, 816));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Bahnschrift", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lunes 13 de Mayo de 2022");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnCerrar.setBackground(new java.awt.Color(221, 221, 221));
        btnCerrar.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnCerrarLayout = new javax.swing.GroupLayout(btnCerrar);
        btnCerrar.setLayout(btnCerrarLayout);
        btnCerrarLayout.setHorizontalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );
        btnCerrarLayout.setVerticalGroup(
            btnCerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Usuario");

        txtUsuario.setBackground(new java.awt.Color(244, 244, 244));
        txtUsuario.setForeground(new java.awt.Color(153, 153, 153));
        txtUsuario.setText("Ingrese su nombre de usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator7.setForeground(new java.awt.Color(133, 133, 201));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Contraseña");

        txtPasword.setBackground(new java.awt.Color(244, 244, 244));
        txtPasword.setForeground(new java.awt.Color(153, 153, 153));
        txtPasword.setText("1234567890");
        txtPasword.setBorder(null);
        txtPasword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPaswordMousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Ingrese su nombre");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator8.setForeground(new java.awt.Color(133, 133, 201));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Apellido");

        txtApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtApellido.setText("Ingrese su apellido");
        txtApellido.setBorder(null);
        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator6.setForeground(new java.awt.Color(133, 133, 201));

        txtCedula.setBackground(new java.awt.Color(244, 244, 244));
        txtCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtCedula.setText("Ingrese su cedula");
        txtCedula.setBorder(null);
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Cedula");

        jSeparator9.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator9.setForeground(new java.awt.Color(133, 133, 201));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Direccion");

        txtDriccion.setBackground(new java.awt.Color(244, 244, 244));
        txtDriccion.setForeground(new java.awt.Color(153, 153, 153));
        txtDriccion.setText("Ingrese su direccion");
        txtDriccion.setBorder(null);
        txtDriccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDriccionMousePressed(evt);
            }
        });

        jSeparator10.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator10.setForeground(new java.awt.Color(133, 133, 201));

        btnnCrear.setBackground(new java.awt.Color(255, 255, 255));
        btnnCrear.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 81, 152)));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Crear ");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnnCrearLayout = new javax.swing.GroupLayout(btnnCrear);
        btnnCrear.setLayout(btnnCrearLayout);
        btnnCrearLayout.setHorizontalGroup(
            btnnCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        btnnCrearLayout.setVerticalGroup(
            btnnCrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnnCrearLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Confirmar Contraseña");

        txtPaswordConfirmada.setBackground(new java.awt.Color(244, 244, 244));
        txtPaswordConfirmada.setForeground(new java.awt.Color(153, 153, 153));
        txtPaswordConfirmada.setText("1234567890");
        txtPaswordConfirmada.setBorder(null);
        txtPaswordConfirmada.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPaswordConfirmadaMousePressed(evt);
            }
        });

        jSeparator12.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator12.setForeground(new java.awt.Color(133, 133, 201));

        jSeparator11.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator11.setForeground(new java.awt.Color(133, 133, 201));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPaswordConfirmada, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDriccion, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(200, 200, 200)))
                        .addGap(130, 130, 130))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtPasword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtPaswordConfirmada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDriccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(291, 291, 291)
                        .addComponent(btnnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1381, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        btnCerrar.setBackground(Color.red);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        btnCerrar.setBackground(new Color(221,221,221));
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel2MousePressed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed
        if(txtUsuario.getText().equals("Ingrese su nombre de usuario"))
        {
            txtUsuario.setText("");
            txtUsuario.setForeground(Color.black);
        }
        if(String.valueOf(txtPasword.getPassword()).isEmpty())
        {
            txtPasword.setText("1234567890");
            txtPasword.setForeground(Color.gray);
        }
        if(txtNombre.getText().equals(""))
        {
            txtNombre.setText("Ingrese su nombre");
            txtNombre.setForeground(Color.gray);
        }
        if(txtApellido.getText().equals(""))
        {
            txtApellido.setText("Ingrese su apellido");
            txtApellido.setForeground(Color.gray);
        }
        if(txtCedula.getText().equals(""))
        {
            txtCedula.setText("Ingrese su cedula");
            txtCedula.setForeground(Color.gray);
        }
        if(txtDriccion.getText().equals(""))
        {
            txtDriccion.setText("Ingrese su direccion");
            txtDriccion.setForeground(Color.gray);
        }
        if(String.valueOf(txtPaswordConfirmada.getPassword()).isEmpty())
        {
            txtPaswordConfirmada.setText("1234567890");
            txtPaswordConfirmada.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUsuarioMousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // codigo de archivo
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        btnnCrear.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        btnnCrear.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void txtDriccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDriccionMousePressed
        if(txtDriccion.getText().equals("Ingrese su direccion"))
        {
            txtDriccion.setText("");
            txtDriccion.setForeground(Color.black);
        }
        if(txtCedula.getText().equals(""))
        {
            txtCedula.setText("Ingrese su cedula");
            txtCedula.setForeground(Color.gray);
        }
        if(txtUsuario.getText().equals(""))
        {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }
        if(String.valueOf(txtPasword.getPassword()).isEmpty())
        {
            txtPasword.setText("1234567890");
            txtPasword.setForeground(Color.gray);
        }
        if(txtNombre.getText().equals(""))
        {
            txtNombre.setText("Ingrese su nombre");
            txtNombre.setForeground(Color.gray);
        }
        if(txtApellido.getText().equals(""))
        {
            txtApellido.setText("Ingrese su apellido");
            txtApellido.setForeground(Color.gray);
        }
        if(String.valueOf(txtPaswordConfirmada.getPassword()).isEmpty())
        {
            txtPaswordConfirmada.setText("1234567890");
            txtPaswordConfirmada.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtDriccionMousePressed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        if(txtCedula.getText().equals("Ingrese su cedula"))
        {
            txtCedula.setText("");
            txtCedula.setForeground(Color.black);
        }
        if(txtUsuario.getText().equals(""))
        {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }
        if(String.valueOf(txtPasword.getPassword()).isEmpty())
        {
            txtPasword.setText("1234567890");
            txtPasword.setForeground(Color.gray);
        }
        if(txtNombre.getText().equals(""))
        {
            txtNombre.setText("Ingrese su nombre");
            txtNombre.setForeground(Color.gray);
        }
        if(txtApellido.getText().equals(""))
        {
            txtApellido.setText("Ingrese su apellido");
            txtApellido.setForeground(Color.gray);
        }
        if(txtDriccion.getText().equals(""))
        {
            txtDriccion.setText("Ingrese su direccion");
            txtDriccion.setForeground(Color.gray);
        }
        if(String.valueOf(txtPaswordConfirmada.getPassword()).isEmpty())
        {
            txtPaswordConfirmada.setText("1234567890");
            txtPaswordConfirmada.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtPaswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaswordMousePressed
        if(String.valueOf(txtPasword.getPassword()).equals("1234567890"))
        {
            txtPasword.setText("");
            txtPasword.setForeground(Color.black);
        }

        if(txtUsuario.getText().isEmpty())
        {
            txtUsuario.setForeground(Color.gray);
            txtUsuario.setText("Ingrese su nombre de usuario");
        }
        if(txtNombre.getText().equals(""))
        {
            txtNombre.setText("Ingrese su nombre");
            txtNombre.setForeground(Color.gray);
        }
        if(txtApellido.getText().equals(""))
        {
            txtApellido.setText("Ingrese su apellido");
            txtApellido.setForeground(Color.gray);
        }
        if(txtCedula.getText().equals(""))
        {
            txtCedula.setText("Ingrese su cedula");
            txtCedula.setForeground(Color.gray);
        }
        if(txtDriccion.getText().equals(""))
        {
            txtDriccion.setText("Ingrese su direccion");
            txtDriccion.setForeground(Color.gray);
        }
        if(String.valueOf(txtPaswordConfirmada.getPassword()).isEmpty())
        {
            txtPaswordConfirmada.setText("1234567890");
            txtPaswordConfirmada.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtPaswordMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        //JOptionPane.show
        if(txtNombre.getText().equals("Ingrese su nombre"))
        {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if(String.valueOf(txtPasword.getPassword()).isEmpty())
        {
            txtPasword.setText("1234567890");
            txtPasword.setForeground(Color.gray);
        }
        if(txtApellido.getText().equals("Ingrese su apellido"))
        {
            txtApellido.setText("");
            txtApellido.setForeground(Color.black);
        }
        if(txtUsuario.getText().equals(""))
        {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }
        if(txtApellido.getText().equals(""))
        {
            txtApellido.setText("Ingrese su apellido");
            txtApellido.setForeground(Color.gray);
        }
        if(txtCedula.getText().equals(""))
        {
            txtCedula.setText("Ingrese su cedula");
            txtCedula.setForeground(Color.gray);
        }
        if(txtDriccion.getText().equals(""))
        {
            txtDriccion.setText("Ingrese su direccion");
            txtDriccion.setForeground(Color.gray);
        }
        if(String.valueOf(txtPaswordConfirmada.getPassword()).isEmpty())
        {
            txtPaswordConfirmada.setText("1234567890");
            txtPaswordConfirmada.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed
        if(txtApellido.getText().equals("Ingrese su apellido"))
        {
            txtApellido.setText("");
            txtApellido.setForeground(Color.black);
        }
        if(String.valueOf(txtPasword.getPassword()).isEmpty())
        {
            txtPasword.setText("1234567890");
            txtPasword.setForeground(Color.gray);
        }
        if(txtNombre.getText().equals(""))
        {
            txtNombre.setText("Ingrese su nombre");
            txtNombre.setForeground(Color.gray);
        }
        if(txtUsuario.getText().equals(""))
        {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }
        if(txtCedula.getText().equals(""))
        {
            txtCedula.setText("Ingrese su cedula");
            txtCedula.setForeground(Color.gray);
        }
        if(txtDriccion.getText().equals(""))
        {
            txtDriccion.setText("Ingrese su direccion");
            txtDriccion.setForeground(Color.gray);
        }
        if(String.valueOf(txtPaswordConfirmada.getPassword()).isEmpty())
        {
            txtPaswordConfirmada.setText("1234567890");
            txtPaswordConfirmada.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtPaswordConfirmadaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPaswordConfirmadaMousePressed
        if(String.valueOf(txtPaswordConfirmada.getPassword()).equals("1234567890"))
        {
            txtPaswordConfirmada.setText("");
            txtPaswordConfirmada.setForeground(Color.black);
        }
        if(txtApellido.getText().equals(""))
        {
            txtApellido.setText("Ingrese su apellido");
            txtApellido.setForeground(Color.gray);
        }
        if(txtNombre.getText().equals(""))
        {
            txtNombre.setText("Ingrese su nombre");
            txtNombre.setForeground(Color.gray);
        }
        if(txtUsuario.getText().equals(""))
        {
            txtUsuario.setText("Ingrese su nombre de usuario");
            txtUsuario.setForeground(Color.gray);
        }
        if(txtCedula.getText().equals(""))
        {
            txtCedula.setText("Ingrese su cedula");
            txtCedula.setForeground(Color.gray);
        }
        if(txtDriccion.getText().equals(""))
        {
            txtDriccion.setText("Ingrese su direccion");
            txtDriccion.setForeground(Color.gray);
        }
        if(String.valueOf(txtPasword.getPassword()).isEmpty())
        {
            txtPasword.setText("1234567890");
            txtPasword.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_txtPaswordConfirmadaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDriccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPasword;
    private javax.swing.JPasswordField txtPaswordConfirmada;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
