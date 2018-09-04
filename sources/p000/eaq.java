package p000;

import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v8.renderscript.Allocation;
import android.support.v8.renderscript.RSRuntimeException;
import android.support.v8.renderscript.Sampler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.tinyplanet.TinyPlanetPreview;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TimeZone;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: eaq */
public final class eaq extends DialogFragment implements eaz {
    /* renamed from: m */
    private static final String f14861m = bli.m862a("TinyPlanetActivity");
    /* renamed from: a */
    public final Lock f14862a = new ReentrantLock();
    /* renamed from: b */
    public final gln f14863b;
    /* renamed from: c */
    public final glj f14864c;
    /* renamed from: d */
    public TinyPlanetPreview f14865d;
    /* renamed from: e */
    public float f14866e = 0.5f;
    /* renamed from: f */
    public float f14867f = 0.0f;
    /* renamed from: g */
    public ProgressDialog f14868g;
    /* renamed from: h */
    public String f14869h = "";
    /* renamed from: i */
    public Bitmap f14870i;
    /* renamed from: j */
    public Bitmap f14871j;
    /* renamed from: k */
    public Boolean f14872k;
    /* renamed from: l */
    public Boolean f14873l;
    /* renamed from: n */
    private final cfh f14874n;
    /* renamed from: o */
    private final Handler f14875o = new Handler();
    /* renamed from: p */
    private Uri f14876p;
    /* renamed from: q */
    private int f14877q = 0;
    /* renamed from: r */
    private eba f14878r;
    /* renamed from: s */
    private final Runnable f14879s;

    public eaq(cfh cfh, gln gln, glj glj) {
        Boolean valueOf = Boolean.valueOf(false);
        this.f14872k = valueOf;
        this.f14873l = valueOf;
        this.f14879s = new ear(this);
        this.f14874n = (cfh) jri.m13152b((Object) cfh);
        this.f14863b = (gln) jri.m13152b((Object) gln);
        this.f14864c = (glj) jri.m13152b((Object) glj);
    }

    /* renamed from: a */
    private static byte[] m9589a(byte[] bArr) {
        ExifInterface exifInterface = new ExifInterface();
        exifInterface.m8486a(ExifInterface.f12397i, System.currentTimeMillis(), TimeZone.getDefault());
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bArr == null) {
            try {
                throw new IllegalArgumentException("Argument is null");
            } catch (Throwable e) {
                bli.m867b(f14861m, "Could not write EXIF", e);
            }
        } else {
            OutputStream a = exifInterface.m8481a(byteArrayOutputStream);
            a.write(bArr, 0, bArr.length);
            a.flush();
            a.close();
            return byteArrayOutputStream.toByteArray();
        }
    }

    /* renamed from: a */
    private static Bitmap m9584a(int i, int i2) {
        double d = 1.0d;
        while (true) {
            try {
                break;
            } catch (OutOfMemoryError e) {
                d /= 2.0d;
                System.gc();
            }
        }
        return Bitmap.createBitmap((int) (((double) i) * d), (int) (((double) i2) * d), Config.ARGB_8888);
    }

    /* renamed from: a */
    final eay m9590a() {
        this.f14862a.lock();
        try {
            this.f14871j.recycle();
            this.f14871j = null;
            this.f14870i.recycle();
            this.f14870i = null;
            Bitmap a = m9586a(this.f14876p, false);
            int width = (int) ((double) (a.getWidth() / 2));
            Bitmap a2 = eaq.m9584a(width, width);
            m9592a(a, a2);
            a.recycle();
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a2.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
            return new eay(eaq.m9589a(byteArrayOutputStream.toByteArray()), a2.getWidth());
        } finally {
            this.f14862a.unlock();
        }
    }

    /* renamed from: a */
    private static Bitmap m9585a(Bitmap bitmap, wd wdVar, int i) {
        try {
            int a = eaq.m9583a(wdVar, "CroppedAreaImageWidthPixels");
            int a2 = eaq.m9583a(wdVar, "CroppedAreaImageHeightPixels");
            int a3 = eaq.m9583a(wdVar, "FullPanoWidthPixels");
            int a4 = eaq.m9583a(wdVar, "FullPanoHeightPixels");
            int a5 = eaq.m9583a(wdVar, "CroppedAreaLeftPixels");
            int a6 = eaq.m9583a(wdVar, "CroppedAreaTopPixels");
            if (a3 == 0 || a4 == 0) {
                return bitmap;
            }
            float f = (float) a3;
            float f2 = (float) ((double) (((float) i) / f));
            Bitmap a7 = eaq.m9584a((int) (f * f2), (int) (((float) a4) * f2));
            new Canvas(a7).drawBitmap(bitmap, null, new RectF(((float) a5) * f2, ((float) a6) * f2, ((float) (a + a5)) * f2, ((float) (a2 + a6)) * f2), null);
            return a7;
        } catch (wb e) {
            return bitmap;
        }
    }

    /* renamed from: a */
    private final Bitmap m9586a(Uri uri, boolean z) {
        Throwable th;
        InputStream a = m9587a(uri);
        if (a == null) {
            bli.m866b(f14861m, "Could not create input stream for image.");
            dismiss();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(a);
        try {
            a = m9587a(uri);
            try {
                wd a2 = ern.m2036a(a);
                eaq.m9588a(a);
                if (a2 == null) {
                    return decodeStream;
                }
                int min;
                if (z) {
                    Display defaultDisplay = this.f14874n.mo2755e().getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    min = Math.min(point.x, point.y);
                } else {
                    min = decodeStream.getWidth();
                }
                return eaq.m9585a(decodeStream, a2, min);
            } catch (Throwable th2) {
                th = th2;
                eaq.m9588a(a);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            eaq.m9588a(a);
            throw th;
        }
    }

    /* renamed from: a */
    private static int m9583a(wd wdVar, String str) {
        return wdVar.mo2525b("http://ns.google.com/photos/1.0/panorama/", str) ? wdVar.mo2533i("http://ns.google.com/photos/1.0/panorama/", str).intValue() : 0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme.Camera);
        this.f14878r = new eba(getActivity().getApplicationContext());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().requestFeature(1);
        getDialog().setCanceledOnTouchOutside(true);
        View inflate = layoutInflater.inflate(R.layout.tinyplanet_editor, viewGroup, false);
        this.f14865d = (TinyPlanetPreview) inflate.findViewById(R.id.preview);
        this.f14865d.f2374c = this;
        ((SeekBar) inflate.findViewById(R.id.zoomSlider)).setOnSeekBarChangeListener(new eat(this));
        ((SeekBar) inflate.findViewById(R.id.angleSlider)).setOnSeekBarChangeListener(new eau(this));
        ((Button) inflate.findViewById(R.id.createTinyPlanetButton)).setOnClickListener(new eav(this));
        this.f14869h = getArguments().getString(NotificationCompatJellybean.KEY_TITLE);
        this.f14876p = Uri.parse(getArguments().getString("uri"));
        this.f14870i = m9586a(this.f14876p, true);
        if (this.f14870i == null) {
            bli.m866b(f14861m, "Could not decode source image.");
            dismiss();
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo1206a(int i) {
        this.f14877q = i;
        this.f14862a.lock();
        try {
            Bitmap bitmap = this.f14871j;
            if (!(bitmap != null && bitmap.getWidth() == i && this.f14871j.getHeight() == i)) {
                bitmap = this.f14871j;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                int i2 = this.f14877q;
                this.f14871j = Bitmap.createBitmap(i2, i2, Config.ARGB_8888);
            }
            this.f14862a.unlock();
            m9593b();
        } catch (Throwable th) {
            this.f14862a.unlock();
        }
    }

    /* renamed from: a */
    private final InputStream m9587a(Uri uri) {
        try {
            return this.f14874n.mo2762q().openInputStream(uri);
        } catch (Throwable e) {
            bli.m867b(f14861m, "Could not load source image.", e);
            return null;
        }
    }

    /* renamed from: a */
    final void m9592a(Bitmap bitmap, Bitmap bitmap2) {
        eba eba = this.f14878r;
        float f = this.f14866e;
        float f2 = this.f14867f;
        SystemClock.elapsedRealtimeNanos();
        eba.f3500c.m17829a(Sampler.WRAP_LINEAR(eba.f3499b));
        eba.f3500c.m17828a(Allocation.createFromBitmap(eba.f3499b, bitmap));
        eba.f3500c.m17831b(bitmap.getWidth());
        eba.f3500c.m17827a(bitmap.getHeight());
        eba.f3500c.m17833d(((float) bitmap2.getWidth()) * 0.5f);
        eba.f3500c.m17832c(((float) bitmap2.getHeight()) * 0.5f);
        eba.f3500c.m17830b(5.0f / ((f * 4.0f) * ((float) bitmap2.getWidth())));
        eba.f3500c.m17826a(f2);
        Allocation createFromBitmap = Allocation.createFromBitmap(eba.f3499b, bitmap2);
        xo xoVar = eba.f3500c;
        if (createFromBitmap.getType().getElement().isCompatible(xoVar.f23445a)) {
            xoVar.forEach(1, null, createFromBitmap, null, null);
            createFromBitmap.copyTo(bitmap2);
            String str = eba.f3498a;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append(" TinyPlanet processed (");
            stringBuilder.append(width);
            stringBuilder.append(",");
            stringBuilder.append(height);
            stringBuilder.append(")");
            bli.m871d(str, stringBuilder.toString());
            return;
        }
        throw new RSRuntimeException("Type mismatch with U8_4!");
    }

    /* renamed from: a */
    private static void m9588a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                String str = f14861m;
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Unable to close stream: ");
                stringBuilder.append(valueOf);
                bli.m873e(str, stringBuilder.toString());
            }
        }
    }

    /* renamed from: b */
    final void m9593b() {
        this.f14875o.removeCallbacks(this.f14879s);
        this.f14875o.postDelayed(this.f14879s, 10);
    }
}
