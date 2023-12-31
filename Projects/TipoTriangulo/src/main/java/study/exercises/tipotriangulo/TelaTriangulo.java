/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package study.exercises.tipotriangulo;


/**
 *
 * @author Francisley Salla
 */
public class TelaTriangulo extends javax.swing.JFrame {
    int side1;
    int side2;
    int side3;
    /**
     * Creates new form TelaTriangulo
     */
    public TelaTriangulo() {
        initComponents();
        panOut.setVisible(false);
        side1 = sldS1.getValue();
        side2 = sldS2.getValue();
        side3 = sldS3.getValue();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sldS1 = new javax.swing.JSlider();
        sldS3 = new javax.swing.JSlider();
        sldS2 = new javax.swing.JSlider();
        panOut = new javax.swing.JPanel();
        lblOut = new javax.swing.JLabel();
        lblOutS1 = new javax.swing.JLabel();
        lblOutS2 = new javax.swing.JLabel();
        lblOutS3 = new javax.swing.JLabel();
        btnVer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Verificador de triângulos");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Francisco\\Documents\\NetBeansProjects\\learning-java\\Projects\\TipoTriangulo\\src\\main\\resources\\imagens\\levels.png")); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Primeiro lado:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Segundo lado:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Terceiro lado:");

        sldS1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sldS1.setMajorTickSpacing(1);
        sldS1.setMaximum(20);
        sldS1.setSnapToTicks(true);
        sldS1.setValue(5);
        sldS1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldS1StateChanged(evt);
            }
        });

        sldS3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sldS3.setMajorTickSpacing(1);
        sldS3.setMaximum(20);
        sldS3.setSnapToTicks(true);
        sldS3.setValue(5);
        sldS3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldS3StateChanged(evt);
            }
        });

        sldS2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sldS2.setMajorTickSpacing(1);
        sldS2.setMaximum(20);
        sldS2.setSnapToTicks(true);
        sldS2.setValue(5);
        sldS2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sldS2StateChanged(evt);
            }
        });

        lblOut.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblOut.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOut.setText("Tipo de triângulo");

        javax.swing.GroupLayout panOutLayout = new javax.swing.GroupLayout(panOut);
        panOut.setLayout(panOutLayout);
        panOutLayout.setHorizontalGroup(
            panOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOut, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
        panOutLayout.setVerticalGroup(
            panOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panOutLayout.createSequentialGroup()
                .addComponent(lblOut)
                .addGap(0, 0, 0))
        );

        lblOutS1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblOutS1.setText("5");

        lblOutS2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblOutS2.setText("5");

        lblOutS3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblOutS3.setText("5");

        btnVer.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVer.setText("Verificar triângulo");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(sldS2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(sldS3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addComponent(sldS1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblOutS2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblOutS3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(lblOutS1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btnVer)
                                .addGap(87, 87, 87)))
                        .addComponent(jLabel1)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOutS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOutS2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblOutS3))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sldS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sldS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sldS3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(18, 18, 18)
                        .addComponent(btnVer)))
                .addGap(18, 18, 18)
                .addComponent(panOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sldS1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldS1StateChanged
        // TODO add your handling code here:
        side1 = sldS1.getValue();
        lblOutS1.setText(Integer.toString(side1));
    }//GEN-LAST:event_sldS1StateChanged

    private void sldS2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldS2StateChanged
        // TODO add your handling code here:
        side2 = sldS2.getValue();
        lblOutS2.setText(Integer.toString(side2));
    }//GEN-LAST:event_sldS2StateChanged

    private void sldS3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sldS3StateChanged
        // TODO add your handling code here:
        side3 = sldS3.getValue();
        lblOutS3.setText(Integer.toString(side3));
    }//GEN-LAST:event_sldS3StateChanged

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
        // TODO add your handling code here:
        /*
        
        Equilátero = Todos os lado iguais
        Isósceles = Dois lados iguais
        Escaleno = Todos os lados diferente
        */
        // Verificar se um triângulo pode ser formado
        boolean triangle = (side1 == 0 
                || side2 == 0 
                || side3 == 0 
                || side1 > side2 + side3 
                || side2 > side3 + side1 
                || side3 > side1 + side2)
                ?false:true;
        if (triangle == true){
            if (side1 != side2 
                && side2 != side3 
                && side3 != side1){
                //Caso de todos os lados serem diferentes.
                lblOut.setText("ESCALENO!");
            }else if(side1 == side2 && side2 == side3){
                //Caso de todos os lados serem iguais
                lblOut.setText("EQUILÁTERO!");
            }else if(side1 == side2 ^ side2 == side3 ^ side3 == side1){ 
        // This last if is not necessary, but I created it to develop my logic skills.
                //Caso de ter dois lados iguais somente
                lblOut.setText("ISÓSCELES!");
            }
            
        }else{
            lblOut.setText("Não é um triângulo!");
        }
        
        //Showing the results
        panOut.setVisible(true);
    }//GEN-LAST:event_btnVerActionPerformed

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
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTriangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTriangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblOut;
    private javax.swing.JLabel lblOutS1;
    private javax.swing.JLabel lblOutS2;
    private javax.swing.JLabel lblOutS3;
    private javax.swing.JPanel panOut;
    private javax.swing.JSlider sldS1;
    private javax.swing.JSlider sldS2;
    private javax.swing.JSlider sldS3;
    // End of variables declaration//GEN-END:variables
}
