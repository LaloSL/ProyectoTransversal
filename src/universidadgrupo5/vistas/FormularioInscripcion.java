// Formulario Incripcion (Vista):

package universidadgrupo5.vistas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadgrupo5.accesoADatos.AlumnoData;
import universidadgrupo5.entidades.Alumno;
import universidadgrupo5.entidades.Materia;
import universidadgrupo5.entidades.Inscripcion;
import universidadgrupo5.accesoADatos.InscripcionData;
import universidadgrupo5.accesoADatos.MateriaData;

public class FormularioInscripcion extends javax.swing.JInternalFrame {

    private List<Materia> listaM;
    private List<Alumno> listaA;

    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;

    private DefaultTableModel modelo;

    public FormularioInscripcion() {
        initComponents();

        aData = new AlumnoData();
        listaA = aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData(); // FY
        mData = new MateriaData();  //FY

        cargaAlumnos();
        armarCabeceraTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //@SuppressWarnings("unchecked");
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboxAlumno = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        radioInscriptas = new javax.swing.JRadioButton();
        radioNoInscriptas = new javax.swing.JRadioButton();
        buttonSalir = new javax.swing.JButton();
        jBInscribir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMaterias = new javax.swing.JTable();
        jBAInscribir = new javax.swing.JButton();

        jLabel1.setText("Formulario de Inscripcion");

        jLabel2.setText("Seleccione un alumno:");

        cboxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setText("Listado de Materias");

        radioInscriptas.setText("Materias Inscriptas");
        radioInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioInscriptasActionPerformed(evt);
            }
        });

        radioNoInscriptas.setText("Materias no inscriptas");
        radioNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoInscriptasActionPerformed(evt);
            }
        });

        buttonSalir.setText("Salir");
        buttonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalirActionPerformed(evt);
            }
        });

        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jtMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtMaterias);

        jBAInscribir.setText("Anular Inscripcion");
        jBAInscribir.setEnabled(false);
        jBAInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAInscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(radioNoInscriptas)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(184, 184, 184))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jBInscribir)
                        .addGap(89, 89, 89)
                        .addComponent(jBAInscribir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(radioInscriptas)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(165, 165, 165))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioNoInscriptas)
                    .addComponent(radioInscriptas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAInscribir)
                    .addComponent(jBInscribir)
                    .addComponent(buttonSalir))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoInscriptasActionPerformed

        borrarFilaTabla();
        radioInscriptas.setSelected(false);
        cargaDatosNoInscriptas();
        jBAInscribir.setEnabled(false);
        jBInscribir.setEnabled(true);
    }//GEN-LAST:event_radioNoInscriptasActionPerformed

    //RadioButton Materias Inscriptas
    private void radioInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioInscriptasActionPerformed
        borrarFilaTabla();
        radioNoInscriptas.setSelected(false);
        cargaDatosInscriptas();
        jBAInscribir.setEnabled(true);
        jBInscribir.setEnabled(false);
    }//GEN-LAST:event_radioInscriptasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        int filaseleccionada = jtMaterias.getSelectedRow();
        if (filaseleccionada != -1){

            Alumno a = (Alumno) cboxAlumno.getSelectedItem();

            int idMateria = (Integer) modelo.getValueAt(filaseleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaseleccionada, 1);
            int anio = (Integer) modelo.getValueAt(filaseleccionada, 2);
            Materia m = new Materia(idMateria, nombreMateria, anio, true);

            Inscripcion i = new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
    }//GEN-LAST:event_jBInscribirActionPerformed
    }
    
    private void jBAInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAInscribirActionPerformed
        int filaSeleccionada=jtMaterias.getSelectedRow();
        if(filaSeleccionada!=-1){
            
            Alumno a = (Alumno)cboxAlumno.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            
            inscData.borrarInscripcion(a.getIdAlumno(), idMateria); // (FY)en el video se llama borrarIncripcionMateriaAlumno()
            borrarFilaTabla();
        
        }else{
        JOptionPane.showMessageDialog(null, "Usted debe selecionar un fila de la tabla ");
        }
        
        
        
    }//GEN-LAST:event_jBAInscribirActionPerformed

    private void buttonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSalirActionPerformed

    private void cboxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxAlumnoActionPerformed
    

    //Cargar alumnos
    private void cargaAlumnos() { //cargar al combo box
        for (Alumno item : listaA) {
            cboxAlumno.addItem(item);
        }
    }

    //armado de cabecera
    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtMaterias.setModel(modelo);
    }

    //metodo borrar filas
    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    //metodo cargar datos NO inscriptos
    private void cargaDatosNoInscriptas() {
        //borrar filas de la tabla
        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
        listaM = inscData.obtenerMateriasNoCursadas(selec.getIdAlumno());
        for (Materia m : listaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }

    //metodo carga datos inscriptos
    private void cargaDatosInscriptas() {
        //borrarFilasTabla()
        Alumno selec = (Alumno) cboxAlumno.getSelectedItem();
        List<Materia> lista = inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m : lista) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnioMateria()});
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSalir;
    private javax.swing.JComboBox<Alumno> cboxAlumno;
    private javax.swing.JButton jBAInscribir;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtMaterias;
    private javax.swing.JRadioButton radioInscriptas;
    private javax.swing.JRadioButton radioNoInscriptas;
    // End of variables declaration//GEN-END:variables
}
