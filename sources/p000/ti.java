package p000;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* compiled from: PG */
/* renamed from: ti */
final class ti implements OnItemSelectedListener {
    /* renamed from: a */
    private final /* synthetic */ tg f9278a;

    ti(tg tgVar) {
        this.f9278a = tgVar;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i != -1) {
            sh shVar = this.f9278a.f19616e;
            if (shVar != null) {
                shVar.f9201a = false;
            }
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
