package com.udacity.jwdnd.course1.cloudstorage.service;

import com.udacity.jwdnd.course1.cloudstorage.mapper.FileMapper;
import com.udacity.jwdnd.course1.cloudstorage.model.Files;
import org.springframework.stereotype.Service;

@Service
public class FileService {

    private final FileMapper fileMapper;
    //private final FileService fileService;

    public FileService(FileMapper fileMapper) {
        this.fileMapper = fileMapper;
       // this.fileService = fileService;
    }

    public Integer uploadFile(Files file){
        return fileMapper.saveFile(new Files(file.getFileName(), file.getContentType(), file.getFileSize(), file.getUserId(),file.getFileId(), file.getFileData()));
    }
}