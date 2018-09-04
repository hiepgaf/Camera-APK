package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: akm */
public final class akm implements akb {
    /* renamed from: a */
    private final Resources f9857a;

    public akm(Resources resources) {
        this.f9857a = resources;
    }

    /* renamed from: a */
    public final ajz mo91a(akh akh) {
        return new akl(this.f9857a, akh.m324a(Uri.class, AssetFileDescriptor.class));
    }
}
