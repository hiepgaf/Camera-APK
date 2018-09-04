package com.google.android.libraries.smartburst.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameBuffer2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: PG */
public class HSVHistogramAnalysisFilter extends Filter {
    public static final int HISTOGRAM_ARRAY_SIZE = 18;
    public static final int HSV_BIN_SIZE = 64;
    public static final String INPUT_PORT_HISTOGRAM_VALUES = "histogram";
    public static final int NUM_HUE_BINS = 6;
    public static final int NUM_SATURATION_BINS = 3;
    public static final String OUTPUT_PORT_ENTROPY = "entropy";
    public static final String OUTPUT_PORT_SATURATION = "saturation";
    public static final float SATURATION_HISTOGRAM_VALUE_EPSILON = 1.0E-6f;

    public HSVHistogramAnalysisFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private static float calculateEntropy(float[] fArr) {
        float f;
        float f2 = 0.0f;
        for (float f3 : fArr) {
            float f32;
            f2 += f32;
        }
        if (f2 > 0.0f) {
            f = 0.0f;
            for (float f322 : fArr) {
                f322 = f322 / f2;
                if (f322 > 0.0f) {
                    double d = (double) f322;
                    f = (float) ((d * Math.log(d)) + ((double) f));
                }
            }
        } else {
            f = 0.0f;
        }
        return -f;
    }

    private static float calculateEntropyFromHistogram(float[] fArr) {
        float[] fArr2 = new float[6];
        for (int i = 0; i < 18; i++) {
            int i2 = i % 6;
            fArr2[i2] = fArr2[i2] + (fArr[i] * ((float) getHSVSaturationBin(i)));
        }
        return calculateEntropy(fArr2);
    }

    private static float calculateSaturationFromHistogram(float[] fArr) {
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < 18; i++) {
            f2 += fArr[i] * ((float) getHSVSaturationBin(i));
            f += fArr[i];
        }
        if (f >= 1.0E-6f) {
            return f2 / (256.0f * f);
        }
        return 0.0f;
    }

    private static int getHSVSaturationBin(int i) {
        return (((i / 6) + 1) << 6) + 32;
    }

    public Signature getSignature() {
        return new Signature().addInputPort(INPUT_PORT_HISTOGRAM_VALUES, 2, FrameType.buffer2D(200)).addOutputPort(OUTPUT_PORT_SATURATION, 1, FrameType.single(Float.TYPE)).addOutputPort(OUTPUT_PORT_ENTROPY, 1, FrameType.single(Float.TYPE)).disallowOtherPorts();
    }

    protected void onProcess() {
        FrameBuffer2D asFrameBuffer2D = getConnectedInputPort(INPUT_PORT_HISTOGRAM_VALUES).pullFrame().asFrameBuffer2D();
        if (asFrameBuffer2D.getElementCount() != 18) {
            throw new RuntimeException("Invalid size of the new chroma histogram.");
        }
        OutputPort connectedOutputPort = getConnectedOutputPort(OUTPUT_PORT_SATURATION);
        OutputPort connectedOutputPort2 = getConnectedOutputPort(OUTPUT_PORT_ENTROPY);
        if (connectedOutputPort2 != null || connectedOutputPort != null) {
            float calculateSaturationFromHistogram;
            float[] fArr = new float[18];
            ByteBuffer lockBytes = asFrameBuffer2D.lockBytes(1);
            lockBytes.order(ByteOrder.nativeOrder());
            FloatBuffer asFloatBuffer = lockBytes.asFloatBuffer();
            asFloatBuffer.rewind();
            asFloatBuffer.get(fArr);
            asFrameBuffer2D.unlock();
            if (connectedOutputPort != null) {
                calculateSaturationFromHistogram = calculateSaturationFromHistogram(fArr);
                Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
                asFrameValue.setValue(Float.valueOf(calculateSaturationFromHistogram));
                connectedOutputPort.pushFrame(asFrameValue);
            }
            if (connectedOutputPort2 != null) {
                calculateSaturationFromHistogram = calculateEntropyFromHistogram(fArr);
                Frame asFrameValue2 = connectedOutputPort2.fetchAvailableFrame(null).asFrameValue();
                asFrameValue2.setValue(Float.valueOf(calculateSaturationFromHistogram));
                connectedOutputPort2.pushFrame(asFrameValue2);
            }
        }
    }
}
