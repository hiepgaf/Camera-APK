package android.support.v8.renderscript;

import android.support.v8.renderscript.Script.FieldID;
import android.support.v8.renderscript.Script.KernelID;

/* compiled from: PG */
public class ScriptIntrinsicYuvToRGB extends ScriptIntrinsic {
    public static final int INTRINSIC_API_LEVEL = 19;
    public Allocation mInput;

    ScriptIntrinsicYuvToRGB(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static ScriptIntrinsicYuvToRGB create(RenderScript renderScript, Element element) {
        renderScript.isUseNative();
        ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB = new ScriptIntrinsicYuvToRGB(renderScript.nScriptIntrinsicCreate(6, element.getID(renderScript), false), renderScript);
        scriptIntrinsicYuvToRGB.setIncSupp(false);
        return scriptIntrinsicYuvToRGB;
    }

    public void forEach(Allocation allocation) {
        forEach(0, null, allocation, null);
    }

    public FieldID getFieldID_Input() {
        return createFieldID(0, null);
    }

    public KernelID getKernelID() {
        return createKernelID(0, 2, null, null);
    }

    public void setInput(Allocation allocation) {
        this.mInput = allocation;
        setVar(0, (BaseObj) allocation);
    }
}
