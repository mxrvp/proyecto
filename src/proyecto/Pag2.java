
package proyecto;

import empleados.Empleado;
import empleados.EmpleadosModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Date;
import javax.swing.JOptionPane;
import utilmax.Utilitario;


public class Pag2 extends javax.swing.JPanel {

  EmpleadosModel emMod=new EmpleadosModel();
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
        btnFind = new javax.swing.JLabel();
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
        btnInsert = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        btnSave = new javax.swing.JLabel();
        selectorFechaVec = new com.toedter.calendar.JDateChooser();
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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
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

        btnFind.setForeground(new java.awt.Color(0, 0, 0));
        btnFind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        btnFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFind.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFindMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFindMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnFindMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        txtPrimerNombre.setToolTipText("Ingrese el primer nombre");
        txtPrimerNombre.setBorder(null);
        txtPrimerNombre.setEnabled(false);

        jSeparator7.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator7.setForeground(new java.awt.Color(133, 133, 201));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Primer Nombre");

        jSeparator11.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator11.setForeground(new java.awt.Color(133, 133, 201));

        txtCedula.setBackground(new java.awt.Color(244, 244, 244));
        txtCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtCedula.setToolTipText("Ingrese la cedula");
        txtCedula.setBorder(null);
        txtCedula.setEnabled(false);

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
        txtPrimerApellido.setToolTipText("Ingrese el primer apellido");
        txtPrimerApellido.setBorder(null);
        txtPrimerApellido.setEnabled(false);

        jSeparator13.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator13.setForeground(new java.awt.Color(133, 133, 201));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Segundo Apellido");

        txtSegundoApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtSegundoApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtSegundoApellido.setToolTipText("Ingrese el segundo apellido");
        txtSegundoApellido.setBorder(null);
        txtSegundoApellido.setEnabled(false);

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
        txtDireccion.setToolTipText("Ingrese la direccion");
        txtDireccion.setBorder(null);
        txtDireccion.setEnabled(false);

        jSeparator15.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator15.setForeground(new java.awt.Color(133, 133, 201));

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Telefono");

        txtTelefono.setBackground(new java.awt.Color(244, 244, 244));
        txtTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtTelefono.setToolTipText("Ingrese el telefono");
        txtTelefono.setBorder(null);
        txtTelefono.setEnabled(false);

        jSeparator16.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator16.setForeground(new java.awt.Color(133, 133, 201));

        btnInsertar.setBackground(new java.awt.Color(255, 255, 255));
        btnInsertar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 81, 152)));

        btnInsert.setForeground(new java.awt.Color(0, 0, 0));
        btnInsert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInsert.setText("Insertar");
        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.setEnabled(false);
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInsertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInsertMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnInsertMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnInsertarLayout = new javax.swing.GroupLayout(btnInsertar);
        btnInsertar.setLayout(btnInsertarLayout);
        btnInsertarLayout.setHorizontalGroup(
            btnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnInsertarLayout.setVerticalGroup(
            btnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 81, 152)));

        btnSave.setForeground(new java.awt.Color(0, 0, 0));
        btnSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSave.setText("Guardar");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSave.setEnabled(false);
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSaveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSaveMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSaveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        selectorFechaVec.setEnabled(false);

        txtSegundoNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtSegundoNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtSegundoNombre.setToolTipText("Ingrese el segundo nombre");
        txtSegundoNombre.setBorder(null);
        txtSegundoNombre.setEnabled(false);

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
                        .addContainerGap(849, Short.MAX_VALUE))
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
                                .addComponent(selectorFechaVec, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 462, Short.MAX_VALUE)
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
                            .addComponent(selectorFechaVec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnFindMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindMouseEntered
        btnBuscar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_btnFindMouseEntered

    private void btnFindMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindMouseExited
        btnBuscar.setBackground(new Color(244,244,244));
    }//GEN-LAST:event_btnFindMouseExited

    private void btnFindMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFindMousePressed
         //primero limpiar todos los inputs
         limpiarForm();
            String c=txtBuscarCedula.getText();
           Empleado resBus=emMod.buscarCedula(c);
        if(Utilitario.estaVacia(c) || resBus==null ){
           JFrameAviso1 obj = new JFrameAviso1();
            obj.setVisible(true);
            enableTxt();
             onBtnIns();
            offBtnSave();
            
            //set del queryType para estar lista para el insertt
            emMod.setQueryType(1);
           
        }else{
          
          
           String arr[]=new String[7];
           arr[0]=resBus.getCedula();
           arr[1]=resBus.getNombre();
           arr[2]=resBus.getNombre2();
           arr[3]=resBus.getApellido();
           arr[4]=resBus.getApellido2();
           arr[5]=resBus.getDireccion();
           arr[6]=resBus.getTelefono();
           
            enableTxt();
           //ajustes especiales de fecha y cedula
           selectorFechaVec.setDate(resBus.getFechaNacimiento());
           
            this.offCedula();
           //ajustes del form
           cargarForm(arr);
             offBtnIns();
            onBtnSave();
             //set del queryType para estar lista para el update
             emMod.setQueryType(2);
        }
            
    }//GEN-LAST:event_btnFindMousePressed

    private void btnInsertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseEntered
        btnInsertar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_btnInsertMouseEntered

    private void btnInsertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseExited
        btnInsertar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnInsertMouseExited

    private void btnInsertMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMousePressed
        //insertar en archivs empleado
        
         if(emMod.getQueryType()==1){
             
             String errors=verificarTodos();
          
         if(errors.length()>0){   
             String msg="Se han encontrado los siguientes errores:\n";
             msg+=errors;
             Utilitario.erro(msg,null);
         }
         else{
             Empleado em=new Empleado(txtCedula.getText(),txtPrimerNombre.getText(),txtSegundoNombre.getText(),txtPrimerApellido.getText(),txtSegundoApellido.getText(),selectorFechaVec.getDate(),txtDireccion.getText(),txtTelefono.getText());
            emMod.insertar(em);
              Utilitario.exi("registrado con exito",null);
             
               
          }
         }
        
    }//GEN-LAST:event_btnInsertMousePressed

    private void btnSaveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseEntered
        btnGuardar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_btnSaveMouseEntered

    private void btnSaveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseExited
        btnGuardar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnSaveMouseExited

    private void btnSaveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMousePressed
        //modifca sus datos 
        
        if(emMod.getQueryType()==2){
               String errors=verificarTodos();
          
         if(errors.length()>0){   
             String msg="Se han encontrado los siguientes errores:\n";
             msg+=errors;
             Utilitario.erro(msg,null);
         }
         else{
             Empleado em=emMod.buscarCedula(txtCedula.getText());
             int index=emMod.mostrar_todos().indexOf(em);
             
             
              emMod.modificar(index,txtPrimerNombre.getText(),txtSegundoNombre.getText(),txtPrimerApellido.getText(),txtSegundoApellido.getText(),selectorFechaVec.getDate(),txtDireccion.getText(),txtTelefono.getText());
              Utilitario.exi("Actualizado con éxito",null);
             
          }
        
        }
      
    }//GEN-LAST:event_btnSaveMousePressed

    
    //utilidades 
    public String verificarTodos(){
         String err="";
          String ced=txtCedula.getText();
          String pN=txtPrimerNombre.getText();
          String sN=txtSegundoNombre.getText();
          String pA=txtPrimerApellido.getText();
          String sA=txtSegundoApellido.getText();
          String dir=txtDireccion.getText();
          String tel=txtTelefono.getText();
          Date fV=selectorFechaVec.getDate();
          
          String ar[]={
             ced,
             pN,
             sN,
             pA,
             sA,
             dir,
             tel
          };
          
          String def[]={
             "el campo cedula esta vacio",
              "el campo primer Nombre esta vacio",
               "el campo segundo Nombre esta vacio",
                "el campo primer Apellido esta vacio",
                 "el campo segundo Apellido esta vacio",
                  "el campo direccion esta vacio",
                   "el campo telefono esta vacio"
                 
          };
        
        switch(emMod.getQueryType()){
            
            //chequeo general
            case 1:
        
           for(int i=0;i<=ar.length-1;i++){
                   if(Utilitario.estaVacia(ar[i])){
                       
                           err+=def[i];
                           err+="\n";
                          
                     }
                }
        
            if(fV==null){
                err+="La fecha no ha sido seleccionada";
                     err+="\n";
              }
            if(!emMod.cedulaUnica(ced)){
                    err+="La cedula ya existe";
                      err+="\n";
                    }
            
            //campos numerios
            if(pN.matches(".*[0-9].*")){
                 err+="el primer Nombre no puede ser numérico";
                      err+="\n";
            }
            
            if(sN.matches(".*[0-9].*")){
                 err+="el segundo Nombre no puede ser numérico";
                      err+="\n";
            }
            
              if(pA.matches(".*[0-9].*")){
                 err+="el primer Apellido no puede ser numérico";
                      err+="\n";
            }
             if(sA.matches(".*[0-9].*")){
                 err+="el segundo Apellido no puede ser numérico";
                      err+="\n";
            }
             
             if(dir.matches(".*[0-9].*")){
                 err+="el primer Apellido no puede ser numérico";
                      err+="\n";
            }
           
            
           break;
         
         
          case 2:
        
           for(int i=0;i<=ar.length-1;i++){
                   if(Utilitario.estaVacia(ar[i])){
                       
                           err+=def[i];
                           err+="\n";
                          
                     }
                }
        
            if(fV==null){
                err+="La fecha no ha sido seleccionada";
                     err+="\n";
              }
         

            //campos numerios
            if(pN.matches(".*[0-9].*")){
                 err+="el primer Nombre no puede ser numérico";
                      err+="\n";
            }
            
            if(sN.matches(".*[0-9].*")){
                 err+="el segundo Nombre no puede ser numérico";
                      err+="\n";
            }
            
              if(pA.matches(".*[0-9].*")){
                 err+="el primer Apellido no puede ser numérico";
                      err+="\n";
            }
             if(sA.matches(".*[0-9].*")){
                 err+="el segundo Apellido no puede ser numérico";
                      err+="\n";
            }
             
             if(dir.matches(".*[0-9].*")){
                 err+="el primer Apellido no puede ser numérico";
                      err+="\n";
            }
           
            
         break;
        }
        
        
        return err;
    
    }
    
    public void cargarForm(String vals[]){
        
          txtCedula.setText(vals[0]);
          txtPrimerNombre.setText(vals[1]);
          txtSegundoNombre.setText(vals[2]);
          txtPrimerApellido.setText(vals[3]);
          txtSegundoApellido.setText(vals[4]);
          txtDireccion.setText(vals[5]);
          txtTelefono.setText(vals[6]);
    }
    
    
    public void limpiarForm(){
        
          txtCedula.setText("");
          txtPrimerNombre.setText("");
          txtSegundoNombre.setText("");
          txtPrimerApellido.setText("");
          txtSegundoApellido.setText("");
          txtDireccion.setText("");
          txtTelefono.setText("");
    }
    
    public void onCedula(){
        txtCedula.setEnabled(true);
    }
    
      public void offCedula(){
        txtCedula.setEnabled(false);
    }

      public void onPn(){
        txtPrimerNombre.setEnabled(true);
    }
      
        public void offPn(){
        txtPrimerNombre.setEnabled(false);
    }

        public void onSn(){
        txtSegundoNombre.setEnabled(true);
    }
      
        public void offSn(){
        txtSegundoNombre.setEnabled(false);
    }
        
        public void onPa(){
        txtPrimerApellido.setEnabled(true);
    }
      
        public void offPa(){
        txtPrimerApellido.setEnabled(false);
    }
        
        public void onSa(){
        txtSegundoApellido.setEnabled(true);
    }
      
        public void offSa(){
        txtSegundoApellido.setEnabled(false);
    }
        
          public void onDir(){
        txtDireccion.setEnabled(true);
    }
      
        public void offDir(){
         txtDireccion.setEnabled(false);
    }
        //btn insertar
        public void onBtnIns(){
        btnInsert.setEnabled(true);
    }
       
        public void offBtnIns(){
           btnInsert.setEnabled(false);
    }
        //btn guardar
           public void onBtnSave(){
        btnSave.setEnabled(true);
    }
      
        public void offBtnSave(){
           btnSave.setEnabled(false);
    }
        
        
        public void enableTxt(){
             txtCedula.setEnabled(true);
              txtPrimerNombre.setEnabled(true);
                txtSegundoNombre.setEnabled(true);
                 txtPrimerApellido.setEnabled(true);
                  txtSegundoApellido.setEnabled(true);
                  txtDireccion.setEnabled(true);
                   txtTelefono.setEnabled(true);
                   selectorFechaVec.setEnabled(true);
        }
        
          public void disableTxt(){
             txtCedula.setEnabled(false);
              txtPrimerNombre.setEnabled(false);
                txtSegundoNombre.setEnabled(false);
                 txtPrimerApellido.setEnabled(false);
                  txtSegundoApellido.setEnabled(false);
                   txtDireccion.setEnabled(false);
                    txtTelefono.setEnabled(false);
                    selectorFechaVec.setEnabled(false);
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JLabel btnFind;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JLabel btnInsert;
    private javax.swing.JPanel btnInsertar;
    private javax.swing.JLabel btnSave;
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
    private com.toedter.calendar.JDateChooser selectorFechaVec;
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
