package com.google.android.libraries.smartburst.filterfw.filterpacks.colorspace;

import com.google.android.libraries.smartburst.filterfw.ColorSpace;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class RgbToYcbcrFilter extends Filter {
    public RgbToYcbcrFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D.getDimensions();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(dimensions).asFrameImage2D();
        ColorSpace.convertRgba8888ToYcbcra8888(asFrameImage2D.lockBytes(1), asFrameImage2D2.lockBytes(1), dimensions[0], dimensions[1]);
        asFrameImage2D.unlock();
        asFrameImage2D2.unlock();
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }
}
