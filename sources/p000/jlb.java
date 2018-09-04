package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jlb */
public class jlb implements jla, jwc {
    /* renamed from: a */
    private final Set f18916a = new HashSet();
    /* renamed from: b */
    private long f18917b = -1;
    /* renamed from: c */
    private final jlc f18918c = new jlc();
    /* renamed from: d */
    private final jvx f18919d;
    /* renamed from: e */
    private final jqt f18920e;

    public jlb(jvx jvx, jqt jqt) {
        ArrayList arrayList = new ArrayList();
        jri.m13152b((Object) jvx);
        jri.m13152b((Object) jqt);
        this.f18919d = jvx;
        this.f18920e = jqt;
        this.f18919d.m16375a((jwc) this);
    }

    /* renamed from: b */
    private final synchronized void m12923b() {
        for (Long longValue : this.f18918c.m12935d()) {
            long longValue2 = longValue.longValue();
            if (longValue2 > this.f18917b) {
                break;
            } else if (!this.f18919d.mo3186a().contains(Long.valueOf(longValue2))) {
                this.f18918c.m12929a(longValue2);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo2017a() {
        this.f18919d.m16378b((jwc) this);
        m12923b();
        this.f18918c.m12932a(this.f18919d.mo3186a(), this.f18916a, this.f18920e);
        this.f18920e.mo2039a();
        this.f18918c.m12934c();
    }

    /* renamed from: a */
    private final synchronized void m12922a(FrameImage2D frameImage2D) {
        m12923b();
        long timestamp = frameImage2D.getTimestamp();
        if (timestamp > this.f18917b || this.f18916a.contains(Long.valueOf(timestamp))) {
            this.f18918c.m12930a(frameImage2D);
        }
    }

    /* renamed from: a */
    public final synchronized void mo2034a(long j) {
        if (j > this.f18917b) {
            StringBuilder stringBuilder = new StringBuilder(84);
            stringBuilder.append("onFrameDropped: Timestamp: ");
            stringBuilder.append(j);
            stringBuilder.append(" is newer than newest inserted frame.");
            Log.v("FrameDropListeningFrameBuffer", stringBuilder.toString());
        } else {
            this.f18916a.remove(Long.valueOf(j));
        }
    }

    /* renamed from: b */
    public final synchronized void mo2035b(long j) {
        if (j <= this.f18917b) {
            StringBuilder stringBuilder = new StringBuilder(85);
            stringBuilder.append("onFrameInserted: Timestamp: ");
            stringBuilder.append(j);
            stringBuilder.append(" is older than newest inserted frame.");
            Log.v("FrameDropListeningFrameBuffer", stringBuilder.toString());
        } else {
            this.f18916a.add(Long.valueOf(j));
            this.f18917b = j;
        }
    }
}
