package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.imageutils.GridSharpness;
import com.google.android.libraries.smartburst.filterfw.imageutils.PerceptualSharpnessCalculator;

/* compiled from: PG */
public class PerceptualSharpnessFilter extends Filter {
    public final PerceptualSharpnessCalculator mCalculator = new PerceptualSharpnessCalculator();
    public int mNumBlocksX = 1;
    public int mNumBlocksY = 1;

    public PerceptualSharpnessFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("blurredX", 2, image2D).addInputPort("blurredY", 2, image2D).addInputPort("numBlocksX", 1, FrameType.single(Integer.TYPE)).addInputPort("numBlocksY", 1, FrameType.single(Integer.TYPE)).addOutputPort("sharpness", 2, FrameType.single(Float.TYPE)).addOutputPort("maxGridSharpness", 1, FrameType.single(Float.TYPE)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("numBlocksX")) {
            inputPort.bindToFieldNamed("mNumBlocksX");
            inputPort.setAutoPullEnabled(true);
        }
        if (inputPort.getName().equals("numBlocksY")) {
            inputPort.bindToFieldNamed("mNumBlocksY");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onProcess() {
        GridSharpness computeGridSharpnessGpu;
        InputPort connectedInputPort = getConnectedInputPort("image");
        InputPort connectedInputPort2 = getConnectedInputPort("blurredX");
        InputPort connectedInputPort3 = getConnectedInputPort("blurredY");
        OutputPort connectedOutputPort = getConnectedOutputPort("sharpness");
        OutputPort connectedOutputPort2 = getConnectedOutputPort("maxGridSharpness");
        FrameImage2D asFrameImage2D = connectedInputPort.pullFrame().asFrameImage2D();
        FrameImage2D asFrameImage2D2 = connectedInputPort2.pullFrame().asFrameImage2D();
        FrameImage2D asFrameImage2D3 = connectedInputPort3.pullFrame().asFrameImage2D();
        if (isOpenGLSupported()) {
            computeGridSharpnessGpu = this.mCalculator.computeGridSharpnessGpu(asFrameImage2D, asFrameImage2D2, asFrameImage2D3, this.mNumBlocksX, this.mNumBlocksY);
        } else {
            computeGridSharpnessGpu = PerceptualSharpnessCalculator.computeGridSharpness(asFrameImage2D, asFrameImage2D2, asFrameImage2D3, this.mNumBlocksX, this.mNumBlocksY);
        }
        float perceptualSharpness = computeGridSharpnessGpu.getPerceptualSharpness();
        Frame asFrameValue = connectedOutputPort.fetchAvailableFrame(null).asFrameValue();
        asFrameValue.setValue(Float.valueOf(perceptualSharpness));
        connectedOutputPort.pushFrame(asFrameValue);
        if ((this.mNumBlocksX > 1 || this.mNumBlocksY > 1) && connectedOutputPort2 != null) {
            float maxGridPerceptualSharpness = computeGridSharpnessGpu.getMaxGridPerceptualSharpness();
            Frame asFrameValue2 = connectedOutputPort2.fetchAvailableFrame(null).asFrameValue();
            asFrameValue2.setValue(Float.valueOf(maxGridPerceptualSharpness));
            connectedOutputPort2.pushFrame(asFrameValue2);
        }
    }
}
