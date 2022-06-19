
package proyecto;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JOptionPane;


public class Pag2 extends javax.swing.JPanel {


    public Pag2() {
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
        txtBuscarCedula = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        txtCedula = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        btnInsertar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        txtSegundoNombre = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(377, 47));

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        txtBuscarCedula.setBackground(new java.awt.Color(244, 244, 244));
        txtBuscarCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarCedula.setText("Ingrese la cedula");
        txtBuscarCedula.setBorder(null);
        txtBuscarCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtBuscarCedulaMousePressed(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator9.setForeground(new java.awt.Color(133, 133, 201));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Datos del empleado");

        btnBuscar.setBackground(new java.awt.Color(244, 244, 244));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
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

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Busqueda de empleado");

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Cedula");

        txtPrimerNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtPrimerNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtPrimerNombre.setBorder(null);
        txtPrimerNombre.setEnabled(false);
        txtPrimerNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrimerNombreMousePressed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator7.setForeground(new java.awt.Color(133, 133, 201));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Primer Nombre");

        jSeparator11.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator11.setForeground(new java.awt.Color(133, 133, 201));

        txtCedula.setBackground(new java.awt.Color(244, 244, 244));
        txtCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtCedula.setBorder(null);
        txtCedula.setEnabled(false);
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Segundo Nombre");

        jSeparator12.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator12.setForeground(new java.awt.Color(133, 133, 201));

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Primer Apellido");

        txtPrimerApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtPrimerApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtPrimerApellido.setBorder(null);
        txtPrimerApellido.setEnabled(false);
        txtPrimerApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPrimerApellidoMousePressed(evt);
            }
        });

        jSeparator13.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator13.setForeground(new java.awt.Color(133, 133, 201));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Segundo Apellido");

        txtSegundoApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtSegundoApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtSegundoApellido.setBorder(null);
        txtSegundoApellido.setEnabled(false);
        txtSegundoApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSegundoApellidoMousePressed(evt);
            }
        });

        jSeparator14.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator14.setForeground(new java.awt.Color(133, 133, 201));

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Fecha de nacimiento:");

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Direccion");

        txtDireccion.setBackground(new java.awt.Color(244, 244, 244));
        txtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtDireccion.setBorder(null);
        txtDireccion.setEnabled(false);
        txtDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDireccionMousePressed(evt);
            }
        });

        jSeparator15.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator15.setForeground(new java.awt.Color(133, 133, 201));

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Telefono");

        txtTelefono.setBackground(new java.awt.Color(244, 244, 244));
        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setBorder(null);
        txtTelefono.setEnabled(false);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTelefonoMousePressed(evt);
            }
        });

        jSeparator16.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator16.setForeground(new java.awt.Color(133, 133, 201));

        btnInsertar.setBackground(new java.awt.Color(255, 255, 255));
        btnInsertar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 81, 152)));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Insertar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnInsertarLayout = new javax.swing.GroupLayout(btnInsertar);
        btnInsertar.setLayout(btnInsertarLayout);
        btnInsertarLayout.setHorizontalGroup(
            btnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnInsertarLayout.setVerticalGroup(
            btnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 81, 152)));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Guardar");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtSegundoNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtSegundoNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtSegundoNombre.setBorder(null);
        txtSegundoNombre.setEnabled(false);
        txtSegundoNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSegundoNombreMousePressedd(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(101, 101, 101))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator9)
                            .addComponent(txtBuscarCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtBuscarCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBuscarCedulaMousePressed
        if(txtBuscarCedula.getText().equals("Ingrese la cedula"))
        {
            txtBuscarCedula.setText("");
            txtBuscarCedula.setForeground(Color.black);
        }
    }                                      

    private void txtSegundoNombreMousePressed(java.awt.event.MouseEvent evt) {                                              
        
        // No se usa pero no me deja borrarlo como que se bugueo xd
    }//GEN-LAST:event_txtBuscarCedulaMousePressed

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        btnBuscar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        btnBuscar.setBackground(new Color(244,244,244));
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        // codigo de archivo
        Admin obj = new Admin();
        
        txtBuscarCedula.setText(txtBuscarCedula.getText());
        
        if(obj.getCedula().equals(txtBuscarCedula.getText()) )
        {
            // despliega los datos de ese empleado en sus respectivos campos
        }
        else//si no encontro la cedula, activar los campos para que lo ingrese
        {
            
            JFrameAviso1 objj = new JFrameAviso1();
            objj.setVisible(true);
            
            txtCedula.setEnabled(true);
            txtPrimerNombre.setEnabled(true);
            txtSegundoNombre.setEnabled(true);
            txtPrimerApellido.setEnabled(true);        // habilitando los campos txt
            txtSegundoApellido.setEnabled(true);
            txtDireccion.setEnabled(true);
            txtTelefono.setEnabled(true);
  
            // no borrar, efecto placeholder
            if(txtCedula.isEnabled())
            {
                txtCedula.setText("Ingrese la cedula");
                txtCedula.setForeground(new Color(153,153,153));
            }
            if(txtPrimerNombre.isEnabled())
            {
                txtPrimerNombre.setText("Ingrese el primer nombre");
                txtPrimerNombre.setForeground(new Color(153,153,153));
            }
            if(txtSegundoNombre.isEnabled())
            {
                txtSegundoNombre.setText("Ingrese el segundo nombre");
                txtSegundoNombre.setForeground(new Color(153,153,153));
            }
            if(txtPrimerApellido.isEnabled())
            {
                txtPrimerApellido.setText("Ingrese el primer apellido");
                txtPrimerApellido.setForeground(new Color(153,153,153));
            }
            if(txtSegundoApellido.isEnabled())
            {
                txtSegundoApellido.setText("Ingrese el segundo apellido");
                txtSegundoApellido.setForeground(new Color(153,153,153));
            }
            if(txtDireccion.isEnabled())
            {
                txtDireccion.setText("Ingrese la direccion");
                txtDireccion.setForeground(new Color(153,153,153));
            }    
            if(txtTelefono.isEnabled())
            {
                txtTelefono.setText("Ingrese el numero de telefono");
                txtTelefono.setForeground(new Color(153,153,153));
            }       
        }
            
    }//GEN-LAST:event_jLabel4MousePressed

    private void txtPrimerNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrimerNombreMousePressed
        if(txtPrimerNombre.isEnabled())
        {
            if(txtPrimerNombre.getText().equals("Ingrese el primer nombre"))
            {
                txtPrimerNombre.setText("");
                txtPrimerNombre.setForeground(Color.black);
            }
            if(txtSegundoNombre.getText().equals(""))
            {
                txtSegundoNombre.setText("Ingrese el segundo nombre");
                txtSegundoNombre.setForeground(Color.gray);
            }
            if(txtCedula.getText().equals(""))
            {
                txtCedula.setText("Ingrese la cedula");
                txtCedula.setForeground(Color.gray);
            }
            if(txtPrimerApellido.getText().equals(""))
            {
                txtPrimerApellido.setText("Ingrese el primer apellido");
                txtPrimerApellido.setForeground(Color.gray);
            }
            if(txtSegundoApellido.getText().equals(""))
            {
                txtSegundoApellido.setText("Ingrese el segundo apellido");
                txtSegundoApellido.setForeground(Color.gray);
            }
            if(txtDireccion.getText().equals(""))
            {
                txtDireccion.setText("Ingrese la direccion");
                txtDireccion.setForeground(Color.gray);
            }    
            if(txtTelefono.getText().equals(""))
            {
                txtTelefono.setText("Ingrese el numero de telefono");
                txtTelefono.setForeground(Color.gray);
            }
        }
        
    }//GEN-LAST:event_txtPrimerNombreMousePressed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        if(txtCedula.isEnabled())
        {
            if(txtCedula.getText().equals("Ingrese la cedula"))
            {
                txtCedula.setText("");
                txtCedula.setForeground(Color.black);
            }
            if(txtPrimerNombre.getText().equals(""))
            {
                txtPrimerNombre.setText("Ingrese el primer nombre");
                txtPrimerNombre.setForeground(Color.gray);
            }
            if(txtSegundoNombre.getText().equals(""))
            {
                txtSegundoNombre.setText("Ingrese el segundo nombre");
                txtSegundoNombre.setForeground(Color.gray);
            }
            if(txtPrimerApellido.getText().equals(""))
            {
                txtPrimerApellido.setText("Ingrese el primer apellido");
                txtPrimerApellido.setForeground(Color.gray);
            }
            if(txtSegundoApellido.getText().equals(""))
            {
                txtSegundoApellido.setText("Ingrese el segundo apellido");
                txtSegundoApellido.setForeground(Color.gray);
            }
            if(txtDireccion.getText().equals(""))
            {
                txtDireccion.setText("Ingrese la direccion");
                txtDireccion.setForeground(Color.gray);
            }    
            if(txtTelefono.getText().equals(""))
            {
                txtTelefono.setText("Ingrese el numero de telefono");
                txtTelefono.setForeground(Color.gray);
            }    
        }
        
           
    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtPrimerApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPrimerApellidoMousePressed
        if(txtPrimerApellido.isEnabled())
        {
            if(txtPrimerApellido.getText().equals("Ingrese el primer apellido"))
            {
                txtPrimerApellido.setText("");
                txtPrimerApellido.setForeground(Color.black);
            }
            if(txtSegundoNombre.getText().equals(""))
            {
                txtSegundoNombre.setText("Ingrese el segundo nombre");
                txtSegundoNombre.setForeground(Color.gray);
            }
            if(txtPrimerNombre.getText().equals(""))
            {
                txtPrimerNombre.setText("Ingrese el primer nombre");
                txtPrimerNombre.setForeground(Color.gray);
            }
            if(txtCedula.getText().equals(""))
            {
                txtCedula.setText("Ingrese la cedula");
                txtCedula.setForeground(Color.gray);
            }
            if(txtSegundoApellido.getText().equals(""))
            {
                txtSegundoApellido.setText("Ingrese el segundo apellido");
                txtSegundoApellido.setForeground(Color.gray);
            }
            if(txtDireccion.getText().equals(""))
            {
                txtDireccion.setText("Ingrese la direccion");
                txtDireccion.setForeground(Color.gray);
            }    
            if(txtTelefono.getText().equals(""))
            {
                txtTelefono.setText("Ingrese el numero de telefono");
                txtTelefono.setForeground(Color.gray);
            } 
        }
    }//GEN-LAST:event_txtPrimerApellidoMousePressed

    private void txtSegundoApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSegundoApellidoMousePressed
        if(txtSegundoApellido.isEnabled())
        {
            if(txtSegundoApellido.getText().equals("Ingrese el segundo apellido"))
            {
                txtSegundoApellido.setText("");
                txtSegundoApellido.setForeground(Color.black);
            }
            if(txtPrimerApellido.getText().equals(""))
            {
                txtPrimerApellido.setText("Ingrese el primer apellido");
                txtPrimerApellido.setForeground(Color.gray);
            }
            if(txtSegundoNombre.getText().equals(""))
            {
                txtSegundoNombre.setText("Ingrese el segundo nombre");
                txtSegundoNombre.setForeground(Color.gray);
            }
            if(txtPrimerNombre.getText().equals(""))
            {
                txtPrimerNombre.setText("Ingrese el primer nombre");
                txtPrimerNombre.setForeground(Color.gray);
            }
            if(txtCedula.getText().equals(""))
            {
                txtCedula.setText("Ingrese la cedula");
                txtCedula.setForeground(Color.gray);
            }
            if(txtDireccion.getText().equals(""))
            {
                txtDireccion.setText("Ingrese la direccion");
                txtDireccion.setForeground(Color.gray);
            }    
            if(txtTelefono.getText().equals(""))
            {
                txtTelefono.setText("Ingrese el numero de telefono");
                txtTelefono.setForeground(Color.gray);
            }
        }
        
        
    }//GEN-LAST:event_txtSegundoApellidoMousePressed

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        btnInsertar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        btnInsertar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        //insertar en archivs empleado
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        btnGuardar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        btnGuardar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        //modifca sus datos 

    }//GEN-LAST:event_jLabel5MousePressed

    private void txtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMousePressed
        if(txtTelefono.isEnabled())
        {
            if(txtTelefono.getText().equals("Ingrese el numero de telefono"))
            {
                txtTelefono.setText("");
                txtTelefono.setForeground(Color.black);
            }
            if(txtDireccion.getText().equals(""))
            {
                txtDireccion.setText("Ingrese la direccion");
                txtDireccion.setForeground(Color.gray);
            }
            if(txtSegundoApellido.getText().equals(""))
            {
                txtSegundoApellido.setText("Ingrese el segundo apellido");
                txtSegundoApellido.setForeground(Color.gray);
            }
            if(txtPrimerApellido.getText().equals(""))
            {
                txtPrimerApellido.setText("ngrese el primer apellido");
                txtPrimerApellido.setForeground(Color.gray);
            }

            if(txtSegundoNombre.getText().equals(""))
            {
                txtSegundoNombre.setText("Ingrese el segundo nombre");
                txtSegundoNombre.setForeground(Color.gray);
            }
            if(txtPrimerNombre.getText().equals(""))
            {
                txtPrimerNombre.setText("Ingrese el primer nombre");
                txtPrimerNombre.setForeground(Color.gray);
            }

            if(txtCedula.getText().equals(""))
            {
                txtCedula.setText("Ingrese la cedula");
                txtCedula.setForeground(Color.gray);
            }
        }
    }//GEN-LAST:event_txtTelefonoMousePressed

    private void txtDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDireccionMousePressed
        if(txtDireccion.isEnabled())
        {
            if(txtDireccion.getText().equals("Ingrese la direccion"))
            {
                txtDireccion.setText("");
                txtDireccion.setForeground(Color.black);
            }
            if(txtSegundoApellido.getText().equals(""))
            {
                txtSegundoApellido.setText("Ingrese el segundo apellido");
                txtSegundoApellido.setForeground(Color.gray);
            }
            if(txtPrimerApellido.getText().equals(""))
            {
                txtPrimerApellido.setText("ngrese el primer apellido");
                txtPrimerApellido.setForeground(Color.gray);
            }  
            if(txtSegundoNombre.getText().equals(""))
            {
                txtSegundoNombre.setText("Ingrese el segundo nombre");
                txtSegundoNombre.setForeground(Color.gray);
            }
            if(txtPrimerNombre.getText().equals(""))
            {
                txtPrimerNombre.setText("Ingrese el primer nombre");
                txtPrimerNombre.setForeground(Color.gray);
            }
            if(txtCedula.getText().equals(""))
            {
                txtCedula.setText("Ingrese la cedula");
                txtCedula.setForeground(Color.gray);
            }
            if(txtTelefono.getText().equals(""))
            {
                txtTelefono.setText("Ingrese el numero de telefono");
                txtTelefono.setForeground(Color.gray);
            }
        }
    }//GEN-LAST:event_txtDireccionMousePressed

    private void txtSegundoNombreMousePressedd(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSegundoNombreMousePressedd
        if(txtSegundoNombre.isEnabled())
        {
            if(txtSegundoNombre.getText().equals("Ingrese el segundo nombre"))
            {
                txtSegundoNombre.setText("");
                txtSegundoNombre.setForeground(Color.black);
            }
            if(txtPrimerNombre.getText().equals(""))
            {
                txtPrimerNombre.setText("Ingrese el primer nombre");
                txtPrimerNombre.setForeground(Color.gray);
            }
            if(txtCedula.getText().equals(""))
            {
                txtCedula.setText("Ingrese la cedula");
                txtCedula.setForeground(Color.gray);
            }
            if(txtPrimerApellido.getText().equals(""))
            {
                txtPrimerApellido.setText("Ingrese el primer apellido");
                txtPrimerApellido.setForeground(Color.gray);
            }
            if(txtSegundoApellido.getText().equals(""))
            {
                txtSegundoApellido.setText("Ingrese el segundo apellido");
                txtSegundoApellido.setForeground(Color.gray);
            }
            if(txtDireccion.getText().equals(""))
            {
                txtDireccion.setText("Ingrese la direccion");
                txtDireccion.setForeground(Color.gray);
            }    
            if(txtTelefono.getText().equals(""))
            {
                txtTelefono.setText("Ingrese el numero de telefono");
                txtTelefono.setForeground(Color.gray);
            }
        }
    }//GEN-LAST:event_txtSegundoNombreMousePressedd


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnInsertar;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtBuscarCedula;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
