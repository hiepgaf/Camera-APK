package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* compiled from: PG */
/* renamed from: rj */
final class rj implements OnItemClickListener {
    /* renamed from: a */
    private final /* synthetic */ ri f9113a;

    rj(ri riVar) {
        this.f9113a = riVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f9113a.f22557d.setSelection(i);
        if (this.f9113a.f22557d.getOnItemClickListener() != null) {
            ri riVar = this.f9113a;
            riVar.f22557d.performItemClick(view, i, riVar.f22555b.getItemId(i));
        }
        this.f9113a.mo2471c();
    }
}
