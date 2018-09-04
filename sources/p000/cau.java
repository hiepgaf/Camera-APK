package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.googlex.gcam.ExifMetadata;
import com.google.googlex.gcam.GoudaRequest;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.googlex.gcam.InterleavedReadViewU16;
import com.google.googlex.gcam.InterleavedReadViewU8;
import com.google.googlex.gcam.image.ImageUtils;
import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: cau */
public final class cau implements bzr {
    /* renamed from: a */
    public final hjn f22625a;
    /* renamed from: b */
    public final kln f22626b;
    /* renamed from: c */
    public GoudaRequest f22627c;
    /* renamed from: d */
    public ExifMetadata f22628d;
    /* renamed from: e */
    public kbg f22629e;
    /* renamed from: f */
    public int f22630f;
    /* renamed from: g */
    public iwp f22631g;
    /* renamed from: h */
    public long f22632h;
    /* renamed from: i */
    public long f22633i;
    /* renamed from: j */
    public boolean f22634j;
    /* renamed from: k */
    public boolean f22635k;
    /* renamed from: l */
    public int f22636l;
    /* renamed from: m */
    public boolean f22637m;
    /* renamed from: n */
    public final /* synthetic */ car f22638n;
    /* renamed from: o */
    private final fwb f22639o;
    /* renamed from: p */
    private final gkr f22640p;
    /* renamed from: q */
    private final kbg f22641q;
    /* renamed from: r */
    private final UUID f22642r;
    /* renamed from: s */
    private final gdv f22643s;
    /* renamed from: t */
    private InterleavedReadViewU8 f22644t;
    /* renamed from: u */
    private InterleavedReadViewU16 f22645u;
    /* renamed from: v */
    private kpk f22646v;
    /* renamed from: w */
    private ikb f22647w;
    /* renamed from: x */
    private int f22648x;
    /* renamed from: y */
    private boolean f22649y;

    private cau(car car, gkr gkr, fwb fwb, kbg kbg, UUID uuid) {
        this.f22638n = car;
        this.f22625a = new hjn();
        this.f22634j = false;
        this.f22635k = false;
        this.f22648x = 1;
        this.f22636l = 0;
        this.f22637m = false;
        this.f22649y = false;
        this.f22639o = fwb;
        this.f22640p = gkr;
        this.f22641q = kbg;
        this.f22642r = uuid;
        this.f22626b = new kln();
        this.f22643s = new gdv(this, fwb, gkr);
    }

    /* renamed from: a */
    public final void mo2642a(iwz iwz, kpk kpk) {
    }

    /* renamed from: a */
    public final void mo3384a(InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest, ExifMetadata exifMetadata, kbg kbg, int i, iwp iwp, long j, kpk kpk, int i2, boolean z, boolean z2, ikb ikb) {
        this.f22644t = interleavedReadViewU8;
        this.f22627c = goudaRequest;
        this.f22628d = exifMetadata;
        this.f22629e = kbg;
        this.f22630f = i;
        this.f22631g = iwp;
        this.f22632h = j;
        this.f22646v = kpk;
        this.f22636l = i2;
        this.f22637m = z;
        this.f22649y = z2;
        this.f22647w = ikb;
        cap cap = this.f22638n.f20182h;
        GoudaRequest goudaRequest2 = this.f22627c;
        long l = this.f22640p.mo2884l();
        kbg kbg2 = (kbg) cap.f1815a.mo345a();
        if (cap.f1816b.m954a(gdp.f5093c) && kbg2.mo2084b()) {
            File file = new File((File) kbg2.mo2081a(), "portrait");
            if (!(file.exists() || file.mkdirs())) {
                bli.m866b("PortraitRequestDecorator", "Could not create portrait mode debug data folder.");
            }
            goudaRequest2.setPortrait_raw_path(file.getAbsolutePath());
            goudaRequest2.setShot_prefix(bxe.m1036a(l));
        }
    }

    public final void close() {
        kpk a;
        bli.m863a(car.f20175a, "Starting postprocessing");
        long andIncrement = this.f22638n.f20183i.getAndIncrement();
        this.f22645u = this.f22638n.m14919a(this.f22646v);
        if (this.f22649y && this.f22638n.f20184j.mo2084b()) {
            InterleavedReadViewU8 interleavedImageU8 = new InterleavedImageU8(this.f22644t.width(), this.f22644t.height(), this.f22644t.num_channels());
            ImageUtils.copyContents(this.f22644t, interleavedImageU8);
            ((gii) this.f22638n.f20184j.mo2081a()).m2563a();
            m16913a(andIncrement, interleavedImageU8, this.f22627c);
        } else {
            m16913a(andIncrement, this.f22644t, this.f22627c);
        }
        if (this.f22641q.mo2084b()) {
            GoudaRequest goudaRequest = this.f22627c;
            if (goudaRequest != null) {
                int size;
                if (goudaRequest.getFaces() != null) {
                    size = (int) this.f22627c.getFaces().size();
                } else {
                    size = 0;
                }
                this.f22626b.f22373c = size;
                String str = car.f20175a;
                StringBuilder stringBuilder = new StringBuilder(77);
                stringBuilder.append("Sending image ");
                stringBuilder.append(andIncrement);
                stringBuilder.append(" for postprocessing with ");
                stringBuilder.append(size);
                stringBuilder.append(" faces.");
                bli.m863a(str, stringBuilder.toString());
                a = ((gds) this.f22641q.mo2081a()).mo1450a(andIncrement, this.f22644t, this.f22645u, this.f22627c, this.f22637m, this.f22649y, this.f22629e.mo2084b(), this.f22628d, this.f22643s);
                kow.m13622a(a, new cax(this, andIncrement), kpq.f8410a);
            }
        }
        String str2 = "Gouda controller not available or null GoudaRequest, no effect applied.";
        bli.m866b(car.f20175a, str2);
        a = kow.m13618a(new isr(str2));
        kow.m13622a(a, new cax(this, andIncrement), kpq.f8410a);
    }

    /* renamed from: a */
    public final void m16918a(long j) {
        if (this.f22635k && this.f22625a.f6277a.get() == 0) {
            this.f22639o.mo3050a(1.0f);
            this.f22647w.close();
            String str;
            StringBuilder stringBuilder;
            if (this.f22634j) {
                str = car.f20175a;
                stringBuilder = new StringBuilder(51);
                stringBuilder.append("Finishing the session for shot ");
                stringBuilder.append(j);
                bli.m863a(str, stringBuilder.toString());
                this.f22640p.mo1482h().mo1520a(this.f22626b);
                this.f22640p.mo2879f();
                return;
            }
            str = car.f20175a;
            stringBuilder = new StringBuilder(71);
            stringBuilder.append("Error processing the image, cancelling the session ");
            stringBuilder.append(j);
            bli.m866b(str, stringBuilder.toString());
            this.f22640p.mo2861a();
        }
    }

    /* renamed from: a */
    private final void m16914a(long j, InterleavedReadViewU8 interleavedReadViewU8, gdy gdy, int i, cat cat, String str, hjo hjo) {
        boolean z;
        if (cat == cat.ORIGINAL) {
            z = true;
        } else {
            z = false;
        }
        kpk d = kpw.m18056d();
        kow.m13622a(this.f22638n.f20177c.m10590a(new cba(this, interleavedReadViewU8, i)), new cbb(this, i, z, str, gdy, d), this.f22638n.f20180f);
        kow.m13622a(d, new caz(this, cat, hjo, j), kpq.f8410a);
    }

    /* renamed from: a */
    private final void m16917a(foz foz, int i, boolean z, String str, ExifInterface exifInterface, gdy gdy) {
        ExifInterface exifInterface2;
        gkr gkr = this.f22640p;
        String n = gkr.mo2886n();
        long l = this.f22640p.mo2884l();
        long j = foz.f4652a;
        UUID uuid = this.f22642r;
        iqm a = iqm.m4037a(foz.f4654c);
        iqp iqp = foz.f4656e;
        int i2 = iqp.f7329a;
        int i3 = iqp.f7330b;
        byte[] bArr = foz.f4653b;
        if (exifInterface != null) {
            exifInterface2 = exifInterface;
        } else {
            exifInterface2 = foz.f4655d;
        }
        gkr.mo2868a(new bnm(n, i, l, j, uuid, a, i2, i3, bArr, exifInterface2, gdy, bve.PORTRAIT, z, str));
        this.f22638n.f20181g.m4331a((float) i, foz.f4652a);
    }

    /* renamed from: a */
    private final void m16913a(long j, InterleavedReadViewU8 interleavedReadViewU8, GoudaRequest goudaRequest) {
        hjo a = this.f22625a.m3209a();
        car car = this.f22638n;
        kow.m13622a(car.f20178d.m10590a(new gdw(car.f20179e, interleavedReadViewU8, goudaRequest)), new cay(this, j, a, interleavedReadViewU8), kpq.f8410a);
    }
}
