package com.google.common.logging.nano;

import p000.klb;
import p000.kvc;
import p000.kvd;
import p000.kvf;
import p000.kvj;
import p000.kvl;
import p000.kvn;

/* compiled from: PG */
public final class eventprotos$CaptureTiming extends kvf {
    public static volatile eventprotos$CaptureTiming[] _emptyArray;
    public long captureFrameSelectEndNs;
    public long captureFrameSelectStartNs;
    public long captureMediumThumbNs;
    public long captureMergeEndNs;
    public long captureMergeStartNs;
    public long capturePersistedEndNs;
    public long capturePersistedStartNs;
    public long captureProcessingEndNs;
    public long captureProcessingStartNs;
    public long captureRequestReceivedNs;
    public long captureRequestSubmittedNs;
    public klb[] captureScoreCalculations;
    public long captureStartNs;
    public long captureTinyThumbNs;

    public eventprotos$CaptureTiming() {
        clear();
    }

    public final eventprotos$CaptureTiming clear() {
        this.captureStartNs = 0;
        this.captureTinyThumbNs = 0;
        this.captureMediumThumbNs = 0;
        this.captureRequestSubmittedNs = 0;
        this.captureRequestReceivedNs = 0;
        this.captureFrameSelectStartNs = 0;
        this.captureFrameSelectEndNs = 0;
        this.captureMergeStartNs = 0;
        this.captureMergeEndNs = 0;
        this.captureProcessingStartNs = 0;
        this.captureProcessingEndNs = 0;
        this.capturePersistedStartNs = 0;
        this.capturePersistedEndNs = 0;
        this.captureScoreCalculations = klb.m16590a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.captureStartNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(1, j);
        }
        j = this.captureTinyThumbNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(2, j);
        }
        j = this.captureMediumThumbNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(3, j);
        }
        j = this.captureProcessingStartNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(4, j);
        }
        j = this.captureProcessingEndNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(5, j);
        }
        j = this.capturePersistedEndNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(6, j);
        }
        j = this.captureRequestSubmittedNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(7, j);
        }
        j = this.captureRequestReceivedNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(8, j);
        }
        j = this.captureFrameSelectStartNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(9, j);
        }
        j = this.captureFrameSelectEndNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(10, j);
        }
        j = this.captureMergeStartNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(11, j);
        }
        j = this.captureMergeEndNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(12, j);
        }
        j = this.capturePersistedStartNs;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(13, j);
        }
        klb[] klbArr = this.captureScoreCalculations;
        if (klbArr != null && klbArr.length > 0) {
            int i = 0;
            while (true) {
                klb[] klbArr2 = this.captureScoreCalculations;
                if (i >= klbArr2.length) {
                    break;
                }
                kvl kvl = klbArr2[i];
                if (kvl != null) {
                    computeSerializedSize += kvd.m5418a(14, kvl);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public static eventprotos$CaptureTiming[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f8655b) {
                if (_emptyArray == null) {
                    _emptyArray = new eventprotos$CaptureTiming[0];
                }
            }
        }
        return _emptyArray;
    }

    public final eventprotos$CaptureTiming mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    this.captureStartNs = kvc.m5411g();
                    continue;
                case 16:
                    this.captureTinyThumbNs = kvc.m5411g();
                    continue;
                case 24:
                    this.captureMediumThumbNs = kvc.m5411g();
                    continue;
                case 32:
                    this.captureProcessingStartNs = kvc.m5411g();
                    continue;
                case 40:
                    this.captureProcessingEndNs = kvc.m5411g();
                    continue;
                case 48:
                    this.capturePersistedEndNs = kvc.m5411g();
                    continue;
                case 56:
                    this.captureRequestSubmittedNs = kvc.m5411g();
                    continue;
                case 64:
                    this.captureRequestReceivedNs = kvc.m5411g();
                    continue;
                case 72:
                    this.captureFrameSelectStartNs = kvc.m5411g();
                    continue;
                case 80:
                    this.captureFrameSelectEndNs = kvc.m5411g();
                    continue;
                case 88:
                    this.captureMergeStartNs = kvc.m5411g();
                    continue;
                case 96:
                    this.captureMergeEndNs = kvc.m5411g();
                    continue;
                case 104:
                    this.capturePersistedStartNs = kvc.m5411g();
                    continue;
                case 114:
                    int a = kvn.m5457a(kvc, 114);
                    Object obj = this.captureScoreCalculations;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new klb[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new klb();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new klb();
                    kvc.m5399a(obj2[i]);
                    this.captureScoreCalculations = obj2;
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

    public static eventprotos$CaptureTiming parseFrom(kvc kvc) {
        return new eventprotos$CaptureTiming().mergeFrom(kvc);
    }

    public static eventprotos$CaptureTiming parseFrom(byte[] bArr) {
        return (eventprotos$CaptureTiming) kvl.mergeFrom(new eventprotos$CaptureTiming(), bArr);
    }

    public final void writeTo(kvd kvd) {
        long j = this.captureStartNs;
        if (j != 0) {
            kvd.m5432b(1, j);
        }
        j = this.captureTinyThumbNs;
        if (j != 0) {
            kvd.m5432b(2, j);
        }
        j = this.captureMediumThumbNs;
        if (j != 0) {
            kvd.m5432b(3, j);
        }
        j = this.captureProcessingStartNs;
        if (j != 0) {
            kvd.m5432b(4, j);
        }
        j = this.captureProcessingEndNs;
        if (j != 0) {
            kvd.m5432b(5, j);
        }
        j = this.capturePersistedEndNs;
        if (j != 0) {
            kvd.m5432b(6, j);
        }
        j = this.captureRequestSubmittedNs;
        if (j != 0) {
            kvd.m5432b(7, j);
        }
        j = this.captureRequestReceivedNs;
        if (j != 0) {
            kvd.m5432b(8, j);
        }
        j = this.captureFrameSelectStartNs;
        if (j != 0) {
            kvd.m5432b(9, j);
        }
        j = this.captureFrameSelectEndNs;
        if (j != 0) {
            kvd.m5432b(10, j);
        }
        j = this.captureMergeStartNs;
        if (j != 0) {
            kvd.m5432b(11, j);
        }
        j = this.captureMergeEndNs;
        if (j != 0) {
            kvd.m5432b(12, j);
        }
        j = this.capturePersistedStartNs;
        if (j != 0) {
            kvd.m5432b(13, j);
        }
        klb[] klbArr = this.captureScoreCalculations;
        if (klbArr != null && klbArr.length > 0) {
            int i = 0;
            while (true) {
                klb[] klbArr2 = this.captureScoreCalculations;
                if (i >= klbArr2.length) {
                    break;
                }
                kvl kvl = klbArr2[i];
                if (kvl != null) {
                    kvd.m5434b(14, kvl);
                }
                i++;
            }
        }
        super.writeTo(kvd);
    }
}
