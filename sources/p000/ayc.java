package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ayc */
public final class ayc implements ayb {
    /* renamed from: c */
    private static final String f10520c = bli.m862a("AdviceManagerImpl");
    /* renamed from: a */
    public final Set f10521a;
    /* renamed from: b */
    public final iji f10522b;
    /* renamed from: d */
    private ilp f10523d;
    /* renamed from: e */
    private ilp f10524e;
    /* renamed from: f */
    private ilp f10525f;
    /* renamed from: g */
    private ilp f10526g;
    /* renamed from: h */
    private boolean f10527h;
    /* renamed from: i */
    private final kaw f10528i = new ayf();

    public ayc(Set set, iji iji) {
        this.f10521a = set;
        this.f10522b = iji;
    }

    /* renamed from: a */
    public final void mo393a() {
        this.f10527h = false;
        for (ayo a : this.f10521a) {
            a.mo2643a();
        }
    }

    /* renamed from: b */
    public final void mo397b() {
        this.f10527h = true;
    }

    /* renamed from: c */
    public final int mo399c() {
        return ((Integer) this.f10523d.mo2860b()).intValue();
    }

    /* renamed from: d */
    public final boolean mo400d() {
        return ((Boolean) this.f10524e.mo2860b()).booleanValue();
    }

    /* renamed from: a */
    public final void mo396a(iur iur) {
        for (ayo a : this.f10521a) {
            a.mo2645a(iur);
        }
    }

    /* renamed from: a */
    public final void mo395a(gfw gfw) {
        if (!this.f10527h) {
            return;
        }
        if (((Boolean) this.f10526g.mo2860b()).booleanValue()) {
            Object iuz = new iuz(gfw.f5149b, this.f10521a.size());
            for (ayo ayo : this.f10521a) {
                if (((Boolean) ayo.mo2647b().f1031b.mo2860b()).booleanValue() && (ayo instanceof ayq)) {
                    gfw gfw2 = new gfw(new iva(iuz), gfw.f5150c, gfw.f5151d, gfw.f5153f);
                    ((ayq) ayo).m7183d();
                } else {
                    iuz.close();
                }
            }
            return;
        }
        gfw.f5149b.close();
    }

    /* renamed from: b */
    public final void mo398b(gfw gfw) {
        if (this.f10527h && mo400d()) {
            Object iuz = new iuz(gfw.f5149b, this.f10521a.size());
            for (ayo ayo : this.f10521a) {
                if (((Boolean) ayo.mo2647b().f1031b.mo2860b()).booleanValue() && (ayo instanceof ays)) {
                    ((ays) ayo).mo2646a(new gfw(new iva(iuz), gfw.f5150c, gfw.f5151d, gfw.f5153f));
                } else {
                    iuz.close();
                }
            }
            return;
        }
        gfw.f5149b.close();
    }

    /* renamed from: e */
    public final void mo401e() {
        if (this.f10527h && ((Boolean) this.f10525f.mo2860b()).booleanValue()) {
            for (ayo ayo : this.f10521a) {
                if (((Boolean) ayo.mo2647b().f1031b.mo2860b()).booleanValue() && (ayo instanceof ayr)) {
                    ((ayr) ayo).m7184d();
                }
            }
        }
    }

    /* renamed from: g */
    final void m7163g() {
        Collection arrayList = new ArrayList();
        Collection arrayList2 = new ArrayList();
        Collection arrayList3 = new ArrayList();
        Collection arrayList4 = new ArrayList();
        Object valueOf = Boolean.valueOf(false);
        arrayList2.add(ilq.m3818a(valueOf));
        arrayList3.add(ilq.m3818a(valueOf));
        arrayList4.add(ilq.m3818a(valueOf));
        for (ayo ayo : this.f10521a) {
            ayp b = ayo.mo2647b();
            if (ayo instanceof ays) {
                arrayList2.add(b.f1031b);
                if (((Boolean) b.f1031b.mo2860b()).booleanValue()) {
                    arrayList.add(b.f1030a);
                }
            } else if (ayo instanceof ayr) {
                arrayList3.add(b.f1031b);
                if (((Boolean) b.f1031b.mo2860b()).booleanValue()) {
                    arrayList.add(b.f1030a);
                }
            } else if (ayo instanceof ayq) {
                arrayList4.add(b.f1031b);
            }
        }
        this.f10523d = ilq.m3817a(ilq.m3820a(arrayList), this.f10528i);
        this.f10524e = ilq.m3841e(arrayList2);
        this.f10525f = ilq.m3841e(arrayList3);
        this.f10526g = ilq.m3841e(arrayList4);
        String str = f10520c;
        String valueOf2 = String.valueOf(this.f10523d.mo2860b());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 20);
        stringBuilder.append("samplingFrequency = ");
        stringBuilder.append(valueOf2);
        bli.m863a(str, stringBuilder.toString());
        str = f10520c;
        valueOf2 = String.valueOf(this.f10524e.mo2860b());
        stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 18);
        stringBuilder.append("isPreviewActive = ");
        stringBuilder.append(valueOf2);
        bli.m863a(str, stringBuilder.toString());
        str = f10520c;
        valueOf2 = String.valueOf(this.f10525f.mo2860b());
        stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 26);
        stringBuilder.append("isPreviewMetadataActive = ");
        stringBuilder.append(valueOf2);
        bli.m863a(str, stringBuilder.toString());
        str = f10520c;
        valueOf2 = String.valueOf(this.f10526g.mo2860b());
        stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 22);
        stringBuilder.append("isPostCaptureActive = ");
        stringBuilder.append(valueOf2);
        bli.m863a(str, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo394a(ayx ayx) {
        for (ayo a : this.f10521a) {
            a.mo2644a(ayx);
        }
    }

    /* renamed from: f */
    public final void mo402f() {
        for (ayo c : this.f10521a) {
            c.mo2648c();
        }
    }
}
