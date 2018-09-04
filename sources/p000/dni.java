package p000;

import android.os.Handler;
import java.util.List;

/* compiled from: PG */
/* renamed from: dni */
final class dni implements kov {
    /* renamed from: a */
    public final /* synthetic */ dmy f13588a;
    /* renamed from: b */
    private final /* synthetic */ Handler f13589b;

    dni(dmy dmy, Handler handler) {
        this.f13588a = dmy;
        this.f13589b = handler;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        this.f13588a.f1595a.mo573a(new dlu());
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f13589b.post(new dnj(this, (List) obj));
    }
}
