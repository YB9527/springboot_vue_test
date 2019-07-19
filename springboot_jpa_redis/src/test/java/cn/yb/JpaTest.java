package cn.yb;

import cn.yb.domain.User;
import cn.yb.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes =SpringbootJpaRedisApplication.class )
public class JpaTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void test(){
       List<User> users = userRepository.findAll();
        System.out.println(users);
    }
}
