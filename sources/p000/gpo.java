package p000;

import com.google.android.GoogleCamera.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: gpo */
public final class gpo implements gpn {
    /* renamed from: c */
    private static final kpk f17189c = kow.m13617a(Integer.valueOf(-1));
    /* renamed from: a */
    public final gpu f17190a;
    /* renamed from: b */
    public boolean f17191b;
    /* renamed from: d */
    private final AtomicReference f17192d = new AtomicReference(f17189c);
    /* renamed from: e */
    private final ird f17193e;

    static {
        bli.m862a("SoundPlayer");
    }

    public gpo(gpu gpu, ird ird, ikd ikd, ena ena) {
        this.f17190a = gpu;
        this.f17193e = ird;
        eio.m1756a(ikd, ena, new gpq(this));
    }

    /* renamed from: a */
    public final void mo1547a() {
        this.f17190a.mo1555a();
    }

    /* renamed from: a */
    public final void mo1548a(int i) {
        if (this.f17191b) {
            this.f17190a.mo1557b(i);
        }
    }

    /* renamed from: b */
    public final void mo1549b() {
        kow.m13622a((kpk) this.f17192d.getAndSet(f17189c), new gpp(this), kpq.f8410a);
        if (this.f17191b) {
            this.f17190a.mo1557b(R.raw.camera_burst_end);
        }
    }

    /* renamed from: c */
    public final void mo1550c() {
        if (this.f17191b) {
            this.f17190a.mo1557b(R.raw.camera_burst_start);
            this.f17192d.set(this.f17190a.mo1558c(R.raw.camera_burst_loop));
        }
    }

    /* renamed from: d */
    public final void mo1551d() {
        this.f17193e.mo1903a("Sounds#shutter");
        this.f17190a.mo1554a(R.raw.camera_shutter);
        this.f17193e.mo1905b("Sounds#burst_start");
        this.f17190a.mo1554a(R.raw.camera_burst_start);
        this.f17193e.mo1905b("Sounds#burst_loop");
        this.f17190a.mo1554a(R.raw.camera_burst_loop);
        this.f17193e.mo1905b("Sounds#burst_end");
        this.f17190a.mo1554a(R.raw.camera_burst_end);
        this.f17193e.mo1905b("Sounds#timer_start");
        this.f17190a.mo1554a(R.raw.timer_start);
        this.f17193e.mo1905b("Sounds#timer_final");
        this.f17190a.mo1554a(R.raw.timer_final);
        this.f17193e.mo1905b("Sounds#timer_increment");
        this.f17190a.mo1554a(R.raw.timer_increment);
        this.f17193e.mo1905b("Sounds#video_start");
        this.f17190a.mo1554a(R.raw.video_start);
        this.f17193e.mo1905b("Sounds#video_stop");
        this.f17190a.mo1554a(R.raw.video_stop);
        this.f17193e.mo1905b("Sounds#video_pause");
        this.f17190a.mo1554a(R.raw.video_pause);
        this.f17193e.mo1905b("Sounds#staged_shot_complete");
        this.f17190a.mo1554a(R.raw.staged_shot_complete);
        this.f17193e.mo1905b("Sounds#staged_shot_cancelled");
        this.f17190a.mo1554a(R.raw.staged_shot_cancelled);
        this.f17193e.mo1905b("Sounds#panorama_single_photo_shutter_sound");
        this.f17190a.mo1554a(R.raw.panorama_single_photo_shutter_sound);
        this.f17193e.mo1904b();
    }

    /* renamed from: e */
    public final void mo1552e() {
        this.f17193e.mo1903a("Sounds#shutter");
        this.f17190a.mo1554a(R.raw.camera_shutter);
        this.f17193e.mo1905b("Sounds#burst_start");
        this.f17190a.mo1554a(R.raw.camera_burst_start);
        this.f17193e.mo1905b("Sounds#video_start");
        this.f17190a.mo1554a(R.raw.video_start);
        this.f17193e.mo1904b();
    }

    /* renamed from: f */
    public final void mo1553f() {
        this.f17190a.mo1556b();
    }
}
