package com.zyhang.damon.rxjava;

import com.zyhang.damon.MvpPresenter;

import androidx.annotation.CallSuper;
import io.reactivex.disposables.Disposable;

/**
 * Created by zyhang on 2018/5/15.16:46
 */

public class RxMvpPresenter<V> extends MvpPresenter<V> implements DisposableHelper {

    private DisposableDelegate mDisposableDelegate = new DisposableDelegateFactory();

    @CallSuper
    @Override
    public void add(Disposable disposable, @DisposeOn int disposeOn) {
        mDisposableDelegate.add(disposable, disposeOn);
    }

    @CallSuper
    @Override
    public void remove(Disposable disposable, @DisposeOn int disposeOn) {
        mDisposableDelegate.remove(disposable, disposeOn);
    }

    @CallSuper
    @Override
    protected void onHostPause() {
        mDisposableDelegate.clearPause();
    }

    @CallSuper
    @Override
    protected void onHostDestroyView() {
        mDisposableDelegate.clearDestroyView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ((Disposable) mDisposableDelegate).dispose();
    }
}
