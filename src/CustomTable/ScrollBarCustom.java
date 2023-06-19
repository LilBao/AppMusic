package CustomTable;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {

    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(6,6)); // set width và height Thanh Cuộn dọc
        setForeground(new Color(192,192,192)); // Màu Thanh Cuộn dọc
        setBackground(new Color(38,45,71)); // Background màu Thanh Cuộn dọc
    }
}
