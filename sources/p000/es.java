package p000;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: es */
final class es implements fc {
    /* renamed from: a */
    private final /* synthetic */ View f15433a;
    /* renamed from: b */
    private final /* synthetic */ ArrayList f15434b;

    es(View view, ArrayList arrayList) {
        this.f15433a = view;
        this.f15434b = arrayList;
    }

    /* renamed from: a */
    public final void mo1274a(ex exVar) {
        exVar.mo1374b((fc) this);
        this.f15433a.setVisibility(8);
        int size = this.f15434b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f15434b.get(i)).setVisibility(0);
        }
    }

    /* renamed from: a */
    public final void mo1273a() {
    }

    /* renamed from: b */
    public final void mo1275b() {
    }

    /* renamed from: c */
    public final void mo1276c() {
    }
}
