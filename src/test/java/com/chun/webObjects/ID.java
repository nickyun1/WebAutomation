package com.chun.webObjects;

/**
 *  Web element IDs for CSS selectors
 */

public class ID {

    public class Facebook {
        public static final String Email = "#email";
        public static final String Password = "#pass";
        public static final String Login = "#loginbutton";
    }

    public class Exclucitylife {
        public static final String Account = "#customer_login_link";
        public static final String Email = "#customer_login > div:nth-child(3) > input[type=\"text\"]";
        public static final String Password = "#customer_login > div:nth-child(4) > input[type=\"password\"]";
        public static final String Login = "#customer_login > div:nth-child(5) > input[type=\"submit\"]";
    }

    public class Supreme {
        public static final String ShopLink = "#wrap > nav > ul > li:nth-child(4) > a";
        public static final String SizeDropDown = "#s";
        public static final String SupremeObject1 = "#shop-scroller > li:nth-child(1)";
        public static final String SupremeObject2 = "#shop-scroller > li:nth-child(2)";
        public static final String SupremeObject3 = "#shop-scroller > li:nth-child(3)";
        public static final String SupremeObject4 = "#shop-scroller > li:nth-child(4)";
        public static final String AddToCart = "#add-remove-buttons > input";

    }
}
