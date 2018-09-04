package com.google.common.logging.nano;

import p000.kvc;
import p000.kvd;
import p000.kvf;
import p000.kvj;
import p000.kvl;

/* compiled from: PG */
public final class eventprotos$LaunchReport extends kvf {
    public static volatile eventprotos$LaunchReport[] _emptyArray;
    public long cameraActivityInitializedNanoTime;
    public long controlNanoTime;
    public long previewFrameNanoTime;
    public long shutterButtonFirstDrawNanoTime;
    public long shutterButtonFirstEnabledNanoTime;

    public eventprotos$LaunchReport() {
        clear();
    }

    public final eventprotos$LaunchReport clear() {
        this.controlNanoTime = 0;
        this.previewFrameNanoTime = 0;
        this.cameraActivityInitializedNanoTime = 0;
        this.shutterButtonFirstDrawNanoTime = 0;
        this.shutterButtonFirstEnabledNanoTime = 0;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.controlNanoTime;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        j = this.previewFrameNanoTime;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        j = this.cameraActivityInitializedNanoTime;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        j = this.shutterButtonFirstDrawNanoTime;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(4, j);
        }
        j = this.shutterButtonFirstEnabledNanoTime;
        if (j != 0) {
            return computeSerializedSize + kvd.m5416a(5, j);
        }
        return computeSerializedSize;
    }

    public static eventprotos$LaunchReport[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f8655b) {
                if (_emptyArray == null) {
                    _emptyArray = new eventprotos$LaunchReport[0];
                }
            }
        }
        return _emptyArray;
    }

    public final eventprotos$LaunchReport mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.controlNanoTime = kvc.m5411g();
                    continue;
                case 16:
                    this.previewFrameNanoTime = kvc.m5411g();
                    continue;
                case 24:
                    this.cameraActivityInitializedNanoTime = kvc.m5411g();
                    continue;
                case 32:
                    this.shutterButtonFirstDrawNanoTime = kvc.m5411g();
                    continue;
                case 40:
                    this.shutterButtonFirstEnabledNanoTime = kvc.m5411g();
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

    public static eventprotos$LaunchReport parseFrom(kvc kvc) {
        return new eventprotos$LaunchReport().mergeFrom(kvc);
    }

    public static eventprotos$LaunchReport parseFrom(byte[] bArr) {
        return (eventprotos$LaunchReport) kvl.mergeFrom(new eventprotos$LaunchReport(), bArr);
    }

    public final void writeTo(kvd kvd) {
        long j = this.controlNanoTime;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        j = this.previewFrameNanoTime;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        j = this.cameraActivityInitializedNanoTime;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        j = this.shutterButtonFirstDrawNanoTime;
        if (j != 0) {
            kvd.m5432b(4, j);
        }
        j = this.shutterButtonFirstEnabledNanoTime;
        if (j != 0) {
            kvd.m5432b(5, j);
        }
        super.writeTo(kvd);
    }
}
