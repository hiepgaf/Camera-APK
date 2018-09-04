package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: ws */
public final class ws extends wr {
    /* renamed from: b */
    private String f19664b;
    /* renamed from: c */
    private Iterator f19665c;
    /* renamed from: d */
    private int f19666d = 0;
    /* renamed from: e */
    private final /* synthetic */ wc f19667e;

    public ws(wc wcVar, ww wwVar, String str) {
        this.f19667e = wcVar;
        super(wcVar);
        if (wwVar.m6194d().m6239b(kvl.UNSET_ENUM_VALUE)) {
            wcVar.f9445b = wwVar.f9480a;
        }
        this.f19664b = m6170a(wwVar, null, 1);
        this.f19665c = wwVar.m6199h();
    }

    public final boolean hasNext() {
        while (this.f9470a == null) {
            if (!this.f19665c.hasNext()) {
                return false;
            }
            String str;
            ww wwVar = (ww) this.f19665c.next();
            this.f19666d++;
            if (wwVar.m6194d().m6239b(kvl.UNSET_ENUM_VALUE)) {
                this.f19667e.f9445b = wwVar.f9480a;
                str = null;
            } else if (wwVar.f9482c == null) {
                str = null;
            } else {
                str = m6170a(wwVar, this.f19664b, this.f19666d);
            }
            if (this.f19667e.f9444a.m6239b(512)) {
                if (!wwVar.m6197f()) {
                }
            }
            this.f9470a = wr.m6168a(wwVar, this.f19667e.f9445b, str);
            return true;
        }
        return true;
    }
}
