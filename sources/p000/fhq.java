package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fhq */
public final class fhq implements Comparable {
    /* renamed from: a */
    public final long f4562a;
    /* renamed from: b */
    public final long f4563b;
    /* renamed from: c */
    private final long f4564c;

    public fhq(long j, long j2, long j3) {
        this.f4562a = j;
        this.f4563b = j2;
        this.f4564c = j3;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return (this.f4563b > ((fhq) obj).f4563b ? 1 : (this.f4563b == ((fhq) obj).f4563b ? 0 : -1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof fhq)) {
            return false;
        }
        fhq fhq = (fhq) obj;
        if (this.f4563b == fhq.f4563b && this.f4562a == fhq.f4562a && this.f4564c == fhq.f4564c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4562a), Long.valueOf(this.f4563b), Long.valueOf(this.f4564c)});
    }

    public final String toString() {
        return jqk.m13098b((Object) this).m4741a("timestamp", this.f4562a).m4741a("onStartedId", this.f4563b).m4741a("frameNumber", this.f4564c).toString();
    }
}
