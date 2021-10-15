package com.example.kkulkarni.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("T69dbViPrM8akJGhuKxwS8mnP2c6Ud5pcPLLi1Aw")
                .clientKey("FtQrvELsXA5ifLPAlYuMzK0iA9QrgGvvGOAI9lja")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
