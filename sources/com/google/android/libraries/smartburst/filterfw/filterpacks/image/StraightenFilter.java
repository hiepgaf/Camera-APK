package com.google.android.libraries.smartburst.filterfw.filterpacks.image;

import android.graphics.PointF;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Filter;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.InputPort;
import com.google.android.libraries.smartburst.filterfw.MffContext;
import com.google.android.libraries.smartburst.filterfw.OutputPort;
import com.google.android.libraries.smartburst.filterfw.Signature;

/* compiled from: PG */
public class StraightenFilter extends Filter {
    public static final float DEGREE_TO_RADIAN = 0.017453292f;
    public float mAngle = 0.0f;
    public int mHeight = 0;
    public float mMaxAngle = 45.0f;
    public ImageShader mShader;
    public int mWidth = 0;

    public StraightenFilter(MffContext mffContext, String str) {
        super(mffContext, str);
    }

    public Signature getSignature() {
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2);
        return new Signature().addInputPort("image", 2, image2D).addInputPort("angle", 1, FrameType.single(Float.TYPE)).addInputPort("maxAngle", 1, FrameType.single(Float.TYPE)).addOutputPort("image", 2, FrameType.image2D(FrameType.ELEMENT_RGBA8888, 16)).disallowOtherPorts();
    }

    public void onInputPortOpen(InputPort inputPort) {
        if (inputPort.getName().equals("angle")) {
            inputPort.bindToFieldNamed("mAngle");
            inputPort.setAutoPullEnabled(true);
        } else if (inputPort.getName().equals("maxAngle")) {
            inputPort.bindToFieldNamed("mMaxAngle");
            inputPort.setAutoPullEnabled(true);
        }
    }

    protected void onPrepare() {
        Log.i("StraightenFilter", "onPrepare BEGIN");
        this.mShader = ImageShader.createIdentity();
        Log.i("StraightenFilter", "onPrepare END");
    }

    protected synchronized void onProcess() {
        Log.i("StraightenFilter", "onProcess BEGIN");
        OutputPort connectedOutputPort = getConnectedOutputPort("image");
        FrameImage2D asFrameImage2D = getConnectedInputPort("image").pullFrame().asFrameImage2D();
        Frame asFrameImage2D2 = connectedOutputPort.fetchAvailableFrame(asFrameImage2D.getDimensions()).asFrameImage2D();
        if (!(asFrameImage2D.getWidth() == this.mWidth && asFrameImage2D.getHeight() == this.mHeight)) {
            this.mWidth = asFrameImage2D.getWidth();
            this.mHeight = asFrameImage2D.getHeight();
        }
        updateParameters();
        Log.i("StraightenFilter", "onProcess SHADER");
        this.mShader.process(asFrameImage2D, asFrameImage2D2);
        connectedOutputPort.pushFrame(asFrameImage2D2);
        Log.i("StraightenFilter", "onProcess END");
    }

    private void updateParameters() {
        float f = 90.0f;
        float cos = (float) Math.cos((double) (this.mAngle * 0.017453292f));
        float sin = (float) Math.sin((double) (this.mAngle * 0.017453292f));
        float f2 = this.mMaxAngle;
        if (f2 <= 0.0f) {
            throw new RuntimeException("Max angle is out of range (0-180).");
        }
        if (f2 <= 90.0f) {
            f = f2;
        }
        this.mMaxAngle = f;
        f = -cos;
        float f3 = (float) this.mWidth;
        float f4 = (float) this.mHeight;
        float f5 = -sin;
        PointF pointF = new PointF((f * f3) + (sin * f4), (f3 * f5) - (f4 * cos));
        f4 = (float) this.mWidth;
        float f6 = (float) this.mHeight;
        PointF pointF2 = new PointF((cos * f4) + (sin * f6), (f4 * sin) - (f6 * cos));
        f6 = (float) this.mWidth;
        float f7 = (float) this.mHeight;
        PointF pointF3 = new PointF((f * f6) - (sin * f7), (f5 * f6) + (cos * f7));
        f5 = (float) this.mWidth;
        f6 = (float) this.mHeight;
        PointF pointF4 = new PointF((cos * f5) - (sin * f6), (cos * f6) + (sin * f5));
        cos = Math.min(((float) this.mWidth) / Math.max(Math.abs(pointF.x), Math.abs(pointF2.x)), ((float) this.mHeight) / Math.max(Math.abs(pointF.y), Math.abs(pointF2.y))) * 0.5f;
        pointF.set(((pointF.x * cos) / ((float) this.mWidth)) + 0.5f, ((pointF.y * cos) / ((float) this.mHeight)) + 0.5f);
        pointF2.set(((pointF2.x * cos) / ((float) this.mWidth)) + 0.5f, ((pointF2.y * cos) / ((float) this.mHeight)) + 0.5f);
        pointF3.set(((pointF3.x * cos) / ((float) this.mWidth)) + 0.5f, ((pointF3.y * cos) / ((float) this.mHeight)) + 0.5f);
        pointF4.set(((pointF4.x * cos) / ((float) this.mWidth)) + 0.5f, ((cos * pointF4.y) / ((float) this.mHeight)) + 0.5f);
        this.mShader.setSourceCoords(new float[]{pointF.x, pointF.y, pointF2.x, pointF2.y, pointF3.x, pointF3.y, pointF4.x, pointF4.y});
    }
}
