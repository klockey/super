package com.udacity.jwdnd.course1.cloudstorage.service;

import com.udacity.jwdnd.course1.cloudstorage.mapper.CredentialsMapper;

public class CredentialService {

    private final CredentialsMapper credentialsMapper;

    public CredentialService(CredentialsMapper credentialsMapper) {
        this.credentialsMapper = credentialsMapper;
    }

    public void uploadCredentials(String url, String username, String key, String password, int userId) {
        credentialsMapper.insert(url, username, key, password,userId);
    }


//    url VARCHAR(100),
//    username VARCHAR (30),
//    key VARCHAR,
//    password VARCHAR,
//    userid INT,

}
