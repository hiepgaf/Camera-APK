package p000;

import android.hardware.camera2.CaptureResult.Key;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ftb */
public final class ftb {
    /* renamed from: a */
    public final List f4708a;

    ftb(List list) {
        this.f4708a = list;
    }

    /* renamed from: a */
    public final boolean m2381a(Key key, Object obj) {
        return m2382a(key, obj);
    }

    @SafeVarargs
    /* renamed from: a */
    public final boolean m2382a(Key key, Object... objArr) {
        boolean z;
        if (objArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        Set hashSet = new HashSet(Arrays.asList(objArr));
        for (iwp a : this.f4708a) {
            if (!hashSet.contains(a.mo3143a(key))) {
                return false;
            }
        }
        return true;
    }
}
