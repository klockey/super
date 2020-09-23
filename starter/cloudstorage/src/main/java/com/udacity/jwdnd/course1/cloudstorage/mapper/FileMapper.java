package com.udacity.jwdnd.course1.cloudstorage.mapper;

import com.udacity.jwdnd.course1.cloudstorage.model.Files;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface FileMapper {
//    @Select("SELECT * FROM FILES WHERE fileName = #{fileName}")
//    Files getFile(String noteFile);
//
//    @Insert("INSERT INTO FILES (filename, contenttype, filesize, userid, filedata) VALUES(#{fileName}, #{contentType}, #{fileSize}, #{userId}, #{fileData})")
//    @Options(useGeneratedKeys = true, keyProperty = "fileId")
//    int insert(Files file);

    @Select("SELECT * FROM FILES WHERE filename = #{fileName} AND userid = #{userId}")
    Files getFileByFileName(String fileName, Integer userId);
    @Select("SELECT * FROM FILES WHERE fileid = #{fileId}")
    Files getFileByFileId(Integer fileId);
    @Insert("INSERT INTO FILES (filename, contenttype, filesize, userid, filedata) VALUES (#{fileName}, #{contentType}, #{fileSize}, #{userId}, #{fileData})")
    @Options(useGeneratedKeys = true, keyProperty = "fileId")
    Integer saveFile(Files file);
    @Select("SELECT * FROM FILES WHERE userid = #{userId}")
    List<Files> getFilesByUserId(Integer userId);
    @Delete("DELETE FROM FILES WHERE fileid = #{fileId}")
    void deleteFileByFileId(Integer fileId);
}
