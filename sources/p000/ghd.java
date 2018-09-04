package p000;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: ghd */
public final class ghd {
    /* renamed from: a */
    public final Object f5190a;
    /* renamed from: b */
    public final LinkedList f5191b;
    /* renamed from: c */
    public final HashMap f5192c;
    /* renamed from: d */
    public final int f5193d;
    /* renamed from: e */
    public int f5194e;

    public ghd(int i) {
        ghe ghe = new ghe();
        this(i, (byte) 0);
    }

    private ghd(int i, byte b) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13144a(z, (Object) "maxSize must be > 0.");
        this.f5193d = i;
        this.f5190a = new Object();
        this.f5191b = new LinkedList();
        this.f5192c = new HashMap();
    }

    /* renamed from: a */
    public final Object m2548a(Object obj) {
        Object remove;
        jri.m13152b(obj);
        synchronized (this.f5190a) {
            if (this.f5191b.removeLastOccurrence(obj)) {
                remove = ((Queue) jri.m13152b((Queue) this.f5192c.get(obj))).remove();
                int i = this.f5194e;
                jri.m13144a(true, (Object) "Size was < 0.");
                this.f5194e = i - 1;
            } else {
                remove = null;
            }
        }
        return remove;
    }
}
