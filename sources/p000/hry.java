package p000;

import com.google.android.apps.camera.metadata.refocus.GDepthUtil;

/* compiled from: PG */
/* renamed from: hry */
public final class hry {
    /* renamed from: a */
    public String f6532a;
    /* renamed from: b */
    public byte[] f6533b;

    /* renamed from: a */
    public static hry m3321a(wd wdVar) {
        if (wdVar == null) {
            return null;
        }
        hry.m3322a();
        if (!wdVar.mo2525b("http://ns.google.com/photos/1.0/image/", GDepthUtil.MIME) || !wdVar.mo2525b("http://ns.google.com/photos/1.0/image/", "Data")) {
            return null;
        }
        hry hry = new hry();
        try {
            hry.f6532a = wdVar.mo2534j("http://ns.google.com/photos/1.0/image/", GDepthUtil.MIME);
            if (!GDepthUtil.MIME_PNG.equals(hry.f6532a) && !GDepthUtil.MIME_JPEG.equals(hry.f6532a)) {
                return null;
            }
            hry.f6533b = wdVar.mo2529e("http://ns.google.com/photos/1.0/image/", "Data");
            return hry;
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
            return null;
        }
    }

    /* renamed from: a */
    public static void m3322a() {
        try {
            we.f9447a.m6124a("http://ns.google.com/photos/1.0/image/", "GImage");
        } catch (Throwable e) {
            kqg.f8420a.mo2210b(e);
        }
    }
}
