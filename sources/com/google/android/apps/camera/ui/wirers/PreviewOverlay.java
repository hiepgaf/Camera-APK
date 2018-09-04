package com.google.android.apps.camera.ui.wirers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import p000.bli;
import p000.go;
import p000.hhy;
import p000.hnn;
import p000.hnp;
import p000.hnu;

@Deprecated
/* compiled from: PG */
public class PreviewOverlay extends View {
    /* renamed from: a */
    public GestureDetector f2446a = null;
    /* renamed from: b */
    public OnTouchListener f2447b = null;
    /* renamed from: c */
    public hhy f2448c;
    /* renamed from: d */
    public boolean f2449d = true;
    /* renamed from: e */
    public boolean f2450e = true;
    /* renamed from: f */
    private final int[] f2451f = new int[]{0, 0};

    static {
        bli.m862a("PreviewOverlay");
    }

    public PreviewOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.f2451f);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f2449d) {
            if (this.f2450e) {
                hhy hhy = this.f2448c;
                if (hhy != null) {
                    hnu hnu = hhy.f6217a;
                    switch (motionEvent.getActionMasked()) {
                        case 0:
                            hnp hnp = hnu.f6390g;
                            hnu.m3259a(motionEvent);
                            hnp.mo2640a();
                            break;
                        case 1:
                            hnu.m3260a().mo1746b();
                            hnu.f6390g.mo1746b();
                            hnu.f6400q = 0.0f;
                            hnu.f6399p = 0.0f;
                            hnu.f6396m = go.bD;
                            hnu.f6397n = false;
                            hnu.f6398o = false;
                            hnu.f6401r = 0;
                            break;
                        case 3:
                            hnn hnn;
                            hnu.m3260a().mo1747c();
                            if (hnu.f6398o) {
                                hnn = hnu.f6390g;
                            } else {
                                hnn = hnn.f6382a;
                            }
                            hnn.mo1747c();
                            hnu.f6401r = 0;
                            break;
                        case 5:
                            hnu.f6401r++;
                            break;
                        case 6:
                            hnu.f6401r--;
                            break;
                    }
                    if (hnu.f6397n) {
                        if (motionEvent.getPointerCount() >= 2) {
                            Math.atan2((double) (-(motionEvent.getY(1) - motionEvent.getY(0))), (double) (motionEvent.getX(1) - motionEvent.getX(0)));
                        }
                        hnu.f6386c.onTouchEvent(motionEvent);
                    } else if (hnu.f6396m != go.bD || hnu.f6398o) {
                        hnu.f6385b.onTouchEvent(motionEvent);
                    } else {
                        hnu.f6386c.onTouchEvent(motionEvent);
                        hnu.f6385b.onTouchEvent(motionEvent);
                    }
                }
            }
            GestureDetector gestureDetector = this.f2446a;
            if (gestureDetector != null) {
                gestureDetector.onTouchEvent(motionEvent);
            }
            OnTouchListener onTouchListener = this.f2447b;
            if (onTouchListener != null) {
                onTouchListener.onTouch(this, motionEvent);
            }
        }
        return true;
    }
}
