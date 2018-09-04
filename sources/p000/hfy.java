package p000;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* renamed from: hfy */
public final class hfy implements OnScrollListener {
    /* renamed from: a */
    private static final String f6180a = bli.m862a("Preloader");
    /* renamed from: b */
    private final int f6181b;
    /* renamed from: c */
    private int f6182c = -1;
    /* renamed from: d */
    private int f6183d;
    /* renamed from: e */
    private final int f6184e;
    /* renamed from: f */
    private hfz f6185f;
    /* renamed from: g */
    private hfz f6186g;
    /* renamed from: h */
    private Queue f6187h = new LinkedBlockingQueue();
    /* renamed from: i */
    private int f6188i;
    /* renamed from: j */
    private boolean f6189j = false;

    public hfy(hfz hfz, hfz hfz2) {
        this.f6185f = hfz;
        this.f6186g = hfz2;
        this.f6184e = 5;
        this.f6181b = 6;
    }

    /* renamed from: a */
    public final void m3111a() {
        for (List a : this.f6187h) {
            this.f6186g.mo1008a(a);
        }
        this.f6187h.clear();
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        boolean z = this.f6189j;
        int i4 = this.f6188i;
        if (i > i4) {
            this.f6189j = true;
            i4 = i;
        } else if (i >= i4) {
            i4 = -1;
        } else {
            this.f6189j = false;
            i4 = i;
        }
        if (z != this.f6189j) {
            m3111a();
        }
        if (i4 != -1) {
            int max;
            int min;
            boolean z2 = this.f6189j;
            if (z2) {
                max = Math.max(i4, this.f6182c);
                min = Math.min(this.f6184e + i4, this.f6185f.mo1016c());
            } else {
                max = Math.max(0, i4 - this.f6184e);
                min = Math.min(i4, this.f6183d);
            }
            String str = f6180a;
            StringBuilder stringBuilder = new StringBuilder(76);
            stringBuilder.append("preload first=");
            stringBuilder.append(i4);
            stringBuilder.append(" increasing=");
            stringBuilder.append(z2);
            stringBuilder.append(" start=");
            stringBuilder.append(max);
            stringBuilder.append(" end=");
            stringBuilder.append(min);
            bli.m871d(str, stringBuilder.toString());
            this.f6182c = min;
            this.f6183d = max;
            if (!(max == 0 && min == 0)) {
                List a = this.f6185f.mo1001a(max, min);
                if (!z2) {
                    Collections.reverse(a);
                }
                this.f6187h.offer(this.f6186g.mo1012b(a));
                if (this.f6187h.size() > this.f6181b) {
                    a = (List) this.f6187h.poll();
                    if (a != null) {
                        this.f6186g.mo1008a(a);
                    }
                }
            }
        }
        this.f6188i = i;
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
