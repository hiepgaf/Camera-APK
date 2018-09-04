package p000;

import android.annotation.TargetApi;

@TargetApi(8)
/* compiled from: PG */
/* renamed from: inn */
public final class inn {
    /* renamed from: a */
    public final inh f7168a;
    /* renamed from: b */
    public final int[] f7169b = new int[]{8000, 11025, 12000, 16000, 22050, 24000, 44100, 48000};

    public inn(inh inh) {
        this.f7168a = inh;
    }

    /* renamed from: a */
    public static inp m3883a(ioa ioa, ine ine, int i, inc inc) {
        return new inl(ind.m3878b(ioa), ine, i, inc, ioa.mo3133h(), ioa.mo3135j(), ioa.mo3134i());
    }

    /* renamed from: a */
    public static boolean m3885a(ioa ioa, inc inc, ine ine) {
        if (inn.m3884a(ioa, inc) && inn.m3886a(ioa, ine) && ind.m3877a(ioa)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3887b(ioa ioa, inc inc, ine ine) {
        if (inn.m3884a(ioa, inc) && inn.m3886a(ioa, ine) && ind.m3877a(ioa)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3884a(ioa ioa, inc inc) {
        return inc.f7142f <= ioa.mo3137l();
    }

    /* renamed from: a */
    private static boolean m3886a(ioa ioa, ine ine) {
        return new iqp(ioa.mo3138m(), ioa.mo3136k()).equals(ine.m3881c());
    }
}
