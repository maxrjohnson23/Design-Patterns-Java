package com.max.proxy;

/**
 * Demonstrating the Proxy pattern using a Twitter API
 */
public class TwitterDemo {

    public static void main(String[] args) {

        // Test with stub
        //TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceStub());

        TwitterService service = (TwitterService) SecurityProxy.newInstance(new TwitterServiceImpl());

        // Get recent tweets from @TwitterDev
        System.out.println(service.getTimeline("TwitterDev"));

    }
}
