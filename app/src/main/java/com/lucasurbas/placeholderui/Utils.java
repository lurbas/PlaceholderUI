package com.lucasurbas.placeholderui;

import android.content.Context;

/**
 * Created by Lucas on 19/07/15.
 */
public class Utils {

    public static int dpToPx(int dp, Context context){
        return (int) (dp * context.getResources().getDisplayMetrics().density);
    }
}
