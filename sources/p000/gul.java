package p000;

import android.view.View.OnSystemUiVisibilityChangeListener;

/* compiled from: PG */
/* renamed from: gul */
final class gul implements OnSystemUiVisibilityChangeListener {
    /* renamed from: a */
    private final /* synthetic */ guj f5704a;

    gul(guj guj) {
        this.f5704a = guj;
    }

    public final void onSystemUiVisibilityChange(int i) {
        String str = guj.f17361a;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("onSystemUiVisibilityChange() ");
        stringBuilder.append(i);
        bli.m863a(str, stringBuilder.toString());
        int systemUiVisibility = this.f5704a.f17362b.getDecorView().getSystemUiVisibility();
        guj guj = this.f5704a;
        if ((systemUiVisibility ^ guj.f17364d) != 0 && !guj.f17363c) {
            guj.m11548a();
        }
    }
}
