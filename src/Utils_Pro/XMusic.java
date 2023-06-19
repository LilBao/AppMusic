/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils_Pro;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author DELL
 */
public class XMusic {
    //lưu
    public static void save(File src) {
        File dst = new File("Songs", src.getName());
        if (!dst.getParentFile().exists()) {
            dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //Đọc địa chỉ ghi nhạc
    public static MP3Player read(String musicName) {
        File path = new File("Songs", musicName);
        String url= path.getAbsolutePath();
        return new MP3Player(new File(url));
    }
    
    //Đọc và trả về đường dẫn
    public static File readPath(String musicName) {
        File path = new File("Songs", musicName);    
        return new File(path.getAbsolutePath());
    }
}
