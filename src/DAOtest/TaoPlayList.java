package DAOtest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.PlaylistDAO;
import DAO.PlaylistSongDAO;
import Entity.PlayList;
import Entity.PlaylistSong;

public class TaoPlayList {
	private PlayList Playlist;
	private PlaylistDAO playListDAO;

	@Before
	public void setUp() throws Exception {

		Playlist = new PlayList();
		playListDAO = new PlaylistDAO();
	}

	@After
	public void tearDown() throws Exception {

		Playlist = null;
		playListDAO = null;
	}

	@Test
	public void test() {
		try {
			Playlist.setMatk(0);
			Playlist.setTieude("");		
			Playlist.setCounts(1);
			Playlist.setHinh(null);
			Playlist.setDescriptions("Nhien");
			Playlist.setNgaytao(new Date());

			boolean result = playListDAO.themPlayList(Playlist);

			assertEquals(false, result);
		}catch (Exception e) {
			fail("Sai Một Số Nội Dung");
		}
	

	}

}
