package p000;

import android.view.View;
import java.util.List;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: clp */
final class clp implements kov {
    /* renamed from: a */
    private final /* synthetic */ cli f12156a;

    clp(cli cli) {
        this.f12156a = cli;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        throw new RuntimeException(th);
    }

    public final /* synthetic */ void b_(Object obj) {
        List list = (List) obj;
        for (Entry entry : this.f12156a.f2122i.entrySet()) {
            if (list.contains(entry.getKey())) {
                ((View) entry.getValue()).setVisibility(0);
            } else {
                ((View) entry.getValue()).setVisibility(8);
            }
        }
        this.f12156a.f2121h = list.isEmpty();
        cli cli = this.f12156a;
        if (cli.f2121h) {
            cli.m1173b();
        }
    }
}
