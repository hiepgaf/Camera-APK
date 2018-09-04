package p000;

import android.net.Uri;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* renamed from: blx */
public final class blx implements kwk {
    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static long m7532a(Uri uri) {
        return Long.parseLong(Uri.decode(uri.getLastPathSegment()));
    }

    /* renamed from: a */
    public static /* synthetic */ gfw m7533a(brj brj, gfw gfw) {
        try {
            ExifInterface exifInterface = gfw.f5155h;
            if (exifInterface != null) {
                String tagStringValue = exifInterface.getTagStringValue(ExifInterface.TAG_SOFTWARE);
                ExifInterface exifInterface2 = gfw.f5155h;
                int i = ExifInterface.TAG_SOFTWARE;
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(tagStringValue).length() + 1);
                stringBuilder.append(tagStringValue);
                stringBuilder.append('b');
                exifInterface2.m8480a(exifInterface2.m8479a(i, stringBuilder.toString()));
            }
            return (gfw) brj.m943a(gfw).get();
        } catch (InterruptedException e) {
            return gfw;
        } catch (ExecutionException e2) {
            return gfw;
        }
    }
}
