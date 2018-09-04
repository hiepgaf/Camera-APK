package p000;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fmf */
public final class fmf implements kaw, kwk {
    /* renamed from: a */
    private final /* synthetic */ List f16183a;
    /* renamed from: b */
    private final /* synthetic */ Set f16184b;

    public fmf(List list, Set set) {
        this.f16183a = list;
        this.f16184b = set;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        for (fis add : (List) obj) {
            this.f16183a.add(add);
        }
        return new ffw(this.f16183a, this.f16184b);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }
}
