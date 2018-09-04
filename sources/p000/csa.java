package p000;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: csa */
final class csa implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ crw f2635a;

    csa(crw crw) {
        this.f2635a = crw;
    }

    public final void onClick(View view) {
        crx crx = this.f2635a.f2614c;
        if (crx != null) {
            cfk cfk = crx.f2631a;
            cre a = cfk.f20253D.mo1070a();
            if (a != cre.f2587c) {
                kbg j = a.mo1066e().mo1036j();
                if (j.mo2084b()) {
                    Context context = cfk.f20279e;
                    ListView listView = (ListView) LayoutInflater.from(context).inflate(R.layout.details_list, null, false);
                    listView.setAdapter(new ebp(context, (cqd) j.mo2081a()));
                    new Builder(context, 16974546).setTitle(R.string.details).setView(listView).setPositiveButton(R.string.close, new ebo()).create().show();
                    cfk.f20266Q.mo1584a(cfk.m14951c(a), 5, cfk.m14944b(a));
                }
            }
        }
    }
}
