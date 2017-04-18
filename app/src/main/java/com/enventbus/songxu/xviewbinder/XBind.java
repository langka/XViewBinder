package com.enventbus.songxu.xviewbinder;

import android.support.annotation.IdRes;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by xsuong on 2017/4/17.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface  XBind {
    @IdRes int value();
}
