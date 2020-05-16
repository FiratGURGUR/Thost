package com.firatg.thostlib;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;


public class ThostUtils {

    public static Toast myThost(String title, Context context,int color,int icon){
        final Toast currentToast = new Toast(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService( Context.LAYOUT_INFLATER_SERVICE );
        View layout = inflater.inflate( R.layout.mixed_toast_without_icon, null);
        CardView cardView = layout.findViewById(R.id.card);
        //eğer renk atamadıysa
        if (color != 0){
            cardView.setBackgroundTintList(ColorStateList.valueOf(color));
        }
        ImageView image = (ImageView) layout.findViewById(R.id.image);
        //icon tanımladıysa gösteriyoruz.
        if (icon != 0){
            image.setVisibility(View.VISIBLE);
            image.setImageResource(icon);
        }else {
            image.setVisibility(View.GONE);
        }
        TextView text = (TextView) layout.findViewById(R.id.text);
        text.setText(title);
        currentToast.setView(layout);
        return currentToast;
    }

    static int getColor(@NonNull Context context, @ColorRes int color){
        return ContextCompat.getColor(context, color);
    }


}
