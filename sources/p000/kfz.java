package p000;

import java.io.Serializable;

/* compiled from: PG */
/* renamed from: kfz */
final class kfz extends kfw implements Serializable {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final Object f22024a;
    /* renamed from: b */
    private final int f22025b;

    kfz(Object obj, int i) {
        this.f22024a = obj;
        this.f22025b = i;
        khb.m4859a(i, "count");
    }

    /* renamed from: a */
    public final int mo3239a() {
        return this.f22025b;
    }

    /* renamed from: b */
    public final Object mo3240b() {
        return this.f22024a;
    }
}
