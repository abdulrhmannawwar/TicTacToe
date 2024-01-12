
package XO_2;
import java.awt.Color;
import javax.swing.*;  

/**
 *
 * @author Abdo
 */
public class XO_2 extends javax.swing.JFrame {
   int i = 2 , flag = 0;
   String t = "X";
   JFrame f;  
   int xscore = 0 , oscore = 0;
   
    
    public XO_2() {
       initComponents();
       this.setLocationRelativeTo(null);
       btn1.setBackground(Color.white);
       btn2.setBackground(Color.white);
       btn3.setBackground(Color.white);
       btn4.setBackground(Color.white);
       btn5.setBackground(Color.white);
       btn6.setBackground(Color.white);
       btn7.setBackground(Color.white);
       btn8.setBackground(Color.white);
       btn9.setBackground(Color.white);
       xfield.setText(xscore+"");
       ofield.setText(oscore+"");
       
    }
 private void showscore() {
     xfield.setText(xscore+"");
     ofield.setText(oscore+"");
 }
 private void reset() {
      btn1.setText("1");
                btn2.setText("2");
                btn3.setText("3");
                btn4.setText("4");
                btn5.setText("5");
                btn6.setText("6");
                btn7.setText("7");
                btn8.setText("8");
                btn9.setText("9");
                btn1.setBackground(Color.white);
                btn2.setBackground(Color.white);
                btn3.setBackground(Color.white);
                btn4.setBackground(Color.white);
                btn5.setBackground(Color.white);
                btn6.setBackground(Color.white);
                btn7.setBackground(Color.white);
                btn8.setBackground(Color.white);
                btn9.setBackground(Color.white);
                 btn1.setForeground(Color.white);
                 btn2.setForeground(Color.white);
                 btn3.setForeground(Color.white);
                 btn4.setForeground(Color.white);
                 btn5.setForeground(Color.white);
                 btn6.setForeground(Color.white);
                 btn7.setForeground(Color.white);
                 btn8.setForeground(Color.white);
                 btn9.setForeground(Color.white);
                 i = 2;
                 flag = 0;
                 
     
 }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        xfield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ofield = new javax.swing.JTextField();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("tic tac toe by Abdo Nawwar :3");
        setBackground(new java.awt.Color(51, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        btn1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.setToolTipText("");
        btn1.setBorder(null);
        btn1.setFocusPainted(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAction(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAction(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAction(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAction(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAction(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAction(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAction(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAction(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAction(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 255, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player X score");

        xfield.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        xfield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setBackground(new java.awt.Color(102, 255, 204));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player O score");

        ofield.setFont(new java.awt.Font("Segoe UI Black", 3, 36)); // NOI18N
        ofield.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        reset.setBackground(new java.awt.Color(204, 204, 204));
        reset.setFont(new java.awt.Font("Segoe UI Semibold", 3, 36)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(xfield, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap())
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(ofield, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37))))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(150, Short.MAX_VALUE)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(xfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(ofield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAction
        
        if(i%2==0) {
          t="X";
          i++;
      } else {
          t="O";
          i++;
      }
       
           switch(evt.getActionCommand()) {
               
               case "1" :
                   btn1.setText(t);
                      btn1.setForeground(Color.black);
                   break;
               case "2" :
                   btn2.setText(t);
                      btn2.setForeground(Color.black);
                   break;  
               case "3" :
                   btn3.setText(t);
                      btn3.setForeground(Color.black);
                   break;   
               case "4" :
                   btn4.setText(t);
                      btn4.setForeground(Color.black);
                   break;  
               case "5" :
                   btn5.setText(t);
                      btn5.setForeground(Color.black);
                   break;    
               case "6" :
                   btn6.setText(t);
                      btn6.setForeground(Color.black);
                   break;    
               case "7" :
                   btn7.setText(t);
                      btn7.setForeground(Color.black);
                   break;    
               case "8" :
                   btn8.setText(t);
                      btn8.setForeground(Color.black);
                   break;    
               case "9" :
                   btn9.setText(t);
                      btn9.setForeground(Color.black);
                   break;     
           }
           if(btn1.getText()==btn2.getText() && btn2.getText()==btn3.getText()) {
          btn1.setBackground(Color.blue);
          btn2.setBackground(Color.blue);
          btn3.setBackground(Color.blue);
           JOptionPane.showMessageDialog(f,"Player "+btn1.getText()+" Has won !");
         
          flag = 1;
          if(btn1.getText()=="X") {
              xscore++;
          } else {
              oscore++;
          }
          showscore();
       }
           else if(btn4.getText()==btn5.getText() && btn5.getText()==btn6.getText()) {
          btn4.setBackground(Color.blue);
          btn5.setBackground(Color.blue);
          btn6.setBackground(Color.blue);
           JOptionPane.showMessageDialog(f,"Player "+btn4.getText()+" Has won !");
          
          flag = 1;
       
          if(btn4.getText()=="X") {
              xscore++;
          } else {
              oscore++;
          }
          showscore();
       }
          else if(btn7.getText()==btn8.getText() && btn8.getText()==btn9.getText()) {
          btn7.setBackground(Color.blue);
          btn8.setBackground(Color.blue);
          btn9.setBackground(Color.blue);
           JOptionPane.showMessageDialog(f,"Player "+btn1.getText()+" Has won !");
          
           flag = 1;
      
          if(btn7.getText()=="X") {
              xscore++;
          } else {
              oscore++;
          }
          showscore();
       }
          else if(btn1.getText()==btn5.getText() && btn5.getText()==btn9.getText()) {
          btn1.setBackground(Color.blue);
          btn5.setBackground(Color.blue);
          btn9.setBackground(Color.blue);
           JOptionPane.showMessageDialog(f,"Player "+btn1.getText()+" Has won !");
          
           flag = 1;
           
          if(btn1.getText()=="X") {
              xscore++;
          } else {
              oscore++;
          }
          showscore();
       }
          else if(btn3.getText()==btn5.getText() && btn5.getText()==btn7.getText()) {
          btn3.setBackground(Color.blue);
          btn5.setBackground(Color.blue);
          btn7.setBackground(Color.blue);
           JOptionPane.showMessageDialog(f,"Player "+btn3.getText()+" Has won !");
         
           flag = 1;
          
          if(btn3.getText()=="X") {
              xscore++;
          } else {
              oscore++;
          }
          showscore();
       }
          else if(btn1.getText()==btn4.getText() && btn4.getText()==btn7.getText()) {
          btn1.setBackground(Color.blue);
          btn4.setBackground(Color.blue);
          btn7.setBackground(Color.blue);
           JOptionPane.showMessageDialog(f,"Player "+btn1.getText()+" Has won !");
          
           flag = 1;
         
          if(btn1.getText()=="X") {
              xscore++;
          } else {
              oscore++;
          }
          showscore();
       }
              else if(btn2.getText()==btn5.getText() && btn5.getText()==btn8.getText()) {
          btn2.setBackground(Color.blue);
          btn5.setBackground(Color.blue);
          btn8.setBackground(Color.blue);
          JOptionPane.showMessageDialog(f,"Player "+btn2.getText()+" Has won !");
          
           flag = 1;
          
          if(btn2.getText()=="X") {
              xscore++;
          } else {
              oscore++;
          }
          showscore();
       }
              else if(btn3.getText()==btn6.getText() && btn6.getText()==btn9.getText()) {
           btn3.setBackground(Color.blue);
           btn6.setBackground(Color.blue);
           btn9.setBackground(Color.blue);
           JOptionPane.showMessageDialog(f,"Player "+btn3.getText()+" Has won !");
        
          
           flag = 1;
          
          if(btn3.getText()=="X") {
              xscore++;
          } else {
              oscore++;
          }
          showscore();
       }
                 else if(btn1.getText()!="1" && btn2.getText()!="2" && btn3.getText()!="3" && btn4.getText()!="4" && btn5.getText()!="5" && btn6.getText()!="6" && btn7.getText()!="7" && btn8.getText()!="8" && btn9.getText()!="9") {
                        if(flag==0){
                            JOptionPane.showMessageDialog(f,"Tie !");
                        }

         }  
    }//GEN-LAST:event_btnAction

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        switch(evt.getActionCommand()) {
            case "Reset" :
                reset();
                break;
        }
    }//GEN-LAST:event_resetActionPerformed

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
            java.util.logging.Logger.getLogger(XO_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XO_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XO_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XO_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XO_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField ofield;
    private javax.swing.JButton reset;
    private javax.swing.JTextField xfield;
    // End of variables declaration//GEN-END:variables
}
