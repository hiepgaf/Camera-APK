package com.google.android.apps.camera.bottombar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import p000.hbf;
import p000.hbh;
import p000.hci;

/* compiled from: PG */
public class SnapshotButton extends ShutterButton {
    public SnapshotButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected float getDefaultScale() {
        TypedValue typedValue = new TypedValue();
        getResources().getValue(C0042R.dimen.snapshot_button_scale, typedValue, true);
        return typedValue.getFloat();
    }

    public void setMode(hbf hbf, hbh hbh) {
        if (hbf.equals(hbf.PHOTO_PRESSED)) {
            super.setMode(hbf.PHOTO_PRESSED, hbh);
        } else {
            super.setMode(hbf.PHOTO_IDLE, hbh);
        }
    }

    void wirePressedStateAnimationListener() {
        final hbh hbh = new hbh(this, true);
        setListener(new hci() {
            public void onShutterButtonPressedStateChanged(boolean z) {
                SnapshotButton.this.runPressedStateAnimation(z, hbh);
            }
        });
        setClickEnabled(true);
    }
}
