package com.max.proxy;

public interface TwitterService {

    String getTimeline(String screeName);

    void postToTimeline(String screenName, String message);

}
