package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: ffw */
public final class ffw extends imq {
    /* renamed from: b */
    private final Collection f23178b;
    /* renamed from: c */
    private final Collection f23179c;
    /* renamed from: d */
    private final fis f23180d;

    public ffw(Collection collection, Collection collection2) {
        this(collection, collection2, fds.m10234a());
    }

    private ffw(Collection collection, Collection collection2, fis fis) {
        super(ilq.m3820a(collection2));
        this.f23178b = collection;
        this.f23179c = collection2;
        this.f23180d = fis;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3397b(Object obj) {
        List<fis> list = (List) obj;
        fio fio = new fio();
        for (fis a : this.f23178b) {
            a.m2312a(fio);
        }
        for (fis a2 : list) {
            a2.m2312a(fio);
        }
        this.f23180d.m2312a(fio);
        return fio.m2301a();
    }

    /* renamed from: a */
    public final ffw m17308a(fis... fisArr) {
        return new ffw(this.f23178b, this.f23179c, fds.m10241a(this.f23180d, fds.m10241a(fisArr)));
    }
}
