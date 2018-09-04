package com.google.android.libraries.smartburst.filterfw.imageutils;

import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import java.util.Arrays;

/* compiled from: PG */
public class MipMapUtils {
    public static void generateMipMaps(FrameImage2D frameImage2D) {
        frameImage2D.lockTextureSource().generateMipmaps();
        frameImage2D.unlock();
    }

    public static FrameImage2D makeMipMappedFrame(FrameImage2D frameImage2D, int[] iArr) {
        int[] iArr2 = new int[]{powOf2(iArr[0]), powOf2(iArr[1])};
        if (frameImage2D == null) {
            return Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18), iArr2).asFrameImage2D();
        }
        if (Arrays.equals(iArr, frameImage2D.getDimensions())) {
            return frameImage2D;
        }
        frameImage2D.resize(iArr2);
        return frameImage2D;
    }

    private static int powOf2(int i) {
        int i2 = i - 1;
        i2 |= i2 >> 1;
        i2 |= i2 >> 2;
        i2 |= i2 >> 4;
        i2 |= i2 >> 8;
        return (i2 | (i2 >> 16)) + 1;
    }
}
