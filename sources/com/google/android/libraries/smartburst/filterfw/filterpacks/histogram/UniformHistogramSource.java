package com.google.android.libraries.smartburst.filterfw.filterpacks.histogram;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterpacks.image.HSVHistogramAnalysisFilter;

/* compiled from: PG */
public final class UniformHistogramSource extends Filter {
    public int mNumBins = 50;

    public UniformHistogramSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("binsize", 1, FrameType.array(Integer.TYPE)).addOutputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES, 2, FrameType.array(Integer.TYPE)).disallowOtherPorts();
    }

    public final void onInputPortAttached(InputPort inputPort) {
        if (inputPort.getName().equals("binsize")) {
            inputPort.bindToFieldNamed("mNumBins");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final void onPrepare() {
    }

    protected final void onProcess() {
        Object obj = new int[this.mNumBins];
        for (int i = 0; i < this.mNumBins; i++) {
            obj[i] = 1;
        }
        OutputPort connectedOutputPort = getConnectedOutputPort(HSVHistogramAnalysisFilter.INPUT_PORT_HISTOGRAM_VALUES);
        Frame asFrameValues = connectedOutputPort.fetchAvailableFrame(null).asFrameValues();
        asFrameValues.setValues(obj);
        connectedOutputPort.pushFrame(asFrameValues);
    }
}
