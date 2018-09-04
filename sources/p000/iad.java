package p000;

import android.content.Context;

/* renamed from: iad */
public final class iad {
    /* renamed from: a */
    public static iad f6871a = new iad();
    /* renamed from: b */
    private iac f6872b = null;

    /* renamed from: a */
    public final synchronized iac m3601a(Context context) {
        if (this.f6872b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f6872b = new iac(context);
        }
        return this.f6872b;
    }
}
