package com.google.android.libraries.smartburst.filterfw.imageutils;

import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: PG */
public final class PerceptualSharpnessCalculator {
    public static final String COMPACT_SHADER_CODE = "precision highp float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pixel;\nvarying vec2 v_texcoord;\n\nvoid main() {\n  float gray0 = texture2D(tex_sampler_0, v_texcoord - vec2(pixel.x * 1.5, 0.0)).r;\n  float gray1 = texture2D(tex_sampler_0, v_texcoord - vec2(pixel.x * 0.5, 0.0)).r;\n  float gray2 = texture2D(tex_sampler_0, v_texcoord + vec2(pixel.x * 0.5, 0.0)).r;\n  float gray3 = texture2D(tex_sampler_0, v_texcoord + vec2(pixel.x * 1.5, 0.0)).r;\n  gl_FragColor = vec4(gray0, gray1, gray2, gray3);\n}";
    public static final String DIFF_SHADER_CODE = "precision highp float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform sampler2D tex_sampler_2;\nuniform vec2 pixel;\nvarying vec2 v_texcoord;\n\nvoid main() {\n  float curr = texture2D(tex_sampler_0, v_texcoord).r;\n  float right = texture2D(tex_sampler_0, v_texcoord + vec2(pixel.x, 0.0)).r;\n  float d_fhor = abs(right - curr);\n  float down = texture2D(tex_sampler_0, v_texcoord + vec2(0.0, pixel.y)).r;\n  float d_fver = abs(down - curr);\n\n  curr = texture2D(tex_sampler_1, v_texcoord).r;\n  right = texture2D(tex_sampler_1, v_texcoord + vec2(pixel.x, 0.0)).r;\n  float d_bhor = abs(right - curr);\n  curr = texture2D(tex_sampler_2, v_texcoord).r;\n  down = texture2D(tex_sampler_2, v_texcoord + vec2(0.0, pixel.y)).r;\n  float d_bver = abs(down - curr);\n\n  float vver = max(0.0, d_fver - d_bver);\n  float vhor = max(0.0, d_fhor - d_bhor);\n\n  gl_FragColor = vec4(d_fhor, d_fver, vhor, vver);\n}";
    public ImageShader mCompactShader;
    public ImageShader mDiffShader;

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native float computeGridPerceptualSharpness(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3, int i4, int i5, FloatBuffer floatBuffer);

    public static native float computeGridPerceptualSharpnessFromDiff(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i3, int i4, FloatBuffer floatBuffer);

    private static native float computePerceptualSharpness(int i, int i2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i3);

    public static GridSharpness computeGridSharpness(FrameImage2D frameImage2D, FrameImage2D frameImage2D2, FrameImage2D frameImage2D3, int i, int i2) {
        if (frameImage2D.getWidth() <= 0 || frameImage2D.getHeight() <= 0) {
            int width = frameImage2D.getWidth();
            int height = frameImage2D.getHeight();
            StringBuilder stringBuilder = new StringBuilder(74);
            stringBuilder.append("The width ");
            stringBuilder.append(width);
            stringBuilder.append(" or height ");
            stringBuilder.append(height);
            stringBuilder.append(" of the input frame is invalid!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        ByteBuffer lockBytes = frameImage2D.lockBytes(1);
        ByteBuffer lockBytes2 = frameImage2D2.lockBytes(1);
        ByteBuffer lockBytes3 = frameImage2D3.lockBytes(1);
        lockBytes.rewind();
        int remaining = lockBytes.remaining() / (frameImage2D.getWidth() * frameImage2D.getHeight());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        float computeGridPerceptualSharpness = computeGridPerceptualSharpness(frameImage2D.getWidth(), frameImage2D.getHeight(), lockBytes, lockBytes2, lockBytes3, remaining, i, i2, asFloatBuffer);
        frameImage2D.unlock();
        frameImage2D2.unlock();
        frameImage2D3.unlock();
        return new GridSharpness(computeGridPerceptualSharpness, asFloatBuffer.get(0));
    }

    public final GridSharpness computeGridSharpnessGpu(FrameImage2D frameImage2D, FrameImage2D frameImage2D2, FrameImage2D frameImage2D3, int i, int i2) {
        if (frameImage2D.getWidth() % 4 != 0) {
            throw new IllegalArgumentException("Input image must have a width that is a multiple of 4!");
        }
        FrameType image2D = FrameType.image2D(FrameType.ELEMENT_RGBA8888, 18);
        setInterpolationMode(frameImage2D, FilterModes.NEAREST);
        setInterpolationMode(frameImage2D2, FilterModes.NEAREST);
        setInterpolationMode(frameImage2D3, FilterModes.NEAREST);
        int[] dimensions = frameImage2D.getDimensions();
        r2 = new float[2];
        r2[0] = 1.0f / ((float) dimensions[0]);
        r2[1] = 1.0f / ((float) dimensions[1]);
        FrameImage2D asFrameImage2D = Frame.create(image2D, new int[]{r3 / 4, dimensions[1]}).asFrameImage2D();
        if (this.mCompactShader == null) {
            this.mCompactShader = new ImageShader(COMPACT_SHADER_CODE);
        }
        this.mCompactShader.setUniformValue("pixel", r2);
        this.mCompactShader.process(frameImage2D, asFrameImage2D);
        FrameImage2D asFrameImage2D2 = Frame.create(image2D, dimensions).asFrameImage2D();
        if (this.mDiffShader == null) {
            this.mDiffShader = new ImageShader(DIFF_SHADER_CODE);
        }
        this.mDiffShader.setUniformValue("pixel", r2);
        this.mDiffShader.processMulti(new FrameImage2D[]{frameImage2D, frameImage2D2, frameImage2D3}, asFrameImage2D2);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        float computeGridPerceptualSharpnessFromDiff = computeGridPerceptualSharpnessFromDiff(asFrameImage2D2.getWidth(), asFrameImage2D2.getHeight(), asFrameImage2D2.lockBytes(1), asFrameImage2D.lockBytes(1), i, i2, asFloatBuffer);
        setInterpolationMode(frameImage2D, FilterModes.LINEAR);
        setInterpolationMode(frameImage2D2, FilterModes.LINEAR);
        setInterpolationMode(frameImage2D3, FilterModes.LINEAR);
        asFrameImage2D2.unlock();
        asFrameImage2D.unlock();
        asFrameImage2D2.release();
        asFrameImage2D.release();
        return new GridSharpness(computeGridPerceptualSharpnessFromDiff, asFloatBuffer.get(0));
    }

    public static float computeSharpness(FrameImage2D frameImage2D, FrameImage2D frameImage2D2, FrameImage2D frameImage2D3) {
        if (frameImage2D.getWidth() <= 0 || frameImage2D.getHeight() <= 0) {
            int width = frameImage2D.getWidth();
            int height = frameImage2D.getHeight();
            StringBuilder stringBuilder = new StringBuilder(106);
            stringBuilder.append("In PerceptualSharpnessCalculatorThe width ");
            stringBuilder.append(width);
            stringBuilder.append(" or height ");
            stringBuilder.append(height);
            stringBuilder.append(" of the input frame is invalid!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        ByteBuffer lockBytes = frameImage2D.lockBytes(1);
        ByteBuffer lockBytes2 = frameImage2D2.lockBytes(1);
        ByteBuffer lockBytes3 = frameImage2D3.lockBytes(1);
        lockBytes.rewind();
        float computePerceptualSharpness = computePerceptualSharpness(frameImage2D.getWidth(), frameImage2D.getHeight(), lockBytes, lockBytes2, lockBytes3, lockBytes.remaining() / (frameImage2D.getWidth() * frameImage2D.getHeight()));
        frameImage2D.unlock();
        frameImage2D2.unlock();
        frameImage2D3.unlock();
        return computePerceptualSharpness;
    }

    private final void setInterpolationMode(FrameImage2D frameImage2D, int i) {
        frameImage2D.lockTextureSource().setParameter(10240, i);
        frameImage2D.unlock();
    }
}
