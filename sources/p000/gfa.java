package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: gfa */
public final class gfa implements gfh, gfv {
    /* renamed from: a */
    public static final String f16860a = bli.m862a("ImageBackend");
    /* renamed from: p */
    private static final iqp f16861p = new iqp(512, 384);
    /* renamed from: b */
    public final Map f16862b;
    /* renamed from: c */
    public final Set f16863c;
    /* renamed from: d */
    public int f16864d = 0;
    /* renamed from: e */
    public int f16865e = 0;
    /* renamed from: f */
    public gfo f16866f;
    /* renamed from: g */
    private final ExecutorService f16867g;
    /* renamed from: h */
    private final ExecutorService f16868h;
    /* renamed from: i */
    private final ExecutorService f16869i;
    /* renamed from: j */
    private final ExecutorService f16870j;
    /* renamed from: k */
    private final gev f16871k;
    /* renamed from: l */
    private final Map f16872l;
    /* renamed from: m */
    private final ghf f16873m;
    /* renamed from: n */
    private final ird f16874n;
    /* renamed from: o */
    private final iqp f16875o;
    /* renamed from: q */
    private int f16876q = 0;

    public gfa(ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3, ExecutorService executorService4, ghf ghf, gev gev, ird ird, int i) {
        this.f16867g = executorService;
        this.f16868h = executorService2;
        this.f16869i = executorService3;
        this.f16870j = executorService4;
        this.f16873m = ghf;
        this.f16866f = new gfo();
        this.f16871k = gev;
        this.f16874n = ird;
        this.f16862b = new HashMap();
        this.f16872l = new HashMap();
        this.f16875o = new iqp(i, i);
        this.f16863c = new HashSet();
    }

    /* renamed from: a */
    public final boolean mo1474a(ggr ggr, ggr ggr2) {
        int i = 0;
        Set<ggr> hashSet = new HashSet(1);
        hashSet.add(ggr2);
        for (ggr ggr3 : hashSet) {
            gfw gfw = ggr3.f5167g;
            boolean z = gfw == ggr.f5167g ? true : gfw == null;
            jri.m13153b(z);
        }
        gfw gfw2 = ggr.f5167g;
        for (ggr ggr32 : hashSet) {
            gfw = ggr32.f5167g;
            if (gfw != null && gfw != gfw2) {
                throw new RuntimeException("ERROR:  Spawned tasks cannot reference new images!");
            } else if (gfw != null) {
                i++;
            }
        }
        gfw2 = ggr.f5167g;
        if (!(gfw2 == null || i == 0)) {
            synchronized (this.f16862b) {
                gfd gfd = (gfd) jri.m13152b((gfd) this.f16862b.get(gfw2.f5149b));
                if (this.f16862b.get(gfw2.f5149b) == null) {
                    throw new RuntimeException("Image Reference has already been released or has never been held.");
                }
                gfd.m2552a(i);
                this.f16862b.put(gfw2.f5149b, gfd);
                this.f16876q += i;
            }
        }
        m11024a((Set) hashSet, m11022a(ggr, (Set) hashSet));
        return true;
    }

    /* renamed from: a */
    final void m11027a(ggr ggr) {
        synchronized (this.f16872l) {
            this.f16872l.remove(ggr);
        }
    }

    /* renamed from: a */
    final boolean m11029a(gfu gfu) {
        synchronized (this.f16872l) {
            if (gfu.f21451a.m2552a(-1) != 0) {
                return false;
            }
            gfu.f21451a.m2556c();
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo1476a(iwz iwz) {
        synchronized (this.f16862b) {
            if (this.f16863c.contains(iwz)) {
                this.f16863c.remove(iwz);
                if (this.f16862b.remove(iwz) != null) {
                    this.f16876q--;
                    return true;
                }
                return false;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final Set mo1471a() {
        Set unmodifiableSet;
        synchronized (this.f16862b) {
            this.f16863c.retainAll(this.f16862b.keySet());
            unmodifiableSet = Collections.unmodifiableSet(new HashSet(this.f16863c));
        }
        return unmodifiableSet;
    }

    /* renamed from: b */
    public final gfo mo1477b() {
        return this.f16866f;
    }

    /* renamed from: a */
    private final gff m11022a(ggr ggr, Set set) {
        gff gff;
        synchronized (this.f16872l) {
            boolean z;
            gff = (gff) jri.m13152b((gff) this.f16872l.get(ggr));
            if (gff.f5139a != null) {
                z = true;
            } else {
                z = false;
            }
            jri.m13154b(z, (Object) "Task NOT previously registered. ImageShadowTask booking-keeping is incorrect.");
            gff.f5139a.f21451a.m2552a(set.size());
        }
        return gff;
    }

    /* renamed from: a */
    private final gff m11023a(Set set, get get, Set set2, kbg kbg) {
        ghh ghh = new ghh();
        ghh.m2555b(set.size());
        gfu gfu = new gfu(ghh, get, kbg);
        synchronized (this.f16872l) {
            for (ggr ggr : set) {
                boolean z;
                if (((gff) this.f16872l.get(ggr)) == null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13154b(z, (Object) "Overlap of Shadow Task association.  You've possibly submitted the same task twice?");
            }
        }
        return new gff(gfu, set2);
    }

    /* renamed from: a */
    public final boolean mo1475a(ggr ggr, boolean z, kbg kbg) {
        Set hashSet = new HashSet(1);
        hashSet.add(ggr);
        return m11025a(ggr.f5168h, hashSet, false, z, kbg);
    }

    /* renamed from: a */
    public final boolean mo1473a(gfw gfw, Executor executor, Set set, get get, kbg kbg) {
        kbg c;
        Set hashSet = new HashSet();
        if (set.contains(gfi.COMPRESS_TO_MARKED_JPEG_AND_WRITE_TO_DISK)) {
            ggn ggn = new ggn(gfw, executor, this, get, this.f16874n);
            if (set.contains(gfi.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
                hashSet.add(new ghb(gfw, executor, this, get, f16861p, kbg.m4745c(ggn), this.f16874n));
            } else {
                hashSet.add(ggn);
            }
        } else if (set.contains(gfi.COMPRESS_TO_JPEG_AND_WRITE_TO_DISK)) {
            ggk ggk = new ggk(gfw, executor, this, get, this.f16873m);
            if (set.contains(gfi.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
                hashSet.add(new ghb(gfw, executor, this, get, f16861p, kbg.m4745c(ggk), this.f16874n));
            } else {
                hashSet.add(ggk);
            }
        } else if (set.contains(gfi.CREATE_EARLY_FILMSTRIP_PREVIEW)) {
            hashSet.add(new ghb(gfw, executor, this, get, f16861p, kau.f19138a, this.f16874n));
        }
        if (set.contains(gfi.CONVERT_TO_RGB_PREVIEW)) {
            hashSet.add(new ggq(gfw, executor, this, go.aT, get, this.f16875o, go.aP, this.f16874n));
        }
        if (kbg.mo2084b()) {
            c = kbg.m4745c(new gfb(this, (gfn) kbg.mo2081a()));
        } else {
            c = kau.f19138a;
        }
        if (!m11025a(get, hashSet, set.contains(gfi.BLOCK_UNTIL_ALL_TASKS_RELEASE), set.contains(gfi.CLOSE_ON_ALL_TASKS_RELEASE), c)) {
            return false;
        }
        if (kbg.mo2084b()) {
            gfo gfo = this.f16866f;
            gfn gfn = (gfn) kbg.mo2081a();
            iwz iwz = gfw.f5149b;
            synchronized (gfo.f16883a) {
                gfp gfp = new gfp(gfo);
                if (!gfo.f16883a.contains(gfn)) {
                    gfo.f16883a.add(gfn);
                }
                if (iwz == null) {
                    gfo.f16884b.put(gfn, null);
                } else {
                    gfo.f16884b.put(gfn, Long.valueOf(iwz.mo2719f()));
                }
                gfq gfq = new gfq(gfo);
            }
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m11025a(get get, Set set, boolean z, boolean z2, kbg kbg) {
        jri.m13139a((Object) get, (Object) "Need a valid Capture Session to associated with the Processing Task");
        if (set.size() <= 0) {
            return false;
        }
        Map hashMap = new HashMap();
        for (ggr ggr : set) {
            iwz iwz = ((gfw) jri.m13152b(ggr.f5167g)).f5149b;
            Integer num = (Integer) hashMap.get(iwz);
            if (num == null) {
                hashMap.put(iwz, Integer.valueOf(1));
            } else {
                hashMap.put(iwz, Integer.valueOf(num.intValue() + 1));
            }
        }
        gff a = m11023a(set, get, hashMap.keySet(), kbg);
        Set<gfd> hashSet = new HashSet(hashMap.keySet().size());
        for (iwz iwz2 : hashMap.keySet()) {
            hashSet.add(m11021a(iwz2, ((Integer) hashMap.get(iwz2)).intValue(), z, z2));
        }
        this.f16871k.m2510a(a.f5139a);
        m11024a(set, a);
        for (gfd gfd : hashSet) {
            if (gfd.f16877a) {
                gfd.m2553a();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1472a(iwz iwz, Executor executor) {
        synchronized (this.f16862b) {
            gfd gfd = (gfd) this.f16862b.get(iwz);
            if (gfd == null || gfd.m2554b() <= 0) {
                throw new RuntimeException("ERROR: Task implementation did NOT balance its release.");
            }
            gfd.m2552a(-1);
            this.f16876q--;
            int i = this.f16876q;
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("Ref release.  Total refs = ");
            stringBuilder.append(i);
            bli.m871d(f16860a, stringBuilder.toString());
            if (gfd.m2554b() == 0) {
                this.f16862b.remove(iwz);
                this.f16863c.retainAll(this.f16862b.keySet());
                if (gfd.f16878b) {
                    Runnable gfc = new gfc(this, iwz);
                    if (executor == null) {
                        gfc.run();
                    } else {
                        executor.execute(gfc);
                    }
                    bli.m871d(f16860a, "Ref release close.");
                }
                if (gfd.f16877a) {
                    gfd.m2556c();
                }
            } else {
                this.f16862b.put(iwz, gfd);
            }
        }
    }

    /* renamed from: a */
    private final void m11024a(Set set, gff gff) {
        synchronized (this.f16872l) {
            for (ggr ggr : set) {
                this.f16872l.put(ggr, gff);
                Runnable gfe = new gfe(this, gff, ggr, this.f16874n);
                switch (ggr.f5166f - 1) {
                    case 0:
                        this.f16867g.execute(gfe);
                        break;
                    case 1:
                        this.f16868h.execute(gfe);
                        break;
                    case 2:
                        this.f16869i.execute(gfe);
                        break;
                    default:
                        this.f16870j.execute(gfe);
                        break;
                }
            }
        }
    }

    /* renamed from: a */
    private final gfd m11021a(iwz iwz, int i, boolean z, boolean z2) {
        gfd gfd;
        synchronized (this.f16862b) {
            boolean z3;
            if (this.f16862b.get(iwz) == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            jri.m13154b(z3, (Object) "Image is already being processed by another task.");
            gfd = new gfd(z, z2);
            gfd.m2555b(i);
            this.f16862b.put(iwz, gfd);
            this.f16876q += i;
            this.f16864d++;
            int i2 = this.f16864d;
            int i3 = this.f16865e;
            StringBuilder stringBuilder = new StringBuilder(49);
            stringBuilder.append("Received an opened image: ");
            stringBuilder.append(i2);
            stringBuilder.append("/");
            stringBuilder.append(i3);
            bli.m871d(f16860a, stringBuilder.toString());
            i2 = this.f16876q;
            StringBuilder stringBuilder2 = new StringBuilder(74);
            stringBuilder2.append("Setting an image reference count of ");
            stringBuilder2.append(i);
            stringBuilder2.append("   Total refs = ");
            stringBuilder2.append(i2);
            bli.m871d(f16860a, stringBuilder2.toString());
        }
        return gfd;
    }

    public final String toString() {
        int size = this.f16872l.size();
        int size2 = this.f16862b.size();
        int i = this.f16876q;
        int a = this.f16866f.m11041a();
        int b = this.f16866f.m11046b();
        StringBuilder stringBuilder = new StringBuilder(229);
        stringBuilder.append("ImageBackend Status BEGIN:\nShadow Image Map Size = ");
        stringBuilder.append(size);
        stringBuilder.append("\nImage Semaphore Map Size = ");
        stringBuilder.append(size2);
        stringBuilder.append("\nOutstandingImageRefs = ");
        stringBuilder.append(i);
        stringBuilder.append("\nProxy Listener Map Size = ");
        stringBuilder.append(a);
        stringBuilder.append("\nProxy Listener = ");
        stringBuilder.append(b);
        stringBuilder.append("\nImageBackend Status END:\n");
        return stringBuilder.toString();
    }
}
