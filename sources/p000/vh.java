package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: vh */
public final class vh extends ContextWrapper {
    static {
        Object obj = new Object();
    }

    public final AssetManager getAssets() {
        throw new NoSuchMethodError();
    }

    public final Resources getResources() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static Context m6044a(Context context) {
        if (!((context instanceof vh) || (context.getResources() instanceof vj))) {
            context.getResources();
        }
        return context;
    }
}
