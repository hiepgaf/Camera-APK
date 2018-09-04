package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.utils.MathUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: PG */
/* renamed from: jvt */
public final class jvt implements jwa {
    /* renamed from: a */
    private final Map f21962a = new ConcurrentSkipListMap();
    /* renamed from: b */
    private final List f21963b = new ArrayList();
    /* renamed from: c */
    private final jvv f21964c;
    /* renamed from: d */
    private jvu f21965d;
    /* renamed from: e */
    private jvu f21966e;
    /* renamed from: f */
    private float f21967f = 0.0f;
    /* renamed from: g */
    private float f21968g = 0.0f;
    /* renamed from: h */
    private float f21969h = 0.01f;
    /* renamed from: i */
    private float f21970i = 1.0f;

    public jvt(jvv jvv) {
        boolean z;
        boolean z2 = true;
        jri.m13152b((Object) jvv);
        if (jvv.f8020e < 1.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (jvv.f8023h >= 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (jvv.f8022g < 0.0f) {
            z2 = false;
        }
        jri.m13143a(z2);
        this.f21964c = jvv;
    }

    /* renamed from: a */
    private final double m16366a(double d) {
        switch (this.f21964c.f8027l.ordinal()) {
            case 1:
            case 2:
                return d * d;
            case 3:
                return Math.abs(d);
            default:
                String valueOf = String.valueOf(this.f21964c.f8027l);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
                stringBuilder.append("Unrecognized variation method: ");
                stringBuilder.append(valueOf);
                throw new UnsupportedOperationException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final Set mo3186a() {
        return new HashSet(this.f21962a.keySet());
    }

    /* renamed from: a */
    public final void mo2034a(long j) {
        this.f21964c.f8016a.mo2051b(j);
        this.f21964c.f8018c.mo2051b(j);
        this.f21964c.f8017b.mo2051b(j);
        this.f21962a.remove(Long.valueOf(j));
    }

    /* renamed from: b */
    public final void mo2035b(long j) {
        jvu jvu = this.f21966e;
        if (jvu == null || j > jvu.f8007a) {
            jvu jvu2;
            float f;
            this.f21964c.f8016a.mo2052c(j);
            this.f21964c.f8018c.mo2052c(j);
            this.f21964c.f8017b.mo2052c(j);
            long j2 = j;
            jvu jvu3 = new jvu(j2, Math.max(this.f21964c.f8016a.mo2049a(j).mo2076a(), 0.0f), this.f21964c.f8018c.mo2049a(j).mo2076a() + 1.0f, this.f21964c.f8017b.mo2049a(j).mo2076a());
            this.f21962a.put(Long.valueOf(jvu3.f8007a), jvu3);
            this.f21963b.add(jvu3);
            MathUtils.calcSigmoidParams(0.1f, 0.99f, 0.3f, 0.05f);
            for (jvu jvu4 : this.f21963b) {
                jvu4.f8012f = jvu4.f8010d;
            }
            int[] iArr = new int[]{-1, 1};
            int size = this.f21963b.size();
            double gaussian = (double) MathUtils.gaussian(0.0f, 0.0f, this.f21964c.f8022g);
            for (int i = size - 1; i >= 0; i--) {
                jvu2 = (jvu) this.f21963b.get(i);
                jvu4 = this.f21966e;
                if (jvu4 != null) {
                    f = ((float) (jvu4.f8007a - jvu2.f8007a)) / 1000000.0f;
                } else {
                    f = 0.0f;
                }
                if (f > this.f21964c.f8023h) {
                    break;
                }
                double d = ((double) jvu2.f8012f) * gaussian;
                double d2 = gaussian;
                for (int i2 = 0; i2 < 2; i2++) {
                    int i3 = iArr[i2];
                    int i4 = i + i3;
                    while (i4 >= 0 && i4 < size) {
                        jvu4 = (jvu) this.f21963b.get(i4);
                        float abs = ((float) Math.abs(jvu2.f8007a - jvu4.f8007a)) / 1000000.0f;
                        jvv jvv = this.f21964c;
                        if (abs > jvv.f8023h) {
                            break;
                        }
                        double gaussian2 = (double) MathUtils.gaussian(abs, 0.0f, jvv.f8022g);
                        d += ((double) jvu4.f8012f) * gaussian2;
                        d2 += gaussian2;
                        i4 += i3;
                    }
                }
                jvu2.f8013g = (float) (d / d2);
            }
            float f2 = 1.0E-6f;
            for (jvu jvu42 : this.f21963b) {
                f2 = Math.max(jvu42.f8013g, f2);
            }
            this.f21968g = f2;
            f = this.f21968g;
            jvv jvv2 = this.f21964c;
            this.f21967f = jvv2.f8020e * f;
            this.f21969h = jvv2.f8021f * f;
            if (f > 0.0f) {
                this.f21970i = (float) Math.pow((double) f, (double) (1.0f - jvv2.f8019d));
            } else {
                this.f21970i = 1.0f;
                Log.w("AUCFrameDropper", "The max motion saliency must be a positive number!");
            }
            for (jvu jvu422 : this.f21963b) {
                jvu422.f8014h = ((float) Math.pow((double) Math.max(jvu422.f8013g - this.f21967f, this.f21969h), (double) this.f21964c.f8019d)) * this.f21970i;
            }
            jvu2 = null;
            for (jvu jvu4222 : this.f21963b) {
                jvu4222.f8015i = 0.0d;
                if (jvu2 != null) {
                    long j3 = jvu4222.f8007a;
                    long j4 = jvu2.f8007a;
                    float f3 = jvu2.f8014h;
                    float f4 = jvu4222.f8014h;
                    jvu4222.f8015i = (((((double) (j3 - j4)) / 1000000.0d) * ((double) (f3 + f4))) / 2.0d) + jvu2.f8015i;
                    jvu2 = jvu4222;
                } else {
                    jvu2 = jvu4222;
                }
            }
            if (this.f21965d == null) {
                this.f21965d = jvu3;
            }
            this.f21966e = jvu3;
            return;
        }
        Log.w("AUCFrameDropper", "Invalid timestamp: new frame timestamp is smaller than older timestamp.");
    }

    /* renamed from: b */
    public final kbg mo3187b() {
        return kau.f19138a;
    }

    /* renamed from: c */
    public final void mo3188c() {
        this.f21964c.f8016a.mo2050a();
        this.f21964c.f8017b.mo2050a();
        this.f21964c.f8018c.mo2050a();
        this.f21962a.clear();
        this.f21963b.clear();
        this.f21965d = null;
        this.f21966e = null;
        this.f21967f = 0.0f;
        this.f21968g = 0.0f;
    }

    /* renamed from: d */
    public final long mo3189d() {
        if (this.f21962a.isEmpty()) {
            throw new IllegalStateException("Can't drop frame from empty list.");
        } else if (this.f21962a.size() == 1) {
            return ((Long) this.f21962a.keySet().iterator().next()).longValue();
        } else {
            int i;
            jvu jvu;
            Iterator it = this.f21962a.values().iterator();
            while (it.hasNext()) {
                it.next();
            }
            ArrayList arrayList = new ArrayList(this.f21962a.values());
            int size = arrayList.size();
            jvu jvu2 = null;
            int i2 = 0;
            while (i2 < size) {
                i = i2 + 1;
                jvu = (jvu) arrayList.get(i2);
                if (jvu2 == null) {
                    jvu2 = jvu;
                    i2 = i;
                } else if (jvu.f8008b <= jvu2.f8008b) {
                    jvu2 = jvu;
                    i2 = i;
                } else {
                    i2 = i;
                }
            }
            if (jvu2 == null) {
                jvu = null;
            } else if (jvu2.f8008b >= -10.0f) {
                jvu = null;
            } else {
                jvu = jvu2;
            }
            if (jvu != null) {
                return jvu.f8007a;
            }
            if (this.f21962a.isEmpty()) {
                jvu = null;
            } else {
                ArrayList arrayList2 = new ArrayList(this.f21962a.values());
                if (arrayList2.size() == 1) {
                    jvu = (jvu) arrayList2.get(0);
                } else {
                    jvu = (jvu) arrayList2.get(0);
                    int size2 = arrayList2.size();
                    double d = Double.NEGATIVE_INFINITY;
                    jvu jvu3 = jvu;
                    i2 = 0;
                    while (i2 < size2) {
                        double d2;
                        int i3 = i2 + 1;
                        jvu = (jvu) arrayList2.get(i2);
                        List arrayList3 = new ArrayList();
                        int size3 = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            i = i4 + 1;
                            jvu2 = (jvu) arrayList2.get(i4);
                            if (jvu2 != jvu) {
                                arrayList3.add(jvu2);
                                i4 = i;
                            } else {
                                i4 = i;
                            }
                        }
                        jvv jvv = this.f21964c;
                        double d3 = (double) jvv.f8024i;
                        double d4 = (double) jvv.f8025j;
                        double d5 = (double) jvv.f8026k;
                        jri.m13143a(arrayList3.isEmpty() ^ 1);
                        double d6 = 1.0d - ((d3 + d4) + d5);
                        int size4 = arrayList3.size();
                        double d7 = 0.0d;
                        double d8 = 0.0d;
                        double d9 = 0.0d;
                        i4 = 0;
                        while (i4 < arrayList3.size()) {
                            int i5 = i4 + 1;
                            jvu2 = (jvu) arrayList3.get(i4);
                            d7 += (double) jvu2.f8008b;
                            d8 += (double) jvu2.f8009c;
                            d9 += (double) jvu2.f8014h;
                            i4 = i5;
                        }
                        if (size4 > 0) {
                            d2 = (double) size4;
                            d7 /= d2;
                            d8 /= d2;
                            d9 /= d2;
                        }
                        if (this.f21966e == null) {
                            throw new IllegalStateException("mLastFrame is null when frames is not empty");
                        }
                        double d10;
                        if (this.f21964c.f8027l == jvw.VARIANCE) {
                            d2 = this.f21966e.f8015i;
                            d2 *= d2;
                        } else {
                            d2 = this.f21966e.f8015i;
                        }
                        d2 = Math.max(d2, 9.999999974752427E-7d);
                        d7 = ((d8 * d4) + (d7 * d3)) + (d9 * d5);
                        if (arrayList3.size() >= 2) {
                            jvu2 = this.f21966e;
                            if (jvu2 == null) {
                                throw new IllegalStateException("mLastFrame is null when frames is not empty");
                            }
                            d9 = jvu2.f8015i;
                            int size5 = arrayList3.size();
                            size = size5 - 1;
                            d3 = (double) (size5 + 1);
                            d4 = (double) size;
                            d5 = ((jvu) arrayList3.get(0)).f8015i;
                            double d11 = ((jvu) arrayList3.get(size)).f8015i;
                            d4 = Math.min(Math.max((((jvu) arrayList3.get(size)).f8015i - ((jvu) arrayList3.get(0)).f8015i) / d4, d9 / d3), d9 / d4);
                            d9 = m16366a(d9 - d11) + m16366a(d5);
                            for (size = 1; size < size5; size++) {
                                d9 += m16366a((((jvu) arrayList3.get(size)).f8015i - ((jvu) arrayList3.get(size - 1)).f8015i) - d4);
                            }
                            d9 /= d3;
                            if (this.f21964c.f8027l == jvw.STDEV) {
                                d9 = Math.sqrt(d9);
                            }
                        } else {
                            d9 = 0.0d;
                        }
                        d9 = d7 - (((d9 * 30.0d) / d2) * d6);
                        if (d9 >= d) {
                            jvu3 = jvu;
                        }
                        if (d9 >= d) {
                            d10 = d9;
                        } else {
                            d10 = d;
                        }
                        d = d10;
                        i2 = i3;
                    }
                    jvu = jvu3;
                }
            }
            return jvu.f8007a;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f21964c.f8016a);
        String valueOf2 = String.valueOf(this.f21964c.f8018c);
        String valueOf3 = String.valueOf(this.f21964c.f8017b);
        String valueOf4 = String.valueOf(null);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 60) + length2) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length());
        stringBuilder.append("AUCFrameDropper[motion=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", sharpness=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", quality=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", motion-blur=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
