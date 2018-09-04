package p000;

import android.hardware.camera2.CaptureRequest.Key;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fin */
public final class fin {
    /* renamed from: a */
    public final Key f4571a;
    /* renamed from: b */
    public final Object f4572b;

    public fin(Key key, Object obj) {
        this.f4571a = (Key) jri.m13139a((Object) key, (Object) "Parameter keys cannot be null.");
        this.f4572b = jri.m13139a(obj, (Object) "Parameter values cannot be null.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof fin)) {
            return false;
        }
        fin fin = (fin) obj;
        if (kbf.m16436b(this.f4571a, fin.f4571a) && kbf.m16436b(this.f4572b, fin.f4572b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4571a, this.f4572b});
    }
}
