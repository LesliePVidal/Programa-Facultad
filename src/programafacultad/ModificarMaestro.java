package programafacultad;

import conexion.Profesor;
import conexion.ProfesorDAO;
import java.awt.Font;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Leslie Vidal, Ornelas Munguía Axel Leonardo
 */
public class ModificarMaestro extends javax.swing.JFrame {

    private final Principal principal;
    private ArrayList<Profesor> profesor;
    private String numEmpleado;

    /**
     * Constructor de la clase 
     */
    public ModificarMaestro(Principal principal) {
        initComponents();
        this.principal = principal;
        setLocationRelativeTo(principal);
        profesor = new ArrayList();
        informacion();
        numDocente.setSelectedIndex(-1);
    }

    /* Método que trae la información de las materias para
      los comboBox correspondientes*/
    public final void informacion() {
        ProfesorDAO profeDAO = new ProfesorDAO();
        profeDAO.abrirSSH();
        profeDAO.abrirConexion();
        try {
            profesor = new ArrayList();
            profesor = profeDAO.readAll();
            for (int i = 0; i < profesor.size(); i++) {
                numDocente.addItem(profesor.get(i).getNumEmpleado() + "");
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(ModificarMaestro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            profeDAO.cerrarSSH();
        }
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
        aceptar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        numDocente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        asignatura = new javax.swing.JRadioButton();
        completo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modificar Docente");
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Modificar Docente");

        jLabel2.setText("Selecione el número de empleado  a modificar:");

        numDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numDocenteActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre:");

        asignatura.setText("Asignatura");

        completo.setText("Tiempo Completo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(aceptar)
                        .addGap(57, 57, 57)
                        .addComponent(regresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(71, 71, 71))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(completo)
                                .addGap(18, 18, 18)
                                .addComponent(asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(283, 283, 283))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numDocente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombre))))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completo)
                    .addComponent(asignatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(regresar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        cerrrarVentana();
    }//GEN-LAST:event_regresarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "¿Seguro que desea registrar esta información?", "Confirmación", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            ProfesorDAO profeDAO = new ProfesorDAO();
            profeDAO.abrirSSH();
            try {
                Profesor empleado = new Profesor(numEmpleado, nombre.getText(), completo.isSelected());
                profeDAO.update(empleado);
                JOptionPane.showMessageDialog(this, "Se ha modificado con exito", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLIntegrityConstraintViolationException ex) { //Si hay error se los indica
                JOptionPane.showMessageDialog(this, "Ya existe una Materia registrada con este número de Materia\n" + ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) { //Error en general
                JOptionPane.showMessageDialog(this, "ERROR \n" + ex.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
            } finally { //Cierra el ssh
                profeDAO.cerrarSSH();
            }
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        cerrrarVentana();
    }//GEN-LAST:event_formWindowClosing

    private void numDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numDocenteActionPerformed
        // Se llenan los jText con la informacion del numero de empleado
        String numeroDocente, num;
        if (numDocente.getSelectedIndex() != -1) {
            num = numDocente.getSelectedItem().toString();
            for (int i = 0; i < profesor.size(); i++) {
                numeroDocente = profesor.get(i).getNumEmpleado();
                if (num.equals(numeroDocente)) {
                    numEmpleado = profesor.get(i).getNumEmpleado();
                    nombre.setText(profesor.get(i).getNom());
                }
            }
        }
    }//GEN-LAST:event_numDocenteActionPerformed

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
         //Sirve para tener una proporción de las letras
        int proporcion = 40;
        //Crea la fuente
        Font fuente = new Font("Arial", 1, 1 * getWidth() / proporcion);
        aceptar.setFont(fuente);
        jLabel1.setFont(fuente);
        jLabel2.setFont(fuente);
    }//GEN-LAST:event_formComponentResized

    /**
     * Cierra la ventana y muestra la principal
     */
    private void cerrrarVentana() {
        principal.setVisible(true);
        dispose();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JRadioButton asignatura;
    private javax.swing.JRadioButton completo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> numDocente;
    private javax.swing.JButton regresar;
    // End of variables declaration//GEN-END:variables
}
