package p000;

import android.util.Log;
import android.util.LongSparseArray;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* renamed from: jlc */
public final class jlc implements jla {
    /* renamed from: a */
    public final LongSparseArray f18921a = new LongSparseArray();
    /* renamed from: b */
    private final AtomicLong f18922b = new AtomicLong(0);

    /* renamed from: b */
    final synchronized void m12933b() {
        if (GraphRunner.current() == null) {
            throw new IllegalStateException("Called from a thread with no graph runner.");
        } else if (this.f18922b.get() != Thread.currentThread().getId() && !this.f18922b.compareAndSet(0, Thread.currentThread().getId())) {
            throw new IllegalStateException("Called from a different graph runner thread.");
        }
    }

    /* renamed from: c */
    public final void m12934c() {
        m12933b();
        while (this.f18921a.size() > 0) {
            m12929a(this.f18921a.keyAt(0));
        }
    }

    /* renamed from: a */
    public final void m12932a(Set set, Set set2, jqt jqt) {
        m12933b();
        for (int i = 0; i < this.f18921a.size(); i++) {
            long keyAt = this.f18921a.keyAt(i);
            FrameImage2D frameImage2D = (FrameImage2D) this.f18921a.get(keyAt);
            Long valueOf = Long.valueOf(keyAt);
            if (set.contains(valueOf)) {
                jqt.mo2040a(keyAt, frameImage2D.toBitmap(), set2.contains(valueOf) ^ 1);
            }
        }
    }

    /* renamed from: d */
    public final List m12935d() {
        m12933b();
        return ken.m13458a(new jzq(this.f18921a));
    }

    /* renamed from: a */
    public final void mo2017a() {
        m12933b();
        m12934c();
    }

    /* renamed from: a */
    public final void m12930a(FrameImage2D frameImage2D) {
        m12933b();
        jri.m13152b((Object) frameImage2D);
        long timestamp = frameImage2D.getTimestamp();
        if (this.f18921a.get(timestamp) == null) {
            this.f18921a.put(timestamp, frameImage2D);
            frameImage2D.retain();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append("Duplicate timestamp: ");
        stringBuilder.append(timestamp);
        Log.w("FrameImageBuffer", stringBuilder.toString());
    }

    /* renamed from: a */
    public final void m12929a(long j) {
        m12933b();
        FrameImage2D frameImage2D = (FrameImage2D) this.f18921a.get(j);
        if (frameImage2D != null) {
            this.f18921a.remove(j);
            frameImage2D.release();
        }
    }
}
