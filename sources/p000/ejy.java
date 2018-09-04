package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.ExifInterface;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* renamed from: ejy */
public final class ejy implements OnClickListener {
    /* renamed from: a */
    public static final String f3708a = bli.m862a("LightCycleCtrlr");
    /* renamed from: A */
    public emc f3709A = null;
    /* renamed from: B */
    public final Handler f3710B;
    /* renamed from: C */
    public HandlerThread f3711C;
    /* renamed from: D */
    public ejx f3712D;
    /* renamed from: E */
    public emc f3713E;
    /* renamed from: F */
    public final List f3714F = new ArrayList();
    /* renamed from: G */
    public final List f3715G = new ArrayList();
    /* renamed from: H */
    public final List f3716H = new ArrayList();
    /* renamed from: I */
    public final ekm f3717I = new ekm();
    /* renamed from: J */
    public boolean f3718J = false;
    /* renamed from: K */
    public final Handler f3719K;
    /* renamed from: L */
    public final aag f3720L = new ekc(this);
    /* renamed from: M */
    public aaf f3721M = new ekd();
    /* renamed from: N */
    public aas f3722N = new eke(this);
    /* renamed from: O */
    public aaf f3723O = new ekf(this);
    /* renamed from: P */
    private float f3724P;
    /* renamed from: Q */
    private eln f3725Q;
    /* renamed from: b */
    public eki f3726b;
    /* renamed from: c */
    public eje f3727c;
    /* renamed from: d */
    public boolean f3728d = false;
    /* renamed from: e */
    public boolean f3729e;
    /* renamed from: f */
    public float f3730f;
    /* renamed from: g */
    public float f3731g;
    /* renamed from: h */
    public eld f3732h;
    /* renamed from: i */
    public double f3733i;
    /* renamed from: j */
    public double f3734j;
    /* renamed from: k */
    public boolean f3735k;
    /* renamed from: l */
    public int f3736l;
    /* renamed from: m */
    public final Semaphore f3737m = new Semaphore(0);
    /* renamed from: n */
    public final Vector f3738n = new Vector(100);
    /* renamed from: o */
    public int f3739o = 0;
    /* renamed from: p */
    public FileWriter f3740p = null;
    /* renamed from: q */
    public Context f3741q;
    /* renamed from: r */
    public cbr f3742r;
    /* renamed from: s */
    public final hjw f3743s;
    /* renamed from: t */
    public boolean f3744t = false;
    /* renamed from: u */
    public boolean f3745u = true;
    /* renamed from: v */
    public boolean f3746v = false;
    /* renamed from: w */
    public bwb f3747w;
    /* renamed from: x */
    public boolean f3748x = false;
    /* renamed from: y */
    public boolean f3749y = false;
    /* renamed from: z */
    public emc f3750z = null;

    @SuppressLint({"NewApi"})
    public ejy(Context context, eje eje, eld eld, eln eln, ejx ejx, eki eki, hjw hjw, cbr cbr) {
        this.f3742r = cbr;
        this.f3741q = context;
        this.f3732h = eld;
        this.f3725Q = eln;
        this.f3712D = ejx;
        this.f3743s = hjw;
        this.f3719K = new Handler(Looper.getMainLooper());
        try {
            this.f3740p = new FileWriter(this.f3725Q.f3940f);
        } catch (IOException e) {
            String str = f3708a;
            String valueOf = String.valueOf(this.f3725Q.f3940f);
            String str2 = "Could not create file writer for : ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m866b(str, valueOf);
        }
        this.f3711C = new HandlerThread("FileHandlerThread");
        this.f3711C.start();
        this.f3710B = new Handler(this.f3711C.getLooper());
        this.f3727c = eje;
        if (this.f3727c == null) {
            bli.m871d(f3708a, "Error creating CameraPreview.");
            return;
        }
        this.f3726b = eki;
        this.f3726b.f3762I = this;
        this.f3742r.m1098a().getDefaultDisplay();
        eki eki2 = this.f3726b;
        eki2.f3761H = eld;
        eki2.f3755B = new ekv();
        this.f3732h.f3915p = new ejz(this);
        this.f3717I.f3809c = ejv.m1815b();
        this.f3749y = ije.m3779a(this.f3741q.getContentResolver(), "camera:requires_focus_on_pitch_change", false);
    }

    /* renamed from: a */
    public final float m1820a() {
        float b = m1822b();
        String str;
        StringBuilder stringBuilder;
        if (b > 0.0f) {
            str = f3708a;
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Field of view : ");
            stringBuilder.append(b);
            stringBuilder.append(" degrees.");
            bli.m871d(str, stringBuilder.toString());
        } else {
            b = this.f3724P;
            if (b > 75.0f) {
                b = 55.0f;
            }
            str = f3708a;
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Field of view : ");
            stringBuilder.append(b);
            stringBuilder.append(" degrees.");
            bli.m871d(str, stringBuilder.toString());
        }
        return b;
    }

    /* renamed from: b */
    public final float m1822b() {
        if (this.f3727c == null) {
            throw new IllegalStateException("Cannot use stopped controller");
        }
        int a = ije.m3772a(this.f3741q.getContentResolver(), "camera:field_of_view_millidegrees", -1);
        if (a > 0) {
            return ((float) a) / 1000.0f;
        }
        return ejv.m1811a(this.f3724P);
    }

    /* renamed from: a */
    public static float m1819a(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    public final void onClick(View view) {
    }

    /* renamed from: a */
    static double m1818a(File file) {
        try {
            String attribute = new ExifInterface(file.getAbsolutePath()).getAttribute("ExposureTime");
            if (attribute == null) {
                return -1.0d;
            }
            try {
                return Double.parseDouble(attribute);
            } catch (NumberFormatException e) {
                return -2.0d;
            }
        } catch (IOException e2) {
            return -3.0d;
        }
    }

    /* renamed from: a */
    public final void m1821a(int i) {
        String str = this.f3725Q.f3937c;
        float a;
        switch (i - 1) {
            case 0:
                LightCycle.m1294a(str, m1820a());
                break;
            case 1:
                a = m1820a();
                synchronized (LightCycle.f2376a) {
                    LightCycleNative.ResetForHorizontalCapture(str, a);
                    LightCycle.f2377b = Boolean.valueOf(true);
                }
                break;
            case 2:
                a = m1820a();
                synchronized (LightCycle.f2376a) {
                    LightCycleNative.ResetForVerticalCapture(str, a);
                    LightCycle.f2377b = Boolean.valueOf(true);
                }
                break;
            case 3:
                a = m1820a();
                synchronized (LightCycle.f2376a) {
                    LightCycleNative.ResetForWideCapture(str, a);
                    LightCycle.f2377b = Boolean.valueOf(true);
                }
                break;
            case 4:
                a = m1820a();
                synchronized (LightCycle.f2376a) {
                    LightCycleNative.ResetForFisheyeCapture(str, a);
                    LightCycle.f2377b = Boolean.valueOf(true);
                }
                break;
            default:
                LightCycle.m1294a(str, m1820a());
                break;
        }
        eki eki = this.f3726b;
        ekt ekt = eki.f3783d;
        if (ekt != null) {
            ekt.m1846b();
        }
        eki.f3784e.m1321a();
        if (i == go.al) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            eki eki2 = this.f3726b;
            ekt ekt2 = eki2.f3783d;
            if (ekt2 != null) {
                ekt2.m1845a(fArr);
            }
            if (eki2.f3795p && eki2.f3802w == go.ag) {
                eki2.f3784e.m1324b(eki2.f3754A);
            }
            eki2.f3803x = true;
        }
        this.f3748x = false;
        this.f3739o = 0;
    }

    /* renamed from: c */
    public final void m1823c() {
        float[] e = LightCycle.m1306e();
        ekn ekn = this.f3726b.f3781b;
        ekn.f15231f = 6;
        ekn.a = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ekn.b = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i = ekn.f15231f;
        ekn.c = ByteBuffer.allocateDirect(i + i).order(ByteOrder.nativeOrder()).asShortBuffer();
        ekn.f15234i = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asShortBuffer();
        for (i = 0; i < 12; i++) {
            ekn.a.put(i, e[i]);
        }
        int i2 = 0;
        short s = (short) 0;
        while (i2 < 2) {
            float f = (float) i2;
            short s2 = s;
            for (i = 0; i < 2; i++) {
                ekn.b.put(s2, (float) i);
                ekn.b.put(s2 + 1, f);
                s2 += 2;
            }
            i2++;
            s = s2;
        }
        for (s = (short) 0; s <= (short) 0; boolean z = true) {
            for (s = (short) 0; s <= (short) 0; z = true) {
                ekn.c.put(0, (short) 0);
                ekn.c.put(1, (short) 3);
                ekn.c.put(2, (short) 2);
                ekn.c.put(3, (short) 0);
                ekn.c.put(4, (short) 1);
                ekn.c.put(5, (short) 3);
            }
        }
        int i3 = 0;
        i = 0;
        while (i3 < 2) {
            i2 = i + 1;
            ekn.f15234i.put(i, (short) i3);
            i3++;
            i = i2;
        }
        int i4 = i;
        i = (short) 0;
        while (i < 2) {
            i3 = i4 + 1;
            ekn.f15234i.put(i4, (short) ((i + i) + 1));
            i++;
            i4 = i3;
        }
        i = 1;
        while (i >= 0) {
            i3 = i4 + 1;
            ekn.f15234i.put(i4, (short) (i + 2));
            i--;
            i4 = i3;
        }
        i = i4;
        i4 = 1;
        while (i4 >= 0) {
            i3 = i + 1;
            ekn.f15234i.put(i, (short) (i4 + i4));
            i4--;
            i = i3;
        }
        ekn.f15232g = 7;
        ekn.f15233h = true;
    }

    /* renamed from: d */
    public final synchronized void m1824d() {
        if (this.f3746v) {
            this.f3746v = false;
            this.f3726b.f3800u = true;
            eje eje = this.f3727c;
            if (eje != null) {
                aah aah = eje.f3657b;
                if (aah != null) {
                    if (aah.mo2566d().m74a() != 1) {
                        eje.f3657b.m24k();
                        eje.f3657b.mo2556a(eje.f3656a, null);
                        eje.f3657b.mo2560a(true);
                    }
                    eje.f3658c = null;
                }
                emd.m1873a(this.f3725Q.f3939e, this.f3714F);
                try {
                    this.f3740p.close();
                } catch (Throwable e) {
                    kqg.f8420a.mo2210b(e);
                }
            }
        } else {
            bli.m873e(f3708a, "stopCamera invoked, but camera is already stopped!");
        }
    }

    /* renamed from: e */
    public final synchronized int m1825e() {
        int i = 0;
        synchronized (this) {
            int i2 = this.f3739o;
            if (i2 != 0) {
                this.f3739o = i2 - 1;
                List list = this.f3714F;
                list.remove(list.size() - 1);
                try {
                    this.f3740p.close();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f3725Q.f3940f));
                    StringBuilder stringBuilder = new StringBuilder();
                    while (i < this.f3739o) {
                        stringBuilder.append(bufferedReader.readLine());
                        stringBuilder.append("\n");
                        i++;
                    }
                    bufferedReader.close();
                    this.f3740p = new FileWriter(this.f3725Q.f3940f);
                    this.f3740p.write(stringBuilder.toString());
                    this.f3740p.flush();
                } catch (Throwable e) {
                    bli.m867b(f3708a, "undo image exception:", e);
                }
                i = this.f3739o;
                if (i == 0) {
                    this.f3748x = false;
                }
                this.f3718J = true;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final void m1826f() {
        this.f3724P = this.f3727c.f3657b.mo2570h().getHorizontalViewAngle();
    }
}
