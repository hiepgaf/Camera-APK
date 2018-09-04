package android.support.v8.renderscript;

import android.support.v8.renderscript.Allocation.MipmapControl;
import android.support.v8.renderscript.Script.FieldID;
import android.support.v8.renderscript.Script.InvokeID;
import android.support.v8.renderscript.Script.KernelID;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
public final class ScriptGroup extends BaseObj {
    public static final int MIN_API_VERSION = 23;
    public static final String TAG = "ScriptGroup";
    public List mClosures;
    public IO[] mInputs;
    public List mInputs2;
    public String mName;
    public ArrayList mNodes = new ArrayList();
    public IO[] mOutputs;
    public Future[] mOutputs2;
    public boolean mUseIncSupp = false;

    /* compiled from: PG */
    public final class Binding {
        public final FieldID mField;
        public final Object mValue;

        public Binding(FieldID fieldID, Object obj) {
            this.mField = fieldID;
            this.mValue = obj;
        }

        public final FieldID getField() {
            return this.mField;
        }

        public final Object getValue() {
            return this.mValue;
        }
    }

    /* compiled from: PG */
    public final class Builder2 {
        public static final String TAG = "ScriptGroup.Builder2";
        public List mClosures = new ArrayList();
        public List mInputs = new ArrayList();
        public RenderScript mRS;

        public Builder2(RenderScript renderScript) {
            this.mRS = renderScript;
        }

        public final Input addInput() {
            Input input = new Input();
            this.mInputs.add(input);
            return input;
        }

        public final Closure addInvoke(InvokeID invokeID, Object... objArr) {
            ArrayList arrayList = new ArrayList();
            Map hashMap = new HashMap();
            if (seperateArgsAndBindings(objArr, arrayList, hashMap)) {
                return addInvokeInternal(invokeID, arrayList.toArray(), hashMap);
            }
            return null;
        }

        private final Closure addInvokeInternal(InvokeID invokeID, Object[] objArr, Map map) {
            Closure closure = new Closure(this.mRS, invokeID, objArr, map);
            this.mClosures.add(closure);
            return closure;
        }

        public final Closure addKernel(KernelID kernelID, Type type, Object... objArr) {
            ArrayList arrayList = new ArrayList();
            Map hashMap = new HashMap();
            if (seperateArgsAndBindings(objArr, arrayList, hashMap)) {
                return addKernelInternal(kernelID, type, arrayList.toArray(), hashMap);
            }
            return null;
        }

        private final Closure addKernelInternal(KernelID kernelID, Type type, Object[] objArr, Map map) {
            Closure closure = new Closure(this.mRS, kernelID, type, objArr, map);
            this.mClosures.add(closure);
            return closure;
        }

        public final ScriptGroup create(String str, Future... futureArr) {
            if (str == null || str.isEmpty() || str.length() > 100 || !str.equals(str.replaceAll("[^a-zA-Z0-9-]", "_"))) {
                throw new RSIllegalArgumentException("invalid script group name");
            }
            return new ScriptGroup(this.mRS, str, this.mClosures, this.mInputs, futureArr);
        }

        private final boolean seperateArgsAndBindings(Object[] objArr, ArrayList arrayList, Map map) {
            int i;
            int i2 = 0;
            while (i2 < objArr.length) {
                Object obj = objArr[i2];
                if (obj instanceof Binding) {
                    i = i2;
                    break;
                }
                arrayList.add(obj);
                i2++;
            }
            i = i2;
            while (i < objArr.length) {
                Object obj2 = objArr[i];
                if (!(obj2 instanceof Binding)) {
                    return false;
                }
                Binding binding = (Binding) obj2;
                map.put(binding.getField(), binding.getValue());
                i++;
            }
            return true;
        }
    }

    @Deprecated
    /* compiled from: PG */
    public final class Builder {
        public int mKernelCount;
        public ArrayList mLines = new ArrayList();
        public ArrayList mNodes = new ArrayList();
        public RenderScript mRS;
        public boolean mUseIncSupp = false;

        /* compiled from: PG */
        /* renamed from: android.support.v8.renderscript.ScriptGroup$Builder$1 */
        class C00311 implements Comparator {
            C00311() {
            }

            public int compare(Node node, Node node2) {
                return node.mOrder - node2.mOrder;
            }
        }

        public Builder(RenderScript renderScript) {
            this.mRS = renderScript;
        }

        public final Builder addConnection(Type type, KernelID kernelID, FieldID fieldID) {
            Node findNode = findNode(kernelID);
            if (findNode == null) {
                throw new RSInvalidStateException("From script not found.");
            }
            Node findNode2 = findNode(fieldID.mScript);
            if (findNode2 == null) {
                throw new RSInvalidStateException("To script not found.");
            }
            ConnectLine connectLine = new ConnectLine(type, kernelID, fieldID);
            this.mLines.add(new ConnectLine(type, kernelID, fieldID));
            findNode.mOutputs.add(connectLine);
            findNode2.mInputs.add(connectLine);
            validateCycle(findNode, findNode);
            return this;
        }

        public final Builder addConnection(Type type, KernelID kernelID, KernelID kernelID2) {
            Node findNode = findNode(kernelID);
            if (findNode == null) {
                throw new RSInvalidStateException("From script not found.");
            }
            Node findNode2 = findNode(kernelID2);
            if (findNode2 == null) {
                throw new RSInvalidStateException("To script not found.");
            }
            ConnectLine connectLine = new ConnectLine(type, kernelID, kernelID2);
            this.mLines.add(new ConnectLine(type, kernelID, kernelID2));
            findNode.mOutputs.add(connectLine);
            findNode2.mInputs.add(connectLine);
            validateCycle(findNode, findNode);
            return this;
        }

        public final Builder addKernel(KernelID kernelID) {
            if (this.mLines.size() != 0) {
                throw new RSInvalidStateException("Kernels may not be added once connections exist.");
            }
            if (kernelID.mScript.isIncSupp()) {
                this.mUseIncSupp = true;
            }
            if (findNode(kernelID) == null) {
                this.mKernelCount++;
                Node findNode = findNode(kernelID.mScript);
                if (findNode == null) {
                    findNode = new Node(kernelID.mScript);
                    this.mNodes.add(findNode);
                }
                findNode.mKernels.add(kernelID);
            }
            return this;
        }

        private final boolean calcOrder() {
            ArrayList arrayList = this.mNodes;
            int size = arrayList.size();
            int i = 0;
            boolean z = true;
            while (i < size) {
                int i2 = i + 1;
                Node node = (Node) arrayList.get(i);
                if (node.mInputs.size() == 0) {
                    ArrayList arrayList2 = this.mNodes;
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        int i4 = i3 + 1;
                        ((Node) arrayList2.get(i3)).mSeen = false;
                        i3 = i4;
                    }
                    z = calcOrderRecurse(node, 1) & z;
                    i = i2;
                } else {
                    i = i2;
                }
            }
            Collections.sort(this.mNodes, new C00311());
            return z;
        }

        private final boolean calcOrderRecurse(Node node, int i) {
            boolean z = true;
            node.mSeen = true;
            if (node.mOrder < i) {
                node.mOrder = i;
            }
            ArrayList arrayList = node.mOutputs;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Node findNode;
                int i3 = i2 + 1;
                ConnectLine connectLine = (ConnectLine) arrayList.get(i2);
                FieldID fieldID = connectLine.mToF;
                if (fieldID != null) {
                    findNode = findNode(fieldID.mScript);
                } else {
                    findNode = findNode(connectLine.mToK.mScript);
                }
                if (findNode.mSeen) {
                    return false;
                }
                z &= calcOrderRecurse(findNode, node.mOrder + 1);
                i2 = i3;
            }
            return z;
        }

        public final ScriptGroup create() {
            if (this.mNodes.size() != 0) {
                int i;
                int i2;
                for (i = 0; i < this.mNodes.size(); i++) {
                    ((Node) this.mNodes.get(i)).dagNumber = 0;
                }
                validateDAG();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long[] jArr = new long[this.mKernelCount];
                int i3 = 0;
                int i4 = 0;
                while (i4 < this.mNodes.size()) {
                    Node node = (Node) this.mNodes.get(i4);
                    int i5 = 0;
                    int i6 = i3;
                    while (i5 < node.mKernels.size()) {
                        int i7;
                        KernelID kernelID = (KernelID) node.mKernels.get(i5);
                        i2 = i6 + 1;
                        jArr[i6] = kernelID.getID(this.mRS);
                        Object obj = null;
                        for (i7 = 0; i7 < node.mInputs.size(); i7++) {
                            if (((ConnectLine) node.mInputs.get(i7)).mToK == kernelID) {
                                obj = 1;
                            }
                        }
                        Object obj2 = null;
                        for (i7 = 0; i7 < node.mOutputs.size(); i7++) {
                            if (((ConnectLine) node.mOutputs.get(i7)).mFrom == kernelID) {
                                obj2 = 1;
                            }
                        }
                        if (obj == null) {
                            arrayList.add(new IO(kernelID));
                        }
                        if (obj2 == null) {
                            arrayList2.add(new IO(kernelID));
                        }
                        i5++;
                        i6 = i2;
                    }
                    i4++;
                    i3 = i6;
                }
                if (i3 != this.mKernelCount) {
                    throw new RSRuntimeException("Count mismatch, should not happen.");
                }
                long j;
                if (this.mUseIncSupp) {
                    calcOrder();
                    j = 0;
                } else {
                    long[] jArr2 = new long[this.mLines.size()];
                    long[] jArr3 = new long[this.mLines.size()];
                    long[] jArr4 = new long[this.mLines.size()];
                    long[] jArr5 = new long[this.mLines.size()];
                    for (i2 = 0; i2 < this.mLines.size(); i2++) {
                        ConnectLine connectLine = (ConnectLine) this.mLines.get(i2);
                        jArr2[i2] = connectLine.mFrom.getID(this.mRS);
                        KernelID kernelID2 = connectLine.mToK;
                        if (kernelID2 != null) {
                            jArr3[i2] = kernelID2.getID(this.mRS);
                        }
                        FieldID fieldID = connectLine.mToF;
                        if (fieldID != null) {
                            jArr4[i2] = fieldID.getID(this.mRS);
                        }
                        jArr5[i2] = connectLine.mAllocationType.getID(this.mRS);
                    }
                    j = this.mRS.nScriptGroupCreate(jArr, jArr2, jArr3, jArr4, jArr5);
                    if (j == 0) {
                        throw new RSRuntimeException("Object creation error, should not happen.");
                    }
                }
                ScriptGroup scriptGroup = new ScriptGroup(j, this.mRS);
                scriptGroup.mOutputs = new IO[arrayList2.size()];
                for (i = 0; i < arrayList2.size(); i++) {
                    scriptGroup.mOutputs[i] = (IO) arrayList2.get(i);
                }
                scriptGroup.mInputs = new IO[arrayList.size()];
                for (i = 0; i < arrayList.size(); i++) {
                    scriptGroup.mInputs[i] = (IO) arrayList.get(i);
                }
                scriptGroup.mNodes = this.mNodes;
                scriptGroup.mUseIncSupp = this.mUseIncSupp;
                return scriptGroup;
            }
            throw new RSInvalidStateException("Empty script groups are not allowed");
        }

        private final Node findNode(KernelID kernelID) {
            for (int i = 0; i < this.mNodes.size(); i++) {
                Node node = (Node) this.mNodes.get(i);
                for (int i2 = 0; i2 < node.mKernels.size(); i2++) {
                    if (kernelID == node.mKernels.get(i2)) {
                        return node;
                    }
                }
            }
            return null;
        }

        private final Node findNode(Script script) {
            for (int i = 0; i < this.mNodes.size(); i++) {
                if (script == ((Node) this.mNodes.get(i)).mScript) {
                    return (Node) this.mNodes.get(i);
                }
            }
            return null;
        }

        private final void mergeDAGs(int i, int i2) {
            for (int i3 = 0; i3 < this.mNodes.size(); i3++) {
                if (((Node) this.mNodes.get(i3)).dagNumber == i2) {
                    ((Node) this.mNodes.get(i3)).dagNumber = i;
                }
            }
        }

        private final void validateCycle(Node node, Node node2) {
            for (int i = 0; i < node.mOutputs.size(); i++) {
                ConnectLine connectLine = (ConnectLine) node.mOutputs.get(i);
                KernelID kernelID = connectLine.mToK;
                if (kernelID != null) {
                    Node findNode = findNode(kernelID.mScript);
                    if (findNode.equals(node2)) {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                    validateCycle(findNode, node2);
                }
                FieldID fieldID = connectLine.mToF;
                if (fieldID != null) {
                    Node findNode2 = findNode(fieldID.mScript);
                    if (findNode2.equals(node2)) {
                        throw new RSInvalidStateException("Loops in group not allowed.");
                    }
                    validateCycle(findNode2, node2);
                }
            }
        }

        private final void validateDAG() {
            int i;
            int i2 = 0;
            for (i = 0; i < this.mNodes.size(); i++) {
                Node node = (Node) this.mNodes.get(i);
                if (node.mInputs.size() == 0) {
                    if (node.mOutputs.size() != 0 || this.mNodes.size() <= 1) {
                        validateDAGRecurse(node, i + 1);
                    } else {
                        throw new RSInvalidStateException("Groups cannot contain unconnected scripts");
                    }
                }
            }
            i = ((Node) this.mNodes.get(0)).dagNumber;
            while (i2 < this.mNodes.size()) {
                if (((Node) this.mNodes.get(i2)).dagNumber == i) {
                    i2++;
                } else {
                    throw new RSInvalidStateException("Multiple DAGs in group not allowed.");
                }
            }
        }

        private final void validateDAGRecurse(Node node, int i) {
            int i2 = node.dagNumber;
            if (i2 == 0 || i2 == i) {
                node.dagNumber = i;
                for (int i3 = 0; i3 < node.mOutputs.size(); i3++) {
                    ConnectLine connectLine = (ConnectLine) node.mOutputs.get(i3);
                    KernelID kernelID = connectLine.mToK;
                    if (kernelID != null) {
                        validateDAGRecurse(findNode(kernelID.mScript), i);
                    }
                    FieldID fieldID = connectLine.mToF;
                    if (fieldID != null) {
                        validateDAGRecurse(findNode(fieldID.mScript), i);
                    }
                }
                return;
            }
            mergeDAGs(i2, i);
        }
    }

    /* compiled from: PG */
    class ConnectLine {
        public Allocation mAllocation;
        public Type mAllocationType;
        public KernelID mFrom;
        public FieldID mToF;
        public KernelID mToK;

        ConnectLine(Type type, KernelID kernelID, FieldID fieldID) {
            this.mFrom = kernelID;
            this.mToF = fieldID;
            this.mAllocationType = type;
        }

        ConnectLine(Type type, KernelID kernelID, KernelID kernelID2) {
            this.mFrom = kernelID;
            this.mToK = kernelID2;
            this.mAllocationType = type;
        }
    }

    /* compiled from: PG */
    public final class Future {
        public Closure mClosure;
        public FieldID mFieldID;
        public Object mValue;

        Future(Closure closure, FieldID fieldID, Object obj) {
            this.mClosure = closure;
            this.mFieldID = fieldID;
            this.mValue = obj;
        }

        final Closure getClosure() {
            return this.mClosure;
        }

        final FieldID getFieldID() {
            return this.mFieldID;
        }

        final Object getValue() {
            return this.mValue;
        }
    }

    /* compiled from: PG */
    class IO {
        public Allocation mAllocation;
        public KernelID mKID;

        IO(KernelID kernelID) {
            this.mKID = kernelID;
        }
    }

    /* compiled from: PG */
    public final class Input {
        public List mArgIndex = new ArrayList();
        public List mFieldID = new ArrayList();
        public Object mValue;

        Input() {
        }

        final void addReference(Closure closure, int i) {
            this.mArgIndex.add(Pair.create(closure, Integer.valueOf(i)));
        }

        final void addReference(Closure closure, FieldID fieldID) {
            this.mFieldID.add(Pair.create(closure, fieldID));
        }

        final Object get() {
            return this.mValue;
        }

        final void set(Object obj) {
            this.mValue = obj;
            for (Pair pair : this.mArgIndex) {
                ((Closure) pair.first).setArg(((Integer) pair.second).intValue(), obj);
            }
            for (Pair pair2 : this.mFieldID) {
                ((Closure) pair2.first).setGlobal((FieldID) pair2.second, obj);
            }
        }
    }

    /* compiled from: PG */
    class Node {
        public int dagNumber;
        public ArrayList mInputs = new ArrayList();
        public ArrayList mKernels = new ArrayList();
        public Node mNext;
        public int mOrder;
        public ArrayList mOutputs = new ArrayList();
        public Script mScript;
        public boolean mSeen;

        Node(Script script) {
            this.mScript = script;
        }
    }

    /* compiled from: PG */
    public final class Closure extends BaseObj {
        public static final String TAG = "Closure";
        public Object[] mArgs;
        public Map mBindings;
        public FieldPacker mFP;
        public Map mGlobalFuture;
        public Future mReturnFuture;
        public Allocation mReturnValue;

        /* compiled from: PG */
        final class ValueAndSize {
            public int size;
            public long value;

            public ValueAndSize(RenderScript renderScript, Object obj) {
                if (obj instanceof Allocation) {
                    this.value = ((Allocation) obj).getID(renderScript);
                    this.size = -1;
                } else if (obj instanceof Boolean) {
                    long j;
                    if (((Boolean) obj).booleanValue()) {
                        j = 1;
                    } else {
                        j = 0;
                    }
                    this.value = j;
                    this.size = 4;
                } else if (obj instanceof Integer) {
                    this.value = ((Integer) obj).longValue();
                    this.size = 4;
                } else if (obj instanceof Long) {
                    this.value = ((Long) obj).longValue();
                    this.size = 8;
                } else if (obj instanceof Float) {
                    this.value = (long) Float.floatToRawIntBits(((Float) obj).floatValue());
                    this.size = 4;
                } else if (obj instanceof Double) {
                    this.value = Double.doubleToRawLongBits(((Double) obj).doubleValue());
                    this.size = 8;
                }
            }
        }

        Closure(long j, RenderScript renderScript) {
            super(j, renderScript);
        }

        Closure(RenderScript renderScript, InvokeID invokeID, Object[] objArr, Map map) {
            super(0, renderScript);
            this.mFP = FieldPacker.createFromArray(objArr);
            this.mArgs = objArr;
            this.mBindings = map;
            this.mGlobalFuture = new HashMap();
            int size = map.size();
            long[] jArr = new long[size];
            long[] jArr2 = new long[size];
            int[] iArr = new int[size];
            long[] jArr3 = new long[size];
            long[] jArr4 = new long[size];
            int i = 0;
            for (Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                FieldID fieldID = (FieldID) entry.getKey();
                jArr[i] = fieldID.getID(renderScript);
                retrieveValueAndDependenceInfo(renderScript, i, fieldID, value, jArr2, iArr, jArr3, jArr4);
                i++;
            }
            setID(renderScript.nInvokeClosureCreate(invokeID.getID(renderScript), this.mFP.getData(), jArr, jArr2, iArr));
        }

        Closure(RenderScript renderScript, KernelID kernelID, Type type, Object[] objArr, Map map) {
            super(0, renderScript);
            this.mArgs = objArr;
            this.mReturnValue = Allocation.createTyped(renderScript, type);
            this.mBindings = map;
            this.mGlobalFuture = new HashMap();
            int length = objArr.length + map.size();
            long[] jArr = new long[length];
            long[] jArr2 = new long[length];
            int[] iArr = new int[length];
            long[] jArr3 = new long[length];
            long[] jArr4 = new long[length];
            int i = 0;
            while (i < objArr.length) {
                jArr[i] = 0;
                retrieveValueAndDependenceInfo(renderScript, i, null, objArr[i], jArr2, iArr, jArr3, jArr4);
                i++;
            }
            for (Entry entry : map.entrySet()) {
                Object value = entry.getValue();
                FieldID fieldID = (FieldID) entry.getKey();
                jArr[i] = fieldID.getID(renderScript);
                retrieveValueAndDependenceInfo(renderScript, i, fieldID, value, jArr2, iArr, jArr3, jArr4);
                i++;
            }
            setID(renderScript.nClosureCreate(kernelID.getID(renderScript), this.mReturnValue.getID(renderScript), jArr, jArr2, iArr, jArr3, jArr4));
        }

        public final Future getGlobal(FieldID fieldID) {
            Future future = (Future) this.mGlobalFuture.get(fieldID);
            if (future != null) {
                return future;
            }
            Object obj = this.mBindings.get(fieldID);
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            Future future2 = new Future(this, fieldID, obj);
            this.mGlobalFuture.put(fieldID, future2);
            return future2;
        }

        public final Future getReturn() {
            if (this.mReturnFuture == null) {
                this.mReturnFuture = new Future(this, null, this.mReturnValue);
            }
            return this.mReturnFuture;
        }

        private final void retrieveValueAndDependenceInfo(RenderScript renderScript, int i, FieldID fieldID, Object obj, long[] jArr, int[] iArr, long[] jArr2, long[] jArr3) {
            Object obj2;
            if (obj instanceof Future) {
                long id;
                Future future = (Future) obj;
                Object value = future.getValue();
                jArr2[i] = future.getClosure().getID(renderScript);
                FieldID fieldID2 = future.getFieldID();
                if (fieldID2 != null) {
                    id = fieldID2.getID(renderScript);
                } else {
                    id = 0;
                }
                jArr3[i] = id;
                obj2 = value;
            } else {
                jArr2[i] = 0;
                jArr3[i] = 0;
                obj2 = obj;
            }
            if (obj2 instanceof Input) {
                Input input = (Input) obj2;
                if (i < this.mArgs.length) {
                    input.addReference(this, i);
                } else {
                    input.addReference(this, fieldID);
                }
                jArr[i] = 0;
                iArr[i] = 0;
                return;
            }
            ValueAndSize valueAndSize = new ValueAndSize(renderScript, obj2);
            jArr[i] = valueAndSize.value;
            iArr[i] = valueAndSize.size;
        }

        final void setArg(int i, Object obj) {
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            this.mArgs[i] = obj;
            ValueAndSize valueAndSize = new ValueAndSize(this.mRS, obj);
            this.mRS.nClosureSetArg(getID(this.mRS), i, valueAndSize.value, valueAndSize.size);
        }

        final void setGlobal(FieldID fieldID, Object obj) {
            if (obj instanceof Future) {
                obj = ((Future) obj).getValue();
            }
            this.mBindings.put(fieldID, obj);
            ValueAndSize valueAndSize = new ValueAndSize(this.mRS, obj);
            this.mRS.nClosureSetGlobal(getID(this.mRS), fieldID.getID(this.mRS), valueAndSize.value, valueAndSize.size);
        }
    }

    ScriptGroup(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    ScriptGroup(RenderScript renderScript, String str, List list, List list2, Future[] futureArr) {
        super(0, renderScript);
        this.mName = str;
        this.mClosures = list;
        this.mInputs2 = list2;
        this.mOutputs2 = futureArr;
        long[] jArr = new long[list.size()];
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = ((Closure) list.get(i)).getID(renderScript);
        }
        setID(renderScript.nScriptGroup2Create(str, renderScript.getApplicationContext().getCacheDir().toString(), jArr));
    }

    @Deprecated
    public final void execute() {
        if (this.mUseIncSupp) {
            Node node;
            int i;
            int i2;
            for (int i3 = 0; i3 < this.mNodes.size(); i3++) {
                node = (Node) this.mNodes.get(i3);
                for (i = 0; i < node.mOutputs.size(); i++) {
                    ConnectLine connectLine = (ConnectLine) node.mOutputs.get(i);
                    if (connectLine.mAllocation == null) {
                        Allocation createTyped = Allocation.createTyped(this.mRS, connectLine.mAllocationType, MipmapControl.MIPMAP_NONE, 1);
                        connectLine.mAllocation = createTyped;
                        for (i2 = i + 1; i2 < node.mOutputs.size(); i2++) {
                            if (((ConnectLine) node.mOutputs.get(i2)).mFrom == connectLine.mFrom) {
                                ((ConnectLine) node.mOutputs.get(i2)).mAllocation = createTyped;
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = this.mNodes;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                node = (Node) arrayList.get(i4);
                ArrayList arrayList2 = node.mKernels;
                int size2 = arrayList2.size();
                int i6 = 0;
                while (i6 < size2) {
                    ConnectLine connectLine2;
                    Allocation allocation;
                    int i7 = i6 + 1;
                    KernelID kernelID = (KernelID) arrayList2.get(i6);
                    ArrayList arrayList3 = node.mInputs;
                    int size3 = arrayList3.size();
                    Allocation allocation2 = null;
                    int i8 = 0;
                    while (i8 < size3) {
                        i = i8 + 1;
                        connectLine2 = (ConnectLine) arrayList3.get(i8);
                        if (connectLine2.mToK == kernelID) {
                            allocation2 = connectLine2.mAllocation;
                            i8 = i;
                        } else {
                            i8 = i;
                        }
                    }
                    IO[] ioArr = this.mInputs;
                    size3 = ioArr.length;
                    i = 0;
                    while (i < size3) {
                        IO io = ioArr[i];
                        if (io.mKID == kernelID) {
                            allocation = io.mAllocation;
                        } else {
                            allocation = allocation2;
                        }
                        i++;
                        allocation2 = allocation;
                    }
                    ArrayList arrayList4 = node.mOutputs;
                    int size4 = arrayList4.size();
                    Allocation allocation3 = null;
                    i8 = 0;
                    while (i8 < size4) {
                        i2 = i8 + 1;
                        connectLine2 = (ConnectLine) arrayList4.get(i8);
                        if (connectLine2.mFrom == kernelID) {
                            allocation3 = connectLine2.mAllocation;
                            i8 = i2;
                        } else {
                            i8 = i2;
                        }
                    }
                    allocation = allocation3;
                    for (IO io2 : this.mOutputs) {
                        if (io2.mKID == kernelID) {
                            allocation = io2.mAllocation;
                        }
                    }
                    kernelID.mScript.forEach(kernelID.mSlot, allocation2, allocation, null);
                    i6 = i7;
                }
                i4 = i5;
            }
            return;
        }
        this.mRS.nScriptGroupExecute(getID(this.mRS));
    }

    public final Object[] execute(Object... objArr) {
        int i = 0;
        int length = objArr.length;
        if (length < this.mInputs2.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(toString());
            stringBuilder.append(" receives ");
            stringBuilder.append(length);
            stringBuilder.append(" inputs, ");
            stringBuilder.append("less than expected ");
            stringBuilder.append(this.mInputs2.size());
            Log.e(TAG, stringBuilder.toString());
            return null;
        }
        int i2;
        if (length > this.mInputs2.size()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(toString());
            stringBuilder.append(" receives ");
            stringBuilder.append(length);
            stringBuilder.append(" inputs, ");
            stringBuilder.append("more than expected ");
            stringBuilder.append(this.mInputs2.size());
            Log.i(TAG, stringBuilder.toString());
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.mInputs2.size()) {
            Object obj = objArr[i2];
            if ((obj instanceof Future) || (obj instanceof Input)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(toString());
                stringBuilder2.append(": input ");
                stringBuilder2.append(i2);
                stringBuilder2.append(" is a future or unbound value");
                Log.e(TAG, stringBuilder2.toString());
                return null;
            }
            ((Input) this.mInputs2.get(i2)).set(obj);
            i2++;
        }
        this.mRS.nScriptGroup2Execute(getID(this.mRS));
        Future[] futureArr = this.mOutputs2;
        int length2 = futureArr.length;
        Object[] objArr2 = new Object[length2];
        int i3 = 0;
        while (i < length2) {
            Object value = futureArr[i].getValue();
            if (value instanceof Input) {
                value = ((Input) value).get();
            }
            int i4 = i3 + 1;
            objArr2[i3] = value;
            i++;
            i3 = i4;
        }
        return objArr2;
    }

    @Deprecated
    public final void setInput(KernelID kernelID, Allocation allocation) {
        IO io;
        int i = 0;
        while (true) {
            IO[] ioArr = this.mInputs;
            if (i < ioArr.length) {
                io = ioArr[i];
                if (io.mKID == kernelID) {
                    break;
                }
                i++;
            } else {
                throw new RSIllegalArgumentException("Script not found");
            }
        }
        io.mAllocation = allocation;
        if (!this.mUseIncSupp) {
            this.mRS.nScriptGroupSetInput(getID(this.mRS), kernelID.getID(this.mRS), this.mRS.safeID(allocation));
        }
    }

    @Deprecated
    public final void setOutput(KernelID kernelID, Allocation allocation) {
        IO io;
        int i = 0;
        while (true) {
            IO[] ioArr = this.mOutputs;
            if (i < ioArr.length) {
                io = ioArr[i];
                if (io.mKID == kernelID) {
                    break;
                }
                i++;
            } else {
                throw new RSIllegalArgumentException("Script not found");
            }
        }
        io.mAllocation = allocation;
        if (!this.mUseIncSupp) {
            this.mRS.nScriptGroupSetOutput(getID(this.mRS), kernelID.getID(this.mRS), this.mRS.safeID(allocation));
        }
    }
}
