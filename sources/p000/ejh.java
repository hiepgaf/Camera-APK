package p000;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: ejh */
public final class ejh {
    /* renamed from: a */
    private static final String f3669a = bli.m862a("CameraUtility");

    /* renamed from: a */
    public static void m1768a(aah aah, abw abw, Handler handler, aag aag) {
        aah.mo2564b(handler, null);
        int i = aah.mo2571i().f145k;
        int bitsPerPixel = ImageFormat.getBitsPerPixel(i);
        if (bitsPerPixel <= 0) {
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Unknown image format: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Point point = abw.f178a;
        bitsPerPixel = (int) Math.ceil((double) (((float) (point.y * point.x)) * (((float) bitsPerPixel) / 8.0f)));
        for (i = 0; i < 3; i++) {
            aah.mo2561a(new byte[bitsPerPixel]);
        }
        aah.mo2564b(handler, aag);
    }

    /* renamed from: a */
    public static float m1765a(aah aah) {
        if (aah == null) {
            return 0.0f;
        }
        ejg a = ejf.m1762a(aah.mo2567e());
        abo i = aah.mo2571i();
        Point point = a.f3668b.f178a;
        i.m67a(new abw(point.x, point.y));
        Point point2 = a.f3667a.f178a;
        i.m69b(new abw(point2.x, point2.y));
        aah.mo2562a(i);
        return ejv.m1811a(aah.mo2567e().f67u);
    }

    /* renamed from: a */
    public static abb m1766a(aaz aaz) {
        if (aaz.m33a(abb.OFF)) {
            return abb.OFF;
        }
        if (aaz.m33a(abb.AUTO)) {
            return abb.AUTO;
        }
        if (aaz.m33a(abb.NO_FLASH)) {
            return abb.NO_FLASH;
        }
        bli.m866b(f3669a, "no supported flash mode found, need OFF, AUTO or NO_FLASH!");
        throw new IllegalStateException("no supported flash mode found!");
    }

    /* renamed from: a */
    public static abc m1767a(Context context, aaz aaz) {
        boolean z = true;
        if (!(ije.m3779a(context.getContentResolver(), "camera:requires_focus_on_pitch_change", false) || ejv.f3698a.f3702b)) {
            z = false;
        }
        if (!z) {
            if (aaz.m34a(abc.INFINITY)) {
                bli.m869c(f3669a, "Using Focus mode infinity");
                return abc.INFINITY;
            } else if (aaz.m34a(abc.FIXED) && !ejv.f3698a.f3702b) {
                bli.m869c(f3669a, "Using Focus mode fixed");
                return abc.FIXED;
            }
        }
        bli.m869c(f3669a, "Using Focus mode auto");
        return abc.AUTO;
    }

    /* renamed from: b */
    public static abw m1770b(aaz aaz) {
        abw abw = new abw(0, 0);
        if (aaz == null) {
            return abw;
        }
        Point point = ejf.m1762a(aaz).f3667a.f178a;
        return new abw(point.x, point.y);
    }

    /* renamed from: c */
    public static abd m1771c(aaz aaz) {
        if (aaz.m35a(abd.AUTO)) {
            return abd.AUTO;
        }
        return abd.NO_SCENE_MODE;
    }

    /* renamed from: a */
    public static void m1769a(aaz aaz, abo abo) {
        int[] a = hjg.m3205a(aaz.m36b());
        if (a == null || a.length <= 0) {
            bli.m866b(f3669a, "No supported frame rates returned!");
        } else {
            abo.m66a(a[0], a[1]);
        }
    }
}
