package p000;

import android.view.KeyEvent;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBarController;

/* compiled from: PG */
/* renamed from: cvt */
public final class cvt extends cvs {
    /* renamed from: c */
    private final ezx f22721c;
    /* renamed from: d */
    private final BottomBarController f22722d;
    /* renamed from: e */
    private final hcd f22723e;
    /* renamed from: f */
    private boolean f22724f = true;
    /* renamed from: g */
    private boolean f22725g = true;

    public cvt(bag bag, bah bah, ezx ezx, BottomBarController bottomBarController, hcd hcd) {
        super(bag, bah);
        this.f22721c = ezx;
        this.f22722d = bottomBarController;
        this.f22723e = hcd;
    }

    public final void close() {
        this.f22721c.close();
    }

    public final fha f_() {
        return null;
    }

    /* renamed from: b */
    public final String mo2846b() {
        return null;
    }

    /* renamed from: a */
    public final void mo2844a(gos gos) {
    }

    /* renamed from: a */
    public final void mo2843a(cfh cfh, ezy ezy) {
        ezx ezx = this.f22721c;
        cfh.mo2761p().m3223a((int) R.id.viewfinder_frame);
        ezx.mo2955a(this.f22722d, this.f22723e);
    }

    /* renamed from: c */
    public final boolean mo2849c() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo2839f() {
        return this.f22721c.mo1208J();
    }

    /* renamed from: a */
    public final void mo2842a(aah aah) {
    }

    /* renamed from: a */
    public final boolean mo2845a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo2848b(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public final void mo2847b(boolean z) {
    }

    public final void m_() {
        if (!this.f22724f) {
            this.f22721c.mo2956c();
            this.f22724f = true;
        }
    }

    /* renamed from: j */
    public final void mo2851j() {
        if (this.f22724f) {
            this.f22721c.mo2957d();
            this.f22724f = true;
        }
    }

    /* renamed from: k */
    public final void mo2852k() {
        if (this.f22725g) {
            this.f22721c.mo2958e();
            this.f22725g = false;
        }
    }

    /* renamed from: l */
    public final void mo2853l() {
        if (!this.f22725g) {
            this.f22721c.mo2959f();
            this.f22725g = true;
        }
    }
}
