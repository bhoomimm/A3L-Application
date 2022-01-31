package com.example.testa3lapplication;

import android.content.Context;
import android.util.Log;

//import com.amazon.A3L.messaging.A3LMessagingService;
//import com.amazon.A3L.messaging.Notification;
//import com.amazon.A3L.messaging.RemoteMessage;

import java.util.Arrays;
import java.util.Map;

public class MyA3LMessagingService {

    private final String TAG = "MyA3LMessagingService";

//    @Override
//    public void onMessageReceived(Context context, RemoteMessage remoteMessage) {
//        Log.d(TAG, "In onNewMessage:");
//        Log.d(TAG, "RemoteMessagePlatform: " + remoteMessage.getRemoteMessageType());
//        Log.d(TAG, "MessageId: " + remoteMessage.getMessageId());
//        Log.d(TAG, "getMessageType: " + remoteMessage.getMessageType());
//        Log.d(TAG, "getCollapseKey: " + remoteMessage.getCollapseKey());
//        Log.d(TAG, "getFrom: " + remoteMessage.getFrom());
//        Log.d(TAG, "getOriginalPriority: " + remoteMessage.getOriginalPriority());
//        Log.d(TAG, "getPriority: " + remoteMessage.getPriority());
//        Log.d(TAG, "getTtl: " + remoteMessage.getTtl());
//        Log.d(TAG, "getSenderId: " + remoteMessage.getSenderId());
//        Log.d(TAG, "getSentTime: " + remoteMessage.getSentTime());
//        Map<String, String> data = remoteMessage.getData();
//        for (String key: data.keySet()){
//            Log.d(TAG, "Key: "+ key + " , Value: " + data.get(key));
//        }
//        Notification notification = remoteMessage.getNotification();
//        if(notification!= null){
//            Log.d(TAG, "Notification title: " + notification.getTitle());
//            Log.d(TAG, "Notification body: " + notification.getBody());
//            Log.d(TAG, "Notification icon: " + notification.getIcon());
//            Log.d(TAG, "Notification color: " + notification.getColor());
//            Log.d(TAG, "Notification sound: " + notification.getSound());
//            Log.d(TAG, "Notification tag: " + notification.getTag());
//            Log.d(TAG, "Notification click_action: " + notification.getClickAction());
//            Log.d(TAG, "Notification channel_id: " + notification.getChannelId());
//            Log.d(TAG, "Notification sticky: " + notification.getSticky());
//            Log.d(TAG, "Notification event_time: " + notification.getEventTime());
//            Log.d(TAG, "Notification local_only: " + notification.getLocalOnly());
//            Log.d(TAG, "Notification notification_priority: " + notification.getNotificationPriority());
//            Log.d(TAG, "Notification default_sound: " + notification.getDefaultSound());
//            Log.d(TAG, "Notification visibility: " + notification.getVisibility());
//            Log.d(TAG, "Notification notification_count: " + notification.getNotificationCount());
//            Log.d(TAG, "Notification image: " + notification.getImage());
//            Log.d(TAG, "Notification Title Location Key " + notification.getTitleLocKey());
//            Log.d(TAG, "Notification Title Location Args " + Arrays.toString(notification.getTitleLocArgs()));
//            Log.d(TAG, "Notification Body Location Key " + notification.getBodyLocKey());
//            Log.d(TAG, "Notification Body Location Args " + Arrays.toString(notification.getBodyLocArgs()));
//        }
//        else {
//            Log.d(TAG, "Notification is null");
//        }
//    }

//    @Override
//    public void onNewToken(Context context, String token) {
//        Log.d(TAG, "In onNewDeviceId");
//        Log.d(TAG, "Device token: " + token);
//    }
}
