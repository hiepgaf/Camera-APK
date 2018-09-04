package com.google.android.libraries.smartburst.filterfw.filterpacks.transform;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterfw.imageutils.ImageCropper;

/* compiled from: PG */
public class CropFilter extends Filter {
    public static final Quad IDENTITY_CROP_RECT = Quad.fromRect(0.0f, 0.0f, 1.0f, 1.0f);
    public Quad mCropRect = IDENTITY_CROP_RECT;
    public ImageCropper mImageCropper = null;
    public int mOutputHeight = 0;
    public int mOutputWidth = 0;
    public boolean mUseMipmaps = false;

    public CropFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    protected int getOutputHeight(int i, int i2) {
        int i3 = this.mOutputHeight;
        return i3 > 0 ? i3 : i2;
    }

    protected int getOutputWidth(int i, int i2) {
        int i3 = this.mOutputWidth;
        return i3 > 0 ? i3 : i;
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("cropRect", 2, FrameType.single(Quad.class)).addInputPort("outputWidth", 1, FrameType.single(Integer.TYPE)).addInputPort("outputHeight", 1, FrameType.single(Integer.TYPE)).addInputPort("useMipmaps", 1, FrameType.single(Boolean.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    protected void onClose() {
        ImageCropper imageCropper = this.mImageCropper;
        if (imageCropper != null) {
            imageCropper.release();
            this.mImageCropper = null;
        }
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("cropRect")) {
            inputPort.bindToFieldNamed("mCropRect");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("outputWidth")) {
            inputPort.bindToFieldNamed("mOutputWidth");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("outputHeight")) {
            inputPort.bindToFieldNamed("mOutputHeight");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("useMipmaps")) {
            inputPort.bindToFieldNamed("mUseMipmaps");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mImageCropper = new ImageCropper(isOpenGLSupported());
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        Frame asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Quad quad = this.mCropRect;
        if (quad == null) {
            quad = IDENTITY_CROP_RECT;
        }
        int[] dimensions = asFrameImage2D.getDimensions();
        int[] computeCropDimensions = ImageCropper.computeCropDimensions(dimensions, quad);
        int[] iArr = new int[]{getOutputWidth(computeCropDimensions[0], computeCropDimensions[1]), getOutputHeight(computeCropDimensions[0], computeCropDimensions[1])};
        int i = dimensions[0];
        if (i == computeCropDimensions[0]) {
            int i2 = dimensions[1];
            if (i2 == computeCropDimensions[1] && i == iArr[0] && i2 == iArr[1]) {
                connectedOutputPort.pushFrame(asFrameImage2D);
                return;
            }
        }
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(iArr).asFrameImage2D();
        this.mImageCropper.cropImage(asFrameImage2D, quad, asFrameImage2D2, this.mUseMipmaps);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }
}
