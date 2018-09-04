package com.google.android.libraries.smartburst.filterfw.filterpacks.transform;

import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class ScaleFilter extends ResizeFilter {
    public float mScale = 1.0f;

    public ScaleFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    protected int getOutputHeight(int i, int i2) {
        return (int) (((float) i2) * this.mScale);
    }

    protected int getOutputWidth(int i, int i2) {
        return (int) (((float) i) * this.mScale);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("scale", 1, FrameType.single(Float.TYPE)).addInputPort("useMipmaps", 1, FrameType.single(Boolean.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("scale")) {
            inputPort.bindToFieldNamed("mScale");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("useMipmaps")) {
            inputPort.bindToFieldNamed("mUseMipmaps");
            inputPort.setAutoPullEnabled(true);
        }
    }
}
