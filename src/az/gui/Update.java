/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.gui;

import az.model.Student;
import az.sql.StudentSql;

/**
 *
 * @author Kamran
 */
public class Update extends javax.swing.JDialog {

    private StudentSql studentSql;
    private int selectedId;

    /**
     * Creates new form Insert
     */
    public Update(java.awt.Frame parent, boolean modal) {

    }

    public Update(java.awt.Frame parent, boolean modal, int selectedId) {
        super(parent, modal);
        initComponents();
        this.selectedId = selectedId;
        studentSql = new StudentSql();
        setLocationRelativeTo(this);
        setResizable(false);

        Student student = studentSql.findById(selectedId);

        txtName.setText(student.getName());
        txtSurname.setText(student.getSurname());
        txtAge.setText(String.valueOf(student.getAge()));
        txtPoint.setText(String.valueOf(student.getPoint()));

        String gender = student.getGender();

        if (gender != null && gender.equals("Male")) {
            rbMale.setSelected(true);
        } else if (gender != null && gender.equals("Female")) {
            rbFemale.setSelected(true);
        }

        String city = student.getCity();
        cbCity.setSelectedItem(city);

        String favorite = student.getFavorite();

        if (favorite != null && !favorite.isEmpty()) {
            favorite = favorite.trim(); // sagda solda bosluqlari silir

            String favoriteArray[] = favorite.split(" ");

            for (String dbFavorite : favoriteArray) {
                checkFavorite(dbFavorite);
            }

        }
    }

    private void checkFavorite(String favorite) {
        switch (favorite) {
            case "Sport":
                cbxSport.setSelected(true);
                break;
            case "Internet":
                cbxInternet.setSelected(true);
                break;
            case "Music":
                cbxMusic.setSelected(true);
                break;
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

        jLabel4 = new javax.swing.JLabel();
        txtName2 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtPoint = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbCity = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rbMale = new javax.swing.JRadioButton();
        rbFemale = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cbxSport = new javax.swing.JCheckBox();
        cbxInternet = new javax.swing.JCheckBox();
        cbxMusic = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        jLabel4.setText("Name :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update Student Panel");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);

        jLabel2.setText("Name :");

        jLabel3.setText("Surname :");

        jLabel5.setText("Age :");

        lbl.setText("Point :");

        jLabel7.setText("City :");

        cbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baku", "Sumqayit", "Ganca", "Naxcivan", "Mingecevir", "Xirdalan", "Sheki" }));

        jLabel6.setText("Gender :");

        buttonGroup1.add(rbMale);
        rbMale.setText("Male");
        rbMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFemale);
        rbFemale.setText("Female");

        jLabel8.setText("Favorites :");

        cbxSport.setText("Sport");

        cbxInternet.setText("Internet");

        cbxMusic.setText("Music");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxSport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxInternet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMusic))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(rbMale)
                                .addGap(33, 33, 33)
                                .addComponent(rbFemale))
                            .addComponent(cbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(70, 70, 70)
                                .addComponent(btnCancel)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbCity, txtAge, txtName, txtPoint, txtSurname});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl)
                            .addComponent(txtPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbMale)
                            .addComponent(rbFemale))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSport)
                    .addComponent(cbxInternet)
                    .addComponent(cbxMusic)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnCancel))
                .addGap(25, 25, 25))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbCity, txtAge, txtName, txtPoint, txtSurname});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMaleActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Student student = new Student();
        student.setId(selectedId);
        student.setName(txtName.getText());
        student.setSurname(txtSurname.getText());
        student.setAge(Integer.parseInt(txtAge.getText()));
        student.setPoint(Double.parseDouble(txtPoint.getText()));

        String city = cbCity.getSelectedItem().toString();
        student.setCity(city);

        if (rbMale.isSelected()) {
            student.setGender("Male");
        } else {
            student.setGender("Female");
        }

        String favorite = "";
        if (cbxInternet.isSelected()) {
            favorite = " Internet ";
        }
        if (cbxMusic.isSelected()) {
            favorite += " Music ";
        }
        if (cbxSport.isSelected()) {
            favorite += " Sport ";
        }

        student.setFavorite(favorite);
        studentSql.update(student);

        dispose();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Update dialog = new Update(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCity;
    private javax.swing.JCheckBox cbxInternet;
    private javax.swing.JCheckBox cbxMusic;
    private javax.swing.JCheckBox cbxSport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl;
    private javax.swing.JRadioButton rbFemale;
    private javax.swing.JRadioButton rbMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtPoint;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
