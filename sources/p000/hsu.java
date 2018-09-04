package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.apps.refocus.processing.DepthOfFieldOptions;
import com.google.android.apps.refocus.processing.ProgressCallback;
import com.google.android.apps.refocus.processing.Renderer;
import com.google.android.apps.refocus.processing.Renderer.Priority;

/* compiled from: PG */
/* renamed from: hsu */
public final class hsu implements Runnable {
    /* renamed from: a */
    public final hsw f6590a;
    /* renamed from: b */
    private final Context f6591b;
    /* renamed from: c */
    private final DepthOfFieldOptions f6592c;
    /* renamed from: d */
    private final ProgressCallback f6593d;
    /* renamed from: e */
    private final Bitmap f6594e;
    /* renamed from: f */
    private final Handler f6595f;

    public hsu(Context context, DepthOfFieldOptions depthOfFieldOptions, hsw hsw, ProgressCallback progressCallback, Bitmap bitmap) {
        this.f6591b = context;
        this.f6592c = depthOfFieldOptions;
        this.f6595f = new Handler(context.getMainLooper());
        this.f6590a = hsw;
        this.f6593d = progressCallback;
        this.f6594e = bitmap;
    }

    public final void run() {
        this.f6595f.post(new hsv(this, new Renderer(this.f6591b, Priority.NORMAL).render(this.f6592c, this.f6593d, this.f6594e)));
    }
}
