package com.google.android.libraries.smartburst.filterfw;

import android.annotation.TargetApi;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.GLES31;
import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.geometry.Quad;
import com.google.android.libraries.smartburst.filterfw.util.Trace;
import com.google.googlex.gcam.androidutils.gles30.GLBufferObject.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: PG */
public class ImageShader {
    public static final int FLOAT_SIZE = 4;
    public static final String mDefaultVertexShader = "attribute vec4 a_position;\nattribute vec2 a_texcoord;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_Position = a_position;\n  v_texcoord = a_texcoord;\n}\n";
    public static final String mExternalIdentityShader = "#extension GL_OES_EGL_image_external : require\nprecision lowp float;\nuniform samplerExternalOES tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n";
    public static final String mIdentityShader = "precision lowp float;\nuniform sampler2D tex_sampler_0;\nvarying vec2 v_texcoord;\nvoid main() {\n  gl_FragColor = texture2D(tex_sampler_0, v_texcoord);\n}\n";
    public HashMap mAttributes = new HashMap();
    public int mBaseTexUnit = 33984;
    public boolean mBlendEnabled = false;
    public int mClearBuffers = 16384;
    public float[] mClearColor = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    public boolean mClearsOutput = false;
    public int mDFactor = 771;
    public int mDrawMode = 5;
    public int mProgram = 0;
    public int mSFactor = 770;
    public float[] mSourceCoords = new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
    public float[] mTargetCoords = new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
    public HashMap mUniforms;
    public int mVertexCount = 4;

    /* compiled from: PG */
    final class ProgramUniform {
        public int mLocation;
        public String mName;
        public int mSize;
        public int mType;

        public ProgramUniform(int i, int i2) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int[] iArr3 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, iArr3, 0, iArr2, 0, bArr, 0);
            this.mName = new String(bArr, 0, ImageShader.strlen(bArr));
            this.mLocation = GLES20.glGetUniformLocation(i, this.mName);
            this.mType = iArr2[0];
            this.mSize = iArr3[0];
            GLToolbox.checkGlError("Initializing uniform");
        }

        public final int getLocation() {
            return this.mLocation;
        }

        public final String getName() {
            return this.mName;
        }

        public final int getSize() {
            return this.mSize;
        }

        public final int getType() {
            return this.mType;
        }
    }

    /* compiled from: PG */
    class VertexAttribute {
        public int mComponents;
        public int mIndex;
        public boolean mIsConst;
        public int mLength = -1;
        public String mName;
        public int mOffset;
        public boolean mShouldNormalize;
        public int mStride;
        public int mType;
        public FloatBuffer mValues;
        public int mVbo;

        public VertexAttribute(String str, int i) {
            this.mName = str;
            this.mIndex = i;
        }

        private void copyValues(float[] fArr) {
            this.mValues.put(fArr).position(0);
        }

        private void initBuffer(float[] fArr) {
            this.mValues = ByteBuffer.allocateDirect(fArr.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }

        public boolean push() {
            if (this.mIsConst) {
                switch (this.mComponents) {
                    case 1:
                        GLES20.glVertexAttrib1fv(this.mIndex, this.mValues);
                        break;
                    case 2:
                        GLES20.glVertexAttrib2fv(this.mIndex, this.mValues);
                        break;
                    case 3:
                        GLES20.glVertexAttrib3fv(this.mIndex, this.mValues);
                        break;
                    case 4:
                        GLES20.glVertexAttrib4fv(this.mIndex, this.mValues);
                        break;
                    default:
                        return false;
                }
                GLES20.glDisableVertexAttribArray(this.mIndex);
            } else {
                if (this.mValues != null) {
                    GLES20.glBindBuffer(Target.ARRAY_BUFFER, 0);
                    GLES20.glVertexAttribPointer(this.mIndex, this.mComponents, this.mType, this.mShouldNormalize, this.mStride, this.mValues);
                } else {
                    GLES20.glBindBuffer(Target.ARRAY_BUFFER, this.mVbo);
                    GLES20.glVertexAttribPointer(this.mIndex, this.mComponents, this.mType, this.mShouldNormalize, this.mStride, this.mOffset);
                }
                GLES20.glEnableVertexAttribArray(this.mIndex);
            }
            GLToolbox.checkGlError("Set vertex-attribute values");
            return true;
        }

        public void set(boolean z, int i, int i2, int i3, int i4, int i5) {
            this.mIsConst = false;
            this.mShouldNormalize = z;
            this.mOffset = i;
            this.mStride = i2;
            this.mComponents = i3;
            this.mType = i4;
            this.mVbo = i5;
            this.mValues = null;
        }

        public void set(boolean z, int i, int i2, int i3, float[] fArr) {
            this.mIsConst = false;
            this.mShouldNormalize = z;
            this.mStride = i;
            this.mComponents = i2;
            this.mType = i3;
            this.mVbo = 0;
            int i4 = this.mLength;
            int length = fArr.length;
            if (i4 != length) {
                initBuffer(fArr);
                this.mLength = length;
            }
            copyValues(fArr);
        }

        public String toString() {
            return this.mName;
        }
    }

    public ImageShader(int i) {
        if (i == 0 || !GLES20.glIsProgram(i)) {
            throw new IllegalStateException("Invalid program");
        }
        this.mProgram = i;
        scanUniforms();
    }

    public ImageShader(String str) {
        this.mProgram = createProgram(mDefaultVertexShader, str);
        scanUniforms();
    }

    public ImageShader(String str, String str2) {
        this.mProgram = createProgram(str, str2);
        scanUniforms();
    }

    public int baseTextureUnit() {
        return this.mBaseTexUnit;
    }

    private void bindInputTextures(TextureSource[] textureSourceArr) {
        int i = 0;
        while (true) {
            int length = textureSourceArr.length;
            if (i < length) {
                GLES20.glActiveTexture(baseTextureUnit() + i);
                textureSourceArr[i].bind();
                int glGetUniformLocation = GLES20.glGetUniformLocation(this.mProgram, inputTextureUniformName(i));
                if (glGetUniformLocation >= 0) {
                    GLES20.glUniform1i(glGetUniformLocation, i);
                    StringBuilder stringBuilder = new StringBuilder(33);
                    stringBuilder.append("Binding input texture ");
                    stringBuilder.append(i);
                    GLToolbox.checkGlError(stringBuilder.toString());
                    i++;
                } else {
                    String inputTextureUniformName = inputTextureUniformName(i);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(inputTextureUniformName).length() + 87);
                    stringBuilder2.append("Shader does not seem to support ");
                    stringBuilder2.append(length);
                    stringBuilder2.append(" number of input textures! Missing uniform ");
                    stringBuilder2.append(inputTextureUniformName);
                    stringBuilder2.append("!");
                    throw new RuntimeException(stringBuilder2.toString());
                }
            }
            return;
        }
    }

    private void checkExecutable() {
        if (this.mProgram == 0) {
            throw new RuntimeException("Attempting to execute invalid shader-program!");
        }
    }

    private static void checkTexCount(int i) {
        if (i > maxTextureUnits()) {
            int maxTextureUnits = maxTextureUnits();
            StringBuilder stringBuilder = new StringBuilder(106);
            stringBuilder.append("Number of textures passed (");
            stringBuilder.append(i);
            stringBuilder.append(") exceeds the maximum number of allowed texture units (");
            stringBuilder.append(maxTextureUnits);
            stringBuilder.append(")!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    private void checkUniformAssignment(ProgramUniform programUniform, int i, int i2) {
        String name;
        StringBuilder stringBuilder;
        if (i % i2 != 0) {
            name = programUniform.getName();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 111);
            stringBuilder.append("Size mismatch: Attempting to assign values of size ");
            stringBuilder.append(i);
            stringBuilder.append(" to uniform '");
            stringBuilder.append(name);
            stringBuilder.append("' (must be multiple of ");
            stringBuilder.append(i2);
            stringBuilder.append(")!");
            throw new RuntimeException(stringBuilder.toString());
        } else if (programUniform.getSize() != i / i2) {
            name = programUniform.getName();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 62);
            stringBuilder.append("Size mismatch: Cannot assign ");
            stringBuilder.append(i);
            stringBuilder.append(" values to uniform '");
            stringBuilder.append(name);
            stringBuilder.append("'!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public static ImageShader createExternalIdentity() {
        return new ImageShader(mExternalIdentityShader);
    }

    public static ImageShader createIdentity() {
        return new ImageShader(mIdentityShader);
    }

    public static ImageShader createIdentity(String str) {
        return new ImageShader(str, mIdentityShader);
    }

    private static int createProgram(String str, String str2) {
        int loadShader = loadShader(35633, str);
        if (loadShader == 0) {
            throw new RuntimeException("Could not create shader-program as vertex shader could not be compiled!");
        }
        int loadShader2 = loadShader(35632, str2);
        if (loadShader2 == 0) {
            throw new RuntimeException("Could not create shader-program as fragment shader could not be compiled!");
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, loadShader);
            GLToolbox.checkGlError("glAttachShader");
            GLES20.glAttachShader(glCreateProgram, loadShader2);
            GLToolbox.checkGlError("glAttachShader");
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                String glGetProgramInfoLog = GLES20.glGetProgramInfoLog(glCreateProgram);
                GLES20.glDeleteProgram(glCreateProgram);
                glGetProgramInfoLog = String.valueOf(glGetProgramInfoLog);
                String str3 = "Could not link program: ";
                if (glGetProgramInfoLog.length() == 0) {
                    glGetProgramInfoLog = new String(str3);
                } else {
                    glGetProgramInfoLog = str3.concat(glGetProgramInfoLog);
                }
                throw new RuntimeException(glGetProgramInfoLog);
            }
        }
        GLES20.glDeleteShader(loadShader);
        GLES20.glDeleteShader(loadShader2);
        return glCreateProgram;
    }

    private void focusTarget(RenderTarget renderTarget, int i, int i2) {
        renderTarget.focus();
        GLES20.glViewport(0, 0, i, i2);
        GLToolbox.checkGlError("glViewport");
    }

    public int getAttributeLocation(String str) {
        if (str.equals(positionAttributeName()) || str.equals(texCoordAttributeName())) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 52);
            stringBuilder.append("Attempting to access internal attribute '");
            stringBuilder.append(str);
            stringBuilder.append("' directly!");
            Log.w("ImageShader", stringBuilder.toString());
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.mProgram, str);
        if (glGetAttribLocation >= 0) {
            return glGetAttribLocation;
        }
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 39);
        stringBuilder2.append("Unknown attribute '");
        stringBuilder2.append(str);
        stringBuilder2.append("' in shader program!");
        throw new RuntimeException(stringBuilder2.toString());
    }

    public boolean getBlendEnabled() {
        return this.mBlendEnabled;
    }

    public int getClearBufferMask() {
        return this.mClearBuffers;
    }

    public float[] getClearColor() {
        return this.mClearColor;
    }

    public boolean getClearsOutput() {
        return this.mClearsOutput;
    }

    public int getDrawMode() {
        return this.mDrawMode;
    }

    private VertexAttribute getProgramAttribute(String str, boolean z) {
        VertexAttribute vertexAttribute = (VertexAttribute) this.mAttributes.get(str);
        if (vertexAttribute != null) {
            return vertexAttribute;
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.mProgram, str);
        if (glGetAttribLocation >= 0) {
            vertexAttribute = new VertexAttribute(str, glGetAttribLocation);
            this.mAttributes.put(str, vertexAttribute);
            return vertexAttribute;
        } else if (!z) {
            return vertexAttribute;
        } else {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 21);
            stringBuilder.append("Unknown attribute '");
            stringBuilder.append(str);
            stringBuilder.append("'!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private ProgramUniform getProgramUniform(String str, boolean z) {
        ProgramUniform programUniform = (ProgramUniform) this.mUniforms.get(str);
        if (programUniform != null || !z) {
            return programUniform;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 19);
        stringBuilder.append("Unknown uniform '");
        stringBuilder.append(str);
        stringBuilder.append("'!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public int getUniformLocation(String str) {
        return getProgramUniform(str, true).getLocation();
    }

    public int getVertexCount() {
        return this.mVertexCount;
    }

    public String inputTextureUniformName(int i) {
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append("tex_sampler_");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    private static int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader != 0) {
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                String glGetShaderInfoLog = GLES20.glGetShaderInfoLog(glCreateShader);
                GLES20.glDeleteShader(glCreateShader);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(glGetShaderInfoLog).length() + 37);
                stringBuilder.append("Could not compile shader ");
                stringBuilder.append(i);
                stringBuilder.append(":");
                stringBuilder.append(glGetShaderInfoLog);
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        return glCreateShader;
    }

    public static int maxTextureUnits() {
        return 35661;
    }

    public String positionAttributeName() {
        return "a_position";
    }

    public void process(FrameImage2D frameImage2D, FrameImage2D frameImage2D2) {
        TextureSource lockTextureSource = frameImage2D.lockTextureSource();
        TextureSource[] textureSourceArr = new TextureSource[]{lockTextureSource};
        processMulti(textureSourceArr, frameImage2D2.lockRenderTarget(), frameImage2D2.getWidth(), frameImage2D2.getHeight());
        frameImage2D.unlock();
        frameImage2D2.unlock();
    }

    public void process(TextureSource textureSource, RenderTarget renderTarget, int i, int i2) {
        processMulti(new TextureSource[]{textureSource}, renderTarget, i, i2);
    }

    public void processMulti(FrameImage2D[] frameImage2DArr, FrameImage2D frameImage2D) {
        int i = 0;
        TextureSource[] textureSourceArr = new TextureSource[frameImage2DArr.length];
        int i2 = 0;
        while (true) {
            int length = frameImage2DArr.length;
            if (i2 >= length) {
                break;
            }
            textureSourceArr[i2] = frameImage2DArr[i2].lockTextureSource();
            i2++;
        }
        processMulti(textureSourceArr, frameImage2D.lockRenderTarget(), frameImage2D.getWidth(), frameImage2D.getHeight());
        while (i < length) {
            frameImage2DArr[i].unlock();
            i++;
        }
        frameImage2D.unlock();
    }

    public void processMulti(TextureSource[] textureSourceArr, RenderTarget renderTarget, int i, int i2) {
        GLToolbox.checkGlError("Unknown Operation");
        checkExecutable();
        checkTexCount(textureSourceArr.length);
        focusTarget(renderTarget, i, i2);
        pushShaderState();
        bindInputTextures(textureSourceArr);
        render();
    }

    public void processNoInput(FrameImage2D frameImage2D) {
        processNoInput(frameImage2D.lockRenderTarget(), frameImage2D.getWidth(), frameImage2D.getHeight());
        frameImage2D.unlock();
    }

    public void processNoInput(RenderTarget renderTarget, int i, int i2) {
        processMulti(new TextureSource[0], renderTarget, i, i2);
    }

    private void pushAttributes() {
        for (VertexAttribute vertexAttribute : this.mAttributes.values()) {
            if (!vertexAttribute.push()) {
                String valueOf = String.valueOf(vertexAttribute);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Unable to assign attribute value '");
                stringBuilder.append(valueOf);
                stringBuilder.append("'!");
                throw new RuntimeException(stringBuilder.toString());
            }
        }
        GLToolbox.checkGlError("Push Attributes");
    }

    protected void pushShaderState() {
        useProgram();
        updateSourceCoordAttribute();
        updateTargetCoordAttribute();
        pushAttributes();
        if (this.mClearsOutput) {
            float[] fArr = this.mClearColor;
            GLES20.glClearColor(fArr[0], fArr[1], fArr[2], fArr[3]);
            GLES20.glClear(this.mClearBuffers);
        }
        if (this.mBlendEnabled) {
            GLES20.glEnable(3042);
            GLES20.glBlendFunc(this.mSFactor, this.mDFactor);
        } else {
            GLES20.glDisable(3042);
        }
        GLToolbox.checkGlError("Set render variables");
    }

    public void release() {
        int i = this.mProgram;
        if (i != 0 && GLES20.glIsProgram(i)) {
            GLES20.glDeleteProgram(this.mProgram);
        }
    }

    private void render() {
        Trace.beginSection("glDrawArrays");
        GLES20.glDrawArrays(this.mDrawMode, 0, this.mVertexCount);
        GLToolbox.checkGlError("glDrawArrays");
        Trace.endSection();
    }

    public static void renderTextureToTarget(TextureSource textureSource, RenderTarget renderTarget, int i, int i2) {
        RenderTarget.currentTarget().getIdentityShader().process(textureSource, renderTarget, i, i2);
    }

    private void scanUniforms() {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.mProgram, 35718, iArr, 0);
        int i = iArr[0];
        if (i > 0) {
            this.mUniforms = new HashMap(i);
            for (i = 0; i < iArr[0]; i++) {
                ProgramUniform programUniform = new ProgramUniform(this.mProgram, i);
                this.mUniforms.put(programUniform.getName(), programUniform);
            }
        }
    }

    public void setAttributeValues(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
        getProgramAttribute(str, true).set(z, i5, i4, i3, i2, i);
    }

    public void setAttributeValues(String str, float[] fArr, int i) {
        getProgramAttribute(str, true).set(false, i << 2, i, 5126, fArr);
    }

    public void setBaseTextureUnit(int i) {
        this.mBaseTexUnit = i;
    }

    public void setBlendEnabled(boolean z) {
        this.mBlendEnabled = z;
    }

    public void setBlendFunc(int i, int i2) {
        this.mSFactor = i;
        this.mDFactor = i2;
    }

    public void setClearBufferMask(int i) {
        this.mClearBuffers = i;
    }

    public void setClearColor(float[] fArr) {
        this.mClearColor = fArr;
    }

    public void setClearsOutput(boolean z) {
        this.mClearsOutput = z;
    }

    public void setDrawMode(int i) {
        this.mDrawMode = i;
    }

    public void setSourceCoords(float[] fArr) {
        int length = fArr.length;
        if (length != 8) {
            StringBuilder stringBuilder = new StringBuilder(77);
            stringBuilder.append("Expected 8 coordinates as source coordinates but got ");
            stringBuilder.append(length);
            stringBuilder.append(" coordinates!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.mSourceCoords = Arrays.copyOf(fArr, 8);
    }

    public void setSourceQuad(Quad quad) {
        setSourceCoords(new float[]{quad.topLeft().x, quad.topLeft().y, quad.topRight().x, quad.topRight().y, quad.bottomLeft().x, quad.bottomLeft().y, quad.bottomRight().x, quad.bottomRight().y});
    }

    public void setSourceRect(float f, float f2, float f3, float f4) {
        r0 = new float[8];
        float f5 = f + f3;
        r0[2] = f5;
        r0[3] = f2;
        r0[4] = f;
        float f6 = f2 + f4;
        r0[5] = f6;
        r0[6] = f5;
        r0[7] = f6;
        setSourceCoords(r0);
    }

    public void setSourceRect(RectF rectF) {
        setSourceRect(rectF.left, rectF.top, rectF.right - rectF.left, rectF.bottom - rectF.top);
    }

    public void setSourceTransform(float[] fArr) {
        if (fArr.length != 16) {
            throw new IllegalArgumentException("Expected 4x4 matrix for source transform!");
        }
        setSourceCoords(new float[]{fArr[12], fArr[13], fArr[0] + fArr[12], fArr[1] + fArr[13], fArr[4] + fArr[12], fArr[5] + fArr[13], (fArr[0] + fArr[4]) + fArr[12], (fArr[1] + fArr[5]) + fArr[13]});
    }

    public void setTargetCoords(float[] fArr) {
        int length = fArr.length;
        if (length != 8) {
            StringBuilder stringBuilder = new StringBuilder(77);
            stringBuilder.append("Expected 8 coordinates as target coordinates but got ");
            stringBuilder.append(length);
            stringBuilder.append(" coordinates!");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.mTargetCoords = new float[8];
        for (length = 0; length < 8; length++) {
            float[] fArr2 = this.mTargetCoords;
            float f = fArr[length];
            fArr2[length] = (f + f) - 4.0f;
        }
    }

    public void setTargetQuad(Quad quad) {
        setTargetCoords(new float[]{quad.topLeft().x, quad.topLeft().y, quad.topRight().x, quad.topRight().y, quad.bottomLeft().x, quad.bottomLeft().y, quad.bottomRight().x, quad.bottomRight().y});
    }

    public void setTargetRect(float f, float f2, float f3, float f4) {
        r0 = new float[8];
        float f5 = f + f3;
        r0[2] = f5;
        r0[3] = f2;
        r0[4] = f;
        float f6 = f2 + f4;
        r0[5] = f6;
        r0[6] = f5;
        r0[7] = f6;
        setTargetCoords(r0);
    }

    public void setTargetRect(RectF rectF) {
        setTargetCoords(new float[]{rectF.left, rectF.top, rectF.right, rectF.top, rectF.left, rectF.bottom, rectF.right, rectF.bottom});
    }

    public void setTargetTransform(float[] fArr) {
        if (fArr.length != 16) {
            throw new IllegalArgumentException("Expected 4x4 matrix for target transform!");
        }
        setTargetCoords(new float[]{fArr[12], fArr[13], fArr[0] + fArr[12], fArr[1] + fArr[13], fArr[4] + fArr[12], fArr[5] + fArr[13], (fArr[0] + fArr[4]) + fArr[12], (fArr[1] + fArr[5]) + fArr[13]});
    }

    @TargetApi(23)
    public void setUniformUnsignedIntValue(String str, int i) {
        useProgram();
        GLES31.glUniform1ui(getUniformLocation(str), i);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 20);
        stringBuilder.append("Set uniform value (");
        stringBuilder.append(str);
        stringBuilder.append(")");
        GLToolbox.checkGlError(stringBuilder.toString());
    }

    public void setUniformValue(String str, float f) {
        useProgram();
        GLES20.glUniform1f(getUniformLocation(str), f);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 20);
        stringBuilder.append("Set uniform value (");
        stringBuilder.append(str);
        stringBuilder.append(")");
        GLToolbox.checkGlError(stringBuilder.toString());
    }

    public void setUniformValue(String str, int i) {
        useProgram();
        GLES20.glUniform1i(getUniformLocation(str), i);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 20);
        stringBuilder.append("Set uniform value (");
        stringBuilder.append(str);
        stringBuilder.append(")");
        GLToolbox.checkGlError(stringBuilder.toString());
    }

    public void setUniformValue(String str, float[] fArr) {
        ProgramUniform programUniform = getProgramUniform(str, true);
        useProgram();
        int length = fArr.length;
        switch (programUniform.getType()) {
            case 5126:
                checkUniformAssignment(programUniform, length, 1);
                GLES20.glUniform1fv(programUniform.getLocation(), length, fArr, 0);
                break;
            case 35664:
                checkUniformAssignment(programUniform, length, 2);
                GLES20.glUniform2fv(programUniform.getLocation(), length >> 1, fArr, 0);
                break;
            case 35665:
                checkUniformAssignment(programUniform, length, 3);
                GLES20.glUniform3fv(programUniform.getLocation(), length / 3, fArr, 0);
                break;
            case 35666:
                checkUniformAssignment(programUniform, length, 4);
                GLES20.glUniform4fv(programUniform.getLocation(), length >> 2, fArr, 0);
                break;
            case 35674:
                checkUniformAssignment(programUniform, length, 4);
                GLES20.glUniformMatrix2fv(programUniform.getLocation(), length >> 2, false, fArr, 0);
                break;
            case 35675:
                checkUniformAssignment(programUniform, length, 9);
                GLES20.glUniformMatrix3fv(programUniform.getLocation(), length / 9, false, fArr, 0);
                break;
            case 35676:
                checkUniformAssignment(programUniform, length, 16);
                GLES20.glUniformMatrix4fv(programUniform.getLocation(), length >> 4, false, fArr, 0);
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 70);
                stringBuilder.append("Cannot assign float-array to incompatible uniform type for uniform '");
                stringBuilder.append(str);
                stringBuilder.append("'!");
                throw new RuntimeException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 20);
        stringBuilder2.append("Set uniform value (");
        stringBuilder2.append(str);
        stringBuilder2.append(")");
        GLToolbox.checkGlError(stringBuilder2.toString());
    }

    public void setUniformValue(String str, int[] iArr) {
        ProgramUniform programUniform = getProgramUniform(str, true);
        useProgram();
        int length = iArr.length;
        switch (programUniform.getType()) {
            case 5124:
                checkUniformAssignment(programUniform, length, 1);
                GLES20.glUniform1iv(programUniform.getLocation(), length, iArr, 0);
                break;
            case 35667:
                checkUniformAssignment(programUniform, length, 2);
                GLES20.glUniform2iv(programUniform.getLocation(), length >> 1, iArr, 0);
                break;
            case 35668:
                checkUniformAssignment(programUniform, length, 3);
                GLES20.glUniform2iv(programUniform.getLocation(), length / 3, iArr, 0);
                break;
            case 35669:
                checkUniformAssignment(programUniform, length, 4);
                GLES20.glUniform2iv(programUniform.getLocation(), length >> 2, iArr, 0);
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 68);
                stringBuilder.append("Cannot assign int-array to incompatible uniform type for uniform '");
                stringBuilder.append(str);
                stringBuilder.append("'!");
                throw new RuntimeException(stringBuilder.toString());
        }
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 20);
        stringBuilder2.append("Set uniform value (");
        stringBuilder2.append(str);
        stringBuilder2.append(")");
        GLToolbox.checkGlError(stringBuilder2.toString());
    }

    public void setVertexCount(int i) {
        this.mVertexCount = i;
    }

    private static int strlen(byte[] bArr) {
        int i = 0;
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == (byte) 0) {
                return i;
            }
            i++;
        }
    }

    public String texCoordAttributeName() {
        return "a_texcoord";
    }

    private void updateSourceCoordAttribute() {
        VertexAttribute programAttribute = getProgramAttribute(texCoordAttributeName(), false);
        float[] fArr = this.mSourceCoords;
        if (!(fArr == null || programAttribute == null)) {
            programAttribute.set(false, 8, 2, 5126, fArr);
        }
        this.mSourceCoords = null;
    }

    private void updateTargetCoordAttribute() {
        VertexAttribute programAttribute = getProgramAttribute(positionAttributeName(), false);
        float[] fArr = this.mTargetCoords;
        if (!(fArr == null || programAttribute == null)) {
            programAttribute.set(false, 8, 2, 5126, fArr);
        }
        this.mTargetCoords = null;
    }

    private void useProgram() {
        GLES20.glUseProgram(this.mProgram);
        int i = this.mProgram;
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("glUseProgram ");
        stringBuilder.append(i);
        GLToolbox.checkGlError(stringBuilder.toString());
    }
}
