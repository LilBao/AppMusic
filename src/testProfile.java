

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Frame;
import java.util.Date;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import DAO.UserDAO;
import Entity.User;
import UI.JFrameMusic;
import UI.ProfileJDialog;
import Utils_Pro.Auth;
import Utils_Pro.MsgBox;

public class testProfile {

	JFrameMusic jfm;
	ProfileJDialog prf;
	User user;
	UserDAO userDAO = new UserDAO();
	Auth auth;

	@Before
	public void init() {
		prf = new ProfileJDialog(jfm, true);
		List<User> list = new UserDAO().selectAll();
	}

	@After
	public void tearDown() {
		prf = null;
	}

	@Test
	public void testLoad() {
		String name = "namm";
		List<User> list = new UserDAO().selectByKeyword(name);
		assertNotNull(list);
	}

	@Test
	public void testUpdate() {
		String expected = "Cập nhật thành công";
		
		User user = userDAO.selectById("namm");
		assertEquals(user.getTennd(), "namm");
		user.setHinh("acb");
		try {
			userDAO.update(user);
			assertEquals("Cập nhật thành công", expected);
		} catch (Exception e) {
			Assert.fail("Update failed: " + e.getMessage());
		}

	}
}
