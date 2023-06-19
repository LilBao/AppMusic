/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.User;
import Entity.UserSong;
import Utils_Pro.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UserSongDAO extends MusicDAO<UserSong, String>{
    String SELECT_BY_ID_SQL = "SELECT * FROM USER_SONG WHERE mabh = ?";
    String UPDATE_SQL = "UPDATE USER_SONG SET playcount = ? +1 WHERE mabh = ?";
    
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<Object[]> getTop10() {
        String sql = "{CALL sp_Top10Nhac}";
        String[] cols = {"mabh","tenbh", "nguoitb", "playcount", "ngaytao"};
        return this.getListOfArray(sql, cols);
    }

    @Override
    public void insert(UserSong entity) {
    }

    @Override
    public void update(UserSong entity) {
        XJdbc.update(UPDATE_SQL, entity.getPlaycount(),entity.getMabh());
    }

    @Override
    public void delete(String key) {
    }

    @Override
    public List<UserSong> selectAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UserSong selectById(String key) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    protected List<UserSong> selectBySql(String sql, Object... args) {
        List<UserSong> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                UserSong entity = new UserSong();
                entity.setMatk(rs.getInt("matk"));
                entity.setMabh(rs.getString("mabh"));
                entity.setPlaycount(rs.getInt("playcount"));
                entity.setNgaytao(rs.getDate("ngaytao"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
