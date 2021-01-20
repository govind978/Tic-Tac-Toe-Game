/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe_game;

import java.awt.Color;

/**
 *
 * @author GOVIND SINGLA
 */
public class tic_tac_toe extends javax.swing.JFrame {
static public int text = 0,block=0;
        static public boolean b_1=false,  b_2=false,  b_3=false,  b_4=false,  b_5=false,  b_6=false,  b_7=false , b_8=false,  b_9=false;
    /**
     * Creates new form rough
     */
    public tic_tac_toe() {
       
        initComponents();
    }
    public void check_win()
    {
                        String a1=b1.getText();
                        String a2=b2.getText();
                        String a3=b3.getText();
                        String a4=b4.getText();
                        String a5=b5.getText();
                        String a6=b6.getText();
                        String a7=b7.getText();
                        String a8=b8.getText();
                        String a9=b9.getText();
            
                        if((a1=="X" && a2=="X" && a3=="X") || (a1=="O" && a2=="O" && a3=="O"))
                        {
                            if(text == 0)
                            {
                                    game_win w=new game_win(1);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                            else if(text == 1)
                            {
                                    game_win w=new game_win(0);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                        }
                        else if((a4=="X" && a5=="X" && a6=="X") || (a4=="O" && a5=="O" && a6=="O"))
                        {
                             if(text == 0)
                            {
                                    game_win w=new game_win(1);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                            else if(text == 1)
                            {
                                    game_win w=new game_win(0);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                        }
                        else if((a7=="X" && a8=="X" && a9=="X") || (a7=="O" && a8=="O" && a9=="O"))
                        {
                            if(text == 0)
                            {
                                    game_win w=new game_win(1);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                            else if(text == 1)
                            {
                                    game_win w=new game_win(0);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                        }
                        else if((a1=="X" && a4=="X" && a7=="X") || (a1=="O" && a4=="O" && a7=="O"))
                        {
                            if(text == 0)
                            {
                               
                                    game_win w=new game_win(1);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                            else if(text == 1)
                            {
                                
                                    game_win w=new game_win(0);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                            
                            
                        }
                        else if((a2=="X" && a5=="X" && a8=="X") || (a2=="O" && a5=="O" && a8=="O"))
                        {
                             if(text == 0)
                            {
                                    game_win w=new game_win(1);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                            else if(text == 1)
                            {
                                    game_win w=new game_win(0);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                        }
                        else if((a3=="X" && a6=="X" && a9=="X") || (a3=="O" && a6=="O" && a9=="O"))
                        {
                             if(text == 0)
                            {
                                    game_win w=new game_win(1);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                            else if(text == 1)
                            {
                                    game_win w=new game_win(0);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                        }
                        else if((a1=="X" && a5=="X" && a9=="X") || (a1=="O" && a5=="O" && a9=="O"))
                        {
                            if(text == 0)
                            {
                                    game_win w=new game_win(1);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                            else if(text == 1)
                            {
                                    game_win w=new game_win(0);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                        }
                        else if((a3=="X" && a5=="X" && a7=="X") || (a3=="O" && a5=="O" && a7=="O"))
                        {
                           if(text == 0)
                            {
                                    game_win w=new game_win(1);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                            else if(text == 1)
                            {
                                    game_win w=new game_win(0);
                                    try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                            w.setVisible(true);
                            }
                        }
                        else if(block == 9)
                        {
                                game_over go=new game_over();
                                try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                                go.setVisible(true);
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
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        player_name = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        player = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(574, 626));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 250, 154));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        b5.setAlignmentX(100.0F);
        b5.setAutoscrolls(true);
        b5.setFocusable(false);
        b5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b5MouseClicked(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        b6.setAlignmentX(100.0F);
        b6.setAutoscrolls(true);
        b6.setFocusable(false);
        b6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b6MouseClicked(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        b7.setAlignmentX(100.0F);
        b7.setAutoscrolls(true);
        b7.setFocusable(false);
        b7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b7MouseClicked(evt);
            }
        });
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        b8.setAlignmentX(100.0F);
        b8.setAutoscrolls(true);
        b8.setFocusable(false);
        b8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b8MouseClicked(evt);
            }
        });
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        b9.setAlignmentX(100.0F);
        b9.setAutoscrolls(true);
        b9.setFocusable(false);
        b9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b9MouseClicked(evt);
            }
        });

        player_name.setFont(new java.awt.Font("Bodoni MT", 1, 35)); // NOI18N
        player_name.setForeground(new java.awt.Color(0, 0, 0));

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        b1.setAlignmentX(100.0F);
        b1.setAutoscrolls(true);
        b1.setFocusable(false);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        b2.setAlignmentX(100.0F);
        b2.setAutoscrolls(true);
        b2.setFocusable(false);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        b3.setAlignmentX(100.0F);
        b3.setAutoscrolls(true);
        b3.setFocusable(false);
        b3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b3MouseClicked(evt);
            }
        });
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Algerian", 1, 60)); // NOI18N
        b4.setAlignmentX(100.0F);
        b4.setAutoscrolls(true);
        b4.setFocusable(false);
        b4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b4MouseClicked(evt);
            }
        });

        player.setFont(new java.awt.Font("Bodoni MT", 1, 35)); // NOI18N
        player.setForeground(new java.awt.Color(0, 0, 0));
        player.setText("Player  O's  turn");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Exit");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(player_name, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(player_name)
                .addGap(0, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(player)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        
        
        if(text == 0 && b_1==false)
        {
            tic_tac_toe.b1.setText("O");
            tic_tac_toe.b1.setForeground(Color.RED);
            player.setText("Player X's turn");
            text = 1;
            b_1 = true;
             block++;
        check_win();
        }
        else if(text == 1 && b_1==false)
        {
            tic_tac_toe.b1.setText("X");
            tic_tac_toe.b1.setForeground(Color.BLUE);
            player.setText("Player O's turn");
            text = 0;
            b_1 = true;
          block++;
        check_win();
        }
        
       
    }//GEN-LAST:event_b1MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
       if(text == 0 && b_2==false)
        {
            tic_tac_toe.b2.setText("O");
            tic_tac_toe.b2.setForeground(Color.RED);
            player.setText("Player X's turn");
            text = 1;
            b_2 = true;
             block++;
        check_win();
        }
        else if(text == 1 && b_2==false)
        {
            tic_tac_toe.b2.setText("X");
            tic_tac_toe.b2.setForeground(Color.BLUE);
            player.setText("Player O's turn");
            text = 0;
            b_2 = true;
             block++;
      check_win();
        }
    }//GEN-LAST:event_b2MouseClicked

    private void b3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b3MouseClicked
       if(text == 0 && b_3==false)
        {
            tic_tac_toe.b3.setText("O");
            tic_tac_toe.b3.setForeground(Color.RED);
            player.setText("Player X's turn");
            text = 1;
            b_3 = true;
             block++;
        check_win();
        }
        else if(text == 1 && b_3==false)
        {
            tic_tac_toe.b3.setText("X");
            tic_tac_toe.b3.setForeground(Color.BLUE);
            player.setText("Player O's turn");
            text = 0;
            b_3 = true;
             block++;
      check_win();
        }
    }//GEN-LAST:event_b3MouseClicked

    private void b4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b4MouseClicked
      if(text == 0 && b_4==false)
        {
           tic_tac_toe.b4.setText("O");
           tic_tac_toe.b4.setForeground(Color.RED);
           player.setText("Player X's turn");
            text = 1;
            b_4 = true;
            block++;
         check_win();
        }
        else if(text == 1 && b_4==false)
        {
            tic_tac_toe.b4.setText("X");
            tic_tac_toe.b4.setForeground(Color.BLUE);
            player.setText("Player O's turn");
            text = 0;
            b_4 = true;
            block++;
         check_win();
        }
       
    }//GEN-LAST:event_b4MouseClicked

    private void b5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b5MouseClicked
        if(text == 0 && b_5==false)
        {
            tic_tac_toe.b5.setText("O");
            tic_tac_toe.b5.setForeground(Color.RED);
            player.setText("Player X's turn");
            text = 1;
            b_5 = true;
            block++;
      check_win();
        }
        else if(text == 1 && b_5==false)
        {
            tic_tac_toe.b5.setText("X");
            tic_tac_toe.b5.setForeground(Color.BLUE);
            player.setText("Player O's turn");
            text = 0;
            b_5 = true;
            block++;
      check_win();
        }
         
    }//GEN-LAST:event_b5MouseClicked

    private void b6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b6MouseClicked
       if(text == 0 && b_6==false)
        {
            tic_tac_toe.b6.setText("O");
            tic_tac_toe.b6.setForeground(Color.RED);
            player.setText("Player X's turn");
            text = 1;
            b_6 = true;
             block++;
      check_win();
        }
        else if(text == 1 && b_6==false)
        {
            tic_tac_toe.b6.setText("X");
            tic_tac_toe.b6.setForeground(Color.BLUE);
            player.setText("Player O's turn");
            text = 0;
            b_6 = true;
             block++;
      check_win();
        }
       
    }//GEN-LAST:event_b6MouseClicked

    private void b7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b7MouseClicked
       if(text == 0 && b_7==false)
        {
            tic_tac_toe.b7.setText("O");
            tic_tac_toe.b7.setForeground(Color.RED);
            player.setText("Player X's turn");
            text = 1;
            b_7 = true;
             block++;
            check_win();
        }
        else if(text == 1 && b_7==false)
        {
            tic_tac_toe.b7.setText("X");
            tic_tac_toe.b7.setForeground(Color.BLUE);
            player.setText("Player O's turn");
            text = 0;
            b_7 = true;
             block++;
            check_win();
        }
       
    }//GEN-LAST:event_b7MouseClicked

    private void b8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b8MouseClicked
      if(text == 0 && b_8==false)
        {
            tic_tac_toe.b8.setText("O");
            tic_tac_toe.b8.setForeground(Color.RED);
            player.setText("Player X's turn");
            text = 1;
            b_8 = true;
            block++;
         check_win();
        }
        else if(text == 1 && b_8==false)
        {
            tic_tac_toe.b8.setText("X");
            tic_tac_toe.b8.setForeground(Color.BLUE);
            player.setText("Player O's turn");
            text = 0;
            b_8 = true;
            block++;
         check_win();
        }
       
    }//GEN-LAST:event_b8MouseClicked

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b3ActionPerformed

    private void b9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b9MouseClicked
       if(text == 0 && b_9==false)
        {
            tic_tac_toe.b9.setText("O");
            tic_tac_toe.b9.setForeground(Color.RED);
            player.setText("Player X's turn");
            text = 1;
            b_9 = true;
            block++;
          check_win();
        }
        else if(text == 1 && b_9==false)
        {
            tic_tac_toe.b9.setText("X");
            tic_tac_toe.b9.setForeground(Color.BLUE);
            player.setText("Player O's turn");
            text = 0;
            b_9 = true;
            block++;
          check_win();
        }
        
    }//GEN-LAST:event_b9MouseClicked

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b8ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
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
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic_tac_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic_tac_toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton b1;
    public static javax.swing.JButton b2;
    public static javax.swing.JButton b3;
    public static javax.swing.JButton b4;
    public static javax.swing.JButton b5;
    public static javax.swing.JButton b6;
    public static javax.swing.JButton b7;
    public static javax.swing.JButton b8;
    public static javax.swing.JButton b9;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel player;
    private javax.swing.JLabel player_name;
    // End of variables declaration//GEN-END:variables

    static class b1 {

        public b1() {
        }
    }
}
