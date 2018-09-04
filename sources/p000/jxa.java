package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jxa */
public class jxa {
    /* renamed from: a */
    public static final jxi f8044a = new jxj("TIMESTAMPNS");
    /* renamed from: b */
    public static final jxi f8045b = new jxl("METADATAIMAGESIZE");
    /* renamed from: c */
    public static final jxi f8046c = new jxe("FACES");
    /* renamed from: d */
    public static final jxi f8047d = new jxf("FACESHARPNESSLIST");
    /* renamed from: e */
    public static final jxi f8048e = new jxg("FACEAVERAGESHARPNESS");
    /* renamed from: f */
    public static final jxi f8049f = new jxg("FACEAVERAGELEFTEYEOPEN");
    /* renamed from: g */
    public static final jxi f8050g = new jxg("FACEMINIMUMMAXIMUMEYEOPEN");
    /* renamed from: h */
    public static final jxi f8051h = new jxg("FACEMINIMUMLEFTEYEOPEN");
    /* renamed from: i */
    public static final jxi f8052i = new jxg("FACEMAXIMUMLEFTEYEOPEN");
    /* renamed from: j */
    public static final jxi f8053j = new jxg("FACEAVERAGERIGHTEYEOPEN");
    /* renamed from: k */
    public static final jxi f8054k = new jxg("FACEMINIMUMRIGHTEYEOPEN");
    /* renamed from: l */
    public static final jxi f8055l = new jxg("FACEMAXIMUMRIGHTEYEOPEN");
    /* renamed from: m */
    public static final jxi f8056m = new jxg("FACEAVERAGESMILING");
    /* renamed from: n */
    public static final jxi f8057n = new jxg("FACEMINIMUMSMILING");
    /* renamed from: o */
    public static final jxi f8058o = new jxg("FACEMAXIMUMSMILING");
    /* renamed from: p */
    public static final jxi f8059p = new jxk("FACEBOUNDINGBOX");
    /* renamed from: q */
    public static final jxi f8060q = new jxg("INTEGRALMOTIONSALIENCY");
    /* renamed from: r */
    public static final jxi f8061r = new jxg("LOWPASSMOTIONSALIENCY");
    /* renamed from: s */
    public static final jxi f8062s = new jxc("HIGHMOTION");
    /* renamed from: t */
    public static final jxi f8063t = new jxg("PERCEPTUALSHARPNESS");
    /* renamed from: u */
    public static final jxi f8064u = new jxg("MAXGRIDSHARPNESS");
    /* renamed from: v */
    public static final jxi f8065v = new jxd("FACEIMAGES");
    /* renamed from: x */
    private static final kbn f8066x = jqk.m13091a(new jxb());
    /* renamed from: w */
    public final HashMap f8067w = khb.m4899d();

    static {
        jxh jxh = new jxh("STABILIZATIONTRANSFORM");
    }

    /* renamed from: a */
    public static jxi m4664a(String str) {
        return (jxi) ((Map) f8066x.mo605b()).get(str);
    }

    /* renamed from: a */
    public final Object m4665a(jxi jxi) {
        Object obj = this.f8067w.get(jxi);
        if (obj != null) {
            return obj;
        }
        String valueOf = String.valueOf(jxi);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("Metadata does not contain any value for key '");
        stringBuilder.append(valueOf);
        stringBuilder.append("'.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public final boolean m4668b(jxi jxi) {
        return this.f8067w.containsKey(jxi);
    }

    /* renamed from: a */
    public final void m4667a(jxa jxa) {
        for (Entry entry : jxa.f8067w.entrySet()) {
            jxi jxi = (jxi) entry.getKey();
            if (m4668b(jxi)) {
                String valueOf = String.valueOf(jxi);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                stringBuilder.append("Merge conflict for key '");
                stringBuilder.append(valueOf);
                stringBuilder.append("'.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            m4666a(jxi, entry.getValue());
        }
    }

    /* renamed from: a */
    public final jxa m4666a(jxi jxi, Object obj) {
        this.f8067w.put(jxi, obj);
        return this;
    }
}
