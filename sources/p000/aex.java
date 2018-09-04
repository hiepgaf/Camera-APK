package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: aex */
public final class aex extends WeakReference {
    /* renamed from: a */
    public final adl f365a;
    /* renamed from: b */
    public final boolean f366b;
    /* renamed from: c */
    public agn f367c;

    aex(adl adl, age age, ReferenceQueue referenceQueue, boolean z) {
        super(age, referenceQueue);
        this.f365a = (adl) aqe.m585a((Object) adl, "Argument must not be null");
        agn agn = age.f9743a ? !z ? null : (agn) aqe.m585a(age.f9744b, "Argument must not be null") : null;
        this.f367c = agn;
        this.f366b = age.f9743a;
    }

    /* renamed from: a */
    final void m198a() {
        this.f367c = null;
        clear();
    }
}
