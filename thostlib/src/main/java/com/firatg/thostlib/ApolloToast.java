package com.firatg.thostlib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

public class ApolloToast {
    public static String title;
    public static Context context;
    public static int icon;
    public static int color;
    public static int font;
    public static float radius;
    public static int iconTintColor;
    public static float textSize;
    public static int duration;
    public static int textColor;

    public ApolloToast(String title, Context context, int icon, int color, int font, float radius, int iconTintColor, float textSize, int duration, int textColor) {
        this.title = title;
        this.context = context;
        this.icon = icon;
        this.color = color;
        this.font = font;
        this.radius = radius;
        this.iconTintColor = iconTintColor;
        this.textSize = textSize;
        this.duration = duration;
        this.textColor = textColor;
    }

    @SuppressLint("ResourceType")
    public static Toast thost() {
        final Toast currentToast = new Toast(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.toast_layout, null);
        CardView cardView = layout.findViewById(R.id.card);

        //eğer renk atamadıysa
        if (color != 0) {
            cardView.setBackgroundTintList(ColorStateList.valueOf(color));
        }

        if (radius != 0) {
            cardView.setRadius(radius);
        }

        ImageView image = (ImageView) layout.findViewById(R.id.image);

        //icon tanımladıysa gösteriyoruz.
        if (icon != 0) {
            image.setVisibility(View.VISIBLE);
            image.setImageResource(icon);

            if (iconTintColor != 0) {
                image.setColorFilter(ContextCompat.getColor(context, iconTintColor), android.graphics.PorterDuff.Mode.SRC_IN);
            }

        } else {
            image.setVisibility(View.GONE);
        }

        TextView text = (TextView) layout.findViewById(R.id.text);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            if (font != 0) {
                //Typeface  typeface = context.getApplicationContext().getResources().getFont(font);
                Typeface typeface = ResourcesCompat.getFont(context, font);
                text.setTypeface(typeface);
            }
        }

        if (textSize != 0) {
            text.setTextSize(textSize);
        }

        if (duration != 0) {
            currentToast.setDuration(duration);
        }
        if (textColor != 0) {
            text.setTextColor(context.getColor(textColor));
        }

        text.setText(title);
        currentToast.setView(layout);

        return currentToast;
    }


}
