package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ewi */
public final class ewi implements kwk {
    /* renamed from: a */
    private final kwk f15640a;
    /* renamed from: b */
    private final kwk f15641b;
    /* renamed from: c */
    private final kwk f15642c;
    /* renamed from: d */
    private final kwk f15643d;

    private ewi(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f15640a = kwk;
        this.f15641b = kwk2;
        this.f15642c = kwk3;
        this.f15643d = kwk4;
    }

    /* renamed from: a */
    public static ewi m10005a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new ewi(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15640a;
        kwk kwk2 = this.f15641b;
        evb evb = (evb) kwk.mo345a();
        euj euj = (euj) kwk2.mo345a();
        this.f15643d.mo345a();
        List arrayList = new ArrayList();
        arrayList.add(evb);
        arrayList.add(euj);
        return (List) ktm.m13963a(arrayList, "Cannot return null from a non-@Nullable @Provides method");
    }
}
