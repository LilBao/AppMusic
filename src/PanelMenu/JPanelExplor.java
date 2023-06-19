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
import UI.AddMusicJDiaglog;
import UI.JFrameMusic;
import Utils_Pro.Auth;
import Utils_Pro.MsgBox;
import Utils_Pro.XImage;
import Utils_Pro.XMusic;
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
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import swing.EventCallBack;
import swing.EventTextField;

/**
 *
 * @author MSII
 */
public class JPanelExplor extends javax.swing.JPanel {

    private String TL;

    public JPanelExplor() throws InterruptedException {
        initComponents();
        cosTomTable();
        search();
        init();

    }

    public void cosTomTable() {
        tblExplor.fixTable(jScrollPane1);
        tblExplor.setColumnAlignment(0, JLabel.CENTER);
        tblExplor.setCellAlignment(0, JLabel.CENTER);
        tblExplor.setColumnAlignment(2, JLabel.CENTER);
        tblExplor.setCellAlignment(2, JLabel.CENTER);
        tblExplor.setColumnAlignment(4, JLabel.RIGHT);
        tblExplor.setCellAlignment(4, JLabel.RIGHT);
        tblExplor.setColumnWidth(0, 50);
        tblExplor.setColumnWidth(2, 100);

    }

    void search() {
        txtSearch.addEvent(new EventTextField() {
            @Override
            public void onPressed(EventCallBack call) {
                String key;
                try {
                    for (int i = 1; i <= 50; i++) {

                        Thread.sleep(10);
                    }
                    fillTableExplor(TL);
                    call.done();
                } catch (Exception e) {
                    System.err.println(e);
                }
            }

            @Override
            public void onCancel() {

            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MnSieuTo = new javax.swing.JPopupMenu();
        MnAddPlayList = new javax.swing.JMenu();
        MnPlayList1 = new javax.swing.JMenuItem();
        MnPlayList2 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        Tabs = new CustomTable.TablePanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        panelRound2 = new Utils_Pro.PanelRound();
        V_Pop = new javax.swing.JLabel();
        panelRound3 = new Utils_Pro.PanelRound();
        RB = new javax.swing.JLabel();
        panelRound4 = new Utils_Pro.PanelRound();
        UsUk = new javax.swing.JLabel();
        panelRound5 = new Utils_Pro.PanelRound();
        Rap = new javax.swing.JLabel();
        panelRound6 = new Utils_Pro.PanelRound();
        Gaming = new javax.swing.JLabel();
        panelRound7 = new Utils_Pro.PanelRound();
        HipHop = new javax.swing.JLabel();
        panelRound8 = new Utils_Pro.PanelRound();
        Jazz = new javax.swing.JLabel();
        panelRound9 = new Utils_Pro.PanelRound();
        Sleep = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExplor = new CustomTable.TableDark();
        txtSearch = new swing.TextFieldAnimation();
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

        MnSieuTo.setBackground(new java.awt.Color(0, 153, 255));
        MnSieuTo.setPreferredSize(new java.awt.Dimension(150, 52));

        MnAddPlayList.setText("AddPlayList");
        MnAddPlayList.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MnAddPlayListItemStateChanged(evt);
            }
        });

        MnPlayList1.setText("PlayList 1");
        MnPlayList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPlayList1ActionPerformed(evt);
            }
        });
        MnAddPlayList.add(MnPlayList1);

        MnPlayList2.setText("PlayList 2");
        MnPlayList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnPlayList2ActionPerformed(evt);
            }
        });
        MnAddPlayList.add(MnPlayList2);

        MnSieuTo.add(MnAddPlayList);

        setBackground(new java.awt.Color(29, 34, 56));

        jPanel1.setBackground(new java.awt.Color(29, 34, 56));

        Tabs.setBackground(new java.awt.Color(204, 204, 204));
        Tabs.setForeground(new java.awt.Color(255, 255, 255));
        Tabs.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(29, 34, 56));

        jPanel7.setBackground(new java.awt.Color(29, 34, 56));

        panelRound2.setRoundBottomLeft(30);
        panelRound2.setRoundBottomRight(30);
        panelRound2.setRoundTopLeft(30);
        panelRound2.setRoundTopRight(30);

        V_Pop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_VPop.png"))); // NOI18N
        V_Pop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        V_Pop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                V_PopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound2Layout = new javax.swing.GroupLayout(panelRound2);
        panelRound2.setLayout(panelRound2Layout);
        panelRound2Layout.setHorizontalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(V_Pop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound2Layout.setVerticalGroup(
            panelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(V_Pop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound3.setRoundBottomLeft(30);
        panelRound3.setRoundBottomRight(30);
        panelRound3.setRoundTopLeft(30);
        panelRound3.setRoundTopRight(30);

        RB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_Praty.png"))); // NOI18N
        RB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RBMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound3Layout = new javax.swing.GroupLayout(panelRound3);
        panelRound3.setLayout(panelRound3Layout);
        panelRound3Layout.setHorizontalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RB, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
        );
        panelRound3Layout.setVerticalGroup(
            panelRound3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound4.setRoundBottomLeft(30);
        panelRound4.setRoundBottomRight(30);
        panelRound4.setRoundTopLeft(30);
        panelRound4.setRoundTopRight(30);

        UsUk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_USUK.png"))); // NOI18N
        UsUk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UsUk.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                UsUkAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        UsUk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsUkMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound4Layout = new javax.swing.GroupLayout(panelRound4);
        panelRound4.setLayout(panelRound4Layout);
        panelRound4Layout.setHorizontalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsUk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound4Layout.setVerticalGroup(
            panelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(UsUk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound5.setRoundBottomLeft(30);
        panelRound5.setRoundBottomRight(30);
        panelRound5.setRoundTopLeft(30);
        panelRound5.setRoundTopRight(30);

        Rap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_RapHip.png"))); // NOI18N
        Rap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RapMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound5Layout = new javax.swing.GroupLayout(panelRound5);
        panelRound5.setLayout(panelRound5Layout);
        panelRound5Layout.setHorizontalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound5Layout.setVerticalGroup(
            panelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound6.setRoundBottomLeft(30);
        panelRound6.setRoundBottomRight(30);
        panelRound6.setRoundTopLeft(30);
        panelRound6.setRoundTopRight(30);

        Gaming.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_Game.png"))); // NOI18N
        Gaming.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Gaming.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GamingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound6Layout = new javax.swing.GroupLayout(panelRound6);
        panelRound6.setLayout(panelRound6Layout);
        panelRound6Layout.setHorizontalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Gaming, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound6Layout.setVerticalGroup(
            panelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Gaming, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound7.setRoundBottomLeft(30);
        panelRound7.setRoundBottomRight(30);
        panelRound7.setRoundTopLeft(30);
        panelRound7.setRoundTopRight(30);

        HipHop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_RapHop.png"))); // NOI18N
        HipHop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HipHop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HipHopMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound7Layout = new javax.swing.GroupLayout(panelRound7);
        panelRound7.setLayout(panelRound7Layout);
        panelRound7Layout.setHorizontalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HipHop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound7Layout.setVerticalGroup(
            panelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HipHop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound8.setRoundBottomLeft(30);
        panelRound8.setRoundBottomRight(30);
        panelRound8.setRoundTopLeft(30);
        panelRound8.setRoundTopRight(30);

        Jazz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_Jazz.png"))); // NOI18N
        Jazz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Jazz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JazzMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound8Layout = new javax.swing.GroupLayout(panelRound8);
        panelRound8.setLayout(panelRound8Layout);
        panelRound8Layout.setHorizontalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jazz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound8Layout.setVerticalGroup(
            panelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jazz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelRound9.setRoundBottomLeft(30);
        panelRound9.setRoundBottomRight(30);
        panelRound9.setRoundTopLeft(30);
        panelRound9.setRoundTopRight(30);

        Sleep.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Nhac_Sleep.png"))); // NOI18N
        Sleep.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sleep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SleepMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRound9Layout = new javax.swing.GroupLayout(panelRound9);
        panelRound9.setLayout(panelRound9Layout);
        panelRound9Layout.setHorizontalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sleep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelRound9Layout.setVerticalGroup(
            panelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Sleep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelRound9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 99, Short.MAX_VALUE))
        );

        Tabs.addTab("Thể Loại", jPanel6);

        jPanel8.setBackground(new java.awt.Color(29, 34, 56));

        jPanel9.setBackground(new java.awt.Color(29, 34, 56));

        tblExplor.setBackground(new java.awt.Color(29, 34, 56));
        tblExplor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên", "Mật Khẩu", "Email", "Ngày Sinh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblExplor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExplorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblExplor);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(LPThanhNhac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(LPThanhNhac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Tabs.addTab("Nhạc", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Tabs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void V_PopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_V_PopMouseClicked
        TL = "V-pop";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_V_PopMouseClicked

    private void UsUkAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_UsUkAncestorAdded

    }//GEN-LAST:event_UsUkAncestorAdded

    private void UsUkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsUkMouseClicked
        TL = "USUK";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_UsUkMouseClicked

    private void RBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RBMouseClicked
        TL = "R&B";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_RBMouseClicked

    private void RapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RapMouseClicked
        TL = "RAP";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_RapMouseClicked

    private void HipHopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HipHopMouseClicked
        TL = "HipHop";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_HipHopMouseClicked

    private void JazzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JazzMouseClicked
        TL = "jazz";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_JazzMouseClicked

    private void SleepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SleepMouseClicked
        TL = "sleep";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_SleepMouseClicked

    private void GamingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GamingMouseClicked
        TL = "Gaming";
        fillTableExplor(TL);
        Tabs.setSelectedIndex(1);
    }//GEN-LAST:event_GamingMouseClicked

    private void tblExplorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExplorMouseClicked
        tblExplor.setComponentPopupMenu(MnSieuTo);
        if (evt.getClickCount() == 1) {
            i = tblExplor.getSelectedRow();
        } else {
            try {
                playNhac();
            } catch (JavaLayerException ex) {
                Logger.getLogger(JPanelQlyNhac.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(JPanelQlyNhac.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_tblExplorMouseClicked

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

    private void MnAddPlayListItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MnAddPlayListItemStateChanged

        showMnPlayList();
    }//GEN-LAST:event_MnAddPlayListItemStateChanged

    private void MnPlayList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPlayList1ActionPerformed
        index = 1;
        AddSongToPlayList();
    }//GEN-LAST:event_MnPlayList1ActionPerformed

    private void MnPlayList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnPlayList2ActionPerformed
        index = 2;
        AddSongToPlayList();
    }//GEN-LAST:event_MnPlayList2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gaming;
    private javax.swing.JLabel HipHop;
    private javax.swing.JLabel Jazz;
    public javax.swing.JPanel LPThanhNhac;
    private javax.swing.JMenu MnAddPlayList;
    private javax.swing.JMenuItem MnPlayList1;
    private javax.swing.JMenuItem MnPlayList2;
    private javax.swing.JPopupMenu MnSieuTo;
    private javax.swing.JLabel RB;
    private javax.swing.JLabel Rap;
    private javax.swing.JLabel Sleep;
    private CustomTable.TablePanel Tabs;
    private javax.swing.JLabel UsUk;
    private javax.swing.JLabel V_Pop;
    private javax.swing.JButton btnBackP;
    private javax.swing.JButton btnLoop;
    private javax.swing.JButton btnShuffle;
    private javax.swing.JButton btnVolumeDown;
    private javax.swing.JButton btnVolumeUp;
    private javax.swing.JButton btnnextP;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    public Utils_Pro.ImageAvatar lblAnhNhac;
    public javax.swing.JLabel lblNameMusic;
    private javax.swing.JLabel lblNguoiHat;
    public javax.swing.JLabel lblpause;
    public javax.swing.JLabel lblresume;
    private Utils_Pro.PanelRound panelRound2;
    private Utils_Pro.PanelRound panelRound3;
    private Utils_Pro.PanelRound panelRound4;
    private Utils_Pro.PanelRound panelRound5;
    private Utils_Pro.PanelRound panelRound6;
    private Utils_Pro.PanelRound panelRound7;
    private Utils_Pro.PanelRound panelRound8;
    private Utils_Pro.PanelRound panelRound9;
    private CustomTable.TableDark tblExplor;
    public Utils_Pro.ThanhNhac thanhNhac;
    private swing.TextFieldAnimation txtSearch;
    // End of variables declaration//GEN-END:variables

    SongDAO dao = new SongDAO();
    PlaylistDAO daoP = new PlaylistDAO();
    PlaylistSongDAO playlistSongDAO = new PlaylistSongDAO();
    JFrameMusic m = new JFrameMusic();
    int index = 0;

    void init() throws InterruptedException {
        initTable();
        fillTableExplor(TL);
        lblpause.setVisible(false);
        lblpause.setEnabled(false);
        lblresume.setVisible(true);
        lblresume.setEnabled(true);
        if (player != null) {
            if (Tabs.getSelectedIndex() == 0) {
                player.wait();
            }
        }
    }

    void initTable() {
        DefaultTableModel tblmodel = (DefaultTableModel) tblExplor.getModel();
        String[] cols = new String[]{"Mã bài hát", "Tên bài hát", "Thể loại", "Người sáng tác", "Người trình bày", "Ảnh", "Ngày tạo"};
        tblmodel.setColumnIdentifiers(cols);
    }

    void fillTableExplor(String keyWords) {
        DefaultTableModel tableModel = (DefaultTableModel) tblExplor.getModel();
        tableModel.setRowCount(0);
        String search = txtSearch.getText();
        try {
            List<Song> list = dao.selectByTheLoai(keyWords, search);

            for (Song s : list) {
                Object[] rows = {s.getMabh(), s.getTenbh(), s.getTheloai(), s.getNguoist(), s.getNguoitb(), s.getAnh(), s.getNgaytao()};
                tableModel.addRow(rows);
            }

        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi Truy Vấn Dữ Liệu");
        }

    }

    PlayList ListPlay = daoP.DemSoPlayList(Auth.user.getMatk());

    public void showMnPlayList() {

        List<PlayList> list = new ArrayList<>();
        list.add(ListPlay);
        for (PlayList p : list) {
            if (p.getCounts() == 0) {
                MnPlayList1.setVisible(false);
                MnPlayList2.setVisible(false);
            }
            if (p.getCounts() == 1) {
                MnPlayList1.setVisible(true);
                MnPlayList2.setVisible(false);
            }
            if (p.getCounts() == 2) {

                MnPlayList1.setVisible(true);
                MnPlayList2.setVisible(true);
            }
        }
    }

    void AddSongToPlayList() {
        List<PlayList> listSong = daoP.selectPlaylistUser(Auth.user.getMatk(), index);
        int row = tblExplor.getSelectedRow();

        for (PlayList ps : listSong) {
            PlaylistSong ls = new PlaylistSong();
//                    System.out.println(m.playList1);
//                    System.out.println(ps.getMaplaylist());
            ps.setMaplaylist(ps.getMaplaylist());
            ls.setMaplaylist(ps.getMaplaylist());
            ls.setMabh((String) tblExplor.getValueAt(row, 0));
            playlistSongDAO.insert(ls);
            break;
        }
        MsgBox.alert(this, "Đã Thêm Thành Công PlayList " + index);
        fillTableExplor(TL);
    }
    UserSongDAO usdao = new UserSongDAO();

    UserSong getForm() {
        UserSong us = new UserSong();
        i = tblExplor.getSelectedRow();
        String mabh = (String) tblExplor.getValueAt(i, 0);
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
            i = tblExplor.getSelectedRow();
            String mabh = (String) tblExplor.getValueAt(i, 0);
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
                int s1 = tblExplor.getSelectedRow() - 1;
                String mabh = (String) tblExplor.getValueAt(s1, 0);
                Song s = dao.selectById(mabh);
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
                tblExplor.setRowSelectionInterval(s1, s1);
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
                int s1 = tblExplor.getSelectedRow() + 1;
                String mabh = (String) tblExplor.getValueAt(s1, 0);
                Song s = dao.selectById(mabh);
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
                tblExplor.setRowSelectionInterval(s1, s1);
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
            int random = rd.nextInt(tblExplor.getRowCount()) + 1;
            String mabh = (String) tblExplor.getValueAt(random, 0);
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
            tblExplor.setRowSelectionInterval(random, random);
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
