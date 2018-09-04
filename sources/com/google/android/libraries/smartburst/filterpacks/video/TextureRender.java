package com.google.android.libraries.smartburst.filterpacks.video;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapAxes;
import com.google.googlex.gcam.androidutils.gles30.GLSamplerObject.WrapModes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* compiled from: PG */
class TextureRender {
    public static final String EXTERNAL_FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    public static final int FLOAT_SIZE_BYTES = 4;
    public static final String FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    public static final String TAG = "TextureRender";
    public static final int TRIANGLE_VERTICES_DATA_POS_OFFSET = 0;
    public static final int TRIANGLE_VERTICES_DATA_STRIDE_BYTES = 20;
    public static final int TRIANGLE_VERTICES_DATA_UV_OFFSET = 3;
    public static final String VERTEX_SHADER = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n";
    public boolean mIsTextureExternal;
    public float[] mMVPMatrix = new float[16];
    public int mProgram;
    public float[] mSTMatrix = new float[16];
    public int mSourceTextureID = 0;
    public int mSourceTextureObject = 0;
    public int mTextureID = 0;
    public FloatBuffer mTriangleVertices = ByteBuffer.allocateDirect(this.mTriangleVerticesData.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    public final float[] mTriangleVerticesData = new float[]{-1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    public int maPositionHandle;
    public int maTextureHandle;
    public int muMVPMatrixHandle;
    public int muSTMatrixHandle;

    public TextureRender(boolean z) {
        this.mTriangleVertices.put(this.mTriangleVerticesData).position(0);
        Matrix.setIdentityM(this.mSTMatrix, 0);
        this.mIsTextureExternal = z;
    }

    public void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder.append(str);
            stringBuilder.append(": glError ");
            stringBuilder.append(glGetError);
            Log.e(TAG, stringBuilder.toString());
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder2.append(str);
            stringBuilder2.append(": glError ");
            stringBuilder2.append(glGetError);
            throw new RuntimeException(stringBuilder2.toString());
        }
    }

    private int createProgram(String str, String str2) {
        int loadShader = loadShader(35633, str);
        if (loadShader == 0) {
            return 0;
        }
        int loadShader2 = loadShader(35632, str2);
        if (loadShader2 == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        checkGlError("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e(TAG, "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, loadShader);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        checkGlError("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Log.e(TAG, "Could not link program: ");
        Log.e(TAG, GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public int createSourceTexture() {
        if (this.mTextureID != 0) {
            throw new IllegalStateException("Only one target texture allowed per TextureRender");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        this.mTextureID = iArr[0];
        setSourceTexture(this.mTextureID);
        return this.mTextureID;
    }

    public void drawFrame() {
        checkGlError("onDrawFrame start");
        GLES20.glClearColor(0.0f, 1.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.mProgram);
        checkGlError("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.mSourceTextureObject, this.mSourceTextureID);
        this.mTriangleVertices.position(0);
        GLES20.glVertexAttribPointer(this.maPositionHandle, 3, 5126, false, 20, this.mTriangleVertices);
        checkGlError("glVertexAttribPointer maPosition");
        GLES20.glEnableVertexAttribArray(this.maPositionHandle);
        checkGlError("glEnableVertexAttribArray maPositionHandle");
        this.mTriangleVertices.position(3);
        GLES20.glVertexAttribPointer(this.maTextureHandle, 2, 5126, false, 20, this.mTriangleVertices);
        checkGlError("glVertexAttribPointer maTextureHandle");
        GLES20.glEnableVertexAttribArray(this.maTextureHandle);
        checkGlError("glEnableVertexAttribArray maTextureHandle");
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muMVPMatrixHandle, 1, false, this.mMVPMatrix, 0);
        GLES20.glUniformMatrix4fv(this.muSTMatrixHandle, 1, false, this.mSTMatrix, 0);
        GLES20.glDrawArrays(5, 0, 4);
        checkGlError("glDrawArrays");
        GLES20.glFinish();
    }

    public void initialize() {
        String str;
        if (this.mIsTextureExternal) {
            str = EXTERNAL_FRAGMENT_SHADER;
        } else {
            str = FRAGMENT_SHADER;
        }
        this.mProgram = createProgram(VERTEX_SHADER, str);
        int i = this.mProgram;
        if (i == 0) {
            throw new RuntimeException("failed creating program");
        }
        this.maPositionHandle = GLES20.glGetAttribLocation(i, "aPosition");
        checkGlError("glGetAttribLocation aPosition");
        if (this.maPositionHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aPosition");
        }
        this.maTextureHandle = GLES20.glGetAttribLocation(this.mProgram, "aTextureCoord");
        checkGlError("glGetAttribLocation aTextureCoord");
        if (this.maTextureHandle == -1) {
            throw new RuntimeException("Could not get attrib location for aTextureCoord");
        }
        this.muMVPMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMVPMatrix");
        checkGlError("glGetUniformLocation uMVPMatrix");
        if (this.muMVPMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uMVPMatrix");
        }
        this.muSTMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uSTMatrix");
        checkGlError("glGetUniformLocation uSTMatrix");
        if (this.muSTMatrixHandle == -1) {
            throw new RuntimeException("Could not get attrib location for uSTMatrix");
        }
    }

    private int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("glCreateShader type=");
        stringBuilder.append(i);
        checkGlError(stringBuilder.toString());
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        stringBuilder = new StringBuilder(37);
        stringBuilder.append("Could not compile shader ");
        stringBuilder.append(i);
        stringBuilder.append(":");
        Log.e(TAG, stringBuilder.toString());
        String valueOf = String.valueOf(GLES20.glGetShaderInfoLog(glCreateShader));
        String str2 = " ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        Log.e(TAG, valueOf);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public void setAffineTransform(int i, int i2, int i3, int i4) {
        GLES20.glViewport(i, i2, i3, i4);
        checkGlError("glViewport");
    }

    public void setSourceTexture(int i) {
        int i2;
        if (this.mIsTextureExternal) {
            i2 = 36197;
        } else {
            i2 = 3553;
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(i2, i);
        checkGlError("glBindTexture mTextureID");
        GLES20.glTexParameterf(i2, 10241, 9728.0f);
        GLES20.glTexParameterf(i2, 10240, 9729.0f);
        GLES20.glTexParameteri(i2, WrapAxes.f2483S, WrapModes.CLAMP_TO_EDGE);
        GLES20.glTexParameteri(i2, WrapAxes.f2484T, WrapModes.CLAMP_TO_EDGE);
        checkGlError("glTexParameter");
        this.mSourceTextureObject = i2;
        this.mSourceTextureID = i;
    }

    public void updateTransformFrom(SurfaceTexture surfaceTexture) {
        surfaceTexture.getTransformMatrix(this.mSTMatrix);
    }
}
