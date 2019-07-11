package com.example.community.mapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
        void insert(User user);
}
