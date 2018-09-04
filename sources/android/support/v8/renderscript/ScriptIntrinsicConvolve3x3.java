package android.support.v8.renderscript;

import android.support.v8.renderscript.Script.FieldID;
import android.support.v8.renderscript.Script.KernelID;
import android.support.v8.renderscript.Script.LaunchOptions;

/* compiled from: PG */
public class ScriptIntrinsicConvolve3x3 extends ScriptIntrinsic {
    public static final int INTRINSIC_API_LEVEL = 19;
    public Allocation mInput;
    public final float[] mValues = new float[9];

    ScriptIntrinsicConvolve3x3(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static ScriptIntrinsicConvolve3x3 create(RenderScript renderScript, Element element) {
        float[] fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        if (element.isCompatible(Element.U8(renderScript)) || element.isCompatible(Element.U8_2(renderScript)) || element.isCompatible(Element.U8_3(renderScript)) || element.isCompatible(Element.U8_4(renderScript)) || element.isCompatible(Element.F32(renderScript)) || element.isCompatible(Element.F32_2(renderScript)) || element.isCompatible(Element.F32_3(renderScript)) || element.isCompatible(Element.F32_4(renderScript))) {
            renderScript.isUseNative();
            ScriptIntrinsicConvolve3x3 scriptIntrinsicConvolve3x3 = new ScriptIntrinsicConvolve3x3(renderScript.nScriptIntrinsicCreate(1, element.getID(renderScript), false), renderScript);
            scriptIntrinsicConvolve3x3.setIncSupp(false);
            scriptIntrinsicConvolve3x3.setCoefficients(fArr);
            return scriptIntrinsicConvolve3x3;
        }
        throw new RSIllegalArgumentException("Unsuported element type.");
    }

    public void forEach(Allocation allocation) {
        forEach(0, null, allocation, null);
    }

    public void forEach(Allocation allocation, LaunchOptions launchOptions) {
        forEach(0, null, allocation, null, launchOptions);
    }

    public FieldID getFieldID_Input() {
        return createFieldID(1, null);
    }

    public KernelID getKernelID() {
        return createKernelID(0, 2, null, null);
    }

    public void setCoefficients(float[] fArr) {
        FieldPacker fieldPacker = new FieldPacker(36);
        int i = 0;
        while (true) {
            float[] fArr2 = this.mValues;
            if (i < fArr2.length) {
                fArr2[i] = fArr[i];
                fieldPacker.addF32(fArr2[i]);
                i++;
            } else {
                setVar(0, fieldPacker);
                return;
            }
        }
    }

    public void setInput(Allocation allocation) {
        this.mInput = allocation;
        setVar(1, (BaseObj) allocation);
    }
}
