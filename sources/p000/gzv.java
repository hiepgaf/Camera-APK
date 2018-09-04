package p000;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* renamed from: gzv */
final class gzv implements kaw {
    /* renamed from: a */
    private final /* synthetic */ boolean f17583a;
    /* renamed from: b */
    private final /* synthetic */ kbg f17584b;
    /* renamed from: c */
    private final /* synthetic */ Context f17585c;

    gzv(boolean z, kbg kbg, Context context) {
        this.f17583a = z;
        this.f17584b = kbg;
        this.f17585c = context;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo370a(Object obj) {
        obj = (List) obj;
        jri.m13152b(obj);
        if (this.f17583a) {
            return Boolean.valueOf(false);
        }
        boolean z = (this.f17584b.mo2084b() && !((Boolean) obj.get(0)).booleanValue()) ? true : (hak.m2982a(this.f17585c) && !((Boolean) obj.get(1)).booleanValue()) ? true : ((Boolean) obj.get(3)).booleanValue() ? !((Boolean) obj.get(2)).booleanValue() : false;
        return Boolean.valueOf(z);
    }
}
