package com.max.creational.factory;

/**
 * WebsiteFactory used to create different website templates
 */
public class WebsiteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new ShoppingWebsite();
            }
            default: {
                return null;
            }
        }
    }
}
