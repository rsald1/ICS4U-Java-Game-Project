/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author turtl
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class GameWindowOne extends javax.swing.JFrame {

    /**
     * Creates new form GameWindowOne
     */
    
    String answer;
    int p ;
    
    public GameWindowOne() {
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
        questionOne = new javax.swing.JLabel();
        answerTwo = new javax.swing.JLabel();
        answerOne = new javax.swing.JLabel();
        answerFour = new javax.swing.JLabel();
        answerFive = new javax.swing.JLabel();
        answerThree = new javax.swing.JLabel();
        answerInput = new javax.swing.JTextField();
        enterButton = new javax.swing.JButton();
        labelScore = new javax.swing.JLabel();
        scorenumberlabel = new javax.swing.JLabel();
        quitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(245, 225, 253));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        questionOne.setFont(new java.awt.Font("Verdana", 0, 26)); // NOI18N
        questionOne.setText("Q1 : Things you would find in the bathroom");

        answerTwo.setBackground(new java.awt.Color(1, 1, 1));
        answerTwo.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        answerTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerTwo.setText("2");
        answerTwo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        answerOne.setBackground(new java.awt.Color(1, 1, 1));
        answerOne.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        answerOne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerOne.setText("1");
        answerOne.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        answerFour.setBackground(new java.awt.Color(1, 1, 1));
        answerFour.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        answerFour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerFour.setText("4");
        answerFour.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        answerFive.setBackground(new java.awt.Color(1, 1, 1));
        answerFive.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        answerFive.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerFive.setText("5");
        answerFive.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        answerThree.setBackground(new java.awt.Color(1, 1, 1));
        answerThree.setFont(new java.awt.Font("Verdana", 0, 48)); // NOI18N
        answerThree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answerThree.setText("3");
        answerThree.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        answerInput.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        answerInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerInputActionPerformed(evt);
            }
        });

        enterButton.setText("Enter");
        enterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterButtonActionPerformed(evt);
            }
        });

        labelScore.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelScore.setText("Score:");

        scorenumberlabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        scorenumberlabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(questionOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(answerTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(answerOne, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(answerThree, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(answerFour, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(answerFive, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(answerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(76, 76, 76))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(labelScore)
                .addGap(4, 4, 4)
                .addComponent(scorenumberlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(questionOne, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(answerOne)
                        .addGap(27, 27, 27)
                        .addComponent(answerTwo)
                        .addGap(27, 27, 27)
                        .addComponent(answerThree))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(answerFour)
                        .addGap(28, 28, 28)
                        .addComponent(answerFive)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answerInput, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scorenumberlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        quitButton.setText("Quit");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(quitButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed

    private void answerInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_answerInputActionPerformed

    private void enterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterButtonActionPerformed
        //String answer;
        answer = answerInput.getText();
        boolean c;
        c = searching(); 
        System.out.println(c);
        if (c = true){
            System.out.println(p);
        }
        
    }//GEN-LAST:event_enterButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GameWindowOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindowOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindowOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindowOne.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindowOne().setVisible(true);
            }
        });
    }
    
    public boolean searching(){
        /*
        Boolean a;
        File QA = new File("Q1Ainfo.txt");
        try{
                Scanner reading = new Scanner(QA);
                String line = reading.nextLine();
                a = line.equalsIgnoreCase(answer);
                p++;
                System.out.println();
                if (a = true){ 
                   // System.out.println(i);
                    //p = i;
                    return true;
                }

            while (a != true);
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        return false;
        */
        
       /*
       p = 0;
       
       Boolean a;
       File QA = new File("Q1Ainfo.txt"); 
       Scanner reading = new Scanner(QA);
       do {
           try{
               
               String line = reading.nextLine();
               a = line.equalsIgnoreCase(answer);
               p++;
               System.out.println(p);
               if (a = true){
                   String QaA = "Q1Ainfo.txt";
                   int position = (QaA.indexOf(answer));
                   //System.out.println(position);
                   return true;
               }
           }
           catch (FileNotFoundException e){
               System.out.println("File not Found");
           }
           return false;
       }
       while (a != true);
       */
       
       boolean a;
       a = false;
       File QA = new File("Q1Ainfo.txt");
       p=0;
       try{
           Scanner reading = new Scanner(QA);
           for (int i = 0;i<=4;i++){
               String line = reading.nextLine();
               System.out.println(line);
               p++;
               System.out.println(p);
               System.out.println(answer);
               a = line.equalsIgnoreCase(answer);
               System.out.println(a);
               System.out.println("");
           }
           return true;
       }
       catch (FileNotFoundException e){
           System.out.println("File not found");
       }
       return false;
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerFive;
    private javax.swing.JLabel answerFour;
    private javax.swing.JTextField answerInput;
    private javax.swing.JLabel answerOne;
    private javax.swing.JLabel answerThree;
    private javax.swing.JLabel answerTwo;
    private javax.swing.JButton enterButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelScore;
    private javax.swing.JLabel questionOne;
    private javax.swing.JButton quitButton;
    private javax.swing.JLabel scorenumberlabel;
    // End of variables declaration//GEN-END:variables
}
