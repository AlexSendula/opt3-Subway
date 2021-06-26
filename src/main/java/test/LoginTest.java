package test;

import com.subway.Login;
import com.subway.users.User;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    @Test
    public void TestLogin() {
        Login login = new Login();
        login.validateCredentials("user1", "123");
        assertTrue(User.getSessionStatus());
    }
}
