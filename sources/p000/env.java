package p000;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: env */
final class env implements enw {
    /* renamed from: a */
    private final /* synthetic */ Bundle f15306a;

    env(enr enr, Bundle bundle) {
        this.f15306a = bundle;
    }

    /* renamed from: a */
    public final void mo1236a(eol eol) {
        if (eol instanceof eoi) {
            Bundle bundle = new Bundle();
            ((eoi) eol).m1922a();
            this.f15306a.putBundle((String) jri.m13152b(enr.m1904b(eol)), bundle);
        }
    }
}
