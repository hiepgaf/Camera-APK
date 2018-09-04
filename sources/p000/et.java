package p000;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: et */
final class et implements fc {
    /* renamed from: a */
    private final /* synthetic */ Object f15507a;
    /* renamed from: b */
    private final /* synthetic */ ArrayList f15508b;
    /* renamed from: c */
    private final /* synthetic */ Object f15509c;
    /* renamed from: d */
    private final /* synthetic */ ArrayList f15510d;
    /* renamed from: e */
    private final /* synthetic */ Object f15511e;
    /* renamed from: f */
    private final /* synthetic */ ArrayList f15512f;
    /* renamed from: g */
    private final /* synthetic */ er f15513g;

    et(er erVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f15513g = erVar;
        this.f15507a = obj;
        this.f15508b = arrayList;
        this.f15509c = obj2;
        this.f15510d = arrayList2;
        this.f15511e = obj3;
        this.f15512f = arrayList3;
    }

    /* renamed from: a */
    public final void mo1274a(ex exVar) {
    }

    /* renamed from: a */
    public final void mo1273a() {
    }

    /* renamed from: b */
    public final void mo1275b() {
    }

    /* renamed from: c */
    public final void mo1276c() {
        Object obj = this.f15507a;
        if (obj != null) {
            this.f15513g.replaceTargets(obj, this.f15508b, null);
        }
        obj = this.f15509c;
        if (obj != null) {
            this.f15513g.replaceTargets(obj, this.f15510d, null);
        }
        obj = this.f15511e;
        if (obj != null) {
            this.f15513g.replaceTargets(obj, this.f15512f, null);
        }
    }
}
