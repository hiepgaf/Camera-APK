package p000;

import android.graphics.RectF;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jjv */
public final class jjv extends jjq {
    /* renamed from: c */
    private final jxm f21864c;
    /* renamed from: d */
    private final jiv[] f21865d;
    /* renamed from: e */
    private final jtv f21866e;

    public jjv(String str, int i, jiv[] jivArr, jxm jxm, jtv jtv) {
        super(str, i);
        jri.m13152b((Object) jivArr);
        jri.m13152b((Object) jxm);
        this.f21865d = jivArr;
        this.f21864c = jxm;
        this.f21866e = jtv;
    }

    /* renamed from: a */
    public final jaq mo2013a(juh juh, Executor executor) {
        boolean z;
        jiw jiw;
        List list;
        jiv jiv;
        jri.m13152b((Object) juh);
        if (juh.m4648d() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        jzp jzp = (jzp) this.f21864c.m4672a(juh.m4644a()).m4665a(jxa.f8045b);
        int i = jzp.f8149a;
        int i2 = jzp.f8150b;
        jri.m13152b((Object) juh);
        if (juh.m4648d() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i < i2) {
            jiw = jiw.PORTRAIT;
        } else {
            jiw = jiw.LANDSCAPE;
        }
        float f = ((float) i) / ((float) i2);
        ArrayList arrayList = new ArrayList(juh.m4648d());
        List a = ken.m13458a(juh.f7984a);
        for (i = 0; i < juh.m4648d(); i++) {
            arrayList.add(new jjx(this.f21866e.mo2049a(((Long) a.get(i)).longValue()).mo2076a(), i));
        }
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList(juh.m4648d());
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            i = i3 + 1;
            arrayList2.add(Integer.valueOf(((jjx) arrayList.get(i3)).f7888a));
            i3 = i;
        }
        int intValue = ((Integer) arrayList2.get(0)).intValue();
        List list2 = null;
        for (jiv jiv2 : this.f21865d) {
            boolean z2;
            Object obj;
            i2 = juh.m4648d();
            if (i2 <= 5) {
                z2 = true;
            } else {
                z2 = false;
            }
            jri.m13143a(z2);
            if (jiv2.f7862f.size() != i2) {
                obj = null;
            } else if (jiv2.f7860d != jiw) {
                obj = null;
            } else if (jiv2.f7861e.contains(Integer.valueOf(intValue))) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                jix jix;
                if (jiv2.f7862f.size() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13143a(z);
                List list3 = jiv2.f7862f;
                TreeMap treeMap = new TreeMap(Collections.reverseOrder());
                for (i = 0; i < list3.size(); i++) {
                    jix = (jix) list3.get(i);
                    Integer valueOf = Integer.valueOf(jix.f7869d * jix.f7868c);
                    list2 = (List) treeMap.get(valueOf);
                    if (list2 == null) {
                        list2 = new ArrayList();
                        treeMap.put(valueOf, list2);
                    }
                    list2.add(Integer.valueOf(i));
                }
                arrayList2 = new ArrayList(treeMap.size());
                for (Entry value : treeMap.entrySet()) {
                    arrayList2.add((List) value.getValue());
                }
                List arrayList3 = new ArrayList(juh.m4648d());
                int size2 = arrayList2.size();
                i = 0;
                i3 = 0;
                while (i3 < size2) {
                    int i4 = i3 + 1;
                    List list4 = (List) arrayList2.get(i3);
                    int size3 = list4.size();
                    List arrayList4 = new ArrayList(size3);
                    int i5 = i;
                    i = 0;
                    while (i < size3) {
                        i2 = i5 + 1;
                        arrayList4.add((Integer) arrayList2.get(i5));
                        i++;
                        i5 = i2;
                    }
                    Collections.sort(arrayList4);
                    for (int i6 = 0; i6 < size3; i6++) {
                        RectF rectF;
                        i = ((Integer) list4.get(i6)).intValue();
                        long longValue = ((Long) ken.m13458a(juh.f7984a).get(((Integer) arrayList4.get(i6)).intValue())).longValue();
                        jix = (jix) jiv2.f7862f.get(i);
                        float f2 = ((float) jix.f7868c) / ((float) jix.f7869d);
                        float f3;
                        if (f > f2) {
                            f3 = ((f - f2) / 2.0f) / f;
                            rectF = new RectF(f3, 0.0f, 1.0f - f3, 1.0f);
                        } else {
                            f3 = ((f2 - f) / 2.0f) / f2;
                            rectF = new RectF(0.0f, f3, 1.0f, 1.0f - f3);
                        }
                        jxa a2 = this.f21864c.m4672a(longValue);
                        if (a2.m4668b(jxa.f8059p) && Math.abs(f2 - 3.3333333f) > 1.0E-6f) {
                            RectF rectF2 = (RectF) a2.m4665a(jxa.f8059p);
                            if (rectF.left > rectF2.left) {
                                f2 = rectF.left - rectF2.left;
                                rectF.left -= f2;
                                rectF.right -= f2;
                            }
                            if (rectF.right < rectF2.right) {
                                f2 = rectF2.right - rectF.right;
                                rectF.left += f2;
                                rectF.right = f2 + rectF.right;
                            }
                            if (rectF.top > rectF2.top) {
                                f2 = rectF.top - rectF2.top;
                                rectF.top -= f2;
                                rectF.bottom -= f2;
                            }
                            if (rectF.bottom < rectF2.bottom) {
                                f2 = rectF2.bottom - rectF.bottom;
                                rectF.top += f2;
                                rectF.bottom = f2 + rectF.bottom;
                            }
                            if (rectF.left > rectF2.left) {
                                rectF = null;
                            } else if (rectF.top > rectF2.top) {
                                rectF = null;
                            }
                        }
                        if (rectF == null) {
                            list2 = null;
                            break;
                        }
                        f2 = (float) jiv2.f7859c;
                        float f4 = ((float) jix.f7866a) + f2;
                        float f5 = (float) jiv2.f7857a;
                        float f6 = ((float) jix.f7867b) + f2;
                        float f7 = (float) jiv2.f7858b;
                        arrayList3.add(new jkq((jix) jiv2.f7862f.get(i6), longValue, rectF, new RectF(f4 / f5, f6 / f7, (f4 + ((float) jix.f7868c)) / f5, (((float) jix.f7869d) + f6) / f7)));
                    }
                    i3 = i4;
                    i = i5;
                }
                list2 = arrayList3;
                if (list2 != null) {
                    list = list2;
                    jiv = jiv2;
                    break;
                }
            }
        }
        list = list2;
        jiv = null;
        if (jiv == null) {
            String str = this.a;
            i = juh.m4648d();
            String valueOf2 = String.valueOf(jiw);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 84) + String.valueOf(valueOf2).length());
            stringBuilder.append("No matching collage layout found! Type = ");
            stringBuilder.append(str);
            stringBuilder.append(" Num of frames = ");
            stringBuilder.append(i);
            stringBuilder.append(" Orientation = ");
            stringBuilder.append(valueOf2);
            Log.e("CollageArtifactRenderer", stringBuilder.toString());
            throw new IllegalStateException("There should always be a valid layout.");
        }
        jjw jjw = new jjw(jiv, list);
        return jli.m12948b(new jjr(jjw.f7886a, jjw.f7887b, this.a, this.b, juh.m4647c()));
    }
}
