package com.chun.tasks;

import com.chun.pageActions.Checkout;
import com.chun.resources.Information;
import org.junit.Test;

import com.chun.pageActions.Login;

import java.net.MalformedURLException;

public class Task {

    public static String Url;

    static {
        try {
            Url = Information.ParseURL();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Chrome() throws InterruptedException {
        switch (Url) {
            case "www.facebook.com":
                Login.FacebookLogin();
                break;
            case "shop.exclucitylife.com":
                Login.ExclucitylifeLogin();
                break;
            case "www.supremenewyork.com":
                Checkout.SupremeCheckout();
                break;
            default:
                System.out.println("Invalid URL");
        }
    }
}
