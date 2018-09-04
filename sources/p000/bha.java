package p000;

import android.view.Surface;
import java.util.List;

/* compiled from: PG */
/* renamed from: bha */
final class bha implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ List f1140a;
    /* renamed from: b */
    private final /* synthetic */ kpw f1141b;
    /* renamed from: c */
    private final /* synthetic */ bhj f1142c;
    /* renamed from: d */
    private final /* synthetic */ iwn f1143d;
    /* renamed from: e */
    private final /* synthetic */ bhs f1144e;
    /* renamed from: f */
    private final /* synthetic */ iwn f1145f;
    /* renamed from: g */
    private final /* synthetic */ bgx f1146g;

    bha(bgx bgx, List list, kpw kpw, bhj bhj, iwn iwn, bhs bhs, iwn iwn2) {
        this.f1146g = bgx;
        this.f1140a = list;
        this.f1141b = kpw;
        this.f1142c = bhj;
        this.f1143d = iwn;
        this.f1144e = bhs;
        this.f1145f = iwn2;
    }

    public final void run() {
        for (Surface isValid : this.f1140a) {
            if (!isValid.isValid()) {
                bli.m866b(bgx.f10835a, "Surface is not valid anymore, skipped");
                this.f1141b.mo3557a(aua.m695b());
                return;
            }
        }
        try {
            this.f1142c.m7382a(fiv.REPEATING, this.f1143d, this.f1146g.f10836b, this.f1144e);
            this.f1142c.m7382a(fiv.NON_REPEATING, this.f1145f, this.f1146g.f10836b, this.f1144e);
        } catch (Throwable e) {
            this.f1141b.m17780a(e);
        }
    }
}
