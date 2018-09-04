package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jzy */
public final class jzy implements kae {
    /* renamed from: a */
    private final /* synthetic */ jzx f21996a;

    public jzy(jzx jzx) {
        this.f21996a = jzx;
    }

    public final void close() {
        try {
            this.f21996a.close();
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
            stringBuilder.append("Handle threw exception: ");
            stringBuilder.append(valueOf);
            Log.e("SafeHandle", stringBuilder.toString());
        }
    }

    /* renamed from: d */
    public final Object mo3190d() {
        return this.f21996a.mo3190d();
    }

    /* renamed from: e */
    public final Object mo3191e() {
        return this.f21996a.mo3191e();
    }
}
