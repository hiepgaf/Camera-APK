package p000;

import android.widget.TextView;

/* compiled from: PG */
/* renamed from: elx */
public final class elx implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ TextView f3955a;
    /* renamed from: b */
    private final /* synthetic */ int f3956b;

    public elx(TextView textView, int i) {
        this.f3955a = textView;
        this.f3956b = i;
    }

    public final void run() {
        this.f3955a.setText(this.f3956b);
        this.f3955a.setVisibility(0);
    }
}
