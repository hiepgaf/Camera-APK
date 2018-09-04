package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;

/* compiled from: PG */
/* renamed from: cwe */
public final class cwe {
    /* renamed from: a */
    public static Bitmap m1548a(byte[] bArr, int i) {
        Options options = new Options();
        options.inSampleSize = 4;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (i == 0) {
            return decodeByteArray;
        }
        Matrix matrix = new Matrix();
        if (i != 0) {
            matrix.preRotate((float) i);
        }
        return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
    }
}
