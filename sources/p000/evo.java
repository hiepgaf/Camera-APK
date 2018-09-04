package p000;

import android.media.MediaCodec.BufferInfo;
import android.util.Pair;
import com.google.android.libraries.micro.proto.nano.Micro$Data;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: evo */
public final class evo implements exf {
    /* renamed from: a */
    public final ezn f15607a = new ezn();
    /* renamed from: b */
    private final Executor f15608b;
    /* renamed from: c */
    private final bmb f15609c;
    /* renamed from: d */
    private final ccr f15610d;
    /* renamed from: e */
    private final exd f15611e;
    /* renamed from: f */
    private final boolean f15612f;
    /* renamed from: g */
    private final iqp f15613g;

    public evo(ccr ccr, exd exd, Executor executor, boolean z, iqp iqp, bmb bmb) {
        this.f15610d = ccr;
        this.f15608b = executor;
        this.f15609c = bmb;
        this.f15611e = exd;
        this.f15612f = z;
        this.f15613g = iqp;
    }

    /* renamed from: a */
    final /* synthetic */ void m9986a() {
        while (this.f15607a.m2203b() > 0) {
            evn evn = (evn) this.f15607a.m2201a();
            if (evn == null) {
                return;
            }
            if (this.f15610d != null) {
                long j;
                List arrayList;
                int i;
                int i2;
                int i3;
                int i4;
                eto.m2112a();
                ccr ccr;
                List arrayList2;
                if (this.f15612f) {
                    ccr = this.f15610d;
                    j = evn.f4277b;
                    gid gid = (gid) kow.m13625c(evn.f4279d);
                    bwy bwy = ccr.f11662b;
                    if (gid == null || bwy == null) {
                        StringBuilder stringBuilder;
                        if (gid == null) {
                            stringBuilder = new StringBuilder(51);
                            stringBuilder.append("Camera metadata not valid at : ");
                            stringBuilder.append(j);
                            bli.m866b("GyroBasedME", stringBuilder.toString());
                        } else {
                            stringBuilder = new StringBuilder(61);
                            stringBuilder.append("Gyro transform calculator not valid at : ");
                            stringBuilder.append(j);
                            bli.m866b("GyroBasedME", stringBuilder.toString());
                        }
                        arrayList = new ArrayList();
                        bwy = ccr.f11662b;
                        if (bwy == null) {
                            bli.m866b("GyroBasedME", "Gyro transform calculator not valid.");
                        } else {
                            i = bwy.f1670b;
                            for (i2 = 0; i2 < i; i2++) {
                                arrayList.add(jdf.m4417a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
                            }
                        }
                    } else {
                        ccr.m8014a((gid.f16923a + gid.f16924b) + gid.f16925c);
                        List<jdf> a = bwy.m1027a(gid);
                        gid.close();
                        arrayList2 = new ArrayList();
                        for (jdf jdf : a) {
                            i3 = ccr.f11663c;
                            if (ccr.f11661a) {
                                arrayList2.add(jdf);
                            } else {
                                arrayList2.add(jdf);
                            }
                        }
                        arrayList = arrayList2;
                    }
                } else {
                    arrayList2 = new ArrayList();
                    i4 = 0;
                    while (true) {
                        ccr = this.f15610d;
                        if (ccr.f11662b == null) {
                            bli.m866b("GyroBasedME", "Error (null pointer) in getting strip count for gyro based motion estimation.");
                            i = 0;
                        } else {
                            i = ccr.f11662b.f1670b;
                        }
                        if (i4 >= i) {
                            break;
                        }
                        arrayList2.add(jdf.m4417a(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}));
                        i4++;
                    }
                    arrayList = arrayList2;
                }
                eto.m2112a();
                eto.m2115d();
                try {
                    Micro$Data micro$Data = new Micro$Data();
                    float[] fArr = new float[(arrayList.size() * 9)];
                    ArrayList arrayList3 = (ArrayList) arrayList;
                    int size = arrayList3.size();
                    i = 0;
                    int i5 = 0;
                    while (true) {
                        if ((i5 >= size ? null : 1) == null) {
                            break;
                        }
                        i3 = i5 + 1;
                        float[] a2 = ((jdf) arrayList3.get(i5)).m4418a();
                        i2 = 0;
                        while (i2 < 9) {
                            i5 = i + 1;
                            fArr[i] = a2[i2];
                            i2++;
                            i = i5;
                        }
                        i5 = i3;
                    }
                    micro$Data.motionHomographyData = fArr;
                    iqp iqp = evn.f4276a;
                    micro$Data.frameWidth = iqp.f7329a;
                    micro$Data.frameHeight = iqp.f7330b;
                    micro$Data.deviceTimestampUs = TimeUnit.MICROSECONDS.convert(evn.f4277b, TimeUnit.NANOSECONDS);
                    if ((((BufferInfo) kow.m13625c(evn.f4280e)).flags & 1) == 0) {
                        i4 = 1;
                    } else {
                        i4 = 2;
                    }
                    micro$Data.isKeyFrame = i4;
                    byte[] bArr = new byte[micro$Data.getSerializedSize()];
                    i = bArr.length;
                    micro$Data.writeTo(kvd.m5421a(bArr, 0, i));
                    j = evn.f4278c;
                    int i6 = ((BufferInfo) kow.m13625c(evn.f4280e)).flags;
                    BufferInfo bufferInfo = new BufferInfo();
                    bufferInfo.set(0, i, j, i6);
                    evn.f4281f.mo3557a(Pair.create(ByteBuffer.wrap(bArr), bufferInfo));
                } catch (Throwable e) {
                    bli.m867b("MotionDataProcessorImpl", "Cannot serialize gyro data.", e);
                    evn.f4281f.m17780a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1310a(gid gid) {
        long convert = TimeUnit.MICROSECONDS.convert(gid.f16923a, TimeUnit.NANOSECONDS);
        if (this.f15607a.m2203b() > 0) {
            this.f15607a.m2202a(convert, new evr(gid));
        }
        long j = gid.f16923a;
        for (ezl ezl : this.f15607a.f4384a.mo1955b()) {
            evn evn = ezl.f15810a;
            if (j <= evn.f4277b) {
                break;
            } else if (!evn.f4282g) {
                evn.f4282g = true;
            }
        }
        this.f15608b.execute(new evs(this));
    }

    /* renamed from: a */
    public final kpk m9985a(long j, long j2) {
        ccr ccr = this.f15610d;
        if (ccr == null || !ccr.m8017b()) {
            return kow.m13624b();
        }
        ezl ezl = new ezl(new evn(this.f15613g, j, j2));
        ezn ezn = this.f15607a;
        synchronized (ezn.f4384a) {
            ezl ezl2 = ezn.f4385b;
            if (ezl2 == null || !ezl.m10121a(ezl2)) {
                ezn.f4384a.mo1953a(ezl.f15810a.f4278c, ezl);
            } else {
                ezl.m10120a();
                ezl.close();
            }
        }
        Object obj = (gid) this.f15611e.f4326a.mo1952a(euh.m2125a(j));
        if (obj != null) {
            ezl.f15810a.f4279d.mo3557a(obj);
        }
        this.f15608b.execute(new evp(this));
        return ezl.f15810a.f4281f;
    }
}
