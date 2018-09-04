package p000;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* renamed from: kto */
public final class kto {
    /* renamed from: a */
    public static final kto f8542a = new kto();
    /* renamed from: b */
    private final kts f8543b;
    /* renamed from: c */
    private final ConcurrentMap f8544c = new ConcurrentHashMap();

    private kto() {
        kts a;
        String[] strArr = new String[]{"com.google.protobuf.AndroidProto3SchemaFactory"};
        kts kts = null;
        for (int i = 0; i <= 0; i = 1) {
            a = kto.m5173a(strArr[0]);
            if (a != null) {
                break;
            }
            kts = a;
        }
        a = kts;
        if (a == null) {
            a = new ksu();
        }
        this.f8543b = a;
    }

    /* renamed from: a */
    private static kts m5173a(String str) {
        try {
            return (kts) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public final ktr m5174a(Class cls) {
        ksd.m5133a((Object) cls, "messageType");
        ktr ktr = (ktr) this.f8544c.get(cls);
        if (ktr != null) {
            return ktr;
        }
        ktr a = this.f8543b.mo2292a(cls);
        ksd.m5133a((Object) cls, "messageType");
        ksd.m5133a((Object) a, "schema");
        ktr = (ktr) this.f8544c.putIfAbsent(cls, a);
        if (ktr == null) {
            return a;
        }
        return ktr;
    }

    /* renamed from: a */
    public final ktr m5175a(Object obj) {
        return m5174a(obj.getClass());
    }
}
