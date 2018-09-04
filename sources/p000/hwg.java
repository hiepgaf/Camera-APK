package p000;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* renamed from: hwg */
public final class hwg {
    /* renamed from: a */
    public final String f6774a;
    /* renamed from: b */
    private final String f6775b;

    public hwg(String str, String str2) {
        this.f6775b = htl.m3403a(str);
        this.f6774a = htl.m3403a(str2);
    }

    /* renamed from: a */
    public final Intent m3555a() {
        String str = this.f6775b;
        return str != null ? new Intent(str).setPackage(this.f6774a) : new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwg)) {
            return false;
        }
        return htl.m3426a(this.f6775b, ((hwg) obj).f6775b) && htl.m3426a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6775b, null});
    }

    public final String toString() {
        String str = this.f6775b;
        if (str != null) {
            return str;
        }
        ComponentName componentName = null;
        return componentName.flattenToString();
    }
}
