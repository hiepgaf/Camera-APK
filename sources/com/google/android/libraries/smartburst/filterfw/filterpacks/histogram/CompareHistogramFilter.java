package com.google.android.libraries.smartburst.filterfw.filterpacks.histogram;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class CompareHistogramFilter extends Filter {
    public static final int EMD = 0;
    public int[] mHistogram1 = null;
    public int[] mHistogram2 = null;
    public int mMetric = 0;

    public CompareHistogramFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("histogram1", 2, FrameType.array(Integer.TYPE)).addInputPort("histogram2", 2, FrameType.array(Integer.TYPE)).addInputPort("metric", 1, FrameType.single(Integer.TYPE)).addOutputPort("value", 2, FrameType.single(Float.TYPE)).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("histogram1")) {
            inputPort.bindToFieldNamed("mHistogram1");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("histogram2")) {
            inputPort.bindToFieldNamed("mHistogram2");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("metric")) {
            inputPort.bindToFieldNamed("mMetric");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onProcess() {
        int i = 0;
        switch (this.mMetric) {
            case 0:
                if (this.mHistogram1.length == this.mHistogram2.length) {
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int[] iArr = this.mHistogram1;
                        if (i2 < iArr.length) {
                            i4 += iArr[i2];
                            i3 += this.mHistogram2[i2];
                            i2++;
                        } else {
                            int i5 = 0;
                            float f = 0.0f;
                            i2 = 0;
                            while (true) {
                                int[] iArr2 = this.mHistogram1;
                                int length = iArr2.length;
                                if (i < length) {
                                    i5 += iArr2[i];
                                    i2 += this.mHistogram2[i];
                                    f += Math.abs((((float) i5) / ((float) i4)) - (((float) i2) / ((float) i3)));
                                    i++;
                                } else {
                                    float f2;
                                    if (length > 1) {
                                        f2 = (float) (length - 1);
                                    } else {
                                        f2 = 1.0f;
                                    }
                                    OutputPort connectedOutputPort = getConnectedOutputPort("value");
                                    Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
                                    asFrameValue.setValue(Float.valueOf(f / f2));
                                    connectedOutputPort.pushFrame(asFrameValue);
                                    return;
                                }
                            }
                        }
                    }
                }
                throw new RuntimeException("Can only compare histograms of same length!");
            default:
                throw new RuntimeException("Unknown metric to compare histograms!");
        }
    }
}
