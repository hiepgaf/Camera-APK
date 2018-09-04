package com.google.common.logging.nano;

import p000.kjj;
import p000.kjw;
import p000.kvc;
import p000.kvd;
import p000.kvf;
import p000.kvj;
import p000.kvl;

/* compiled from: PG */
public final class eventprotos$CaptureProfileEvent extends kvf {
    public static volatile eventprotos$CaptureProfileEvent[] _emptyArray;
    public kjj cameraConfiguration;
    public kjw captureTrace;
    public eventprotos$CaptureTiming timing;

    public eventprotos$CaptureProfileEvent() {
        clear();
    }

    public final eventprotos$CaptureProfileEvent clear() {
        this.cameraConfiguration = null;
        this.timing = null;
        this.captureTrace = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl = this.cameraConfiguration;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(1, kvl);
        }
        kvl = this.timing;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(2, kvl);
        }
        kvl = this.captureTrace;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(3, kvl);
        }
        return computeSerializedSize;
    }

    public static eventprotos$CaptureProfileEvent[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f8655b) {
                if (_emptyArray == null) {
                    _emptyArray = new eventprotos$CaptureProfileEvent[0];
                }
            }
        }
        return _emptyArray;
    }

    public final eventprotos$CaptureProfileEvent mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    if (this.cameraConfiguration == null) {
                        this.cameraConfiguration = new kjj();
                    }
                    kvc.m5399a(this.cameraConfiguration);
                    continue;
                case 18:
                    if (this.timing == null) {
                        this.timing = new eventprotos$CaptureTiming();
                    }
                    kvc.m5399a(this.timing);
                    continue;
                case 26:
                    if (this.captureTrace == null) {
                        this.captureTrace = new kjw();
                    }
                    kvc.m5399a(this.captureTrace);
                    continue;
                default:
                    if (!super.storeUnknownField(kvc, i)) {
                        break;
                    }
                    continue;
            }
            return this;
        }
    }

    public static eventprotos$CaptureProfileEvent parseFrom(kvc kvc) {
        return new eventprotos$CaptureProfileEvent().mergeFrom(kvc);
    }

    public static eventprotos$CaptureProfileEvent parseFrom(byte[] bArr) {
        return (eventprotos$CaptureProfileEvent) kvl.mergeFrom(new eventprotos$CaptureProfileEvent(), bArr);
    }

    public final void writeTo(kvd kvd) {
        kvl kvl = this.cameraConfiguration;
        if (kvl != null) {
            kvd.m5434b(1, kvl);
        }
        kvl = this.timing;
        if (kvl != null) {
            kvd.m5434b(2, kvl);
        }
        kvl = this.captureTrace;
        if (kvl != null) {
            kvd.m5434b(3, kvl);
        }
        super.writeTo(kvd);
    }
}
