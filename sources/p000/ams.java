package p000;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: ams */
public final class ams implements ImageHeaderParser {
    /* renamed from: a */
    public final int mo104a(InputStream inputStream, agu agu) {
        int attributeInt = new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    /* renamed from: a */
    public final ImageType mo105a(InputStream inputStream) {
        return ImageType.UNKNOWN;
    }

    /* renamed from: a */
    public final ImageType mo106a(ByteBuffer byteBuffer) {
        return ImageType.UNKNOWN;
    }
}
