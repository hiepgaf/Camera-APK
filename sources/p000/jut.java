package p000;

import com.google.android.libraries.smartburst.filterfw.FrameManager;
import com.google.android.libraries.smartburst.filterpacks.face.FaceUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: jut */
public final class jut extends jum {
    /* renamed from: a */
    private final jxm f21918a;
    /* renamed from: b */
    private final float f21919b;
    /* renamed from: c */
    private final float f21920c;

    public jut(jxm jxm) {
        this(jxm, (byte) 0);
    }

    private jut(jxm jxm, byte b) {
        jri.m13152b((Object) jxm);
        this.f21918a = jxm;
        this.f21919b = 50.0f;
        this.f21920c = 7.0f;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        jri.m13152b((Object) juh);
        FrameManager.attachToThread();
        try {
            if (!juh.m4646b()) {
                Object jtz = new jtz(this.f21918a, jxa.f8048e);
                jri.m13152b((Object) juh);
                jri.m13152b(jtz);
                List arrayList = new ArrayList(ken.m13458a(juh.f7984a));
                Collections.sort(arrayList, Collections.reverseOrder(new juy(jtz)));
                Collection b = khb.m4885b();
                while (!arrayList.isEmpty()) {
                    long longValue = ((Long) arrayList.get(0)).longValue();
                    b.add(Long.valueOf(longValue));
                    arrayList.remove(0);
                    jxa a = this.f21918a.m4672a(longValue);
                    jzp jzp = (jzp) a.m4665a(jxa.f8045b);
                    List b2 = khb.m4885b();
                    ArrayList arrayList2 = (ArrayList) arrayList;
                    int size = arrayList2.size();
                    int i = 0;
                    while (true) {
                        if ((i >= size ? null : 1) == null) {
                            break;
                        }
                        Object obj;
                        int i2 = i + 1;
                        long longValue2 = ((Long) arrayList2.get(i)).longValue();
                        jxa a2 = this.f21918a.m4672a(longValue2);
                        List list = (List) a.m4665a(jxa.f8046c);
                        arrayList = (List) a2.m4665a(jxa.f8046c);
                        List list2 = (List) a.m4665a(jxa.f8065v);
                        List list3 = (List) a2.m4665a(jxa.f8065v);
                        int i3 = jzp.f8149a;
                        int i4 = jzp.f8150b;
                        if (list.size() != arrayList.size()) {
                            i = 1;
                        } else if (FaceUtils.getAverageFaceImageDistance(list, arrayList, list2, list3, i3, i4) <= this.f21920c) {
                            obj = null;
                        } else {
                            i = 1;
                        }
                        float abs = Math.abs(((Float) a2.m4665a(jxa.f8060q)).floatValue() - ((Float) a.m4665a(jxa.f8060q)).floatValue());
                        float f = this.f21919b;
                        if (obj != null || abs > f) {
                            b2.add(Long.valueOf(longValue2));
                            i = i2;
                        } else {
                            i = i2;
                        }
                    }
                    arrayList = b2;
                }
                juh juh2 = new juh(b);
            }
            FrameManager.detachFromThread();
            return juh;
        } catch (Throwable th) {
            FrameManager.detachFromThread();
        }
    }

    public final String toString() {
        return "DiverseFaceFrameSegmentFilter";
    }
}
