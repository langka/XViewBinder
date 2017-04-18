package com.enventbus.songxu.xviewbinder;

import android.app.Activity;
import android.content.Context;
import android.icu.text.DateFormat;
import android.util.Log;
import android.view.View;

import java.lang.reflect.Field;

/**
 * Created by xusong on 2017/4/17.
 */

public class XBinder {
    public static void find(Activity target){
        Class<?> clazz = target.getClass();
        Field[] fields = clazz.getFields();
        for(Field f:fields){
            Log.d("Field Name:",f.getName());
            XBind bind=f.getAnnotation(XBind.class);
            if(bind==null)
                return;
            int resId = bind.value();
            try {
               f.set(target,target.findViewById(resId));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
