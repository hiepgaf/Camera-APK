package android.support.v8.renderscript;

import android.util.SparseArray;

/* compiled from: PG */
public class Script extends BaseObj {
    public final SparseArray mFIDs = new SparseArray();
    public final SparseArray mIIDs = new SparseArray();
    public final SparseArray mKIDs = new SparseArray();
    public boolean mUseIncSupp = false;

    /* compiled from: PG */
    public class Builder {
        public RenderScript mRS;

        Builder(RenderScript renderScript) {
            this.mRS = renderScript;
        }
    }

    /* compiled from: PG */
    public class FieldBase {
        public Allocation mAllocation;
        public Element mElement;

        public Allocation getAllocation() {
            return this.mAllocation;
        }

        public Element getElement() {
            return this.mElement;
        }

        public Type getType() {
            return this.mAllocation.getType();
        }

        public void init(RenderScript renderScript, int i) {
            this.mAllocation = Allocation.createSized(renderScript, this.mElement, i, 1);
        }

        protected void init(RenderScript renderScript, int i, int i2) {
            this.mAllocation = Allocation.createSized(renderScript, this.mElement, i, i2 | 1);
        }

        public void updateAllocation() {
        }
    }

    /* compiled from: PG */
    public final class LaunchOptions {
        public int strategy;
        public int xend = 0;
        public int xstart = 0;
        public int yend = 0;
        public int ystart = 0;
        public int zend = 0;
        public int zstart = 0;

        public final int getXEnd() {
            return this.xend;
        }

        public final int getXStart() {
            return this.xstart;
        }

        public final int getYEnd() {
            return this.yend;
        }

        public final int getYStart() {
            return this.ystart;
        }

        public final int getZEnd() {
            return this.zend;
        }

        public final int getZStart() {
            return this.zstart;
        }

        public final LaunchOptions setX(int i, int i2) {
            if (i < 0 || i2 <= i) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.xstart = i;
            this.xend = i2;
            return this;
        }

        public final LaunchOptions setY(int i, int i2) {
            if (i < 0 || i2 <= i) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.ystart = i;
            this.yend = i2;
            return this;
        }

        public final LaunchOptions setZ(int i, int i2) {
            if (i < 0 || i2 <= i) {
                throw new RSIllegalArgumentException("Invalid dimensions");
            }
            this.zstart = i;
            this.zend = i2;
            return this;
        }
    }

    /* compiled from: PG */
    public final class FieldID extends BaseObj {
        public android.renderscript.Script.FieldID mN;
        public Script mScript;
        public int mSlot;

        FieldID(long j, RenderScript renderScript, Script script, int i) {
            super(j, renderScript);
            this.mScript = script;
            this.mSlot = i;
        }
    }

    /* compiled from: PG */
    public final class InvokeID extends BaseObj {
        public Script mScript;
        public int mSlot;

        InvokeID(long j, RenderScript renderScript, Script script, int i) {
            super(j, renderScript);
            this.mScript = script;
            this.mSlot = i;
        }
    }

    /* compiled from: PG */
    public final class KernelID extends BaseObj {
        public android.renderscript.Script.KernelID mN;
        public Script mScript;
        public int mSig;
        public int mSlot;

        KernelID(long j, RenderScript renderScript, Script script, int i, int i2) {
            super(j, renderScript);
            this.mScript = script;
            this.mSlot = i;
            this.mSig = i2;
        }
    }

    Script(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public void bindAllocation(Allocation allocation, int i) {
        this.mRS.validate();
        if (allocation != null) {
            this.mRS.nScriptBindAllocation(getID(this.mRS), allocation.getID(this.mRS), i, this.mUseIncSupp);
            return;
        }
        this.mRS.nScriptBindAllocation(getID(this.mRS), 0, i, this.mUseIncSupp);
    }

    protected FieldID createFieldID(int i, Element element) {
        FieldID fieldID = (FieldID) this.mFIDs.get(i);
        if (fieldID != null) {
            return fieldID;
        }
        long nScriptFieldIDCreate = this.mRS.nScriptFieldIDCreate(getID(this.mRS), i, this.mUseIncSupp);
        if (nScriptFieldIDCreate == 0) {
            throw new RSDriverException("Failed to create FieldID");
        }
        FieldID fieldID2 = new FieldID(nScriptFieldIDCreate, this.mRS, this, i);
        this.mFIDs.put(i, fieldID2);
        return fieldID2;
    }

    protected InvokeID createInvokeID(int i) {
        InvokeID invokeID = (InvokeID) this.mIIDs.get(i);
        if (invokeID != null) {
            return invokeID;
        }
        long nScriptInvokeIDCreate = this.mRS.nScriptInvokeIDCreate(getID(this.mRS), i);
        if (nScriptInvokeIDCreate == 0) {
            throw new RSDriverException("Failed to create KernelID");
        }
        InvokeID invokeID2 = new InvokeID(nScriptInvokeIDCreate, this.mRS, this, i);
        this.mIIDs.put(i, invokeID2);
        return invokeID2;
    }

    protected KernelID createKernelID(int i, int i2, Element element, Element element2) {
        KernelID kernelID = (KernelID) this.mKIDs.get(i);
        if (kernelID != null) {
            return kernelID;
        }
        long nScriptKernelIDCreate = this.mRS.nScriptKernelIDCreate(getID(this.mRS), i, i2, this.mUseIncSupp);
        if (nScriptKernelIDCreate == 0) {
            throw new RSDriverException("Failed to create KernelID");
        }
        KernelID kernelID2 = new KernelID(nScriptKernelIDCreate, this.mRS, this, i, i2);
        this.mKIDs.put(i, kernelID2);
        return kernelID2;
    }

    protected void forEach(int i, Allocation allocation, Allocation allocation2, FieldPacker fieldPacker) {
        long j = 0;
        if (allocation == null && allocation2 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        long id;
        byte[] data;
        if (allocation != null) {
            id = allocation.getID(this.mRS);
        } else {
            id = 0;
        }
        if (allocation2 != null) {
            j = allocation2.getID(this.mRS);
        }
        if (fieldPacker != null) {
            data = fieldPacker.getData();
        } else {
            data = null;
        }
        if (this.mUseIncSupp) {
            int i2 = i;
            this.mRS.nScriptForEach(getID(this.mRS), i2, getDummyAlloc(allocation), getDummyAlloc(allocation2), data, this.mUseIncSupp);
            return;
        }
        this.mRS.nScriptForEach(getID(this.mRS), i, id, j, data, this.mUseIncSupp);
    }

    public void forEach(int i, Allocation allocation, Allocation allocation2, FieldPacker fieldPacker, LaunchOptions launchOptions) {
        if (allocation == null && allocation2 == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        } else if (launchOptions == null) {
            forEach(i, allocation, allocation2, fieldPacker);
        } else {
            long id;
            long id2;
            byte[] data;
            if (allocation != null) {
                id = allocation.getID(this.mRS);
            } else {
                id = 0;
            }
            if (allocation2 != null) {
                id2 = allocation2.getID(this.mRS);
            } else {
                id2 = 0;
            }
            if (fieldPacker != null) {
                data = fieldPacker.getData();
            } else {
                data = null;
            }
            int i2;
            if (this.mUseIncSupp) {
                id = getDummyAlloc(allocation);
                id2 = getDummyAlloc(allocation2);
                i2 = i;
                this.mRS.nScriptForEachClipped(getID(this.mRS), i2, id, id2, data, launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend, this.mUseIncSupp);
                return;
            }
            i2 = i;
            this.mRS.nScriptForEachClipped(getID(this.mRS), i2, id, id2, data, launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend, this.mUseIncSupp);
        }
    }

    protected void forEach(int i, Allocation[] allocationArr, Allocation allocation, FieldPacker fieldPacker) {
        forEach(i, allocationArr, allocation, fieldPacker, null);
    }

    protected void forEach(int i, Allocation[] allocationArr, Allocation allocation, FieldPacker fieldPacker, LaunchOptions launchOptions) {
        int i2;
        int[] iArr = null;
        this.mRS.validate();
        if (allocationArr != null) {
            for (BaseObj validateObject : allocationArr) {
                this.mRS.validateObject(validateObject);
            }
        }
        this.mRS.validateObject(allocation);
        if (allocationArr == null && allocation == null) {
            throw new RSIllegalArgumentException("At least one of ain or aout is required to be non-null.");
        }
        long[] jArr;
        long id;
        byte[] data;
        if (allocationArr != null) {
            jArr = new long[allocationArr.length];
            for (i2 = 0; i2 < allocationArr.length; i2++) {
                jArr[i2] = allocationArr[i2].getID(this.mRS);
            }
        } else {
            jArr = null;
        }
        if (allocation != null) {
            id = allocation.getID(this.mRS);
        } else {
            id = 0;
        }
        if (fieldPacker != null) {
            data = fieldPacker.getData();
        } else {
            data = null;
        }
        if (launchOptions != null) {
            iArr = new int[]{launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend};
        }
        this.mRS.nScriptForEach(getID(this.mRS), i, jArr, id, data, iArr);
    }

    long getDummyAlloc(Allocation allocation) {
        if (allocation == null) {
            return 0;
        }
        Type type = allocation.getType();
        long nIncAllocationCreateTyped = this.mRS.nIncAllocationCreateTyped(allocation.getID(this.mRS), type.getDummyType(this.mRS, type.getElement().getDummyElement(this.mRS)), type.getX() * type.getElement().getBytesSize());
        allocation.setIncAllocID(nIncAllocationCreateTyped);
        return nIncAllocationCreateTyped;
    }

    protected void invoke(int i) {
        this.mRS.nScriptInvoke(getID(this.mRS), i, this.mUseIncSupp);
    }

    public void invoke(int i, FieldPacker fieldPacker) {
        if (fieldPacker != null) {
            this.mRS.nScriptInvokeV(getID(this.mRS), i, fieldPacker.getData(), this.mUseIncSupp);
            return;
        }
        this.mRS.nScriptInvoke(getID(this.mRS), i, this.mUseIncSupp);
    }

    protected boolean isIncSupp() {
        return this.mUseIncSupp;
    }

    protected void reduce(int i, Allocation[] allocationArr, Allocation allocation, LaunchOptions launchOptions) {
        this.mRS.validate();
        if (allocationArr != null) {
            if (r2 > 0) {
                if (allocation != null) {
                    int i2;
                    for (BaseObj validateObject : allocationArr) {
                        this.mRS.validateObject(validateObject);
                    }
                    long[] jArr = new long[allocationArr.length];
                    for (i2 = 0; i2 < allocationArr.length; i2++) {
                        jArr[i2] = allocationArr[i2].getID(this.mRS);
                    }
                    this.mRS.nScriptReduce(getID(this.mRS), i, jArr, allocation.getID(this.mRS), launchOptions != null ? new int[]{launchOptions.xstart, launchOptions.xend, launchOptions.ystart, launchOptions.yend, launchOptions.zstart, launchOptions.zend} : null);
                    return;
                }
                throw new RSIllegalArgumentException("aout is required to be non-null.");
            }
        }
        throw new RSIllegalArgumentException("At least one input is required.");
    }

    protected void setIncSupp(boolean z) {
        this.mUseIncSupp = z;
    }

    public void setTimeZone(String str) {
        this.mRS.validate();
        try {
            this.mRS.nScriptSetTimeZone(getID(this.mRS), str.getBytes("UTF-8"), this.mUseIncSupp);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setVar(int i, double d) {
        this.mRS.nScriptSetVarD(getID(this.mRS), i, d, this.mUseIncSupp);
    }

    public void setVar(int i, float f) {
        this.mRS.nScriptSetVarF(getID(this.mRS), i, f, this.mUseIncSupp);
    }

    public void setVar(int i, int i2) {
        this.mRS.nScriptSetVarI(getID(this.mRS), i, i2, this.mUseIncSupp);
    }

    public void setVar(int i, long j) {
        this.mRS.nScriptSetVarJ(getID(this.mRS), i, j, this.mUseIncSupp);
    }

    public void setVar(int i, BaseObj baseObj) {
        long j = 0;
        if (this.mUseIncSupp) {
            long dummyAlloc = getDummyAlloc((Allocation) baseObj);
            RenderScript renderScript = this.mRS;
            long id = getID(this.mRS);
            if (baseObj != null) {
                j = dummyAlloc;
            }
            renderScript.nScriptSetVarObj(id, i, j, this.mUseIncSupp);
            return;
        }
        renderScript = this.mRS;
        id = getID(this.mRS);
        if (baseObj != null) {
            j = baseObj.getID(this.mRS);
        }
        renderScript.nScriptSetVarObj(id, i, j, this.mUseIncSupp);
    }

    public void setVar(int i, FieldPacker fieldPacker) {
        this.mRS.nScriptSetVarV(getID(this.mRS), i, fieldPacker.getData(), this.mUseIncSupp);
    }

    public void setVar(int i, FieldPacker fieldPacker, Element element, int[] iArr) {
        if (this.mUseIncSupp) {
            int i2 = i;
            this.mRS.nScriptSetVarVE(getID(this.mRS), i2, fieldPacker.getData(), element.getDummyElement(this.mRS), iArr, this.mUseIncSupp);
            return;
        }
        this.mRS.nScriptSetVarVE(getID(this.mRS), i, fieldPacker.getData(), element.getID(this.mRS), iArr, this.mUseIncSupp);
    }

    public void setVar(int i, boolean z) {
        this.mRS.nScriptSetVarI(getID(this.mRS), i, z, this.mUseIncSupp);
    }
}
