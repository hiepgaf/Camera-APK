package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: cpz */
public final class cpz {
    static {
        bli.m862a("LocalDataUtil");
    }

    /* renamed from: a */
    public static Bitmap m1396a(InputStream inputStream, int i, int i2, int i3, int i4, int i5) {
        int i6;
        byte[] bArr = new byte[32768];
        int i7 = i5 % MediaDecoder.ROTATE_180;
        if (i7 != 0) {
            i6 = i;
        } else {
            i6 = i2;
        }
        if (i7 == 0) {
            i2 = i;
        }
        i7 = 1;
        int i8 = i6;
        int i9 = i2;
        while (true) {
            if (i8 <= i4 && i9 <= i3 && i8 <= 3379 && i9 <= 3379) {
                i8 *= i9;
                if (i8 <= 1600000) {
                    break;
                }
            }
            i7 += i7;
            i9 = i2 / i7;
            i8 = i6 / i7;
        }
        if (i4 > 3379 || i3 > 3379) {
            if (i8 < 400000 && i7 > 1) {
                i7 >>= 2;
            }
        }
        Options options = new Options();
        options.inSampleSize = i7;
        options.inTempStorage = bArr;
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
        if (decodeStream == null) {
            return null;
        }
        if (decodeStream.getWidth() > 3379 || decodeStream.getHeight() > 3379) {
            int max = Math.max(decodeStream.getWidth(), decodeStream.getHeight());
            decodeStream = Bitmap.createScaledBitmap(decodeStream, (decodeStream.getWidth() * 3379) / max, (decodeStream.getHeight() * 3379) / max, false);
        }
        if (i5 == 0 || decodeStream == null) {
            return decodeStream;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i5);
        return Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix, false);
    }
}
