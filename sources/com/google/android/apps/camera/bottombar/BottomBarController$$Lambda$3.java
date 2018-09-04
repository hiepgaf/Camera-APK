package com.google.android.apps.camera.bottombar;

import android.view.View;

final /* synthetic */ class BottomBarController$$Lambda$3 implements OnStateChangeListener {
    public final BottomBarController arg$1;

    BottomBarController$$Lambda$3(BottomBarController bottomBarController) {
        this.arg$1 = bottomBarController;
    }

    public final void stateChanged(View view, int i) {
        this.arg$1.lambda$wireListeners$3$BottomBarController(view, i);
    }
}
