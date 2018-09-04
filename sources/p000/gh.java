package p000;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* renamed from: gh */
public final class gh {
    /* renamed from: e */
    private static final Object f5184e = new Object();
    /* renamed from: f */
    private static gh f5185f;
    /* renamed from: a */
    public final Context f5186a;
    /* renamed from: b */
    public final HashMap f5187b = new HashMap();
    /* renamed from: c */
    public final HashMap f5188c = new HashMap();
    /* renamed from: d */
    public final ArrayList f5189d = new ArrayList();

    private gh(Context context) {
        this.f5186a = context;
        gi giVar = new gi(this, context.getMainLooper());
    }

    /* renamed from: a */
    public static gh m2547a(Context context) {
        gh ghVar;
        synchronized (f5184e) {
            if (f5185f == null) {
                f5185f = new gh(context.getApplicationContext());
            }
            ghVar = f5185f;
        }
        return ghVar;
    }
}
