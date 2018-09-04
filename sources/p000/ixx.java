package p000;

import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ixx */
public enum ixx {
    DNG("image/x-adobe-dng", ".dng"),
    GIF("image/gif", ".gif"),
    JPEG(GDepthUtil.MIME_JPEG, ".jpg"),
    PHOTOSPHERE("application/vnd.google.panorama360+jpg", ".jpg"),
    MPEG4("video/mp4", ".mp4"),
    THREE_GPP("video/3gpp", ".3gp"),
    WEBM("video/webm", ".webm");
    
    /* renamed from: h */
    public static final Set f7540h = null;
    /* renamed from: l */
    private static final Map f7542l = null;
    /* renamed from: m */
    private static final Set f7543m = null;
    /* renamed from: i */
    public final String f7545i;
    /* renamed from: j */
    public final String f7546j;

    static {
        khb khb = new khb();
        ixx[] values = ixx.values();
        int length = values.length;
        int i;
        while (i < length) {
            Object obj = values[i];
            khb.mo2137a(obj.f7545i, obj);
            i++;
        }
        f7542l = khb.mo2135a();
        f7540h = keu.m13475a(DNG, GIF, JPEG, PHOTOSPHERE);
        f7543m = keu.m13473a(MPEG4, THREE_GPP);
    }

    private ixx(String str) {
        this.f7545i = "";
        this.f7546j = "";
    }

    private ixx(String str, String str2) {
        this.f7545i = str;
        this.f7546j = str2;
    }

    /* renamed from: a */
    public final boolean m4333a() {
        return f7543m.contains(this);
    }

    /* renamed from: a */
    public static ixx m4332a(String str) {
        if (f7542l.containsKey(str)) {
            return (ixx) f7542l.get(str);
        }
        return f7541k;
    }
}
