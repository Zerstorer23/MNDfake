package com.haruhi.lex.crackcamera;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;

import static com.haruhi.lex.crackcamera.MainActivity.CHANNEL_ID;
import static com.haruhi.lex.crackcamera.MainActivity.notificationId;

public class Notification extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        System.out.println("신호 청취"+intent.getAction());
        if(Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())){

            System.out.println("BOOT 신호 청취");
            sendPrivate(context);
            System.out.println("알림 전송");
        }
    }
    public void sendPrivate(Context context){
        Intent intent = new Intent(context, Notification.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.img_common_msticker_noti_icon_store)
                //   .setContentTitle("국방모바일보안")
                .setContentText("카메라 사용이 불가능합니다")
                .setContentIntent(pendingIntent)
                .setColor(Color.parseColor("#ff009688"))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            CharSequence name = context.getString(R.string.app_name);
            String description = context.getString(R.string.app_name);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }


        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);

// notificationId is a unique int for each notification that you must define
        notificationManager.notify(notificationId, builder.build());
    }
    public static void sendNotification(Context context){
        Intent intent = new Intent(context, Notification.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);


        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setSmallIcon(R.drawable.img_common_msticker_noti_icon_store)
                //   .setContentTitle("국방모바일보안")
                .setContentText("카메라 사용이 불가능합니다")
                .setContentIntent(pendingIntent)
                .setColor(Color.parseColor("#ff009688"))
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            CharSequence name = context.getString(R.string.app_name);
            String description = context.getString(R.string.app_name);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = context.getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }


        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);

// notificationId is a unique int for each notification that you must define
        notificationManager.notify(notificationId, builder.build());
    }
}