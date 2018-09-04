package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* renamed from: csl */
public final class csl implements emh, eok, eol {
    /* renamed from: a */
    public static final String f12608a = bli.m862a("FSDelCtrl");
    /* renamed from: b */
    public final Resources f12609b;
    /* renamed from: c */
    public final ViewGroup f12610c;
    /* renamed from: d */
    public final View f12611d;
    /* renamed from: e */
    public boolean f12612e = false;
    /* renamed from: f */
    private final hfz f12613f;

    public csl(ctw ctw, Resources resources, hfz hfz) {
        this.f12610c = ctw.f2735g;
        this.f12611d = ctw.f2736h;
        this.f12609b = resources;
        this.f12613f = hfz;
        this.f12610c.setClickable(true);
    }

    /* renamed from: a */
    public final boolean mo1069a(MotionEvent motionEvent) {
        if (this.f12610c.getVisibility() != 0) {
            return false;
        }
        View view = this.f12611d;
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        Rect rect = new Rect(0, 0, view.getWidth(), view.getHeight());
        rect.offset(hhz.m3153a(view), hhz.m3160b(view));
        if (rect.contains((int) rawX, (int) rawY)) {
            return this.f12611d.dispatchTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        m8711b(false);
        m8709a(false);
        return false;
    }

    /* renamed from: a */
    public final void m8709a(boolean z) {
        if (z) {
            this.f12610c.animate().setDuration(200).alpha(0.0f).setListener(new csm(this)).start();
        } else {
            this.f12610c.setVisibility(8);
        }
    }

    /* renamed from: j */
    public final void mo382j() {
        m8708a();
        m8709a(false);
        bli.m863a(f12608a, "performDeletion");
    }

    /* renamed from: b */
    public final void m8711b(boolean z) {
        if (z) {
            this.f12613f.mo1026g();
        } else {
            m8708a();
        }
        this.f12612e = false;
    }

    /* renamed from: a */
    final void m8708a() {
        if (this.f12612e) {
            this.f12612e = false;
            this.f12613f.mo1015b();
        }
    }
}
