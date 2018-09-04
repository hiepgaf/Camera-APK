package p000;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: fsm */
public final class fsm {
    /* renamed from: a */
    public final fss f4685a;
    /* renamed from: b */
    public final List f4686b;
    /* renamed from: c */
    public final List f4687c;

    public fsm(fss fss, List list, List list2) {
        this.f4685a = fss;
        this.f4686b = list;
        this.f4687c = list2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fsm) {
            fsm fsm = (fsm) obj;
            if (this.f4685a.equals(fsm.f4685a) && this.f4686b.equals(fsm.f4686b) && this.f4687c.equals(fsm.f4687c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4685a, this.f4686b, this.f4687c});
    }

    public final String toString() {
        return jqk.m13099b("ImageSaverTrace").m4742a("ProcessingMethod", this.f4685a).m4742a("Input Image Metadata", this.f4686b).m4742a("Reprocessing Metadata", this.f4687c).toString();
    }
}
