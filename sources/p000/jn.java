package p000;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: jn */
final class jn implements OnApplyWindowInsetsListener {
    /* renamed from: a */
    private final /* synthetic */ jk f7936a;

    jn(jk jkVar) {
        this.f7936a = jkVar;
    }

    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        return (WindowInsets) kj.m4974a(this.f7936a.mo439a(view, kj.m4975a((Object) windowInsets)));
    }
}
