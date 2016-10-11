package com.claytonbrant.balloonpoppergame.utils;

/**
 * Created by cbrant on 10/11/2016.
 */
import android.content.Context;
import android.util.TypedValue;

public class PixelHelper {

    public static int pixelsToDp(int px, Context context) {
        return (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, px,
                context.getResources().getDisplayMetrics());
    }

}