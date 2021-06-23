package test;

import com.subway.Login;
import com.subway.Shop;
import com.subway.User;
import org.junit.After;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class ShopTest {
    private final ByteArrayOutputStream outContent  = new ByteArrayOutputStream();
    private final PrintStream originalOut  = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent ));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void menuOption1() {
        Login login = new Login();
        login.validateCredentials("user1", "123");
        assertNotNull(User.getSessionStatus());
        Shop shop = new Shop();

        shop.sandwichSelection(1);
        String output = outContent.toString();
        assertEquals("Grabbing the Plain bread\n" +
                "Adding the meat: Chicken strips Adding the cheese: Provalone cheese Toasting the bread\r\n" +
                "Adding the toppings: Onion Green pepper Cucumber Tomatoe Lettuce \n" +
                "Adding the condiments: Honey-Mustard sauce \n" +
                "The sandwich is wrapped!\r\n", output);
    }

    @Test
    public void menuOption2() {
        Login login = new Login();
        login.validateCredentials("user1", "123");
        assertNotNull(User.getSessionStatus());
        Shop shop = new Shop();

        shop.sandwichSelection(2);
        String output = outContent.toString();
        assertEquals("Grabbing the Italian bread\n" +
                "Adding the meat: Pepperoni \n" +
                "Toasting the bread\r\n" +
                "Adding the toppings: Onion Green pepper Cucumber Tomatoe Lettuce Jalapeno pepper \n" +
                "Adding the condiments: Mayonaise \n" +
                "The sandwich is wrapped!\r\n", output);
    }

    @Test
    public void menuOption3() {
        Login login = new Login();
        login.validateCredentials("user1", "123");
        assertNotNull(User.getSessionStatus());
        Shop shop = new Shop();

        shop.sandwichSelection(3);
        String output = outContent.toString();
        assertEquals("Grabbing the Whole grain bread\n" +
                "Adding the toppings: Onion Green pepper Cucumber Tomatoe Lettuce \n" +
                "Adding the condiments: Oil Vinegar \n" +
                "The sandwich is wrapped!\r\n", output);
    }

    @Test
    public void menuOptionOutOfBounds() {
        Login login = new Login();
        login.validateCredentials("user1", "123");
        assertNotNull(User.getSessionStatus());
        Shop shop = new Shop();

        for (int i = -4; i < 1; i++) {
            shop.sandwichSelection(i);
            String output = outContent.toString();
            assertEquals("Bad input.\r\n", output);
            System.setOut(originalOut);
        }

        for (int i = 4; i < 11; i++) {
            shop.sandwichSelection(i);
            String output = outContent.toString();
            assertEquals("Bad input.\r\n", output);
            System.setOut(originalOut);
        }
    }
}
