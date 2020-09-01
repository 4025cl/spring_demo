package com.example.demo.mapper;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
@Repository
public interface UserMapper {
   List<User> findAll();
   void  addUser(User user);
}


