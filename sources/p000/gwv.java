package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gwv */
public final class gwv implements ham {
    /* renamed from: a */
    public static final String f17487a = bli.m862a("FocusOverlayMgr");
    /* renamed from: b */
    public static final int f17488b = 4000;
    /* renamed from: c */
    public static final float f17489c = 0.2f;
    /* renamed from: d */
    public static final float f17490d = 0.3f;
    /* renamed from: A */
    private final String f17491A;
    /* renamed from: B */
    private final irs f17492B;
    /* renamed from: e */
    public int f17493e = 0;
    /* renamed from: f */
    public boolean f17494f;
    /* renamed from: g */
    public boolean f17495g;
    /* renamed from: h */
    public boolean f17496h;
    /* renamed from: i */
    public boolean f17497i;
    /* renamed from: j */
    public int f17498j;
    /* renamed from: k */
    public List f17499k;
    /* renamed from: l */
    public List f17500l;
    /* renamed from: m */
    public abc f17501m;
    /* renamed from: n */
    public final Handler f17502n;
    /* renamed from: o */
    public gww f17503o;
    /* renamed from: p */
    public boolean f17504p;
    /* renamed from: q */
    public final atb f17505q;
    /* renamed from: r */
    public final Rect f17506r = new Rect(0, 0, 0, 0);
    /* renamed from: s */
    public hin f17507s;
    /* renamed from: t */
    public long f17508t;
    /* renamed from: u */
    private hie f17509u;
    /* renamed from: v */
    private boolean f17510v;
    /* renamed from: w */
    private abc f17511w;
    /* renamed from: x */
    private final List f17512x;
    /* renamed from: y */
    private aaz f17513y;
    /* renamed from: z */
    private final gos f17514z;

    public gwv(gos gos, String str, List list, aaz aaz, gww gww, boolean z, Looper looper, atb atb, irs irs) {
        this.f17514z = gos;
        this.f17491A = str;
        this.f17512x = new ArrayList(list);
        this.f17503o = gww;
        this.f17505q = atb;
        this.f17492B = irs;
        this.f17502n = new gwx(this, looper);
        m11628a(aaz);
        this.f17510v = z;
        m11632c();
    }

    /* renamed from: a */
    public final void m11627a(int i) {
        this.f17493e = i;
        this.f17503o.mo3410m();
        this.f17502n.removeMessages(0);
    }

    /* renamed from: a */
    public final void m11626a() {
        bli.m871d(f17487a, "Cancel autofocus.");
        m11633d();
        this.f17503o.mo3411n();
        this.f17493e = 0;
        this.f17502n.removeMessages(0);
    }

    /* renamed from: b */
    public final void m11631b() {
        if (this.f17503o.mo3412o()) {
            this.f17493e = 0;
            this.f17502n.removeMessages(0);
        }
    }

    /* renamed from: a */
    public final Rect m11625a(int i, int i2, int i3) {
        int i4 = i3 / 2;
        Rect rect = this.f17506r;
        int a = hjg.m3200a(i - i4, rect.left, rect.right - i3);
        Rect rect2 = this.f17506r;
        i4 = hjg.m3200a(i2 - i4, rect2.top, rect2.bottom - i3);
        RectF rectF = new RectF((float) a, (float) i4, (float) (a + i3), (float) (i4 + i3));
        hie hie = this.f17509u;
        RectF rectF2 = new RectF();
        hie.f6224a.mapRect(rectF2, rectF);
        return hjg.m3203a(rectF2);
    }

    /* renamed from: a */
    public final abc m11624a(abc abc) {
        if (this.f17513y == null) {
            bli.m871d(f17487a, "no capabilities, returning default AUTO focus mode");
            return abc.AUTO;
        }
        String d;
        String valueOf;
        abc b;
        StringBuilder stringBuilder;
        if (!this.f17495g || this.f17499k == null) {
            d = this.f17514z.mo1543d(this.f17491A, "pref_camera_focusmode_key");
            String str = f17487a;
            valueOf = String.valueOf(d);
            String str2 = "stored focus setting for camera: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m871d(str, valueOf);
            if (d != null) {
                abe abe = this.f17513y.f69w;
                b = abe.m47b(d);
            } else {
                b = null;
            }
            this.f17511w = b;
            valueOf = f17487a;
            d = String.valueOf(this.f17511w);
            stringBuilder = new StringBuilder(String.valueOf(d).length() + 34);
            stringBuilder.append("focus mode resolved from setting: ");
            stringBuilder.append(d);
            bli.m871d(valueOf, stringBuilder.toString());
            if (this.f17511w == null) {
                for (abc b2 : this.f17512x) {
                    if (this.f17513y.m34a(b2)) {
                        this.f17511w = b2;
                        d = f17487a;
                        valueOf = String.valueOf(b2);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        stringBuilder.append("selected supported focus mode from default list");
                        stringBuilder.append(valueOf);
                        bli.m871d(d, stringBuilder.toString());
                        break;
                    }
                }
            }
        } else {
            bli.m871d(f17487a, "in tap to focus, returning AUTO focus mode");
            this.f17511w = abc.AUTO;
        }
        b2 = this.f17511w;
        if (b2 == null || !this.f17513y.m34a(b2)) {
            if (this.f17513y.m34a(abc.AUTO)) {
                bli.m871d(f17487a, "no supported focus mode, falling back to AUTO");
                this.f17511w = abc.AUTO;
            } else {
                valueOf = f17487a;
                d = String.valueOf(abc);
                stringBuilder = new StringBuilder(String.valueOf(d).length() + 50);
                stringBuilder.append("no supported focus mode, falling back to current: ");
                stringBuilder.append(d);
                bli.m871d(valueOf, stringBuilder.toString());
                this.f17511w = abc;
            }
        }
        return this.f17511w;
    }

    /* renamed from: b */
    public static boolean m11623b(abc abc) {
        return (abc == abc.INFINITY || abc == abc.FIXED || abc == abc.EXTENDED_DOF) ? false : true;
    }

    /* renamed from: a */
    public final void m11630a(boolean z) {
        int i = this.f17493e;
        if (i == 2) {
            if (z) {
                this.f17493e = 3;
            } else {
                this.f17493e = 4;
            }
            m11631b();
        } else if (i == 1) {
            if (z) {
                this.f17493e = 3;
            } else {
                this.f17493e = 4;
            }
            if (this.f17499k != null) {
                this.f17502n.sendEmptyMessageDelayed(0, (long) f17488b);
            }
        }
    }

    /* renamed from: a */
    public final void mo1132a(RectF rectF) {
        Rect a = hjg.m3203a(rectF);
        if (!this.f17506r.equals(a)) {
            this.f17506r.set(a);
            m11632c();
            this.f17494f = true;
        }
    }

    /* renamed from: c */
    public final void m11632c() {
        if (this.f17506r.width() <= 0 || this.f17506r.height() <= 0) {
            bli.m873e(f17487a, "The coordinate transformer could not be built because the preview rectdid not have a width and height");
        } else {
            this.f17509u = new hie(this.f17510v, this.f17498j, hjg.m3204a(this.f17506r));
        }
    }

    /* renamed from: d */
    public final void m11633d() {
        if (this.f17494f) {
            this.f17499k = null;
            this.f17500l = null;
            this.f17503o.mo3414s();
            hin hin = this.f17507s;
            if (hin != null) {
                this.f17492B.mo1582a(hin, Float.valueOf(((float) (System.currentTimeMillis() - this.f17508t)) * 0.001f), false);
                this.f17507s = null;
            }
        }
    }

    /* renamed from: a */
    public final void m11628a(aaz aaz) {
        if (aaz != null) {
            this.f17513y = aaz;
            this.f17495g = this.f17513y.m32a(aba.FOCUS_AREA);
            this.f17496h = this.f17513y.m32a(aba.METERING_AREA);
            if (!this.f17513y.m32a(aba.AUTO_EXPOSURE_LOCK) && this.f17513y.m32a(aba.AUTO_WHITE_BALANCE_LOCK)) {
            }
        }
    }
}
