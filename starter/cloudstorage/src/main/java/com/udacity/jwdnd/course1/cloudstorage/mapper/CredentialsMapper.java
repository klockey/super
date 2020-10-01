package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface CredentialsMapper {

    @Select("SELECT * FROM CREDENTIALS WHERE username = #{username}")
    Users getUser(String username);

    @Insert("INSERT INTO CREDENTIALS (url, username, key, password, userid) VALUES(#{url}, #{username}, #{key}, #{password}, #{userid})")
    @Options(useGeneratedKeys = true, keyProperty = "userId")
    void insert(String url, String username, String key, String password, int userId);


//    @Insert("INSERT INTO NOTES (notetitle, notedescription, userid ) VALUES(#{noteTitle}, #{noteDescription}, #{userId})")
//    void insert(String noteTitle, String noteDescription, int userId);
//    @Update("UPDATE NOTES SET noteTitle = #{noteTitle}, noteDescription = #{noteDescription} WHERE noteId = #{noteId}")
//    void update(String noteTitle, String noteDescription, int noteId);
//    @Select("SELECT * FROM NOTES WHERE userid = #{userId}")
//    List<Notes> getNotes(int userId);
//    @Delete("DELETE FROM NOTES WHERE noteId = #{noteId}")
//    void delete(Integer noteId);



}


