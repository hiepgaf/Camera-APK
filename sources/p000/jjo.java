package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Pair;
import java.util.List;

/* compiled from: PG */
/* renamed from: jjo */
final class jjo implements izi {
    /* renamed from: a */
    private final jqr f18856a;
    /* renamed from: b */
    private final List f18857b;

    public jjo(jqr jqr, List list) {
        this.f18856a = jqr;
        this.f18857b = list;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo711a(Object obj) {
        jqr jqr = (jqr) obj;
        Canvas canvas = new Canvas((Bitmap) jqr.mo3191e());
        Paint paint = new Paint();
        for (Pair pair : this.f18857b) {
            Rect rect = (Rect) pair.first;
            Rect rect2 = (Rect) pair.second;
            if (!((Bitmap) this.f18856a.mo3191e()).isPremultiplied()) {
                ((Bitmap) this.f18856a.mo3191e()).setPremultiplied(true);
            }
            canvas.drawBitmap((Bitmap) this.f18856a.mo3191e(), rect2, rect, paint);
        }
        canvas.setBitmap(null);
        this.f18856a.close();
        return jqr;
    }
}
