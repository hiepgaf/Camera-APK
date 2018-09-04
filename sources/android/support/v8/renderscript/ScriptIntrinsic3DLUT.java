package android.support.v8.renderscript;

import android.support.v8.renderscript.Script.KernelID;

/* compiled from: PG */
public class ScriptIntrinsic3DLUT extends ScriptIntrinsic {
    public static final int INTRINSIC_API_LEVEL = 19;
    public Element mElement;
    public Allocation mLUT;

    protected ScriptIntrinsic3DLUT(long j, RenderScript renderScript, Element element) {
        super(j, renderScript);
        this.mElement = element;
    }

    public static ScriptIntrinsic3DLUT create(RenderScript renderScript, Element element) {
        if (element.isCompatible(Element.U8_4(renderScript))) {
            renderScript.isUseNative();
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = new ScriptIntrinsic3DLUT(renderScript.nScriptIntrinsicCreate(8, element.getID(renderScript), false), renderScript, element);
            scriptIntrinsic3DLUT.setIncSupp(false);
            return scriptIntrinsic3DLUT;
        }
        throw new RSIllegalArgumentException("Element must be compatible with uchar4.");
    }

    public void forEach(Allocation allocation, Allocation allocation2) {
        forEach(0, allocation, allocation2, null);
    }

    public KernelID getKernelID() {
        return createKernelID(0, 3, null, null);
    }

    public void setLUT(Allocation allocation) {
        Type type = allocation.getType();
        if (type.getZ() == 0) {
            throw new RSIllegalArgumentException("LUT must be 3d.");
        } else if (type.getElement().isCompatible(this.mElement)) {
            this.mLUT = allocation;
            setVar(0, this.mLUT);
        } else {
            throw new RSIllegalArgumentException("LUT element type must match.");
        }
    }
}
