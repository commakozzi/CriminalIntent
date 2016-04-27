package com.bluewolftek.www.criminalintent;

import java.util.UUID;

/**
 * Created by commakozzi on 4/26/2016.
 */
public class Crime {

    //Member Variables
    private UUID mId;
    private String mTitle;

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

}
