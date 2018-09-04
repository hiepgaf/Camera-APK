package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.view.Surface;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: iwn */
public final class iwn {
    /* renamed from: a */
    private final Builder f7520a;

    public iwn(Builder builder) {
        this.f7520a = builder;
    }

    /* renamed from: a */
    public final void m4293a(Surface surface) {
        this.f7520a.addTarget(surface);
    }

    /* renamed from: a */
    public final iwo m4291a() {
        return new itq(this.f7520a.build());
    }

    /* renamed from: a */
    public final void m4292a(Key key, Object obj) {
        Object str;
        Builder builder = this.f7520a;
        String valueOf = String.valueOf(key.getName());
        String str2 = "Value cannot be null for key ";
        if (valueOf.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(valueOf);
        }
        builder.set(key, jri.m13139a(obj, str));
    }

    /* renamed from: a */
    public final void m4294a(Object obj) {
        this.f7520a.setTag(obj);
    }
}
