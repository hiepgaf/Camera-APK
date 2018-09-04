package com.google.android.libraries.smartburst.filterfw.imageutils;

import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameBuffer2D;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
public class GrayValuesExtractor {
    public static final String mGrayPackFragment = "precision highp float;\nconst vec4 coeff_y = vec4(0.299, 0.587, 0.114, 0);\nuniform sampler2D tex_sampler_0;\nuniform float pix_stride;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 color;\n  for (int i = 0; i < 4; i++) {\n  vec4 p = texture2D(tex_sampler_0,\n                       v_texcoord + vec2(pix_stride * (float(i) - 1.5), 0.0));\n    color[i] = dot(p, coeff_y);\n  }\n  gl_FragColor = color;\n}\n";
    public final boolean mIsOpenGLSupported;
    public ImageShader mShader;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean toGrayValues(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    public GrayValuesExtractor(boolean z) {
        this.mIsOpenGLSupported = z;
        if (this.mIsOpenGLSupported) {
            this.mShader = new ImageShader(mGrayPackFragment);
        }
    }

    public int[] getOutputFrameDimensions(int[] iArr) {
        if (!this.mIsOpenGLSupported) {
            return iArr;
        }
        int i = iArr[0];
        return new int[]{i - (i % 4), iArr[1]};
    }

    public void toGrayValues(FrameImage2D frameImage2D, FrameBuffer2D frameBuffer2D) {
        int[] outputFrameDimensions = getOutputFrameDimensions(frameImage2D.getDimensions());
        if (!Arrays.equals(frameBuffer2D.getDimensions(), outputFrameDimensions)) {
            throw new IllegalArgumentException("Invalid dimensions of the output frame for gray values.");
        } else if (frameBuffer2D.getType().getElementId() != 100) {
            throw new IllegalArgumentException("Invalid type of output buffer.");
        } else {
            ByteBuffer lockBytes = frameBuffer2D.lockBytes(2);
            if (this.mIsOpenGLSupported) {
                int[] iArr = new int[]{outputFrameDimensions[0] / 4, outputFrameDimensions[1]};
                FrameImage2D asFrameImage2D = Frame.create(FrameType.image2D(FrameType.ELEMENT_RGBA8888, 2), iArr).asFrameImage2D();
                this.mShader.setSourceQuad(Quad.fromRect(0.0f, 0.0f, ((float) outputFrameDimensions[0]) / ((float) frameImage2D.getWidth()), 1.0f));
                this.mShader.setUniformValue("pix_stride", 1.0f / ((float) outputFrameDimensions[0]));
                frameImage2D.lockTextureSource().setParameter(10240, FilterModes.NEAREST);
                frameImage2D.unlock();
                this.mShader.process(frameImage2D, asFrameImage2D);
                frameImage2D.lockTextureSource().setDefaultParams();
                frameImage2D.unlock();
                asFrameImage2D.lockRenderTarget().readPixelData(lockBytes, iArr[0], iArr[1]);
                asFrameImage2D.unlock();
                asFrameImage2D.release();
            } else if (toGrayValues(frameImage2D.lockBytes(1), lockBytes)) {
                frameImage2D.unlock();
            } else {
                throw new RuntimeException("Native implementation encountered an error during processing!");
            }
            frameBuffer2D.unlock();
        }
    }
}
