/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package PanelMenu;

import DAO.PlaylistDAO;
import DAO.PlaylistSongDAO;
import DAO.SongDAO;
import DAO.UserSongDAO;
import Entity.PlayList;
import Entity.PlaylistSong;
import Entity.Song;
import Entity.UserSong;
import UI.JFrameMusic;
import UI.PlaylistJDialog;
import Utils_Pro.Auth;
import Utils_Pro.MsgBox;
import Utils_Pro.XImage;
import Utils_Pro.XMusic;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import swing.EventCallBack;
import swing.EventTextField;

/**
 *
 * @author NAM PC
 */
public class JPanelPlaylist extends javax.swing.JPanel {

    /**
     * Creates new form JPanelPlaylist2
     */
    public JPanelPlaylist() {
        initComponents();

        tblPlaylist.setDefaultEditor(Object.class, null);
        tblSearch.setDefaultEditor(Object.class, null);

        cosTomTable();
        setForm(playList_matk);
        search();
        loadTableuser();

        lblpause.setVisible(false);
        lblpause.setEnabled(false);
        lblresume.setVisible(true);
        lblresume.setEnabled(true);
    }

    public void cosTomTable() {
        tblPlaylist.fixTable(jScrollPane3);
        tblPlaylist.setColumnAlignment(0, JLabel.CENTER);
        tblPlaylist.setCellAlignment(0, JLabel.CENTER);
        tblPlaylist.setColumnAlignment(2, JLabel.CENTER);
        tblPlaylist.setCellAlignment(2, JLabel.CENTER);
        tblPlaylist.setColumnAlignment(4, JLabel.RIGHT);
        tblPlaylist.setCellAlignment(4, JLabel.RIGHT);
        tblPlaylist.setColumnWidth(0, 100);
        tblPlaylist.setColumnWidth(2, 100);

        tblSearch.fixTable(jScrollPane4);
        tblSearch.setColumnAlignment(0, JLabel.CENTER);
        tblSearch.setCellAlignment(0, JLabel.CENTER);
        tblSearch.setColumnAlignment(2, JLabel.CENTER);
        tblSearch.setCellAlignment(2, JLabel.CENTER);
        tblSearch.setColumnAlignment(4, JLabel.RIGHT);
        tblSearch.setCellAlignment(4, JLabel.RIGHT);
        tblSearch.setColumnWidth(0, 100);
        tblSearch.setColumnWidth(2, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MnSearch = new javax.swing.JPopupMenu();
        MnAdd = new javax.swing.JMenuItem();
        MnPlaylist = new javax.swing.JPopupMenu();
        MnXoaNhac = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        txtSearch = new swing.TextFieldAnimation();
        jLabel2 = new javax.swing.JLabel();
        lblTenPlaylist = new javax.swing.JLabel();
        lbldescription = new javax.swing.JLabel();
        lblhinh = new rojerusan.RSLabelImage();
        lbltaoboi = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPlaylist = new CustomTable.TableDark();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblSearch = new CustomTable.TableDark();
        LPThanhNhac1 = new javax.swing.JPanel();
        lblAnhNhac = new Utils_Pro.ImageAvatar();
        lblNameMusic = new javax.swing.JLabel();
        thanhNhac = new Utils_Pro.ThanhNhac();
        btnLoop = new javax.swing.JButton();
        btnShuffle = new javax.swing.JButton();
        lblNguoiHat = new javax.swing.JLabel();
        btnBackP = new javax.swing.JButton();
        btnnextP = new javax.swing.JButton();
        btnVolumeDown = new javax.swing.JButton();
        btnVolumeUp = new javax.swing.JButton();
        lblpause = new javax.swing.JLabel();
        lblresume = new javax.swing.JLabel();

        MnAdd.setText("Add Vào PlayList");
        MnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnAddActionPerformed(evt);
            }
        });
        MnSearch.add(MnAdd);

        MnXoaNhac.setText("Xóa Nhạc");
        MnXoaNhac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnXoaNhacActionPerformed(evt);
            }
        });
        MnPlaylist.add(MnXoaNhac);

        jPanel1.setBackground(new java.awt.Color(29, 34, 56));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 520));

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Playlist");

        lblTenPlaylist.setFont(new java.awt.Font("SimSun", 1, 48)); // NOI18N
        lblTenPlaylist.setForeground(new java.awt.Color(255, 255, 255));
        lblTenPlaylist.setText("Ten Playlist");
        lblTenPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTenPlaylistMouseClicked(evt);
            }
        });

        lbldescription.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        lbldescription.setForeground(new java.awt.Color(255, 255, 255));
        lbldescription.setText("description");

        lblhinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblhinhMouseClicked(evt);
            }
        });

        lbltaoboi.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        lbltaoboi.setForeground(new java.awt.Color(255, 255, 255));
        lbltaoboi.setText("tao boi ai");

        tblPlaylist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã bài hát", "Tên bài hát", "Thể loại", "Người sáng tác", "Người trình bày"
            }
        ));
        tblPlaylist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPlaylistMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblPlaylist);

        tblSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã bài hát", "Tên bài hát", "Thể loại", "Người sáng tác", "Người trình bày"
            }
        ));
        tblSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSearchMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblSearch);

        LPThanhNhac1.setBackground(new java.awt.Color(37, 44, 70));
        LPThanhNhac1.setEnabled(false);

        lblAnhNhac.setBorderSize(0);
        lblAnhNhac.setBorderSpace(0);
        lblAnhNhac.setImage(new javax.swing.ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))); // NOI18N

        lblNameMusic.setForeground(new java.awt.Color(255, 255, 255));
        lblNameMusic.setText("Ten bai nhac");

        thanhNhac.setValue(0);

        btnLoop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/infiniti.png"))); // NOI18N
        btnLoop.setContentAreaFilled(false);
        btnLoop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLoop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnLoopMouseReleased(evt);
            }
        });

        btnShuffle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/random.png"))); // NOI18N
        btnShuffle.setContentAreaFilled(false);
        btnShuffle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShuffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnShuffleMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnShuffleMouseReleased(evt);
            }
        });
        btnShuffle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShuffleActionPerformed(evt);
            }
        });

        lblNguoiHat.setForeground(new java.awt.Color(204, 204, 204));
        lblNguoiHat.setText("Người hát");

        btnBackP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/backP.png"))); // NOI18N
        btnBackP.setContentAreaFilled(false);
        btnBackP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBackP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnBackPMouseReleased(evt);
            }
        });

        btnnextP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/NextP.png"))); // NOI18N
        btnnextP.setContentAreaFilled(false);
        btnnextP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnextP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnnextPMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnnextPMouseReleased(evt);
            }
        });
        btnnextP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextPActionPerformed(evt);
            }
        });

        btnVolumeDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/volumedown.png"))); // NOI18N
        btnVolumeDown.setContentAreaFilled(false);
        btnVolumeDown.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolumeDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolumeDownMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVolumeDownMouseReleased(evt);
            }
        });
        btnVolumeDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeDownActionPerformed(evt);
            }
        });

        btnVolumeUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/volumeup.png"))); // NOI18N
        btnVolumeUp.setContentAreaFilled(false);
        btnVolumeUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolumeUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVolumeUpMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnVolumeUpMouseReleased(evt);
            }
        });
        btnVolumeUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolumeUpActionPerformed(evt);
            }
        });

        lblpause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/play.png"))); // NOI18N
        lblpause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblpause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblpauseMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblpauseMouseReleased(evt);
            }
        });
        lblpause.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lblpausePropertyChange(evt);
            }
        });

        lblresume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/playing.png"))); // NOI18N
        lblresume.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblresume.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblresumeMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblresumeMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout LPThanhNhac1Layout = new javax.swing.GroupLayout(LPThanhNhac1);
        LPThanhNhac1.setLayout(LPThanhNhac1Layout);
        LPThanhNhac1Layout.setHorizontalGroup(
            LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPThanhNhac1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNguoiHat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LPThanhNhac1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBackP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblresume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpause))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnextP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShuffle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LPThanhNhac1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(thanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolumeDown, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolumeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        LPThanhNhac1Layout.setVerticalGroup(
            LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPThanhNhac1Layout.createSequentialGroup()
                .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LPThanhNhac1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblNameMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNguoiHat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LPThanhNhac1Layout.createSequentialGroup()
                        .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LPThanhNhac1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LPThanhNhac1Layout.createSequentialGroup()
                                        .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(LPThanhNhac1Layout.createSequentialGroup()
                                                .addComponent(btnLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(LPThanhNhac1Layout.createSequentialGroup()
                                                .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblresume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblpause)
                                                    .addComponent(btnBackP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnShuffle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnnextP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(8, 8, 8)))
                                        .addComponent(thanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAnhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LPThanhNhac1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LPThanhNhac1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVolumeDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVolumeUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblhinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenPlaylist)
                            .addComponent(jLabel2)
                            .addComponent(lbldescription, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltaoboi, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
            .addComponent(LPThanhNhac1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTenPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbldescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltaoboi))
                    .addComponent(lblhinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LPThanhNhac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 593, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblhinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblhinhMouseClicked
        // TODO add your handling code here:
        playlistJDialog.setVisible(true);
    }//GEN-LAST:event_lblhinhMouseClicked

    private void lblTenPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTenPlaylistMouseClicked
        // TODO add your handling code here:
        playlistJDialog.setVisible(true);
    }//GEN-LAST:event_lblTenPlaylistMouseClicked

    private void btnLoopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoopMouseReleased
        loop = 1;
    }//GEN-LAST:event_btnLoopMouseReleased

    private void btnShuffleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShuffleMouseClicked

    }//GEN-LAST:event_btnShuffleMouseClicked

    private void btnShuffleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnShuffleMouseReleased
        sf = 1;
    }//GEN-LAST:event_btnShuffleMouseReleased

    private void btnShuffleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShuffleActionPerformed

    }//GEN-LAST:event_btnShuffleActionPerformed

    private void btnBackPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackPMouseReleased
        try {
            previous();
        } catch (JavaLayerException ex) {
            Logger.getLogger(JPanelPlaylist.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBackPMouseReleased

    private void btnnextPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextPMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnextPMouseClicked

    private void btnnextPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnextPMouseReleased
        next();
    }//GEN-LAST:event_btnnextPMouseReleased

    private void btnnextPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnextPActionPerformed

    private void btnVolumeDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeDownMouseClicked
        VolumeDown(0.1);
    }//GEN-LAST:event_btnVolumeDownMouseClicked

    private void btnVolumeDownMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeDownMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolumeDownMouseReleased

    private void btnVolumeDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolumeDownActionPerformed

    private void btnVolumeUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeUpMouseClicked
        VolumeUp(0.1);
    }//GEN-LAST:event_btnVolumeUpMouseClicked

    private void btnVolumeUpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVolumeUpMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolumeUpMouseReleased

    private void btnVolumeUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolumeUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVolumeUpActionPerformed

    private void tblPlaylistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPlaylistMouseClicked
        // TODO add your handling code here:
        tblPlaylist.setComponentPopupMenu(MnPlaylist);
        if (evt.getClickCount() == 2) {
            try {
                loop = 0;
                sf = 0;
                playNhac();
            } catch (JavaLayerException ex) {
                Logger.getLogger(JPanelQlyNhac.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(JPanelQlyNhac.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblPlaylistMouseClicked

    private void tblSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSearchMouseClicked
        // TODO add your handling code here:
        tblSearch.setComponentPopupMenu(MnSearch);
//        if (evt.getClickCount() == 2) {
//            try {
//                playNhac();
//            } catch (JavaLayerException ex) {
//                Logger.getLogger(JPanelQlyNhac.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (IOException ex) {
//                Logger.getLogger(JPanelQlyNhac.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        }
    }//GEN-LAST:event_tblSearchMouseClicked

    private void lblpauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpauseMouseClicked
        lblpause.setVisible(false);
        lblpause.setEnabled(false);
        lblresume.setVisible(true);
        lblresume.setEnabled(true);
    }//GEN-LAST:event_lblpauseMouseClicked

    private void lblpauseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblpauseMouseReleased
        resume();
    }//GEN-LAST:event_lblpauseMouseReleased

    private void lblpausePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lblpausePropertyChange

    }//GEN-LAST:event_lblpausePropertyChange

    private void lblresumeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresumeMouseClicked
        lblpause.setVisible(true);
        lblpause.setEnabled(true);
        lblresume.setVisible(false);
        lblresume.setEnabled(false);
    }//GEN-LAST:event_lblresumeMouseClicked

    private void lblresumeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblresumeMouseReleased
        pause();
    }//GEN-LAST:event_lblresumeMouseReleased

    private void MnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnAddActionPerformed
        // TODO add your handling code here:
        addSong();
    }//GEN-LAST:event_MnAddActionPerformed

    private void MnXoaNhacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnXoaNhacActionPerformed
        deleteSong();
    }//GEN-LAST:event_MnXoaNhacActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel LPThanhNhac1;
    private javax.swing.JMenuItem MnAdd;
    private javax.swing.JPopupMenu MnPlaylist;
    private javax.swing.JPopupMenu MnSearch;
    private javax.swing.JMenuItem MnXoaNhac;
    private javax.swing.JButton btnBackP;
    private javax.swing.JButton btnLoop;
    private javax.swing.JButton btnShuffle;
    private javax.swing.JButton btnVolumeDown;
    private javax.swing.JButton btnVolumeUp;
    private javax.swing.JButton btnnextP;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public Utils_Pro.ImageAvatar lblAnhNhac;
    public javax.swing.JLabel lblNameMusic;
    private javax.swing.JLabel lblNguoiHat;
    private javax.swing.JLabel lblTenPlaylist;
    private javax.swing.JLabel lbldescription;
    private rojerusan.RSLabelImage lblhinh;
    public javax.swing.JLabel lblpause;
    public javax.swing.JLabel lblresume;
    private javax.swing.JLabel lbltaoboi;
    private CustomTable.TableDark tblPlaylist;
    private CustomTable.TableDark tblSearch;
    public Utils_Pro.ThanhNhac thanhNhac;
    private swing.TextFieldAnimation txtSearch;
    // End of variables declaration//GEN-END:variables

    PlaylistDAO playlistDAO = new PlaylistDAO();
    PlayList playList_matk = playlistDAO.selectById2(Auth.user.getMatk());
    PlaylistSong playlistSong = new PlaylistSong();
    PlaylistSongDAO playlistSongDAO = new PlaylistSongDAO();
    SongDAO songDAO = new SongDAO();
    PlaylistJDialog playlistJDialog = new PlaylistJDialog();
    List<PlayList> listP = playlistDAO.SoPlayListDaTao(Auth.user.getMatk());
    List<PlayList> listT = playlistDAO.selectById_TieuDe(Auth.user.getMatk());
    JFrameMusic m = new JFrameMusic();

    public void setForm(PlayList playList) {
        for (PlayList s : listT) {
            if (s.getCounts() == m.playList1) {
                lblTenPlaylist.setText(s.getTieude());
                lbldescription.setText(s.getDescriptions());
                if (playList.getHinh() != null) {
                    lblhinh.setToolTipText(s.getHinh());
                    lblhinh.setIcon(XImage.read(s.getHinh()));
                }
                lbltaoboi.setText(Auth.user.getTennd());
            }
        }
    }

    void search() {
        txtSearch.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                //  Test
                try {
                    for (int i = 1; i <= 50; i++) {

                        Thread.sleep(10);
                    }
                    timKiem();
                    call.done();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            @Override
            public void onCancel() {
                tblSearch.setVisible(false);
            }
        });
    }

    void timKiem() {
        tblSearch.setVisible(true);
        fillTableSearch();
    }

    void fillTableSearch() {
        DefaultTableModel tblModel = (DefaultTableModel) tblSearch.getModel();
        tblModel.setRowCount(0);
        String keyWords = txtSearch.getText();
        try {
            List<Song> list = songDAO.selectByKeyword(keyWords); //Đọc dữ liệu từ csdl
            for (Song s : list) {
                Object[] rows = {s.getMabh(), s.getTenbh(), s.getTheloai(), s.getNguoist(), s.getNguoitb()};
                tblModel.addRow(rows);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }

    void loadTableuser() {
        DefaultTableModel tblModel = (DefaultTableModel) tblPlaylist.getModel();
        tblModel.setRowCount(0);

        try {
            List<Object[]> list = playlistSongDAO.getFillPlaylist(Auth.user.getMatk(), m.playList1);
            for (Object[] row : list) {
                tblModel.addRow(row);
            }

        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }
    }
    PlaylistDAO SongDAO = new PlaylistDAO();
    List<PlayList> listSong = SongDAO.selectPlaylistUser(Auth.user.getMatk(), m.playList1);

    void addSong() {

        int row = tblSearch.getSelectedRow();

        for (PlayList ps : listSong) {
            PlaylistSong ls = new PlaylistSong();
            ps.setMaplaylist(ps.getMaplaylist());
            ls.setMaplaylist(ps.getMaplaylist());
            ls.setMabh((String) tblSearch.getValueAt(row, 0));
            playlistSongDAO.insert(ls);
            break;
        }
        MsgBox.alert(this, "Đã Thêm Thành Công PlayList " + m.playList1);
        loadTableuser();
    }

    void deleteSong() {

        int row = tblPlaylist.getSelectedRow();
        System.out.println((String) tblPlaylist.getValueAt(row, 0));
        System.out.println(row);
        for (PlayList ps : listSong) {
            PlaylistSong ls = new PlaylistSong();
            ps.setMaplaylist(ps.getMaplaylist());
            ls.setMaplaylist(ps.getMaplaylist());
            ls.setMabh((String) tblPlaylist.getValueAt(row, 0));

            playlistSongDAO.delete_mabh(ls.getMabh(), ls.getMaplaylist());
            break;
        }
        MsgBox.alert(this, "Đã Xóa PlayList " + m.playList1);
        loadTableuser();
    }
    UserSongDAO usdao = new UserSongDAO();

    UserSong getForm() {
        UserSong us = new UserSong();
        i = tblPlaylist.getSelectedRow();
        String mabh = (String) tblPlaylist.getValueAt(i, 0);
        us.setMabh(mabh);
        return us;
    }
    int i = -1;
    public int dung;
    public Player player;
    public long pause;
    public long total_length;
    public FileInputStream fis;
    public BufferedInputStream bis;
    File musicPath = null;
    int play = 0;
    Timer time;
    int loop = 0;
    int sf = 0;

    void playNhac() throws FileNotFoundException, JavaLayerException, IOException {
        if (play == 0) {
            i = tblPlaylist.getSelectedRow();
            String mabh = (String) tblPlaylist.getValueAt(i, 0);
            Song s = songDAO.selectById(mabh);

            UserSong s2 = getForm();
            usdao.update(s2);

            fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
            bis = new BufferedInputStream(fis);
            player = new javazoom.jl.player.Player(bis);
            musicPath = XMusic.readPath(s.getMusicpath());
            total_length = fis.available();
            //lấy ảnh nhạc
            if (s.getAnh() != null) {
                lblAnhNhac.setImage(XImage.read(s.getAnh()));
            }
            //tên bài nhạc
            lblNameMusic.setText(s.getTenbh());
            lblNguoiHat.setText(s.getNguoitb());
            //Tốc độ nhạc
            duration(s);
            time.start();
            play = 1;
            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();
        } else {
            player.close();
            play = 0;
            time.stop();
            thanhNhac.setValue(0);
            playNhac();
        }
    }

    void duration(Song s) {
        //128kps birate cơ bản của file mp3
        try ( FileInputStream fis = new FileInputStream(XMusic.readPath(s.getMusicpath()))) {
            // lấy kích thước file
            long size = fis.getChannel().size();
            //công thức tính tốc độ truyền
            long bitrate = 128 * 1024;
            //tính ra tổng thời gian
            long duration = (size * 8) / bitrate;
            //chạy thanh processbar
            time = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int value = thanhNhac.getValue();
                    thanhNhac.setMaximum((int) duration);
                    if (value <= thanhNhac.getMaximum()) {
                        thanhNhac.setValue(value + 1);
                    }
                    if (value == thanhNhac.getMaximum()) {
                        if (loop == 1) {
                            try {
                                sf = 0;
                                playNhac();
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(JPanelTopChart.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(JPanelTopChart.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else if (sf == 1) {
                            loop = 0;
                            try {
                                shuffle();
                            } catch (JavaLayerException ex) {
                                Logger.getLogger(JPanelTopChart.class.getName()).log(Level.SEVERE, null, ex);
                            } catch (IOException ex) {
                                Logger.getLogger(JPanelTopChart.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            next();
                        }
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pause() {
        if (player != null) {
            try {
                time.stop();
                pause = fis.available();
                player.close();
            } catch (Exception e) {
            }
        }
    }

    public void resume() {
        try {
            fis = new FileInputStream(musicPath);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
            fis.skip(total_length - pause);
            time.start();
            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();
        } catch (Exception e) {
        }
    }

    private void previous() throws JavaLayerException {
        thanhNhac.setValue(0);
        if (play == 0) {
            try {
                int s1 = tblPlaylist.getSelectedRow() - 1;
                String mabh = (String) tblPlaylist.getValueAt(s1, 0);
                Song s = songDAO.selectById(mabh);
                fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
                bis = new BufferedInputStream(fis);
                player = new javazoom.jl.player.Player(bis);
                play = 1;
                //lấy ảnh nhạc
                if (s.getAnh() != null) {
                    lblAnhNhac.setImage(XImage.read(s.getAnh()));
                }
                //tên bài nhạc
                lblNguoiHat.setText(s.getNguoitb());
                lblNameMusic.setText(s.getTenbh());
                //Tốc độ nhạc
                tblPlaylist.setRowSelectionInterval(s1, s1);
            } catch (Exception e) {
                System.out.println("Problem playing file");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();

        } else {
            player.close();
            play = 0;
            previous();
        }
    }

    private void next() {
        thanhNhac.setValue(0);
        if (play == 0) {
            try {
                int s1 = tblPlaylist.getSelectedRow() + 1;
                String mabh = (String) tblPlaylist.getValueAt(s1, 0);
                Song s = songDAO.selectById(mabh);
                fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
                bis = new BufferedInputStream(fis);
                player = new javazoom.jl.player.Player(bis);
                play = 1;
                //lấy ảnh nhạc
                if (s.getAnh() != null) {
                    lblAnhNhac.setImage(XImage.read(s.getAnh()));
                }
                //tên bài nhạc
                lblNguoiHat.setText(s.getNguoitb());
                lblNameMusic.setText(s.getTenbh());
                //Tốc độ nhạc
                tblPlaylist.setRowSelectionInterval(s1, s1);
            } catch (Exception e) {
                System.out.println("Problem playing file");
                System.out.println(e);
            }

            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();

                    } catch (Exception e) {
                    }
                }
            }.start();

        } else {
            player.close();
            play = 0;
            next();
        }
    }

    void shuffle() throws FileNotFoundException, JavaLayerException, IOException {
        if (play == 0) {
            thanhNhac.setValue(0);
            Random rd = new Random();
            int random = rd.nextInt(tblPlaylist.getRowCount()) + 1;
            String mabh = (String) tblPlaylist.getValueAt(random, 0);
            Song s = songDAO.selectById(mabh);
            fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
            bis = new BufferedInputStream(fis);
            player = new javazoom.jl.player.Player(bis);
            musicPath = XMusic.readPath(s.getMusicpath());
            total_length = fis.available();
            //lấy ảnh nhạc
            if (s.getAnh() != null) {
                lblAnhNhac.setImage(XImage.read(s.getAnh()));
            }
            //tên bài nhạc
            lblNameMusic.setText(s.getTenbh());
            lblNguoiHat.setText(s.getNguoitb());
            tblPlaylist.setRowSelectionInterval(random, random);
            //Tốc độ nhạc
            try ( FileInputStream fis = new FileInputStream(XMusic.readPath(s.getMusicpath()))) {
                // lấy kích thước file
                long size = fis.getChannel().size();
                //công thức tính tốc độ truyền
                long bitrate = 128 * 1024;
                //tính ra tổng thời gian
                long duration = (size * 8) / bitrate;
                //chạy thanh processbar
                time = new Timer(1000, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int value = thanhNhac.getValue();
                        thanhNhac.setMaximum((int) duration + 5);
                        if (value <= thanhNhac.getMaximum()) {
                            thanhNhac.setValue(value + 1);
                        }
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
            play = 1;
            new Thread() {
                @Override
                public void run() {
                    try {
                        player.play();
                    } catch (Exception e) {
                    }
                }
            }.start();
        } else {
            player.close();
            play = 0;
            shuffle();
        }
    }

    private void VolumeDown(Double valueToPlusMinus) {
        // lấy Mixer Information từ hệ thống âm thanh
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        // Dùng vòng lặp để liệt kê tất cả mixers
        for (Mixer.Info mixerInfo : mixers) {
            // lấy Mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            // Bây giờ nhận dòng Target Line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            // Ở đây một lần nữa sử dụng vòng lặp for để liệt kê các dòng
            for (Line.Info lineInfo : lineInfos) {
                // Tạo line rỗng
                Line line = null;
                // Make a boolean as opened
                boolean opened = true;
                // Now use try exception for opening a line
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    // Now Check If Line Is not Opened
                    if (!opened) {
                        // Open Line
                        line.open();
                    }
                    // Make a float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    // Get Current Volume Now
                    float currentVolume = volControl.getValue();
                    // Make a temp double variable and store valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    // Make a float and calculate the addition or subtraction in volume
                    float changedCalc = (float) ((float) currentVolume - (double) volumeToCut);
                    // Now Set This Changed Value Into Volume Line.
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    // Close Line If it opened
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }

    private void VolumeUp(Double valueToPlusMinus) {
        // Get Mixer Information From AudioSystem
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        // Now use a for loop to list all mixers
        for (Mixer.Info mixerInfo : mixers) {
            // Get Mixer
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            // Now Get Target Line
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            // Here again use for loop to list lines
            for (Line.Info lineInfo : lineInfos) {
                // Make a null line
                Line line = null;
                // Make a boolean as opened
                boolean opened = true;
                // Now use try exception for opening a line
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    // Now Check If Line Is not Opened
                    if (!opened) {
                        // Open Line
                        line.open();
                    }
                    // Make a float control
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    // Get Current Volume Now
                    float currentVolume = volControl.getValue();
                    // Make a temp double variable and store valuePlusMinus
                    Double volumeToCut = valueToPlusMinus;
                    // Make a float and calculate the addition or subtraction in volume
                    float changedCalc = (float) ((float) currentVolume + (double) volumeToCut);
                    // Now Set This Changed Value Into Volume Line.
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    // Close Line If it opened
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }

}
