package com.firatg.thostlib;

import android.content.Context;

public class Thost {
    private String title;
    private Context context;
    private int icon;
    private int color;
    private int font;
    private float radius;
    private int iconTintColor;
    private float textSize;
    private int duration;
    private int textColor;

    public Thost setTitle(String title) {
        this.title = title;
        return this;
    }

    public Thost setContext(Context context) {
        this.context = context;
        return this;
    }
    public Thost setIcon(int icon){
        this.icon=icon;
        return this;
    }
    public Thost setColor(int color){
        this.color=color;
        return this;
    }
    public Thost setFont(int font){
        this.font=font;
        return this;
    }
    public Thost setRadius(float radius){
        this.radius=radius;
        return this;
    }
    public Thost seticonTintColor(int iconTintColor){
        this.iconTintColor=iconTintColor;
        return this;
    }
    public Thost setTextSize(float textSize){
        this.textSize=textSize;
        return this;
    }
    public Thost setDuration(int duration){
        this.duration=duration;
        return this;
    }
    public Thost setTextColor(int textColor){
        this.textColor=textColor;
        return this;
    }
    public ApolloToast create() {
        return new ApolloToast(title,context,icon,color,font,radius,iconTintColor,textSize,duration,textColor);
    }
}
