package com.max.structural.proxy;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class TwitterServiceImpl implements TwitterService {

    private static String TWITTER_CONSUMER_KEY;
    private static String TWITTER_SECRET_KEY;
    private static String TWITTER_ACCESS_TOKEN;
    private static String TWITTER_ACCESS_TOKEN_SECRET;

    static {
        Properties prop = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("twitterdemo.properties");

            prop.load(input);

            TWITTER_CONSUMER_KEY = (String) prop.get("twitter.key.consumer");
            TWITTER_SECRET_KEY = (String) prop.get("twitter.key.secret");
            TWITTER_ACCESS_TOKEN = (String) prop.get("twitter.access.token");
            TWITTER_ACCESS_TOKEN_SECRET = (String) prop.get("twitter.access.secret");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public String getTimeline(String screeName) {

        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true).setOAuthConsumerKey(TWITTER_CONSUMER_KEY).setOAuthConsumerSecret(TWITTER_SECRET_KEY).setOAuthAccessToken(TWITTER_ACCESS_TOKEN).setOAuthAccessTokenSecret(TWITTER_ACCESS_TOKEN_SECRET);
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter = tf.getInstance();

        StringBuilder sb = new StringBuilder();

        try {
            Query query = new Query(screeName);
            QueryResult result;
            do {
                result = twitter.search(query);
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    sb.append("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
                    sb.append("\n");
                }
            } while ((query = result.nextQuery()) != null);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
        }
        return sb.toString();

    }

    @Override
    public void postToTimeline(String screenName, String message) {
        // not allowed
    }
}
