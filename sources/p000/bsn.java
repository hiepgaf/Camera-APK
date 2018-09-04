package p000;

import android.content.ContentResolver;

/* compiled from: PG */
/* renamed from: bsn */
public final class bsn {
    /* renamed from: a */
    private final bsl f1507a;

    bsn(bsl bsl) {
        this.f1507a = bsl;
    }

    /* renamed from: a */
    public final boolean m954a(bsq bsq) {
        bsl bsl = this.f1507a;
        String a = bsl.f1505a.m951a(bsq);
        if (a != null) {
            return bsu.m955a(a);
        }
        bso bso = bsl.f1506b;
        ContentResolver contentResolver = bso.f1508a;
        String valueOf = String.valueOf(bso.f1509b);
        String valueOf2 = String.valueOf(bsq.f1504b);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        valueOf2 = ije.m3774a(contentResolver, valueOf2, "");
        if (kbi.m4752a(valueOf2)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            return bsu.m955a(valueOf2);
        }
        return bsq.f11233a;
    }

    /* renamed from: a */
    public final kbg m952a(bst bst) {
        Integer valueOf;
        bsl bsl = this.f1507a;
        String a = bsl.f1505a.m951a(bst);
        Integer valueOf2 = Integer.valueOf(kvl.UNSET_ENUM_VALUE);
        if (a != null) {
            valueOf2 = Integer.valueOf(Integer.parseInt(a));
        }
        bso bso = bsl.f1506b;
        ContentResolver contentResolver = bso.f1508a;
        String valueOf3 = String.valueOf(bso.f1509b);
        String valueOf4 = String.valueOf(bst.f1504b);
        if (valueOf4.length() == 0) {
            valueOf4 = new String(valueOf3);
        } else {
            valueOf4 = valueOf3.concat(valueOf4);
        }
        valueOf4 = ije.m3774a(contentResolver, valueOf4, "");
        if (kbi.m4752a(valueOf4)) {
            valueOf4 = null;
        }
        if (valueOf4 != null) {
            valueOf = Integer.valueOf(Integer.parseInt(valueOf4));
        } else {
            valueOf = valueOf2;
        }
        if (valueOf.intValue() == kvl.UNSET_ENUM_VALUE) {
            return kau.f19138a;
        }
        int i = bst.f11234a.isEmpty() ? 1 : !bst.f11234a.contains(valueOf) ? 0 : 1;
        a = bst.f1504b;
        keu keu = bst.f11234a;
        if (i != 0) {
            return kbg.m4745c(valueOf);
        }
        throw new IllegalStateException(jri.m13141a("%s must be one of: %s", a, keu));
    }

    /* renamed from: a */
    public final boolean m953a(bry bry) {
        if (!(bry instanceof bsq) && !(bry instanceof bst)) {
            return false;
        }
        brv brv = this.f1507a.f1505a;
        jri.m13152b((Object) bry);
        if (brv.f1503a.m4274a(bry.f1504b) == null) {
            iwc iwc = brv.f1503a;
            String valueOf = String.valueOf("persist.");
            String valueOf2 = String.valueOf(bry.f1504b);
            if (valueOf2.length() == 0) {
                valueOf2 = new String(valueOf);
            } else {
                valueOf2 = valueOf.concat(valueOf2);
            }
            if (iwc.m4274a(valueOf2) == null) {
                return false;
            }
        }
        return true;
    }
}
