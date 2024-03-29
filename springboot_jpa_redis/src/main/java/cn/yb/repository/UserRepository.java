package cn.yb.repository;

import cn.yb.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository  extends JpaRepository<User,Integer> {
    public List<User> findAll();
}
