package p000;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;

/* compiled from: PG */
/* renamed from: bq */
final class bq {
    /* renamed from: a */
    public static final boolean f1426a = true;
    /* renamed from: b */
    public final bo f1427b;
    /* renamed from: c */
    public int f1428c;
    /* renamed from: d */
    public int f1429d;
    /* renamed from: e */
    public int f1430e;
    /* renamed from: f */
    public int f1431f;
    /* renamed from: g */
    public int f1432g;
    /* renamed from: h */
    public int f1433h;
    /* renamed from: i */
    public Mode f1434i;
    /* renamed from: j */
    public ColorStateList f1435j;
    /* renamed from: k */
    public ColorStateList f1436k;
    /* renamed from: l */
    public ColorStateList f1437l;
    /* renamed from: m */
    public final Paint f1438m = new Paint(1);
    /* renamed from: n */
    public GradientDrawable f1439n;
    /* renamed from: o */
    public Drawable f1440o;
    /* renamed from: p */
    public GradientDrawable f1441p;
    /* renamed from: q */
    public Drawable f1442q;
    /* renamed from: r */
    public GradientDrawable f1443r;
    /* renamed from: s */
    public GradientDrawable f1444s;
    /* renamed from: t */
    public GradientDrawable f1445t;
    /* renamed from: u */
    public boolean f1446u;

    public bq(bo boVar) {
        Rect rect = new Rect();
        RectF rectF = new RectF();
        this.f1446u = false;
        this.f1427b = boVar;
    }

    /* renamed from: a */
    final void m940a() {
        Drawable drawable = this.f1443r;
        if (drawable != null) {
            drawable.setTintList(this.f1435j);
            Mode mode = this.f1434i;
            if (mode != null) {
                this.f1443r.setTintMode(mode);
            }
        }
    }

    /* renamed from: a */
    final InsetDrawable m939a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f1428c, this.f1430e, this.f1429d, this.f1431f);
    }
}
