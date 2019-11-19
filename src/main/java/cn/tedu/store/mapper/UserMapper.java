package cn.tedu.store.mapper;

import cn.tedu.store.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper{
    User findByUid(Integer uid);

}
