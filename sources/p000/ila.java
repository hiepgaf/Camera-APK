package p000;

/* compiled from: PG */
/* renamed from: ila */
public final class ila implements ikv {
    /* renamed from: a */
    private final ird f18340a;

    public ila(ird ird) {
        this.f18340a = ird;
    }

    /* renamed from: a */
    public final void mo1881a(iqo iqo) {
        if (iqo instanceof ikz) {
            try {
                this.f18340a.mo1903a(((ikz) iqo).t_());
                iqo.close();
            } finally {
                this.f18340a.mo1904b();
            }
        } else {
            iqo.close();
        }
    }

    /* renamed from: a */
    public final void mo1882a(Iterable iterable, String str) {
        try {
            this.f18340a.mo1903a(str);
            for (iqo a : iterable) {
                mo1881a(a);
            }
        } finally {
            this.f18340a.mo1904b();
        }
    }
}
