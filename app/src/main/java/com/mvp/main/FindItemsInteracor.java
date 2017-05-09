package com.mvp.main;

import java.util.List;

/**
 * Created by ardenolgundemir on 09/05/2017.
 */

public interface FindItemsInteracor {

    interface OnFinishedListener{
        void onFinished(List<String> items);
    }
    void findItems(OnFinishedListener listener);
}
