package cn.tedu.store.MapperTest;

import cn.tedu.store.entity.User;
import cn.tedu.store.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper ump;
    @Test
    public void findByUid(){
       User user =  ump.findByUid(17);
    System.err.println(user);

    }

}
