package com.application.meow.notify.exceptions;

import android.content.res.Resources.NotFoundException;

import com.application.meow.notify.Notify;

public class NotifyDefaultChannelInfoNotFoundException extends NotFoundException {
    public NotifyDefaultChannelInfoNotFoundException(){}
    @Override
    public String getMessage() {
        return "One or more of the next values is missing from string resources: " +
                Notify.ChannelData.ID+", " +
                Notify.ChannelData.NAME+" or " +
                Notify.ChannelData.DESCRIPTION;
    }
}
