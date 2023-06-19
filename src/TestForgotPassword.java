import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import DAO.UserDAO;
import Entity.User;
import UI.ForgotPassJDialog;
import Utils_Pro.MsgBox;

public class TestForgotPassword {
	ForgotPassJDialog fg = new ForgotPassJDialog(null, false);
	UserDAO dao = new UserDAO();
	User us = new User();
	@Test
	public void tcGetCurrentPass() {
		// lấy mật khẩu của tài khoản vs username: bao
		String email = "g@gmail.com";
		us = dao.selectById3(email);
		assertEquals("123", us.getMatkhau());
	}

	// Email chưa đăng ký
	@Test
	public void tcSendPassFail() {
		fg.txtEmail.setText("chuaDangKy@gmail.com");
		fg.QuenMatKhau();
	}

	// Email thành công
	@Test
	public void tcSendPassSuccess() {
		fg.txtEmail.setText("g@gmail.com");
		fg.QuenMatKhau();
	}
}
