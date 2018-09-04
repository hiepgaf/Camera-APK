package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.logging.nano.eventprotos$CameraEvent;
import com.google.common.logging.nano.eventprotos$CaptureDone;

/* compiled from: PG */
/* renamed from: epp */
public final class epp {
    /* renamed from: a */
    public static final String f4043a = bli.m862a("CptDoneEvntBldr");
    /* renamed from: b */
    public final eventprotos$CameraEvent f4044b;

    public epp(int i, boolean z, String str) {
        boolean z2;
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13143a(z2);
        this.f4044b = new eventprotos$CameraEvent();
        this.f4044b.captureDoneEvent = new eventprotos$CaptureDone();
        eventprotos$CameraEvent eventprotos_cameraevent = this.f4044b;
        eventprotos_cameraevent.eventType = 3;
        eventprotos$CaptureDone eventprotos_capturedone = eventprotos_cameraevent.captureDoneEvent;
        eventprotos_capturedone.mode = i;
        eventprotos_capturedone.fileNameHash = ept.m1984a().m1986a(str);
        this.f4044b.captureDoneEvent.frontCamera = z;
    }

    /* renamed from: a */
    public final epp m1950a(isu isu) {
        if (isu == null) {
            bli.m869c(f4043a, "exif data is null; not adding to stats");
        } else {
            eventprotos$CaptureDone eventprotos_capturedone = this.f4044b.captureDoneEvent;
            kka kka = new kka();
            String tagStringValue = isu.getTagStringValue(ExifInterface.f12392d);
            if (tagStringValue != null) {
                kka.f22146b = tagStringValue;
            }
            tagStringValue = isu.getTagStringValue(ExifInterface.f12393e);
            if (tagStringValue != null) {
                kka.f22146b = tagStringValue;
            }
            tagStringValue = isu.getTagStringValue(ExifInterface.TAG_SOFTWARE);
            if (tagStringValue != null) {
                kka.f22145a = tagStringValue;
            }
            iqn b = isu.mo829b(ExifInterface.f12402n);
            if (b != null) {
                kka.f22147c = ((float) b.f7327a) / ((float) b.f7328b);
            }
            Integer a = isu.mo828a(ExifInterface.f12404p);
            if (a != null) {
                kka.f22148d = a.intValue();
            }
            b = isu.mo829b(ExifInterface.f12410v);
            if (b != null) {
                kka.f22149e = ((float) b.f7327a) / ((float) b.f7328b);
            }
            b = isu.mo829b(ExifInterface.f12406r);
            if (b != null) {
                kka.f22150f = ((float) b.f7327a) / ((float) b.f7328b);
            }
            boolean z = isu.mo829b(ExifInterface.f12371E) == null ? false : isu.mo829b(ExifInterface.f12373G) != null;
            kka.f22151g = z;
            a = isu.mo828a(ExifInterface.f12395g);
            if (a != null) {
                kka.f22152h = a.intValue();
            }
            a = isu.mo828a(ExifInterface.f12413y);
            if (a != null) {
                kka.f22153i = a.intValue();
            }
            a = isu.mo828a(ExifInterface.f12412x);
            if (a != null) {
                kka.f22154j = a.intValue();
            }
            a = isu.mo828a(ExifInterface.f12409u);
            if (a != null) {
                kka.f22155k = true;
                kka.f22156l = a.intValue();
            } else {
                kka.f22155k = false;
            }
            b = isu.mo829b(ExifInterface.f12407s);
            if (b != null) {
                kka.f22157m = ((float) b.f7327a) / ((float) b.f7328b);
            }
            eventprotos_capturedone.exif = kka;
        }
        return this;
    }

    /* renamed from: a */
    public final epp m1949a(int i) {
        this.f4044b.captureDoneEvent.flashSetting = i;
        return this;
    }

    /* renamed from: a */
    public final epp m1952a(boolean z) {
        this.f4044b.captureDoneEvent.gridLines = z;
        return this;
    }

    /* renamed from: a */
    public final epp m1948a(float f) {
        this.f4044b.captureDoneEvent.processingTime = f;
        return this;
    }

    /* renamed from: a */
    public final epp m1951a(kmf kmf) {
        this.f4044b.captureDoneEvent.videoMeta = kmf;
        return this;
    }

    /* renamed from: b */
    public final epp m1953b(float f) {
        this.f4044b.captureDoneEvent.zoomValue = f;
        return this;
    }
}
