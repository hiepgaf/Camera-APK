package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: izt */
public final class izt extends izp implements izs {
    public izt(List list) {
        super(list);
    }

    public final void close() {
        Throwable th = null;
        for (izr izr : this.f7591a) {
            if (izr != null) {
                try {
                    izr.close();
                } catch (Throwable e) {
                    if (th != null) {
                        kqg.m5044a(th, e);
                    } else {
                        th = e;
                    }
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return new izt(super.subList(i, i2));
    }
}
