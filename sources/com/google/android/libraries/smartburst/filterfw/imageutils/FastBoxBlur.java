package com.google.android.libraries.smartburst.filterfw.imageutils;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import java.nio.ByteBuffer;

/* compiled from: PG */
public class FastBoxBlur {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String mHorizontalBoxFilterSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pixel_weight;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 sum_color = vec4(0.0); \n  for (int i = -$$filter_radius_width$$; i <= $$filter_radius_width$$; i++) {\n    sum_color += texture2D(tex_sampler_0, \n        v_texcoord + vec2(pix * float(i), 0));\n  }\n  gl_FragColor = sum_color * pixel_weight;\n}\n";
    public static final String mVerticalBoxFilterSource = "precision mediump float;\nuniform sampler2D tex_sampler_0;\nuniform float pix;\nuniform float pixel_weight;\nvarying vec2 v_texcoord;\nvoid main() {\n  vec4 sum_color = vec4(0.0);\n  for (int j = -$$filter_radius_height$$; j <= $$filter_radius_height$$; j++) {\n    sum_color += texture2D(tex_sampler_0, \n        v_texcoord + vec2(0, pix * float(j)));\n  }\n  gl_FragColor = sum_color * pixel_weight;\n}\n";
    public final int mFilterHeight;
    public final int mFilterWidth;
    public ImageShader mHorizontalBoxFilterShader;
    public ImageShader mIdentityShader;
    public FrameType mImageType;
    public final boolean mIsOpenGLSupported;
    public ImageShader mVerticalBoxFilterShader;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean blur(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i5);

    public FastBoxBlur(boolean z, int i, int i2) {
        this.mIsOpenGLSupported = z;
        this.mFilterWidth = i;
        this.mFilterHeight = i2;
        if (this.mIsOpenGLSupported) {
            int i3 = this.mFilterWidth;
            if (i3 > 1) {
                this.mHorizontalBoxFilterShader = new ImageShader(mHorizontalBoxFilterSource.replaceAll("\\$\\$filter_radius_width\\$\\$", String.valueOf(i3 >> 1)));
            }
            i3 = this.mFilterHeight;
            if (i3 > 1) {
                this.mVerticalBoxFilterShader = new ImageShader(mVerticalBoxFilterSource.replaceAll("\\$\\$filter_radius_height\\$\\$", String.valueOf(i3 >> 1)));
            }
            this.mImageType = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
            this.mIdentityShader = ImageShader.createIdentity();
        }
    }

    public static void computeBlur(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i5) {
        blur(i, i2, i3, i4, byteBuffer, byteBuffer2, i5);
    }

    public void computeBlur(FrameImage2D frameImage2D, FrameImage2D frameImage2D2) {
        int[] dimensions = frameImage2D.getDimensions();
        int i = dimensions[0];
        if (i > 0) {
            int i2 = dimensions[1];
            if (i2 > 0) {
                if (this.mIsOpenGLSupported) {
                    ImageShader imageShader = this.mVerticalBoxFilterShader;
                    if (imageShader != null) {
                        imageShader.setUniformValue("pix", 1.0f / ((float) i2));
                        this.mVerticalBoxFilterShader.setUniformValue("pixel_weight", 1.0f / ((float) this.mFilterHeight));
                    }
                    imageShader = this.mHorizontalBoxFilterShader;
                    if (imageShader != null) {
                        imageShader.setUniformValue("pix", 1.0f / ((float) dimensions[0]));
                        this.mHorizontalBoxFilterShader.setUniformValue("pixel_weight", 1.0f / ((float) this.mFilterWidth));
                    }
                    i = this.mFilterHeight;
                    if (i == 1 && this.mFilterWidth == 1) {
                        this.mIdentityShader.process(frameImage2D, frameImage2D2);
                        return;
                    } else if (i > 1 && this.mFilterWidth == 1) {
                        this.mVerticalBoxFilterShader.process(frameImage2D, frameImage2D2);
                        return;
                    } else if (i != 1 || this.mFilterWidth <= 1) {
                        FrameImage2D asFrameImage2D = Frame.create(this.mImageType, dimensions).asFrameImage2D();
                        this.mVerticalBoxFilterShader.process(frameImage2D, asFrameImage2D);
                        this.mHorizontalBoxFilterShader.process(asFrameImage2D, frameImage2D2);
                        asFrameImage2D.release();
                        return;
                    } else {
                        this.mHorizontalBoxFilterShader.process(frameImage2D, frameImage2D2);
                        return;
                    }
                }
                ByteBuffer lockBytes = frameImage2D.lockBytes(1);
                ByteBuffer lockBytes2 = frameImage2D2.lockBytes(2);
                lockBytes.rewind();
                computeBlur(frameImage2D.getWidth(), frameImage2D.getHeight(), this.mFilterWidth, this.mFilterHeight, lockBytes, lockBytes2, lockBytes.remaining() / (dimensions[1] * dimensions[0]));
                frameImage2D.unlock();
                frameImage2D2.unlock();
                return;
            }
        }
        int i3 = dimensions[1];
        StringBuilder stringBuilder = new StringBuilder(74);
        stringBuilder.append("The width ");
        stringBuilder.append(i);
        stringBuilder.append(" or height ");
        stringBuilder.append(i3);
        stringBuilder.append(" of the input frame is invalid!");
        Log.e("FastBoxBlur", stringBuilder.toString());
    }
}
