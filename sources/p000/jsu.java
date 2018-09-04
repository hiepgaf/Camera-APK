package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jsu */
public final class jsu implements jso {
    /* renamed from: a */
    public final List mo2047a(List list) {
        int i = 0;
        int i2 = 0;
        for (jsp jsp : list) {
            int a;
            String b = jsp.f7946a.mo2012b();
            if (jiu.m4512b(b) && jiu.m4511a(b) > i) {
                a = jiu.m4511a(b);
                i = i2;
            } else if (!jiu.m4513c(b)) {
                a = i;
                i = i2;
            } else if (jiu.m4511a(b) > i2) {
                i2 = jiu.m4511a(b);
                a = i;
                i = i2;
            } else {
                a = i;
                i = i2;
            }
            i2 = i;
            i = a;
        }
        List arrayList = new ArrayList();
        for (jsp jsp2 : list) {
            String b2 = jsp2.f7946a.mo2012b();
            if ((!jiu.m4512b(b2) || jiu.m4511a(b2) >= i) && (!jiu.m4513c(b2) || jiu.m4511a(b2) >= i2)) {
                arrayList.add(jsp2);
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "HighestPriorityInTypeArtifactFilter";
    }
}
