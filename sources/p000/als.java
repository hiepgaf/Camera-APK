package p000;

import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: PG */
/* renamed from: als */
public final class als implements adr {
    /* renamed from: a */
    private final agw f19784a;
    /* renamed from: b */
    private final adr f19785b;

    public als(agw agw, adr adr) {
        this.f19784a = agw;
        this.f19785b = adr;
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo94a(Object obj, File file, adp adp) {
        return this.f19785b.mo94a(new alv(((BitmapDrawable) ((agn) obj).mo55b()).getBitmap(), this.f19784a), file, adp);
    }

    /* renamed from: a */
    public final adh mo2592a(adp adp) {
        return this.f19785b.mo2592a(adp);
    }
}
