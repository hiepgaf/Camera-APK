package com.google.android.apps.camera.legacy.app.filmstrip.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.PowerManager;
import android.provider.Settings.Global;
import android.provider.Settings.SettingNotFoundException;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import p000.bli;
import p000.cfh;
import p000.cfk;
import p000.cfq;
import p000.cpx;
import p000.cre;
import p000.csp;
import p000.cst;
import p000.csx;
import p000.csy;
import p000.cth;
import p000.cub;
import p000.cuo;
import p000.cuq;
import p000.cuw;
import p000.cve;
import p000.cvf;
import p000.cvg;
import p000.err;
import p000.go;
import p000.hfu;
import p000.hfz;
import p000.hjg;
import p000.jri;
import p000.kpw;
import p000.kvl;

@TargetApi(21)
/* compiled from: PG */
public class FilmstripView extends ViewGroup {
    /* renamed from: a */
    public static final String f2338a = bli.m862a("FilmstripView");
    /* renamed from: A */
    private boolean f2339A = true;
    /* renamed from: B */
    private cre f2340B;
    /* renamed from: b */
    public cfh f2341b;
    /* renamed from: c */
    public csp f2342c;
    /* renamed from: d */
    public cub f2343d;
    /* renamed from: e */
    public cpx f2344e;
    /* renamed from: f */
    public final cth f2345f = new cuq(this);
    /* renamed from: g */
    public hfz f2346g;
    /* renamed from: h */
    public int f2347h;
    /* renamed from: i */
    public final Rect f2348i = new Rect();
    /* renamed from: j */
    public float f2349j;
    /* renamed from: k */
    public cuw f2350k;
    /* renamed from: l */
    public int f2351l = -1;
    /* renamed from: m */
    public final cvf[] f2352m = new cvf[5];
    /* renamed from: n */
    public cst f2353n;
    /* renamed from: o */
    public hfu f2354o = null;
    /* renamed from: p */
    public int f2355p;
    /* renamed from: q */
    public TimeInterpolator f2356q;
    /* renamed from: r */
    public boolean f2357r;
    /* renamed from: s */
    public boolean f2358s;
    /* renamed from: t */
    public float f2359t = 1.0f;
    /* renamed from: u */
    public boolean f2360u = false;
    /* renamed from: v */
    public final SparseArray f2361v = new SparseArray();
    /* renamed from: w */
    public kpw f2362w = kpw.m18056d();
    /* renamed from: x */
    public TextView f2363x;
    /* renamed from: y */
    public cve f2364y;
    /* renamed from: z */
    private MotionEvent f2365z;

    public FilmstripView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m1263a() {
        for (int i = 4; i >= 0; i--) {
            cvf cvf = this.f2352m[i];
            if (cvf != null) {
                cvf.f2791a.bringChildToFront(cvf.f2792b);
            }
        }
        bringChildToFront(this.f2354o);
    }

    /* renamed from: a */
    public final void m1266a(cre cre) {
        if (this.f2349j > 1.0f) {
            m1281k();
        }
        if (this.f2342c.mo765i()) {
            bli.m873e(f2338a, "Aborting  animateNodeInsert, activity closing.");
            return;
        }
        cvf[] cvfArr = (cvf[]) this.f2352m.clone();
        List n = m1261n();
        if (this.f2352m[2] == null) {
            n.set(2, cre);
        }
        csy a = csx.m1490a(n, this.f2340B);
        for (int i = 0; i < 5; i++) {
            cre cre2 = (cre) a.f2674a.get(i);
            int intValue = ((Integer) a.f2675b.get(i)).intValue();
            if (cre2 == cre.f2587c) {
                cvfArr[i] = null;
            } else {
                if (intValue == -1 || cre2 == cre) {
                    cvfArr[i] = m1271c(cre2);
                } else {
                    cvf[] cvfArr2 = this.f2352m;
                    cvfArr[i] = cvfArr2[intValue];
                    cvfArr2[intValue] = null;
                }
                if (intValue == -1 || cre2 == cre) {
                    cvfArr[i].m1528a(0.0f);
                    cvfArr[i].m1538c((float) (getHeight() / 8));
                } else {
                    int signum = Integer.signum(intValue - i);
                    cvf cvf = cvfArr[i];
                    cvf.m1535b((float) (signum * (cvf.f2792b.getMeasuredWidth() + this.f2347h)));
                }
                m1267a(cvfArr[i]);
            }
        }
        m1257a(cvfArr);
        for (signum = 0; signum < 5; signum++) {
            cvf = this.f2352m[signum];
            if (cvf != null) {
                cvf.m1540e();
            }
            this.f2352m[signum] = cvfArr[signum];
        }
        int d = m1273d(cre);
        if (d != -1) {
            m1264a(d);
        }
        m1262o();
        if (!(this.f2350k.m8793h() || this.f2357r)) {
            m1282l();
        }
        m1263a();
        invalidate();
        this.f2340B = null;
    }

    /* renamed from: b */
    public final void m1269b(cre cre) {
        if (this.f2349j > 1.0f) {
            m1281k();
        }
        int d = m1273d(cre);
        if (d == -1) {
            m1262o();
            return;
        }
        Object obj = this.f2352m;
        cvf cvf = obj[d];
        cvf[] cvfArr = (cvf[]) obj.clone();
        csy a = csx.m1490a(m1261n(), null);
        for (int i = 0; i < 5; i++) {
            cre cre2 = (cre) a.f2674a.get(i);
            int intValue = ((Integer) a.f2675b.get(i)).intValue();
            if (cre2 == cre.f2587c) {
                cvfArr[i] = null;
            } else {
                if (intValue == -1) {
                    cvfArr[i] = m1271c(cre2);
                } else {
                    cvfArr[i] = this.f2352m[intValue];
                }
                if (intValue != -1) {
                    int signum = Integer.signum(intValue - i);
                    cvf cvf2 = cvfArr[i];
                    cvf2.m1535b((float) (signum * (cvf2.f2792b.getMeasuredWidth() + this.f2347h)));
                    m1267a(cvfArr[i]);
                }
            }
        }
        m1257a(cvfArr);
        for (signum = 0; signum < 5; signum++) {
            this.f2352m[signum] = cvfArr[signum];
        }
        m1262o();
        if (!(this.f2350k.m8793h() || this.f2357r)) {
            m1282l();
        }
        d = getHeight() / 8;
        if (cvf.m1537c() < 0.0f) {
            d = -d;
        }
        cvf.m1536b(((float) d) + cvf.m1537c(), this.f2356q);
        cvf.m1531a(0.0f, this.f2356q);
        postDelayed(new cuo(cvf), 400);
        m1263a();
        invalidate();
        this.f2340B = cre;
    }

    /* renamed from: b */
    public final boolean m1270b() {
        Object obj;
        boolean z;
        PowerManager powerManager = (PowerManager) getContext().getSystemService("power");
        try {
            if (Global.getFloat(getContext().getContentResolver(), "animator_duration_scale") > 0.0f) {
                obj = 1;
            } else {
                obj = null;
            }
        } catch (SettingNotFoundException e) {
            int i = 1;
        }
        if (obj == null) {
            z = false;
        } else if (powerManager.isPowerSaveMode()) {
            z = false;
        } else {
            z = true;
        }
        String str = f2338a;
        StringBuilder stringBuilder = new StringBuilder(26);
        stringBuilder.append("areAnimationsEnabled ");
        stringBuilder.append(z);
        bli.m863a(str, stringBuilder.toString());
        return z;
    }

    /* renamed from: c */
    public final cvf m1271c(cre cre) {
        if (this.f2342c.mo765i()) {
            bli.m873e(f2338a, "Activity destroyed, don't load data");
            return null;
        } else if (cre == cre.f2587c) {
            bli.m873e(f2338a, "Cannot build ViewItem from invalid node. Returning null.");
            return null;
        } else {
            View view;
            boolean z;
            int round = Math.round((float) getWidth());
            int round2 = Math.round((float) getHeight());
            String str = f2338a;
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append("suggesting item bounds: ");
            stringBuilder.append(round);
            stringBuilder.append("x");
            stringBuilder.append(round2);
            bli.m871d(str, stringBuilder.toString());
            this.f2346g.mo1013b(round, round2);
            int a = this.f2346g.mo998a(cre);
            Queue queue = (Queue) this.f2361v.get(this.f2346g.mo1017c(a));
            if (queue != null) {
                view = (View) queue.poll();
            } else {
                view = null;
            }
            if (view != null) {
                view.setVisibility(8);
            }
            if (view != null) {
                z = true;
            } else {
                z = false;
            }
            String str2 = f2338a;
            StringBuilder stringBuilder2 = new StringBuilder(31);
            stringBuilder2.append("getRecycledView, recycled=");
            stringBuilder2.append(z);
            bli.m871d(str2, stringBuilder2.toString());
            view = this.f2346g.mo999a(view, cre, this.f2344e);
            if (view == null) {
                String str3 = f2338a;
                String valueOf = String.valueOf(cre);
                a = this.f2346g.mo1019d();
                stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 64);
                stringBuilder2.append("buildViewItemAt failed with node: ");
                stringBuilder2.append(valueOf);
                stringBuilder2.append(" and adapter size: ");
                stringBuilder2.append(a);
                bli.m873e(str3, stringBuilder2.toString());
                return null;
            }
            cvf cvf = new cvf(a, view, cre, this);
            if (cvf.f2791a.indexOfChild(cvf.f2792b) < 0) {
                cvf.f2791a.addView(cvf.f2792b);
            }
            cvf.m1532a(4);
            cvf.m1528a(1.0f);
            cvf.m1535b(0.0f);
            cvf.m1538c(0.0f);
            return cvf;
        }
    }

    /* renamed from: c */
    public final boolean m1272c() {
        boolean z = false;
        cvf cvf = this.f2352m[2];
        if (cvf != null) {
            if (cvf.m1539d() && this.f2351l < cvf.m1527a()) {
                z = true;
            } else if (cvf.f2797g.mo1063b() == cre.f2587c && this.f2351l > cvf.m1527a()) {
                z = true;
            }
            if (z) {
                this.f2351l = cvf.m1527a();
            }
        }
        return z;
    }

    /* renamed from: c */
    private final void m1259c(int i) {
        if (i <= 0 || i > 5) {
            bli.m873e(f2338a, "fadeAndScaleRightViewItem() - bufferIndex out of bound!");
            return;
        }
        cvf[] cvfArr = this.f2352m;
        cvf cvf = cvfArr[i];
        cvf cvf2 = cvfArr[i - 1];
        if (cvf == null || cvf2 == null) {
            String str = f2338a;
            StringBuilder stringBuilder = new StringBuilder(89);
            stringBuilder.append("fadeAndScaleRightViewItem() - Invalid view item (curr or prev == null).curr = ");
            stringBuilder.append(i);
            bli.m873e(str, stringBuilder.toString());
        } else if (i > 3) {
            cvf.m1532a(4);
        } else {
            int a = cvf2.m1527a();
            if (this.f2351l <= a) {
                cvf.m1532a(4);
                return;
            }
            int a2 = cvf.m1527a();
            float f = (((float) this.f2351l) - ((float) a)) / ((float) (a2 - a));
            cvf.m1533a(this.f2348i, a2, (0.3f * f) + 0.7f);
            cvf.m1528a(f);
            cvf.m1535b(0.0f);
            cvf.m1532a(0);
        }
    }

    /* renamed from: d */
    public final int m1273d(cre cre) {
        for (int i = 0; i < 5; i++) {
            cvf cvf = this.f2352m[i];
            if (cvf != null && cvf.f2797g == cre) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public final cre m1274d() {
        cvf cvf = this.f2352m[2];
        if (cvf == null) {
            return cre.f2587c;
        }
        return cvf.f2797g;
    }

    /* renamed from: n */
    private final List m1261n() {
        List arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            cvf cvf = this.f2352m[i];
            if (cvf == null) {
                arrayList.add(cre.f2587c);
            } else {
                arrayList.add(cvf.f2797g);
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final boolean m1275e() {
        return this.f2349j == 0.7f;
    }

    /* renamed from: f */
    public final boolean m1276f() {
        return this.f2349j == 1.0f;
    }

    /* renamed from: g */
    public final boolean m1277g() {
        return this.f2349j > 1.0f;
    }

    /* renamed from: h */
    public final boolean m1278h() {
        return this.f2352m[2].m1527a() == this.f2351l;
    }

    /* renamed from: a */
    private final void m1256a(boolean z) {
        int i = 1;
        if (this.f2352m[2] != null && this.f2348i.width() != 0 && this.f2348i.height() != 0) {
            if (z) {
                m1282l();
            }
            if (!m1277g()) {
                cvf cvf;
                int width = this.f2348i.width() + this.f2347h;
                m1257a(this.f2352m);
                cvf cvf2 = this.f2352m[2];
                int a = cvf2.m1527a();
                int i2 = this.f2351l;
                if (i2 < a) {
                    m1259c(2);
                } else if (i2 > a) {
                    m1254a(2, width);
                } else {
                    cvf2.m1533a(this.f2348i, i2, this.f2349j);
                    cvf2.m1535b(0.0f);
                    cvf2.m1528a(1.0f);
                    cvf2.m1532a(0);
                }
                while (i >= 0) {
                    if (this.f2352m[i] == null) {
                        i = 3;
                        break;
                    } else {
                        m1254a(i, width);
                        i--;
                    }
                }
                i = 3;
                while (i < 5) {
                    cvf = this.f2352m[i];
                    if (cvf == null) {
                        break;
                    }
                    cvf.m1533a(this.f2348i, this.f2351l, this.f2349j);
                    m1259c(i);
                    i++;
                }
                if (m1275e() || m1276f()) {
                    cvf cvf3;
                    i2 = this.f2351l;
                    int i3 = 0;
                    while (i3 < 5) {
                        cvf3 = this.f2352m[i3];
                        if (cvf3 != null && cvf3.f2796f != kvl.UNSET_ENUM_VALUE) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 != 5) {
                        i = Math.abs(i2 - this.f2352m[i3].m1527a());
                        a = i3 + 1;
                        while (a < 5) {
                            cvf = this.f2352m[a];
                            if (cvf == null) {
                                break;
                            }
                            if (cvf.f2796f == kvl.UNSET_ENUM_VALUE) {
                                width = i3;
                            } else {
                                width = Math.abs(i2 - cvf.m1527a());
                                if (width < i) {
                                    i = width;
                                    width = a;
                                } else {
                                    width = i3;
                                }
                            }
                            a++;
                            i3 = width;
                        }
                    } else {
                        i3 = -1;
                    }
                    if (i3 != -1 && i3 != 2) {
                        width = i3 - 2;
                        cvf[] cvfArr;
                        cvf[] cvfArr2;
                        if (width > 0) {
                            for (i = 0; i < width; i++) {
                                m1260d(i);
                            }
                            i = 0;
                            while (true) {
                                i3 = i + width;
                                if (i3 >= 5) {
                                    break;
                                }
                                cvfArr = this.f2352m;
                                cvfArr[i] = cvfArr[i3];
                                i++;
                            }
                            for (i = 5 - width; i < 5; i++) {
                                cvfArr2 = this.f2352m;
                                cvfArr2[i] = null;
                                cvf2 = cvfArr2[i - 1];
                                if (cvf2 != null) {
                                    cvfArr2[i] = m1271c(cvf2.f2797g.mo1063b());
                                }
                            }
                            m1263a();
                        } else {
                            for (i = 4; i >= width + 5; i--) {
                                m1260d(i);
                            }
                            i = 4;
                            while (true) {
                                i3 = i + width;
                                if (i3 < 0) {
                                    break;
                                }
                                cvfArr = this.f2352m;
                                cvfArr[i] = cvfArr[i3];
                                i--;
                            }
                            for (i = -1 - width; i >= 0; i--) {
                                cvfArr2 = this.f2352m;
                                cvfArr2[i] = null;
                                cvf2 = cvfArr2[i + 1];
                                if (cvf2 != null) {
                                    cvfArr2[i] = m1271c(cvf2.f2797g.mo1064c());
                                }
                            }
                        }
                        invalidate();
                        cst cst = this.f2353n;
                        if (cst != null) {
                            cst.m8717a(m1274d());
                            i = this.f2352m[2].f2795e;
                            this.f2353n.f12618a.f20261L.onScroll(null, i - 2, 5, this.f2346g.mo1019d());
                        }
                        cve cve = this.f2364y;
                        if (cve != null) {
                            cve.mo772a(this.f2352m[2].f2798h);
                        }
                        m1283m();
                        cvf3 = this.f2352m[2];
                        if (cvf3 != null) {
                            width = this.f2351l;
                            i3 = cvf3.f2796f;
                            cvf3.f2796f = 0;
                            this.f2351l = width - i3;
                        }
                        this.f2340B = null;
                    }
                }
            }
        }
    }

    public void onDraw(Canvas canvas) {
        m1256a(false);
        super.onDraw(canvas);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f2350k.m8793h()) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f2339A = true;
            this.f2365z = MotionEvent.obtain(motionEvent);
            return false;
        } else if (motionEvent.getActionMasked() == 5) {
            this.f2339A = false;
            return false;
        } else if (!this.f2339A) {
            return false;
        } else {
            if (motionEvent.getEventTime() - motionEvent.getDownTime() > 500) {
                return false;
            }
            int x = (int) (motionEvent.getX() - this.f2365z.getX());
            int y = (int) (motionEvent.getY() - this.f2365z.getY());
            if (motionEvent.getActionMasked() == 2 && x < (-this.f2355p)) {
                x = Math.abs(x);
                y = Math.abs(y);
                if (x >= y + y) {
                    return true;
                }
            }
            return false;
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Rect rect = this.f2348i;
        rect.left = 0;
        rect.top = 0;
        rect.right = i3 - i;
        rect.bottom = i4 - i2;
        hfu hfu = this.f2354o;
        if (hfu != null) {
            hfu.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
        if (!m1277g() || z) {
            m1281k();
            m1256a(z);
        }
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        if (size != 0 && size2 != 0) {
            for (cvf cvf : this.f2352m) {
                if (cvf != null) {
                    err e = cvf.f2797g.mo1066e();
                    if (e == null) {
                        bli.m873e(f2338a, "measureViewItem() - Trying to measure a null item!");
                    } else {
                        Point a = hjg.m3202a(e.mo1034h().f7329a, e.mo1034h().f7330b, e.mo1038l(), size, size2);
                        cvf.f2794d = a;
                        cvf.f2792b.measure(MeasureSpec.makeMeasureSpec(a.x, 1073741824), MeasureSpec.makeMeasureSpec(a.y, 1073741824));
                    }
                }
            }
            m1272c();
            hfu hfu = this.f2354o;
            if (hfu != null) {
                hfu.measure(MeasureSpec.makeMeasureSpec(i, 1073741824), MeasureSpec.makeMeasureSpec(i2, 1073741824));
            }
        }
    }

    /* renamed from: i */
    public final void m1279i() {
        cvf[] cvfArr;
        this.f2350k.m8786b(true);
        this.f2350k.f12663a.cancel();
        int i = 0;
        while (true) {
            cvfArr = this.f2352m;
            if (i >= cvfArr.length) {
                break;
            }
            cvf cvf = cvfArr[i];
            if (cvf != null) {
                cvf.m1540e();
            }
            i++;
        }
        Arrays.fill(cvfArr, null);
        if (this.f2346g.mo1019d() != 0) {
            this.f2352m[2] = m1271c(this.f2346g.mo1010b(0));
            cvf cvf2 = this.f2352m[2];
            if (cvf2 != null) {
                cvf2.f2796f = 0;
                for (i = 3; i < 5; i++) {
                    cvf[] cvfArr2 = this.f2352m;
                    cvfArr2[i] = m1271c(cvfArr2[i - 1].f2797g.mo1063b());
                    if (this.f2352m[i] == null) {
                        break;
                    }
                }
                this.f2351l = -1;
                this.f2349j = 1.0f;
                m1263a();
                bli.m863a(f2338a, "reload() - Ensure all items are loaded at max size.");
                m1280j();
                invalidate();
                cst cst = this.f2353n;
                if (cst != null) {
                    cst.m8718b();
                    this.f2353n.m8717a(m1274d());
                }
            }
        }
    }

    /* renamed from: d */
    private final void m1260d(int i) {
        cvf[] cvfArr = this.f2352m;
        if (i < cvfArr.length) {
            cvf cvf = cvfArr[i];
            if (cvf != null) {
                if (cvf.f2797g.mo1066e() == null) {
                    bli.m873e(f2338a, "removeItem() - Trying to remove a null item!");
                    return;
                }
                this.f2352m[i].m1540e();
                this.f2352m[i] = null;
            }
        }
    }

    /* renamed from: j */
    public final void m1280j() {
        for (int i = 0; i < 5; i++) {
            m1264a(i);
        }
    }

    /* renamed from: a */
    public final void m1265a(Bitmap bitmap) {
        cvf cvf = this.f2352m[2];
        if (cvf == null) {
            bli.m871d(f2338a, "renderPlaceholderIntoFirstItem() --current filmstrip item is null()");
        } else if (cvf.m1539d()) {
            View view = cvf.f2792b;
            cvf.f2799i = go.f5561Y;
            String str = f2338a;
            int i = cvf.f2795e;
            StringBuilder stringBuilder = new StringBuilder(60);
            stringBuilder.append("[ViewItem:");
            stringBuilder.append(i);
            stringBuilder.append("] data.renderThumbnailWithPlaceholder()");
            bli.m863a(str, stringBuilder.toString());
            cvf.f2798h.mo1043a(view, bitmap);
        } else {
            bli.m871d(f2338a, "renderPlaceholderIntoFirstItem() -- current filmstrip isn't first node");
        }
    }

    /* renamed from: a */
    public final void m1264a(int i) {
        cvf cvf = this.f2352m[i];
        if (cvf != null && cvf.f2799i != go.f5561Y) {
            cvf.f2799i = go.f5561Y;
            String str = f2338a;
            int i2 = cvf.f2795e;
            StringBuilder stringBuilder = new StringBuilder(45);
            stringBuilder.append("[ViewItem:");
            stringBuilder.append(i2);
            stringBuilder.append("] data.renderThumbnail()");
            bli.m863a(str, stringBuilder.toString());
            cvf.f2798h.mo1046c(cvf.f2792b);
        }
    }

    /* renamed from: k */
    public final void m1281k() {
        if (m1277g()) {
            cvf cvf = this.f2352m[2];
            if (cvf != null) {
                this.f2349j = 1.0f;
                cuw cuw = this.f2350k;
                if (cuw.m8794i()) {
                    cuw.f12664b.cancel();
                }
                cuw = this.f2350k;
                if (cuw.m8792g()) {
                    cuw.f12665c.cancel();
                }
                cvf.m1541f();
                this.f2350k.f12668f.f2354o.m3108a();
                this.f2354o.setVisibility(8);
                cuw = this.f2350k;
                for (int i = 0; i < 2; i++) {
                    cvf cvf2 = cuw.f12668f.f2352m[i];
                    if (cvf2 != null) {
                        cvf2.m1532a(0);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m1257a(cvf[] cvfArr) {
        int i = 3;
        cvf cvf = cvfArr[2];
        if (cvf != null) {
            cvf cvf2;
            cvf.f2796f = 0;
            for (int i2 = 1; i2 >= 0; i2--) {
                cvf2 = cvfArr[i2];
                if (cvf2 == null) {
                    break;
                }
                cvf2.f2796f = (cvfArr[i2 + 1].f2796f - cvf2.f2792b.getMeasuredWidth()) - this.f2347h;
            }
            while (i < 5) {
                cvf = cvfArr[i];
                if (cvf != null) {
                    cvf2 = cvfArr[i - 1];
                    cvf.f2796f = (cvf2.f2792b.getMeasuredWidth() + cvf2.f2796f) + this.f2347h;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void m1267a(cvf cvf) {
        TimeInterpolator timeInterpolator = this.f2356q;
        if (cvf.f2800j == null) {
            cvf.f2800j = new ValueAnimator();
            cvf.f2800j.addUpdateListener(new cvg(cvf));
        }
        cvf.m1526a(cvf.f2800j, cvf.m1534b(), 0.0f, timeInterpolator);
        cvf.m1536b(0.0f, this.f2356q);
        cvf.m1531a(1.0f, this.f2356q);
    }

    /* renamed from: o */
    private final void m1262o() {
        for (cvf cvf : this.f2352m) {
            if (cvf != null) {
                cvf.f2795e = this.f2346g.mo998a(cvf.f2797g);
            }
        }
    }

    /* renamed from: a */
    private final void m1254a(int i, int i2) {
        if (i < 0 || i > 4) {
            bli.m873e(f2338a, "translateLeftViewItem() - Index out of bound!");
            return;
        }
        cvf[] cvfArr = this.f2352m;
        cvf cvf = cvfArr[i];
        cvf cvf2 = cvfArr[i + 1];
        if (cvf == null || cvf2 == null) {
            String str = f2338a;
            StringBuilder stringBuilder = new StringBuilder(86);
            stringBuilder.append("translateLeftViewItem() - Invalid view item (curr or next == null). curr = ");
            stringBuilder.append(i);
            bli.m873e(str, stringBuilder.toString());
            return;
        }
        int a = cvf.m1527a();
        int a2 = cvf2.m1527a();
        int i3 = (int) ((float) ((a2 - i2) - a));
        cvf.m1533a(this.f2348i, this.f2351l, this.f2349j);
        cvf.m1528a(1.0f);
        cvf.m1532a(0);
        if (m1276f()) {
            cvf.m1535b((float) ((i3 * (this.f2351l - a)) / (a2 - a)));
        } else {
            cvf.m1535b((float) i3);
        }
    }

    /* renamed from: l */
    public final void m1282l() {
        cvf cvf = this.f2352m[2];
        if (cvf != null) {
            this.f2351l = cvf.m1527a();
        }
    }

    /* renamed from: b */
    public final void m1268b(int i) {
        cvf cvf = this.f2352m[i];
        if (cvf == null) {
            bli.m873e(f2338a, "updateViewItem() - Trying to update an null item!");
            return;
        }
        String str;
        Object obj = cvf.f2797g;
        err e = obj.mo1066e();
        err err = cvf.f2798h;
        if (e.equals(err)) {
            bli.m871d(f2338a, "updateViewItem() - updating data with the same item");
        } else {
            StringBuilder stringBuilder;
            err.mo1027a(cvf.f2792b);
            cvf.f2797g = (cre) jri.m13152b(obj);
            cvf.f2798h = obj.mo1066e();
            cvf.f2794d = hjg.m3202a(cvf.f2798h.mo1034h().f7329a, cvf.f2798h.mo1034h().f7330b, cvf.f2798h.mo1038l(), cvf.f2791a.getMeasuredWidth(), cvf.f2791a.getMeasuredHeight());
            if (cvf.f2799i != go.f5560X) {
                cvf.f2799i = go.f5560X;
                str = f2338a;
                int i2 = cvf.f2795e;
                stringBuilder = new StringBuilder(40);
                stringBuilder.append("[ViewItem:");
                stringBuilder.append(i2);
                stringBuilder.append("] data.renderTiny()");
                bli.m863a(str, stringBuilder.toString());
                cvf.f2798h.mo1047d(cvf.f2792b);
            }
            str = f2338a;
            String valueOf = String.valueOf(e);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 59);
            stringBuilder.append("updateViewItem() - recycling old data item and setting new:");
            stringBuilder.append(valueOf);
            bli.m871d(str, stringBuilder.toString());
        }
        this.f2346g.mo999a(cvf.f2792b, obj, this.f2344e);
        if (m1272c()) {
            this.f2350k.m8786b(true);
        }
        str = f2338a;
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("updateViewItem(bufferIndex: ");
        stringBuilder2.append(i);
        stringBuilder2.append(")");
        bli.m863a(str, stringBuilder2.toString());
        str = f2338a;
        boolean z = this.f2357r;
        StringBuilder stringBuilder3 = new StringBuilder(42);
        stringBuilder3.append("updateViewItem() - mIsUserScrolling: ");
        stringBuilder3.append(z);
        bli.m863a(str, stringBuilder3.toString());
        str = f2338a;
        z = this.f2350k.m8793h();
        stringBuilder3 = new StringBuilder(52);
        stringBuilder3.append("updateViewItem() - mController.isScrolling() - ");
        stringBuilder3.append(z);
        bli.m863a(str, stringBuilder3.toString());
        if (!(this.f2350k.m8793h() && this.f2357r)) {
            m1264a(i);
        }
        if (!(i != 2 || this.f2357r || this.f2350k.m8793h())) {
            m1282l();
        }
        m1263a();
        invalidate();
        cst cst = this.f2353n;
        if (cst != null) {
            cre d = m1274d();
            cfk cfk = cst.f12618a;
            if (!cfk.f20273X) {
                return;
            }
            if (d == cre.f2587c) {
                bli.m873e(cfk.f20249a, "Current data ID not found.");
                cfk.f20263N.m1439a(null);
                cfk.f20300z.m1446c(false);
                cfk.f20300z.m1447d(false);
                cfk.f20300z.m1443a(false);
                cfk.f20300z.m1445b(false);
                cfk.f20300z.m1444b();
                cfk.m14964I();
                return;
            }
            e = d.mo1066e();
            cfk.m14985a(e);
            cfk.m14971P();
            cfk.f20263N.m1439a(e);
            if (cfk.f20298x) {
                cfk.f20300z.m1446c(false);
                cfk.f20300z.m1447d(false);
            } else {
                if (!cfk.f20290p.getAndSet(true)) {
                    cfk.f20289o.mo1903a("NFC#init");
                    NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(cfk.f20280f);
                    if (defaultAdapter != null) {
                        defaultAdapter.setBeamPushUris(null, (Activity) cfk.f20292r.get());
                        defaultAdapter.setBeamPushUrisCallback(new cfq(cfk), (Activity) cfk.f20292r.get());
                        cfk.f20289o.mo1904b();
                    }
                }
                Uri uri = e.mo1033g().f4155h;
                if (uri.equals(Uri.EMPTY)) {
                    cfk.f20291q[0] = null;
                } else {
                    cfk.f20291q[0] = uri;
                }
            }
            int a = cfk.f20256G.mo998a(d);
            if (!cfk.f20256G.mo1023e(a)) {
                cfk.f20256G.mo1024f(a);
            }
        }
    }

    /* renamed from: m */
    public final void m1283m() {
        cvf cvf = this.f2352m[2];
        if (cvf != null) {
            cre cre = cvf.f2797g;
            cst cst = this.f2353n;
            float f = this.f2349j;
            if (cre != cre.f2587c) {
                err e = cre.mo1066e();
                long currentTimeMillis = System.currentTimeMillis() - e.mo1033g().f4153f.getTime();
                if (!TextUtils.isEmpty(e.mo1033g().f4154g) && currentTimeMillis <= 30000) {
                    cst.f12618a.f20266Q.mo1585a(new File(e.mo1033g().f4154g).getName(), e.mo1033g().f4153f.getTime(), f);
                }
            }
        }
    }
}
