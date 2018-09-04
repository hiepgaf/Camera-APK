package p000;

import android.support.v7.app.AlertController;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* compiled from: PG */
/* renamed from: ly */
public final class ly implements OnItemClickListener {
    /* renamed from: a */
    private final /* synthetic */ AlertController f8820a;
    /* renamed from: b */
    private final /* synthetic */ lx f8821b;

    public ly(lx lxVar, AlertController alertController) {
        this.f8821b = lxVar;
        this.f8820a = alertController;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f8821b.f8818i.onClick(this.f8820a.f608b, i);
        this.f8820a.f608b.dismiss();
    }
}
