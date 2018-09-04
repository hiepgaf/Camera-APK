package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* compiled from: PG */
/* renamed from: ijs */
public final class ijs implements kov {
    /* renamed from: a */
    private final /* synthetic */ ijv f18315a;

    public ijs(ijv ijv) {
        this.f18315a = ijv;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        ijv ijv = this.f18315a;
        bli.m867b(dmf.f21096c, "Failed to open camera: ", th);
        ijv.f7041a.f1595a.mo573a(new dav());
    }

    public final /* synthetic */ void b_(Object obj) {
        List list = (List) jri.m13152b((List) obj);
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        ijv ijv = this.f18315a;
        bfe bfe = (bfe) obj2;
        iwl iwl = (iwl) obj3;
        Handler handler = new Handler(Looper.getMainLooper());
        dmf dmf = ijv.f7041a;
        dmf.f21102i = null;
        dmf.f21103j = bfe;
        handler.post(new dml(ijv, bfe, iwl));
    }
}
