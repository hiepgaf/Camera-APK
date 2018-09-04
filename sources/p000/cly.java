package p000;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: cly */
final class cly implements Callable {
    /* renamed from: a */
    private final /* synthetic */ List f2133a;

    cly(List list) {
        this.f2133a = list;
    }

    public final /* synthetic */ Object call() {
        for (cot a : this.f2133a) {
            a.mo1029a();
        }
        return izg.f7590a;
    }
}
