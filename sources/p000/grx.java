package p000;

import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.logging.nano.eventprotos$BackgroundEvent;
import com.google.common.logging.nano.eventprotos$CameraEvent;
import com.google.common.logging.nano.eventprotos$CaptureDone;
import com.google.common.logging.nano.eventprotos$CaptureProfileEvent;
import com.google.common.logging.nano.eventprotos$CaptureTiming;
import com.google.common.logging.nano.eventprotos$LaunchReport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: grx */
public final class grx implements irs {
    /* renamed from: b */
    private static final String f17271b = bli.m862a("UsageStats");
    /* renamed from: u */
    private static final long f17272u = 3000000000L;
    /* renamed from: a */
    public epc f17273a;
    /* renamed from: c */
    private final String f17274c;
    /* renamed from: d */
    private int f17275d;
    /* renamed from: e */
    private long f17276e;
    /* renamed from: f */
    private final AtomicInteger f17277f = new AtomicInteger(0);
    /* renamed from: g */
    private final ept f17278g;
    /* renamed from: h */
    private final iya f17279h;
    /* renamed from: i */
    private String f17280i;
    /* renamed from: j */
    private String f17281j;
    /* renamed from: k */
    private final List f17282k = new ArrayList();
    /* renamed from: l */
    private long f17283l = 0;
    /* renamed from: m */
    private boolean f17284m = true;
    /* renamed from: n */
    private long f17285n = 0;
    /* renamed from: o */
    private bku f17286o;
    /* renamed from: p */
    private eio f17287p;
    /* renamed from: q */
    private int f17288q = 0;
    /* renamed from: r */
    private final ScheduledExecutorService f17289r;
    /* renamed from: s */
    private LinkedHashMap f17290s = new LinkedHashMap();
    /* renamed from: t */
    private int f17291t = 0;
    /* renamed from: v */
    private long f17292v;
    /* renamed from: w */
    private boolean f17293w = false;

    public grx(ept ept, iya iya, int i, String str, String str2, ScheduledExecutorService scheduledExecutorService, bku bku, boolean z, epc epc, eio eio, String str3) {
        this.f17278g = ept;
        this.f17279h = iya;
        this.f17275d = i;
        this.f17280i = str;
        this.f17281j = str2;
        this.f17289r = scheduledExecutorService;
        this.f17286o = bku;
        this.f17293w = z;
        this.f17287p = eio;
        this.f17273a = epc;
        this.f17274c = str3;
    }

    /* renamed from: a */
    public final void mo1577a(int i, klq[] klqArr, eventprotos$LaunchReport eventprotos_launchreport) {
        String str = f17271b;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("backgrounded (mode ");
        stringBuilder.append(i);
        stringBuilder.append(")");
        bli.m869c(str, stringBuilder.toString());
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f17290s.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            gsc gsc = (gsc) this.f17290s.get(str2);
            long j = gsc.f5665a;
            if (elapsedRealtime > 30000 + j) {
                long j2 = gsc.f5667c;
                eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
                eventprotos_cameraevent.eventType = 5;
                eventprotos_cameraevent.interaction = new klc();
                klc klc = eventprotos_cameraevent.interaction;
                klc.f22318a = 6;
                klc.f22320c = this.f17278g.m1986a(str2);
                klc klc2 = eventprotos_cameraevent.interaction;
                klc2.f22322e = gsc.f5666b;
                klc2.f22321d = ((float) (j2 - j)) * 0.001f;
                m11434a(eventprotos_cameraevent);
                it.remove();
            }
        }
        eventprotos$CameraEvent eventprotos_cameraevent2 = new eventprotos$CameraEvent();
        eventprotos_cameraevent2.eventType = 14;
        eventprotos$BackgroundEvent eventprotos_backgroundevent = new eventprotos$BackgroundEvent();
        if (!(klqArr == null || klqArr.length == 0)) {
            eventprotos_backgroundevent.previewSmoothnessReport = klqArr;
        }
        eventprotos_backgroundevent.launchReport = eventprotos_launchreport;
        List list = this.f17282k;
        kjz[] kjzArr = (kjz[]) list.toArray(new kjz[list.size()]);
        this.f17282k.clear();
        eventprotos_backgroundevent.dirtyLensEvents = kjzArr;
        if (i == 1) {
            if (this.f17284m) {
                eventprotos_backgroundevent.shutterButtonDisabledDuration = -1.0f;
            } else {
                eventprotos_backgroundevent.shutterButtonDisabledDuration = ((float) (elapsedRealtimeNanos - this.f17285n)) / 1.0E9f;
            }
        }
        this.f17284m = true;
        this.f17285n = 0;
        eventprotos_cameraevent2.backgroundEvent = eventprotos_backgroundevent;
        m11434a(eventprotos_cameraevent2);
    }

    /* renamed from: b */
    private static kjw m11418b(int i, int i2) {
        kjw kjw = new kjw();
        kjw.f22127a = i;
        kjw.f22128b = i2;
        return kjw;
    }

    /* renamed from: a */
    private static String m11415a(kjj kjj) {
        int i = kjj.f22087a;
        if (i == 0) {
            return "-UNKNOWN";
        }
        if (i == 1) {
            return "-API1_JPEG";
        }
        if (i == 9) {
            return "-API2BETA_HDR_PLUS";
        }
        if (i == 10) {
            return "-API2_LEGACY";
        }
        if (i == 14) {
            return "-API2_LIMITED";
        }
        if (i == 12) {
            return "-API2_ZSL";
        }
        if (i == 13) {
            return "-API2_HDR_PLUS";
        }
        if (i == 11) {
            return "-API2_AUTO_HDR_PLUS";
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("-UNKNOWN-");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo1574a(int i, String str, int i2, int i3) {
        m11416a(i, str, i2, i3, 0);
    }

    /* renamed from: a */
    private final void m11416a(int i, String str, int i2, int i3, int i4) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 7;
        eventprotos_cameraevent.cameraFailure = new kjo();
        kjo kjo = eventprotos_cameraevent.cameraFailure;
        kjo.f22098a = i;
        kjo.f22103f = i4;
        if (str != null) {
            kjo.f22099b = str;
        }
        kjo.f22100c = this.f17281j;
        if (i2 != -1) {
            kjo.f22101d = i2;
        }
        if (i3 != -1) {
            kjo.f22102e = i3;
        }
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1575a(int i, kll kll, kkx kkx, klu klu) {
        this.f17283l = SystemClock.elapsedRealtime();
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 13;
        eventprotos_cameraevent.captureComputeEvent = new kjq();
        kjq kjq = eventprotos_cameraevent.captureComputeEvent;
        kjq.f22106a = i;
        if (kkx != null) {
            kjq.f22107b = kkx;
        }
        if (kll != null) {
            kjq.f22108c = kll;
        }
        if (klu != null) {
            kjq.f22109d = klu;
        }
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1571a(int i, int i2, long j, long j2) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 23;
        eventprotos_cameraevent.changeCameraEvent = new kjx();
        kjx kjx = eventprotos_cameraevent.changeCameraEvent;
        kjx.f22129a = i;
        kjx.f22130b = i2;
        kjx.f22131c = j;
        kjx.f22132d = j2;
        kjx.f22133e = this.f17291t;
        long j3 = this.f17283l;
        long j4 = this.f17292v;
        long j5 = j4 / 1000000;
        long j6 = f17272u;
        kjx kjx2 = eventprotos_cameraevent.changeCameraEvent;
        boolean z = j - j4 < j6 ? j3 < j5 : false;
        kjx2.f22134f = z;
        m11434a(eventprotos_cameraevent);
        this.f17291t = 0;
        this.f17292v = j2;
    }

    /* renamed from: a */
    public final void mo1568a(int i, int i2) {
        mo1596b(i, i2, 0, 0);
    }

    /* renamed from: b */
    public final void mo1596b(int i, int i2, long j, long j2) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 1;
        eventprotos_cameraevent.navigationChange = new klh();
        klh klh = eventprotos_cameraevent.navigationChange;
        klh.f22353b = i;
        klh.f22354c = i2;
        int i3 = this.f17288q;
        klh.f22352a = i3;
        klh.f22356e = j;
        klh.f22357f = j2;
        if (i == 2 && this.f17283l != 0 && (i3 == 7 || i3 == 5 || i3 == 1 || i3 == 8 || i3 == 6 || i3 == 11)) {
            klh.f22355d = ((float) (SystemClock.elapsedRealtime() - this.f17283l)) / 1000.0f;
        }
        this.f17283l = 0;
        klh = eventprotos_cameraevent.navigationChange;
        i3 = klh.f22352a;
        if (!(i3 == 0 || i3 == klh.f22353b)) {
            m11434a(eventprotos_cameraevent);
        }
        this.f17288q = i;
    }

    /* renamed from: a */
    public final void mo1567a(int i) {
        m11417a(i, null, null);
    }

    /* renamed from: a */
    private final void m11417a(int i, kmd kmd, klr klr) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 12;
        eventprotos_cameraevent.controlEvent = new kjy();
        kjy kjy = eventprotos_cameraevent.controlEvent;
        kjy.f22135a = i;
        kjy.f22136b = this.f17288q;
        if (kmd != null) {
            kjy.f22137c = kmd;
        }
        if (klr != null) {
            kjy.f22138d = klr;
        }
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1570a(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        String str = f17271b;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("foregrounded (mode ");
        stringBuilder.append(i3);
        stringBuilder.append(")");
        bli.m869c(str, stringBuilder.toString());
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 6;
        eventprotos_cameraevent.foregroundEvent = new kkd();
        kkd kkd = eventprotos_cameraevent.foregroundEvent;
        kkd.f22172a = i;
        kkd.f22173b = i3;
        kkd.f22174c = this.f17281j;
        kkd.f22175d = z;
        kkd.f22176e = z2;
        kkd.f22177f = z3;
        kkd.f22178g = 0;
        kkd.f22179h = i2;
        m11434a(eventprotos_cameraevent);
        this.f17289r.execute(new gsa(this));
    }

    /* renamed from: a */
    public final long mo1566a() {
        return this.f17276e;
    }

    /* renamed from: b */
    public final boolean mo1599b() {
        return this.f17293w;
    }

    /* renamed from: a */
    public final void mo1572a(int i, int i2, String str, float f, float f2) {
        epp a = new epp(i, false, str).m1953b(1.0f).m1948a(f);
        if (i == 11) {
            klj klj = new klj();
            klj.f22359a = i2;
            klj.f22360b = f2;
            a.f4044b.captureDoneEvent.panoMeta = klj;
        }
        mo1581a(a);
    }

    /* renamed from: c */
    public final void mo1600c() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 28;
        eventprotos_cameraevent.preferencesEvent = new klp();
        klp klp = eventprotos_cameraevent.preferencesEvent;
        klp.f22380a = 1;
        klp.f22381b = 1;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: d */
    public final void mo1603d() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 28;
        eventprotos_cameraevent.preferencesEvent = new klp();
        klp klp = eventprotos_cameraevent.preferencesEvent;
        klp.f22380a = 2;
        klp.f22381b = 1;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1584a(String str, int i, float f) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 5;
        eventprotos_cameraevent.interaction = new klc();
        eventprotos_cameraevent.interaction.f22320c = this.f17278g.m1986a(str);
        klc klc = eventprotos_cameraevent.interaction;
        klc.f22318a = i;
        klc.f22319b = 1;
        if (f != 0.0f) {
            klc.f22321d = f;
        }
        m11434a(eventprotos_cameraevent);
        if (i == 2) {
            this.f17289r.execute(new grz(this));
        }
    }

    /* renamed from: e */
    public final void mo1604e() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 7;
        eventprotos_cameraevent.cameraFailure = new kjo();
        kjo kjo = eventprotos_cameraevent.cameraFailure;
        kjo.f22098a = 8;
        kjo.f22100c = this.f17281j;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1585a(String str, long j, float f) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 30000 + j) {
            if (this.f17290s.containsKey(str)) {
                gsc gsc = (gsc) this.f17290s.get(str);
                if (f > gsc.f5666b) {
                    gsc.f5666b = f;
                    gsc.f5667c = elapsedRealtime;
                    return;
                }
                return;
            }
            this.f17290s.put(str, new gsc(j, f, elapsedRealtime));
        }
    }

    /* renamed from: f */
    public final void mo1605f() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 32;
        eventprotos_cameraevent.adviceShown = new kje();
        eventprotos_cameraevent.adviceShown.f22062a = 1;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1588a(String str, Object obj, Object obj2) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 33;
        eventprotos_cameraevent.preferenceChangeEvent = new klo();
        klo klo = eventprotos_cameraevent.preferenceChangeEvent;
        klo.f22375b = str;
        if (obj2 instanceof Boolean) {
            klo.f22374a = 1;
            klo.f22376c = ((Boolean) obj).booleanValue();
            eventprotos_cameraevent.preferenceChangeEvent.f22377d = ((Boolean) obj2).booleanValue();
        } else if (obj2 instanceof String) {
            klo.f22374a = 2;
            klo.f22378e = (String) obj;
            klo.f22379f = (String) obj2;
        }
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1580a(long j, glw glw, int i, int i2) {
        kjj kjj = new kjj();
        kjj.f22087a = grx.m11413a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 20;
        eventprotos_cameraevent.captureProfileAbortedEvent = new kjr();
        kjr kjr = eventprotos_cameraevent.captureProfileAbortedEvent;
        kjr.f22111b = j;
        kjr.f22112c = SystemClock.elapsedRealtimeNanos();
        kjr = eventprotos_cameraevent.captureProfileAbortedEvent;
        kjr.f22110a = kjj;
        kjr.f22113d = grx.m11418b(i, i2);
        String a = grx.m11415a(kjj);
        String str = f17271b;
        a = String.valueOf(a);
        String str2 = "onCaptureCanceled";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m873e(str, a);
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1579a(long j, glw glw) {
        kjj kjj = new kjj();
        kjj.f22087a = grx.m11413a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 27;
        eventprotos_cameraevent.captureProfileDeletedEvent = new kjs();
        kjs kjs = eventprotos_cameraevent.captureProfileDeletedEvent;
        kjs.f22115b = j;
        kjs.f22116c = SystemClock.elapsedRealtimeNanos();
        eventprotos_cameraevent.captureProfileDeletedEvent.f22114a = kjj;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: b */
    public final void mo1598b(long j, glw glw, int i, int i2) {
        kjj kjj = new kjj();
        kjj.f22087a = grx.m11413a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 25;
        eventprotos_cameraevent.captureProfileFailedEvent = new kjt();
        kjt kjt = eventprotos_cameraevent.captureProfileFailedEvent;
        kjt.f22118b = j;
        kjt.f22119c = SystemClock.elapsedRealtimeNanos();
        kjt = eventprotos_cameraevent.captureProfileFailedEvent;
        kjt.f22117a = kjj;
        kjt.f22120d = grx.m11418b(i, i2);
        String a = grx.m11415a(kjj);
        String str = f17271b;
        a = String.valueOf(a);
        String str2 = "onCaptureFailed";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m873e(str, a);
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1578a(long j, long j2, long j3, long j4, long j5, long j6, long j7, klb[] klbArr, long j8, glw glw, int i, int i2) {
        kjj kjj = new kjj();
        kjj.f22087a = grx.m11413a(glw);
        eventprotos$CaptureTiming eventprotos_capturetiming = new eventprotos$CaptureTiming();
        eventprotos_capturetiming.captureStartNs = j;
        if (j2 > 0) {
            eventprotos_capturetiming.captureTinyThumbNs = j2;
        }
        if (j3 > 0) {
            eventprotos_capturetiming.captureMediumThumbNs = j3;
        }
        if (j4 > 0) {
            eventprotos_capturetiming.captureProcessingStartNs = j4;
        }
        if (j5 > 0) {
            eventprotos_capturetiming.captureProcessingEndNs = j5;
        }
        if (j8 > 0) {
            eventprotos_capturetiming.capturePersistedEndNs = j8;
        }
        if (j6 > 0) {
            eventprotos_capturetiming.captureFrameSelectStartNs = j6;
        }
        if (j7 > 0) {
            eventprotos_capturetiming.captureFrameSelectEndNs = j7;
        }
        if (klbArr != null) {
            eventprotos_capturetiming.captureScoreCalculations = klbArr;
        }
        eventprotos$CaptureProfileEvent eventprotos_captureprofileevent = new eventprotos$CaptureProfileEvent();
        eventprotos_captureprofileevent.timing = eventprotos_capturetiming;
        eventprotos_captureprofileevent.cameraConfiguration = kjj;
        eventprotos_captureprofileevent.captureTrace = grx.m11418b(i, i2);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 19;
        eventprotos_cameraevent.captureProfileEvent = eventprotos_captureprofileevent;
        String a = grx.m11415a(kjj);
        String str = f17271b;
        a = String.valueOf(a);
        String str2 = "onCapturePersisted";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m869c(str, a);
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: c */
    public final void mo1602c(long j, glw glw, int i, int i2) {
        kjj kjj = new kjj();
        kjj.f22087a = grx.m11413a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 26;
        eventprotos_cameraevent.captureProfileStartCommittedEvent = new kju();
        kju kju = eventprotos_cameraevent.captureProfileStartCommittedEvent;
        kju.f22122b = j;
        kju.f22123c = SystemClock.elapsedRealtimeNanos();
        kju = eventprotos_cameraevent.captureProfileStartCommittedEvent;
        kju.f22121a = kjj;
        kju.f22124d = grx.m11418b(i, i2);
        String a = grx.m11415a(kjj);
        String str = f17271b;
        a = String.valueOf(a);
        String str2 = "onCaptureStartCommitted";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m869c(str, a);
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: b */
    public final void mo1597b(long j, glw glw) {
        kjj kjj = new kjj();
        kjj.f22087a = grx.m11413a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 18;
        eventprotos_cameraevent.captureProfileStartEvent = new kjv();
        kjv kjv = eventprotos_cameraevent.captureProfileStartEvent;
        kjv.f22126b = j;
        kjv.f22125a = kjj;
        String a = grx.m11415a(kjj);
        String str = f17271b;
        a = String.valueOf(a);
        String str2 = "onCaptureStarted";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m869c(str, a);
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1592a(boolean z) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!this.f17284m && z) {
            long j = this.f17285n;
            if (j != 0) {
                eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
                eventprotos_cameraevent.eventType = 24;
                eventprotos_cameraevent.blockShotEvent = new kji();
                kji kji = eventprotos_cameraevent.blockShotEvent;
                kji.f22084a = j;
                kji.f22085b = elapsedRealtimeNanos;
                kji.f22086c = this.f17288q;
                m11434a(eventprotos_cameraevent);
            }
        }
        this.f17285n = elapsedRealtimeNanos;
        this.f17284m = z;
    }

    /* renamed from: b */
    public final void mo1595b(int i) {
        m11416a(9, null, -1, -1, i);
    }

    /* renamed from: a */
    public final void mo1583a(irt irt) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 22;
        eventprotos_cameraevent.openDeviceRetryEvent = new kli();
        eventprotos_cameraevent.openDeviceRetryEvent.f22358a = irt.f7380d;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1573a(int i, epr epr, ExifInterface exifInterface, boolean z, Float f, List list, kla kla, int i2, epu epu, Long l, Integer num, klg klg, kkc kkc, kln kln, Long l2) {
        long longValue;
        this.f17283l = SystemClock.elapsedRealtime();
        klk klk = new klk();
        klk.f22361a = epr.mo1251g();
        klk.f22362b = z;
        if (l2 == null) {
            bli.m873e(f17271b, "Submitting log event with zero file size");
        }
        if (l2 != null) {
            longValue = l2.longValue() / 1024;
        } else {
            longValue = 0;
        }
        klk.f22363c = longValue;
        epp b = new epp(i, epr.mo1248d(), epr.mo1246b()).m1950a((isu) exifInterface).m1953b(epr.mo1258n());
        String c = epr.mo1247c();
        if (c == null) {
            bli.m869c(epp.f4043a, "flashSetting is null, not adding to stats");
        } else {
            b.f4044b.captureDoneEvent.flashSetting = 0;
            if (c.equals("off")) {
                b.f4044b.captureDoneEvent.flashSetting = 1;
            } else if (c.equals("auto")) {
                b.f4044b.captureDoneEvent.flashSetting = 2;
            } else if (c.equals("on") || c.equals("torch")) {
                b.f4044b.captureDoneEvent.flashSetting = 3;
            }
        }
        b = b.m1952a(epr.mo1249e());
        float k = epr.mo1255k();
        eventprotos$CaptureDone eventprotos_capturedone = b.f4044b.captureDoneEvent;
        eventprotos_capturedone.timerSeconds = k;
        eventprotos_capturedone.photoMeta = klk;
        epp a = b.m1948a(f.floatValue());
        hin hin = (hin) epr.mo1256l().mo2085c();
        if (hin == null) {
            bli.m869c(epp.f4043a, "touch is null, not adding to stats");
        } else {
            kme kme = new kme();
            kme.f22444a = hin.f6236a;
            kme.f22445b = hin.f6237b;
            kme.f22446c = hin.f6238c;
            kme.f22447d = hin.f6239d;
            a.f4044b.captureDoneEvent.touchCoord = kme;
        }
        a.f4044b.captureDoneEvent.volumeButtonShutter = epr.mo1257m().booleanValue();
        Rect a2 = epr.mo1245a();
        if (list == null) {
            bli.m869c(epp.f4043a, "camera2Faces is null, not adding to stats");
        } else {
            int min = Math.min(5, list.size());
            kkb[] kkbArr = new kkb[min];
            for (int i3 = 0; i3 < min; i3++) {
                gic gic = (gic) list.get(i3);
                Rect rect = gic.f5202a;
                kkb kkb = new kkb();
                kkb.f22161a = (float) rect.left;
                kkb.f22163c = (float) rect.top;
                kkb.f22162b = (float) rect.right;
                kkb.f22164d = (float) rect.bottom;
                kkb.f22167g = (float) gic.f5203b;
                if (a2 != null) {
                    kkb.f22165e = (float) a2.right;
                    kkb.f22166f = (float) a2.bottom;
                }
                kkbArr[i3] = kkb;
            }
            a.f4044b.captureDoneEvent.face = kkbArr;
        }
        bli.m863a(epp.f4043a, "dirtyLensProbability is null, not adding to stats");
        eventprotos$CaptureDone eventprotos_capturedone2 = a.f4044b.captureDoneEvent;
        eventprotos_capturedone2.captureFailure = i2;
        if (kla == null) {
            bli.m869c(epp.f4043a, "luckyShotMeta is null, not adding to stats");
        } else {
            eventprotos_capturedone2.luckyShotMeta = kla;
        }
        if (epr.mo1253i().mo2084b()) {
            a.f4044b.captureDoneEvent.meteringData = (klf) epr.mo1253i().mo2081a();
        }
        if (epu != null) {
            a.f4044b.captureDoneEvent.gcamMeta = epu.f4065a;
        }
        if (l != null) {
            kmf kmf = new kmf();
            kmf.f22449b = l.longValue();
            a.m1951a(kmf);
        }
        if (num != null) {
            a.f4044b.captureDoneEvent.photosInFlight = num.intValue();
        }
        if (klg != null) {
            a.f4044b.captureDoneEvent.microvideoMeta = klg;
        }
        if (kkc != null) {
            a.f4044b.captureDoneEvent.faceretouchingMeta = kkc;
        }
        if (kln != null) {
            a.f4044b.captureDoneEvent.portraitMetadata = kln;
        }
        mo1581a(a);
    }

    /* renamed from: a */
    public final void mo1590a(String str, boolean z, glw glw) {
        String str2 = f17271b;
        String valueOf = String.valueOf(glw);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 66) + String.valueOf(valueOf).length());
        stringBuilder.append("Log photo review launch event for ");
        stringBuilder.append(str);
        stringBuilder.append(", in progress=");
        stringBuilder.append(z);
        stringBuilder.append(", media type=");
        stringBuilder.append(valueOf);
        bli.m863a(str2, stringBuilder.toString());
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.launchPhotosReviewEvent = new kkw();
        eventprotos_cameraevent.eventType = 30;
        kkw kkw = eventprotos_cameraevent.launchPhotosReviewEvent;
        kkw.f22289a = str;
        kkw.f22290b = z;
        switch (glw.ordinal()) {
            case 1:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 1;
                break;
            case 2:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 2;
                break;
            case 3:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 3;
                break;
            case 4:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 31;
                break;
            case 5:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 20;
                break;
            case 6:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 20;
                break;
            case 7:
            case 8:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 30;
                break;
            case 12:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 10;
                break;
            case 13:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 32;
                break;
            default:
                eventprotos_cameraevent.launchPhotosReviewEvent.f22291c = 0;
                break;
        }
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: c */
    public final void mo1601c(int i) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 31;
        eventprotos_cameraevent.photoVideoModeChangeEvent = new klm();
        klm klm = eventprotos_cameraevent.photoVideoModeChangeEvent;
        klm.f22369a = 2;
        klm.f22370b = i;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1569a(int i, int i2, int i3, float f, int i4) {
        kll kll = new kll();
        kll.f22364a = i2;
        kll.f22365b = i3;
        kll.f22366c = f;
        switch (i4 - 1) {
            case 0:
                kll.f22367d = 3;
                break;
            case 1:
                kll.f22367d = 2;
                break;
            case 2:
                kll.f22367d = 1;
                break;
            default:
                kll.f22367d = 0;
                break;
        }
        mo1575a(i, kll, null, null);
    }

    /* renamed from: a */
    final void m11434a(eventprotos$CameraEvent eventprotos_cameraevent) {
        if (this.f17273a != null) {
            int i = eventprotos_cameraevent.eventType;
            if (i == 3 || i == 13 || i == 6) {
                eventprotos_cameraevent.timezone = this.f17280i;
            }
            eventprotos_cameraevent.isTestDevice = this.f17293w;
            eventprotos_cameraevent.runId = this.f17275d;
            switch (this.f17286o.ordinal()) {
                case 1:
                    eventprotos_cameraevent.buildSource = 1;
                    break;
                case 2:
                    eventprotos_cameraevent.buildSource = 2;
                    break;
                case 3:
                    eventprotos_cameraevent.buildSource = 3;
                    break;
                default:
                    eventprotos_cameraevent.buildSource = 0;
                    break;
            }
            eventprotos_cameraevent.appVersionName = this.f17274c;
            eventprotos_cameraevent.sessionId = this.f17276e;
            eventprotos_cameraevent.counter = this.f17277f.getAndIncrement();
            this.f17289r.execute(new gry(this, eventprotos_cameraevent));
        }
    }

    /* renamed from: g */
    public final void mo1606g() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 21;
        kjp kjp = new kjp();
        kjp.f22105a = 2;
        eventprotos_cameraevent.cameraPrewarmEvent = kjp;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: h */
    public final void mo1607h() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 21;
        kjp kjp = new kjp();
        kjp.f22105a = 1;
        eventprotos_cameraevent.cameraPrewarmEvent = kjp;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: i */
    public final void mo1608i() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 21;
        kjp kjp = new kjp();
        kjp.f22105a = 3;
        eventprotos_cameraevent.cameraPrewarmEvent = kjp;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1594a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        kkx kkx = new kkx();
        kkx.f22292a = z;
        kkx.f22293b = z2;
        kkx.f22294c = z3;
        kkx.f22295d = z4;
        kkx.f22296e = z5;
        kkx.f22297f = z6;
        kkx.f22298g = z7;
        kkx.f22299h = z8;
        kkx.f22300i = z9;
        mo1575a(6, null, kkx, null);
    }

    /* renamed from: a */
    public final void mo1586a(String str, ExifInterface exifInterface, boolean z, float f, boolean z2) {
        int i;
        kky kky = new kky();
        if (z2) {
            i = 1;
        } else {
            i = 2;
        }
        kky.f22305a = i;
        epp b = new epp(6, z, str).m1950a((isu) exifInterface).m1953b(1.0f);
        b.f4044b.captureDoneEvent.lensBlurMeta = kky;
        mo1581a(b.m1948a(f));
    }

    /* renamed from: a */
    public final void mo1591a(HashMap hashMap, String str) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 15;
        eventprotos_cameraevent.memoryReport = new kld();
        kld kld = eventprotos_cameraevent.memoryReport;
        kld.f22324a = str;
        kld.f22325b = ((Long) hashMap.get("availMem")).longValue();
        eventprotos_cameraevent.memoryReport.f22326c = ((Long) hashMap.get("totalMem")).longValue();
        eventprotos_cameraevent.memoryReport.f22327d = ((Long) hashMap.get("memoryClass")).longValue();
        eventprotos_cameraevent.memoryReport.f22328e = ((Long) hashMap.get("largeMemoryClass")).longValue();
        eventprotos_cameraevent.memoryReport.f22329f = ((Long) hashMap.get("totalPSS")).longValue();
        eventprotos_cameraevent.memoryReport.f22330g = ((Long) hashMap.get("nativePSS")).longValue();
        eventprotos_cameraevent.memoryReport.f22331h = ((Long) hashMap.get("dalvikPSS")).longValue();
        eventprotos_cameraevent.memoryReport.f22332i = ((Long) hashMap.get("otherPSS")).longValue();
        eventprotos_cameraevent.memoryReport.f22333j = ((Long) hashMap.get("threshold")).longValue();
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    private static int m11413a(glw glw) {
        if (glw == glw.HDR_PLUS) {
            return 13;
        }
        if (glw == glw.NORMAL) {
            return 12;
        }
        if (glw == glw.HDR_PLUS_AUTO) {
            return 11;
        }
        return 0;
    }

    /* renamed from: j */
    public final void mo1609j() {
        this.f17291t = 1;
    }

    /* renamed from: k */
    public final long mo1610k() {
        this.f17276e = UUID.randomUUID().getLeastSignificantBits();
        return this.f17276e;
    }

    /* renamed from: a */
    public final void mo1589a(String str, klx klx, iut iut, float f) {
        boolean z;
        if (iut == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        epp a = new epp(17, z, str).m1953b(1.0f).m1948a(f);
        if (klx == null) {
            bli.m869c(epp.f4043a, "smartBurstMeta is null, not adding to stats");
        } else {
            a.f4044b.captureDoneEvent.smartBurstMeta = klx;
        }
        mo1581a(a);
    }

    /* renamed from: l */
    public final void mo1611l() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 17;
        eventprotos_cameraevent.storageWarning = new kmc();
        eventprotos_cameraevent.storageWarning.f22438a = -4;
        m11434a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo1581a(epp epp) {
        this.f17289r.execute(new gsb(this, epp));
    }

    /* renamed from: a */
    public final void mo1582a(hin hin, Float f, boolean z) {
        kmd kmd = new kmd();
        if (f != null) {
            kmd.f22440b = f.floatValue();
        }
        kme kme = new kme();
        if (hin != null) {
            kme.f22444a = hin.f6236a;
            kme.f22445b = hin.f6237b;
            kme.f22446c = hin.f6238c;
            kme.f22447d = hin.f6239d;
        }
        kmd.f22439a = kme;
        kmd.f22441c = z;
        m11417a(1, kmd, null);
    }

    /* renamed from: a */
    public final void mo1576a(int i, boolean z) {
        klr klr = new klr();
        klr.f22392a = i;
        klr.f22393b = z;
        m11417a(7, null, klr);
    }

    /* renamed from: a */
    public final void mo1593a(boolean z, String str, iut iut, iqp iqp, long j, long j2, float f, boolean z2, boolean z3, boolean z4, int i) {
        int i2;
        boolean z5;
        this.f17283l = SystemClock.elapsedRealtime();
        kmf kmf = new kmf();
        kmf.f22448a = (float) TimeUnit.MILLISECONDS.toSeconds(j);
        kmf.f22451d = iqp.f7329a;
        kmf.f22450c = iqp.f7330b;
        kmf.f22449b = j2;
        kmf.f22452e = f;
        kmf.f22453f = z4;
        kmf.f22454g = i;
        if (z) {
            i2 = 20;
        } else {
            i2 = 8;
        }
        if (iut == iut.FRONT) {
            z5 = true;
        } else {
            z5 = false;
        }
        epp epp = new epp(i2, z5, str);
        if (z2) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        mo1581a(epp.m1949a(i2).m1952a(z3).m1951a(kmf));
    }

    /* renamed from: a */
    public final void mo1587a(String str, iut iut, isu isu, float f, boolean z, float f2) {
        boolean z2;
        int i = 1;
        this.f17283l = SystemClock.elapsedRealtime();
        if (iut == iut.FRONT) {
            z2 = true;
        } else {
            z2 = false;
        }
        epp epp = new epp(9, z2, str);
        epp b = epp.m1950a(isu).m1953b(f);
        if (z) {
            i = 3;
        }
        b.m1949a(i).m1948a(f2);
        mo1581a(epp);
    }
}
