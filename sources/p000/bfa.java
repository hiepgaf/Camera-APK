package p000;

import android.media.CamcorderProfile;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* renamed from: bfa */
public final class bfa {
    /* renamed from: a */
    public static final String f1116a = bli.m862a("CdrCharFty");
    /* renamed from: b */
    public final inn f1117b;
    /* renamed from: c */
    public final inx f1118c;
    /* renamed from: d */
    public final fbn f1119d;

    public bfa(inn inn, inx inx, fbn fbn) {
        this.f1117b = inn;
        this.f1118c = inx;
        this.f1119d = fbn;
    }

    /* renamed from: a */
    static List m806a(iur iur, inc inc) {
        List linkedList = new LinkedList();
        for (iob iob : iob.values()) {
            ine ine = iob.f7209b;
            if (CamcorderProfile.hasProfile(Integer.parseInt(iur.f7482b), iob.f7208a)) {
                Object a = inx.m3900a(iur, iob);
                jri.m13152b(a);
                if (inn.m3887b(a, inc, ine)) {
                    linkedList.addFirst(ine);
                }
            }
        }
        return linkedList;
    }
}
