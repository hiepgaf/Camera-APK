package p000;

import android.widget.TextView;

/* compiled from: PG */
/* renamed from: ely */
public final class ely implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ TextView f3957a;

    public ely(TextView textView) {
        this.f3957a = textView;
    }

    public final void run() {
        this.f3957a.setVisibility(4);
    }
}
