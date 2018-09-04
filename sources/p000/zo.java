package p000;

import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: zo */
final class zo extends aaz {
    /* renamed from: x */
    private zp f19773x = new zp();
    /* renamed from: y */
    private zq f19774y = new zq();

    static {
        aby aby = new aby("AndCamCapabs");
    }

    zo(Parameters parameters) {
        super(new abe());
        this.o = parameters.getMaxExposureCompensation();
        this.n = parameters.getMinExposureCompensation();
        this.p = parameters.getExposureCompensationStep();
        this.q = parameters.getMaxNumDetectedFaces();
        this.s = parameters.getMaxNumMeteringAreas();
        this.m = new abw(parameters.getPreferredPreviewSizeForVideo());
        this.d.addAll(parameters.getSupportedPreviewFormats());
        this.g.addAll(parameters.getSupportedPictureFormats());
        this.u = parameters.getHorizontalViewAngle();
        this.v = parameters.getVerticalViewAngle();
        Collection supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        if (supportedPreviewFpsRange != null) {
            this.b.addAll(supportedPreviewFpsRange);
        }
        Collections.sort(this.b, this.f19773x);
        List<Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes != null) {
            for (Size size : supportedPreviewSizes) {
                this.c.add(new abw(size.width, size.height));
            }
        }
        Collections.sort(this.c, this.f19774y);
        supportedPreviewSizes = parameters.getSupportedVideoSizes();
        if (supportedPreviewSizes != null) {
            for (Size size2 : supportedPreviewSizes) {
                this.e.add(new abw(size2.width, size2.height));
            }
        }
        Collections.sort(this.e, this.f19774y);
        supportedPreviewSizes = parameters.getSupportedPictureSizes();
        if (supportedPreviewSizes != null) {
            for (Size size22 : supportedPreviewSizes) {
                this.f.add(new abw(size22.width, size22.height));
            }
        }
        Collections.sort(this.f, this.f19774y);
        List<String> supportedSceneModes = parameters.getSupportedSceneModes();
        if (supportedSceneModes != null) {
            for (String str : supportedSceneModes) {
                if ("auto".equals(str)) {
                    this.h.add(abd.AUTO);
                } else if ("action".equals(str)) {
                    this.h.add(abd.ACTION);
                } else if ("barcode".equals(str)) {
                    this.h.add(abd.BARCODE);
                } else if ("beach".equals(str)) {
                    this.h.add(abd.BEACH);
                } else if ("candlelight".equals(str)) {
                    this.h.add(abd.CANDLELIGHT);
                } else if ("fireworks".equals(str)) {
                    this.h.add(abd.FIREWORKS);
                } else if ("hdr".equals(str)) {
                    this.h.add(abd.HDR);
                } else if ("landscape".equals(str)) {
                    this.h.add(abd.LANDSCAPE);
                } else if ("night".equals(str)) {
                    this.h.add(abd.NIGHT);
                } else if ("night-portrait".equals(str)) {
                    this.h.add(abd.NIGHT_PORTRAIT);
                } else if ("party".equals(str)) {
                    this.h.add(abd.PARTY);
                } else if ("portrait".equals(str)) {
                    this.h.add(abd.PORTRAIT);
                } else if ("snow".equals(str)) {
                    this.h.add(abd.SNOW);
                } else if ("sports".equals(str)) {
                    this.h.add(abd.SPORTS);
                } else if ("steadyphoto".equals(str)) {
                    this.h.add(abd.STEADYPHOTO);
                } else if ("sunset".equals(str)) {
                    this.h.add(abd.SUNSET);
                } else if ("theatre".equals(str)) {
                    this.h.add(abd.THEATRE);
                }
            }
        }
        supportedSceneModes = parameters.getSupportedFlashModes();
        if (supportedSceneModes == null) {
            this.i.add(abb.NO_FLASH);
        } else {
            for (String str2 : supportedSceneModes) {
                if ("auto".equals(str2)) {
                    this.i.add(abb.AUTO);
                } else if ("off".equals(str2)) {
                    this.i.add(abb.OFF);
                } else if ("on".equals(str2)) {
                    this.i.add(abb.ON);
                } else if ("red-eye".equals(str2)) {
                    this.i.add(abb.RED_EYE);
                } else if ("torch".equals(str2)) {
                    this.i.add(abb.TORCH);
                }
            }
        }
        supportedSceneModes = parameters.getSupportedFocusModes();
        if (supportedSceneModes != null) {
            for (String str22 : supportedSceneModes) {
                if ("auto".equals(str22)) {
                    this.j.add(abc.AUTO);
                } else if ("continuous-picture".equals(str22)) {
                    this.j.add(abc.CONTINUOUS_PICTURE);
                } else if ("continuous-video".equals(str22)) {
                    this.j.add(abc.CONTINUOUS_VIDEO);
                } else if ("edof".equals(str22)) {
                    this.j.add(abc.EXTENDED_DOF);
                } else if ("fixed".equals(str22)) {
                    this.j.add(abc.FIXED);
                } else if ("infinity".equals(str22)) {
                    this.j.add(abc.INFINITY);
                } else if ("macro".equals(str22)) {
                    this.j.add(abc.MACRO);
                }
            }
        }
        supportedSceneModes = parameters.getSupportedFocusModes();
        if (supportedSceneModes != null) {
            for (String str222 : supportedSceneModes) {
                if ("auto".equals(str222)) {
                    this.k.add(abf.AUTO);
                } else if ("cloudy-daylight".equals(str222)) {
                    this.k.add(abf.CLOUDY_DAYLIGHT);
                } else if ("daylight".equals(str222)) {
                    this.k.add(abf.DAYLIGHT);
                } else if ("fluorescent".equals(str222)) {
                    this.k.add(abf.FLUORESCENT);
                } else if ("incandescent".equals(str222)) {
                    this.k.add(abf.INCANDESCENT);
                } else if ("shade".equals(str222)) {
                    this.k.add(abf.SHADE);
                } else if ("twilight".equals(str222)) {
                    this.k.add(abf.TWILIGHT);
                } else if ("warm-fluorescent".equals(str222)) {
                    this.k.add(abf.WARM_FLUORESCENT);
                }
            }
        }
        if (parameters.isZoomSupported()) {
            this.t = ((float) ((Integer) parameters.getZoomRatios().get(parameters.getMaxZoom())).intValue()) / 100.0f;
            this.l.add(aba.ZOOM);
        }
        if (parameters.isVideoSnapshotSupported()) {
            this.l.add(aba.VIDEO_SNAPSHOT);
        }
        if (parameters.isAutoExposureLockSupported()) {
            this.l.add(aba.AUTO_EXPOSURE_LOCK);
        }
        if (parameters.isAutoWhiteBalanceLockSupported()) {
            this.l.add(aba.AUTO_WHITE_BALANCE_LOCK);
        }
        if (m34a(abc.AUTO)) {
            this.r = parameters.getMaxNumFocusAreas();
            if (this.r > 0) {
                this.l.add(aba.FOCUS_AREA);
            }
        }
        if (this.s > 0) {
            this.l.add(aba.METERING_AREA);
        }
    }

    zo(zo zoVar) {
        super((aaz) zoVar);
    }
}
