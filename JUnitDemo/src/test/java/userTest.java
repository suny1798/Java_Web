import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class userTest {
    

    
    @Test
    public void testUserName(){
        User user = new User();
        user.setName("张三");
        user.setAge(20);

        userServe userServe = new userServe();
        boolean result = userServe.validateUser(user);
        assertTrue(result);
    }

}
