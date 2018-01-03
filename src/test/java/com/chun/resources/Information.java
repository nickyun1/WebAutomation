package com.chun.resources;

import com.chun.utility.ReadFile;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static com.chun.resources.Information.TextTags.EmailTag;
import static com.chun.resources.Information.TextTags.PasswordTag;
import static com.chun.resources.Information.TextTags.WebsiteTag;

public class Information {

    private static final List<String> info = ReadFile.Open();
    private static List<String> newInfo = new ArrayList<>();
    public static String data = null;

    public static class TextTags {
        public static final String WebsiteTag = "Website:";
        public static final String EmailTag = "Email:";
        public static final String PasswordTag = "Password:";
    }

    public static List<String> Information(List<String> oldInfo) {
        // Parsing done here
        for(int i = 0; i < info.size(); i++) {
            if (info.get(i).contains(WebsiteTag)) {
                data = info.get(i).replaceAll("\\s","");
                newInfo.add(data.substring(WebsiteTag.length(), data.length()));
            } else if (info.get(i).contains(EmailTag)){
                data = info.get(i).replaceAll("\\s","");
                newInfo.add(data.substring(EmailTag.length(), data.length()));
            } else if (info.get(i).contains(PasswordTag)){
                data = info.get(i).replaceAll("\\s","");
                newInfo.add(data.substring(PasswordTag.length(), data.length()));
            }
        }
        return newInfo;
    }

    /**
     * Website URL
     */
    public static class Website {
        public static final String URL = Information(info).get(0);
    }

    public static String ParseURL() throws MalformedURLException {
        URL Url = new URL(Website.URL);
        // Used to find what the URL is
        //System.out.println(Url.getHost());
        return Url.getHost().toString();
    }

    /**
     * Account Information
     */
    public static class AccountInformation {
        public static final String Email = Information(info).get(1);
        public static final String Password = Information(info).get(2);
    }
}
