package p000;

import android.graphics.Bitmap;
import android.util.Log;

/* compiled from: PG */
/* renamed from: dan */
public final class dan implements kov {
    /* renamed from: a */
    private final /* synthetic */ dak f13039a;

    public dan(dak dak) {
        this.f13039a = dak;
    }

    /* renamed from: a */
    public final void mo349a(Throwable th) {
        Log.e("ImageIntModuleUI", "Failed to get screenshot.", th);
    }

    public final /* synthetic */ void b_(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.f13039a.m1570a(bitmap, true);
        }
    }
}
