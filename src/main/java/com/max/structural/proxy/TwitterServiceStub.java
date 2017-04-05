package com.max.structural.proxy;

public class TwitterServiceStub implements TwitterService{
    @Override
    public String getTimeline(String screeName) {
        return "My cool timeline";
    }

    @Override
    public void postToTimeline(String screenName, String message) {

    }
}
