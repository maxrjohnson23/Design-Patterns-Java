package com.max.structural.proxy;

public interface TwitterService {

    String getTimeline(String screeName);

    void postToTimeline(String screenName, String message);

}
