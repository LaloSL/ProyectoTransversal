// clase GestionMaterias  (vista "Formulario de Materias")

package universidadgrupo5.vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import universidadgrupo5.accesoADatos.MateriaData;
import universidadgrupo5.entidades.Materia;

/**
 * @author Joaco
 */
public class GestionMaterias extends javax.swing.JInternalFrame {

    private MateriaData matData = new MateriaData();
    private Materia matActual = null;

    /**
     * Creates new form GestionMaterias
     */
    public GestionMaterias() {
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

        jLabel1 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTCodigo = new javax.swing.JTextField();
        jTAño = new javax.swing.JTextField();
        jREstado = new javax.swing.JRadioButton();
        jBNuevo = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();

        jLabel1.setText("Materia");

        jBNuevo.setText("Limpiar Campos");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código");

        jLabel3.setText("Nombre");

        jLabel4.setText("Año");

        jLabel5.setText("Estado");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jBNuevo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jREstado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBBuscar))
                            .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jBEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addComponent(jBGuardar))
                            .addComponent(jTNombre))
                        .addGap(29, 29, 29)
                        .addComponent(jBSalir)
                        .addGap(21, 21, 21))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jBBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jREstado)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBSalir)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//------------------------------------------------------------------------------    
    //BOTON GUARDAR
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed

        try {
            //trae los datos de los diferentes campos
           //Integer codigo = Integer.parseInt(jTCodigo.getText());// capturar exception
            String nombre = jTNombre.getText();

//chequea que no esta vacio el campo nombre  //f
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Favor completar los campos vacios"); //f
                return;
            }

            Integer año = Integer.parseInt(jTAño.getText());
            boolean estado = jREstado.isSelected();

            if (matActual == null) { //pregunto si es una materia es vacia es nueva

                //matActual = new Materia(codigo, nombre, año, estado); //si entra aca es una materia nuevo
                 matActual = new Materia(nombre, año, estado);
                matData.guardarMateria(matActual);

            } else {  // si entra acá es una materia cargada previamente
                
                //matActual.setIdMateria(codigo);
                matActual.setNombre(nombre);
                matActual.setAnioMateria(año);

                if (matActual.isActiva() == false && estado == true) {
                    matActual.setActiva(true);
                } else {
                    matActual.setActiva(estado);
                }
//                matData.modificarMateria(matActual);//guardarMateria(matActual);
               matData.guardarMateria(matActual);
            }

        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Ingresar un Codigo valido");
        }
        limpiarCampos();


    }//GEN-LAST:event_jBGuardarActionPerformed
//------------------------------------------------------------------------------    
//BOTON BUSCAR
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        try {
            Integer codigo = Integer.parseInt(jTCodigo.getText());

            matActual = matData.buscarMateriaId(codigo);
            if (matActual != null) {
                jTNombre.setText(matActual.getNombre());

                // Verifica si el valor en la base de datos es igual a 1 y lo convierte a booleano
                jREstado.setSelected(matActual.isActiva());

                jTAño.setText(String.valueOf(matActual.getAnioMateria()));
            }

//                      
        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this, "no existe la materia con el código indicado");
        }
        

    


    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    //BOTON NUEVO
    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed

        limpiarCampos();
        matActual = null;

    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        if (matActual != null) {
            //si entra es xq el alumno existe
            matData.eliminarMateria(matActual.getIdMateria());
            matActual = null;
            limpiarCampos();

        } else {
            JOptionPane.showMessageDialog(this, "Favor indicar el codigo de la materia");

        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void limpiarCampos() {

        //jTCodigo.setText(""); //No borra el codigo para ver cual fue el ultimo q se modificó
        jTNombre.setText("");
        jREstado.setSelected(true);
        jTAño.setText("");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTAño;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
