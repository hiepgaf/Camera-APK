package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: exd */
public final class exd {
    /* renamed from: a */
    public final ixm f4326a = ion.m3964c(68);
    /* renamed from: b */
    private final Map f4327b = new HashMap();

    /* renamed from: a */
    public final synchronized void m2184a(exf exf, Executor executor) {
        this.f4327b.put(exf, executor);
    }

    /* renamed from: a */
    public final void m2182a() {
        for (gid close : this.f4326a.mo1958e()) {
            close.close();
        }
    }

    /* renamed from: a */
    public final synchronized void m2185a(gid gid) {
        for (Entry entry : this.f4327b.entrySet()) {
            ((Executor) entry.getValue()).execute(new exe(entry, gid));
        }
    }

    /* renamed from: b */
    public final List m2186b() {
        return this.f4326a.mo1955b();
    }

    /* renamed from: a */
    public final synchronized void m2183a(exf exf) {
        if (this.f4327b.containsKey(exf)) {
            this.f4327b.remove(exf);
        }
    }
}
