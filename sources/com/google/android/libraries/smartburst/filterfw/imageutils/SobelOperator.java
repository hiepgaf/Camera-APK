package com.google.android.libraries.smartburst.filterfw.imageutils;

import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class SobelOperator {
    public static final String mDirectionSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  gl_FragColor = vec4((atan(gy.rgb, gx.rgb) + 3.14) / (2.0 * 3.14), 1.0);\n}\n";
    public static final String mGradientXSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = -1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, -pix.y));\n  vec4 a2 = -2.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, 0.0));\n  vec4 a3 = -1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, +pix.y));\n  vec4 b1 = +1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, -pix.y));\n  vec4 b2 = +2.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, 0.0));\n  vec4 b3 = +1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, +pix.y));\n  gl_FragColor = 0.5 + (a1 + a2 + a3 + b1 + b2 + b3) / 8.0;\n}\n";
    public static final String mGradientYSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pix;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 a1 = -1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, -pix.y));\n  vec4 a2 = -2.0 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0,    -pix.y));\n  vec4 a3 = -1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, -pix.y));\n  vec4 b1 = +1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(-pix.x, +pix.y));\n  vec4 b2 = +2.0 * texture2D(tex_sampler_0, v_texcoord + vec2(0.0,    +pix.y));\n  vec4 b3 = +1.0 * texture2D(tex_sampler_0, v_texcoord + vec2(+pix.x, +pix.y));\n  gl_FragColor = 0.5 + (a1 + a2 + a3 + b1 + b2 + b3) / 8.0;\n}\n";
    public static final String mMagnitudeSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  gl_FragColor = vec4(sqrt(gx.rgb * gx.rgb + gy.rgb * gy.rgb), 1.0);\n}\n";
    public ImageShader mDirectionShader;
    public ImageShader mGradientXShader;
    public ImageShader mGradientYShader;
    public FrameType mImageType;
    public final boolean mIsOpenGLSupported;
    public ImageShader mMagnitudeShader;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean sobelOperator(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, ByteBuffer byteBuffer4, ByteBuffer byteBuffer5);

    public SobelOperator(boolean z) {
        this.mIsOpenGLSupported = z;
        if (this.mIsOpenGLSupported) {
            this.mGradientXShader = new ImageShader(mGradientXSource);
            this.mGradientYShader = new ImageShader(mGradientYSource);
            this.mMagnitudeShader = new ImageShader("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  gl_FragColor = vec4(sqrt(gx.rgb * gx.rgb + gy.rgb * gy.rgb), 1.0);\n}\n");
            this.mDirectionShader = new ImageShader("precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 gy = 2.0 * texture2D(tex_sampler_1, v_texcoord) - 1.0;\n  vec4 gx = 2.0 * texture2D(tex_sampler_0, v_texcoord) - 1.0;\n  gl_FragColor = vec4((atan(gy.rgb, gx.rgb) + 3.14) / (2.0 * 3.14), 1.0);\n}\n");
            this.mImageType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
        }
    }

    public void calculate(FrameImage2D frameImage2D, FrameImage2D frameImage2D2, FrameImage2D frameImage2D3, FrameImage2D frameImage2D4, FrameImage2D frameImage2D5) {
        int[] dimensions = frameImage2D.getDimensions();
        if (this.mIsOpenGLSupported) {
            FrameImage2D asFrameImage2D;
            FrameImage2D asFrameImage2D2;
            if (frameImage2D2 == null) {
                asFrameImage2D = Frame.create(this.mImageType, dimensions).asFrameImage2D();
            } else {
                asFrameImage2D = frameImage2D2;
            }
            if (frameImage2D3 == null) {
                asFrameImage2D2 = Frame.create(this.mImageType, dimensions).asFrameImage2D();
            } else {
                asFrameImage2D2 = frameImage2D3;
            }
            this.mGradientXShader.setUniformValue("pix", new float[]{1.0f / ((float) dimensions[0]), 1.0f / ((float) dimensions[1])});
            this.mGradientYShader.setUniformValue("pix", new float[]{1.0f / ((float) dimensions[0]), 1.0f / ((float) dimensions[1])});
            this.mGradientXShader.process(frameImage2D, asFrameImage2D);
            this.mGradientYShader.process(frameImage2D, asFrameImage2D2);
            FrameImage2D[] frameImage2DArr = new FrameImage2D[]{asFrameImage2D, asFrameImage2D2};
            if (frameImage2D4 != null) {
                this.mMagnitudeShader.processMulti(frameImage2DArr, frameImage2D4);
            }
            if (frameImage2D5 != null) {
                this.mDirectionShader.processMulti(frameImage2DArr, frameImage2D5);
            }
            if (frameImage2D2 == null) {
                asFrameImage2D.release();
            }
            if (frameImage2D3 == null) {
                asFrameImage2D2.release();
                return;
            }
            return;
        }
        ByteBuffer lockBytes;
        ByteBuffer lockBytes2;
        ByteBuffer lockBytes3;
        ByteBuffer lockBytes4;
        ByteBuffer lockBytes5 = frameImage2D.lockBytes(1);
        if (frameImage2D4 != null) {
            lockBytes = frameImage2D4.lockBytes(2);
        } else {
            lockBytes = null;
        }
        if (frameImage2D5 != null) {
            lockBytes2 = frameImage2D5.lockBytes(2);
        } else {
            lockBytes2 = null;
        }
        if (frameImage2D2 != null) {
            lockBytes3 = frameImage2D2.lockBytes(2);
        } else {
            lockBytes3 = null;
        }
        if (frameImage2D3 != null) {
            lockBytes4 = frameImage2D3.lockBytes(2);
        } else {
            lockBytes4 = null;
        }
        sobelOperator(frameImage2D.getWidth(), frameImage2D.getHeight(), lockBytes5, lockBytes, lockBytes2, lockBytes3, lockBytes4);
        frameImage2D.unlock();
        if (frameImage2D4 != null) {
            frameImage2D4.unlock();
        }
        if (frameImage2D5 != null) {
            frameImage2D5.unlock();
        }
        if (frameImage2D2 != null) {
            frameImage2D2.unlock();
        }
        if (frameImage2D3 != null) {
            frameImage2D3.unlock();
        }
    }
}
