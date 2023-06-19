import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.text.SimpleDateFormat;

import org.junit.AfterClass;
import org.junit.Test;

import DAO.UserDAO;
import UI.SignUpJDialog;

public class TestNull{
	SignUpJDialog sn = new SignUpJDialog(null, false);
	UserDAO dao = new UserDAO();
		//bỏ trống
//		@Test
//		public void tcCheckNull() {
//			sn.txtUsername.setText("");
//			sn.txtPass.setText("");
//			sn.txtConfirm.setText("");
//			sn.txtEmail.setText("");
//			sn.txtNgaySinh.setText("");
//			assertFalse(sn.validated());
//		}
//		@Test
//		public void tcCheckSaiDinhDangNgay() {
//			sn.txtUsername.setText("lilbao");
//			sn.txtPass.setText("123123");
//			sn.txtConfirm.setText("123123");
//			sn.txtEmail.setText("bao@gmail.com");
//			sn.txtNgaySinh.setText("13112003");
//			assertFalse(sn.validated());
//		}
//		@Test
//		public void tcCheckSaiCf() {
//			sn.txtUsername.setText("lilbao");
//			sn.txtPass.setText("123123");
//			sn.txtConfirm.setText("564");
//			sn.txtEmail.setText("bao@gmail.com");
//			sn.txtNgaySinh.setText("13-11-2003");
//			assertFalse(sn.validated());
//		}
//		@Test
//		public void tcCheckDinhDangMail() {
//			sn.txtUsername.setText("lilbao");
//			sn.txtPass.setText("123123");
//			sn.txtConfirm.setText("564");
//			sn.txtEmail.setText("baogmail.com");
//			sn.txtNgaySinh.setText("13-11-2003");
//			assertFalse(sn.validated());
//		}
		@Test
		public void tcDulicateUsername() {
			sn.clearForm();
			sn.txtUsername.setText("bao");
			sn.txtPass.setText("123123");
			sn.txtConfirm.setText("123123");
			sn.txtEmail.setText("bao@gmail.com");
			sn.txtNgaySinh.setText("13-11-2003");
			assertFalse(sn.validated());
		}
		
//		@Test
//		public void tcClear() {
//			sn.clearForm();
//			assertEquals("",sn.txtUsername.getText());
//		}
}
