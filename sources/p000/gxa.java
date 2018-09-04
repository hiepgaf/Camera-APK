package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gxa */
public final class gxa extends View implements gwy, gzk {
    /* renamed from: a */
    public final gwu f17529a = new gwu(this.f17532d, this.f17535g);
    /* renamed from: b */
    public final gxh f17530b = new gxh(this.f17532d, this.f17535g);
    /* renamed from: c */
    public bsn f17531c;
    /* renamed from: d */
    private final gzi f17532d = new gzi(this, new hkc());
    /* renamed from: e */
    private final gzl f17533e;
    /* renamed from: f */
    private final float f17534f;
    /* renamed from: g */
    private final Paint f17535g;
    /* renamed from: h */
    private gwz f17536h;
    /* renamed from: i */
    private boolean f17537i;
    /* renamed from: j */
    private float f17538j;
    /* renamed from: k */
    private int f17539k;
    /* renamed from: l */
    private int f17540l;

    static {
        bli.m862a("FocusRingView");
        bsa bsa = new bsa("camera.focus.debug");
    }

    public gxa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((gxb) ((cct) context).mo2796a(gxb.class)).mo2724a(this);
        Resources resources = getResources();
        this.f17535g = gxa.m11640a(resources, (int) R.color.focus_color);
        gxa.m11640a(resources, (int) R.color.focus_debug);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.focus_circle_min_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.focus_circle_max_size);
        this.f17534f = (float) resources.getDimensionPixelSize(R.dimen.focus_circle_initial_size);
        this.f17533e = new gzl((float) dimensionPixelSize, (float) dimensionPixelSize2);
        this.f17532d.f17574a.add(this.f17529a);
        this.f17532d.f17574a.add(this.f17530b);
        this.f17537i = true;
        this.f17538j = this.f17534f;
    }

    /* renamed from: f */
    private final void m11641f() {
        gwz gwz = this.f17529a;
        gwz.f17523i = this.f17539k;
        gwz.f17524j = this.f17540l;
    }

    /* renamed from: a */
    public final void mo1666a() {
        getLocationInWindow(new int[2]);
        this.f17538j = this.f17534f;
        if (!this.f17537i) {
            m11641f();
        }
    }

    /* renamed from: b */
    public final boolean mo1669b() {
        return this.f17530b.mo1664a();
    }

    /* renamed from: c */
    public final boolean mo1670c() {
        return this.f17529a.mo1664a();
    }

    /* renamed from: a */
    private static Paint m11640a(Resources resources, int i) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(resources.getColor(i));
        paint.setStyle(Style.STROKE);
        paint.setStrokeCap(Cap.ROUND);
        paint.setStrokeWidth(resources.getDimension(R.dimen.focus_circle_stroke));
        return paint;
    }

    protected final void onDraw(Canvas canvas) {
        if (this.f17537i) {
            this.f17537i = false;
            m11641f();
        }
        gzi gzi = this.f17532d;
        gzi.f17577d = true;
        gzi.f17576c = false;
        gzi.f17579f = SystemClock.uptimeMillis();
        if (gzi.f17578e <= 0) {
            gzi.f17578e = gzi.f17579f;
        }
        long j = gzi.f17579f;
        long j2 = j - gzi.f17578e;
        gzi.f17578e = j;
        for (gzh gzh : gzi.f17574a) {
            if (gzh.mo1664a()) {
                gzh.mo3065a(gzi.f17579f, j2, canvas);
            }
        }
        if (gzi.f17576c) {
            gzi.f17575b.invalidate();
        } else {
            gzi.f17578e = -1;
        }
        gzi.f17577d = false;
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f17539k = (i3 - i) / 2;
        this.f17540l = (i4 - i2) / 2;
    }

    /* renamed from: a */
    public final void mo1668a(float f, float f2) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[1];
        int i2 = (int) (f - ((float) iArr[0]));
        gwz gwz = this.f17529a;
        gwz.f17523i = i2;
        i = (int) (f2 - ((float) i));
        gwz.f17524j = i;
        gwz = this.f17530b;
        gwz.f17523i = i2;
        gwz.f17524j = i;
    }

    /* renamed from: a */
    public final void mo1667a(float f) {
        gzl gzl = this.f17533e;
        float f2 = gzl.f5858a;
        if (f2 < 0.0f) {
            f2 = Math.max(f2, Math.min(0.0f, f));
        } else {
            f2 = Math.max(0.0f, Math.min(f2, f));
        }
        float f3 = gzl.f5859b + (f2 * gzl.f5860c);
        long a = this.f17532d.m11684a();
        gwz gwz = this.f17536h;
        if (gwz != null && f3 > 0.1f) {
            if (gwz.f17528n == go.bk && ((double) Math.abs(gwz.f17518d.f5853a - f3)) > 0.1d) {
                String str = gwz.f17515a;
                StringBuilder stringBuilder = new StringBuilder(70);
                stringBuilder.append("FOCUS STATE ENTER VIA setRadius(");
                stringBuilder.append(a);
                stringBuilder.append(", ");
                stringBuilder.append(f3);
                stringBuilder.append(")");
                bli.m871d(str, stringBuilder.toString());
                gwz.f17528n = go.bi;
                float f4 = gwz.f17521g;
                long j = gwz.f17526l;
                float f5 = gwz.f17522h;
                if (((float) j) + f5 > ((float) a)) {
                    a -= (long) (f4 * gzo.m2957a(gwz.f17520f, gwz.f17519e, ((float) (a - j)) / f5));
                }
                gwz.f17525k = a;
            }
            gwz.f17518d.f5853a = f3;
            this.f17538j = f3;
        }
    }

    /* renamed from: d */
    public final void mo1671d() {
        this.f17532d.invalidate();
        long a = this.f17532d.m11684a();
        if (this.f17529a.mo1664a() && !this.f17529a.m11637b()) {
            this.f17529a.m11634a(a);
        }
        this.f17530b.m11635a(a, 0.0f, this.f17538j);
        this.f17536h = this.f17530b;
    }

    /* renamed from: e */
    public final void mo1672e() {
        this.f17532d.invalidate();
        long a = this.f17532d.m11684a();
        if (this.f17530b.mo1664a() && !this.f17530b.m11637b()) {
            this.f17530b.m11634a(a);
        }
        gwu gwu = this.f17529a;
        float f = this.f17538j;
        gwu.m11635a(a, f, f);
        this.f17536h = this.f17529a;
    }
}
