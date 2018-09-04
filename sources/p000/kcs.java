package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kcs */
abstract class kcs extends kbv implements kgq {
    public static final long serialVersionUID = 7431625294878419160L;

    protected kcs(Map map) {
        super(map);
    }

    /* renamed from: b */
    abstract Set mo3610b();

    /* renamed from: a */
    /* synthetic */ Collection mo3504a() {
        return mo3610b();
    }

    /* renamed from: l */
    public /* synthetic */ Collection mo3506l() {
        return mo3612p();
    }

    /* renamed from: p */
    public Set mo3612p() {
        return (Set) super.mo3506l();
    }

    /* renamed from: a */
    public /* synthetic */ Collection mo3199a(Object obj) {
        return mo3611b(obj);
    }

    /* renamed from: b */
    public Set mo3611b(Object obj) {
        return (Set) super.mo3199a(obj);
    }

    /* renamed from: a */
    final Collection mo3505a(Object obj, Collection collection) {
        return new kcj(this, obj, (Set) collection);
    }
}
