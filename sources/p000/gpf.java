package p000;

import android.content.res.Resources;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gpf */
public final class gpf extends imt {
    /* renamed from: a */
    private final kcx f23273a;

    public gpf(Resources resources, ilp ilp) {
        super(ilp);
        this.f23273a = kee.m13439a(gpe.SHUTTER, resources.getString(R.string.preference_volume_key_shutter), gpe.ZOOM, resources.getString(R.string.preference_volume_key_zoom), gpe.NOOP, resources.getString(R.string.preference_volume_key_do_nothing));
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3369b(Object obj) {
        gpe gpe = (gpe) this.f23273a.mo2130a().get((String) obj);
        if (gpe != null) {
            return gpe;
        }
        return gpe.SHUTTER;
    }

    /* renamed from: c */
    protected final /* synthetic */ Object mo3370c(Object obj) {
        return (String) jqk.m13102c((String) this.f23273a.get((gpe) obj));
    }
}
