package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: krn */
public final class krn {
    /* renamed from: a */
    public static final krn f8444a = new krn((byte) 0);
    /* renamed from: c */
    private static volatile boolean f8445c = false;
    /* renamed from: b */
    public final Map f8446b;

    static {
        krn.m5105c();
    }

    krn() {
        this.f8446b = new HashMap();
    }

    private krn(byte b) {
        this.f8446b = Collections.emptyMap();
    }

    /* renamed from: a */
    public static krn m5103a() {
        return krm.m5101b();
    }

    /* renamed from: b */
    public static krn m5104b() {
        return krm.m5099a();
    }

    /* renamed from: c */
    private static Class m5105c() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }
}
