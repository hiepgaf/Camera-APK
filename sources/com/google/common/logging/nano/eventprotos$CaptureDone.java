package com.google.common.logging.nano;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import p000.kjd;
import p000.kjf;
import p000.kka;
import p000.kkb;
import p000.kkc;
import p000.kkf;
import p000.kkg;
import p000.kky;
import p000.kla;
import p000.klf;
import p000.klg;
import p000.klh;
import p000.klj;
import p000.klk;
import p000.kln;
import p000.kls;
import p000.klw;
import p000.klx;
import p000.kme;
import p000.kmf;
import p000.kvc;
import p000.kvd;
import p000.kvf;
import p000.kvj;
import p000.kvl;
import p000.kvn;

/* compiled from: PG */
public final class eventprotos$CaptureDone extends kvf {
    public static volatile eventprotos$CaptureDone[] _emptyArray;
    public kjd adviceMeta;
    public kjf authorStats;
    public int captureFailure;
    public eventprotos$CaptureTiming captureTiming;
    public kka exif;
    public kkb[] face;
    public kkc faceretouchingMeta;
    public String fileNameHash;
    public int flashSetting;
    public boolean frontCamera;
    public kkf gcamMeta;
    public boolean gridLines;
    public int hdrPlusSetting;
    public kkg imaxMetadata;
    public kky lensBlurMeta;
    public kla luckyShotMeta;
    public klf meteringData;
    public klg microvideoMeta;
    public int mode;
    public kls orientation;
    public klj panoMeta;
    public klk photoMeta;
    public int photosInFlight;
    public kln portraitMetadata;
    public float processingTime;
    public klx smartBurstMeta;
    public klw smartburstCreationMeta;
    public float timerSeconds;
    public kme touchCoord;
    public kmf videoMeta;
    public boolean volumeButtonShutter;
    public float zoomValue;

    public eventprotos$CaptureDone() {
        clear();
    }

    public static int checkCaptureFailureOrThrow(int i) {
        if (i >= 0 && i <= 1) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum CaptureFailure");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkCaptureFailureOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkCaptureFailureOrThrow : iArr2) {
            checkCaptureFailureOrThrow(checkCaptureFailureOrThrow);
        }
        return iArr2;
    }

    public static int checkTriStateSettingOrThrow(int i) {
        if (i >= 0 && i <= 3) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(47);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum TriStateSetting");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkTriStateSettingOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkTriStateSettingOrThrow : iArr2) {
            checkTriStateSettingOrThrow(checkTriStateSettingOrThrow);
        }
        return iArr2;
    }

    public final eventprotos$CaptureDone clear() {
        this.fileNameHash = "";
        this.mode = 0;
        this.frontCamera = false;
        this.zoomValue = 0.0f;
        this.processingTime = 0.0f;
        this.exif = null;
        this.gridLines = false;
        this.timerSeconds = 0.0f;
        this.flashSetting = 0;
        this.volumeButtonShutter = false;
        this.touchCoord = null;
        this.face = kkb.m16576a();
        this.orientation = null;
        this.photoMeta = null;
        this.videoMeta = null;
        this.gcamMeta = null;
        this.lensBlurMeta = null;
        this.panoMeta = null;
        this.authorStats = null;
        this.smartBurstMeta = null;
        this.captureTiming = null;
        this.adviceMeta = null;
        this.luckyShotMeta = null;
        this.smartburstCreationMeta = null;
        this.meteringData = null;
        this.hdrPlusSetting = 0;
        this.photosInFlight = 0;
        this.captureFailure = 0;
        this.microvideoMeta = null;
        this.faceretouchingMeta = null;
        this.portraitMetadata = null;
        this.imaxMetadata = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.fileNameHash;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(1, this.fileNameHash);
        }
        int i = this.mode;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(3, i);
        }
        if (this.frontCamera) {
            computeSerializedSize += kvd.m5423b(48) + 1;
        }
        if (Float.floatToIntBits(this.zoomValue) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(56) + 4;
        }
        if (Float.floatToIntBits(this.processingTime) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(64) + 4;
        }
        kvl kvl = this.exif;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(9, kvl);
        }
        if (this.gridLines) {
            computeSerializedSize += kvd.m5423b(80) + 1;
        }
        if (Float.floatToIntBits(this.timerSeconds) != Float.floatToIntBits(0.0f)) {
            computeSerializedSize += kvd.m5423b(88) + 4;
        }
        i = this.flashSetting;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(12, i);
        }
        if (this.volumeButtonShutter) {
            computeSerializedSize += kvd.m5423b(104) + 1;
        }
        kvl = this.touchCoord;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(14, kvl);
        }
        kkb[] kkbArr = this.face;
        if (kkbArr != null && kkbArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                kkb[] kkbArr2 = this.face;
                if (computeSerializedSize >= kkbArr2.length) {
                    break;
                }
                kvl kvl2 = kkbArr2[computeSerializedSize];
                if (kvl2 != null) {
                    i += kvd.m5418a(15, kvl2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        kvl = this.orientation;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(16, kvl);
        }
        kvl = this.photoMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(20, kvl);
        }
        kvl = this.videoMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(21, kvl);
        }
        kvl = this.gcamMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(22, kvl);
        }
        kvl = this.lensBlurMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(23, kvl);
        }
        kvl = this.panoMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(24, kvl);
        }
        kvl = this.authorStats;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(25, kvl);
        }
        kvl = this.smartBurstMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(27, kvl);
        }
        kvl = this.captureTiming;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(29, kvl);
        }
        kvl = this.adviceMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(30, kvl);
        }
        kvl = this.luckyShotMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(31, kvl);
        }
        kvl = this.smartburstCreationMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(32, kvl);
        }
        kvl = this.meteringData;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(33, kvl);
        }
        i = this.hdrPlusSetting;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(34, i);
        }
        i = this.photosInFlight;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(35, i);
        }
        i = this.captureFailure;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(36, i);
        }
        kvl = this.microvideoMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(37, kvl);
        }
        kvl = this.faceretouchingMeta;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(38, kvl);
        }
        kvl = this.portraitMetadata;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(39, kvl);
        }
        kvl = this.imaxMetadata;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(40, kvl);
        }
        return computeSerializedSize;
    }

    public static eventprotos$CaptureDone[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f8655b) {
                if (_emptyArray == null) {
                    _emptyArray = new eventprotos$CaptureDone[0];
                }
            }
        }
        return _emptyArray;
    }

    public final eventprotos$CaptureDone mergeFrom(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 10:
                    this.fileNameHash = kvc.m5412h();
                    continue;
                case 24:
                    b = kvc.m5401b();
                    try {
                        this.mode = klh.m16596b(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 48:
                    this.frontCamera = kvc.m5405c();
                    continue;
                case 61:
                    this.zoomValue = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 69:
                    this.processingTime = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 74:
                    if (this.exif == null) {
                        this.exif = new kka();
                    }
                    kvc.m5399a(this.exif);
                    continue;
                case 80:
                    this.gridLines = kvc.m5405c();
                    continue;
                case 93:
                    this.timerSeconds = Float.intBitsToFloat(kvc.m5406d());
                    continue;
                case 96:
                    b = kvc.m5401b();
                    try {
                        this.flashSetting = checkTriStateSettingOrThrow(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 104:
                    this.volumeButtonShutter = kvc.m5405c();
                    continue;
                case 114:
                    if (this.touchCoord == null) {
                        this.touchCoord = new kme();
                    }
                    kvc.m5399a(this.touchCoord);
                    continue;
                case 122:
                    b = kvn.m5457a(kvc, 122);
                    Object obj = this.face;
                    if (obj != null) {
                        i = obj.length;
                    } else {
                        i = 0;
                    }
                    Object obj2 = new kkb[(b + i)];
                    if (i != 0) {
                        System.arraycopy(obj, 0, obj2, 0, i);
                    }
                    while (i < obj2.length - 1) {
                        obj2[i] = new kkb();
                        kvc.m5399a(obj2[i]);
                        kvc.m5413i();
                        i++;
                    }
                    obj2[i] = new kkb();
                    kvc.m5399a(obj2[i]);
                    this.face = obj2;
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                    if (this.orientation == null) {
                        this.orientation = new kls();
                    }
                    kvc.m5399a(this.orientation);
                    continue;
                case 162:
                    if (this.photoMeta == null) {
                        this.photoMeta = new klk();
                    }
                    kvc.m5399a(this.photoMeta);
                    continue;
                case 170:
                    if (this.videoMeta == null) {
                        this.videoMeta = new kmf();
                    }
                    kvc.m5399a(this.videoMeta);
                    continue;
                case 178:
                    if (this.gcamMeta == null) {
                        this.gcamMeta = new kkf();
                    }
                    kvc.m5399a(this.gcamMeta);
                    continue;
                case 186:
                    if (this.lensBlurMeta == null) {
                        this.lensBlurMeta = new kky();
                    }
                    kvc.m5399a(this.lensBlurMeta);
                    continue;
                case 194:
                    if (this.panoMeta == null) {
                        this.panoMeta = new klj();
                    }
                    kvc.m5399a(this.panoMeta);
                    continue;
                case 202:
                    if (this.authorStats == null) {
                        this.authorStats = new kjf();
                    }
                    kvc.m5399a(this.authorStats);
                    continue;
                case XmpUtil.M_SOS /*218*/:
                    if (this.smartBurstMeta == null) {
                        this.smartBurstMeta = new klx();
                    }
                    kvc.m5399a(this.smartBurstMeta);
                    continue;
                case 234:
                    if (this.captureTiming == null) {
                        this.captureTiming = new eventprotos$CaptureTiming();
                    }
                    kvc.m5399a(this.captureTiming);
                    continue;
                case 242:
                    if (this.adviceMeta == null) {
                        this.adviceMeta = new kjd();
                    }
                    kvc.m5399a(this.adviceMeta);
                    continue;
                case ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS /*250*/:
                    if (this.luckyShotMeta == null) {
                        this.luckyShotMeta = new kla();
                    }
                    kvc.m5399a(this.luckyShotMeta);
                    continue;
                case 258:
                    if (this.smartburstCreationMeta == null) {
                        this.smartburstCreationMeta = new klw();
                    }
                    kvc.m5399a(this.smartburstCreationMeta);
                    continue;
                case 266:
                    if (this.meteringData == null) {
                        this.meteringData = new klf();
                    }
                    kvc.m5399a(this.meteringData);
                    continue;
                case 272:
                    b = kvc.m5401b();
                    try {
                        this.hdrPlusSetting = checkTriStateSettingOrThrow(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e3) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 280:
                    this.photosInFlight = kvc.m5410f();
                    continue;
                case 288:
                    b = kvc.m5401b();
                    try {
                        this.captureFailure = checkCaptureFailureOrThrow(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e4) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 298:
                    if (this.microvideoMeta == null) {
                        this.microvideoMeta = new klg();
                    }
                    kvc.m5399a(this.microvideoMeta);
                    continue;
                case 306:
                    if (this.faceretouchingMeta == null) {
                        this.faceretouchingMeta = new kkc();
                    }
                    kvc.m5399a(this.faceretouchingMeta);
                    continue;
                case 314:
                    if (this.portraitMetadata == null) {
                        this.portraitMetadata = new kln();
                    }
                    kvc.m5399a(this.portraitMetadata);
                    continue;
                case 322:
                    if (this.imaxMetadata == null) {
                        this.imaxMetadata = new kkg();
                    }
                    kvc.m5399a(this.imaxMetadata);
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

    public static eventprotos$CaptureDone parseFrom(kvc kvc) {
        return new eventprotos$CaptureDone().mergeFrom(kvc);
    }

    public static eventprotos$CaptureDone parseFrom(byte[] bArr) {
        return (eventprotos$CaptureDone) kvl.mergeFrom(new eventprotos$CaptureDone(), bArr);
    }

    public final void writeTo(kvd kvd) {
        String str = this.fileNameHash;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(1, this.fileNameHash);
        }
        int i = this.mode;
        if (i != 0) {
            kvd.m5431b(3, i);
        }
        boolean z = this.frontCamera;
        if (z) {
            kvd.m5429a(6, z);
        }
        if (Float.floatToIntBits(this.zoomValue) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(7, this.zoomValue);
        }
        if (Float.floatToIntBits(this.processingTime) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(8, this.processingTime);
        }
        kvl kvl = this.exif;
        if (kvl != null) {
            kvd.m5434b(9, kvl);
        }
        z = this.gridLines;
        if (z) {
            kvd.m5429a(10, z);
        }
        if (Float.floatToIntBits(this.timerSeconds) != Float.floatToIntBits(0.0f)) {
            kvd.m5428a(11, this.timerSeconds);
        }
        i = this.flashSetting;
        if (i != 0) {
            kvd.m5431b(12, i);
        }
        z = this.volumeButtonShutter;
        if (z) {
            kvd.m5429a(13, z);
        }
        kvl = this.touchCoord;
        if (kvl != null) {
            kvd.m5434b(14, kvl);
        }
        kkb[] kkbArr = this.face;
        if (kkbArr != null && kkbArr.length > 0) {
            i = 0;
            while (true) {
                kkb[] kkbArr2 = this.face;
                if (i >= kkbArr2.length) {
                    break;
                }
                kvl kvl2 = kkbArr2[i];
                if (kvl2 != null) {
                    kvd.m5434b(15, kvl2);
                }
                i++;
            }
        }
        kvl = this.orientation;
        if (kvl != null) {
            kvd.m5434b(16, kvl);
        }
        kvl = this.photoMeta;
        if (kvl != null) {
            kvd.m5434b(20, kvl);
        }
        kvl = this.videoMeta;
        if (kvl != null) {
            kvd.m5434b(21, kvl);
        }
        kvl = this.gcamMeta;
        if (kvl != null) {
            kvd.m5434b(22, kvl);
        }
        kvl = this.lensBlurMeta;
        if (kvl != null) {
            kvd.m5434b(23, kvl);
        }
        kvl = this.panoMeta;
        if (kvl != null) {
            kvd.m5434b(24, kvl);
        }
        kvl = this.authorStats;
        if (kvl != null) {
            kvd.m5434b(25, kvl);
        }
        kvl = this.smartBurstMeta;
        if (kvl != null) {
            kvd.m5434b(27, kvl);
        }
        kvl = this.captureTiming;
        if (kvl != null) {
            kvd.m5434b(29, kvl);
        }
        kvl = this.adviceMeta;
        if (kvl != null) {
            kvd.m5434b(30, kvl);
        }
        kvl = this.luckyShotMeta;
        if (kvl != null) {
            kvd.m5434b(31, kvl);
        }
        kvl = this.smartburstCreationMeta;
        if (kvl != null) {
            kvd.m5434b(32, kvl);
        }
        kvl = this.meteringData;
        if (kvl != null) {
            kvd.m5434b(33, kvl);
        }
        i = this.hdrPlusSetting;
        if (i != 0) {
            kvd.m5431b(34, i);
        }
        i = this.photosInFlight;
        if (i != 0) {
            kvd.m5431b(35, i);
        }
        i = this.captureFailure;
        if (i != 0) {
            kvd.m5431b(36, i);
        }
        kvl = this.microvideoMeta;
        if (kvl != null) {
            kvd.m5434b(37, kvl);
        }
        kvl = this.faceretouchingMeta;
        if (kvl != null) {
            kvd.m5434b(38, kvl);
        }
        kvl = this.portraitMetadata;
        if (kvl != null) {
            kvd.m5434b(39, kvl);
        }
        kvl = this.imaxMetadata;
        if (kvl != null) {
            kvd.m5434b(40, kvl);
        }
        super.writeTo(kvd);
    }
}
