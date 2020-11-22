package com.example.instagram;

import com.parse.Parse;
import com.parse.ParseObject;

import android.app.Application;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("LOAWPRSvBxsfONmVz3AOUZiqkzpp9RLehz4RfSO9")
                .clientKey("THmsfuKrzgeIhoQeKrLTyFzh4dd56CSlEIOXM8CX")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
