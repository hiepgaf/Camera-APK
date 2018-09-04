package p000;

import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: ghg */
public final class ghg implements iqo {
    /* renamed from: a */
    private final Object f16912a = new Object();
    /* renamed from: b */
    private final ghf f16913b;
    /* renamed from: c */
    private Object f16914c;
    /* renamed from: d */
    private Object f16915d;

    public ghg(ghf ghf, Object obj, Object obj2) {
        this.f16913b = ghf;
        this.f16914c = obj;
        this.f16915d = obj2;
    }

    public final void close() {
        synchronized (this.f16912a) {
            Object obj = this.f16915d;
            if (obj != null) {
                ghf ghf = this.f16913b;
                Object obj2 = this.f16914c;
                synchronized (ghf.f5196b) {
                    ghd ghd = ghf.f5195a;
                    Object b = ghf.mo1484b(obj);
                    jri.m13152b(obj2);
                    jri.m13152b(b);
                    synchronized (ghd.f5190a) {
                        Queue queue;
                        ghd.f5191b.push(obj2);
                        if (ghd.f5192c.containsKey(obj2)) {
                            queue = (Queue) ghd.f5192c.get(obj2);
                        } else {
                            queue = new LinkedList();
                            ghd.f5192c.put(obj2, queue);
                        }
                        queue.add(b);
                        int i = ghd.f5194e;
                        jri.m13144a(true, (Object) "Size was < 0.");
                        ghd.f5194e = i + 1;
                        int i2 = ghd.f5193d;
                        while (ghd.f5194e > i2 && !ghd.f5191b.isEmpty()) {
                            obj2 = ghd.f5191b.removeLast();
                            if (obj2 != null) {
                                queue = (Queue) jri.m13152b((Queue) ghd.f5192c.get(obj2));
                                queue.remove();
                                if (queue.size() <= 0) {
                                    ghd.f5192c.remove(obj2);
                                }
                                i = ghd.f5194e;
                                jri.m13144a(true, (Object) "Size was < 0.");
                                ghd.f5194e = i - 1;
                            }
                        }
                        if (ghd.f5194e < 0 || (ghd.f5191b.isEmpty() && ghd.f5194e != 0)) {
                            throw new IllegalStateException("LruPool.sizeOf() is reporting inconsistent results!");
                        }
                    }
                }
                this.f16915d = null;
                this.f16914c = null;
            }
        }
    }

    /* renamed from: a */
    public final Object m11082a() {
        Object obj;
        synchronized (this.f16912a) {
            obj = this.f16915d;
        }
        return obj;
    }
}
