package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: hdx */
final class hdx implements kov {
    /* renamed from: a */
    private final /* synthetic */ hdt f17706a;

    hdx(hdt hdt) {
        this.f17706a = hdt;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        String str = hdt.f6068b;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
        stringBuilder.append("Failed added Lens toybox entry: ");
        stringBuilder.append(valueOf);
        bli.m866b(str, stringBuilder.toString());
    }

    public final /* synthetic */ void b_(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            List list = this.f17706a.f6069a;
            list.add(list.size() - 1, hhx.LENS);
            this.f17706a.notifyDataSetChanged();
        }
    }
}
