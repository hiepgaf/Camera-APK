package p000;

import android.util.Pair;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: exj */
public final class exj extends exh implements exi, ikz {
    /* renamed from: a */
    private final ixb f21330a;
    /* renamed from: b */
    private final Map f21331b;
    /* renamed from: c */
    private final Map f21332c;
    /* renamed from: d */
    private final bmb f21333d;
    /* renamed from: e */
    private final boolean f21334e;

    public exj(bmb bmb, ixb ixb, int i) {
        boolean z;
        super(i);
        if (i <= ixb.mo3153f()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        this.f21330a = ixb;
        this.f21333d = bmb;
        this.f21331b = kes.m4807b(bmb.f1304I, Integer.valueOf(45), bmb.f1277F, Integer.valueOf(3));
        this.f21332c = khb.m4898c();
        this.f21334e = bmb.m886d();
        this.f21332c.put(bmb.f1304I, Boolean.valueOf(this.f21334e));
        this.f21332c.put(bmb.f1277F, Boolean.valueOf(bmb.m885c()));
    }

    /* renamed from: d */
    protected final Pair mo3031d() {
        iwz b = this.f21330a.mo3149b();
        if (b == null) {
            return null;
        }
        return Pair.create(Long.valueOf(b.mo2719f()), new iuz(b));
    }

    /* renamed from: a */
    public final synchronized void mo3030a(boolean z) {
        if (this.f21334e) {
            this.f21332c.put(Boolean.valueOf(this.f21333d.m886d()), Boolean.valueOf(z));
            int i = 0;
            for (Entry entry : this.f21331b.entrySet()) {
                Object key = entry.getKey();
                if (this.f21332c.containsKey(key) && ((Boolean) this.f21332c.get(key)).booleanValue()) {
                    i = ((Integer) entry.getValue()).intValue() + i;
                }
            }
            m10044a(i);
        }
    }

    public final void close() {
        this.f21330a.close();
        iwz iwz = (iwz) m10048e();
        while (iwz != null) {
            iwz.close();
            iwz = (iwz) m10048e();
        }
    }

    /* renamed from: a */
    protected final /* synthetic */ iqo mo3029a(iqo iqo) {
        return ((iuz) iqo).m17593h();
    }

    public final String t_() {
        return "VideoFrameStore";
    }
}
