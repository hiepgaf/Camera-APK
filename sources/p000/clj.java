package p000;

/* compiled from: PG */
/* renamed from: clj */
final class clj implements clr {
    clj() {
    }

    /* renamed from: a */
    public final void mo717a(jiy jiy) {
        String str = cli.f2113a;
        String valueOf = String.valueOf(jiy);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 68);
        stringBuilder.append("Artifact creation button clicked for type ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" but no handler specified.");
        bli.m873e(str, stringBuilder.toString());
    }
}
