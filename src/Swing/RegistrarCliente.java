/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Swing;

import giros.y.cambio.de.moneda.Cliente;
import giros.y.cambio.de.moneda.Persona;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PC
 */
public class RegistrarCliente extends javax.swing.JInternalFrame {

    DefaultTableModel  modelo = new DefaultTableModel();//se inicializa la tabla 
    ArrayList<Persona> listaClientes = new ArrayList<Persona>(); //se inicializa la lista de objetos persona
    public RegistrarCliente() {
        initComponents();
        this.setTitle("Registro de clientes");
        //modelo de la tabla 
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Numero identificacion");
        modelo.addColumn("Numero Telefono");
        modelo.addColumn("Correo Electronico");
        
        refrescarTabla();
        //visibilidad de los botones
        btnAgregarCliente.setEnabled(true);//setEnable para la visibilidad de los botones
        btnBorrarCliente.setEnabled(true);
        btnEditarTablaRegistroClientes.setEnabled(false);
        btnActualizarTablaClientes.setEnabled(false);
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
    public void refrescarTabla(){
        //borrar todos los elementos del modelo 
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        //recorrer la lista de elementos 
        for (Persona cliente : listaClientes) {
            Object a[]  = new Object[5]; // arreglo de tipo object(se puede ingresar cualquier tipo de dato) de nombre a con la cantidad de atributos que la clase persona
            a[0] = cliente.getNombre();
            a[1] = cliente.getApellido();
            a[2] = cliente.getNumeroIdentificacion();
            a[3] = cliente.getNumeroTelefono();
            a[4] = cliente.getCorreoElectronico();

            modelo.addRow(a);// añadimos al modelo como una fila 
        }
        tblRegistroClientes.setModel(modelo);//se le añade el modelo a la tabla de clientes
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
        btnActualizarTablaClientes = new javax.swing.JButton();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Registro de clientes");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setText("Numero de telefono");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        jLabel4.setText("Apellido");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setText("Numero de identificación");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jLabel6.setText("Correo electronico ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        txtCorreoElectronicoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoElectronicoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreoElectronicoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 160, -1));

        txtNumeroIdentificacionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroIdentificacionClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroIdentificacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 160, -1));

        txtNumeroTelefonoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTelefonoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNumeroTelefonoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 160, -1));

        txtNombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 160, -1));

        txtApellidoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoClienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 160, -1));

        btnBorrarCliente.setText("Borrar");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        btnEliminarTablaClientes.setText("Eliminar");
        btnEliminarTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTablaClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarTablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 420, 70, -1));

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
        jScrollPane1.setViewportView(tblRegistroClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 580, 190));

        btnAgregarCliente.setText("Agregar");
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        btnEditarTablaRegistroClientes.setText("Editar");
        btnEditarTablaRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTablaRegistroClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarTablaRegistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 60, -1));

        btnActualizarTablaClientes.setText("Actualizar");
        btnActualizarTablaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTablaClientesActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarTablaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, 70, -1));

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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarTablaClientesActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
       Persona p = new Persona();
       p.setNombre(txtNombreCliente.getText());// se asigna al objeto persona (lo que se obtiene del txt)
       p.setApellido(txtApellidoCliente.getText());
       p.setNumeroIdentificacion(Integer.parseInt(txtNumeroIdentificacionCliente.getText()));//se hace casteo para convertir a entero
       p.setNumeroTelefono(Integer.parseInt(txtNumeroTelefonoCliente.getText()));
       p.setCorreoElectronico(txtCorreoElectronicoCliente.getText());
       //se añade el objeto persona al arrayList
       listaClientes.add(p);
       refrescarTabla();
       
       //visibilidad botones 
      btnEditarTablaRegistroClientes.setEnabled(false);
       
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEditarTablaRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTablaRegistroClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarTablaRegistroClientesActionPerformed

    private void btnActualizarTablaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTablaClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTablaClientesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTablaClientes;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnEditarTablaRegistroClientes;
    private javax.swing.JButton btnEliminarTablaClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRegistroClientes;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtCorreoElectronicoCliente;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNumeroIdentificacionCliente;
    private javax.swing.JTextField txtNumeroTelefonoCliente;
    // End of variables declaration//GEN-END:variables
}
