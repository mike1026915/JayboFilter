package mike1026.twbbs.com.filterjaybo;

import android.app.Notification;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.Log;

//com.jaybo.two
    public class JayboListenerService extends NotificationListenerService {
    private static String DEBUG = "__SERVICE__";
    public JayboListenerService() {
    }


    @Override
    public void onNotificationPosted(StatusBarNotification sbn) {
        final String packageName = sbn.getPackageName();
        Log.d(DEBUG, packageName);
        if (!TextUtils.isEmpty(packageName) && packageName.equals("com.jaybo.two")) {
            Log.d(DEBUG, sbn.toString());

            Notification n = sbn.getNotification();
            Log.d(DEBUG, n.extras.toString());
            Log.d(DEBUG, n.extras.get("android.text").toString());


        }
    }
}
