package p000;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: hzx */
public final class hzx {
    /* renamed from: a */
    public static final Status f6853a = new Status(8, "The connection to Google Play services was lost");
    /* renamed from: b */
    public static final ick[] f6854b = new ick[0];
    /* renamed from: c */
    public final Set f6855c = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    /* renamed from: d */
    private final hzy f6856d = new hzy(this);

    /* renamed from: a */
    final void m3596a(ick ick) {
        this.f6855c.add(ick);
        ick.m12067a(this.f6856d);
    }
}
