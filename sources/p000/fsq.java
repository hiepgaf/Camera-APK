package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fsq */
public final class fsq implements AutoCloseable {
    /* renamed from: a */
    public final Set f4693a;
    /* renamed from: b */
    public final List f4694b = new ArrayList();
    /* renamed from: c */
    public final fss f4695c;
    /* renamed from: d */
    private final List f4696d = new ArrayList();

    public fsq(Set set, fss fss) {
        this.f4693a = set;
        this.f4695c = fss;
    }

    public final void close() {
        kow.m13622a(iel.m3718a(kow.m13616a(this.f4694b), kow.m13616a(this.f4696d), new fsu(this)), new fst(this), kpq.f8410a);
    }
}
