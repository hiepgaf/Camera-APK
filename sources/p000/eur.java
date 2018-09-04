package p000;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: eur */
final class eur implements jhf {
    /* renamed from: a */
    private final jhf f15581a;
    /* renamed from: b */
    private final AtomicInteger f15582b;
    /* renamed from: c */
    private final AtomicBoolean f15583c;
    /* renamed from: d */
    private final /* synthetic */ eup f15584d;

    public eur(eup eup, jhf jhf, AtomicInteger atomicInteger, AtomicBoolean atomicBoolean) {
        this.f15584d = eup;
        this.f15581a = jhf;
        this.f15582b = atomicInteger;
        this.f15583c = atomicBoolean;
    }

    public final void close() {
        this.f15583c.set(true);
        try {
            this.f15581a.close();
            if (this.f15584d.m9964c() == 0) {
                int i;
                eup eup = this.f15584d;
                ArrayList arrayList = new ArrayList();
                synchronized (eup.f15580c) {
                    i = -1;
                    for (euq euq : eup.f15579b) {
                        String string = ((MediaFormat) kow.m13623b(euq.f4255c)).getString("mime");
                        if (string.startsWith("video/")) {
                            arrayList.add(Integer.valueOf(euq.f4253a.get()));
                        } else if (string.equals("application/microvideo-meta-stream")) {
                            i = euq.f4253a.get();
                        }
                    }
                    eup.f15579b.clear();
                }
                if (i != -1) {
                    Object obj;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        obj = arrayList.get(i2);
                        i2++;
                        if (Math.abs(((Integer) obj).intValue() - i) < 5) {
                            return;
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    int size2 = arrayList.size();
                    i2 = 0;
                    while (i2 < size2) {
                        obj = arrayList.get(i2);
                        i2++;
                        stringBuilder.append(((Integer) obj).intValue());
                        stringBuilder.append(",");
                    }
                    throw new RuntimeException(String.format("Number of motion and video frames substantially differ (video=%s motion=%d).", new Object[]{stringBuilder, Integer.valueOf(i)}));
                }
            }
        } catch (Throwable th) {
            Log.w("SanitizerMux", "Error occurred while closing", th);
            this.f15584d.f15578a.mo1294b().cancel(false);
        }
    }

    /* renamed from: a */
    public final void mo1295a(ByteBuffer byteBuffer, BufferInfo bufferInfo) {
        try {
            this.f15581a.mo1295a(byteBuffer, bufferInfo);
            this.f15582b.incrementAndGet();
        } catch (Throwable th) {
            Log.w("SanitizerMux", "Error occurred while writing", th);
            this.f15584d.f15578a.mo1294b().cancel(false);
        }
    }
}
