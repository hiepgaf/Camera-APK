package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: PG */
/* renamed from: jqx */
public final class jqx implements jqs {
    /* renamed from: a */
    private final jqr f21885a;

    public jqx(jqr jqr) {
        this.f21885a = jqr;
    }

    public final void close() {
        this.f21885a.close();
    }

    /* renamed from: a */
    public final int mo703a() {
        return ((Bitmap) this.f21885a.mo3191e()).getHeight();
    }

    /* renamed from: b */
    public final int mo704b() {
        return ((Bitmap) this.f21885a.mo3191e()).getWidth();
    }

    /* renamed from: a */
    public final jqr mo3173a(jqo jqo) {
        return new jqy((Bitmap) this.f21885a.mo3191e());
    }

    /* renamed from: b */
    public final jqr mo3174b(jqo jqo) {
        return jqp.m4605a(jqo, "inMemHandle:copy", (Bitmap) this.f21885a.mo3191e());
    }

    /* renamed from: a */
    public final jqr mo3172a(Rect rect, jqo jqo) {
        jqr jqr = this.f21885a;
        jqr a = jqo.mo2041a("inMemHandle", rect.width(), rect.height(), Config.ARGB_8888);
        Rect rect2 = new Rect(0, 0, rect.width(), rect.height());
        Canvas canvas = new Canvas((Bitmap) a.mo3191e());
        canvas.drawBitmap((Bitmap) jqr.mo3191e(), rect, rect2, new Paint());
        canvas.setBitmap(null);
        return a;
    }

    /* renamed from: a */
    public final jqr mo3171a(int i, int i2, jqo jqo) {
        return jqp.m4611a(jqo, "inMemHandle:scaled", this.f21885a, i, i2);
    }
}
