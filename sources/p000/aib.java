package p000;

/* compiled from: PG */
/* renamed from: aib */
public final class aib {
    /* renamed from: a */
    private final arn f485a = new arn(1000);
    /* renamed from: b */
    private final iw f486b = ars.m660a(10, new aic());

    /* renamed from: b */
    private final String m298b(adl adl) {
        aid aid = (aid) aqe.m585a((aid) this.f486b.mo341a(), "Argument must not be null");
        try {
            adl.mo21a(aid.f9811a);
            String a = arq.m650a(aid.f9811a.digest());
            return a;
        } finally {
            this.f486b.mo342a(aid);
        }
    }

    /* renamed from: a */
    public final String m299a(adl adl) {
        String str;
        synchronized (this.f485a) {
            str = (String) this.f485a.m638b(adl);
        }
        if (str == null) {
            str = m298b(adl);
        }
        synchronized (this.f485a) {
            this.f485a.m639b(adl, str);
        }
        return str;
    }
}
