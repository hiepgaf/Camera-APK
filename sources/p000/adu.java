package p000;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: adu */
public abstract class adu implements adw {
    /* renamed from: a */
    private final String f9637a;
    /* renamed from: b */
    private final AssetManager f9638b;
    /* renamed from: c */
    private Object f9639c;

    public adu(AssetManager assetManager, String str) {
        this.f9638b = assetManager;
        this.f9637a = str;
    }

    /* renamed from: a */
    protected abstract Object mo2586a(AssetManager assetManager, String str);

    /* renamed from: a */
    protected abstract void mo2587a(Object obj);

    /* renamed from: b */
    public final void mo25b() {
    }

    /* renamed from: c */
    public final void mo26c() {
        Object obj = this.f9639c;
        if (obj != null) {
            try {
                mo2587a(obj);
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: d */
    public final adf mo27d() {
        return adf.LOCAL;
    }

    /* renamed from: a */
    public final void mo24a(acg acg, adx adx) {
        try {
            this.f9639c = mo2586a(this.f9638b, this.f9637a);
            adx.mo37a(this.f9639c);
        } catch (Exception e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            adx.mo36a(e);
        }
    }
}
