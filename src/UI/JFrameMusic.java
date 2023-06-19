/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import DAO.PlaylistDAO;
import DAO.UserDAO;

import Entity.PlayList;
import Entity.User;

import PanelMenu.JPanelExplor;
import PanelMenu.JPanelPlaylist;
import PanelMenu.JPanelTopChart;
import PanelMenu.JPanelQlyAccount;
import PanelMenu.JPanelQlyNhac;
import PanelMenu.JPanelTrangChu;
import Utils_Pro.Auth;
import Utils_Pro.MsgBox;
import Utils_Pro.XImage;

import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JPanel;

/**
 *
 * @author MSII
 */
public class JFrameMusic extends javax.swing.JFrame {

    private JPanel chiPanel;
    PlayList playList = new PlayList();
    PlaylistDAO playlistDAO = new PlaylistDAO();
    UserDAO userDAO = new UserDAO();
    PlayList CreateP = playlistDAO.DemSoPlayList(Auth.user.getMatk());
    int demCreateP = CreateP.getCounts(); // lay so playList
    public static int playList1;

    public JFrameMusic() {
        initComponents();
        setLocationRelativeTo(null);
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 50, 50));
        init();
        loadImg();
        btnPlaylist1.setVisible(false);
        btnPlaylist2.setVisible(false);
        btnPlaylist1.setComponentPopupMenu(MnPlaylist);
        btnPlaylist2.setComponentPopupMenu(MnPlaylist);
        showPlayList();

    }

    void init() {
        showPanel(new JPanelTrangChu());

        if (!Auth.isManager()) {
            btnManagerMusic.setVisible(false);
            btnManagerUser.setVisible(false);
        }

    }

    public void showPlayList() {
        List<PlayList> listP = playlistDAO.selectAll();
        for (PlayList p : listP) {

            if (Auth.user.getMatk() == p.getMatk()) {
                if (demCreateP == 1) {
                    if (p.getCounts() == 1) {
                        btnPlaylist1.setVisible(true);
                    }
                    if (p.getCounts() == 2) {
                        btnPlaylist2.setVisible(true);
                    }

                } else {
                    btnPlaylist1.setVisible(true);
                    btnPlaylist2.setVisible(true);
                }

            }
        }

    }

    public void showPanel(JPanel panel) {
        chiPanel = panel;
        pnMain.removeAll();
        pnMain.add(chiPanel);
        pnMain.validate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MnPlaylist = new javax.swing.JPopupMenu();
        MnXoaNhac = new javax.swing.JMenuItem();
        pnMain = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnDiscover = new rojeru_san.complementos.RSButtonHover();
        btnHome = new rojeru_san.complementos.RSButtonHover();
        btnTopCharts = new rojeru_san.complementos.RSButtonHover();
        jLabel2 = new javax.swing.JLabel();
        lblAvatar = new Utils_Pro.ImageAvatar();
        btnManagerMusic = new rojeru_san.complementos.RSButtonHover();
        btnManagerUser = new rojeru_san.complementos.RSButtonHover();
        btnCreatePlaylist = new rojeru_san.complementos.RSButtonHover();
        btnPlaylist1 = new rojeru_san.complementos.RSButtonHover();
        btnPlaylist2 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover5 = new rojeru_san.complementos.RSButtonHover();
        jPanel4 = new javax.swing.JPanel();
        rSButtonHover3 = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover1 = new rojeru_san.complementos.RSButtonHover();

        MnXoaNhac.setText("Xóa Playlist");
        MnXoaNhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnXoaNhacActionPerformed(evt);
            }
        });
        MnPlaylist.add(MnXoaNhac);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        pnMain.setBackground(new java.awt.Color(29, 34, 56));
        pnMain.setName(""); // NOI18N
        pnMain.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(38, 45, 71));

        btnDiscover.setBackground(new java.awt.Color(38, 45, 71));
        btnDiscover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/IconSearch.png"))); // NOI18N
        btnDiscover.setText("    Explore");
        btnDiscover.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnDiscover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiscoverActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(38, 45, 71));
        btnHome.setForeground(new java.awt.Color(204, 204, 204));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tainghe.png"))); // NOI18N
        btnHome.setText("    Home");
        btnHome.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnTopCharts.setBackground(new java.awt.Color(38, 45, 71));
        btnTopCharts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bieudo.png"))); // NOI18N
        btnTopCharts.setText("Top Charts");
        btnTopCharts.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnTopCharts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopChartsActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Browse");

        lblAvatar.setBorderSize(3);
        lblAvatar.setBorderSpace(3);
        lblAvatar.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))); // NOI18N
        lblAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAvatarMouseClicked(evt);
            }
        });

        btnManagerMusic.setBackground(new java.awt.Color(38, 45, 71));
        btnManagerMusic.setForeground(new java.awt.Color(204, 204, 204));
        btnManagerMusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/manamusic.png"))); // NOI18N
        btnManagerMusic.setText("Manager Music");
        btnManagerMusic.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnManagerMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerMusicActionPerformed(evt);
            }
        });

        btnManagerUser.setBackground(new java.awt.Color(38, 45, 71));
        btnManagerUser.setForeground(new java.awt.Color(204, 204, 204));
        btnManagerUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/tym.png"))); // NOI18N
        btnManagerUser.setText("Manager User");
        btnManagerUser.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnManagerUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerUserActionPerformed(evt);
            }
        });

        btnCreatePlaylist.setBackground(new java.awt.Color(38, 45, 71));
        btnCreatePlaylist.setForeground(new java.awt.Color(204, 204, 204));
        btnCreatePlaylist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/createplaylist.png"))); // NOI18N
        btnCreatePlaylist.setText("Create Playlist");
        btnCreatePlaylist.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnCreatePlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePlaylistActionPerformed(evt);
            }
        });

        btnPlaylist1.setBackground(new java.awt.Color(38, 45, 71));
        btnPlaylist1.setForeground(new java.awt.Color(204, 204, 204));
        btnPlaylist1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/playlist.png"))); // NOI18N
        btnPlaylist1.setText("Playlist #1");
        btnPlaylist1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnPlaylist1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaylist1ActionPerformed(evt);
            }
        });

        btnPlaylist2.setBackground(new java.awt.Color(38, 45, 71));
        btnPlaylist2.setForeground(new java.awt.Color(204, 204, 204));
        btnPlaylist2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/playlist.png"))); // NOI18N
        btnPlaylist2.setText("Playlist #2");
        btnPlaylist2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        btnPlaylist2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaylist2ActionPerformed(evt);
            }
        });

        rSButtonHover5.setBackground(new java.awt.Color(37, 44, 70));
        rSButtonHover5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/logout.png"))); // NOI18N
        rSButtonHover5.setColorHover(new java.awt.Color(255, 0, 51));
        rSButtonHover5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rSButtonHover5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnDiscover, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnManagerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnManagerMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnTopCharts, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnCreatePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnPlaylist1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(btnPlaylist2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAvatar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDiscover, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTopCharts, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnManagerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnManagerMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCreatePlaylist, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPlaylist1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnPlaylist2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSButtonHover5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(29, 34, 56));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover3.setBackground(new java.awt.Color(29, 34, 56));
        rSButtonHover3.setText("-");
        rSButtonHover3.setColorHover(new java.awt.Color(255, 0, 51));
        rSButtonHover3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        rSButtonHover3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover3ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButtonHover3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 41, -1));

        rSButtonHover1.setBackground(new java.awt.Color(29, 34, 56));
        rSButtonHover1.setText("x");
        rSButtonHover1.setColorHover(new java.awt.Color(255, 0, 51));
        rSButtonHover1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        rSButtonHover1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonHover1ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButtonHover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(758, 2, 48, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSButtonHover1ActionPerformed

    private void rSButtonHover3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover3ActionPerformed
        this.setExtendedState(JFrameMusic.ICONIFIED);
    }//GEN-LAST:event_rSButtonHover3ActionPerformed

    private void btnDiscoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiscoverActionPerformed
        try {
            showPanel(new JPanelExplor());
        } catch (InterruptedException ex) {
            Logger.getLogger(JFrameMusic.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDiscoverActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        showPanel(new JPanelTrangChu());
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnTopChartsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopChartsActionPerformed
        showPanel(new JPanelTopChart());
    }//GEN-LAST:event_btnTopChartsActionPerformed

    private void btnManagerMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerMusicActionPerformed
        showPanel(new JPanelQlyNhac());
    }//GEN-LAST:event_btnManagerMusicActionPerformed

    private void lblAvatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAvatarMouseClicked
        new ProfileJDialog(this, true).setVisible(true);
    }//GEN-LAST:event_lblAvatarMouseClicked

    private void btnManagerUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerUserActionPerformed
        showPanel(new JPanelQlyAccount());
    }//GEN-LAST:event_btnManagerUserActionPerformed

    private void btnCreatePlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePlaylistActionPerformed
   
        demCreateP++;

        if (demCreateP == 1) {
            btnPlaylist1.setVisible(true);
            insertPlayList();
    //         demCreateP = CreateP.getCounts(); 

        } else if (demCreateP == 2) {
            btnPlaylist2.setVisible(true);
            insertPlayList();
           //   demCreateP = CreateP.getCounts(); 
        } else {
            MsgBox.alert(this, "Chi dc tao 2 PlayList");
        }

    }//GEN-LAST:event_btnCreatePlaylistActionPerformed

    private void btnPlaylist1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaylist1ActionPerformed
//        // TODO add your handling code here:
        List<PlayList> listP = playlistDAO.SoPlayListDaTao(Auth.user.getMatk());
        playList1 = 1;
        for (PlayList p : listP) {
            if (p.getCounts() == 1) {
                showPanel(new JPanelPlaylist());

            }
        }


    }//GEN-LAST:event_btnPlaylist1ActionPerformed

    private void btnPlaylist2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaylist2ActionPerformed
        List<PlayList> listP = playlistDAO.SoPlayListDaTao(Auth.user.getMatk());
        playList1 = 2;
        for (PlayList p : listP) {
            if (p.getCounts() == 2) {
                showPanel(new JPanelPlaylist());

            }
        }
    }//GEN-LAST:event_btnPlaylist2ActionPerformed

    private void rSButtonHover5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonHover5ActionPerformed
        Auth.clear();
        JFrameMusic.this.dispose();
        new JFrameLogin().setVisible(true);
    }//GEN-LAST:event_rSButtonHover5ActionPerformed

    private void MnXoaNhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnXoaNhacActionPerformed
        deletePlayList();
    }//GEN-LAST:event_MnXoaNhacActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMusic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMusic().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu MnPlaylist;
    private javax.swing.JMenuItem MnXoaNhac;
    private rojeru_san.complementos.RSButtonHover btnCreatePlaylist;
    private rojeru_san.complementos.RSButtonHover btnDiscover;
    private rojeru_san.complementos.RSButtonHover btnHome;
    private rojeru_san.complementos.RSButtonHover btnManagerMusic;
    private rojeru_san.complementos.RSButtonHover btnManagerUser;
    private rojeru_san.complementos.RSButtonHover btnPlaylist1;
    private rojeru_san.complementos.RSButtonHover btnPlaylist2;
    private rojeru_san.complementos.RSButtonHover btnTopCharts;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private Utils_Pro.ImageAvatar lblAvatar;
    private javax.swing.JPanel pnMain;
    private rojeru_san.complementos.RSButtonHover rSButtonHover1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover3;
    private rojeru_san.complementos.RSButtonHover rSButtonHover5;
    // End of variables declaration//GEN-END:variables

    void loadImg() {
        if (Auth.user.getHinh() != null) {
            lblAvatar.setToolTipText(Auth.user.getHinh());
            lblAvatar.setImage(XImage.read(Auth.user.getHinh()));
        }
    }

    public void deletePlayList() {
        List<PlayList> listDelete = playlistDAO.selectMaplaylist(playList1, Auth.user.getMatk());
        for (PlayList pls : listDelete) {

            playlistDAO.delete(String.valueOf(pls.getMaplaylist()));
            if (playList1 == 1) {
                btnPlaylist1.setVisible(false);
                //  demCreateP = CreateP.getCounts() +1; 
                
            } else {
                btnPlaylist2.setVisible(false);
                  //demCreateP = CreateP.getCounts(); 
                  
            }

        }
    }

    PlayList getForm() {
        PlayList playList = new PlayList();
        playList.setMatk(Auth.user.getMatk());
        playList.setTieude("Playlist #" + demCreateP);
        playList.setCounts(demCreateP);
        playList.setHinh("null");
        playList.setDescriptions(Auth.user.getTennd());
        playList.setNgaytao(new Date());
        return playList;
    }

    void insertPlayList() {
        PlayList playList = getForm();
        try {
            playlistDAO.insert(playList);
            MsgBox.alert(this, "Thêm Playlist Thành Công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    List<PlayList> list = playlistDAO.selectById_matk(Auth.user.getMatk());

//    void showPlaylist() {
//        try {
//            System.out.println(playList_matk.getMatk());
//            System.out.println(playList_matk.getCounts());
//            System.out.println(countClick);
//
//            if (Auth.user.getMatk() == playList_matk.getMatk()) {
//                for (PlayList pl : list) {
//                    System.out.println(pl.getCounts());
//                    if (pl.getCounts() == 2) {
//                        btnPlaylist2.setVisible(true);
//                    } else {
//                        btnPlaylist2.setVisible(false);
//                    }
//                }
//                if (playList_matk.getCounts() == 1) {
//                    btnPlaylist1.setVisible(true);
//                } else {
//                    btnPlaylist1.setVisible(false);
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
