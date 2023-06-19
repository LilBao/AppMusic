

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.UserDAO;
import Entity.User;
import PanelMenu.JPanelQlyAccount;
import Utils_Pro.Auth;
import Utils_Pro.MsgBox;

public class testUserManager {

	JPanelQlyAccount qlacc;
	UserDAO userDAO = new UserDAO();

	@Before
	public void init() {
		qlacc = new JPanelQlyAccount();
	}

	@After
	public void tearDown() {
		qlacc = null;
	}

	@Test
	public void testLoadTable() {
		List<User> list = new UserDAO().selectAll();
		assertTrue(list != null);
	}

	@Test
	public static void testFind() {
		String name = "nam";
		List<User> list = new UserDAO().selectByKeyword(name);

		if (list.size() <= 0) {
			list = null;
		}

		assertNotNull(list);
	}

	@Test
	public void testShowInf() {
		User user = userDAO.selectById("nam");

		assertEquals(user.getTennd(), "nam");
		assertNotNull(user);
	}

	@Test
	public void testDeleteForAdmin() {
		String tennd = "nam2";
		userDAO.delete(tennd);

		User user = userDAO.selectById("nam2");
		assertNull(user);
	}

}
