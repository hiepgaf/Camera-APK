package p000;

import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* renamed from: akn */
public final class akn implements akb {
    /* renamed from: a */
    private final Resources f9858a;

    public akn(Resources resources) {
        this.f9858a = resources;
    }

    /* renamed from: a */
    public final ajz mo91a(akh akh) {
        return new akl(this.f9858a, akh.m324a(Uri.class, ParcelFileDescriptor.class));
    }
}
