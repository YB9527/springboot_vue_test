package cn.yb;

import cn.yb.domain.User;
import cn.yb.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootJpaRedisApplication.class)
public class RedisTest {
    /*/@Autowired
    private RedisTemplate<String,String> redisTemplate;
    @Autowired
    private UserRepository userRepository;
    @Test
    public void test() throws JsonProcessingException {
        String userListJson = redisTemplate.boundValueOps("user.findAll").get();
        if(null == userListJson)
        {
            List<User> all = userRepository.findAll();
            ObjectMapper objectMapper = new ObjectMapper();
            userListJson = objectMapper.writeValueAsString(all);
            redisTemplate.boundValueOps("user.findAll").set(userListJson);
            System.out.println("=====从数据库中获得user的数据");
        }else{
            System.out.println("=======从redis中获得user的数据");
        }
    }*/
}
