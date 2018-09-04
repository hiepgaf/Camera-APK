package com.google.android.libraries.smartburst.filterfw.filterpacks.numeric;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class NormFilter extends Filter {
    public static final String TAG = "NormFilter";
    public static boolean mLogVerbose = Log.isLoggable(TAG, 2);

    public NormFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        FrameType single = FrameType.single(Float.TYPE);
        return new Signature().addInputPort("x", 2, single).addInputPort("y", 2, single).addOutputPort("norm", 2, single).disallowOtherPorts();
    }

    protected final void onProcess() {
        float hypot = (float) Math.hypot((double) ((Float) getConnectedInputPort("x").pullFrame().asFrameValue().getValue()).floatValue(), (double) ((Float) getConnectedInputPort("y").pullFrame().asFrameValue().getValue()).floatValue());
        if (mLogVerbose) {
            StringBuilder stringBuilder = new StringBuilder(22);
            stringBuilder.append("Norm = ");
            stringBuilder.append(hypot);
            Log.v(TAG, stringBuilder.toString());
        }
        OutputPort connectedOutputPort = getConnectedOutputPort("norm");
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(Float.valueOf(hypot));
        connectedOutputPort.pushFrame(asFrameValue);
    }
}
