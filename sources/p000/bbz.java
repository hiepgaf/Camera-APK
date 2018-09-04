package p000;

import java.util.Collection;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bbz */
public final class bbz {
    /* renamed from: a */
    public static void m790a(ikb ikb, ikb ikb2) {
        iqo b = ikb.mo1880b();
        b.mo1879a(ikb2);
        ikb2.mo1879a(b);
    }

    /* renamed from: a */
    public static wd m789a(UUID uuid, boolean z, String str, boolean z2, wd wdVar) {
        try {
            we.f9447a.m6124a("http://ns.google.com/photos/1.0/creations/", "GCreations");
            we.f9447a.m6124a("http://ns.google.com/photos/1.0/camera/", "GCamera");
            wdVar.mo2518a("http://ns.google.com/photos/1.0/creations/", "CameraBurstID", uuid.toString());
            wdVar.mo2518a("http://ns.google.com/photos/1.0/camera/", "BurstID", uuid.toString());
            if (z) {
                wdVar.mo2518a("http://ns.google.com/photos/1.0/camera/", "BurstPrimary", (Object) "1");
            }
            if (z2) {
                for (String a : erm.f4131a) {
                    wdVar.mo2522a("http://ns.google.com/photos/1.0/camera/", "DisableAutoCreation", new xj(512), a, new xj());
                }
            }
            if (!bve.NONE.m1007d().equals(str)) {
                ern.m2044a(wdVar, str);
            }
            return wdVar;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static wd m788a(UUID uuid, boolean z, String str, boolean z2) {
        return bbz.m789a(uuid, z, str, z2, ern.m2035a());
    }

    /* renamed from: a */
    public static ikb m785a(Collection collection) {
        ikb ikb = new ikb();
        for (ikb a : collection) {
            bbz.m790a(a, ikb);
        }
        return ikb;
    }

    /* renamed from: a */
    public static kpk m787a(iqz iqz, kpk kpk, String str, String str2) {
        kow.m13622a(kpk, new bll(iqz, str, str2), kpq.f8410a);
        return kpk;
    }

    /* renamed from: a */
    public static iqo m786a(String str, String str2) {
        return new blm(str, str2);
    }
}
