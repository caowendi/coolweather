package util;

/**
 * Created by Caowendi on 2015/8/28.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
