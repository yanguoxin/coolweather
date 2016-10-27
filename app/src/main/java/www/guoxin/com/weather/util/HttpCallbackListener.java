package www.guoxin.com.weather.util;

/**
 * Created by Administrator on 2016/10/26 0026.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
