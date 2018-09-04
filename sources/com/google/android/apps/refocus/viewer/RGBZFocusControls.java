package com.google.android.apps.refocus.viewer;

import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.EditingFinishedListener;
import com.google.android.apps.refocus.processing.ProgressListener;
import p000.bli;
import p000.gxa;
import p000.gxc;
import p000.gxd;
import p000.gxe;
import p000.gxf;
import p000.gxg;
import p000.hsn;
import p000.hso;
import p000.hsp;
import p000.hsq;
import p000.ikd;

/* compiled from: PG */
public class RGBZFocusControls extends FrameLayout implements ProgressListener, hsq {
    /* renamed from: a */
    public static final String f12354a = bli.m862a("RGBZFcsCtrls");
    /* renamed from: b */
    public final RectF f12355b = new RectF();
    /* renamed from: c */
    public final int f12356c;
    /* renamed from: d */
    public int f12357d = 0;
    /* renamed from: e */
    public hso f12358e = null;
    /* renamed from: f */
    public hsp f12359f;
    /* renamed from: g */
    public EditingFinishedListener f12360g = null;
    /* renamed from: h */
    public boolean f12361h = false;
    /* renamed from: i */
    private final GestureDetector f12362i = new GestureDetector(getContext(), new hsn(this));
    /* renamed from: j */
    private gxa f12363j;
    /* renamed from: k */
    private gxc f12364k;
    /* renamed from: l */
    private Point f12365l;

    public RGBZFocusControls(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f12356c = getResources().getDimensionPixelSize(R.dimen.refocus_editor_cling_width);
        if (PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("should_show_cling_for_refocus_scrubber", true)) {
            LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f12356c, -2);
            layoutParams.gravity = 83;
            this.f12358e = new hso(this, context);
            addView(this.f12358e, layoutParams);
        }
        this.f12363j = new gxa(context, attributeSet);
        this.f12363j.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f12364k = new gxc(this.f12363j, new ikd());
        addView(this.f12363j);
    }

    public void onDone() {
    }

    /* renamed from: a */
    public final void mo800a(RectF rectF) {
        this.f12355b.set(rectF);
        gxc gxc = this.f12364k;
        gxc.f5739c.execute(new gxf(gxc, rectF));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12357d = i3 - i;
        m8439a();
    }

    public void onProgress(float f) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f12362i.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: a */
    public final void m8441a(boolean z, float f) {
        if (z) {
            hsp hsp = this.f12359f;
            if (hsp != null) {
                hsp.mo1822a(f);
            }
        }
        if (f < 0.0f || f > 1.0f) {
            String str = f12354a;
            StringBuilder stringBuilder = new StringBuilder(62);
            stringBuilder.append("Bokeh indicator value was out of (0..1) range: ");
            stringBuilder.append(f);
            bli.m866b(str, stringBuilder.toString());
            if (f > 1.0f) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
        }
        if (!(this.f12363j.f17530b.mo1664a() || this.f12363j.f17529a.mo1664a())) {
            Point point = this.f12365l;
            if (point != null) {
                gxc gxc = this.f12364k;
                int i = point.x;
                int i2 = point.y;
                if (gxc.f5740d) {
                    gxc.f5739c.execute(new gxd(gxc, i, i2));
                }
            }
        }
        gxc gxc2 = this.f12364k;
        gxc2.f5739c.execute(new gxg(gxc2, (0.5f * f) + 0.15f));
        invalidate();
    }

    /* renamed from: a */
    public final void m8442a(boolean z, int i, int i2) {
        this.f12365l = new Point(i, i2);
        if (z) {
            hsp hsp = this.f12359f;
            if (hsp != null) {
                hsp.mo1823a(i, i2);
                gxc gxc = this.f12364k;
                Point point = this.f12365l;
                gxc.f5739c.execute(new gxe(gxc, point.x, point.y));
            }
        }
    }

    /* renamed from: a */
    public final void m8439a() {
        hsp hsp = this.f12359f;
        if (hsp != null) {
            m8441a(false, hsp.B_());
            float[] C_ = this.f12359f.C_();
            if (C_ != null) {
                m8442a(false, (int) C_[0], (int) C_[1]);
            }
        }
    }
}
