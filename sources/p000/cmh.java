package p000;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.View;
import android.widget.Toolbar;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cmh */
final class cmh {
    /* renamed from: a */
    public final Toolbar f2144a;
    /* renamed from: b */
    public final cmm f2145b;
    /* renamed from: c */
    public final Resources f2146c;
    /* renamed from: d */
    public final kbn f2147d;
    /* renamed from: e */
    public Menu f2148e;
    /* renamed from: f */
    public Drawable f2149f;
    /* renamed from: g */
    public Drawable f2150g;
    /* renamed from: h */
    public int f2151h = -1;

    cmh(cmm cmm, Resources resources, kbn kbn, View view) {
        this.f2145b = cmm;
        this.f2146c = resources;
        this.f2147d = kbn;
        this.f2144a = (Toolbar) view.findViewById(R.id.toolbar);
    }

    /* renamed from: a */
    final void m1180a(boolean z) {
        this.f2148e.findItem(R.id.action_delete).setVisible(z);
    }

    /* renamed from: b */
    final void m1181b(boolean z) {
        int i = this.f2151h;
        if (i != -1) {
            this.f2148e.findItem(i).setVisible(z);
        }
    }

    /* renamed from: c */
    final void m1182c(boolean z) {
        this.f2148e.findItem(R.id.action_share).setVisible(z);
    }
}
