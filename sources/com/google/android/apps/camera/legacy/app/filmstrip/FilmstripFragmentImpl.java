package com.google.android.apps.camera.legacy.app.filmstrip;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.RoundedThumbnailView;
import com.google.android.apps.camera.legacy.app.filmstrip.transition.FilmstripTransitionLayout;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.FilmstripView;
import com.google.android.apps.camera.legacy.app.filmstrip.widget.PeekableFilmstripLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.acc;
import p000.acf;
import p000.arq;
import p000.bli;
import p000.bmb;
import p000.cbj;
import p000.cbm;
import p000.ccd;
import p000.cco;
import p000.cem;
import p000.cfd;
import p000.cfh;
import p000.cpx;
import p000.crq;
import p000.crt;
import p000.crw;
import p000.csg;
import p000.csh;
import p000.csl;
import p000.csp;
import p000.csq;
import p000.csr;
import p000.css;
import p000.csv;
import p000.csw;
import p000.ctf;
import p000.ctm;
import p000.ctt;
import p000.ctw;
import p000.ctx;
import p000.cub;
import p000.cue;
import p000.cun;
import p000.cuw;
import p000.cvn;
import p000.edb;
import p000.enr;
import p000.go;
import p000.gui;
import p000.gvr;
import p000.hez;
import p000.hfu;
import p000.hfz;
import p000.hip;
import p000.hkg;
import p000.ikd;
import p000.jri;
import p000.kow;
import p000.kpk;
import p000.kpq;
import p000.ktm;

/* compiled from: PG */
public class FilmstripFragmentImpl extends Fragment implements csp {
    /* renamed from: a */
    private static final String f12228a = bli.m862a("FilmstripFrgmntImpl");
    /* renamed from: A */
    private gvr f12229A;
    /* renamed from: b */
    private boolean f12230b = false;
    /* renamed from: c */
    private AtomicBoolean f12231c = new AtomicBoolean(false);
    /* renamed from: d */
    private PeekableFilmstripLayout f12232d;
    /* renamed from: e */
    private FilmstripView f12233e;
    /* renamed from: f */
    private ctw f12234f;
    /* renamed from: g */
    private FrameLayout f12235g;
    /* renamed from: h */
    private FrameLayout f12236h;
    /* renamed from: i */
    private FilmstripTransitionLayout f12237i;
    /* renamed from: j */
    private RoundedThumbnailView f12238j;
    /* renamed from: k */
    private Bitmap f12239k;
    /* renamed from: l */
    private boolean f12240l;
    /* renamed from: m */
    private csw f12241m;
    /* renamed from: n */
    private crq f12242n;
    /* renamed from: o */
    private crw f12243o;
    /* renamed from: p */
    private crt f12244p;
    /* renamed from: q */
    private csh f12245q;
    /* renamed from: r */
    private csl f12246r;
    /* renamed from: s */
    private WindowManager f12247s;
    /* renamed from: t */
    private ikd f12248t;
    /* renamed from: u */
    private enr f12249u;
    /* renamed from: v */
    private bmb f12250v;
    /* renamed from: w */
    private edb f12251w;
    /* renamed from: x */
    private cue f12252x;
    /* renamed from: y */
    private cub f12253y;
    /* renamed from: z */
    private ctx f12254z;

    /* renamed from: a */
    public final crw mo754a() {
        jri.m13152b(this.f12243o);
        return this.f12243o;
    }

    /* renamed from: b */
    public final crt mo758b() {
        return (crt) jri.m13152b(this.f12244p);
    }

    /* renamed from: c */
    public final csg mo759c() {
        return this.f12232d;
    }

    /* renamed from: d */
    public final csh mo760d() {
        return (csh) jri.m13152b(this.f12245q);
    }

    /* renamed from: e */
    public final csw mo761e() {
        return this.f12241m;
    }

    /* renamed from: f */
    public final WindowManager mo762f() {
        return this.f12247s;
    }

    /* renamed from: g */
    public final void mo763g() {
        this.f12232d.mo770a();
        this.f12242n.m1437a();
    }

    /* renamed from: h */
    public final void mo764h() {
        m8376n();
        acc a = acc.m98a(this.f12245q.f2642d);
        acf acf = acf.HIGH;
        arq.m653a();
        a.f188b.m293a(acf.f220c);
        a.f187a.mo61a(acf.f220c);
    }

    /* renamed from: n */
    private final void m8376n() {
        ikd.m12259a();
        if (!this.f12230b) {
            csq csq = new csq(((cfd) getContext()).mo2797d(), new csr(this, this.f12234f));
            this.f12243o = (crw) csq.f2659b.mo345a();
            this.f12244p = (crt) csq.f2660c.mo345a();
            this.f12245q = (csh) csq.f2662e.mo345a();
            this.f12246r = (csl) csq.f2661d.mo345a();
            this.f12247s = cco.m8004a(csq.f2663f.f1895e.aK.f22686j.mo345a());
            this.f12248t = (ikd) csq.f2663f.f1895e.aK.f22689m.mo345a();
            this.f12249u = cem.m8076a(csq.f2663f.f1895e.f20214b);
            this.f12250v = csq.f2663f.f1895e.aK.m16936c();
            this.f12251w = (edb) csq.f2663f.f1895e.au.mo345a();
            this.f12252x = new cue((cub) csq.f2663f.f1895e.ax.mo345a(), (ctx) csq.f2663f.f1895e.ay.mo345a(), (csh) csq.f2662e.mo345a(), (crw) csq.f2659b.mo345a(), (crt) csq.f2660c.mo345a(), (csl) csq.f2661d.mo345a(), (csp) ktm.m13963a(csq.f2658a.f2670a, "Cannot return null from a non-@Nullable @Provides method"), css.m8714a(csq.f2658a), hez.m11783a(csq.f2663f.f1891a), csv.m8723a(csq.f2658a), cbm.m7957a(csq.f2663f.f1895e.f20213a), (gui) csq.f2663f.f1895e.aC.mo345a(), cbj.m7952a(csq.f2663f.f1895e.f20213a));
            this.f12253y = (cub) csq.f2663f.f1895e.ax.mo345a();
            this.f12254z = (ctx) csq.f2663f.f1895e.ay.mo345a();
            this.f12229A = new gvr(ccd.m7979a(csq.f2663f.f1895e.aK.f22686j.mo345a()));
            this.f12240l = false;
            this.f12230b = true;
        }
    }

    /* renamed from: a */
    public final void mo756a(cfh cfh, cpx cpx, hfz hfz, RoundedThumbnailView roundedThumbnailView) {
        m8376n();
        this.f12249u.m1906a(this.f12246r);
        FilmstripView filmstripView = this.f12233e;
        csh csh = this.f12245q;
        cub cub = this.f12253y;
        bli.m863a(FilmstripView.f2338a, "FilmstripView.init");
        filmstripView.setWillNotDraw(false);
        filmstripView.f2344e = cpx;
        filmstripView.f2342c = this;
        filmstripView.f2343d = cub;
        filmstripView.f2341b = cfh;
        filmstripView.f2349j = 1.0f;
        filmstripView.f2350k = new cuw(filmstripView);
        filmstripView.f2356q = new DecelerateInterpolator();
        filmstripView.f2354o = new hfu(getContext());
        filmstripView.f2354o.setVisibility(8);
        filmstripView.addView(filmstripView.f2354o);
        if (csh.f2643e) {
            filmstripView.f2362w.mo3557a(Boolean.valueOf(true));
        }
        filmstripView.f2355p = (int) filmstripView.getContext().getResources().getDimension(R.dimen.pie_touch_slop);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        mo762f().getDefaultDisplay().getMetrics(displayMetrics);
        filmstripView.f2359t = ((float) displayMetrics.densityDpi) / 240.0f;
        if (filmstripView.f2359t < 1.0f) {
            filmstripView.f2359t = 1.0f;
        }
        filmstripView.setAccessibilityDelegate(new cun(filmstripView, this));
        if (this.f12250v.m884b()) {
            this.f12241m = new ctf(hfz);
        } else {
            this.f12241m = this.f12233e.f2350k;
        }
        this.f12241m.mo1076b(getResources().getDimensionPixelSize(R.dimen.camera_film_strip_gap));
        this.f12241m.mo1072a(hfz);
        this.f12238j = roundedThumbnailView;
        this.f12239k = roundedThumbnailView.getDefaultThumbnail(hip.PLACEHOLDER);
        PeekableFilmstripLayout peekableFilmstripLayout = this.f12232d;
        ikd ikd = this.f12248t;
        edb edb = this.f12251w;
        ctx ctx = this.f12254z;
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12237i;
        peekableFilmstripLayout.f12261g = roundedThumbnailView;
        peekableFilmstripLayout.f12263i = ikd;
        peekableFilmstripLayout.f12264j = edb;
        peekableFilmstripLayout.f12265k = ctx;
        peekableFilmstripLayout.f12266l = this;
        peekableFilmstripLayout.f12260f = filmstripTransitionLayout;
        peekableFilmstripLayout.f12267m = new AtomicBoolean(false);
        this.f12249u.m1906a(this.f12232d);
        this.f12242n = new crq(this.f12233e, this.f12232d);
        cue cue = this.f12252x;
        cue.f2740a.mo3401a(cue.f2742c, cue.f2743d, cue.f2744e, cue.f2745f, cue.f2746g, cue.f2747h, cue.f2748i, cue.f2749j, cue.f2750k, cue.f2751l);
        cue.f2741b.mo3400a(cue.f2746g, cue.f2752m);
    }

    /* renamed from: i */
    public final boolean mo765i() {
        Activity activity = getActivity();
        return activity == null || activity.isFinishing();
    }

    /* renamed from: j */
    public final boolean mo766j() {
        return this.f12231c.get();
    }

    /* renamed from: k */
    public final boolean mo767k() {
        return this.f12232d.getVisibility() == 0;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f12235g = (FrameLayout) layoutInflater.inflate(R.layout.camera_filmstrip, viewGroup, false);
        hkg a = hkg.m3221a(this.f12235g);
        this.f12237i = (FilmstripTransitionLayout) a.m3223a((int) R.id.filmstrip_transition_layout);
        this.f12232d = (PeekableFilmstripLayout) a.m3223a((int) R.id.peekable_filmstrip_layout);
        this.f12233e = (FilmstripView) a.m3223a((int) R.id.filmstrip_view);
        a.m3223a((int) R.id.filmstrip_short_tall_bottom_bar_background);
        this.f12236h = (FrameLayout) a.m3223a((int) R.id.filmstrip_controls_container);
        layoutInflater.inflate(R.layout.undo_bar, this.f12236h, true);
        this.f12234f = new ctw(hkg.m3221a(this.f12235g));
        return this.f12235g;
    }

    /* renamed from: a */
    public final void mo755a(Bitmap bitmap) {
        this.f12239k = (Bitmap) jri.m13152b((Object) bitmap);
        this.f12237i.m1242a(bitmap);
        this.f12233e.m1265a(bitmap);
    }

    public void onPause() {
        super.onPause();
        this.f12231c.set(true);
        this.f12240l = true;
        ctm ctm = this.f12232d.f12259e;
        if (ctm.f12632c == go.f5554R) {
            ctm.m8746b();
        }
    }

    public void onResume() {
        ikd.m12259a();
        super.onResume();
        this.f12231c.set(false);
        if (this.f12240l && this.f12230b) {
            mo760d().f2641c.mo1025f();
            this.f12240l = false;
        }
    }

    /* renamed from: l */
    public final void mo768l() {
        PeekableFilmstripLayout peekableFilmstripLayout = this.f12232d;
        Bitmap bitmap = this.f12239k;
        bli.m863a(PeekableFilmstripLayout.f12255a, "Attempting to show filmstrip.");
        kpk kpk = peekableFilmstripLayout.f12258d.f2362w;
        if (peekableFilmstripLayout.f12267m.get()) {
            bli.m863a(PeekableFilmstripLayout.f12255a, "Already have pending animation.");
        } else {
            Executor executor;
            peekableFilmstripLayout.f12267m.set(true);
            if (kpk.isDone()) {
                executor = kpq.f8410a;
            } else {
                executor = peekableFilmstripLayout.f12263i;
            }
            kow.m13622a(kpk, new cvn(peekableFilmstripLayout, bitmap), executor);
        }
        this.f12241m.mo1075b();
        if (this.f12242n == null) {
            return;
        }
        if (this.f12229A.m2840a()) {
            crq crq = this.f12242n;
            crq.f2595b.setVisibility(0);
            crq.f2596c.setVisibility(0);
            return;
        }
        this.f12242n.m1437a();
    }

    /* renamed from: m */
    public final void mo769m() {
        mo755a(this.f12238j.getDefaultThumbnail(hip.PLACEHOLDER));
    }

    /* renamed from: a */
    public final void mo757a(ctt ctt) {
        if (this.f12231c.get()) {
            bli.m863a(f12228a, "Activity paused/finishing. Aborting filmstrip show animation.");
            return;
        }
        bli.m863a(f12228a, "Running filmstrip show animation.");
        this.f12237i.setVisibility(0);
        this.f12243o.m1442a();
        this.f12237i.m1244a(this.f12238j);
        FilmstripTransitionLayout filmstripTransitionLayout = this.f12237i;
        filmstripTransitionLayout.f2326j = false;
        filmstripTransitionLayout.m1243a(this.f12239k, ctt);
    }
}
