package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.location.Location;
import android.util.Pair;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.InputStream;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jkm */
public final class jkm implements jau {
    /* renamed from: a */
    private final kpk f18885a;
    /* renamed from: b */
    private final gkr f18886b;

    public jkm(gkr gkr, kpk kpk) {
        this();
        jri.m13152b((Object) gkr);
        jri.m13152b((Object) kpk);
        this.f18886b = gkr;
        this.f18885a = kpk;
    }

    /* renamed from: a */
    public final /* synthetic */ jaq mo716a(Object obj, Executor executor) {
        obj = (Pair) obj;
        jri.m13152b(obj);
        Object obj2 = (jwx) obj.first;
        kbg kbg = (kbg) obj.second;
        jri.m13152b(obj2);
        InputStream inputStream = (InputStream) kow.m13625c(this.f18885a);
        if (kbg.mo2084b()) {
            this.f18886b.mo2865a((Location) kbg.mo2081a());
        }
        ixx a = ixx.m4332a(obj2.f8070b);
        glz glz = new glz(new iqp(obj2.f8073e, obj2.f8072d), a);
        if (a.m4333a()) {
            glz.f5408e = kbg.m4744b(Long.valueOf(obj2.f8074f));
        } else {
            glz.m2615a(Integer.valueOf(0));
            glz.m2614a(new ExifInterface());
        }
        return jli.m12940a(this.f18886b.mo1479a(inputStream, glz));
    }

    /* renamed from: a */
    public static izi m12895a(jqo jqo, Context context) {
        return new jkn(jqo, context);
    }

    /* renamed from: b */
    public static izi m12897b(jqo jqo, Context context) {
        return new jko(jqo, context);
    }

    /* renamed from: a */
    static izi m12896a(jxo jxo, jwx jwx) {
        return new jkp(jxo, jwx);
    }
}
