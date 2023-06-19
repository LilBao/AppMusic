package DAOtest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import DAO.PlaylistSongDAO;
import DAO.UserDAO;
import Entity.PlaylistSong;
import Entity.User;

public class Dk {

	private UserDAO userDao;
	private User user;
	@Before
	public void setUp() throws Exception {
		user = new User();
		userDao = new UserDAO();
	
	}

	@After
	public void tearDown() throws Exception {
			
		userDao = null;
	}

	@Test
	public void dk() {
		try {
			user.setMatk(7);
			user.setTennd("ád"); 
			user.setMatkhau("123");
			user.setEmail("dat@gmal.com");
			user.setNgaysinh(new Date());
			user.setChucvu(false);
			user.setNgaytao(new Date());
			boolean x = userDao.themUser(user);
			assertEquals(true,x);
		} catch (Exception e) {
			fail("Throw Exception");
		}
		
		
	}
}
