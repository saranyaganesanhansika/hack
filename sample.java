package com.renault.dnt.apidhs.misc;

import java.util.Locale;
import java.util.ResourceBundle;

public class sample {

    public static void main(String[] args) {

        ResourceBundle bundle = ResourceBundle.getBundle("errorMessages", Locale.getDefault());

        System.out.println(bundle.getString("401"));
    }
}
