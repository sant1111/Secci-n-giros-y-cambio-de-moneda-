
package Presentacion;

import LogicaClasesPrincipales.Cliente;

import javax.swing.table.DefaultTableModel;

public class RegistrarCliente extends javax.swing.JInternalFrame {

    DefaultTableModel  modelo = new DefaultTableModel();//se inicializa la tabla 

    public RegistrarCliente() {
        initComponents();
        this.setTitle("Registro de clientes");
 
        //visibilidad de los botones
        btnAgregarCliente.setEnabled(true);//setEnable para la visibilidad de los botones
        btnBorrarCliente.setEnabled(true);
        btnEditarTablaRegistroClientes.setEnabled(true);
        btnEliminarTablaClientes.setEnabled(false);
    }
    
    //metodo para borrar los datos del formulario
    public void borrar(){
        txtNombreCliente.setText("");
        txtApellidoCliente.setText("");
        txtNumeroIdentificacionCliente.setText("");
        txtNumeroTelefonoCliente.setText("");
        txtCorreoElectronicoCliente.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreoElectronicoCliente = new javax.swing.JTextField();
        txtNumeroIdentificacionCliente = new javax.swing.JTextField();
        txtNumeroTelefonoCliente = new javax.swing.JTextField();
        txtNombreCliente = new javax.swing.JTextField();
        txtApellidoCliente = new javax.swing.JTextField();
        btnBorrarCliente = new javax.swing.JButton();
        btnEliminarTablaClientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroClientes = new javax.swing.JTable();
        btnAgregarCliente = new javax.swing.JButton();
        btnEditarTablaRegistroClientes = new javax.swing.JButton();
        btnCrearArchivoClientes = new javax.swing.JButton();
        btnActualizarTablaTablaClientes = new javax.swing.JButton();
        btnSeleccionarTablaRegistroCliente = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtIdRegistroCliente = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registro de clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 180, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jLabel3.setText("Numero de telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jLabel5.setText("Numero de identificación");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel6.setText("Correo electronico ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        txtCorreoElectronicoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreoElectronicoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 230, -1));

        txtNumeroIdentificacionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroIdentificacionClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroIdentificacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 230, -1));

        txtNumeroTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTelefonoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 230, -1));

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 210, -1));

        txtApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, -1));

        btnBorrarCliente.setText("Borrar");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 120, -1));

        btnEliminarTablaClientes.setText("Eliminar");
        btnEliminarTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTablaClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 120, -1));

        tblRegistroClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblRegistroClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegistroClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegistroClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 710, 190));

        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 120, -1));

        btnEditarTablaRegistroClientes.setText("Editar");
        btnEditarTablaRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTablaRegistroClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarTablaRegistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 110, -1));

        btnCrearArchivoClientes.setText("Crear Archivo Clientes");
        btnCrearArchivoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearArchivoClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnCrearArchivoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 200, -1));

        btnActualizarTablaTablaClientes.setText("Actualizar tabla");
        btnActualizarTablaTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaTablaClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarTablaTablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 130, -1));

        btnSeleccionarTablaRegistroCliente.setText("Seleccionar");
        btnSeleccionarTablaRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarTablaRegistroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnSeleccionarTablaRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 120, -1));

        jLabel7.setText("Id");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        txtIdRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRegistroClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtIdRegistroCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 210, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoElectronicoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoElectronicoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoElectronicoClienteActionPerformed

    private void txtNumeroIdentificacionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroIdentificacionClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroIdentificacionClienteActionPerformed

    private void txtNumeroTelefonoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTelefonoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTelefonoClienteActionPerformed

    private void txtNombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreClienteActionPerformed

    private void txtApellidoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoClienteActionPerformed

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        borrar();
    }//GEN-LAST:event_btnBorrarClienteActionPerformed

    private void btnEliminarTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTablaClientesActionPerformed
        Cliente c1 = new Cliente();
        c1.eliminarCliente(tblRegistroClientes, txtNombreCliente);
        btnEliminarTablaClientes.setEnabled(false);
    }//GEN-LAST:event_btnEliminarTablaClientesActionPerformed
    
    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
      // agregar al archivo "clientes.txt"
       Cliente c1 = new Cliente();
            //se le asigna el valor a los atributos 

       c1.setIdCliente(Integer.parseInt(txtIdRegistroCliente.getText()));
       c1.setNombre(txtNombreCliente.getText());
       c1.setApellido(txtApellidoCliente.getText());
       c1.setNumeroIdentificacion(Integer.parseInt(txtNumeroIdentificacionCliente.getText()));
       c1.setNumeroTelefono(Integer.parseInt(txtNumeroTelefonoCliente.getText()));
       c1.setCorreoElectronico(txtCorreoElectronicoCliente.getText   ());
       c1.setDireccionResidencia("calle 00");
              // se agregan al txt
       c1.agregarRegistroCliente();
      
       //visibilidad botones 
      btnEditarTablaRegistroClientes.setEnabled(true);
      btnEliminarTablaClientes.setEnabled(true);
       
    }//GEN-LAST:event_btnAgregarClienteActionPerformed
    // se coloca la informacion de la tabla en el formulario de registro 
    private void btnEditarTablaRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTablaRegistroClientesActionPerformed
        Cliente c1 = new Cliente();
        c1.editarClientes(tblRegistroClientes);
        
    }//GEN-LAST:event_btnEditarTablaRegistroClientesActionPerformed
    //evento que para poder editar 
    private void tblRegistroClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegistroClientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblRegistroClientesMouseClicked

    private void btnCrearArchivoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearArchivoClientesActionPerformed
       Cliente c1 = new Cliente();
       c1.crearArchivoClientes();
    }//GEN-LAST:event_btnCrearArchivoClientesActionPerformed

    private void btnActualizarTablaTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaTablaClientesActionPerformed
        Cliente c1 = new Cliente();
        c1.mostrarClientesTblRegistro(tblRegistroClientes);
    }//GEN-LAST:event_btnActualizarTablaTablaClientesActionPerformed

    private void btnSeleccionarTablaRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarTablaRegistroClienteActionPerformed
        Cliente c1 = new Cliente();
        c1.seleccionarCliente(tblRegistroClientes);// se usa el metodo y se le pasa el parametro jtable
        
        txtIdRegistroCliente.setText(String.valueOf(c1.getIdCliente()));
        txtNombreCliente.setText(c1.getNombre());
        txtApellidoCliente.setText(c1.getApellido());
        txtNumeroIdentificacionCliente.setText(String.valueOf(c1.getNumeroIdentificacion()));
        txtNumeroTelefonoCliente.setText(String.valueOf(c1.getNumeroTelefono()));
        txtCorreoElectronicoCliente.setText(c1.getCorreoElectronico());
        
        btnEliminarTablaClientes.setEnabled(true);
    }//GEN-LAST:event_btnSeleccionarTablaRegistroClienteActionPerformed

    private void txtIdRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRegistroClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRegistroClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTablaTablaClientes;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnCrearArchivoClientes;
    private javax.swing.JButton btnEditarTablaRegistroClientes;
    private javax.swing.JButton btnEliminarTablaClientes;
    private javax.swing.JButton btnSeleccionarTablaRegistroCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistroClientes;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtCorreoElectronicoCliente;
    private javax.swing.JTextField txtIdRegistroCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumeroIdentificacionCliente;
    private javax.swing.JTextField txtNumeroTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
