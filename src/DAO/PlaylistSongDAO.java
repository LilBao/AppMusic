/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.PlaylistSong;
import Entity.Song;
import Utils_Pro.XJdbc;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author NAM PC
 */
public class PlaylistSongDAO extends MusicDAO<PlaylistSong, String> {

    @Override
    public void insert(PlaylistSong entity) {
        String sql = "INSERT INTO PLAYLIST_SONG (maplaylist,mabh) VALUES(?,?)";
        XJdbc.update(sql, entity.getMaplaylist(),
                entity.getMabh());
    }

    @Override
    public void update(PlaylistSong entity) {

    }

    @Override
    public void delete(String key) {
        String sql = "DELETE FROM PLAYLIST_SONG WHERE trackno =?";
        XJdbc.update(sql, key);
    }

    public void delete_mabh(String mabh, Integer maplaylist) {
        String sql = "DELETE FROM PLAYLIST_SONG WHERE mabh like ? and maplaylist = ?";
        XJdbc.update(sql, mabh,maplaylist);
    }

    @Override
    public List<PlaylistSong> selectAll() {
        String sql = "SELECT * FROM PLAYLIST_SONG";
        return this.selectBySql(sql);
    }

    public List<PlaylistSong> selectByTrackno(int trackno) {
        String sql = "SELECT * FROM PLAYLIST_SONG WHERE trackno =?";
        return this.selectBySql(sql, trackno);
    }

    public List<PlaylistSong> selectAll2() {
        String sql = "select tenbh,theloai,nguoist,nguoitb \n"
                + "from PLAYLIST_SONG inner join SONG on PLAYLIST_SONG.mabh = SONG.mabh";
        return this.selectBySql(sql);
    }

    @Override
    public PlaylistSong selectById(String key) {
        String sql = "SELECT * FROM PLAYLIST_SONG WHERE maplaylist = ?";
        List<PlaylistSong> list = this.selectBySql(sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public PlaylistSong selectById2(String key) {
        String sql = "SELECT tenbh,theloai,nguoist,nguoitb  FROM PLAYLIST_SONG\n"
                + "inner join SONG on PLAYLIST_SONG.mabh = SONG.mabh \n"
                + "WHERE maplaylist = ?";
        List<PlaylistSong> list = this.selectBySql(sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public PlaylistSong selectBy_track(Integer key) {
        String sql = "SELECT * FROM PLAYLIST WHERE trackno = ?";
        List<PlaylistSong> list = this.selectBySql(sql, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<PlaylistSong> selectBySql(String sql, Object... args) {
        List<PlaylistSong> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                PlaylistSong entity = new PlaylistSong();
                entity.setMabh(rs.getString("mabh"));
                entity.setTenbh(rs.getString("tenbh"));
                entity.setTheloai(rs.getString("theloai"));
                entity.setNguoist(rs.getString("nguoist"));
                entity.setNguoitb(rs.getString("nguoitb"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    protected List<Song> selectBySql2(String sql, Object... args) {
//        List<Song> list = new ArrayList<>();
//        try {
//            ResultSet rs = XJdbc.query(sql, args);
//            while (rs.next()) {
//                Song entity = new Song();
//                entity.setTrackno(rs.getInt("trackno"));
//                entity.setMaplaylist(rs.getInt("maplaylist"));
//                entity.setMabh(rs.getString("counts"));
//                list.add(entity);
//            }
//            rs.getStatement().getConnection().close();
//            return list;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
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

    public List<Object[]> getFillPlaylist(Integer matk, Integer Count) {
        String sql = "{CALL sp_fillPlaylistUser (?,?)}";
        String[] cols = {"mabh", "tenbh", "theloai", "nguoist", "nguoitb"};
        return this.getListOfArray(sql, cols, matk,Count);
    }

    protected List<PlaylistSong> selectByPlaylistUser(String sql, Object... args) {
        List<PlaylistSong> list = new ArrayList<>();
        try {
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                PlaylistSong entity = new PlaylistSong();
      
                entity.setMaplaylist(rs.getInt(1));
                entity.setMabh(rs.getString(2));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean addList(int maplaylist, String mabh) {
		 PlaylistSong entity = new PlaylistSong();
	   if(maplaylist == 0 ||mabh.equals("")) {
		   return false;
	   }else {
		   entity.setMaplaylist(maplaylist);
		   entity.setMabh(mabh);
		   insert(entity);
		   return true;
	   }
	  
  }
	

	public boolean XoaSongList(int maplaylist, String mabh) {
		 PlaylistSong entity = new PlaylistSong();
	   if(maplaylist == 0 ||mabh.equals("")) {
		   return false;
	   }else {
		   entity.setMaplaylist(maplaylist);
		   entity.setMabh(mabh);
		   delete_mabh(entity.getMabh(), entity.getMaplaylist());
		   return true;
	   }
	  
 }

}
