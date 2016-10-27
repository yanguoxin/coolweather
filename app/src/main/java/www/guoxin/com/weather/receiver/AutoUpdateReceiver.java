package www.guoxin.com.weather.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import www.guoxin.com.weather.service.AutoUpdateService;

/**
 * Created by Administrator on 2016/10/27 0027.
 */

public class AutoUpdateReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, AutoUpdateService.class);
        context.startService(i);
    }
}
