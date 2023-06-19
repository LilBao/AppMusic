import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import DAO.SongDAO;
import DAO.UserSongDAO;
import Entity.Song;
import PanelMenu.JPanelQlyNhac;
import Utils_Pro.XMusic;
import javazoom.jl.decoder.JavaLayerException;

public class TestThanhNhac {
	JPanelQlyNhac qln = new JPanelQlyNhac();
	SongDAO dao = new SongDAO();

	@After
	public void tearDown() {
		dao = null;
	}

	// Chạy được nhạc
	@Test
	public void tcRunMusic() throws FileNotFoundException, JavaLayerException {
		Song s = dao.selectById("GAMING4");
		qln.fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
		qln.bis = new BufferedInputStream(qln.fis);
		qln.player = new javazoom.jl.player.Player(qln.bis);
		qln.player.play();
	}
	//pause
//	@Test
//	public void tcPauseMusic() throws FileNotFoundException, JavaLayerException {
//		Song s = dao.selectById("GAMING4");
//		qln.fis = new FileInputStream(XMusic.readPath(s.getMusicpath()));
//		qln.bis = new BufferedInputStream(qln.fis);
//		qln.player = new javazoom.jl.player.Player(qln.bis);
//		qln.player.play();
//		qln.pause();
//	}
	// Gửi yêu cầu lặp lại bài hát
	@Test
	public void tsLoopTrue() {
		qln.loop = 0;
		qln.btnLoopMouseReleased(null);
		assertEquals(1, qln.loop);
	}

	// Gửi yêu cầu chọn nhạc random
	@Test
	public void tcShuffle() {
		qln.sf = 0;
		qln.btnShuffleMouseReleased(null);
		assertEquals(1, qln.sf);
	}

	// Lấy thông tin bài hát đúng chưa
	@Test
	public void tcI4() {
		Song s = dao.selectById("GAMING4");
		String expect = s.getTenbh();
		assertEquals("Enemy", expect);
	}

//	// Lặp lại bài hát thành công
//	@Test
//	public void tcDuration() {
//		qln.btnShuffleMouseReleased(null);
//		qln.btnLoopMouseReleased(null);
//		Song s = dao.selectById("GAMING4");
//		qln.duration(s);
//		assertEquals(0, 1);
//	}
//
//	// Test pause
//	@Test
//	public void tcPause() {
//
//	}
//
//	// Tăng âm lương
//	@Test
//	public void tcVolumeUp() {
//	}
}
