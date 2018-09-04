package p000;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* renamed from: aee */
public final class aee extends adu {
    public aee(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo2587a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    /* renamed from: a */
    public final Class mo33a() {
        return ParcelFileDescriptor.class;
    }

    /* renamed from: a */
    protected final /* synthetic */ Object mo2586a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }
}
