package p000;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: PG */
/* renamed from: ahz */
public final class ahz {
    /* renamed from: i */
    private static final int f475i = 1;
    /* renamed from: a */
    public final Context f476a;
    /* renamed from: b */
    public ActivityManager f477b;
    /* renamed from: c */
    public aia f478c;
    /* renamed from: d */
    public float f479d = 2.0f;
    /* renamed from: e */
    public float f480e = ((float) f475i);
    /* renamed from: f */
    public float f481f = 0.4f;
    /* renamed from: g */
    public float f482g = 0.33f;
    /* renamed from: h */
    public int f483h = 4194304;

    public ahz(Context context) {
        this.f476a = context;
        this.f477b = (ActivityManager) context.getSystemService("activity");
        this.f478c = new aia(context.getResources().getDisplayMetrics());
        if (this.f477b.isLowRamDevice()) {
            this.f480e = 0.0f;
        }
    }
}
