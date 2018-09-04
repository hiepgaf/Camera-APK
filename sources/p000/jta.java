package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.utils.Feature;
import java.util.List;

/* compiled from: PG */
/* renamed from: jta */
public final class jta extends izy {
    /* renamed from: a */
    private final /* synthetic */ jsw f21906a;

    public jta(jsw jsw) {
        this.f21906a = jsw;
    }

    public final /* synthetic */ void a_(Object obj) {
        for (jsx jsx : (List) obj) {
            long j = jsx.f7958a;
            for (Feature featureValue : jsx.f7960c) {
                this.f21906a.f7957g.setFeatureValue(j, featureValue);
            }
            this.f21906a.f7955e.m4672a(j).m4667a(this.f21906a.f7952b.mo2043a(j, (Bitmap) jsx.f7959b.mo3191e()));
            jsx.f7959b.close();
        }
    }
}
