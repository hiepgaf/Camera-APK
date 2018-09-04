package com.google.common.logging.nano;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.camera.metadata.refocus.XmpUtil;
import p000.kje;
import p000.kji;
import p000.kjl;
import p000.kjo;
import p000.kjp;
import p000.kjq;
import p000.kjr;
import p000.kjs;
import p000.kjt;
import p000.kju;
import p000.kjv;
import p000.kjx;
import p000.kjy;
import p000.kkd;
import p000.kkl;
import p000.kkw;
import p000.klc;
import p000.kld;
import p000.kle;
import p000.klh;
import p000.kli;
import p000.klm;
import p000.klo;
import p000.klp;
import p000.kmc;
import p000.kvc;
import p000.kvd;
import p000.kve;
import p000.kvf;
import p000.kvj;
import p000.kvl;

/* compiled from: PG */
public final class eventprotos$CameraEvent extends kvf {
    public static volatile eventprotos$CameraEvent[] _emptyArray;
    public kje adviceShown;
    public String appVersionName;
    public eventprotos$BackgroundEvent backgroundEvent;
    public kji blockShotEvent;
    public int buildSource;
    public kjl cameraContentProviderEvent;
    public kjo cameraFailure;
    public kjp cameraPrewarmEvent;
    public kjq captureComputeEvent;
    public eventprotos$CaptureDone captureDoneEvent;
    public kjr captureProfileAbortedEvent;
    public kjs captureProfileDeletedEvent;
    public eventprotos$CaptureProfileEvent captureProfileEvent;
    public kjt captureProfileFailedEvent;
    public kju captureProfileStartCommittedEvent;
    public kjv captureProfileStartEvent;
    public kjx changeCameraEvent;
    public long clientFirstUseMillis;
    public kjy controlEvent;
    public int counter;
    public int eventType;
    public kkd foregroundEvent;
    public boolean googler;
    public klc interaction;
    public kkl irisEvent;
    public boolean isTestDevice;
    public kkw launchPhotosReviewEvent;
    public kld memoryReport;
    public kle memoryWindowStats;
    public klh navigationChange;
    public kli openDeviceRetryEvent;
    public klm photoVideoModeChangeEvent;
    public klo preferenceChangeEvent;
    public klp preferencesEvent;
    public int runId;
    public long sessionId;
    public kmc storageWarning;
    public String timezone;

    public eventprotos$CameraEvent() {
        clear();
    }

    public static int checkBuildSourceOrThrow(int i) {
        if (i >= 0 && i <= 3) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum BuildSource");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkBuildSourceOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkBuildSourceOrThrow : iArr2) {
            checkBuildSourceOrThrow(checkBuildSourceOrThrow);
        }
        return iArr2;
    }

    public static int checkEventTypeOrThrow(int i) {
        if ((i >= 0 && i <= 1) || ((i >= 3 && i <= 7) || (i >= 12 && i <= 34))) {
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder(41);
        stringBuilder.append(i);
        stringBuilder.append(" is not a valid enum EventType");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int[] checkEventTypeOrThrow(int[] iArr) {
        int[] iArr2 = (int[]) iArr.clone();
        for (int checkEventTypeOrThrow : iArr2) {
            checkEventTypeOrThrow(checkEventTypeOrThrow);
        }
        return iArr2;
    }

    public final eventprotos$CameraEvent clear() {
        this.eventType = 0;
        this.googler = false;
        this.timezone = "";
        this.navigationChange = null;
        this.captureDoneEvent = null;
        this.interaction = null;
        this.foregroundEvent = null;
        this.cameraFailure = null;
        this.controlEvent = null;
        this.captureComputeEvent = null;
        this.memoryReport = null;
        this.memoryWindowStats = null;
        this.storageWarning = null;
        this.backgroundEvent = null;
        this.captureProfileStartEvent = null;
        this.captureProfileEvent = null;
        this.captureProfileAbortedEvent = null;
        this.cameraPrewarmEvent = null;
        this.openDeviceRetryEvent = null;
        this.changeCameraEvent = null;
        this.blockShotEvent = null;
        this.captureProfileFailedEvent = null;
        this.captureProfileStartCommittedEvent = null;
        this.captureProfileDeletedEvent = null;
        this.clientFirstUseMillis = 0;
        this.runId = 0;
        this.counter = 0;
        this.sessionId = 0;
        this.buildSource = 0;
        this.isTestDevice = false;
        this.preferencesEvent = null;
        this.cameraContentProviderEvent = null;
        this.launchPhotosReviewEvent = null;
        this.photoVideoModeChangeEvent = null;
        this.appVersionName = "";
        this.adviceShown = null;
        this.preferenceChangeEvent = null;
        this.irisEvent = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
        return this;
    }

    protected final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.eventType;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(1, i);
        }
        if (this.googler) {
            computeSerializedSize += kvd.m5423b(16) + 1;
        }
        String str = this.timezone;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(3, this.timezone);
        }
        kvl kvl = this.navigationChange;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(4, kvl);
        }
        kvl = this.captureDoneEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(6, kvl);
        }
        kvl = this.interaction;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(7, kvl);
        }
        kvl = this.foregroundEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(8, kvl);
        }
        kvl = this.cameraFailure;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(9, kvl);
        }
        kvl = this.controlEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(12, kvl);
        }
        kvl = this.captureComputeEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(13, kvl);
        }
        kvl = this.memoryReport;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(14, kvl);
        }
        kvl = this.memoryWindowStats;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(15, kvl);
        }
        kvl = this.storageWarning;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(16, kvl);
        }
        kvl = this.backgroundEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(17, kvl);
        }
        kvl = this.captureProfileStartEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(18, kvl);
        }
        kvl = this.captureProfileEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(19, kvl);
        }
        kvl = this.captureProfileAbortedEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(20, kvl);
        }
        kvl = this.cameraPrewarmEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(21, kvl);
        }
        kvl = this.openDeviceRetryEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(22, kvl);
        }
        kvl = this.changeCameraEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(23, kvl);
        }
        kvl = this.blockShotEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(24, kvl);
        }
        kvl = this.captureProfileFailedEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(25, kvl);
        }
        kvl = this.captureProfileStartCommittedEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(26, kvl);
        }
        kvl = this.captureProfileDeletedEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(27, kvl);
        }
        long j = this.clientFirstUseMillis;
        if (j != 0) {
            computeSerializedSize += kvd.m5416a(30, j);
        }
        if (this.runId != 0) {
            computeSerializedSize += kvd.m5423b(248) + 4;
        }
        i = this.counter;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(32, i);
        }
        if (this.sessionId != 0) {
            computeSerializedSize += kvd.m5423b(264) + 8;
        }
        i = this.buildSource;
        if (i != 0) {
            computeSerializedSize += kvd.m5415a(34, i);
        }
        if (this.isTestDevice) {
            computeSerializedSize += kvd.m5423b(280) + 1;
        }
        kvl = this.preferencesEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(36, kvl);
        }
        kvl = this.cameraContentProviderEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(37, kvl);
        }
        kvl = this.launchPhotosReviewEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(38, kvl);
        }
        kvl = this.photoVideoModeChangeEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(39, kvl);
        }
        str = this.appVersionName;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += kvd.m5417a(40, this.appVersionName);
        }
        kvl = this.adviceShown;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(41, kvl);
        }
        kvl = this.preferenceChangeEvent;
        if (kvl != null) {
            computeSerializedSize += kvd.m5418a(42, kvl);
        }
        kvl = this.irisEvent;
        if (kvl != null) {
            return computeSerializedSize + kvd.m5418a(43, kvl);
        }
        return computeSerializedSize;
    }

    public static eventprotos$CameraEvent[] emptyArray() {
        if (_emptyArray == null) {
            synchronized (kvj.f8655b) {
                if (_emptyArray == null) {
                    _emptyArray = new eventprotos$CameraEvent[0];
                }
            }
        }
        return _emptyArray;
    }

    public final eventprotos$CameraEvent mergeFrom(kvc kvc) {
        int b;
        while (true) {
            int i = kvc.m5413i();
            switch (i) {
                case 0:
                    break;
                case 8:
                    b = kvc.m5401b();
                    try {
                        this.eventType = checkEventTypeOrThrow(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 16:
                    this.googler = kvc.m5405c();
                    continue;
                case 26:
                    this.timezone = kvc.m5412h();
                    continue;
                case 34:
                    if (this.navigationChange == null) {
                        this.navigationChange = new klh();
                    }
                    kvc.m5399a(this.navigationChange);
                    continue;
                case 50:
                    if (this.captureDoneEvent == null) {
                        this.captureDoneEvent = new eventprotos$CaptureDone();
                    }
                    kvc.m5399a(this.captureDoneEvent);
                    continue;
                case 58:
                    if (this.interaction == null) {
                        this.interaction = new klc();
                    }
                    kvc.m5399a(this.interaction);
                    continue;
                case 66:
                    if (this.foregroundEvent == null) {
                        this.foregroundEvent = new kkd();
                    }
                    kvc.m5399a(this.foregroundEvent);
                    continue;
                case 74:
                    if (this.cameraFailure == null) {
                        this.cameraFailure = new kjo();
                    }
                    kvc.m5399a(this.cameraFailure);
                    continue;
                case 98:
                    if (this.controlEvent == null) {
                        this.controlEvent = new kjy();
                    }
                    kvc.m5399a(this.controlEvent);
                    continue;
                case 106:
                    if (this.captureComputeEvent == null) {
                        this.captureComputeEvent = new kjq();
                    }
                    kvc.m5399a(this.captureComputeEvent);
                    continue;
                case 114:
                    if (this.memoryReport == null) {
                        this.memoryReport = new kld();
                    }
                    kvc.m5399a(this.memoryReport);
                    continue;
                case 122:
                    if (this.memoryWindowStats == null) {
                        this.memoryWindowStats = new kle();
                    }
                    kvc.m5399a(this.memoryWindowStats);
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_ctrsm /*130*/:
                    if (this.storageWarning == null) {
                        this.storageWarning = new kmc();
                    }
                    kvc.m5399a(this.storageWarning);
                    continue;
                case ScriptIntrinsicBLAS.RsBlas_cherk /*138*/:
                    if (this.backgroundEvent == null) {
                        this.backgroundEvent = new eventprotos$BackgroundEvent();
                    }
                    kvc.m5399a(this.backgroundEvent);
                    continue;
                case 146:
                    if (this.captureProfileStartEvent == null) {
                        this.captureProfileStartEvent = new kjv();
                    }
                    kvc.m5399a(this.captureProfileStartEvent);
                    continue;
                case 154:
                    if (this.captureProfileEvent == null) {
                        this.captureProfileEvent = new eventprotos$CaptureProfileEvent();
                    }
                    kvc.m5399a(this.captureProfileEvent);
                    continue;
                case 162:
                    if (this.captureProfileAbortedEvent == null) {
                        this.captureProfileAbortedEvent = new kjr();
                    }
                    kvc.m5399a(this.captureProfileAbortedEvent);
                    continue;
                case 170:
                    if (this.cameraPrewarmEvent == null) {
                        this.cameraPrewarmEvent = new kjp();
                    }
                    kvc.m5399a(this.cameraPrewarmEvent);
                    continue;
                case 178:
                    if (this.openDeviceRetryEvent == null) {
                        this.openDeviceRetryEvent = new kli();
                    }
                    kvc.m5399a(this.openDeviceRetryEvent);
                    continue;
                case 186:
                    if (this.changeCameraEvent == null) {
                        this.changeCameraEvent = new kjx();
                    }
                    kvc.m5399a(this.changeCameraEvent);
                    continue;
                case 194:
                    if (this.blockShotEvent == null) {
                        this.blockShotEvent = new kji();
                    }
                    kvc.m5399a(this.blockShotEvent);
                    continue;
                case 202:
                    if (this.captureProfileFailedEvent == null) {
                        this.captureProfileFailedEvent = new kjt();
                    }
                    kvc.m5399a(this.captureProfileFailedEvent);
                    continue;
                case 210:
                    if (this.captureProfileStartCommittedEvent == null) {
                        this.captureProfileStartCommittedEvent = new kju();
                    }
                    kvc.m5399a(this.captureProfileStartCommittedEvent);
                    continue;
                case XmpUtil.M_SOS /*218*/:
                    if (this.captureProfileDeletedEvent == null) {
                        this.captureProfileDeletedEvent = new kjs();
                    }
                    kvc.m5399a(this.captureProfileDeletedEvent);
                    continue;
                case 240:
                    this.clientFirstUseMillis = kvc.m5411g();
                    continue;
                case 253:
                    this.runId = kvc.m5406d();
                    continue;
                case 256:
                    this.counter = kvc.m5410f();
                    continue;
                case 265:
                    this.sessionId = kvc.m5408e();
                    continue;
                case 272:
                    b = kvc.m5401b();
                    try {
                        this.buildSource = checkBuildSourceOrThrow(kvc.m5410f());
                        continue;
                    } catch (IllegalArgumentException e2) {
                        kvc.m5407d(b);
                        storeUnknownField(kvc, i);
                        break;
                    }
                case 280:
                    this.isTestDevice = kvc.m5405c();
                    continue;
                case 290:
                    if (this.preferencesEvent == null) {
                        this.preferencesEvent = new klp();
                    }
                    kvc.m5399a(this.preferencesEvent);
                    continue;
                case 298:
                    if (this.cameraContentProviderEvent == null) {
                        this.cameraContentProviderEvent = new kjl();
                    }
                    kvc.m5399a(this.cameraContentProviderEvent);
                    continue;
                case 306:
                    if (this.launchPhotosReviewEvent == null) {
                        this.launchPhotosReviewEvent = new kkw();
                    }
                    kvc.m5399a(this.launchPhotosReviewEvent);
                    continue;
                case 314:
                    if (this.photoVideoModeChangeEvent == null) {
                        this.photoVideoModeChangeEvent = new klm();
                    }
                    kvc.m5399a(this.photoVideoModeChangeEvent);
                    continue;
                case 322:
                    this.appVersionName = kvc.m5412h();
                    continue;
                case 330:
                    if (this.adviceShown == null) {
                        this.adviceShown = new kje();
                    }
                    kvc.m5399a(this.adviceShown);
                    continue;
                case 338:
                    if (this.preferenceChangeEvent == null) {
                        this.preferenceChangeEvent = new klo();
                    }
                    kvc.m5399a(this.preferenceChangeEvent);
                    continue;
                case 346:
                    if (this.irisEvent == null) {
                        this.irisEvent = new kkl();
                    }
                    kvc.m5399a(this.irisEvent);
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

    public static eventprotos$CameraEvent parseFrom(kvc kvc) {
        return new eventprotos$CameraEvent().mergeFrom(kvc);
    }

    public static eventprotos$CameraEvent parseFrom(byte[] bArr) {
        return (eventprotos$CameraEvent) kvl.mergeFrom(new eventprotos$CameraEvent(), bArr);
    }

    public final void writeTo(kvd kvd) {
        int i = this.eventType;
        if (i != 0) {
            kvd.m5431b(1, i);
        }
        boolean z = this.googler;
        if (z) {
            kvd.m5429a(2, z);
        }
        String str = this.timezone;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(3, this.timezone);
        }
        kvl kvl = this.navigationChange;
        if (kvl != null) {
            kvd.m5434b(4, kvl);
        }
        kvl = this.captureDoneEvent;
        if (kvl != null) {
            kvd.m5434b(6, kvl);
        }
        kvl = this.interaction;
        if (kvl != null) {
            kvd.m5434b(7, kvl);
        }
        kvl = this.foregroundEvent;
        if (kvl != null) {
            kvd.m5434b(8, kvl);
        }
        kvl = this.cameraFailure;
        if (kvl != null) {
            kvd.m5434b(9, kvl);
        }
        kvl = this.controlEvent;
        if (kvl != null) {
            kvd.m5434b(12, kvl);
        }
        kvl = this.captureComputeEvent;
        if (kvl != null) {
            kvd.m5434b(13, kvl);
        }
        kvl = this.memoryReport;
        if (kvl != null) {
            kvd.m5434b(14, kvl);
        }
        kvl = this.memoryWindowStats;
        if (kvl != null) {
            kvd.m5434b(15, kvl);
        }
        kvl = this.storageWarning;
        if (kvl != null) {
            kvd.m5434b(16, kvl);
        }
        kvl = this.backgroundEvent;
        if (kvl != null) {
            kvd.m5434b(17, kvl);
        }
        kvl = this.captureProfileStartEvent;
        if (kvl != null) {
            kvd.m5434b(18, kvl);
        }
        kvl = this.captureProfileEvent;
        if (kvl != null) {
            kvd.m5434b(19, kvl);
        }
        kvl = this.captureProfileAbortedEvent;
        if (kvl != null) {
            kvd.m5434b(20, kvl);
        }
        kvl = this.cameraPrewarmEvent;
        if (kvl != null) {
            kvd.m5434b(21, kvl);
        }
        kvl = this.openDeviceRetryEvent;
        if (kvl != null) {
            kvd.m5434b(22, kvl);
        }
        kvl = this.changeCameraEvent;
        if (kvl != null) {
            kvd.m5434b(23, kvl);
        }
        kvl = this.blockShotEvent;
        if (kvl != null) {
            kvd.m5434b(24, kvl);
        }
        kvl = this.captureProfileFailedEvent;
        if (kvl != null) {
            kvd.m5434b(25, kvl);
        }
        kvl = this.captureProfileStartCommittedEvent;
        if (kvl != null) {
            kvd.m5434b(26, kvl);
        }
        kvl = this.captureProfileDeletedEvent;
        if (kvl != null) {
            kvd.m5434b(27, kvl);
        }
        long j = this.clientFirstUseMillis;
        if (j != 0) {
            kvd.m5432b(30, j);
        }
        i = this.runId;
        if (i != 0) {
            kvd.m5436c(31, 5);
            kvd.m5438d(i);
        }
        i = this.counter;
        if (i != 0) {
            kvd.m5431b(32, i);
        }
        j = this.sessionId;
        if (j != 0) {
            kvd.m5436c(33, 1);
            if (kvd.f8643a.remaining() < 8) {
                throw new kve(kvd.f8643a.position(), kvd.f8643a.limit());
            }
            kvd.f8643a.putLong(j);
        }
        i = this.buildSource;
        if (i != 0) {
            kvd.m5431b(34, i);
        }
        z = this.isTestDevice;
        if (z) {
            kvd.m5429a(35, z);
        }
        kvl = this.preferencesEvent;
        if (kvl != null) {
            kvd.m5434b(36, kvl);
        }
        kvl = this.cameraContentProviderEvent;
        if (kvl != null) {
            kvd.m5434b(37, kvl);
        }
        kvl = this.launchPhotosReviewEvent;
        if (kvl != null) {
            kvd.m5434b(38, kvl);
        }
        kvl = this.photoVideoModeChangeEvent;
        if (kvl != null) {
            kvd.m5434b(39, kvl);
        }
        str = this.appVersionName;
        if (!(str == null || str.equals(""))) {
            kvd.m5433b(40, this.appVersionName);
        }
        kvl = this.adviceShown;
        if (kvl != null) {
            kvd.m5434b(41, kvl);
        }
        kvl = this.preferenceChangeEvent;
        if (kvl != null) {
            kvd.m5434b(42, kvl);
        }
        kvl = this.irisEvent;
        if (kvl != null) {
            kvd.m5434b(43, kvl);
        }
        super.writeTo(kvd);
    }
}
