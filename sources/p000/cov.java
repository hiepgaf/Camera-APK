package p000;

import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cov */
public final class cov extends eru {
    /* renamed from: a */
    private static final String f12436a = bli.m862a("BurstItemData");
    /* renamed from: n */
    private final List f12437n;
    /* renamed from: o */
    private boolean f12438o;
    /* renamed from: p */
    private final List f12439p;
    /* renamed from: q */
    private boolean f12440q;

    private cov(long j, String str, String str2, Date date, Date date2, String str3, kbg kbg, boolean z, iqp iqp, long j2, int i, erx erx, List list) {
        Uri uri;
        boolean z2;
        if (z) {
            uri = (Uri) kbg.mo2081a();
        } else {
            jri.m13143a(list.isEmpty() ^ 1);
            uri = ((cot) list.get(0)).f12527c.f12515e.f4155h;
        }
        super(j, str, str2, date, date2, str3, uri, z, kbg.m4745c(iqp), j2, i, erx, false);
        this.f12438o = false;
        this.f12439p = new ArrayList();
        this.f12440q = false;
        if (z == kbg.mo2084b()) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13143a(z2);
        this.f12437n = list;
    }

    /* renamed from: a */
    public static cov m8502a(List list) {
        jri.m13144a(list.isEmpty() ^ 1, (Object) "Cannot create BurstItem from empty burst");
        eru g = ((err) list.get(0)).mo1033g();
        long j = 0;
        for (err g2 : list) {
            j += g2.mo1033g().f4157j;
        }
        return new cov(cov.m8508c(list), g.f4150c, "", g.f4152e, g.f4153f, new File(g.f4154g).getParent(), kau.f19138a, false, g.m2079g(), j, g.f4158k, g.f4159l, list);
    }

    /* renamed from: a */
    public static cov m8501a(Uri uri, gsp gsp, kbg kbg) {
        if (!gsp.mo1641a(uri)) {
            return null;
        }
        Point e = gsp.mo1646e(uri);
        if (e == null) {
            return null;
        }
        long longValue;
        Date date = new Date(gsp.mo1647f(uri));
        if (kbg.mo2084b()) {
            longValue = ((Long) kbg.mo2081a()).longValue();
        } else {
            longValue = -1;
        }
        return new cov(longValue, "", "", date, date, "", kbg.m4745c(uri), true, iqp.m4044a(e), 0, 0, erx.f4174a, Collections.emptyList());
    }

    /* renamed from: h */
    private final synchronized void m8513h() {
        if (!this.f12440q) {
            this.f12439p.clear();
            for (cot cot : m8520c()) {
                boolean booleanValue;
                if (cot.f20762a.mo2084b()) {
                    booleanValue = ((Boolean) cot.f20762a.mo2081a()).booleanValue();
                } else {
                    String str = cot.f12527c.f12515e.f4154g;
                    if (str != null) {
                        booleanValue = jxr.m4678a().mo2065d(new File(str));
                        cot.f20762a = kbg.m4745c(Boolean.valueOf(booleanValue));
                    } else {
                        booleanValue = false;
                    }
                }
                if (!booleanValue) {
                    this.f12439p.add(cot);
                }
            }
            this.f12440q = true;
        }
    }

    /* renamed from: i */
    private final synchronized void m8514i() {
        if (!this.f12438o) {
            m8515j();
            if (!cov.m8511d(this.f12437n)) {
                Collections.sort(this.f12437n);
            }
            this.f12438o = true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo996a(Set set) {
        boolean z;
        for (cot cot : this.f12437n) {
            if (set.contains(cot.f12527c.f12515e.f4155h)) {
                z = true;
                break;
            }
        }
        z = false;
        return z;
    }

    /* renamed from: c */
    private static long m8508c(List list) {
        long j = -1;
        for (err g : list) {
            j = Math.max(j, g.mo1033g().f4149b);
        }
        return j;
    }

    /* renamed from: a */
    public final synchronized ken mo995a() {
        Collection arrayList;
        arrayList = new ArrayList();
        for (cot cot : this.f12437n) {
            arrayList.add(Long.valueOf(cot.f12527c.f12515e.f4149b));
        }
        return ken.m13458a(arrayList);
    }

    /* renamed from: b */
    public final synchronized List m8519b() {
        m8514i();
        m8513h();
        return Collections.unmodifiableList(this.f12439p);
    }

    /* renamed from: b */
    public static cot m8506b(List list) {
        for (cot cot : list) {
            try {
                if (cot.f20763b == null) {
                    String str = cot.f12527c.f12515e.f4154g;
                    if (str == null) {
                        cot.f20763b = Boolean.valueOf(false);
                    } else {
                        cot.f20763b = Boolean.valueOf(jxr.m4678a().mo2064c(new File(str)));
                    }
                }
                if (cot.f20763b.booleanValue()) {
                    return cot;
                }
            } catch (jya e) {
            }
        }
        return null;
    }

    /* renamed from: c */
    public final List m8520c() {
        List unmodifiableList;
        m8514i();
        synchronized (this) {
            unmodifiableList = Collections.unmodifiableList(this.f12437n);
        }
        return unmodifiableList;
    }

    /* renamed from: d */
    public final synchronized int m8521d() {
        return this.f12437n.size();
    }

    /* renamed from: e */
    public final synchronized err m8522e() {
        err b;
        List c = m8520c();
        jri.m13152b((Object) c);
        b = cov.m8506b(c);
        if (b == null) {
            if (c.isEmpty()) {
                b = null;
            } else {
                b = (err) c.get(0);
                String str = f12436a;
                String valueOf = String.valueOf(b.mo1033g().f4155h);
                String str2 = b.mo1033g().f4154g;
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 27) + String.valueOf(str2).length());
                stringBuilder.append("Using first item as cover:");
                stringBuilder.append(valueOf);
                stringBuilder.append(" ");
                stringBuilder.append(str2);
                bli.m863a(str, stringBuilder.toString());
            }
        }
        return b;
    }

    /* renamed from: a */
    public static boolean m8504a(File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        String name = file.getName();
        if (name == null || !name.startsWith("feature_table.bin")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m8507b(File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        String name = file.getName();
        if (name == null || !name.startsWith(".burst_in_progress.lock")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m8509c(File file) {
        if (file == null || !file.isDirectory()) {
            return false;
        }
        String name = file.getName();
        if (name == null || !name.startsWith(".medresframes")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m8510d(File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        String name = file.getName();
        if (name == null || !name.startsWith("metadatastore.bin")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m8505a(String str) {
        if (str == null) {
            return false;
        }
        return jxr.m4678a().mo2063b(new File(str));
    }

    /* renamed from: e */
    public static boolean m8512e(File file) {
        if (file == null || !file.isFile()) {
            return false;
        }
        return cov.m8505a(file.getName());
    }

    /* renamed from: a */
    public static boolean m8503a(err err) {
        return cov.m8512e(new File(err.mo1033g().f4154g));
    }

    /* renamed from: f */
    public final kbg m8523f() {
        ArrayList c;
        synchronized (this) {
            List a = khb.m4863a(this.f12437n.size());
            c = khb.m4895c(this.f12437n);
        }
        int size = c.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            cot b = ((cot) c.get(i)).m15132b();
            if (b != null) {
                a.add(b);
                i = i2;
            } else {
                i = i2;
            }
        }
        if (a.isEmpty()) {
            return kau.f19138a;
        }
        jri.m13143a(a.isEmpty() ^ 1);
        return kbg.m4745c(new cov(cov.m8508c(a), this.f4150c, this.f4151d, this.f4152e, this.f4153f, this.f4154g, kau.f19138a, false, m2079g(), this.f4157j, this.f4158k, this.f4159l, a));
    }

    /* renamed from: a */
    public final synchronized boolean m8517a(cot cot) {
        this.f12440q = false;
        return this.f12437n.remove(cot);
    }

    /* renamed from: j */
    private final synchronized void m8515j() {
        jxy a = jxr.m4678a();
        Iterator it = this.f12437n.iterator();
        while (it.hasNext()) {
            cot cot = (cot) it.next();
            if (!a.mo2063b(new File(cot.f12527c.f12515e.f4154g))) {
                String str = f12436a;
                String valueOf = String.valueOf(cot.f12527c.f12515e.f4154g);
                String str2 = "removing non-burst file: ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m873e(str, valueOf);
                it.remove();
            }
        }
    }

    /* renamed from: d */
    private static boolean m8511d(List list) {
        boolean z = true;
        int i = -1;
        for (cot d_ : list) {
            try {
                cot d_2;
                boolean z2;
                int d_3 = d_2.d_();
                if (d_3 <= i) {
                    z2 = false;
                } else {
                    z2 = z;
                }
                if (d_3 > i) {
                    z = z2;
                    i = d_3;
                } else {
                    z = z2;
                }
            } catch (jya e) {
                return false;
            }
        }
        if (z) {
            return true;
        }
        ArrayList arrayList = new ArrayList(Collections.nCopies(i + 1, null));
        for (cot d_22 : list) {
            try {
                arrayList.set(d_22.d_(), d_22);
            } catch (jya e2) {
                return false;
            }
        }
        ListIterator listIterator = list.listIterator();
        ListIterator listIterator2 = arrayList.listIterator();
        while (listIterator2.hasNext()) {
            d_22 = (cot) listIterator2.next();
            if (d_22 != null) {
                listIterator.next();
                listIterator.set(d_22);
            }
        }
        return true;
    }
}
