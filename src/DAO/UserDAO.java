/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.User;
import Utils_Pro.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class UserDAO extends MusicDAO<User, String> {
    
    String INSERT_SQL = "INSERT INTO USERS (tennd, matkhau, email, ngaysinh, chucvu, ngaytao) VALUES (?, ?, ?, ?, ?, ?)";
    String UPDATE_SQL = "UPDATE USERS SET matkhau = ?, email = ?, ngaysinh = ?, ngaytao= ? WHERE tennd = ?";
    String UPDATE_SQL2 = "UPDATE USERS SET hinh =?, email =?, ngaysinh =? WHERE tennd = ?";
    String DELETE_SQL = "DELETE FROM USERS WHERE tennd= ?";
    String SELECT_ALL_SQL = "SELECT * FROM USERS";
    String SELECT_BY_ID_SQL = "SELECT * FROM USERS WHERE tennd = ?";
    //lệnh sql để đăng nhập bằng tên tài khoản or email
    String SELECT_BY_IDMAIL_SQL = "SELECT * FROM USERS WHERE tennd = ? or email =?";
    //Lệnh sql để lấy mật khẩu
    String SELECT_BY_FGPASS_SQL = "SELECT * FROM USERS WHERE email = ?";
    
    @Override
    public void insert(User entity) {
        XJdbc.update(INSERT_SQL, entity.getTennd(), entity.getMatkhau(), entity.getEmail(), entity.getNgaysinh(), entity.isChucvu(), entity.getNgaytao());
    }
    
    @Override
    public void update(User entity) {
        XJdbc.update(UPDATE_SQL, entity.getMatkhau(), entity.getEmail(), entity.getNgaysinh(), entity.getNgaytao(), entity.getTennd());
    }
    
    public void update2(User entity) {
        String sql = "UPDATE USERS SET email =?, ngaysinh =?, hinh =? WHERE tennd =?";
        XJdbc.update(sql,
                entity.getEmail(),
                entity.getNgaysinh(),
                entity.getHinh(),
                entity.getTennd());
    }
    
    @Override
    public void delete(String key) {
        XJdbc.update(DELETE_SQL, key);
    }
    
    @Override
    public List<User> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }
    
    @Override
    public User selectById(String key) {
        List<User> list = this.selectBySql(SELECT_BY_ID_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public User selectById2(String key, String key2) {
        List<User> list = this.selectBySql(SELECT_BY_IDMAIL_SQL, key, key2);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    public User selectById3(String key) {
        List<User> list = this.selectBySql(SELECT_BY_FGPASS_SQL, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
    
    @Override
    protected List<User> selectBySql(String sql, Object... args) {
        List<User> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                User entity = new User();
                entity.setMatk(rs.getInt("matk"));
                entity.setTennd(rs.getString("tennd"));
                entity.setMatkhau(rs.getString("matkhau"));
                entity.setEmail(rs.getString("email"));
                entity.setNgaysinh(rs.getDate("ngaysinh"));
                entity.setChucvu(rs.getBoolean("chucvu"));
                entity.setNgaytao(rs.getDate("ngaytao"));
                entity.setHinh(rs.getString("hinh"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<User> selectByKeyword(String keyword) {
        String sql = "SELECT * FROM USERS WHERE tennd LIKE ?";
        return this.selectBySql(sql, "%" + keyword + "%");
    }
    
    public boolean changePass(User user) {
    	if(user.getMatk()== 1) {
    		return false;
    	}else {
    		update(user);
    		return true;
    	}
    }
    public boolean themUser(User user) {
    	if(user.getMatk() == 0 || user.getTennd().equals("")) {
    		return false;
    	}else {
    		insert(user);
 		   return true;
    	}		   	   	  
 }

}
