package com.google.android.libraries.smartburst.filterfw.filterpacks.numeric;

import android.os.SystemClock;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public final class WaveSource extends Filter {
    public static final int WAVESOURCE_CONST = 0;
    public static final int WAVESOURCE_COS = 2;
    public static final int WAVESOURCE_SAWTOOTH = 3;
    public static final int WAVESOURCE_SIN = 1;
    public float mAmplitude = 1.0f;
    public int mMode = 1;
    public float mSpeed = 0.01f;
    public float mXOffset = 0.0f;
    public float mYOffset = 0.0f;

    public WaveSource(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public final Signature getSignature() {
        return new Signature().addInputPort("speed", 1, FrameType.single(Float.TYPE)).addInputPort("amplitude", 1, FrameType.single(Float.TYPE)).addInputPort("xOffset", 1, FrameType.single(Float.TYPE)).addInputPort("yOffset", 1, FrameType.single(Float.TYPE)).addInputPort("mode", 1, FrameType.single(Integer.TYPE)).addOutputPort("value", 2, FrameType.single()).disallowOtherPorts();
    }

    public final void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("speed")) {
            inputPort.bindToFieldNamed("mSpeed");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("amplitude")) {
            inputPort.bindToFieldNamed("mAmplitude");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("xOffset")) {
            inputPort.bindToFieldNamed("mXOffset");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("yOffset")) {
            inputPort.bindToFieldNamed("mYOffset");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("mode")) {
            inputPort.bindToFieldNamed("mMode");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected final synchronized void onProcess() {
        float f;
        OutputPort connectedOutputPort = getConnectedOutputPort("value");
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        switch (this.mMode) {
            case 0:
                f = this.mYOffset;
                break;
            case 1:
                f = (((float) Math.sin((double) (this.mXOffset + (((float) elapsedRealtime) * this.mSpeed)))) * this.mAmplitude) + this.mYOffset;
                break;
            case 2:
                f = (((float) Math.cos((double) (this.mXOffset + (((float) elapsedRealtime) * this.mSpeed)))) * this.mAmplitude) + this.mYOffset;
                break;
            case 3:
                f = (((this.mXOffset + (((float) elapsedRealtime) * this.mSpeed)) % 1.0f) * this.mAmplitude) + this.mYOffset;
                break;
            default:
                f = this.mYOffset;
                break;
        }
        asFrameValue.setValue(Float.valueOf(f));
        connectedOutputPort.pushFrame(asFrameValue);
    }
}
