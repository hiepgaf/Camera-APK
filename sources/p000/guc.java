package p000;

import android.os.storage.StorageManager;

/* compiled from: PG */
/* renamed from: guc */
public final class guc implements kwk {
    /* renamed from: a */
    private final kwk f17346a;
    /* renamed from: b */
    private final kwk f17347b;

    private guc(kwk kwk, kwk kwk2) {
        this.f17346a = kwk;
        this.f17347b = kwk2;
    }

    /* renamed from: a */
    public static guc m11542a(kwk kwk, kwk kwk2) {
        return new guc(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        return new gub((StorageManager) this.f17346a.mo345a(), (ivx) this.f17347b.mo345a());
    }
}
