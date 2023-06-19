
import static org.junit.Assert.assertNotNull;

import DAO.UserDAO;
import Entity.User;
import UI.JFrameLogin;
import Utils_Pro.Auth;

public class loginTest {
    @org.junit.Test
    public void testDangNhapThanhCong() {
        // Tạo đối tượng dao và set up các giá trị cần thiết
        UserDAO dao = new UserDAO();
        String tennd = "nam";
        String email = "s@gmail.com";
        String matkhau = "123";
        dao.insert(new User(0, tennd, email, matkhau, null, false, null, matkhau));

        // Tạo đối tượng JFrameLogin và set up các giá trị cần thiết
        JFrameLogin frame = new JFrameLogin();
        frame.txtUsername.setText(tennd);
        frame.txtPassword.setText(matkhau);

        // Gọi phương thức dangNhap()
        frame.dangNhap();

        // Kiểm tra kết quả
        assertNotNull(Auth.user);
    }

}
