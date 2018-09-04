package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: kee */
public abstract class kee extends kes implements kcx {
    kee() {
    }

    /* renamed from: c */
    public abstract kee mo3241c();

    /* renamed from: b */
    final /* synthetic */ keh mo2131b() {
        throw new AssertionError("should never be called");
    }

    /* renamed from: a */
    public /* synthetic */ kcx mo2130a() {
        return mo3241c();
    }

    /* renamed from: a */
    public static kee m13438a(Object obj, Object obj2, Object obj3, Object obj4) {
        khb.m4892b(obj, obj2);
        khb.m4892b(obj3, obj4);
        return new kgg(new Object[]{obj, obj2, obj3, obj4}, 2);
    }

    /* renamed from: a */
    public static kee m13439a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        khb.m4892b(obj, obj2);
        khb.m4892b(obj3, obj4);
        khb.m4892b(obj5, obj6);
        return new kgg(new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, 3);
    }

    /* renamed from: d */
    public final /* synthetic */ keh mo2132d() {
        return mo3241c().m4816j();
    }

    public /* synthetic */ Collection values() {
        return mo3241c().m4816j();
    }

    Object writeReplace() {
        return new keg(this);
    }
}
