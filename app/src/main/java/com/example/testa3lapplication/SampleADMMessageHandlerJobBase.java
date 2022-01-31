/*
 * [SampleADMMessageHandlerJobBase.java]
 *
 * (c) 2019, Amazon.com, Inc. or its affiliates. All Rights Reserved.
 */

package com.example.testa3lapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.amazon.device.messaging.ADMConstants;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * The SampleADMMessageHandlerJobBase class receives messages sent by ADM via the SampleADMMessageReceiver receiver.
 *
 * @version Revision: 1, Date: 11/20/2019
 */
public class SampleADMMessageHandlerJobBase extends ADMMessageHandlerJobBase
{
    /** Tag for logs. */
    private final static String TAG = "ADMSampleJobBase";

    /**
     * Class constructor.
     */
    public SampleADMMessageHandlerJobBase()
    {
        super();
    }

    /** {@inheritDoc} */
    @Override
    protected void onMessage(final Context context, final Intent intent)
    {
        Log.i(TAG, "SampleADMMessageHandler:onMessage");
        Bundle data = intent.getExtras();
        for(String key: data.keySet()){
            Log.i(TAG, "Key: " + key + " , Value: " + data.getString(key));
        }

    }

    /**
     * This method verifies the MD5 checksum of the ADM message.
     *
     * @param extras Extra that was included with the intent.
     */


    /** {@inheritDoc} */
    @Override
    protected void onRegistrationError(final Context context, final String string)
    {
        Log.e(TAG, "SampleADMMessageHandlerJobBase:onRegistrationError " + string);
    }

    /** {@inheritDoc} */
    @Override
    protected void onRegistered(final Context context, final String registrationId)
    {
        Log.i(TAG, "SampleADMMessageHandlerJobBase:onRegistered");
        Log.i(TAG, registrationId);


    }

    /** {@inheritDoc} */
    @Override
    protected void onUnregistered(final Context context, final String registrationId)
    {
        Log.i(TAG, "SampleADMMessageHandlerJobBase:onUnregistered");

    }

}
