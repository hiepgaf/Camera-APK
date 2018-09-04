package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* renamed from: ith */
public final class ith {
    /* renamed from: c */
    public static final int[] f7456c = new int[]{0, 1, 2, 3, 4};
    /* renamed from: a */
    public final int f7457a;
    /* renamed from: b */
    public int f7458b = 0;
    /* renamed from: d */
    private final Map f7459d = new TreeMap();

    public ith(int i) {
        this.f7457a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof ith) {
            ith ith = (ith) obj;
            if (ith.f7457a == this.f7457a && ith.m4204b() == m4204b()) {
                for (ite ite : ith.m4203a()) {
                    if (ite != null && !ExifInterface.m8472a(ite.f7446a) && !ite.equals((ite) this.f7459d.get(Short.valueOf(ite.f7446a)))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected final ite[] m4203a() {
        return (ite[]) this.f7459d.values().toArray(new ite[this.f7459d.size()]);
    }

    /* renamed from: a */
    public final ite m4202a(short s) {
        return (ite) this.f7459d.get(Short.valueOf(s));
    }

    /* renamed from: b */
    protected final int m4204b() {
        return this.f7459d.size();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7457a), Integer.valueOf(this.f7458b), this.f7459d});
    }

    /* renamed from: b */
    protected final void m4205b(short s) {
        this.f7459d.remove(Short.valueOf(s));
    }

    /* renamed from: a */
    public final ite m4201a(ite ite) {
        ite.f7450e = this.f7457a;
        return (ite) this.f7459d.put(Short.valueOf(ite.f7446a), ite);
    }
}
