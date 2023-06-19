package test.DAOtest;


import DAO.PlaylistDAO;
import DAO.PlaylistSongDAO;
import DAO.SongDAO;
import Entity.PlayList;
import Entity.PlaylistSong;
import UI.PlaylistJDialog;
import Utils_Pro.Auth;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
	private PlaylistSongDAO playlistSongDAO;
	private PlaylistSong Playlist;

	@Before
	public void setUp() throws Exception {

		playlistSongDAO = new PlaylistSongDAO();
		Playlist = new PlaylistSong();
	}

	@After
	public void tearDown() throws Exception {
		playlistSongDAO = null;
		Playlist = null;
	}

	@Test
	public void test() {
		Playlist.setMaplaylist(49);
		Playlist.setMabh("HipHop1");
		
		boolean result = playlistSongDAO.addList(Playlist.getMaplaylist(), Playlist.getMabh());
		assertEquals(true, result);
	}
	
	@Test
	public void test2() {
		Playlist.setMaplaylist(49);
		Playlist.setMabh("");
		
		boolean result = playlistSongDAO.addList(Playlist.getMaplaylist(), Playlist.getMabh());
		assertEquals(false, result);
	}
	@Test
	public void test3() {
		Playlist.setMaplaylist(0);
		Playlist.setMabh("HipHop1");
		
		boolean result = playlistSongDAO.addList(Playlist.getMaplaylist(), Playlist.getMabh());
		assertEquals(false, result);
	}
	@Test
	public void test4() {
		Playlist.setMaplaylist(0);
		Playlist.setMabh("HipHop1");
		
		boolean result = playlistSongDAO.addList(Playlist.getMaplaylist(), Playlist.getMabh());
		assertEquals(false, result);
	}
	@Test
	public void ThemPlaylist() {
		Playlist.setMaplaylist(49);
		Playlist.setMabh("RAP8");
		
		boolean result = playlistSongDAO.XoaSongList(Playlist.getMaplaylist(), Playlist.getMabh());
		assertEquals(true, result);
	}
	@Test
	public void ThemPlaylist1() {
		Playlist.setMaplaylist(0);
		Playlist.setMabh("RAP8");
		
		boolean result = playlistSongDAO.XoaSongList(Playlist.getMaplaylist(), Playlist.getMabh());
		assertEquals(false, result);
	}
	@Test
	public void ThemPlaylist2() {
		Playlist.setMaplaylist(49);
		Playlist.setMabh("");
		
		boolean result = playlistSongDAO.XoaSongList(Playlist.getMaplaylist(), Playlist.getMabh());
		assertEquals(false, result);
	}
	
	
}
