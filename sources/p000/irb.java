package p000;

import android.annotation.TargetApi;
import android.os.Trace;

@TargetApi(18)
/* compiled from: PG */
/* renamed from: irb */
public final class irb implements ird {
    /* renamed from: a */
    private final String f18517a;

    public irb() {
        this("");
    }

    public irb(String str) {
        this.f18517a = str;
    }

    /* renamed from: a */
    public final void mo1902a() {
    }

    /* renamed from: a */
    public final void mo1903a(String str) {
        Trace.beginSection(String.format(null, "%s_%s", new Object[]{this.f18517a, str}));
    }

    /* renamed from: b */
    public final void mo1904b() {
        Trace.endSection();
    }

    /* renamed from: b */
    public final void mo1905b(String str) {
        Trace.endSection();
        mo1903a(str);
    }
}
