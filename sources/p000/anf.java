package p000;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.io.IOException;

/* compiled from: PG */
/* renamed from: anf */
public final class anf implements adq {
    /* renamed from: a */
    public static final adm f10085a = adm.m170a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new ang());
    /* renamed from: b */
    private static final adm f10086b = adm.m170a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new anh());
    /* renamed from: c */
    private static final anj f10087c = new anj();
    /* renamed from: d */
    private final ank f10088d;
    /* renamed from: e */
    private final agw f10089e;

    public anf(agw agw, ank ank) {
        this(agw, ank, (byte) 0);
    }

    private anf(agw agw, ank ank, byte b) {
        this.f10089e = agw;
        this.f10088d = ank;
    }

    /* renamed from: a */
    public final agn mo101a(Object obj, int i, int i2, adp adp) {
        long longValue = ((Long) adp.m6303a(f10085a)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer valueOf;
            amf amf;
            Integer num = (Integer) adp.m6303a(f10086b);
            if (num == null) {
                valueOf = Integer.valueOf(2);
            } else {
                valueOf = num;
            }
            amf amf2 = (amf) adp.m6303a(amf.f527f);
            if (amf2 == null) {
                amf = amf.f526e;
            } else {
                amf = amf2;
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                this.f10088d.mo313a(mediaMetadataRetriever, obj);
                int intValue = valueOf.intValue();
                Bitmap a = i != kvl.UNSET_ENUM_VALUE ? i2 != kvl.UNSET_ENUM_VALUE ? amf != amf.f525d ? anf.m6833a(mediaMetadataRetriever, longValue, intValue, i, i2, amf) : null : null : null;
                if (a == null) {
                    a = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
                }
                mediaMetadataRetriever.release();
                return alv.m6617a(a, this.f10089e);
            } catch (Throwable e) {
                throw new IOException(e);
            } catch (Throwable th) {
                mediaMetadataRetriever.release();
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(83);
            stringBuilder.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
            stringBuilder.append(longValue);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    @TargetApi(27)
    /* renamed from: a */
    private static Bitmap m6833a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, amf amf) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (!(parseInt3 == 90 || parseInt3 == MediaDecoder.ROTATE_90_LEFT)) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            float a = amf.mo112a(parseInt2, parseInt, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt2) * a), Math.round(((float) parseInt) * a));
        } catch (Throwable th) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", th);
            }
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo102a(Object obj, adp adp) {
        return true;
    }
}
