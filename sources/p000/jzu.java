package p000;

import android.annotation.TargetApi;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jzu */
public final class jzu {
    /* renamed from: a */
    public static final jzu f8162a = new jzu();
    /* renamed from: b */
    private final List f8163b = new ArrayList();
    /* renamed from: c */
    private final ReferenceQueue f8164c = new ReferenceQueue();

    /* renamed from: a */
    public final synchronized void m4720a(Object obj) {
        if (jlo.m4540b()) {
            Iterator it = this.f8163b.iterator();
            while (it.hasNext()) {
                if (((jzv) it.next()).get() == obj) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void m4721b(Object obj) {
        if (jlo.m4540b()) {
            for (jzv jzv : this.f8163b) {
                if (jzv.get() == obj) {
                    break;
                }
            }
            this.f8163b.add(new jzv(obj, this.f8164c));
        }
    }
}
