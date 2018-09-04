package com.google.android.libraries.smartburst.filterfw.filterpacks.colorspace;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameBuffer2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterpacks.image.HSVHistogramAnalysisFilter;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionAnalysisFilter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: PG */
public final class ColorfulnessFilter extends Filter {
    public ColorfulnessFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES, 2, FrameType.buffer2D(200)).addOutputPort(MotionAnalysisFilter.SCORE, 2, FrameType.single(Float.TYPE)).disallowOtherPorts();
    }

    protected final void onProcess() {
        FrameBuffer2D asFrameBuffer2D = getConnectedInputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES).pullFrame().asFrameBuffer2D();
        ByteBuffer lockBytes = asFrameBuffer2D.lockBytes(1);
        lockBytes.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = lockBytes.asFloatBuffer();
        asFloatBuffer.rewind();
        int width = asFrameBuffer2D.getWidth();
        int height = asFrameBuffer2D.getHeight();
        float[] fArr = new float[width];
        float f = 0.0f;
        int i = 0;
        while (i < height) {
            float pow = (float) Math.pow(2.0d, (double) i);
            float f2 = f;
            for (int i2 = 0; i2 < width; i2++) {
                f = asFloatBuffer.get() * pow;
                fArr[i2] = fArr[i2] + f;
                f2 += f;
            }
            i++;
            f = f2;
        }
        float f3 = 0.0f;
        for (int i3 = 0; i3 < width; i3++) {
            float f4 = fArr[i3] / f;
            if (f4 > 0.0f) {
                f3 -= f4 * ((float) Math.log((double) f4));
            }
        }
        double log = Math.log(2.0d);
        asFrameBuffer2D.unlock();
        OutputPort connectedOutputPort = getConnectedOutputPort(MotionAnalysisFilter.SCORE);
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(Float.valueOf((float) (((double) f3) / log)));
        connectedOutputPort.pushFrame(asFrameValue);
    }
}
