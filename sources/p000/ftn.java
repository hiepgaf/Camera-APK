package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: ftn */
final class ftn {
    /* renamed from: a */
    public final String f4709a;
    /* renamed from: b */
    public List f4710b;

    ftn(String str, List list) {
        this.f4709a = str;
        this.f4710b = list;
    }

    public final String toString() {
        return jqk.m13099b("ValidationResult").m4742a("strategy", this.f4709a).m4742a("valid", (Object) "false").m4742a("failed constraints", this.f4710b).toString();
    }
}
