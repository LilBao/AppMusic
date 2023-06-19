/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.PlaylistSong;
import Entity.Song;
import Utils_Pro.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class SongDAO extends MusicDAO<Song, String> {

    String INSERT_SQL = "INSERT INTO SONG (mabh, tenbh, theloai, nguoist, nguoitb, musicpath, anh, ngaytao) VALUES (?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE SONG SET tenbh = ?, theloai = ?, nguoist = ?, nguoitb =?,musicpath = ?, anh = ? WHERE mabh = ?";
    String DELETE_SQL = "DELETE FROM SONG WHERE mabh = ?";
    String SELECT_ALL_SQL = "SELECT * FROM SONG";
    String SELECT_TOP5 = "select top 5 * from song order by ngaytao desc";
    String SELECT_THELOAI = "SELECT DISTINCT theloai FROM SONG";//câu lệnh lọc thể loại
    String SELECT_BY_ID_SQL = "SELECT * FROM SONG WHERE mabh = ?";

    @Override
    public void insert(Song entity) {
        XJdbc.update(INSERT_SQL, entity.getMabh(), entity.getTenbh(), entity.getTheloai(),
                entity.getNguoist(), entity.getNguoitb(), entity.getMusicpath(), entity.getAnh(), entity.getNgaytao());
        
    }

    @Override
    public void update(Song entity) {
        XJdbc.update(UPDATE_SQL, entity.getTenbh(), entity.getTheloai(),
                entity.getNguoist(), entity.getNguoitb(), entity.getMusicpath(), entity.getAnh(), entity.getMabh());
    }

    @Override
    public void delete(String key) {
        XJdbc.update(DELETE_SQL, key);
    }

    @Override
    public List<Song> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    public List<Song> select_top5() {
        return this.selectBySql(SELECT_TOP5);
    }

    public List<Song> selectAll2() {
        String sql = "select tenbh,theloai,nguoist,nguoitb \n"
                + "from PLAYLIST_SONG inner join SONG on PLAYLIST_SONG.mabh = SONG.mabh";
        return this.selectBySql(sql);
    }

    public List<Song> selectByTrackno(String key) {
        String sql = "SELECT * FROM PLAYLIST_SONG WHERE mabh =?";
        return this.selectBySql(sql, key);
    }

    @Override
    public Song selectById(String key) {
        List<Song> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<Song> selectBySql(String sql, Object... args) {
        List<Song> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Song entity = new Song();
                entity.setMabh(rs.getString("mabh"));
                entity.setTenbh(rs.getString("tenbh"));
                entity.setTheloai(rs.getString("theloai"));
                entity.setNguoist(rs.getString("nguoist"));
                entity.setNguoitb(rs.getString("nguoitb"));
                entity.setMusicpath(rs.getString("musicpath"));
                entity.setAnh(rs.getString("anh"));
                entity.setNgaytao(rs.getDate("ngaytao"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Song> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM Song WHERE tenbh LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }

    public List<String> selectTheloai() {
        List<String> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(SELECT_THELOAI);
            while (rs.next()) {
                list.add(rs.getString("theloai"));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Song> selectByTheLoai(String TheLoai, String search) {
        String sql = "SELECT * FROM Song WHERE theloai LIKE ? and  tenbh LIKE ? ";
        return this.selectBySql(sql, "%" + TheLoai + "%", "%" + search + "%");
    }
}
