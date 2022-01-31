/*
 * [SampleADMMessageHandler.java]
 *
 * (c) 2019, Amazon.com, Inc. or its affiliates. All Rights Reserved.
 */

package com.example.testa3lapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.amazon.device.messaging.ADMConstants;
import com.amazon.device.messaging.ADMMessageHandlerBase;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * The SampleADMMessageHandler class receives messages sent by ADM via the SampleADMMessageReceiver receiver.
 *
 * @version Revision: 1, Date: 11/11/2012
 */
public class SampleADMMessageHandler extends ADMMessageHandlerBase
{
    /** Tag for logs. */
    private final static String TAG = "ADMSampleIntentBase";

    /**
     * Class constructor.
     */
    public SampleADMMessageHandler()
    {
        super(SampleADMMessageHandler.class.getName());
    }

    /**
     * Class constructor, including the className argument.
     *
     * @param className The name of the class.
     */
    public SampleADMMessageHandler(final String className)
    {
        super(className);
    }

    /** {@inheritDoc} */
    @Override
    protected void onMessage(final Intent intent)
    {
        Log.i(TAG, "SampleADMMessageHandler:onMessage");
        Bundle data = intent.getExtras();
        for(String key: data.keySet()){
            Log.i(TAG, "Key: " + key + " , Value: " + data.getString(key));
        }


    }

    /** {@inheritDoc} */
    @Override
    protected void onRegistrationError(final String string)
    {
        Log.e(TAG, "SampleADMMessageHandler:onRegistrationError " + string);
    }

    /** {@inheritDoc} */
    @Override
    protected void onRegistered(final String registrationId)
    {
        Log.i(TAG, "SampleADMMessageHandler:onRegistered");
        Log.i(TAG, registrationId);

    }

    /** {@inheritDoc} */
    @Override
    protected void onUnregistered(final String registrationId)
    {
        Log.i(TAG, "SampleADMMessageHandler:onUnregistered");

    }
}
