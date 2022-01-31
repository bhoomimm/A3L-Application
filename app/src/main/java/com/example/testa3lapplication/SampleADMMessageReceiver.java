/*
 * [SampleADMMessageReceiver.java]
 *
 * (c) 2019, Amazon.com, Inc. or its affiliates. All Rights Reserved.
 */
package com.example.testa3lapplication;

import com.amazon.device.messaging.ADMMessageReceiver;

/**
 * The SampleADMMessageReceiver class listens for messages from ADM and forwards them.
 *
 * @version Revision: 1, Date: 11/20/2019
 */
public class SampleADMMessageReceiver extends ADMMessageReceiver {
    public SampleADMMessageReceiver() {
        super(SampleADMMessageHandler.class);
        if(ADMHelper.IS_ADM_V2) {
            registerJobServiceClass(SampleADMMessageHandlerJobBase.class, ADMHelper.JOB_ID);
        }
    }
    boolean isClassAvailable(final String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
