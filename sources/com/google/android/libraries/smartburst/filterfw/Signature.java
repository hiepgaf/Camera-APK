package com.google.android.libraries.smartburst.filterfw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/* compiled from: PG */
public class Signature {
    public static final int PORT_OPTIONAL = 1;
    public static final int PORT_REQUIRED = 2;
    public boolean mAllowOtherInputs = true;
    public boolean mAllowOtherOutputs = true;
    public HashMap mInputPorts = null;
    public HashMap mOutputPorts = null;

    /* compiled from: PG */
    class PortInfo {
        public int flags;
        public FrameType type;

        public PortInfo() {
            this.flags = 0;
            this.type = FrameType.any();
        }

        public PortInfo(int i, FrameType frameType) {
            this.flags = i;
            this.type = frameType;
        }

        public boolean isRequired() {
            return (this.flags & 2) != 0;
        }

        public String toString(String str, String str2) {
            String str3;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(str2).length());
            stringBuilder.append(str);
            stringBuilder.append(" ");
            stringBuilder.append(str2);
            String stringBuilder2 = stringBuilder.toString();
            if (isRequired()) {
                str3 = "required";
            } else {
                str3 = "optional";
            }
            String frameType = this.type.toString();
            int length = String.valueOf(str3).length();
            StringBuilder stringBuilder3 = new StringBuilder(((length + 3) + String.valueOf(stringBuilder2).length()) + String.valueOf(frameType).length());
            stringBuilder3.append(str3);
            stringBuilder3.append(" ");
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(": ");
            stringBuilder3.append(frameType);
            return stringBuilder3.toString();
        }
    }

    public Signature addInputPort(String str, int i, FrameType frameType) {
        addInputPort(str, new PortInfo(i, frameType));
        return this;
    }

    private void addInputPort(String str, PortInfo portInfo) {
        if (this.mInputPorts == null) {
            this.mInputPorts = new HashMap();
        }
        if (this.mInputPorts.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 42);
            stringBuilder.append("Attempting to add duplicate input port '");
            stringBuilder.append(str);
            stringBuilder.append("'!");
            throw new RuntimeException(stringBuilder.toString());
        }
        this.mInputPorts.put(str, portInfo);
    }

    public Signature addOutputPort(String str, int i, FrameType frameType) {
        addOutputPort(str, new PortInfo(i, frameType));
        return this;
    }

    private void addOutputPort(String str, PortInfo portInfo) {
        if (this.mOutputPorts == null) {
            this.mOutputPorts = new HashMap();
        }
        if (this.mOutputPorts.containsKey(str)) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 43);
            stringBuilder.append("Attempting to add duplicate output port '");
            stringBuilder.append(str);
            stringBuilder.append("'!");
            throw new RuntimeException(stringBuilder.toString());
        }
        this.mOutputPorts.put(str, portInfo);
    }

    void checkInputPortsConform(Filter filter) {
        String str;
        Set hashSet = new HashSet();
        hashSet.addAll(filter.getConnectedInputPortMap().keySet());
        HashMap hashMap = this.mInputPorts;
        if (hashMap != null) {
            for (Entry entry : hashMap.entrySet()) {
                str = (String) entry.getKey();
                PortInfo portInfo = (PortInfo) entry.getValue();
                if (filter.getConnectedInputPort(str) == null && portInfo.isRequired()) {
                    String valueOf = String.valueOf(filter);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 45) + String.valueOf(str).length());
                    stringBuilder.append("Filter ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" does not have required input port '");
                    stringBuilder.append(str);
                    stringBuilder.append("'!");
                    throw new RuntimeException(stringBuilder.toString());
                }
                hashSet.remove(str);
            }
        }
        if (!this.mAllowOtherInputs && !hashSet.isEmpty()) {
            str = String.valueOf(filter);
            valueOf = String.valueOf(hashSet);
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 34) + String.valueOf(valueOf).length());
            stringBuilder.append("Filter ");
            stringBuilder.append(str);
            stringBuilder.append(" has invalid input ports: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    void checkOutputPortsConform(Filter filter) {
        String str;
        Set hashSet = new HashSet();
        hashSet.addAll(filter.getConnectedOutputPortMap().keySet());
        HashMap hashMap = this.mOutputPorts;
        if (hashMap != null) {
            for (Entry entry : hashMap.entrySet()) {
                str = (String) entry.getKey();
                PortInfo portInfo = (PortInfo) entry.getValue();
                if (filter.getConnectedOutputPort(str) == null && portInfo.isRequired()) {
                    String valueOf = String.valueOf(filter);
                    StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 46) + String.valueOf(str).length());
                    stringBuilder.append("Filter ");
                    stringBuilder.append(valueOf);
                    stringBuilder.append(" does not have required output port '");
                    stringBuilder.append(str);
                    stringBuilder.append("'!");
                    throw new RuntimeException(stringBuilder.toString());
                }
                hashSet.remove(str);
            }
        }
        if (!this.mAllowOtherOutputs && !hashSet.isEmpty()) {
            str = String.valueOf(filter);
            valueOf = String.valueOf(hashSet);
            stringBuilder = new StringBuilder((String.valueOf(str).length() + 35) + String.valueOf(valueOf).length());
            stringBuilder.append("Filter ");
            stringBuilder.append(str);
            stringBuilder.append(" has invalid output ports: ");
            stringBuilder.append(valueOf);
            stringBuilder.append("!");
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public Signature disallowOtherInputs() {
        this.mAllowOtherInputs = false;
        return this;
    }

    public Signature disallowOtherOutputs() {
        this.mAllowOtherOutputs = false;
        return this;
    }

    public Signature disallowOtherPorts() {
        this.mAllowOtherInputs = false;
        this.mAllowOtherOutputs = false;
        return this;
    }

    PortInfo getInputPortInfo(String str) {
        PortInfo portInfo;
        HashMap hashMap = this.mInputPorts;
        if (hashMap != null) {
            portInfo = (PortInfo) hashMap.get(str);
        } else {
            portInfo = null;
        }
        return portInfo == null ? new PortInfo() : portInfo;
    }

    HashMap getInputPorts() {
        return this.mInputPorts;
    }

    PortInfo getOutputPortInfo(String str) {
        PortInfo portInfo;
        HashMap hashMap = this.mOutputPorts;
        if (hashMap != null) {
            portInfo = (PortInfo) hashMap.get(str);
        } else {
            portInfo = null;
        }
        return portInfo == null ? new PortInfo() : portInfo;
    }

    HashMap getOutputPorts() {
        return this.mOutputPorts;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : this.mInputPorts.entrySet()) {
            stringBuilder.append(((PortInfo) entry.getValue()).toString("input", (String) entry.getKey()));
            stringBuilder.append("\n");
        }
        for (Entry entry2 : this.mOutputPorts.entrySet()) {
            stringBuilder.append(((PortInfo) entry2.getValue()).toString("output", (String) entry2.getKey()));
            stringBuilder.append("\n");
        }
        if (!this.mAllowOtherInputs) {
            stringBuilder.append("disallow other inputs\n");
        }
        if (!this.mAllowOtherOutputs) {
            stringBuilder.append("disallow other outputs\n");
        }
        return stringBuilder.toString();
    }
}
