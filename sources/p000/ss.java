package p000;

import android.os.Trace;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: ss */
public final class ss implements Runnable {
    /* renamed from: a */
    public static final ThreadLocal f9230a = new ThreadLocal();
    /* renamed from: f */
    private static Comparator f9231f = new st();
    /* renamed from: b */
    public ArrayList f9232b = new ArrayList();
    /* renamed from: c */
    public long f9233c;
    /* renamed from: d */
    private long f9234d;
    /* renamed from: e */
    private ArrayList f9235e = new ArrayList();

    /* renamed from: a */
    public final void m5816a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f9234d == 0) {
            this.f9234d = RecyclerView.m432h();
            recyclerView.post(this);
        }
        uj ujVar = recyclerView.f698z;
        ujVar.f9320a = i;
        ujVar.f9321b = i2;
    }

    /* renamed from: a */
    private static ux m5815a(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int b = recyclerView.f678f.m5763b();
        for (int i2 = 0; i2 < b; i2++) {
            ux c = RecyclerView.m428c(recyclerView.f678f.m5768d(i2));
            if (c.f9371c == i && !c.m6027h()) {
                z = true;
                break;
            }
        }
        z = false;
        if (z) {
            return null;
        }
        up upVar = recyclerView.f676d;
        try {
            recyclerView.m476m();
            ux a = upVar.m5997a(i, j);
            if (a != null) {
                if ((a.f9378j & 1) == 0 || a.m6027h()) {
                    upVar.m6001a(a, false);
                } else {
                    upVar.m6004b(a.f9369a);
                }
            }
            recyclerView.m454a(false);
            return a;
        } catch (Throwable th) {
            recyclerView.m454a(false);
        }
    }

    public final void run() {
        try {
            Trace.beginSection("RV Prefetch");
            if (this.f9232b.isEmpty()) {
                this.f9234d = 0;
                Trace.endSection();
                return;
            }
            RecyclerView recyclerView;
            int size = this.f9232b.size();
            long j = 0;
            int i = 0;
            while (i < size) {
                long max;
                recyclerView = (RecyclerView) this.f9232b.get(i);
                if (recyclerView.getWindowVisibility() == 0) {
                    max = Math.max(recyclerView.getDrawingTime(), j);
                } else {
                    max = j;
                }
                i++;
                j = max;
            }
            if (j != 0) {
                int i2;
                int i3;
                long toNanos = TimeUnit.MILLISECONDS.toNanos(j) + this.f9233c;
                int size2 = this.f9232b.size();
                int i4 = 0;
                int i5 = 0;
                while (i5 < size2) {
                    recyclerView = (RecyclerView) this.f9232b.get(i5);
                    if (recyclerView.getWindowVisibility() == 0) {
                        recyclerView.f698z.m5988a(recyclerView, false);
                        i2 = recyclerView.f698z.f9323d + i4;
                    } else {
                        i2 = i4;
                    }
                    i5++;
                    i4 = i2;
                }
                this.f9235e.ensureCapacity(i4);
                i4 = 0;
                size = 0;
                while (size < size2) {
                    recyclerView = (RecyclerView) this.f9232b.get(size);
                    if (recyclerView.getWindowVisibility() != 0) {
                        i2 = i4;
                    } else {
                        uj ujVar = recyclerView.f698z;
                        int abs = Math.abs(ujVar.f9320a) + Math.abs(ujVar.f9321b);
                        i3 = 0;
                        i5 = i4;
                        while (true) {
                            i4 = ujVar.f9323d;
                            if (i3 >= i4 + i4) {
                                break;
                            }
                            uu uuVar;
                            boolean z;
                            if (i5 >= this.f9235e.size()) {
                                uuVar = new uu();
                                this.f9235e.add(uuVar);
                            } else {
                                uuVar = (uu) this.f9235e.get(i5);
                            }
                            int[] iArr = ujVar.f9322c;
                            int i6 = iArr[i3 + 1];
                            if (i6 <= abs) {
                                z = true;
                            } else {
                                z = false;
                            }
                            uuVar.f9342a = z;
                            uuVar.f9343b = abs;
                            uuVar.f9344c = i6;
                            uuVar.f9345d = recyclerView;
                            uuVar.f9346e = iArr[i3];
                            i5++;
                            i3 += 2;
                        }
                        i2 = i5;
                    }
                    size++;
                    i4 = i2;
                }
                Collections.sort(this.f9235e, f9231f);
                loop10:
                for (i3 = 0; i3 < this.f9235e.size(); i3++) {
                    uu uuVar2 = (uu) this.f9235e.get(i3);
                    RecyclerView recyclerView2 = uuVar2.f9345d;
                    if (recyclerView2 == null) {
                        break loop10;
                    }
                    long j2;
                    if (uuVar2.f9342a) {
                        j2 = Long.MAX_VALUE;
                    } else {
                        j2 = toNanos;
                    }
                    ux a = ss.m5815a(recyclerView2, uuVar2.f9346e, j2);
                    if (!(a == null || a.f9370b == null || (a.f9378j & 1) == 0 || a.m6027h())) {
                        recyclerView2 = (RecyclerView) a.f9370b.get();
                        if (recyclerView2 == null) {
                            continue;
                        } else {
                            if (recyclerView2.f691s && recyclerView2.f678f.m5763b() != 0) {
                                recyclerView2.m478o();
                            }
                            uj ujVar2 = recyclerView2.f698z;
                            ujVar2.m5988a(recyclerView2, true);
                            if (ujVar2.f9323d != 0) {
                                Trace.beginSection("RV Nested Prefetch");
                                uv uvVar = recyclerView2.f656A;
                                tx txVar = recyclerView2.f682j;
                                uvVar.f9350d = 1;
                                uvVar.f9351e = txVar.mo728a();
                                uvVar.f9353g = false;
                                uvVar.f9354h = false;
                                uvVar.f9355i = false;
                                i5 = 0;
                                while (true) {
                                    size = ujVar2.f9323d;
                                    if (i5 >= size + size) {
                                        break;
                                    }
                                    ss.m5815a(recyclerView2, ujVar2.f9322c[i5], toNanos);
                                    i5 += 2;
                                }
                                Trace.endSection();
                            } else {
                                continue;
                            }
                        }
                    }
                    uuVar2.f9342a = false;
                    uuVar2.f9343b = 0;
                    uuVar2.f9344c = 0;
                    uuVar2.f9345d = null;
                    uuVar2.f9346e = 0;
                }
                this.f9234d = 0;
                Trace.endSection();
                return;
            }
            this.f9234d = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f9234d = 0;
            Trace.endSection();
            throw th;
        }
    }
}
