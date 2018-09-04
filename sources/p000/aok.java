package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: aok */
public final class aok implements aoo {
    /* renamed from: a */
    private final CompressFormat f10116a;
    /* renamed from: b */
    private final int f10117b;

    public aok() {
        this(CompressFormat.JPEG);
    }

    private aok(CompressFormat compressFormat) {
        this.f10116a = compressFormat;
        this.f10117b = 100;
    }

    /* renamed from: a */
    public final agn mo315a(agn agn, adp adp) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) agn.mo55b()).compress(this.f10116a, this.f10117b, byteArrayOutputStream);
        agn.mo58e();
        return new ano(byteArrayOutputStream.toByteArray());
    }
}
