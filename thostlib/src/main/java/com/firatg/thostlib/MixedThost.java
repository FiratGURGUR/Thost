package com.firatg.thostlib;

import android.content.Context;
import android.widget.Toast;

public class MixedThost {

    public static Toast  success(Context context, String message) {
         return ThostUtils.myThost(message,context, ThostUtils.getColor(context,R.color.green),R.drawable.t_success);
    }

    public static Toast  eror(Context context, String message) {
        return ThostUtils.myThost(message,context, ThostUtils.getColor(context,R.color.red),R.drawable.ic_error);
    }
    public static Toast  warning(Context context, String message) {
        return ThostUtils.myThost(message,context, ThostUtils.getColor(context,R.color.yellow),R.drawable.ic_info_warning);
    }
    public static Toast  info(Context context, String message) {
        return ThostUtils.myThost(message,context, ThostUtils.getColor(context,R.color.blue),R.drawable.ic_info_warning);
    }



}
