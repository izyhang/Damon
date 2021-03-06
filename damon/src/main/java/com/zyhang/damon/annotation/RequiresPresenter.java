package com.zyhang.damon.annotation;

import com.zyhang.damon.MvpPresenter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ProjectName:Damon
 * Description:
 * Created by zyhang on 2017/4/28.22:58
 * Modify by:
 * Modify time:
 * Modify remark:
 */

@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RequiresPresenter {
    Class<? extends MvpPresenter>[] value();
}
