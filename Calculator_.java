/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Calculation;

/**
 *
 * @author Rushikesh Salame
 */
public class Calculator_ extends javax.swing.JFrame {

    double firstnum;
    double secondnum;
    double result;
    String operation;
    /**
     * Creates new form Calculator_
     */
    public Calculator_() {
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

        jtxtDisplay = new javax.swing.JTextField();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn10 = new javax.swing.JButton();
        jbtn11 = new javax.swing.JButton();
        jbtn12 = new javax.swing.JButton();
        jbtn13 = new javax.swing.JButton();
        jbtn14 = new javax.swing.JButton();
        jbtn15 = new javax.swing.JButton();
        jbtn16 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        jtxtDisplay.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jtxtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jbtn1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn1.setText("1");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn2.setText("2");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn3.setText("3");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtn4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn4.setText("4");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn5.setText("5");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn6.setText("6");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn7.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtn8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn8.setText("8");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn9.setText("-");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtn10.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn10.setText("+");
        jbtn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn10ActionPerformed(evt);
            }
        });

        jbtn11.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn11.setText("0");
        jbtn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn11ActionPerformed(evt);
            }
        });

        jbtn12.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn12.setText("9");
        jbtn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn12ActionPerformed(evt);
            }
        });

        jbtn13.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn13.setText("/");
        jbtn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn13ActionPerformed(evt);
            }
        });

        jbtn14.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn14.setText("*");
        jbtn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn14ActionPerformed(evt);
            }
        });

        jbtn15.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn15.setText("+/-");
        jbtn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn15ActionPerformed(evt);
            }
        });

        jbtn16.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jbtn16.setText(".");
        jbtn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn16ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setText("C");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setText("=");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jtxtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn12ActionPerformed
       String Enternumber = jtxtDisplay.getText()+jbtn12.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn12ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
       String Enternumber = jtxtDisplay.getText()+jbtn3.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtxtDisplay.getText()+jbtn1.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String Enternumber = jtxtDisplay.getText()+jbtn2.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
       String Enternumber = jtxtDisplay.getText()+jbtn4.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String Enternumber = jtxtDisplay.getText()+jbtn5.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
      String Enternumber = jtxtDisplay.getText()+jbtn6.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
      String Enternumber = jtxtDisplay.getText()+jbtn7.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
       String Enternumber = jtxtDisplay.getText()+jbtn8.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn10ActionPerformed
        // TODO add your handling code here:
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="+";
    }//GEN-LAST:event_jbtn10ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        // TODO add your handling code here:
        firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="-";
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn13ActionPerformed
      firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="/";
    }//GEN-LAST:event_jbtn13ActionPerformed

    private void jbtn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn14ActionPerformed
       firstnum = Double.parseDouble(jtxtDisplay.getText());
        jtxtDisplay.setText("");
        operation="*";
    }//GEN-LAST:event_jbtn14ActionPerformed

    private void jbtn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn16ActionPerformed
         String Enternumber = jtxtDisplay.getText()+jbtn16.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn16ActionPerformed

    private void jbtn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn15ActionPerformed
        // TODO add your handling code here:
        double ops = Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
        ops=ops * (-1);
        jtxtDisplay.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtn15ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String ans;
        secondnum = Double.parseDouble(jtxtDisplay.getText());
        if(operation == "+"){
            result = firstnum + secondnum;
            ans = String.format("%.0f", result);
            jtxtDisplay.setText(ans);
        }
        else if(operation == "-"){
            result = firstnum - secondnum;
            ans = String.format("%.0f", result);
            jtxtDisplay.setText(ans);
        }
        else if(operation == "*"){
            result = firstnum * secondnum;
            ans = String.format("%.0f", result);
            jtxtDisplay.setText(ans);
        }
        else if(operation == "/"){
            result = firstnum / secondnum;
            ans = String.format("%.0f", result);
            jtxtDisplay.setText(ans);
        }
        else if(operation == "%"){
            result = firstnum % secondnum;
            ans = String.format("%.0f", result);
            jtxtDisplay.setText(ans);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn11ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtxtDisplay.getText()+jbtn11.getText();
        jtxtDisplay.setText(Enternumber);
    }//GEN-LAST:event_jbtn11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jtxtDisplay.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator_.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator_().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn10;
    private javax.swing.JButton jbtn11;
    private javax.swing.JButton jbtn12;
    private javax.swing.JButton jbtn13;
    private javax.swing.JButton jbtn14;
    private javax.swing.JButton jbtn15;
    private javax.swing.JButton jbtn16;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JTextField jtxtDisplay;
    // End of variables declaration//GEN-END:variables
}
