package p000;

import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: gxo */
public final /* synthetic */ class gxo implements OnClickListener {
    /* renamed from: a */
    private final gxn f5775a;
    /* renamed from: b */
    private final Handler f5776b;

    public gxo(gxn gxn, Handler handler) {
        this.f5775a = gxn;
        this.f5776b = handler;
    }

    public final void onClick(View view) {
        this.f5776b.post(new gxp(this.f5775a));
    }
}
