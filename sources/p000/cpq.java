package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cpq */
public final class cpq implements kwk {
    /* renamed from: a */
    private final kwk f12487a;
    /* renamed from: b */
    private final kwk f12488b;
    /* renamed from: c */
    private final kwk f12489c;
    /* renamed from: d */
    private final kwk f12490d;
    /* renamed from: e */
    private final kwk f12491e;
    /* renamed from: f */
    private final kwk f12492f;

    public cpq(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6) {
        this.f12487a = kwk;
        this.f12488b = kwk2;
        this.f12489c = kwk3;
        this.f12490d = kwk4;
        this.f12491e = kwk5;
        this.f12492f = kwk6;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f12487a;
        kwk kwk2 = this.f12488b;
        kwk kwk3 = this.f12489c;
        kwk kwk4 = this.f12490d;
        kwk kwk5 = this.f12491e;
        Context context = (Context) kwk.mo345a();
        LayoutInflater layoutInflater = (LayoutInflater) kwk2.mo345a();
        Resources resources = (Resources) kwk3.mo345a();
        awk awk = (awk) kwk5.mo345a();
        cqf cqf = (cqf) this.f12492f.mo345a();
        BitmapDrawable bitmapDrawable = (BitmapDrawable) resources.getDrawable(R.drawable.placeholder_locked);
        int height = bitmapDrawable.getBitmap().getHeight();
        cqa cqa = new cqa(context, (hfz) kwk4.mo345a(), new cqo(go.ap, awk, bitmapDrawable.getBitmap().getWidth(), height, layoutInflater, resources), cqf);
        cqa.mo1002a();
        return (cqa) ktm.m13963a(cqa, "Cannot return null from a non-@Nullable @Provides method");
    }
}
