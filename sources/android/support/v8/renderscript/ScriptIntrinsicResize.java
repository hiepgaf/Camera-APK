package android.support.v8.renderscript;

import android.support.v8.renderscript.Script.FieldID;
import android.support.v8.renderscript.Script.KernelID;
import android.support.v8.renderscript.Script.LaunchOptions;

/* compiled from: PG */
public class ScriptIntrinsicResize extends ScriptIntrinsic {
    public static final int INTRINSIC_API_LEVEL = 21;
    public Allocation mInput;

    protected ScriptIntrinsicResize(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static ScriptIntrinsicResize create(RenderScript renderScript) {
        renderScript.isUseNative();
        ScriptIntrinsicResize scriptIntrinsicResize = new ScriptIntrinsicResize(renderScript.nScriptIntrinsicCreate(12, 0, false), renderScript);
        scriptIntrinsicResize.setIncSupp(false);
        return scriptIntrinsicResize;
    }

    public void forEach_bicubic(Allocation allocation) {
        if (allocation == this.mInput) {
            throw new RSIllegalArgumentException("Output cannot be same as Input.");
        }
        forEach_bicubic(allocation, null);
    }

    public void forEach_bicubic(Allocation allocation, LaunchOptions launchOptions) {
        forEach(0, null, allocation, null, launchOptions);
    }

    public FieldID getFieldID_Input() {
        return createFieldID(0, null);
    }

    public KernelID getKernelID_bicubic() {
        return createKernelID(0, 2, null, null);
    }

    public void setInput(Allocation allocation) {
        Element element = allocation.getElement();
        if (element.isCompatible(Element.U8(this.mRS)) || element.isCompatible(Element.U8_2(this.mRS)) || element.isCompatible(Element.U8_3(this.mRS)) || element.isCompatible(Element.U8_4(this.mRS)) || element.isCompatible(Element.F32(this.mRS)) || element.isCompatible(Element.F32_2(this.mRS)) || element.isCompatible(Element.F32_3(this.mRS)) || element.isCompatible(Element.F32_4(this.mRS))) {
            this.mInput = allocation;
            setVar(0, (BaseObj) allocation);
            return;
        }
        throw new RSIllegalArgumentException("Unsuported element type.");
    }
}
