package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: bmt */
public final class bmt {
    /* renamed from: a */
    public static final bsa f1326a = new bsa("camera.narrow_cam");
    /* renamed from: b */
    public static final bsa f1327b = new bsa("camera.wide_cam");

    /* renamed from: a */
    public static float m892a(iun iun) {
        double a = ion.m3935a(iun);
        Collection g = iun.mo1925g();
        double a2 = ion.m3935a(iun);
        float f = -1.0f;
        double d = -100.0d;
        for (Float f2 : iun.mo1925g()) {
            float floatValue;
            double d2;
            double a3 = ion.m3934a(f2.floatValue(), a2);
            if (Math.abs(-1.4085350036621094d + a3) < Math.abs(-1.4085350036621094d + d)) {
                floatValue = f2.floatValue();
                d2 = a3;
            } else {
                double d3 = d;
                floatValue = f;
                d2 = d3;
            }
            f = floatValue;
            d = d2;
        }
        return (float) (a / ion.m3933a(ion.m3934a(f, a), ((Float) Collections.min(g)).floatValue()));
    }

    /* renamed from: a */
    public static iur m894a(iuo iuo, hjf hjf, iut iut) {
        boolean z;
        if (iut != iut.FRONT) {
            z = false;
        } else if (hjf.m3196d()) {
            z = true;
        } else {
            z = false;
        }
        List b = khb.m4885b();
        for (iur a : iuo.mo1347b()) {
            b.add(iuo.mo1343a(a));
        }
        iru iru = new iru(b);
        iru.f7381a = iru.m4135a(iru.f7381a, new irw(iut));
        iru.f7381a = iru.m4135a(iru.f7381a, new irv(z));
        ArrayList b2 = khb.m4885b();
        for (iun d : iru.f7381a) {
            b2.add(d.mo1922d());
        }
        if (b2.isEmpty()) {
            return null;
        }
        if (z) {
            return (iur) b2.get(0);
        }
        List b3 = khb.m4885b();
        int size = b2.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            b3.add(iuo.mo1343a((iur) b2.get(i)));
            i = i2;
        }
        Collections.sort(b3, bmu.f1328a);
        return ((iun) b3.get(0)).mo1922d();
    }
}
