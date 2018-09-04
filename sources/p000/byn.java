package p000;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.Face;
import android.hardware.camera2.params.MeteringRectangle;
import android.location.Location;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.Range;
import com.google.android.GoogleCamera.R;
import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.AeShotParams;
import com.google.googlex.gcam.AwbInfo;
import com.google.googlex.gcam.BurstSpec;
import com.google.googlex.gcam.ClientExifMetadata;
import com.google.googlex.gcam.FrameMetadata;
import com.google.googlex.gcam.FrameRequestVector;
import com.google.googlex.gcam.Gcam;
import com.google.googlex.gcam.GcamModule;
import com.google.googlex.gcam.GyroSampleVector;
import com.google.googlex.gcam.ImageSaverParams;
import com.google.googlex.gcam.InitParams;
import com.google.googlex.gcam.InterleavedWriteViewU16;
import com.google.googlex.gcam.LocationData;
import com.google.googlex.gcam.PostviewParams;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.ShotCallbacks;
import com.google.googlex.gcam.ShotParams;
import com.google.googlex.gcam.SpatialGainMap;
import com.google.googlex.gcam.hdrplus.ImageConverter;
import com.google.googlex.gcam.hdrplus.MapImageProxyReleaseCallback;
import java.io.File;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: byn */
final class byn implements bym {
    /* renamed from: b */
    private static final String f11461b = bli.m862a("HdrPlusSession");
    /* renamed from: a */
    public final byy f11462a;
    /* renamed from: c */
    private final Gcam f11463c;
    /* renamed from: d */
    private final ilp f11464d;
    /* renamed from: e */
    private final kbg f11465e;
    /* renamed from: f */
    private final DisplayMetrics f11466f;
    /* renamed from: g */
    private final bya f11467g;
    /* renamed from: h */
    private final ffc f11468h;
    /* renamed from: i */
    private final fgw f11469i;
    /* renamed from: j */
    private final iqp f11470j = bxe.m1035a(this.f11468h).f7495b;
    /* renamed from: k */
    private final iqp f11471k;
    /* renamed from: l */
    private final ipz f11472l;
    /* renamed from: m */
    private final PostviewParams f11473m;
    /* renamed from: n */
    private final kwk f11474n;
    /* renamed from: o */
    private final hjw f11475o;
    /* renamed from: p */
    private final ikb f11476p;
    /* renamed from: q */
    private final fer f11477q;
    /* renamed from: r */
    private final caj f11478r;
    /* renamed from: s */
    private final kbg f11479s;
    /* renamed from: t */
    private String f11480t;
    /* renamed from: u */
    private final grk f11481u;
    /* renamed from: v */
    private final bku f11482v;
    /* renamed from: w */
    private final bmh f11483w;
    /* renamed from: x */
    private final bxj f11484x;

    byn(DisplayMetrics displayMetrics, byy byy, bya bya, ffc ffc, fbr fbr, fyy fyy, fgw fgw, Gcam gcam, kwk kwk, hjw hjw, ikb ikb, fer fer, caj caj, kbg kbg, kbg kbg2, bsn bsn, grk grk, bku bku, bmh bmh, bxj bxj) {
        this.f11466f = displayMetrics;
        this.f11462a = byy;
        this.f11467g = bya;
        this.f11468h = ffc;
        this.f11469i = fgw;
        this.f11463c = gcam;
        this.f11464d = fbr.f4463b;
        this.f11475o = hjw;
        this.f11476p = ikb;
        this.f11477q = fer;
        this.f11478r = caj;
        this.f11465e = kbg;
        this.f11479s = kbg2;
        this.f11481u = grk;
        this.f11482v = bku;
        this.f11483w = bmh;
        this.f11484x = bxj;
        this.f11471k = fyy.f4833d;
        this.f11472l = ipz.m4019b(this.f11471k);
        this.f11474n = kwk;
        this.f11480t = null;
        iqp iqp = this.f11470j;
        PostviewParams postviewParams = new PostviewParams();
        postviewParams.setPixel_format(5);
        iqp a = bxe.m1034a(iqp, ((ipz) jri.m13152b(this.f11472l)).m4026b());
        int i = a.f7329a;
        if (i > a.f7330b) {
            postviewParams.setTarget_width(i);
            postviewParams.setTarget_height(0);
        } else {
            postviewParams.setTarget_width(0);
            postviewParams.setTarget_height(a.f7330b);
        }
        this.f11473m = postviewParams;
    }

    /* renamed from: a */
    public final boolean mo617a(int i) {
        return this.f11463c.AbortShot(i);
    }

    /* renamed from: a */
    public final void mo614a(byx byx, int i, iwp iwp, iwz iwz) {
        m7885b();
        FrameMetadata a = this.f11467g.m1050a(iwp, null, null);
        if (m7886c()) {
            bxo.m7846a((String) jri.m13152b(this.f11480t), 1, i, iwp);
        }
        SpatialGainMap a2 = this.f11467g.m1051a(iwp);
        Pair a3 = m7882a(iwz);
        this.f11463c.AddMeteringFrame(byx.f1718a, a, ((Long) a3.first).longValue(), (RawWriteView) a3.second, a2);
    }

    /* renamed from: a */
    public final void mo615a(byx byx, int i, iwp iwp, iwz iwz, iwz iwz2, Face[] faceArr) {
        GyroSampleVector a;
        Pair create;
        long longValue = ((Long) jri.m13152b((Long) iwp.mo3143a(CaptureResult.SENSOR_TIMESTAMP))).longValue();
        long longValue2 = ((Long) jri.m13152b((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME))).longValue();
        ive a2 = bxe.m1035a(this.f11468h);
        long a3 = this.f11468h.mo1912a(a2.f7494a, a2.f7495b) + (longValue2 + longValue);
        if (this.f11479s.mo2084b()) {
            Object bxf = new bxf();
            ((bwp) this.f11479s.mo2081a()).mo2712a(longValue - 5000000, a3 + 5000000, bxf);
            a = bxf.m7842a();
        } else {
            a = null;
        }
        FrameMetadata a4 = this.f11467g.m1050a(iwp, faceArr, a);
        if (m7886c()) {
            bxo.m7846a((String) jri.m13152b(this.f11480t), 2, i, iwp);
        }
        bze bze = byx.f1719b;
        if (iwz != null) {
            longValue2 = iwz.mo2719f();
        } else {
            longValue2 = -1;
        }
        bze.f1737d.add(Long.valueOf(longValue2));
        bze.f1736c.add(iwp);
        SpatialGainMap a5 = this.f11467g.m1051a(iwp);
        Pair a6 = m7882a(iwz);
        if (iwz2 == null) {
            create = Pair.create(Long.valueOf(MapImageProxyReleaseCallback.INVALID_IMAGE_ID), new InterleavedWriteViewU16());
        } else {
            boolean isCompatiblePdFormat = ImageConverter.isCompatiblePdFormat(iwz2.mo2716c());
            int c = iwz2.mo2716c();
            StringBuilder stringBuilder = new StringBuilder(40);
            stringBuilder.append("Incompatible PD data format: ");
            stringBuilder.append(c);
            jri.m13154b(isCompatiblePdFormat, stringBuilder.toString());
            kbg wrapPdWriteView = ImageConverter.wrapPdWriteView(iwz2);
            if (wrapPdWriteView.mo2084b()) {
                create = Pair.create(Long.valueOf(this.f11462a.m1076a(iwz2)), (InterleavedWriteViewU16) wrapPdWriteView.mo2081a());
            } else {
                create = Pair.create(Long.valueOf(MapImageProxyReleaseCallback.INVALID_IMAGE_ID), new InterleavedWriteViewU16());
            }
        }
        if (!this.f11463c.AddPayloadFrame(byx.f1718a, a4, ((Long) a6.first).longValue(), (RawWriteView) a6.second, ((Long) create.first).longValue(), (InterleavedWriteViewU16) create.second, a5)) {
            bli.m866b(f11461b, String.format(null, "addPayloadFrame for shot %d failed, closing input images at frame index %d.", new Object[]{Integer.valueOf(byx.f1718a), Integer.valueOf(i)}));
            if (iwz != null) {
                iwz.close();
            }
            if (iwz2 != null) {
                iwz2.close();
            }
        }
    }

    /* renamed from: a */
    public final BurstSpec mo611a(byx byx) {
        BurstSpec GetMeteringBurstSpec = this.f11463c.GetMeteringBurstSpec(byx.f1718a);
        if (GetMeteringBurstSpec.getFrame_requests().size() == 0) {
            bli.m866b(f11461b, "Gcam::GetMeteringBurstSpec failed.");
            throw new isr("libgcam::GetMeteringBurstSpec() failed.");
        }
        this.f11463c.BeginMeteringFrames(byx.f1718a, GetMeteringBurstSpec);
        return GetMeteringBurstSpec;
    }

    /* renamed from: a */
    public final void mo616a(byx byx, BurstSpec burstSpec) {
        this.f11463c.BeginPayloadFrames(byx.f1718a, burstSpec);
    }

    /* renamed from: a */
    public final BurstSpec mo612a(byx byx, AeResults aeResults) {
        return this.f11463c.BuildPayloadBurstSpec(byx.f1718a, aeResults);
    }

    /* renamed from: b */
    private final void m7885b() {
        if (this.f11476p.mo3049a()) {
            throw new isr("Camera already closed");
        }
    }

    /* renamed from: a */
    public final AeResults mo610a(byx byx, iwp iwp, iwz iwz) {
        Object obj;
        bzc bzc;
        m7885b();
        iqp iqp = this.f11471k;
        jri.m13152b((Object) iwz);
        jri.m13153b(ImageConverter.isCompatibleRawFormat(iwz.mo2716c()));
        bzc bzc2 = new bzc();
        bzc2.f1730a = ImageConverter.wrapRawWriteView(iwz);
        bzc2.f1731b = this.f11467g.m1050a(iwp, null, null);
        bzc2.f1732c = this.f11467g.m1051a(iwp);
        bzc2.f1733d = m7884a(this.f11467g.m1049a(((Integer) jri.m13152b((Integer) iwp.mo3143a(CaptureResult.CONTROL_AE_EXPOSURE_COMPENSATION))).intValue()));
        Rect rect = (Rect) jri.m13152b((Rect) iwp.mo3143a(CaptureResult.SCALER_CROP_REGION));
        if (rect.isEmpty()) {
            String str = f11461b;
            String valueOf = String.valueOf(rect);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
            stringBuilder.append("Invalid scaler crop region: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            obj = null;
        } else {
            this.f11467g.m1052a(bzc2.f1733d, rect, (MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AE_REGIONS), iqp);
            bzc = bzc2;
        }
        bzc = (bzc) jri.m13152b(obj);
        return this.f11463c.ComputeAeResults(byx.f1718a, bzc.f1731b, bzc.f1730a, bzc.f1732c);
    }

    /* renamed from: a */
    private final AeShotParams m7884a(float f) {
        AeShotParams aeShotParams = new AeShotParams();
        aeShotParams.setExposure_compensation(f);
        aeShotParams.setTarget_width(this.f11471k.f7329a);
        aeShotParams.setTarget_height(this.f11471k.f7330b);
        return aeShotParams;
    }

    /* renamed from: c */
    private final boolean m7886c() {
        fgw fgw = this.f11469i;
        boolean z = !fgw.m2283a("persist.gcam.save_hal3_metadata", false) ? fgw.m2283a("persist.gcam.debug", false) : true;
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final BurstSpec mo618b(byx byx) {
        bli.m863a(f11461b, "endMeteringFrames");
        BurstSpec burstSpec = (BurstSpec) jri.m13152b(this.f11463c.EndMeteringFrames(byx.f1718a));
        if (((FrameRequestVector) jri.m13152b(burstSpec.getFrame_requests())).size() == 0) {
            bli.m866b(f11461b, "Gcam did not generate a valid payload burst spec.");
        }
        return burstSpec;
    }

    /* renamed from: c */
    public final boolean mo621c(byx byx) {
        ClientExifMetadata clientExifMetadata;
        Location d = this.f11475o.mo1244d();
        if (d != null) {
            LocationData locationData = new LocationData();
            locationData.setAltitude(d.getAltitude());
            locationData.setDegree_of_precision((double) d.getAccuracy());
            locationData.setLatitude(d.getLatitude());
            locationData.setLongitude(d.getLongitude());
            locationData.setTimestamp_unix(d.getTime() / 1000);
            locationData.setProcessing_method(d.getProvider());
            clientExifMetadata = new ClientExifMetadata();
            clientExifMetadata.setLocation(locationData);
        } else {
            clientExifMetadata = null;
        }
        boolean EndPayloadFrames = this.f11463c.EndPayloadFrames(byx.f1718a, clientExifMetadata, null, null);
        if (EndPayloadFrames) {
            bze bze = byx.f1719b;
            bze.f1735b.f4755d.mo3054a(hci.m11749a((int) R.string.processing_hdr_plus, new Object[0]));
            bze.f1735b.f4755d.mo3050a(0.0f);
        } else {
            bli.m866b(f11461b, "EndPayloadFrames() failed.");
        }
        return EndPayloadFrames;
    }

    /* renamed from: b */
    public final boolean mo619b(int i) {
        return this.f11463c.EndShotCapture(i);
    }

    /* renamed from: c */
    public final int mo620c(int i) {
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i2 < this.f11463c.GetNumCameras()) {
            if (this.f11463c.GetStaticMetadata(i2).getSensor_id() == i) {
                i4++;
                i3 = i2;
            }
            i2++;
        }
        return i4 == 1 ? i3 : -1;
    }

    /* renamed from: a */
    public final InitParams mo613a() {
        return this.f11463c.GetInitParams();
    }

    /* renamed from: a */
    public final byx mo608a(int i, bzx bzx, fwa fwa, fxi fxi, AeResults aeResults, iwp iwp) {
        return m7883a(i, bzx, fwa, fxi, aeResults, iwp, false);
    }

    /* renamed from: a */
    private final byx m7883a(int i, bzx bzx, fwa fwa, fxi fxi, AeResults aeResults, iwp iwp, boolean z) {
        int i2;
        String str;
        m7885b();
        bli.m863a(f11461b, "startShotCapture()");
        jri.m13152b((Object) bzx);
        float a = this.f11467g.m1049a(((Integer) this.f11464d.mo2860b()).intValue());
        int a2 = axm.m734a(fwa.f4752a.f4445a, this.f11468h);
        boolean b = bzx.mo596b().mo2084b();
        int max_full_metering_sweep_frames = this.f11463c.GetInitParams().getMax_full_metering_sweep_frames();
        ShotParams shotParams = new ShotParams();
        shotParams.setFull_metering_sweep_frame_count(max_full_metering_sweep_frames);
        shotParams.setImage_rotation(bxe.m1030a(a2));
        shotParams.setManually_rotate_final_jpg(true);
        shotParams.setSave_merged_dng(b);
        shotParams.setCompress_merged_dng(true);
        shotParams.setAe(m7884a(a));
        if (this.f11465e.mo2084b()) {
            shotParams.setResampling_method_override(0);
        }
        shotParams.setFlash_mode(bya.m1042a(fxi));
        shotParams.setAllow_temporal_binning(this.f11469i.m2283a("persist.gcam.temporal_binning", false));
        shotParams.setRecompute_wb_on_base_frame(false);
        if (this.f11477q.mo2860b() == feq.AUTO) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        shotParams.setWb_mode(i2);
        if (z) {
            str = "z";
        } else {
            str = "n";
        }
        shotParams.setSoftware_suffix(str);
        shotParams.setZsl(z);
        if (z) {
            jri.m13144a(true, (Object) "Incorrect base frame hint.");
            shotParams.setZsl_base_frame_index_hint(-1);
        } else {
            AwbInfo b2 = this.f11467g.m1054b(iwp);
            shotParams.setForce_wb(b2);
            shotParams.setPrevious_viewfinder_wb(b2);
        }
        bya bya = this.f11467g;
        if (iwp == null) {
            throw new IllegalArgumentException("source should not be null");
        }
        Object obj;
        ImageSaverParams imageSaverParams;
        int i3;
        boolean z2;
        long longValue = ((Long) jri.m13152b((Long) iwp.mo3143a(CaptureResult.SENSOR_EXPOSURE_TIME))).longValue();
        float f = ((float) longValue) / 1000000.0f;
        iwp iwp2 = iwp;
        a = (((float) ((Integer) jri.m13152b((Integer) iwp2.mo3143a(CaptureResult.SENSOR_SENSITIVITY))).intValue()) / ((float) ((Integer) ((Range) jri.m13152b((Range) bya.f1715a.mo1913a(CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE))).getLower()).intValue())) * f;
        shotParams.setPrevious_viewfinder_tet(a);
        String str2 = f11461b;
        StringBuilder stringBuilder = new StringBuilder(70);
        stringBuilder.append("takePicture - Using captured WB from viewfinder, TET = ");
        stringBuilder.append(a);
        bli.m871d(str2, stringBuilder.toString());
        if (aeResults == null) {
            this.f11467g.m1052a(shotParams.getAe(), (Rect) jri.m13152b((Rect) iwp.mo3143a(CaptureResult.SCALER_CROP_REGION)), (MeteringRectangle[]) iwp.mo3143a(CaptureResult.CONTROL_AE_REGIONS), this.f11471k);
        }
        bze bze = new bze(bzx, this.f11466f, fwa, this.f11462a.f1721b.getExecute_finish_on(), this.f11481u, this.f11482v, this.f11483w);
        ShotCallbacks shotCallbacks = new ShotCallbacks();
        if (bze.f1750q.mo601g().mo2084b()) {
            shotCallbacks.setProgress_callback(bze.f1738e);
        }
        shotCallbacks.setStatus_callback(bze.f1739f);
        if (bze.f1750q.mo595a().mo2084b()) {
            shotCallbacks.setBase_frame_callback(bze.f1740g);
        }
        if (bze.f1750q.mo600f().mo2084b()) {
            shotCallbacks.setPostview_rgb_allocator(bze.f1746m);
            shotCallbacks.setPostview_callback(bze.f1741h);
        }
        if (bze.f1750q.mo596b().mo2084b()) {
            shotCallbacks.setMerged_dng_callback(bze.f1743j);
        }
        if (bze.f1750q.mo599e().mo2084b()) {
            shotCallbacks.setMerged_pd_allocator(bze.f1749p);
            shotCallbacks.setMerged_pd_callback(bze.f1742i);
        }
        if (bze.f1750q.mo602h().mo2084b()) {
            shotCallbacks.setFinal_image_rgb_allocator(bze.f1747n);
            shotCallbacks.setFinal_image_callback(bze.f1744k);
        }
        if (bze.f1750q.mo604j().mo2084b()) {
            shotCallbacks.setFinal_image_yuv_allocator(bze.f1748o);
            shotCallbacks.setFinal_image_callback(bze.f1744k);
        }
        if (bze.f1750q.mo598d().mo2084b()) {
            shotCallbacks.setJpeg_callback(bze.f1745l);
        }
        kbg kbg = (kbg) this.f11474n.mo345a();
        if (this.f11469i.m2281a()) {
            obj = 1;
        } else if (this.f11469i.m2284b()) {
            obj = 1;
        } else if (this.f11469i.m2285c()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            imageSaverParams = null;
        } else if (kbg.mo2084b()) {
            imageSaverParams = new ImageSaverParams();
            this.f11480t = bxe.m1037a((File) kbg.mo2081a(), "gcam", fwa.f4753b.mo2884l());
            imageSaverParams.setDest_folder(this.f11480t);
        } else {
            imageSaverParams = null;
        }
        if (bzx.mo602h().mo2084b()) {
            i3 = 3;
        } else if (bzx.mo604j().mo2084b()) {
            i3 = 1;
        } else if (bzx.mo598d().mo2084b()) {
            i3 = 0;
        } else {
            throw new RuntimeException("No primary output can be inferred.");
        }
        int StartShotCapture = this.f11463c.StartShotCapture(i, shotParams, shotCallbacks, i3, this.f11473m, imageSaverParams);
        if (StartShotCapture != GcamModule.getKInvalidShotId()) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13144a(z2, (Object) "Gcam::StartShotCapture() returned an invalid shot id.");
        fwa.f4752a.f4451g.mo1879a(this.f11484x.m1038a(StartShotCapture));
        for (iwp a3 : this.f11478r.m7926a()) {
            this.f11463c.AddFrameMetadataForLogging(StartShotCapture, this.f11467g.m1050a(a3, null, null));
        }
        byx byx = new byx(StartShotCapture, bze);
        this.f11462a.f1722c.put(Integer.valueOf(StartShotCapture), byx);
        bze.f1751r = new byo(this, StartShotCapture);
        return byx;
    }

    /* renamed from: a */
    public final byx mo609a(int i, bzx bzx, fwa fwa, fxi fxi, iwp iwp) {
        return m7883a(i, bzx, fwa, fxi, null, iwp, true);
    }

    /* renamed from: a */
    private final Pair m7882a(iwz iwz) {
        if (iwz == null) {
            return Pair.create(Long.valueOf(MapImageProxyReleaseCallback.INVALID_IMAGE_ID), new RawWriteView());
        }
        boolean isCompatibleRawFormat = ImageConverter.isCompatibleRawFormat(iwz.mo2716c());
        int c = iwz.mo2716c();
        StringBuilder stringBuilder = new StringBuilder(42);
        stringBuilder.append("Incompatible Raw image format: ");
        stringBuilder.append(c);
        jri.m13154b(isCompatibleRawFormat, stringBuilder.toString());
        return Pair.create(Long.valueOf(this.f11462a.m1076a(iwz)), ImageConverter.wrapRawWriteView(iwz));
    }
}
