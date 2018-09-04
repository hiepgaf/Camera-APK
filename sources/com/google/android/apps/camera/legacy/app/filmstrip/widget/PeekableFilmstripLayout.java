package com.google.android.apps.camera.legacy.app.filmstrip.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.bli;
import p000.cfk;
import p000.csg;
import p000.csp;
import p000.cst;
import p000.cti;
import p000.ctm;
import p000.ctn;
import p000.ctx;
import p000.cve;
import p000.cvl;
import p000.cvm;
import p000.cvp;
import p000.edb;
import p000.eof;
import p000.eoh;
import p000.eok;
import p000.eol;
import p000.err;
import p000.hid;
import p000.hkg;
import p000.ikd;
import p000.jri;
import p000.kow;
import p000.kpq;

@TargetApi(23)
/* compiled from: PG */
public class PeekableFilmstripLayout extends FrameLayout implements csg, cve, eof, eoh, eok, eol {
    /* renamed from: a */
    public static final String f12255a = bli.m862a("PeekFilmstripLayout");
    /* renamed from: b */
    public cst f12256b;
    /* renamed from: c */
    public FrameLayout f12257c;
    /* renamed from: d */
    public FilmstripView f12258d;
    /* renamed from: e */
    public ctm f12259e;
    /* renamed from: f */
    public FilmstripTransitionLayout f12260f;
    /* renamed from: g */
    public RoundedThumbnailView f12261g;
    /* renamed from: h */
    public boolean f12262h;
    /* renamed from: i */
    public ikd f12263i;
    /* renamed from: j */
    public edb f12264j;
    /* renamed from: k */
    public ctx f12265k;
    /* renamed from: l */
    public csp f12266l;
    /* renamed from: m */
    public AtomicBoolean f12267m;
    /* renamed from: n */
    private ctn f12268n = new ctn(this);

    public PeekableFilmstripLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12259e = new ctm(this.f12268n, new cti(context), TypedValue.applyDimension(1, 80.0f, getResources().getDisplayMetrics()));
    }

    /* renamed from: a */
    public final void mo772a(err err) {
        kow.m13622a(err.mo1035i(), new cvp(this), kpq.f8410a);
    }

    /* renamed from: a */
    public static Bitmap m8393a(ImageView imageView) {
        return hid.m3168a(imageView.getDrawable());
    }

    /* renamed from: a */
    public final void mo770a() {
        this.f12256b.m8721e();
        m8399c();
        m8400d();
    }

    /* renamed from: b */
    public final boolean mo773b() {
        if (!this.f12262h) {
            return false;
        }
        bli.m863a(f12255a, "Begin filmstrip hide animation.");
        this.f12256b.m8721e();
        m8399c();
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12260f;
        filmstripTransitionLayout.f2325i = new cvm(this);
        filmstripTransitionLayout.m1245b();
        filmstripTransitionLayout.f2319c.start();
        return true;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        bli.m863a(f12255a, "onFinishInflate");
        hkg a = hkg.m3221a((View) this);
        this.f12257c = (FrameLayout) a.m3223a((int) R.id.camera_filmstrip_content_layout);
        this.f12258d = (FilmstripView) a.m3223a((int) R.id.filmstrip_view);
        FilmstripView filmstripView = this.f12258d;
        filmstripView.f2364y = this;
        ctm ctm = this.f12259e;
        jri.m13152b(filmstripView.f2345f);
        ctm.f12631b = filmstripView.f2345f;
        TextView textView = (TextView) a.m3223a((int) R.id.no_photos_text);
        FilmstripView filmstripView2 = this.f12258d;
        filmstripView2.f2363x = textView;
        filmstripView2.f2363x.setAlpha(0.0f);
        this.f12258d.setOnTouchListener(new cvl(this));
    }

    /* renamed from: c */
    public final void m8399c() {
        if (this.f12262h) {
            this.f12262h = false;
            this.f12257c.setTranslationX((float) getMeasuredWidth());
            setBackgroundColor(getResources().getColor(17170445, null));
            cst cst = this.f12256b;
            bli.m863a(cfk.f20249a, "onFilmstripHidden");
            cfk cfk = cst.f12618a;
            cfk.f20273X = false;
            cfk.f20266Q.mo1568a(cst.f12618a.m14963H(), 4);
            cfk cfk2 = cst.f12618a;
            cfk2.f20269T = false;
            cfk2.m14972Q();
            this.f12265k.mo2833j();
        }
    }

    /* renamed from: d */
    public final void m8400d() {
        this.f12264j.mo3422v();
        setVisibility(4);
        this.f12260f.setVisibility(4);
    }

    /* renamed from: g */
    public final void mo379g() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12260f;
        bli.m863a(FilmstripTransitionLayout.f2317a, "pauseAnimations");
        if (filmstripTransitionLayout.f2319c.isStarted()) {
            filmstripTransitionLayout.f2319c.pause();
        }
        if (filmstripTransitionLayout.f2318b.isStarted()) {
            filmstripTransitionLayout.f2318b.pause();
        }
    }

    /* renamed from: h */
    public final void mo380h() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12260f;
        bli.m863a(FilmstripTransitionLayout.f2317a, "resumeAnimations");
        if (filmstripTransitionLayout.f2319c.isPaused()) {
            filmstripTransitionLayout.f2319c.resume();
        }
        if (filmstripTransitionLayout.f2318b.isPaused()) {
            filmstripTransitionLayout.f2318b.resume();
        }
    }

    /* renamed from: j */
    public final void mo382j() {
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12260f;
        bli.m863a(FilmstripTransitionLayout.f2317a, "cancelAnimations");
        if (filmstripTransitionLayout.f2319c.isStarted()) {
            filmstripTransitionLayout.f2321e = true;
            filmstripTransitionLayout.f2319c.cancel();
        }
        if (filmstripTransitionLayout.f2318b.isStarted()) {
            filmstripTransitionLayout.f2320d = true;
            filmstripTransitionLayout.f2318b.cancel();
        }
    }

    /* renamed from: a */
    public final void mo771a(cst cst) {
        this.f12256b = cst;
        this.f12258d.f2350k.mo1071a(cst);
    }
}
