/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package songmaker;

/**
 *
 * @author Max
 */
public class Keyboard extends javax.swing.JFrame {
    MainWindow win;
    /**
     * Creates new form Keyboard
     */
    public Keyboard(MainWindow ref) {
        win = ref;
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

        d3 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        e3 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        g3 = new javax.swing.JButton();
        c4 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        e4 = new javax.swing.JButton();
        d4 = new javax.swing.JButton();
        g4 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        a4 = new javax.swing.JButton();
        d5 = new javax.swing.JButton();
        c5 = new javax.swing.JButton();
        e5 = new javax.swing.JButton();
        f5 = new javax.swing.JButton();
        g5 = new javax.swing.JButton();
        dflat3 = new javax.swing.JButton();
        eflat3 = new javax.swing.JButton();
        gflat3 = new javax.swing.JButton();
        aflat3 = new javax.swing.JButton();
        dflat4 = new javax.swing.JButton();
        bflat3 = new javax.swing.JButton();
        gflat4 = new javax.swing.JButton();
        eflat4 = new javax.swing.JButton();
        aflat4 = new javax.swing.JButton();
        bflat4 = new javax.swing.JButton();
        dflat5 = new javax.swing.JButton();
        eflat5 = new javax.swing.JButton();
        gflat5 = new javax.swing.JButton();
        beginChord = new javax.swing.JButton();
        endChord = new javax.swing.JButton();

        setTitle("Keyboard");

        d3.setText("D3");
        d3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });

        c3.setText("C3");
        c3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        c3.setName(""); // NOI18N
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        f3.setText("F3");
        f3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        e3.setText("E3");
        e3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });

        a3.setText("A3");
        a3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        g3.setText("G3");
        g3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        g3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g3ActionPerformed(evt);
            }
        });

        c4.setText("C4");
        c4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });

        b3.setText("B3");
        b3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        e4.setText("E4");
        e4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        e4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e4ActionPerformed(evt);
            }
        });

        d4.setText("D4");
        d4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        d4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d4ActionPerformed(evt);
            }
        });

        g4.setText("G4");
        g4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        g4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g4ActionPerformed(evt);
            }
        });

        f4.setText("F4");
        f4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });

        b4.setText("B4");
        b4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        a4.setText("A4");
        a4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });

        d5.setText("D5");
        d5.setMargin(new java.awt.Insets(2, 4, 2, 4));
        d5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d5ActionPerformed(evt);
            }
        });

        c5.setText("C5");
        c5.setMargin(new java.awt.Insets(2, 4, 2, 4));
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });

        e5.setText("E5");
        e5.setMargin(new java.awt.Insets(2, 4, 2, 4));
        e5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e5ActionPerformed(evt);
            }
        });

        f5.setText("F5");
        f5.setMargin(new java.awt.Insets(2, 4, 2, 4));
        f5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f5ActionPerformed(evt);
            }
        });

        g5.setText("G5");
        g5.setMargin(new java.awt.Insets(2, 4, 2, 4));
        g5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                g5ActionPerformed(evt);
            }
        });

        dflat3.setText("d3");
        dflat3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        dflat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dflat3ActionPerformed(evt);
            }
        });

        eflat3.setText("e3");
        eflat3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        eflat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eflat3ActionPerformed(evt);
            }
        });

        gflat3.setText("g3");
        gflat3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        gflat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gflat3ActionPerformed(evt);
            }
        });

        aflat3.setText("a3");
        aflat3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        aflat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aflat3ActionPerformed(evt);
            }
        });

        dflat4.setText("d4");
        dflat4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        dflat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dflat4ActionPerformed(evt);
            }
        });

        bflat3.setText("b3");
        bflat3.setMargin(new java.awt.Insets(2, 4, 2, 4));
        bflat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bflat3ActionPerformed(evt);
            }
        });

        gflat4.setText("g4");
        gflat4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        gflat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gflat4ActionPerformed(evt);
            }
        });

        eflat4.setText("e4");
        eflat4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        eflat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eflat4ActionPerformed(evt);
            }
        });

        aflat4.setText("a4");
        aflat4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        aflat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aflat4ActionPerformed(evt);
            }
        });

        bflat4.setText("b4");
        bflat4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        bflat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bflat4ActionPerformed(evt);
            }
        });

        dflat5.setText("d5");
        dflat5.setMargin(new java.awt.Insets(2, 4, 2, 4));
        dflat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dflat5ActionPerformed(evt);
            }
        });

        eflat5.setText("e5");
        eflat5.setMargin(new java.awt.Insets(2, 4, 2, 4));
        eflat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eflat5ActionPerformed(evt);
            }
        });

        gflat5.setText("g5");
        gflat5.setMargin(new java.awt.Insets(2, 4, 2, 4));
        gflat5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gflat5ActionPerformed(evt);
            }
        });

        beginChord.setText("Begin Chord");
        beginChord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginChordActionPerformed(evt);
            }
        });

        endChord.setText("End Chord");
        endChord.setEnabled(false);
        endChord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endChordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(c3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(dflat3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eflat3)
                        .addGap(39, 39, 39)
                        .addComponent(gflat3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aflat3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bflat3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(c4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(e5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(f5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(g5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(beginChord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endChord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(dflat4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eflat4)
                        .addGap(33, 33, 33)
                        .addComponent(gflat4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aflat4)
                        .addGap(14, 14, 14)
                        .addComponent(bflat4)
                        .addGap(28, 28, 28)
                        .addComponent(dflat5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eflat5)
                        .addGap(37, 37, 37)
                        .addComponent(gflat5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dflat3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(eflat3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(gflat3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(aflat3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(bflat3, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(dflat4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(gflat4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(eflat4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(aflat4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(bflat4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(dflat5, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(eflat5, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(gflat5, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(f3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(g3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(g4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(f4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(a4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(e5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(f5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(g5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(c3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(d5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(beginChord)
                        .addGap(13, 13, 13)
                        .addComponent(endChord)))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        win.insertNote(Note.C3);
    }//GEN-LAST:event_c3ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
         win.insertNote(Note.E3);
    }//GEN-LAST:event_e3ActionPerformed

    private void g3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g3ActionPerformed
         win.insertNote(Note.G3);
    }//GEN-LAST:event_g3ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
         win.insertNote(Note.B3);
    }//GEN-LAST:event_b3ActionPerformed

    private void d4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d4ActionPerformed
         win.insertNote(Note.D4);
    }//GEN-LAST:event_d4ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
         win.insertNote(Note.F4);
    }//GEN-LAST:event_f4ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
         win.insertNote(Note.A4);
    }//GEN-LAST:event_a4ActionPerformed

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c5ActionPerformed
         win.insertNote(Note.C5);
    }//GEN-LAST:event_c5ActionPerformed

    private void bflat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bflat4ActionPerformed
         win.insertNote(Note.Bb4);
    }//GEN-LAST:event_bflat4ActionPerformed

    private void dflat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dflat5ActionPerformed
         win.insertNote(Note.Db5);
    }//GEN-LAST:event_dflat5ActionPerformed

    private void eflat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eflat5ActionPerformed
        win.insertNote(Note.Eb5);
    }//GEN-LAST:event_eflat5ActionPerformed

    private void gflat5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gflat5ActionPerformed
         win.insertNote(Note.Gb5);
    }//GEN-LAST:event_gflat5ActionPerformed

    private void bflat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bflat3ActionPerformed
         win.insertNote(Note.Bb3);
    }//GEN-LAST:event_bflat3ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
         win.insertNote(Note.D3);
    }//GEN-LAST:event_d3ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
         win.insertNote(Note.F3);
    }//GEN-LAST:event_f3ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
         win.insertNote(Note.A3);
    }//GEN-LAST:event_a3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
         win.insertNote(Note.C4);
    }//GEN-LAST:event_c4ActionPerformed

    private void e4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e4ActionPerformed
         win.insertNote(Note.E4);
    }//GEN-LAST:event_e4ActionPerformed

    private void g4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g4ActionPerformed
         win.insertNote(Note.G4);
    }//GEN-LAST:event_g4ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
         win.insertNote(Note.B4);
    }//GEN-LAST:event_b4ActionPerformed

    private void d5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d5ActionPerformed
        win.insertNote(Note.D5);
    }//GEN-LAST:event_d5ActionPerformed

    private void e5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e5ActionPerformed
         win.insertNote(Note.E5);
    }//GEN-LAST:event_e5ActionPerformed

    private void f5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f5ActionPerformed
         win.insertNote(Note.F5);
    }//GEN-LAST:event_f5ActionPerformed

    private void g5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_g5ActionPerformed
         win.insertNote(Note.G5);
    }//GEN-LAST:event_g5ActionPerformed

    private void dflat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dflat3ActionPerformed
         win.insertNote(Note.Db3);
    }//GEN-LAST:event_dflat3ActionPerformed

    private void eflat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eflat3ActionPerformed
         win.insertNote(Note.Eb3);
    }//GEN-LAST:event_eflat3ActionPerformed

    private void gflat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gflat3ActionPerformed
         win.insertNote(Note.Gb3);
    }//GEN-LAST:event_gflat3ActionPerformed

    private void aflat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aflat3ActionPerformed
         win.insertNote(Note.Ab3);
    }//GEN-LAST:event_aflat3ActionPerformed

    private void dflat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dflat4ActionPerformed
         win.insertNote(Note.Db4);
    }//GEN-LAST:event_dflat4ActionPerformed

    private void eflat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eflat4ActionPerformed
         win.insertNote(Note.Eb4);
    }//GEN-LAST:event_eflat4ActionPerformed

    private void gflat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gflat4ActionPerformed
         win.insertNote(Note.Gb4);
    }//GEN-LAST:event_gflat4ActionPerformed

    private void aflat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aflat4ActionPerformed
         win.insertNote(Note.Ab4);
    }//GEN-LAST:event_aflat4ActionPerformed

    private void beginChordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginChordActionPerformed
        endChord.setEnabled(true);
        beginChord.setEnabled(false);
        win.beginChord();
    }//GEN-LAST:event_beginChordActionPerformed

    private void endChordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endChordActionPerformed
        endChord.setEnabled(false);
        beginChord.setEnabled(true);
        win.endChord();
    }//GEN-LAST:event_endChordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a3;
    private javax.swing.JButton a4;
    private javax.swing.JButton aflat3;
    private javax.swing.JButton aflat4;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton beginChord;
    private javax.swing.JButton bflat3;
    private javax.swing.JButton bflat4;
    private javax.swing.JButton c3;
    private javax.swing.JButton c4;
    private javax.swing.JButton c5;
    private javax.swing.JButton d3;
    private javax.swing.JButton d4;
    private javax.swing.JButton d5;
    private javax.swing.JButton dflat3;
    private javax.swing.JButton dflat4;
    private javax.swing.JButton dflat5;
    private javax.swing.JButton e3;
    private javax.swing.JButton e4;
    private javax.swing.JButton e5;
    private javax.swing.JButton eflat3;
    private javax.swing.JButton eflat4;
    private javax.swing.JButton eflat5;
    private javax.swing.JButton endChord;
    private javax.swing.JButton f3;
    private javax.swing.JButton f4;
    private javax.swing.JButton f5;
    private javax.swing.JButton g3;
    private javax.swing.JButton g4;
    private javax.swing.JButton g5;
    private javax.swing.JButton gflat3;
    private javax.swing.JButton gflat4;
    private javax.swing.JButton gflat5;
    // End of variables declaration//GEN-END:variables
}
