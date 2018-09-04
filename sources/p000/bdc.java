package p000;

import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import java.io.OutputStream;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bdc */
public final class bdc implements jxo {
    /* renamed from: b */
    private static final String f10680b = bli.m862a("XmpAddRasterSink");
    /* renamed from: a */
    public final jxo f10681a;
    /* renamed from: c */
    private final UUID f10682c;

    public bdc(jxo jxo, UUID uuid) {
        this.f10681a = jxo;
        this.f10682c = uuid;
    }

    /* renamed from: a */
    public final /* synthetic */ OutputStream mo427a(jxn jxn) {
        jwx jwx = (jwx) jxn;
        if (jwx.f8070b.equals(GDepthUtil.MIME_JPEG) || jwx.f8070b.equals("image/gif")) {
            return new bdd(this, jwx);
        }
        return this.f10681a.mo427a(jwx);
    }

    /* renamed from: a */
    final wd m7274a(jwx jwx) {
        String str;
        String str2;
        wd a = ern.m2035a();
        try {
            we.f9447a.m6124a("http://ns.google.com/photos/1.0/creations/", "GCreations");
            a.mo2518a("http://ns.google.com/photos/1.0/creations/", "CameraBurstID", this.f10682c.toString());
            try {
                Object obj;
                str = "http://ns.google.com/photos/1.0/creations/";
                str2 = "Type";
                if (jwx.f8070b.equals("image/gif")) {
                    obj = "GCameraAnimation";
                } else if (jiu.m4512b(jwx.f19094a)) {
                    obj = "GCameraCollage";
                } else if (jwx.f19094a.equals("AllSmiles")) {
                    obj = "GCameraGroupSmiles";
                } else if (jwx.f19094a.equals("Collage_PhotoBooth")) {
                    obj = "GCameraCollage";
                } else {
                    throw new bde();
                }
                a.mo2518a(str, str2, obj);
            } catch (bde e) {
                str = f10680b;
                str2 = "Unknown artifact type ";
                String valueOf = String.valueOf(jwx.f19094a);
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m873e(str, valueOf);
            }
            return a;
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }
}
