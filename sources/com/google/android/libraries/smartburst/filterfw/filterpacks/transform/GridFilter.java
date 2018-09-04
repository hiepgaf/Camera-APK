package com.google.android.libraries.smartburst.filterfw.filterpacks.transform;

import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;
import com.google.android.libraries.smartburst.filterfw.imageutils.MipMapUtils;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapAxes;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapModes;

/* compiled from: PG */
public class GridFilter extends Filter {
    public int mOutputHeight = 0;
    public int mOutputWidth = 0;
    public ImageShader mShader;
    public FrameImage2D mTileFrame = null;
    public boolean mUseMipmaps = true;
    public int mXCount = 1;
    public int mYCount = 1;

    public GridFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    private static void generateMipMaps(FrameImage2D frameImage2D) {
        frameImage2D.lockTextureSource().generateMipmaps();
        frameImage2D.unlock();
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("xCount", 1, FrameType.single(Integer.TYPE)).addInputPort("yCount", 1, FrameType.single(Integer.TYPE)).addInputPort("useMipmaps", 1, FrameType.single(Boolean.TYPE)).addInputPort("outputWidth", 1, FrameType.single(Integer.TYPE)).addInputPort("outputHeight", 1, FrameType.single(Integer.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    protected void onClose() {
        FrameImage2D frameImage2D = this.mTileFrame;
        if (frameImage2D != null) {
            frameImage2D.release();
            this.mTileFrame = null;
        }
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("xCount")) {
            inputPort.bindToFieldNamed("mXCount");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("yCount")) {
            inputPort.bindToFieldNamed("mYCount");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("useMipmaps")) {
            inputPort.bindToFieldNamed("mUseMipmaps");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("outputWidth")) {
            inputPort.bindToFieldNamed("mOutputWidth");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("outputHeight")) {
            inputPort.bindToFieldNamed("mOutputHeight");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        this.mShader = ImageShader.createIdentity();
    }

    protected void onProcess() {
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        int[] dimensions = asFrameImage2D.getDimensions();
        this.mTileFrame = MipMapUtils.makeMipMappedFrame(this.mTileFrame, dimensions);
        setTextureParameter(this.mTileFrame, WrapAxes.f2483S, WrapModes.REPEAT);
        setTextureParameter(this.mTileFrame, WrapAxes.f2484T, WrapModes.REPEAT);
        this.mShader.setSourceRect(0.0f, 0.0f, 1.0f, 1.0f);
        this.mShader.process(asFrameImage2D, this.mTileFrame);
        if (this.mUseMipmaps) {
            generateMipMaps(this.mTileFrame);
        }
        int[] iArr = new int[]{this.mOutputWidth, this.mOutputHeight};
        if (iArr[0] <= 0) {
            iArr[0] = dimensions[0] * this.mXCount;
        }
        if (iArr[1] <= 0) {
            iArr[1] = dimensions[1] * this.mYCount;
        }
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(iArr).asFrameImage2D();
        this.mShader.setSourceRect(0.0f, 0.0f, (float) this.mXCount, (float) this.mYCount);
        this.mShader.process(this.mTileFrame, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
    }

    private static void setTextureParameter(FrameImage2D frameImage2D, int i, int i2) {
        frameImage2D.lockTextureSource().setParameter(i, i2);
        frameImage2D.unlock();
    }
}
