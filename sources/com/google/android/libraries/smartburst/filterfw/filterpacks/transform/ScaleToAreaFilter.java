package com.google.android.libraries.smartburst.filterfw.filterpacks.transform;

import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class ScaleToAreaFilter extends ResizeFilter {
    public int mHeightMultiple = 4;
    public int mTargetArea = 76800;
    public int mWidthMultiple = 4;

    public ScaleToAreaFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private float calcVideoScale(int i, int i2) {
        return (float) Math.sqrt((double) (((float) this.mTargetArea) / ((float) (i * i2))));
    }

    protected int getOutputHeight(int i, int i2) {
        int round = Math.round(((float) i2) * calcVideoScale(i, i2));
        int i3 = this.mHeightMultiple;
        return round + ((i3 - (round % i3)) % i3);
    }

    protected int getOutputWidth(int i, int i2) {
        int round = Math.round(((float) i) * calcVideoScale(i, i2));
        int i3 = this.mWidthMultiple;
        return round + ((i3 - (round % i3)) % i3);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("targetArea", 1, FrameType.single(Integer.TYPE)).addInputPort("widthMultiple", 1, FrameType.single(Integer.TYPE)).addInputPort("heightMultiple", 1, FrameType.single(Integer.TYPE)).addInputPort("useMipmaps", 1, FrameType.single(Boolean.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("targetArea")) {
            inputPort.bindToFieldNamed("mTargetArea");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("useMipmaps")) {
            inputPort.bindToFieldNamed("mUseMipmaps");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("widthMultiple")) {
            inputPort.bindToFieldNamed("mWidthMultiple");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("heightMultiple")) {
            inputPort.bindToFieldNamed("mHeightMultiple");
            inputPort.setAutoPullEnabled(true);
        }
    }
}
