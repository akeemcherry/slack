package com.slackers.slackapp.web.rest;

import com.slackers.slackapp.domain.Channel;
import com.slackers.slackapp.repository.ChannelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ChannelInfo {

    private ChannelRepository channelRepository;

    @Autowired
    public ChannelInfo(ChannelRepository channelRepository) {
        this.channelRepository = channelRepository;
    }

    @PostConstruct
    public void LoadChannel(){
        Channel channel = new Channel();
        channel.setChannelName("General");
        channel.setChannelID(0001L);
        channel.setChannelDescription("general information");
        channel.setIsPrivate(Boolean.FALSE);
        channelRepository.save(channel);

        Channel slackGroup = new Channel();
        slackGroup.setChannelName("Slack Group");
        slackGroup.setChannelID(0002L);
        slackGroup.setChannelDescription("yay second channel");
        slackGroup.setIsPrivate(Boolean.TRUE);
        channelRepository.save(slackGroup);

    }

}
