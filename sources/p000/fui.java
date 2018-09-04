package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: fui */
final class fui implements kov {
    /* renamed from: a */
    private final /* synthetic */ fub f16530a;
    /* renamed from: b */
    private final /* synthetic */ fuh f16531b;

    fui(fuh fuh, fub fub) {
        this.f16531b = fuh;
        this.f16530a = fub;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        iqz iqz = this.f16531b.f16529a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("Unable to log capture metadata: ");
        stringBuilder.append(valueOf);
        iqz.mo516c(stringBuilder.toString());
    }

    public final /* synthetic */ void b_(Object obj) {
        Iterable iterable = (List) obj;
        jri.m13152b((Object) iterable);
        Object obj2 = (String) khb.m4861a(iterable, 0);
        Object obj3 = (String) khb.m4861a(iterable, 1);
        iqz iqz = this.f16531b.f16529a;
        String valueOf = String.valueOf(jqk.m13099b("Capture Metadata").m4742a("Input", obj2).m4742a("Reprocessing", obj3).m4742a("NPF", this.f16530a.f4719f).toString());
        String str = "Capture Metadata: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        iqz.mo519e(valueOf);
    }
}
