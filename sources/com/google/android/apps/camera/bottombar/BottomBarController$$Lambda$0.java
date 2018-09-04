package com.google.android.apps.camera.bottombar;

import android.view.View;

final /* synthetic */ class BottomBarController$$Lambda$0 implements OnStateChangeListener {
    public final BottomBarController arg$1;

    BottomBarController$$Lambda$0(BottomBarController bottomBarController) {
        this.arg$1 = bottomBarController;
    }

    public final void stateChanged(View view, int i) {
        this.arg$1.lambda$wireListeners$0$BottomBarController(view, i);
    }
}
