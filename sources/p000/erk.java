package p000;

import android.media.MediaMetadataRetriever;

/* compiled from: PG */
/* renamed from: erk */
public final class erk {
    /* renamed from: a */
    private static final String f4130a = bli.m862a("VidRotDataLoader");

    /* renamed from: a */
    public static boolean m2031a(erj erj, String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(24);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
            String extractMetadata4 = mediaMetadataRetriever.extractMetadata(25);
            if (extractMetadata2 == null || extractMetadata3 == null || extractMetadata == null || extractMetadata4 == null) {
                extractMetadata = f4130a;
                extractMetadata2 = "Metadata does not exist for the video at ";
                extractMetadata4 = String.valueOf(str);
                if (extractMetadata4.length() == 0) {
                    extractMetadata4 = new String(extractMetadata2);
                } else {
                    extractMetadata4 = extractMetadata2.concat(extractMetadata4);
                }
                bli.m873e(extractMetadata, extractMetadata4);
                return false;
            }
            erj.f4116b = extractMetadata;
            erj.f4117c = Integer.parseInt(extractMetadata2);
            erj.f4118d = Integer.parseInt(extractMetadata3);
            erj.f4119e = (int) Double.parseDouble(extractMetadata4);
            return true;
        } catch (Throwable e) {
            bli.m867b(f4130a, "VideoRotationMetadataLoader.loadRotationMetadata() failed!", e);
        }
    }
}
