package p000;

import android.support.v4.app.Person;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fkq */
public final class fkq {
    /* renamed from: a */
    private final String f4600a;

    fkq(String str) {
        jri.m13152b((Object) str);
        this.f4600a = str;
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof fkq) && this.f4600a.equals(((fkq) obj).f4600a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4600a});
    }

    public final String toString() {
        return jqk.m13098b((Object) this).m4742a(Person.NAME_KEY, this.f4600a).toString();
    }
}
