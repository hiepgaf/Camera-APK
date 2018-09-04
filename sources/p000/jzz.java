package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jzz */
public final class jzz implements kah {
    /* renamed from: a */
    private final /* synthetic */ kai f23414a;

    public jzz(kai kai) {
        this.f23414a = kai;
    }

    public final void close() {
        try {
            this.f23414a.close();
        } catch (Exception e) {
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
            stringBuilder.append("SharedHandle threw exception: ");
            stringBuilder.append(valueOf);
            Log.e("SafeHandle", stringBuilder.toString());
        }
    }

    /* renamed from: d */
    public final Object mo3190d() {
        return this.f23414a.mo3190d();
    }

    /* renamed from: e */
    public final Object mo3191e() {
        return this.f23414a.mo3191e();
    }

    public final kah D_() {
        return jqk.m13089a(this.f23414a.E_());
    }

    public final /* synthetic */ kai E_() {
        return D_();
    }
}
