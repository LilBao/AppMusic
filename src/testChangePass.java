
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import DAO.UserDAO;
import Entity.User;
import UI.ChangePassJDialog;
import UI.JFrameLogin;
import Utils_Pro.Auth;


public class testChangePass {
	@Test
	public void testChange() {
		User user = new User();
		UserDAO dao = new UserDAO();
		user.setMatk(1);
		user.setTennd("nam");
		user.setEmail("s@gmail.com");
		user.setMatkhau("123");
		boolean result = dao.changePass(user);
		assertEquals(true, result);
	}
	@Test
	public void testpass() {
		User user = new User();
		UserDAO dao = new UserDAO();
		dao.selectById("nam").getMatkhau();
		assertEquals("123", dao.selectById("nam").getMatkhau());		
	}
	@Test
	public void testss() {
		ChangePassJDialog change = new ChangePassJDialog(null, false);
		change.pwdconfirm.setText("123");
		change.pwdnew.setText("123");
		assertEquals(change.pwdconfirm.getText(),change.pwdnew.getText());
	}
	
}
