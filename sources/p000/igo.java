package p000;

import com.google.android.gms.wearable.PutDataRequest;

/* renamed from: igo */
public final class igo {
    /* renamed from: a */
    public final PutDataRequest f7000a;
    /* renamed from: b */
    public final igj f7001b = new igj();

    private igo(PutDataRequest putDataRequest) {
        this.f7000a = putDataRequest;
    }

    /* renamed from: a */
    public static igo m3744a(String str) {
        return new igo(PutDataRequest.m15123a(str));
    }
}
