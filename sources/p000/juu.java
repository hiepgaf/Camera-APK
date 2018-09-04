package p000;

import com.google.android.libraries.smartburst.filterfw.FrameManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: juu */
public final class juu extends jum {
    /* renamed from: a */
    private final jxm f21921a;
    /* renamed from: b */
    private final jtv f21922b;
    /* renamed from: c */
    private final jwq f21923c;
    /* renamed from: d */
    private final int f21924d;
    /* renamed from: e */
    private final float f21925e;
    /* renamed from: f */
    private final float f21926f;
    /* renamed from: g */
    private final float f21927g;
    /* renamed from: h */
    private final float f21928h;
    /* renamed from: i */
    private final float f21929i;

    public juu(jxm jxm, jtv jtv, jwq jwq) {
        this(jxm, jtv, jwq, (byte) 0);
    }

    private juu(jxm jxm, jtv jtv, jwq jwq, byte b) {
        jri.m13152b((Object) jxm);
        jri.m13152b((Object) jtv);
        jri.m13152b((Object) jwq);
        this.f21921a = jxm;
        this.f21922b = jtv;
        this.f21923c = jwq;
        this.f21924d = 3;
        this.f21925e = 0.1f;
        this.f21926f = 10.0f;
        this.f21927g = 1.0f;
        this.f21928h = 9.0f;
        this.f21929i = 1.0f;
    }

    /* renamed from: a */
    public final juh mo3176a(juh juh) {
        jri.m13152b((Object) juh);
        FrameManager.attachToThread();
        if (!juh.m4646b()) {
            List arrayList = new ArrayList();
            arrayList.addAll(ken.m13458a(juh.f7984a));
            List b = khb.m4885b();
            while (!arrayList.isEmpty()) {
                try {
                    jri.m13143a(arrayList.isEmpty() ^ 1);
                    int size = arrayList.size();
                    Long l = null;
                    float f = Float.NEGATIVE_INFINITY;
                    int i = 0;
                    while (i < size) {
                        float f2;
                        Long valueOf;
                        int i2 = i + 1;
                        long longValue = ((Long) arrayList.get(i)).longValue();
                        float a = this.f21922b.mo2049a(longValue).mo2076a();
                        if (b.isEmpty()) {
                            f2 = 0.0f;
                        } else {
                            jri.m13143a(b.isEmpty() ^ 1);
                            jxa a2 = this.f21921a.m4672a(longValue);
                            int size2 = b.size();
                            float f3 = Float.POSITIVE_INFINITY;
                            int i3 = 0;
                            while (i3 < size2) {
                                Object obj = b.get(i3);
                                i3++;
                                long longValue2 = ((Long) obj).longValue();
                                jxa a3 = this.f21921a.m4672a(longValue2);
                                float a4 = this.f21923c.m4658a(longValue, longValue2);
                                a4 *= this.f21926f;
                                f2 = (Math.abs(((Float) a3.m4665a(jxa.f8060q)).floatValue() - ((Float) a2.m4665a(jxa.f8060q)).floatValue()) * this.f21925e) + a4;
                                if (f2 < f3) {
                                    f3 = f2;
                                }
                            }
                            if (f3 < this.f21927g) {
                                i = i2;
                            } else {
                                f2 = f3;
                            }
                        }
                        f2 = (f2 * this.f21929i) + (this.f21928h * a);
                        if (f2 > f) {
                            valueOf = Long.valueOf(longValue);
                        } else {
                            f2 = f;
                            valueOf = l;
                        }
                        i = i2;
                        l = valueOf;
                        f = f2;
                    }
                    if (l == null) {
                        break;
                    }
                    b.add(l);
                    long longValue3 = l.longValue();
                    Iterator listIterator = arrayList.listIterator();
                    while (listIterator.hasNext()) {
                        if (((Long) listIterator.next()).longValue() == longValue3) {
                            listIterator.remove();
                        }
                    }
                    if (b.size() >= this.f21924d) {
                        break;
                    }
                } catch (Throwable th) {
                    FrameManager.detachFromThread();
                }
            }
            juh juh2 = new juh(b);
        }
        FrameManager.detachFromThread();
        return juh;
    }

    public final String toString() {
        return "DiverseFrameSegmentFilter";
    }
}
