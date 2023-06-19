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
import PanelSlideShow.Slide1;
import PanelSlideShow.Slide2;
import PanelSlideShow.Slide3;
import UI.JFrameMusic;
import Utils_Pro.Auth;
import Utils_Pro.MsgBox;
import Utils_Pro.XImage;
import Utils_Pro.XMusic;
import jaco.mp3.player.MP3Player;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
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
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author MSII
 */
public class JPanelTrangChu extends javax.swing.JPanel {

    /**
     * Creates new form Pn
     */
    public JPanelTrangChu() {

        initComponents();
        slideshow1.initSlideshow(new Slide1(), new Slide2(), new Slide3());
        Test();
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();

        init();
//        lbl1.setIcon(ResizeImage("D:\\fPTPolytechnic\\FALL22_KY4\\DuAn1\\AppMusic\\src\\Icon\\NewSong1.jpg"));
    }

    public void Test() {
        tbl.fixTable(jScrollPane1);
        tbl.setColumnAlignment(0, JLabel.CENTER);
        tbl.setCellAlignment(0, JLabel.CENTER);
        tbl.setColumnAlignment(2, JLabel.CENTER);
        tbl.setCellAlignment(2, JLabel.CENTER);
        tbl.setColumnAlignment(4, JLabel.RIGHT);
        tbl.setCellAlignment(4, JLabel.RIGHT);
        tbl.setColumnWidth(0, 50);
        tbl.setColumnWidth(2, 100);

    }

    public void initPlay() {
        try {
            new MP3Player(new File("D:\\laptrinh\\java\\test\\runVideo\\aka.mp3")).play();
            Thread.sleep(10000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        slideshow1 = new ClassSlideShow.Slideshow();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new CustomTable.TableDark();
        lblBack = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        lblvideo = new javax.swing.JLabel();
        LPThanhNhac = new javax.swing.JPanel();
        lblAnhNhac = new Utils_Pro.ImageAvatar();
        lblNameMusic = new javax.swing.JLabel();
        thanhNhac = new Utils_Pro.ThanhNhac();
        btnLoop = new javax.swing.JButton();
        btnShuffle = new javax.swing.JButton();
        lblpause = new javax.swing.JLabel();
        lblresume = new javax.swing.JLabel();
        lblNguoiHat = new javax.swing.JLabel();
        btnBackP = new javax.swing.JButton();
        btnnextP = new javax.swing.JButton();
        btnVolumeDown = new javax.swing.JButton();
        btnVolumeUp = new javax.swing.JButton();
        panelRound1 = new Utils_Pro.PanelRound();
        lbl1 = new javax.swing.JLabel();
        panelRound2 = new Utils_Pro.PanelRound();
        lbl2 = new javax.swing.JLabel();
        panelRound3 = new Utils_Pro.PanelRound();
        lbl3 = new javax.swing.JLabel();
        panelRound4 = new Utils_Pro.PanelRound();
        lbl4 = new javax.swing.JLabel();
        panelRound5 = new Utils_Pro.PanelRound();
        lbl5 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(805, 527));

        jPanel1.setBackground(new java.awt.Color(29, 34, 56));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("New Songs");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Played");

        tbl.setBackground(new java.awt.Color(29, 34, 56));
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nhac", "Tac gia", "Thoi luong"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/back.png"))); // NOI18N
        lblBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });

        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/next.png"))); // NOI18N
        lblNext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });

        lblvideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Songs/aka.gif"))); // NOI18N

        LPThanhNhac.setBackground(new java.awt.Color(37, 44, 70));
        LPThanhNhac.setEnabled(false);

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
        btnLoop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoopActionPerformed(evt);
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

        javax.swing.GroupLayout LPThanhNhacLayout = new javax.swing.GroupLayout(LPThanhNhac);
        LPThanhNhac.setLayout(LPThanhNhacLayout);
        LPThanhNhacLayout.setHorizontalGroup(
            LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAnhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNameMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNguoiHat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LPThanhNhacLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btnLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBackP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblresume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpause))
                        .addGap(7, 7, 7)
                        .addComponent(btnnextP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShuffle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LPThanhNhacLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(thanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolumeDown, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolumeUp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        LPThanhNhacLayout.setVerticalGroup(
            LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LPThanhNhacLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblNameMusic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNguoiHat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LPThanhNhacLayout.createSequentialGroup()
                        .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LPThanhNhacLayout.createSequentialGroup()
                                        .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                                                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblresume, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblpause)
                                                    .addComponent(btnBackP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnShuffle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnnextP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(8, 8, 8))
                                            .addGroup(LPThanhNhacLayout.createSequentialGroup()
                                                .addComponent(btnLoop, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addComponent(thanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblAnhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LPThanhNhacLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(LPThanhNhacLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnVolumeDown, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnVolumeUp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelRound1.setBackground(new java.awt.Color(29, 34, 56));
        panelRound1.setRoundBottomLeft(30);
        panelRound1.setRoundBottomRight(30);
        panelRound1.setRoundTopLeft(30);
        panelRound1.setRoundTopRight(30);

        lbl1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/image1.png"))); // NOI18N
        lbl1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound2.setBackground(new java.awt.Color(29, 34, 56));
        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);

        lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/image2.png"))); // NOI18N
        lbl2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound3.setBackground(new java.awt.Color(29, 34, 56));
        panelRound3.setRoundBottomLeft(30);
        panelRound3.setRoundBottomRight(30);
        panelRound3.setRoundTopLeft(30);
        panelRound3.setRoundTopRight(30);

        lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/image5.png"))); // NOI18N
        lbl3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound4.setBackground(new java.awt.Color(29, 34, 56));
        panelRound4.setRoundBottomLeft(30);
        panelRound4.setRoundBottomRight(30);
        panelRound4.setRoundTopLeft(30);
        panelRound4.setRoundTopRight(30);

        lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/image3.png"))); // NOI18N
        lbl4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound5.setBackground(new java.awt.Color(29, 34, 56));
        panelRound5.setRoundBottomLeft(30);
        panelRound5.setRoundBottomRight(30);
        panelRound5.setRoundTopLeft(30);
        panelRound5.setRoundTopRight(30);

        lbl5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/image4.png"))); // NOI18N
        lbl5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LPThanhNhac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNext)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(slideshow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(panelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(slideshow1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblNext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(panelRound2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelRound5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblvideo, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(LPThanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        slideshow1.back();
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        slideshow1.next();
    }//GEN-LAST:event_lblNextMouseClicked

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        tbl.setDefaultEditor(Object.class, null);
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
    }//GEN-LAST:event_tblMouseClicked

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

    private void btnBackPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackPMouseReleased
        try {
            previous();
        } catch (JavaLayerException ex) {
            Logger.getLogger(JPanelQlyNhac.class.getName()).log(Level.SEVERE, null, ex);
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

    private void btnLoopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoopActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel LPThanhNhac;
    private javax.swing.JButton btnBackP;
    private javax.swing.JButton btnLoop;
    private javax.swing.JButton btnShuffle;
    private javax.swing.JButton btnVolumeDown;
    private javax.swing.JButton btnVolumeUp;
    private javax.swing.JButton btnnextP;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    public Utils_Pro.ImageAvatar lblAnhNhac;
    private javax.swing.JLabel lblBack;
    public javax.swing.JLabel lblNameMusic;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblNguoiHat;
    public javax.swing.JLabel lblpause;
    public javax.swing.JLabel lblresume;
    private javax.swing.JLabel lblvideo;
    private Utils_Pro.PanelRound panelRound1;
    private Utils_Pro.PanelRound panelRound2;
    private Utils_Pro.PanelRound panelRound3;
    private Utils_Pro.PanelRound panelRound4;
    private Utils_Pro.PanelRound panelRound5;
    private ClassSlideShow.Slideshow slideshow1;
    private CustomTable.TableDark tbl;
    public Utils_Pro.ThanhNhac thanhNhac;
    // End of variables declaration//GEN-END:variables
    int i = -1;
    SongDAO dao = new SongDAO();
   

    private void init() {
        initTable();
        fillTable();
        lblpause.setVisible(false);
        lblpause.setEnabled(false);
        lblresume.setVisible(true);
        lblresume.setEnabled(true);
        if (!this.isVisible()) {
            this.disable();
        }
    }

    void initTable() {
        DefaultTableModel tblmodel = (DefaultTableModel) tbl.getModel();
        String[] cols = new String[]{"Mã bài hát", "Tên bài hát", "Người trình bày", "Ngày tạo"};
        tblmodel.setColumnIdentifiers(cols);
    }

    public void fillTable() {
        DefaultTableModel tblModel = (DefaultTableModel) tbl.getModel();
        tblModel.setRowCount(0);
        try {
            List<Song> list = dao.selectAll(); //Đọc dữ liệu từ csdl
            for (Song s : list) {
                Object[] rows = {s.getMabh(), s.getTenbh(), s.getNguoitb(), s.getNgaytao()};
                tblModel.addRow(rows);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
        }
    }
//
//    public ImageIcon ResizeImage(String path) {
//        ImageIcon imageIcon = new ImageIcon(path);
//        Image img = imageIcon.getImage();
//        Image new_img = img.getScaledInstance(lbl1.getWidth(), lbl1.getHeight(), Image.SCALE_SMOOTH);
//        ImageIcon imageIcon2 = new ImageIcon(new_img);
//        return imageIcon2;
//    }

  
    UserSongDAO usdao = new UserSongDAO();

    UserSong getForm() {
        UserSong us = new UserSong();
        i = tbl.getSelectedRow();
        String mabh = (String) tbl.getValueAt(i, 0);
        us.setMabh(mabh);
        return us;
    }
    //thanh nhạc
    public int dung;
    public Player player;
    public long pause;
    public long total_length;
    public FileInputStream fis;
    public BufferedInputStream bis;
    File musicPath = null;
    int play = 0;
    int loop = 0;
    int sf = 0;
    Timer time;

    void playNhac() throws FileNotFoundException, JavaLayerException, IOException {
        if (play == 0) {
            i = tbl.getSelectedRow();
            String mabh = (String) tbl.getValueAt(i, 0);
            Song s = dao.selectById(mabh);

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
            lblNguoiHat.setText(s.getNguoitb());
            lblNameMusic.setText(s.getTenbh());
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
        try (FileInputStream fis = new FileInputStream(XMusic.readPath(s.getMusicpath()))) {
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
                int s1 = tbl.getSelectedRow() - 1;
                String mabh = (String) tbl.getValueAt(s1, 0);
                Song s = dao.selectById(mabh);
                fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
                bis = new BufferedInputStream(fis);
                player = new javazoom.jl.player.Player(bis);
                play = 1;
                //lấy ảnh nhạc
                lblNguoiHat.setText(s.getNguoitb());
                if (s.getAnh() != null) {
                    lblAnhNhac.setImage(XImage.read(s.getAnh()));
                }
                //tên bài nhạc
                lblNameMusic.setText(s.getTenbh());
                //Tốc độ nhạc
                tbl.setRowSelectionInterval(s1, s1);
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
                int s1 = tbl.getSelectedRow() + 1;
                String mabh = (String) tbl.getValueAt(s1, 0);
                Song s = dao.selectById(mabh);
                fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
                bis = new BufferedInputStream(fis);
                player = new javazoom.jl.player.Player(bis);
                play = 1;
                //lấy ảnh nhạc
                lblNguoiHat.setText(s.getNguoitb());
                if (s.getAnh() != null) {
                    lblAnhNhac.setImage(XImage.read(s.getAnh()));
                }
                //tên bài nhạc
                lblNameMusic.setText(s.getTenbh());
                //Tốc độ nhạc
                tbl.setRowSelectionInterval(s1, s1);
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
            int random = rd.nextInt(tbl.getRowCount()) + 1;
            String mabh = (String) tbl.getValueAt(random, 0);
            Song s = dao.selectById(mabh);
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
            tbl.setRowSelectionInterval(random, random);
            //Tốc độ nhạc
            try (FileInputStream fis = new FileInputStream(XMusic.readPath(s.getMusicpath()))) {
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

    //âm thanh
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
