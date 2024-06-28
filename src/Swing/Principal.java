
package Swing;

import java.awt.Toolkit;
import javax.swing.JFrame;


public class Principal extends javax.swing.JFrame {

    RegistrarCliente r = new RegistrarCliente();
    GirosCambioMoneda  g = new GirosCambioMoneda();
    Mensajeria m= new Mensajeria();
      public Principal() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);// el programa se abriba en pantalla completa
        int ancho=Toolkit.getDefaultToolkit().getScreenSize().width;//obtenemos el ancho y largo de la pantalla del pc 
        int largo=Toolkit.getDefaultToolkit().getScreenSize().height;
        contenidoPrincipal.setSize(ancho,largo);// le agregamos el ancho y largo
        
        contenidoPrincipal.add(r);
        contenidoPrincipal.add(m);
        contenidoPrincipal.add(g); 
        r.setSize(850,550);

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paginaGirosCambioMoneda = new javax.swing.JButton();
        paginaMensajeria = new javax.swing.JButton();
        contenidoPrincipal = new javax.swing.JPanel();
        paginaRegistrarCliente = new javax.swing.JButton();
        btnCerrarVentana = new javax.swing.JButton();
        MenuPrincipal = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        paginaGirosCambioMoneda.setText("Giros y cambio de moneda");
        paginaGirosCambioMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaGirosCambioMonedaActionPerformed(evt);
            }
        });
        getContentPane().add(paginaGirosCambioMoneda);
        paginaGirosCambioMoneda.setBounds(370, 10, 230, 24);

        paginaMensajeria.setText("Mensajeria");
        paginaMensajeria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaMensajeriaActionPerformed(evt);
            }
        });
        getContentPane().add(paginaMensajeria);
        paginaMensajeria.setBounds(210, 10, 150, 24);

        contenidoPrincipal.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout contenidoPrincipalLayout = new javax.swing.GroupLayout(contenidoPrincipal);
        contenidoPrincipal.setLayout(contenidoPrincipalLayout);
        contenidoPrincipalLayout.setHorizontalGroup(
            contenidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        contenidoPrincipalLayout.setVerticalGroup(
            contenidoPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(contenidoPrincipal);
        contenidoPrincipal.setBounds(0, 40, 730, 430);

        paginaRegistrarCliente.setText("RegistrarCliente");
        paginaRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paginaRegistrarClienteActionPerformed(evt);
            }
        });
        getContentPane().add(paginaRegistrarCliente);
        paginaRegistrarCliente.setBounds(10, 10, 190, 24);

        btnCerrarVentana.setText("Cerrar");
        btnCerrarVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarVentanaActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrarVentana);
        btnCerrarVentana.setBounds(630, 10, 100, 24);
        setJMenuBar(MenuPrincipal);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paginaGirosCambioMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaGirosCambioMonedaActionPerformed
     m.setVisible(true);  
    }//GEN-LAST:event_paginaGirosCambioMonedaActionPerformed

    private void paginaMensajeriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaMensajeriaActionPerformed
        g.setVisible(true);
    }//GEN-LAST:event_paginaMensajeriaActionPerformed

    private void paginaRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paginaRegistrarClienteActionPerformed
        r.setVisible(true);
    }//GEN-LAST:event_paginaRegistrarClienteActionPerformed

    private void btnCerrarVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarVentanaActionPerformed
       m.setVisible(false);
       g.setVisible(false);
       r.setVisible(false);
    }//GEN-LAST:event_btnCerrarVentanaActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JButton btnCerrarVentana;
    private javax.swing.JPanel contenidoPrincipal;
    private javax.swing.JButton paginaGirosCambioMoneda;
    private javax.swing.JButton paginaMensajeria;
    private javax.swing.JButton paginaRegistrarCliente;
    // End of variables declaration//GEN-END:variables
}
