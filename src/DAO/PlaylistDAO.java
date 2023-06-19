/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Entity.PlayList;
import Entity.PlaylistSong;
import Utils_Pro.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NAM PC
 */
public class PlaylistDAO extends MusicDAO<PlayList, String> {

	@Override
	public void insert(PlayList entity) {
		String sql = "INSERT INTO PLAYLIST (matk, tieude, counts, hinh, descriptions, ngaytao) VALUES(?,?,?,?,?,?)";
		XJdbc.update(sql, entity.getMatk(), entity.getTieude(), entity.getCounts(), entity.getHinh(),
				entity.getDescriptions(), entity.getNgaytao());
	}

	@Override
	public void update(PlayList entity) {
		String sql = "UPDATE PLAYLIST SET tieude = ?, hinh = ?, descriptions = ? WHERE maplaylist = ? and counts = ?";
		XJdbc.update(sql, entity.getTieude(), entity.getHinh(), entity.getDescriptions(), entity.getMaplaylist(),
				entity.getCounts());
	}

	public void updateCount(PlayList entity) {
		String sql = "UPDATE PLAYLIST SET counts =? WHERE maplaylist =?";
		XJdbc.update(sql, entity.getCounts(), entity.getMaplaylist());
	}

	@Override
	public void delete(String key) {
		String sql = "DELETE FROM PLAYLIST WHERE maplaylist =?";
		XJdbc.update(sql, key);
	}

	@Override
	public List<PlayList> selectAll() {
		String sql = "SELECT * FROM PLAYLIST";
		return this.selectBySql(sql);
	}

	@Override
	public PlayList selectById(String key) {
		String sql = "SELECT * FROM PLAYLIST WHERE maplaylist = ?";
		List<PlayList> list = this.selectBySql(sql, key);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	public List<PlayList> selectById_matk(Integer key) {
		String sql = "SELECT * FROM PLAYLIST WHERE matk = ?";
		return this.selectBySql(sql, key);
	}

	public PlayList selectById2(Integer key) {
		String sql = "SELECT * FROM PLAYLIST WHERE matk = ?";
		List<PlayList> list = this.selectBySql(sql, key);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	@Override
	protected List<PlayList> selectBySql(String sql, Object... args) {
		List<PlayList> list = new ArrayList<>();
		try {
			ResultSet rs = XJdbc.query(sql, args);
			while (rs.next()) {
				PlayList entity = new PlayList();
				entity.setMaplaylist(rs.getInt("maplaylist"));
				entity.setMatk(rs.getInt("matk"));
				entity.setTieude(rs.getString("tieude"));
				entity.setCounts(rs.getInt("counts"));
				entity.setHinh(rs.getString("hinh"));
				entity.setDescriptions(rs.getString("descriptions"));
				entity.setNgaytao(rs.getDate("ngaytao"));
				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected List<PlayList> selectByDemPlayList(String sql, Object... args) {
		List<PlayList> list = new ArrayList<>();
		try {
			ResultSet rs = XJdbc.query(sql, args);
			while (rs.next()) {
				PlayList entity = new PlayList();
				entity.setCounts(rs.getInt(1));
				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected List<PlayList> selectBySoLuongPlayList(String sql, Object... args) {
		List<PlayList> list = new ArrayList<>();
		try {
			ResultSet rs = XJdbc.query(sql, args);
			while (rs.next()) {
				PlayList entity = new PlayList();
				entity.setCounts(rs.getInt(1));
				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected List<PlayList> selectByTieuDe(String sql, Object... args) {
		List<PlayList> list = new ArrayList<>();
		try {
			ResultSet rs = XJdbc.query(sql, args);
			while (rs.next()) {
				PlayList entity = new PlayList();
				entity.setCounts(rs.getInt(1));
				entity.setTieude(rs.getString(2));
				entity.setDescriptions(rs.getString(3));
				entity.setDescriptions(rs.getString(4));
				entity.setHinh(rs.getString(5));
				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public PlayList DemSoPlayList(Integer maTk) {
		String sql = "select COUNT(counts) from PLAYLIST inner join USERS on PLAYLIST.matk = USERS.matk where PLAYLIST.matk = ?";
		List<PlayList> list = this.selectByDemPlayList(sql, maTk);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);

	}

	public PlayList LayRaSoCounts(Integer maTk) {
		String sql = "select counts from PLAYLIST inner join USERS on PLAYLIST.matk = USERS.matk where PLAYLIST.matk = ?";
		List<PlayList> list = this.selectByDemPlayList(sql, maTk);
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);

	}

	public List<PlayList> SoPlayListDaTao(Integer maTk) {
		String sql = "select counts from PLAYLIST inner join USERS on PLAYLIST.matk = USERS.matk where PLAYLIST.matk = ?";
		return this.selectByDemPlayList(sql, maTk);

	}

	public List<PlayList> selectById_TieuDe(Integer key) {
		String sql = "select counts,tieude,descriptions,tennd,PLAYLIST.hinh from PLAYLIST inner join USERS on PLAYLIST.matk = USERS.matk where PLAYLIST.matk = ?";
		return this.selectByTieuDe(sql, key);
	}

	protected List<PlayList> selectByPlaylistUser(String sql, Object... args) {
		List<PlayList> list = new ArrayList<>();
		try {
			ResultSet rs = XJdbc.query(sql, args);
			while (rs.next()) {
				PlayList entity = new PlayList();
				entity.setMatk(rs.getInt(1));
				entity.setCounts(rs.getInt(2));
				entity.setMaplaylist(rs.getInt(3));

				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<PlayList> selectPlaylistUser(Integer matk, Integer count) {
		String sql = "select USERS.matk,counts,maplaylist from USERS inner join PLAYLIST on USERS.matk = PLAYLIST.matk\n"
				+ "               	where PLAYLIST.matk = ? and PLAYLIST.counts = ?";
		return this.selectByPlaylistUser(sql, matk, count);
	}

	protected List<PlayList> selectByMaPlaylist(String sql, Object... args) {
		List<PlayList> list = new ArrayList<>();
		try {
			ResultSet rs = XJdbc.query(sql, args);
			while (rs.next()) {
				PlayList entity = new PlayList();
				entity.setMaplaylist(rs.getInt(1));
				list.add(entity);
			}
			rs.getStatement().getConnection().close();
			return list;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public List<PlayList> selectMaplaylist(Integer count, Integer matk) {
		String sql = "	select  maplaylist from PLAYLIST where counts = ? and matk = ?";
		return this.selectByMaPlaylist(sql, count, matk);
	}

	public boolean themPlayList(PlayList pls) {

		if (pls.getTieude().equals("") || pls.getDescriptions().equals("")) {
			return false;
		}

		else {
			insert(pls);
			return true;
		}

	}
}
