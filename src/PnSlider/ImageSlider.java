package PnSlider;

import DAO.SongDAO;
import Entity.Song;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.miginfocom.swing.MigLayout;
import PnSlider_Scrollbar.ScrollBar;
import Utils_Pro.XImage;
import javax.swing.JOptionPane;

public class ImageSlider extends javax.swing.JPanel {

    private final MigLayout imageLayout;
    int i = -1;

    public ImageSlider() {
        initComponents();
        imageLayout = new MigLayout("al center, filly", "10[]10");
        panelItem.setLayout(imageLayout);
        ScrollBar sb = new ScrollBar();
        sb.setOrientation(ScrollBar.HORIZONTAL);
        sp.setHorizontalScrollBar(sb);
        testImage();
        showNewSong();
    }
    List<Object> list = new ArrayList<Object>();

    void showNewSong() {
        SongDAO dao = new SongDAO();
        List<Song> song = dao.select_top5();
        for (Song s : song) {
//            XImage.read(s.getAnh());
            panelItem.add(getItem(new ImageIcon(String.valueOf(XImage.read(s.getAnh())))), "w 150, h 130");
            System.out.println(s.getAnh());
        }
    }

    private void testImage() {
//        panelItem.add(getItem(new ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))), "w 150, h 130");
//        panelItem.add(getItem(new ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))), "w 150, h 130");
//        panelItem.add(getItem(new ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))), "w 150, h 130");
//        panelItem.add(getItem(new ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))), "w 150, h 130");
//        panelItem.add(getItem(new ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))), "w 150, h 130");
//        panelItem.add(getItem(new ImageIcon(getClass().getResource("/Icon/NewSong1.jpg"))), "w 150, h 130");
    }

    private ImageItem getItem(Icon icon) {
        return new ImageItem(icon, imageLayout);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sp = new javax.swing.JScrollPane();
        panelItem = new javax.swing.JPanel();

        sp.setBorder(null);
        sp.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        panelItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelItemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelItemLayout = new javax.swing.GroupLayout(panelItem);
        panelItem.setLayout(panelItemLayout);
        panelItemLayout.setHorizontalGroup(
            panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1171, Short.MAX_VALUE)
        );
        panelItemLayout.setVerticalGroup(
            panelItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 221, Short.MAX_VALUE)
        );

        sp.setViewportView(panelItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sp, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void panelItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelItemMouseClicked
        JOptionPane.showMessageDialog(this, "ád");

    }//GEN-LAST:event_panelItemMouseClicked

    @Override
    public void setBackground(Color color) {
        super.setBackground(color);
        if (panelItem != null) {
            panelItem.setBackground(color);
            sp.getHorizontalScrollBar().setBackground(color);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelItem;
    private javax.swing.JScrollPane sp;
    // End of variables declaration//GEN-END:variables
}
