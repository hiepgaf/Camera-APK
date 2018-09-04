package p000;

/* compiled from: PG */
/* renamed from: auz */
final class auz implements iju {
    /* renamed from: a */
    public final /* synthetic */ aux f10332a;

    auz(aux aux) {
        this.f10332a = aux;
    }

    /* renamed from: a */
    public final /* synthetic */ kpk mo368a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        String str = aux.f10323a;
        String valueOf = String.valueOf(bool2);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
        stringBuilder.append("PassiveFocusScan: isInFocused=");
        stringBuilder.append(valueOf);
        bli.m871d(str, stringBuilder.toString());
        this.f10332a.f10327e = null;
        if (bool.booleanValue()) {
            bli.m871d(aux.f10323a, "PassiveFocusConvergeAnimation: start");
            aux aux = this.f10332a;
            aux.f10326d = aux.f10324b.mo2795c();
            jri.m13152b(this.f10332a.f10326d);
            this.f10332a.f10326d.mo1734a(new ava(this));
        }
        return null;
    }
}
