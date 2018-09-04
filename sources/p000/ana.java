package p000;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: ana */
final class ana implements amo {
    /* renamed from: a */
    private final amw f9899a;
    /* renamed from: b */
    private final arl f9900b;

    ana(amw amw, arl arl) {
        this.f9899a = amw;
        this.f9900b = arl;
    }

    /* renamed from: a */
    public final void mo115a(agw agw, Bitmap bitmap) {
        IOException iOException = this.f9900b.f913a;
        if (iOException != null) {
            if (bitmap != null) {
                agw.mo63a(bitmap);
            }
            throw iOException;
        }
    }

    /* renamed from: a */
    public final void mo114a() {
        this.f9899a.m360a();
    }
}
