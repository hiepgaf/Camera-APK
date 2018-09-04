package com.google.common.logging.nano;

import p000.kjg;
import p000.kjz;
import p000.klf;
import p000.klq;
import p000.kvc;
import p000.kvd;
import p000.kvf;
import p000.kvj;
import p000.kvl;
import p000.kvn;

/* compiled from: PG */
public final class eventprotos$BackgroundEvent extends kvf {
    public static volatile eventprotos$BackgroundEvent[] _emptyArray;
    public kjg autoFocusReport;
    public kjz[] dirtyLensEvents;
    public eventprotos$LaunchReport launchReport;
    public klf[] meteringData;
    public klq[] previewSmoothnessReport;
    public float shutterButtonDisabledDuration;

    public eventprotos$BackgroundEvent() {
        clear();
    }

    public final eventprotos$BackgroundEvent clear() {
        this.autoFocusReport = null;
        this.launchReport = null;
        this.previewSmoothnessReport = klq.m16604a();
        this.dirtyLensEvents = kjz.m16575a();
        this.shutterButtonDisabledDuration = 0.0f;
        this.meteringData = klf.m16592a();
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int i;
        kvl kvl;
        int i2 = 0;
        int computeSerializedSize = super.computeSerializedSize();
        kvl kvl2 = this.autoFocusReport;
        if (kvl2 != null) {
            computeSerializedSize += kvd.m5418a(1, kvl2);
        }
        kvl2 = this.launchReport;
        if (kvl2 != null) {
            computeSerializedSize += kvd.m5418a(2, kvl2);
        }
        klq[] klqArr = this.previewSmoothnessReport;
        if (klqArr != null && klqArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                klq[] klqArr2 = this.previewSmoothnessReport;
                if (computeSerializedSize >= klqArr2.length) {
                    break;
                }
                kvl = klqArr2[computeSerializedSize];
                if (kvl != null) {
                    i += kvd.m5418a(3, kvl);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        kjz[] kjzArr = this.dirtyLensEvents;
        if (kjzArr != null && kjzArr.length > 0) {
            i = 0;
            while (true) {
                kjz[] kjzArr2 = this.dirtyLensEvents;
                if (i >= kjzArr2.length) {
                    break;
                }
                kvl = kjzArr2[i];
                if (kvl != null) {
                    computeSerializedSize += kvd.m5418a(4, kvl);
                }
                i++;
            }
        }
        if (Float.floatToIntBits(this.shutterButtonDisabledDuration) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(40) + 4;
        }
        klf[] klfArr = this.meteringData;
        if (klfArr != null && klfArr.length > 0) {
            while (true) {
                klfArr = this.meteringData;
                if (i2 >= klfArr.length) {
                    break;
                }
                kvl2 = klfArr[i2];
                if (kvl2 != null) {
                    computeSerializedSize += kvd.m5418a(6, kvl2);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public static eventprotos$BackgroundEvent[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f8655b) {
                if (_emptyArray == null) {
                    _emptyArray = new eventprotos$BackgroundEvent[0];
                }
            }
        }
        return _emptyArray;
    }

    public final eventprotos$BackgroundEvent mergeFrom(kvc kvc) {
        while (true) {
            int i = kvc.m5413i();
            int a;
            Object obj;
            Object obj2;
            switch (i) {
                case 0:
                    break;
                case 10:
                    if (this.autoFocusReport == null) {
                        this.autoFocusReport = new kjg();
                    }
                    kvc.m5399a(this.autoFocusReport);
                    continue;
                case 18:
                    if (this.launchReport == null) {
                        this.launchReport = new eventprotos$LaunchReport();
                    }
                    kvc.m5399a(this.launchReport);
                    continue;
                case 26:
                    a = kvn.m5457a(kvc, 26);
                    obj = this.previewSmoothnessReport;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new klq[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new klq();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new klq();
                    kvc.m5399a(obj2[i]);
                    this.previewSmoothnessReport = obj2;
                    continue;
                case 34:
                    a = kvn.m5457a(kvc, 34);
                    obj = this.dirtyLensEvents;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new kjz[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kjz();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kjz();
                    kvc.m5399a(obj2[i]);
                    this.dirtyLensEvents = obj2;
                    continue;
                case 45:
                    this.shutterButtonDisabledDuration = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 50:
                    a = kvn.m5457a(kvc, 50);
                    obj = this.meteringData;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    obj2 = new klf[(a + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new klf();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new klf();
                    kvc.m5399a(obj2[i]);
                    this.meteringData = obj2;
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

    public static eventprotos$BackgroundEvent parseFrom(kvc kvc) {
        return new eventprotos$BackgroundEvent().mergeFrom(kvc);
    }

    public static eventprotos$BackgroundEvent parseFrom(byte[] bArr) {
        return (eventprotos$BackgroundEvent) kvl.mergeFrom(new eventprotos$BackgroundEvent(), bArr);
    }

    public final void writeTo(kvd kvd) {
        int i;
        kvl kvl;
        int i2 = 0;
        kvl kvl2 = this.autoFocusReport;
        if (kvl2 != null) {
            kvd.m5434b(1, kvl2);
        }
        kvl2 = this.launchReport;
        if (kvl2 != null) {
            kvd.m5434b(2, kvl2);
        }
        klq[] klqArr = this.previewSmoothnessReport;
        if (klqArr != null && klqArr.length > 0) {
            i = 0;
            while (true) {
                klq[] klqArr2 = this.previewSmoothnessReport;
                if (i >= klqArr2.length) {
                    break;
                }
                kvl = klqArr2[i];
                if (kvl != null) {
                    kvd.m5434b(3, kvl);
                }
                i++;
            }
        }
        kjz[] kjzArr = this.dirtyLensEvents;
        if (kjzArr != null && kjzArr.length > 0) {
            i = 0;
            while (true) {
                kjz[] kjzArr2 = this.dirtyLensEvents;
                if (i >= kjzArr2.length) {
                    break;
                }
                kvl = kjzArr2[i];
                if (kvl != null) {
                    kvd.m5434b(4, kvl);
                }
                i++;
            }
        }
        if (Float.floatToIntBits(this.shutterButtonDisabledDuration) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(5, this.shutterButtonDisabledDuration);
        }
        klf[] klfArr = this.meteringData;
        if (klfArr != null && klfArr.length > 0) {
            while (true) {
                klfArr = this.meteringData;
                if (i2 >= klfArr.length) {
                    break;
                }
                kvl2 = klfArr[i2];
                if (kvl2 != null) {
                    kvd.m5434b(6, kvl2);
                }
                i2++;
            }
        }
        super.writeTo(kvd);
    }
}
