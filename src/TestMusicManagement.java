import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import DAO.SongDAO;
import Entity.Song;
import PanelMenu.JPanelQlyNhac;
import UI.AddMusicJDiaglog;
import Utils_Pro.XImage;

public class TestMusicManagement extends JPanelQlyNhac {
	SongDAO dao = new SongDAO();
	static Song song = new Song();
	AddMusicJDiaglog addMS = new AddMusicJDiaglog();

	@Before
	public void setForm() {
		song.setMabh("MS1");
		song.setTenbh("bbb");
		song.setTheloai("hiphop");
		song.setNguoist("nam");
		song.setNguoitb("nam");
		song.setMusicpath("taivisao.mp3");
		song.setAnh("kiemthu.jpg");
		song.setNgaytao(new Date());
	}

	@Test
	public void tcAddMusic() {
		String mabh = "MS156";
		String tenbh = "abc";
		String theloai = "rap";
		String nguoist = "bao";
		String nguoitb = "bao";
		String anh = "";
		String musicpath = "";
		song = new Song(mabh, tenbh, theloai, nguoist, nguoitb, musicpath, anh, new Date());
		dao.insert(song);
		assertNotNull(dao.selectById(mabh));
	}

	// Check xem update duoc k
	@Test
	public void tcUpdateMusic() {
		Song song = new Song();
		song.setMabh("MS123");
		song.setTenbh("ccc");
		song.setTheloai("hiphop");
		song.setNguoist("nam");
		song.setNguoitb("nam");
		song.setMusicpath("taivisao.mp3");
		song.setAnh("kiemthu.jpg");
		song.setNgaytao(new Date());
		dao.update(song);
		Song check = dao.selectById("MS123");
		assertEquals("ccc", check.getTenbh());
	}

	// Check xóa thành công
	@Test
	public void tcDeleteMusic() {
		String maBH = "MS1";
		dao.delete(maBH);
		assertNull(dao.selectById(maBH));
	}

	// Thao tác sửa vs delete khi mã bài hát không có trong csdl
	@Test
	public void tcGetI4Fail() {
		String maBH = "MS1";
		assertNull(dao.selectById(maBH));
	}

	// Tìm kiếm nhạc theo mabh có kết quả
	@Test
	public void tcSearchMusicByMaBH() {
		String key = "MS1";
		assertNotNull(dao.selectByKeyword(key));
	}
	@Test
	public void tcSearchMusicByMaBHFail() {
		String key = "zzzz";
		assertEquals(0,dao.selectByKeyword(key).size());
	}

	// Kiểm tra có load đủ top 5 bai hat có lượt nghe cao nhất không
	@Test
	public void tcTop5() {
		assertEquals(5, dao.select_top5().size());
	}

	// Kiểm tra bỏ trống thông tin với function isValidate
	@Test
	public void tcNull() {
		addMS.txtMaBH.setText("");
		addMS.txtTenBH.setText("");
		addMS.cboTheLoai.setSelectedItem("");
		addMS.txtNguoiST.setText("");
		addMS.txtNguoiTB.setText("");
		addMS.txtLink.setText("");
		assertFalse(addMS.isValidate());
	}

	// Kiểm tra trùng mã bài hát
	@Test
	public void tcAddFail() {
		addMS.count = -1; // biến count này dùng để check xem admin có thêm mới hay không
		addMS.txtMaBH.setText("MS123");
		addMS.txtTenBH.setText("ttt");
		addMS.cboTheLoai.setSelectedItem("usuk");
		addMS.txtNguoiST.setText("vanbao");
		addMS.txtNguoiTB.setText("vanbao");
		addMS.txtLink.setText("enemy.mp3");
		assertFalse(addMS.isValidate());
	}

	// Kiểm tra khi nhân reset form khi thêm mới bài hát
	@Test
	public void tcReset() {
		addMS.clearForm();
		assertEquals("", addMS.txtMaBH.getText());
	}

	// Kiểm tra xem combobox thể loại có được load thể loại không
	@Test
	public void tcFillComboboxTheLoai() {
		assertNotNull(dao.selectTheloai());
		assertNotEquals(-1, addMS.cboTheLoai.getSelectedIndex());
	}
}
