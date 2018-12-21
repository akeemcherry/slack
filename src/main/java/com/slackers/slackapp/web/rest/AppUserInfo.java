package com.slackers.slackapp.web.rest;

import com.slackers.slackapp.domain.AppUser;
import com.slackers.slackapp.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AppUserInfo {

    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserInfo(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @PostConstruct
    public void LoadUser(){
        AppUser firstUser = new AppUser();
        firstUser.setDisplayName("1st User");
        firstUser.setUserId(0000001L);
        firstUser.setEmail("special@zipcode.rocks");
        firstUser.setUserName("1User");
        firstUser.setPassword("123abcd");
        firstUser.setIsActive(true);
        appUserRepository.save(firstUser);
    }
}
