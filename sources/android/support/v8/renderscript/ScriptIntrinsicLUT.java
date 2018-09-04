package android.support.v8.renderscript;

import android.support.v8.renderscript.Script.KernelID;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;

/* compiled from: PG */
public class ScriptIntrinsicLUT extends ScriptIntrinsic {
    public static final int INTRINSIC_API_LEVEL = 19;
    public final byte[] mCache = new byte[1024];
    public boolean mDirty = true;
    public final Matrix4f mMatrix = new Matrix4f();
    public Allocation mTables;

    protected ScriptIntrinsicLUT(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static ScriptIntrinsicLUT create(RenderScript renderScript, Element element) {
        renderScript.isUseNative();
        ScriptIntrinsicLUT scriptIntrinsicLUT = new ScriptIntrinsicLUT(renderScript.nScriptIntrinsicCreate(3, element.getID(renderScript), false), renderScript);
        scriptIntrinsicLUT.setIncSupp(false);
        scriptIntrinsicLUT.mTables = Allocation.createSized(renderScript, Element.U8(renderScript), 1024);
        for (int i = 0; i < 256; i++) {
            byte[] bArr = scriptIntrinsicLUT.mCache;
            byte b = (byte) i;
            bArr[i] = b;
            bArr[i + 256] = b;
            bArr[i + 512] = b;
            bArr[i + 768] = b;
        }
        scriptIntrinsicLUT.setVar(0, scriptIntrinsicLUT.mTables);
        return scriptIntrinsicLUT;
    }

    public void forEach(Allocation allocation, Allocation allocation2) {
        if (this.mDirty) {
            this.mDirty = false;
            this.mTables.copyFromUnchecked(this.mCache);
        }
        forEach(0, allocation, allocation2, null);
    }

    public KernelID getKernelID() {
        return createKernelID(0, 3, null, null);
    }

    public void setAlpha(int i, int i2) {
        validate(i, i2);
        this.mCache[i + 768] = (byte) i2;
        this.mDirty = true;
    }

    public void setBlue(int i, int i2) {
        validate(i, i2);
        this.mCache[i + 512] = (byte) i2;
        this.mDirty = true;
    }

    public void setGreen(int i, int i2) {
        validate(i, i2);
        this.mCache[i + 256] = (byte) i2;
        this.mDirty = true;
    }

    public void setRed(int i, int i2) {
        validate(i, i2);
        this.mCache[i] = (byte) i2;
        this.mDirty = true;
    }

    private void validate(int i, int i2) {
        if (i < 0 || i > Illuminant.kOther) {
            throw new RSIllegalArgumentException("Index out of range (0-255).");
        } else if (i2 < 0 || i2 > Illuminant.kOther) {
            throw new RSIllegalArgumentException("Value out of range (0-255).");
        }
    }
}
