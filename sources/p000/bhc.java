package p000;

import android.view.Surface;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: bhc */
public final class bhc implements iqo {
    /* renamed from: a */
    public final bhj f10854a;
    /* renamed from: b */
    public final bhs f10855b;
    /* renamed from: c */
    public final Surface f10856c;
    /* renamed from: d */
    public final bic f10857d;
    /* renamed from: e */
    public final Object f10858e = new Object();
    /* renamed from: f */
    public boolean f10859f = false;
    /* renamed from: g */
    private final Surface f10860g;
    /* renamed from: h */
    private final bhe f10861h;

    public bhc(bhj bhj, bhs bhs, Surface surface, Surface surface2, bhe bhe, bic bic) {
        this.f10854a = bhj;
        this.f10855b = bhs;
        this.f10860g = surface;
        this.f10856c = surface2;
        this.f10861h = bhe;
        this.f10857d = bic;
    }

    public final void close() {
        synchronized (this.f10858e) {
            this.f10859f = true;
        }
    }

    /* renamed from: a */
    public final aub m7372a(asw asw) {
        aub a;
        synchronized (this.f10858e) {
            if (this.f10859f) {
                throw new IllegalStateException();
            }
            asw asw2 = asw;
            a = this.f10861h.mo440a(this.f10854a, this.f10855b, true, asw2, Arrays.asList(new Surface[]{this.f10860g, this.f10856c}), new bhd(this));
        }
        return a;
    }
}
