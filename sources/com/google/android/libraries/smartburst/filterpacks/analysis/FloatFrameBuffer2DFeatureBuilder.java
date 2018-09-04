package com.google.android.libraries.smartburst.filterpacks.analysis;

import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;

/* compiled from: PG */
public class FloatFrameBuffer2DFeatureBuilder extends FloatFrameBuffer1DFeatureBuilder {
    public FloatFrameBuffer2DFeatureBuilder(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    protected FrameType getInputType() {
        return FrameType.buffer2D(200);
    }
}
