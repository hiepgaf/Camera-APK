package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: jsq */
public final class jsq extends jum {
    /* renamed from: a */
    private final jsr f21902a;
    /* renamed from: b */
    private final float f21903b;
    /* renamed from: c */
    private final int f21904c;
    /* renamed from: d */
    private final int f21905d;

    private jsq(jtv jtv, int i) {
        this.f21902a = new jsr((jtv) jri.m13152b((Object) jtv));
        this.f21903b = 0.8f;
        this.f21904c = i;
        this.f21905d = 1;
    }

    public jsq(jtv jtv, int i, byte b) {
        this(jtv, i);
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        jri.m13152b((Object) juh);
        if (juh.m4646b()) {
            Log.d("ContentValueSegmentFilter", "Empty image set passed in! Nothing to do.");
            return new juh(khb.m4885b());
        }
        List e;
        StringBuilder stringBuilder;
        int i;
        jss jss;
        jsr jsr = this.f21902a;
        jri.m13152b((Object) juh);
        jri.m13152b(jsr.f7948a);
        if (juh.m4646b()) {
            e = ken.m13464e();
        } else {
            long longValue;
            List arrayList = new ArrayList();
            jsr.f7948a.mo2050a();
            Iterator it = juh.iterator();
            while (it.hasNext()) {
                longValue = ((Long) it.next()).longValue();
                stringBuilder = new StringBuilder(34);
                stringBuilder.append("Adding frame: ");
                stringBuilder.append(longValue);
                Log.d("ContentValueSegmentFilter", stringBuilder.toString());
                jsr.f7948a.mo2052c(longValue);
            }
            for (int i2 = 0; i2 < juh.m4648d(); i2++) {
                float a;
                Log.d("ContentValueSegmentFilter", "CalcLeastValueFrame.");
                Iterator it2 = juh.iterator();
                longValue = -1;
                float f = Float.MAX_VALUE;
                while (it2.hasNext()) {
                    Object obj;
                    long longValue2 = ((Long) it2.next()).longValue();
                    stringBuilder = new StringBuilder(39);
                    stringBuilder.append("Considering frame: ");
                    stringBuilder.append(longValue2);
                    Log.d("ContentValueSegmentFilter", stringBuilder.toString());
                    int size = arrayList.size();
                    i = 0;
                    while (i < size) {
                        int i3 = i + 1;
                        long j = ((jss) arrayList.get(i)).f7949a;
                        if (j == longValue2) {
                            stringBuilder = new StringBuilder(43);
                            stringBuilder.append("frame ");
                            stringBuilder.append(j);
                            stringBuilder.append(" already dropped!");
                            Log.d("ContentValueSegmentFilter", stringBuilder.toString());
                            obj = 1;
                            break;
                        }
                        i = i3;
                    }
                    obj = null;
                    if (obj == null) {
                        a = jsr.f7948a.mo2049a(longValue2).mo2076a();
                        StringBuilder stringBuilder2 = new StringBuilder(24);
                        stringBuilder2.append("Score is ");
                        stringBuilder2.append(a);
                        Log.d("ContentValueSegmentFilter", stringBuilder2.toString());
                        if (a < f) {
                            longValue = longValue2;
                        }
                        if (a >= f) {
                            a = f;
                        }
                        f = a;
                    }
                }
                if (longValue == -1) {
                    jss = null;
                } else {
                    jss = new jss(longValue, f);
                }
                if (jss != null) {
                    arrayList.add(jss);
                    jsr.f7948a.mo2051b(jss.f7949a);
                    longValue = jss.f7949a;
                    a = jss.f7950b;
                    StringBuilder stringBuilder3 = new StringBuilder(85);
                    stringBuilder3.append(" Iteration: ");
                    stringBuilder3.append(i2);
                    stringBuilder3.append(" Least value Frame ");
                    stringBuilder3.append(longValue);
                    stringBuilder3.append(" Value: ");
                    stringBuilder3.append(a);
                    Log.d("ContentValueSegmentFilter", stringBuilder3.toString());
                }
            }
            e = arrayList;
        }
        Collection arrayList2 = new ArrayList();
        long j2 = ((jss) e.get(e.size() - 1)).f7949a;
        arrayList2.add(Long.valueOf(j2));
        stringBuilder = new StringBuilder(37);
        stringBuilder.append("Including frame: ");
        stringBuilder.append(j2);
        Log.d("ContentValueSegmentFilter", stringBuilder.toString());
        for (int d = juh.m4648d() - 2; d >= 0; d--) {
            jss = (jss) e.get(d);
            j2 = jss.f7949a;
            StringBuilder stringBuilder4 = new StringBuilder(42);
            stringBuilder4.append("considering including ");
            stringBuilder4.append(j2);
            Log.d("ContentValueSegmentFilter", stringBuilder4.toString());
            if (arrayList2.size() >= this.f21905d) {
                j2 = jss.f7949a;
                float f2 = jss.f7950b;
                StringBuilder stringBuilder5 = new StringBuilder(68);
                stringBuilder5.append("shouldIncludeFrame ");
                stringBuilder5.append(j2);
                stringBuilder5.append(" frameValue = ");
                stringBuilder5.append(f2);
                Log.d("ContentValueSegmentFilter", stringBuilder5.toString());
                if (jss.f7950b >= this.f21903b && arrayList2.size() < this.f21904c) {
                }
            }
            arrayList2.add(Long.valueOf(jss.f7949a));
        }
        i = arrayList2.size();
        StringBuilder stringBuilder6 = new StringBuilder(43);
        stringBuilder6.append("Filtered to a new stack of size ");
        stringBuilder6.append(i);
        Log.d("ContentValueSegmentFilter", stringBuilder6.toString());
        return new juh(arrayList2, juh.f7985b);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21902a.f7948a);
        float f = this.f21903b;
        int i = this.f21904c;
        int i2 = this.f21905d;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 107);
        stringBuilder.append("ContentValueSegmentFilter[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", threshold=");
        stringBuilder.append(f);
        stringBuilder.append(", maxFrames=");
        stringBuilder.append(i);
        stringBuilder.append(", minFrames=");
        stringBuilder.append(i2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
