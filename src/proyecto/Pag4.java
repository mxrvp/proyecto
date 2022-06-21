
package proyecto;

import empleados.Empleado;
import empleados.EmpleadosModel;
import planilla.PlanillaModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import planilla.EmpPlanilla;
import utilmax.Utilitario;


public class Pag4 extends javax.swing.JPanel {
     
  EmpleadosModel emMod=new EmpleadosModel();
  Empleado emSel;
 PlanillaModel pMod=new PlanillaModel();
    public Pag4() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpBase = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtBuscarCedula = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        btnBuscar = new javax.swing.JPanel();
        btnBuscarCedula = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        txtHrsTrabajadas = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        txtSalxHora = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        btnInsertar = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JPanel();
        btnAdd = new javax.swing.JLabel();

        JpBase.setBackground(new java.awt.Color(244, 244, 244));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("Busqueda de empleado");

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

        btnBuscar.setBackground(new java.awt.Color(244, 244, 244));

        btnBuscarCedula.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarCedula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        btnBuscarCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarCedulaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarCedulaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnBuscarCedulaMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnBuscarLayout = new javax.swing.GroupLayout(btnBuscar);
        btnBuscar.setLayout(btnBuscarLayout);
        btnBuscarLayout.setHorizontalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        btnBuscarLayout.setVerticalGroup(
            btnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnBuscarLayout.createSequentialGroup()
                .addComponent(btnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("Primer Nombre");

        txtPrimerNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtPrimerNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtPrimerNombre.setBorder(null);
        txtPrimerNombre.setEnabled(false);

        jSeparator11.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator11.setForeground(new java.awt.Color(133, 133, 201));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 51, 51));
        jLabel17.setText("Segundo Nombre");

        txtSegundoNombre.setBackground(new java.awt.Color(244, 244, 244));
        txtSegundoNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtSegundoNombre.setBorder(null);
        txtSegundoNombre.setEnabled(false);

        jSeparator12.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator12.setForeground(new java.awt.Color(133, 133, 201));

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("Primer Apellido");

        txtPrimerApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtPrimerApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtPrimerApellido.setBorder(null);
        txtPrimerApellido.setEnabled(false);

        jSeparator13.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator13.setForeground(new java.awt.Color(133, 133, 201));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("Segundo Apellido");

        txtSegundoApellido.setBackground(new java.awt.Color(244, 244, 244));
        txtSegundoApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtSegundoApellido.setBorder(null);
        txtSegundoApellido.setEnabled(false);

        jSeparator14.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator14.setForeground(new java.awt.Color(133, 133, 201));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("Horas Trabajadas");

        txtHrsTrabajadas.setBackground(new java.awt.Color(244, 244, 244));
        txtHrsTrabajadas.setForeground(new java.awt.Color(153, 153, 153));
        txtHrsTrabajadas.setText("Ingrese las horas trabajadas");
        txtHrsTrabajadas.setBorder(null);
        txtHrsTrabajadas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHrsTrabajadasMousePressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("Salario por Hora");

        jSeparator15.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator15.setForeground(new java.awt.Color(133, 133, 201));

        txtSalxHora.setBackground(new java.awt.Color(244, 244, 244));
        txtSalxHora.setForeground(new java.awt.Color(153, 153, 153));
        txtSalxHora.setText("Ingrese el salario por hora");
        txtSalxHora.setBorder(null);
        txtSalxHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSalxHoraMousePressed(evt);
            }
        });

        jSeparator16.setBackground(new java.awt.Color(133, 133, 201));
        jSeparator16.setForeground(new java.awt.Color(133, 133, 201));

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(51, 51, 51));
        jLabel23.setText("Datos del empleado");

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Datos del salario");

        btnInsertar.setBackground(new java.awt.Color(255, 255, 255));
        btnInsertar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 81, 152)));

        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnRegresarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnInsertarLayout = new javax.swing.GroupLayout(btnInsertar);
        btnInsertar.setLayout(btnInsertarLayout);
        btnInsertarLayout.setHorizontalGroup(
            btnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnInsertarLayout.setVerticalGroup(
            btnInsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        btnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        btnGuardar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 81, 152)));

        btnAdd.setForeground(new java.awt.Color(0, 0, 0));
        btnAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAdd.setText("Agregar");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAddMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnGuardarLayout = new javax.swing.GroupLayout(btnGuardar);
        btnGuardar.setLayout(btnGuardarLayout);
        btnGuardarLayout.setHorizontalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnGuardarLayout.createSequentialGroup()
                .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnGuardarLayout.setVerticalGroup(
            btnGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JpBaseLayout = new javax.swing.GroupLayout(JpBase);
        JpBase.setLayout(JpBaseLayout);
        JpBaseLayout.setHorizontalGroup(
            JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpBaseLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272)
                .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(JpBaseLayout.createSequentialGroup()
                        .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator9)
                            .addComponent(txtBuscarCedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(JpBaseLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpBaseLayout.createSequentialGroup()
                        .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpBaseLayout.createSequentialGroup()
                        .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHrsTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSalxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)
                            .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(131, 131, 131))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        JpBaseLayout.setVerticalGroup(
            JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpBaseLayout.createSequentialGroup()
                .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpBaseLayout.createSequentialGroup()
                        .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpBaseLayout.createSequentialGroup()
                                .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)))
                            .addGroup(JpBaseLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)))
                        .addGap(50, 50, 50)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtPrimerNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtSegundoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpBaseLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtHrsTrabajadas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtSalxHora, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(JpBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JpBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        if(txtSalxHora.getText().equals(""))
        {
            txtSalxHora.setText("Ingrese el salario por hora");
            txtSalxHora.setForeground(Color.gray);
        }
        if(txtHrsTrabajadas.getText().equals(""))
        {
            txtHrsTrabajadas.setText("Ingrese las horas trabajadas");
            txtHrsTrabajadas.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtBuscarCedulaMousePressed

    private void btnBuscarCedulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCedulaMouseEntered
        btnBuscar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_btnBuscarCedulaMouseEntered

    private void btnBuscarCedulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCedulaMouseExited
        btnBuscar.setBackground(new Color(244,244,244));
    }//GEN-LAST:event_btnBuscarCedulaMouseExited

    private void btnBuscarCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarCedulaMousePressed
           
             limpiarForm();
            String c=txtBuscarCedula.getText();
           Empleado resBus=emMod.buscarCedula(c);
        if(Utilitario.estaVacia(c) || resBus==null ){
           JFrameAviso1 obj = new JFrameAviso1();
            obj.setVisible(true);
      
            
       
        }else{
          
          
           String arr[]=new String[7];
           arr[0]=resBus.getCedula();
           arr[1]=resBus.getNombre();
           arr[2]=resBus.getNombre2();
           arr[3]=resBus.getApellido();
           arr[4]=resBus.getApellido2();
           arr[5]=String.valueOf(resBus.getHorasTrabajadas());
           arr[6]=String.valueOf(resBus.getSalarioHora());
           
        
           
            disableTxt();
          
           //ajustes del form
           //se encuentra el empleado
           emSel=resBus;
           //se carga la data
           cargarForm(arr);
            
             //set del queryType para estar lista para el update
             emMod.setQueryType(1);
        }
    }//GEN-LAST:event_btnBuscarCedulaMousePressed

    private void txtHrsTrabajadasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHrsTrabajadasMousePressed
        if(txtHrsTrabajadas.getText().equals("Ingrese las horas trabajadas"))
        {
            txtHrsTrabajadas.setText("");
            txtHrsTrabajadas.setForeground(Color.black);
        }
        if(txtSalxHora.getText().equals(""))
        {
            txtSalxHora.setText("Ingrese el salario por hora");
            txtSalxHora.setForeground(Color.gray);
        }
        if(txtBuscarCedula.getText().equals(""))
        {
            txtBuscarCedula.setText("Ingrese la cedula");
            txtBuscarCedula.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtHrsTrabajadasMousePressed

    private void txtSalxHoraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSalxHoraMousePressed
        if(txtSalxHora.getText().equals("Ingrese el salario por hora"))
        {
            txtSalxHora.setText("");
            txtSalxHora.setForeground(Color.black);
        }
        if(txtHrsTrabajadas.getText().equals(""))
        {
            txtHrsTrabajadas.setText("Ingrese las horas trabajadas");
            txtHrsTrabajadas.setForeground(Color.gray);
        }
        if(txtBuscarCedula.getText().equals(""))
        {
            txtBuscarCedula.setText("Ingrese la cedula");
            txtBuscarCedula.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtSalxHoraMousePressed

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        btnInsertar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        btnInsertar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnRegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMousePressed
        Pag3 p3 = new Pag3();
        p3.setSize(1210, 830);
        p3.setLocation(0,0);
        
        JpBase.removeAll();
        JpBase.add(p3,BorderLayout.CENTER);
        JpBase.revalidate();;
        JpBase.repaint();
    }//GEN-LAST:event_btnRegresarMousePressed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        btnGuardar.setBackground(new Color(52, 152, 219));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        btnGuardar.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnAddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMousePressed
        //modifca sus datos
         emMod.setQueryType(1);
         
        
           if(emMod.getQueryType()==1){
             
             String errors=verificarTodos();
          
         if(errors.length()>0){   
             String msg="Se han encontrado los siguientes errores:\n";
             msg+=errors;
             Utilitario.erro(msg,null);
         }
         else{
            
             EmpPlanilla emp=new EmpPlanilla(emSel);
                //System.out.println(emSel.getCedula());
             emp.calcularSalarioBruto();
             emp.calcularSS();
             emp.calcularSE();
             emp.calcularSalarioNeto();
             
            pMod.insertar(emp);
              Utilitario.exi("registrado con exito",null);
             
               
          }
         }
        
    }//GEN-LAST:event_btnAddMousePressed
//utilidades
     public String verificarTodos(){
         String err="";
          String pN=txtPrimerNombre.getText();
          String sN=txtSegundoNombre.getText();
          String pA=txtPrimerApellido.getText();
          String sA=txtSegundoApellido.getText();
          String hT=txtHrsTrabajadas.getText();
        String sH=txtSalxHora.getText();
          String ar[]={
           
             pN,
             sN,
             pA,
             sA,
             hT,
             sH
            
          };
          
          String def[]={
              "el campo primer Nombre esta vacio",
               "el campo segundo Nombre esta vacio",
                "el campo primer Apellido esta vacio",
                 "el campo segundo Apellido esta vacio",
                  "el campo horasTrabajadas esta vacio",
                   "el campo salario por hora esta vacio"
                 
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
        
            if(!pMod.cedulaUnica(emSel.getCedula())){
                 err+="El empleado ya se ha añadido al sistema de planilla";
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
             //necesito sabersi el salario hora y horas trabajadas están correctas para modificar el file
           int hs=0;
          if(!Utilitario.esNumero(hT)){
               err+="las horas trabajadas debe ser de tipo numérico";
                      err+="\n";
               
          }else{
              
              System.out.println(getEmpIndex());
              
              Empleado empleadoSel=emMod.buscarEmpleado(getEmpIndex());
            empleadoSel.setHorasTrabajadas(Double.parseDouble(hT));
           
              if(!emSel.evalHoras()){
                    err+="las horas trabajadas no pueden ser menos de 4 ni \n" +
                   "mayor a 12";
                      err+="\n";
              
              }
            
          }
           if(!Utilitario.esNumero(sH)){
               err+="El salario por hora debe ser de tipo numérico";
                      err+="\n";
          }
           else{
                Empleado empleadoSel=emMod.buscarEmpleado(getEmpIndex());
                 empleadoSel.setSalarioHora(Double.parseDouble(sH));
             if(!emSel.evalSalario()){
                    err+="el salario por hora no sea menor de 5.00 ni mayor \n" +
                   "a 20.00";
                      err+="\n";
                  
              }
           }
           
              if(Utilitario.esNumero(hT) && Utilitario.esNumero(sH)){
                  emMod.modificar(getEmpIndex(), Double.parseDouble(hT), Double.parseDouble(sH));
              }
         
           
          break;
         
         
          case 2:
        
           for(int i=0;i<=ar.length-1;i++){
                   if(Utilitario.estaVacia(ar[i])){
                       
                           err+=def[i];
                           err+="\n";
                          
                     }
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
             
            
           
            
         break;
        }
        
        
        return err;
    
    }
    
    public void cargarForm(String vals[]){
        
        
          txtPrimerNombre.setText(vals[1]);
          txtSegundoNombre.setText(vals[2]);
          txtPrimerApellido.setText(vals[3]);
          txtSegundoApellido.setText(vals[4]);
          txtHrsTrabajadas.setText(vals[5]);
           txtSalxHora.setText(vals[6]);
    }
    
    
    public void limpiarForm(){
        
          txtPrimerNombre.setText("");
          txtSegundoNombre.setText("");
          txtPrimerApellido.setText("");
          txtSegundoApellido.setText("");
          txtHrsTrabajadas.setText("");
           txtSalxHora.setText("");
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
        
        
        //btn insertar
        public void onBtnAdd(){
        btnAdd.setEnabled(true);
    }
       
        public void offBtnIns(){
            btnAdd.setEnabled(false);
    }
      
        
        public void enableTxt(){
           
              txtPrimerNombre.setEnabled(true);
                txtSegundoNombre.setEnabled(true);
                 txtPrimerApellido.setEnabled(true);
                  txtSegundoApellido.setEnabled(true);
                  txtHrsTrabajadas.setEnabled(true);
                   txtSalxHora.setEnabled(true);
                 
        }
        
          public void disableTxt(){
           
              txtPrimerNombre.setEnabled(false);
                txtSegundoNombre.setEnabled(false);
                 txtPrimerApellido.setEnabled(false);
                  txtSegundoApellido.setEnabled(false);
                      
        }
          
          
   //retorna el indice del objeto seleccionado el empleado
          public int getEmpIndex(){
            
             int index=emMod.mostrar_todos().indexOf(emSel);
             return index;
          }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpBase;
    private javax.swing.JLabel btnAdd;
    private javax.swing.JPanel btnBuscar;
    private javax.swing.JLabel btnBuscarCedula;
    private javax.swing.JPanel btnCerrar;
    private javax.swing.JPanel btnGuardar;
    private javax.swing.JPanel btnInsertar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField txtBuscarCedula;
    private javax.swing.JTextField txtHrsTrabajadas;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSalxHora;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    // End of variables declaration//GEN-END:variables
}
