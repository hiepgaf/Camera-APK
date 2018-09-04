package com.google.android.libraries.smartburst.filterpacks.image;

import com.google.android.libraries.smartburst.filterfw.Frame;
import com.google.android.libraries.smartburst.filterfw.FrameImage2D;
import com.google.android.libraries.smartburst.filterfw.FrameType;
import com.google.android.libraries.smartburst.filterfw.ImageShader;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.FilterModes;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import p000.jri;

/* compiled from: PG */
public class ImageStatisticsCalculator {
    public static final String COMPACT_SHADER_CODE = "precision highp float;\nuniform sampler2D tex_sampler_0;\nuniform vec2 pixel;\nvarying vec2 v_texcoord;\n\nvoid main() {\n  float gray0 = texture2D(tex_sampler_0, v_texcoord -       vec2(pixel.x * 1.5, 0.0)).r;\n  float gray1 = texture2D(tex_sampler_0, v_texcoord -       vec2(pixel.x * 0.5, 0.0)).r;\n  float gray2 = texture2D(tex_sampler_0, v_texcoord +       vec2(pixel.x * 0.5, 0.0)).r;\n  float gray3 = texture2D(tex_sampler_0, v_texcoord +       vec2(pixel.x * 1.5, 0.0)).r;\n  gl_FragColor = vec4(gray0, gray1, gray2, gray3);\n}";
    public static final float DARK_IMAGE_TRANSITION_POINT = 5.0f;
    public static final float DARK_IMAGE_TRANSITION_RATE = 0.2f;
    public static final String DIFF_SHADER_CODE = "precision highp float;\nuniform sampler2D tex_sampler_0;\nuniform sampler2D tex_sampler_1;\nuniform sampler2D tex_sampler_2;\nuniform vec2 pixel;\nvarying vec2 v_texcoord;\n\nvoid main() {\n  float curr = texture2D(tex_sampler_0, v_texcoord).r;\n  float right = texture2D(tex_sampler_0, v_texcoord +       vec2(pixel.x, 0.0)).r;\n  float d_fhor = abs(right - curr);\n  float down = texture2D(tex_sampler_0, v_texcoord +       vec2(0.0, pixel.y)).r;\n  float d_fver = abs(down - curr);\n\n  curr = texture2D(tex_sampler_1, v_texcoord).r;\n  right = texture2D(tex_sampler_1, v_texcoord + vec2(pixel.x, 0.0)).r;\n  float d_bhor = abs(right - curr);\n  curr = texture2D(tex_sampler_2, v_texcoord).r;\n  down = texture2D(tex_sampler_2, v_texcoord + vec2(0.0, pixel.y)).r;\n  float d_bver = abs(down - curr);\n\n  float vver = max(0.0, d_fver - d_bver);\n  float vhor = max(0.0, d_fhor - d_bhor);\n\n  gl_FragColor = vec4(d_fhor, d_fver, vhor, vver);\n}";
    public static final float FLAT_IMAGE_TRANSITION_POINT = 1.7361f;
    public static final float FLAT_IMAGE_TRANSITION_RATE = 11.52f;
    public static final int STATS_STRUCT_SIZE = 16;
    public ImageShader mCompactShader = null;
    public ImageShader mDiffShader = null;
    public final int mNumBlocksX;
    public final int mNumBlocksY;

    /* compiled from: PG */
    class BlockStats {
        public final short grayMax;
        public final short grayMin;
        public final long graySquaredSum;
        public final int graySum;
        public final int height;
        public final int sFHor;
        public final int sFVer;
        public final int sVHor;
        public final int sVVer;
        public final int width;

        private BlockStats(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, short s, short s2) {
            this.width = i;
            this.height = i2;
            this.sFHor = i3;
            this.sFVer = i4;
            this.sVHor = i5;
            this.sVVer = i6;
            this.graySum = i7;
            this.graySquaredSum = j;
            this.grayMax = s;
            this.grayMin = s2;
        }

        public static BlockStats combineStats(int i, int i2, int i3, int i4, BlockStats[] blockStatsArr) {
            boolean z = i <= 0 ? false : i2 > 0;
            jri.m13143a(z);
            if (r3 == i * i2) {
                z = true;
            } else {
                z = false;
            }
            jri.m13143a(z);
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            long j = 0;
            short s = (short) 0;
            short s2 = (short) 255;
            for (BlockStats blockStats : blockStatsArr) {
                i5 += blockStats.sFHor;
                i6 += blockStats.sFVer;
                i7 += blockStats.sVHor;
                i8 += blockStats.sVVer;
                i9 += blockStats.graySum;
                j += blockStats.graySquaredSum;
                s = max(s, blockStats.grayMax);
                s2 = min(s2, blockStats.grayMin);
            }
            return new BlockStats(i3, i4, i5, i6, i7, i8, i9, j, s, s2);
        }

        public int count() {
            return this.width * this.height;
        }

        public static BlockStats fromBuffers(int i, int i2, IntBuffer intBuffer, ByteBuffer byteBuffer) {
            int i3 = byteBuffer.getInt();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            return new BlockStats(i, i2, intBuffer.get(), intBuffer.get(), intBuffer.get(), intBuffer.get(), i3, byteBuffer.getLong(), s, s2);
        }

        public float grayMean() {
            return ((float) this.graySum) / ((float) count());
        }

        public float grayVariance() {
            float count = (float) count();
            if (count <= 1.0f) {
                return 0.0f;
            }
            long j = this.graySquaredSum;
            int i = this.graySum;
            return (((float) j) - (((float) (i * i)) / count)) / (count - 4.0f);
        }

        private static short max(short s, short s2) {
            return s > s2 ? s : s2;
        }

        private static short min(short s, short s2) {
            return s < s2 ? s : s2;
        }

        public float perceptualSharpness() {
            int i = this.sFVer;
            if (i != 0) {
                int i2 = this.sFHor;
                if (i2 != 0) {
                    int i3 = this.sVVer;
                    float f = (float) i;
                    int i4 = this.sVHor;
                    float f2 = (float) (this.width * this.height);
                    float sigmoidFuction = sigmoidFuction(f / f2, 1.7361f, 11.52f);
                    f2 = sigmoidFuction(((float) this.sFHor) / f2, 1.7361f, 11.52f);
                    return Math.min((((float) i3) / f) * sigmoidFuction, (((float) i4) / ((float) i2)) * f2) * sigmoidFuction(grayMean(), 5.0f, 0.2f);
                }
            }
            return 0.0f;
        }

        private float sigmoidFuction(float f, float f2, float f3) {
            return 1.0f / (((float) Math.exp((double) ((-(f - f2)) * f3))) + 1.0f);
        }
    }

    static {
        System.loadLibrary("filterframework_jni");
    }

    private static native boolean calculateStats(int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, Buffer buffer2);

    private static native boolean calculateSums4(int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, Buffer buffer2);

    public ImageStatisticsCalculator(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13143a(z);
        if (i2 <= 0) {
            z2 = false;
        }
        jri.m13143a(z2);
        this.mNumBlocksX = i;
        this.mNumBlocksY = i2;
    }

    private BlockStats[] calculateBlockStats(Buffer buffer, Buffer buffer2, int i, int i2) {
        Buffer asIntBuffer = ByteBuffer.allocateDirect(128).order(ByteOrder.nativeOrder()).asIntBuffer();
        Buffer order = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder());
        int i3 = this.mNumBlocksX;
        float f = ((float) i) / ((float) i3);
        int i4 = this.mNumBlocksY;
        float f2 = ((float) i2) / ((float) i4);
        BlockStats[] blockStatsArr = new BlockStats[(i3 * i4)];
        int i5 = 0;
        i3 = 0;
        while (i5 < this.mNumBlocksY) {
            int i6 = 0;
            int i7 = i3;
            while (i6 < this.mNumBlocksX) {
                i3 = Math.round(((float) i6) * f);
                i4 = Math.round(((float) i5) * f2);
                int min = Math.min(Math.round(((float) (i6 + 1)) * f), i) - i3;
                int min2 = Math.min(Math.round(((float) (i5 + 1)) * f2), i2) - i4;
                asIntBuffer.rewind();
                order.rewind();
                if (!calculateSums4(i3, i4, min, min2, buffer, 4, i << 2, asIntBuffer)) {
                    throw new RuntimeException("Could not calculate block statistics!");
                } else if (calculateStats(i3, i4, min, min2, buffer2, 1, i, order)) {
                    i4 = i7 + 1;
                    blockStatsArr[i7] = BlockStats.fromBuffers(min, min2, asIntBuffer, order);
                    i6++;
                    i7 = i4;
                } else {
                    throw new RuntimeException("Could not calculate block statistics!");
                }
            }
            i5++;
            i3 = i7;
        }
        return blockStatsArr;
    }

    private ImageStatistics calculateImageStatistics(Buffer buffer, Buffer buffer2, int i, int i2, long j) {
        return calculateImageStatistics(calculateBlockStats(buffer, buffer2, i, i2), i, i2, j);
    }

    private ImageStatistics calculateImageStatistics(BlockStats[] blockStatsArr, int i, int i2, long j) {
        BlockStats combineStats = BlockStats.combineStats(this.mNumBlocksX, this.mNumBlocksY, i, i2, blockStatsArr);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 255.0f;
        float f4 = 0.0f;
        float f5 = 65025.0f;
        for (BlockStats blockStats : blockStatsArr) {
            f = Math.max(blockStats.perceptualSharpness(), f);
            f2 = Math.max(blockStats.grayMean(), f2);
            f3 = Math.min(blockStats.grayMean(), f3);
            f4 = Math.max(blockStats.grayVariance(), f4);
            f5 = Math.min(blockStats.grayVariance(), f5);
        }
        return new ImageStatistics(combineStats.perceptualSharpness(), combineStats.grayMean(), combineStats.grayMax, combineStats.grayMin, combineStats.grayVariance(), f, f2, f3, f4, f5, j);
    }

    public ImageStatistics extractImageStatistics(FrameImage2D frameImage2D, FrameImage2D frameImage2D2, FrameImage2D frameImage2D3) {
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
        ImageStatistics calculateImageStatistics = calculateImageStatistics(asFrameImage2D2.lockBytes(1), asFrameImage2D.lockBytes(1), frameImage2D.getWidth(), frameImage2D.getHeight(), frameImage2D.getTimestamp());
        setInterpolationMode(frameImage2D, FilterModes.LINEAR);
        setInterpolationMode(frameImage2D2, FilterModes.LINEAR);
        setInterpolationMode(frameImage2D3, FilterModes.LINEAR);
        asFrameImage2D2.unlock();
        asFrameImage2D.unlock();
        asFrameImage2D2.release();
        asFrameImage2D.release();
        return calculateImageStatistics;
    }

    private void setInterpolationMode(FrameImage2D frameImage2D, int i) {
        frameImage2D.lockTextureSource().setParameter(10240, i);
        frameImage2D.unlock();
    }
}
