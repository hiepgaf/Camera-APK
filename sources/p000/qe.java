package p000;

/* compiled from: PG */
/* renamed from: qe */
final class qe implements pf {
    /* renamed from: a */
    private final /* synthetic */ py f19548a;

    qe(py pyVar) {
        this.f19548a = pyVar;
    }

    /* renamed from: a */
    public final void mo2353a(op opVar, boolean z) {
        if (opVar instanceof pn) {
            opVar.mo3318d().m14248a(false);
        }
        pf pfVar = this.f19548a.f19462d;
        if (pfVar != null) {
            pfVar.mo2353a(opVar, z);
        }
    }

    /* renamed from: a */
    public final boolean mo2354a(op opVar) {
        if (opVar == null) {
            return false;
        }
        ((pn) opVar).getItem().getItemId();
        pf pfVar = this.f19548a.f19462d;
        return pfVar != null ? pfVar.mo2354a(opVar) : false;
    }
}
