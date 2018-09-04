package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* compiled from: PG */
/* renamed from: dm */
public final class dm extends MarginLayoutParams {
    /* renamed from: a */
    public dj f3132a;
    /* renamed from: b */
    public boolean f3133b = false;
    /* renamed from: c */
    public int f3134c = 0;
    /* renamed from: d */
    public int f3135d = 0;
    /* renamed from: e */
    public int f3136e = -1;
    /* renamed from: f */
    public int f3137f = -1;
    /* renamed from: g */
    public int f3138g = 0;
    /* renamed from: h */
    public int f3139h = 0;
    /* renamed from: i */
    public int f3140i;
    /* renamed from: j */
    public int f3141j;
    /* renamed from: k */
    public View f3142k;
    /* renamed from: l */
    public View f3143l;
    /* renamed from: m */
    public boolean f3144m;
    /* renamed from: n */
    public boolean f3145n;
    /* renamed from: o */
    public final Rect f3146o = new Rect();
    /* renamed from: p */
    private boolean f3147p;
    /* renamed from: q */
    private boolean f3148q;

    public dm() {
        super(-2, -2);
    }

    public dm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ar.f895b);
        this.f3134c = obtainStyledAttributes.getInteger(ar.f896c, 0);
        this.f3137f = obtainStyledAttributes.getResourceId(ar.f897d, -1);
        this.f3135d = obtainStyledAttributes.getInteger(ar.f898e, 0);
        this.f3136e = obtainStyledAttributes.getInteger(ar.f902i, -1);
        this.f3138g = obtainStyledAttributes.getInt(ar.f901h, 0);
        this.f3139h = obtainStyledAttributes.getInt(ar.f900g, 0);
        this.f3133b = obtainStyledAttributes.hasValue(ar.f899f);
        if (this.f3133b) {
            this.f3132a = CoordinatorLayout.m6715a(context, attributeSet, obtainStyledAttributes.getString(ar.f899f));
        }
        obtainStyledAttributes.recycle();
        dj djVar = this.f3132a;
        if (djVar != null) {
            djVar.mo127a(this);
        }
    }

    public dm(dm dmVar) {
        super(dmVar);
    }

    public dm(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public dm(MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    /* renamed from: a */
    public final boolean m1659a(int i) {
        switch (i) {
            case 0:
                return this.f3147p;
            case 1:
                return this.f3148q;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final void m1658a(dj djVar) {
        if (this.f3132a != djVar) {
            this.f3132a = djVar;
            this.f3133b = true;
            if (djVar != null) {
                djVar.mo127a(this);
            }
        }
    }

    /* renamed from: a */
    public final void m1657a(int i, boolean z) {
        switch (i) {
            case 0:
                this.f3147p = z;
                return;
            case 1:
                this.f3148q = z;
                return;
            default:
                return;
        }
    }
}
