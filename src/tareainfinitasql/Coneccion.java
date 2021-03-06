/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareainfinitasql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author kirito205
 */
public class Coneccion extends javax.swing.JFrame {

    Conectar con;
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    /**
     * Creates new form Coneccion
     */
    public Coneccion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnConectar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtIdGrado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnBorrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConectar.setText("Conectar");
        btnConectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConectarActionPerformed(evt);
            }
        });
        jPanel1.add(btnConectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 17, 380, -1));

        jLabel1.setText("id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 22, -1, -1));

        jLabel2.setText("nombre");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 53, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 48, 380, -1));

        jLabel3.setText("Apellido");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 380, -1));

        jLabel4.setText("Edad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 110, 380, -1));

        jLabel5.setText("direccion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 380, -1));
        jPanel1.add(txtIdGrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 380, -1));

        jLabel6.setText("idGrado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConectarActionPerformed
        // TODO add your handling code here:
        con= new Conectar();
        Connection reg= con.getConnection();
    }//GEN-LAST:event_btnConectarActionPerformed

     public void conneccion(){
        con= new Conectar();
        Connection reg = con.getConnection();
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
         conneccion();
        try {
            connection = con.getConnection();
            preparedStatement = connection.prepareStatement("INSERT INTO Docentes (idDocentes, Nombre, Apellido, Edad, Direccion,idGrados) VALUES (?,?,?,?,?,?)");
            preparedStatement.setInt(1, Integer.parseInt (txtId.getText()));
            preparedStatement.setString(2, txtNombre.getText());
            preparedStatement.setString(3, txtApellido.getText());
            preparedStatement.setInt(4, Integer.parseInt (txtEdad.getText()));
            preparedStatement.setString(5, txtDireccion.getText());
            preparedStatement.setInt(6, Integer.parseInt (txtIdGrado.getText()));
            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Docente Guardado");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Guardar Docente");
                Limpiar();
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
         conneccion();
        try {
            connection = con.getConnection();
            preparedStatement = connection.prepareStatement("SELECT idDocentes, Nombre, Apellido, Edad, Direccion,idGrados FROM Docentes WHERE idDocentes=?");
            preparedStatement.setInt(1, Integer.parseInt (txtId.getText()));
            resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
            preparedStatement = connection.prepareStatement("INSERT INTO Docentes (idDocentes, Nombre, Apellido, Edad, Direccion,idGrados) VALUES (?,?,?,?,?,?)");
            txtId.setText(resultSet.getString("idDocentes"));
            txtNombre.setText(resultSet.getString("Nombre"));
            txtApellido.setText(resultSet.getString("Apellido"));
            txtEdad.setText(resultSet.getString("Edad"));
            txtDireccion.setText(resultSet.getString("Direccion"));
            txtIdGrado.setText(resultSet.getString("idGrados"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe un Docente con esa id");
                txtId.setEditable(true);
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
         conneccion();
         try {
            connection = con.getConnection();
            preparedStatement = connection.prepareStatement("UPDATE Docentes SET Nombre=?, Apellido=?, Edad=?, Direccion=?,idGrados=? WHERE idDocentes=?");
             
            preparedStatement.setString(1, txtNombre.getText());
            preparedStatement.setString(2, txtApellido.getText());
            preparedStatement.setInt(3, Integer.parseInt (txtEdad.getText()));
            preparedStatement.setString(4, txtDireccion.getText());
            preparedStatement.setInt(5, Integer.parseInt (txtIdGrado.getText()));
            preparedStatement.setInt(6, Integer.parseInt (txtId.getText()));
            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Docente Modificado");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Modificar Docente");
                Limpiar();
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
         conneccion();
         try {
            connection = con.getConnection();
            preparedStatement = connection.prepareStatement("DELETE FROM Docentes WHERE idDocentes=?");
            preparedStatement.setInt(1, Integer.parseInt(txtId.getText()));
            int res = preparedStatement.executeUpdate();
            if (res > 0) {
                JOptionPane.showMessageDialog(null, "Docente Eliminado");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Eliminar Docente");
                Limpiar();
            }

            connection.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Coneccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Coneccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Coneccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Coneccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Coneccion().setVisible(true);
            }
        });
    }

    public void Limpiar() {
        txtId.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtEdad.setText(null);
        txtDireccion.setText(null);
        txtIdGrado.setText(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnConectar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdGrado;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
