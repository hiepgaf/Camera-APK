package com.google.android.apps.camera.contentprovider;

import android.annotation.TargetApi;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.GoogleCamera.R;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import p000.bkv;
import p000.bla;
import p000.blb;
import p000.blc;
import p000.bld;
import p000.bli;
import p000.bsw;
import p000.bus;
import p000.bux;
import p000.buy;
import p000.buz;
import p000.bvb;
import p000.bvc;
import p000.bvm;
import p000.bvt;
import p000.bvu;
import p000.bvv;
import p000.bvy;
import p000.bvz;
import p000.bwa;
import p000.ccp;
import p000.ccq;
import p000.ccr;
import p000.hid;
import p000.hrc;
import p000.ird;
import p000.jri;

@TargetApi(21)
/* compiled from: PG */
public class CameraContentProvider extends ContentProvider {
    /* renamed from: a */
    private final bla f2270a = new bla();
    /* renamed from: b */
    private bld f2271b;
    /* renamed from: c */
    private ProviderInfo f2272c;
    /* renamed from: d */
    private bkv f2273d;
    /* renamed from: e */
    private String f2274e;
    /* renamed from: f */
    private UriMatcher f2275f;
    /* renamed from: g */
    private buz f2276g;
    /* renamed from: h */
    private blc f2277h;
    /* renamed from: i */
    private bvu f2278i;

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        this.f2272c = providerInfo;
        super.attachInfo(context, providerInfo);
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        if (!TextUtils.equals("version", str)) {
            return super.call(str, str2, bundle);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putInt("version", 3);
        return bundle2;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        bli.m863a("CamCntProvider", "request to delete photos");
        m1225a();
        if (this.f2275f.match(uri) != 6) {
            String valueOf = String.valueOf(uri);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
            stringBuilder.append("Unrecognized uri: ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        File a = m1224a(uri.getLastPathSegment());
        if (a == null) {
            String valueOf2 = String.valueOf(uri);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 33);
            stringBuilder2.append("Could not look up in MediaStore: ");
            stringBuilder2.append(valueOf2);
            bli.m866b("CamCntProvider", stringBuilder2.toString());
        } else {
            this.f2270a.m858a(a);
        }
        return 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final java.io.File m1224a(java.lang.String r8) {
        /*
        r7 = this;
        r6 = 1;
        r5 = 0;
        r3 = 0;
        r0 = r7.getContext();
        r0 = r0.getContentResolver();
        r1 = "external";
        r1 = android.provider.MediaStore.Files.getContentUri(r1);
        r1 = r1.buildUpon();
        r1 = r1.appendPath(r8);
        r1 = r1.build();
        r2 = new java.lang.String[r6];
        r4 = "_data";
        r2[r5] = r4;
        r4 = r3;
        r5 = r3;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x0044;
    L_0x002b:
        r0 = r1.getCount();	 Catch:{ all -> 0x004a }
        if (r0 != r6) goto L_0x0044;
    L_0x0031:
        r1.moveToFirst();	 Catch:{ all -> 0x004a }
        r3 = new java.io.File;	 Catch:{ all -> 0x004a }
        r0 = 0;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x004a }
        r3.<init>(r0);	 Catch:{ all -> 0x004a }
        if (r1 == 0) goto L_0x0043;
    L_0x0040:
        r1.close();
    L_0x0043:
        return r3;
    L_0x0044:
        if (r1 == 0) goto L_0x0043;
    L_0x0046:
        r1.close();
        goto L_0x0043;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004c }
    L_0x004c:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0052;
    L_0x004f:
        r1.close();	 Catch:{ all -> 0x0053 }
    L_0x0052:
        throw r2;
    L_0x0053:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.contentprovider.CameraContentProvider.a(java.lang.String):java.io.File");
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: a */
    private final ParcelFileDescriptor m1223a(Uri uri, hrc hrc) {
        int parseInt = Integer.parseInt((String) uri.getPathSegments().get(1));
        blc blc = this.f2277h;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(hrc.f6479d);
        hrc hrc2 = hrc.DIALOG;
        Drawable drawable = blc.f1261a.getResources().getDrawable(parseInt, null);
        if (drawable == null) {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("resource is not found for ");
            stringBuilder.append(parseInt);
            throw new FileNotFoundException(stringBuilder.toString());
        }
        Object bitmap;
        Bitmap createBitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) drawable).getBitmap();
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmap2 = createBitmap;
        }
        createBitmap = Bitmap.createScaledBitmap((Bitmap) jri.m13152b(bitmap), dimensionPixelSize, dimensionPixelSize, false);
        if (hrc == hrc2) {
            float[] fArr = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
            bitmap2 = Bitmap.createBitmap(createBitmap.getWidth(), createBitmap.getHeight(), createBitmap.getConfig());
            Canvas canvas2 = new Canvas(bitmap2);
            Paint paint = new Paint();
            paint.setColorFilter(new ColorMatrixColorFilter(fArr));
            canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
        } else {
            bitmap2 = createBitmap;
        }
        return blc.m860a(bitmap2, CompressFormat.PNG);
    }

    public boolean onCreate() {
        this.f2271b = new bld(getContext(), new HashSet(Arrays.asList(getContext().getResources().getStringArray(R.array.trusted_certificates))));
        blb cameraContentProviderComponent = ((HasCameraContentProviderComponent) getContext()).cameraContentProviderComponent(new ccp(this, this.f2272c));
        this.f2273d = bsw.m7725b();
        this.f2274e = ccq.m8006a(cameraContentProviderComponent.f1259a);
        this.f2275f = cameraContentProviderComponent.m859a();
        this.f2276g = new buz(cameraContentProviderComponent.m859a(), new bvb((bvm) cameraContentProviderComponent.f1260b.bo.mo345a()), new bvc(ccr.m8012a(cameraContentProviderComponent.f1259a), ccq.m8006a(cameraContentProviderComponent.f1259a)), new bux((bus) cameraContentProviderComponent.f1260b.bp.mo345a(), cameraContentProviderComponent.m859a(), (bvm) cameraContentProviderComponent.f1260b.bo.mo345a()));
        cameraContentProviderComponent.f1260b.bp.mo345a();
        this.f2277h = new blc(ccr.m8012a(cameraContentProviderComponent.f1259a));
        bus bus = (bus) cameraContentProviderComponent.f1260b.bp.mo345a();
        hid hid = new hid();
        this.f2278i = new bvv(bus, (ird) cameraContentProviderComponent.f1260b.f22692p.mo345a(), new bvy(bwa.f11358a), new bvt(bwa.f11358a));
        if (this.f2274e.equals(this.f2273d.f1254b)) {
            return true;
        }
        String str = this.f2274e;
        String valueOf = String.valueOf(this.f2273d);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 81) + String.valueOf(valueOf).length());
        stringBuilder.append("authority from the request (");
        stringBuilder.append(str);
        stringBuilder.append(") doesn't match the current content provider flavor: ");
        stringBuilder.append(valueOf);
        bli.m866b("CamCntProvider", stringBuilder.toString());
        return false;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        String valueOf;
        m1225a();
        if ("r".equals(str)) {
            StringBuilder stringBuilder;
            switch (this.f2275f.match(uri)) {
                case 3:
                    valueOf = String.valueOf(uri);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
                    stringBuilder.append("loading badge icon ");
                    stringBuilder.append(valueOf);
                    bli.m869c("CamCntProvider", stringBuilder.toString());
                    return m1223a(uri, hrc.BADGE);
                case 4:
                    valueOf = String.valueOf(uri);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
                    stringBuilder.append("loading interact icon ");
                    stringBuilder.append(valueOf);
                    bli.m869c("CamCntProvider", stringBuilder.toString());
                    return m1223a(uri, hrc.INTERACT);
                case 5:
                    valueOf = String.valueOf(uri);
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    stringBuilder.append("loading dialog icon ");
                    stringBuilder.append(valueOf);
                    bli.m869c("CamCntProvider", stringBuilder.toString());
                    return m1223a(uri, hrc.DIALOG);
                case 8:
                    try {
                        return openPipeHelper(Uri.EMPTY, "", Bundle.EMPTY, "", this.f2278i.mo593a(uri));
                    } catch (bvz e) {
                        String valueOf2 = String.valueOf(uri);
                        valueOf = e.getMessage();
                        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf2).length() + 33) + String.valueOf(valueOf).length());
                        stringBuilder2.append("Cannot load thumbnail for URI");
                        stringBuilder2.append(valueOf2);
                        stringBuilder2.append(" ex=");
                        stringBuilder2.append(valueOf);
                        throw new FileNotFoundException(stringBuilder2.toString());
                    }
                default:
                    String valueOf3 = String.valueOf(uri);
                    StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
                    stringBuilder3.append("Unrecognized format: ");
                    stringBuilder3.append(valueOf3);
                    throw new IllegalArgumentException(stringBuilder3.toString());
            }
        }
        valueOf = String.valueOf(str);
        valueOf2 = "Unsupported mode: ";
        if (valueOf.length() == 0) {
            valueOf = new String(valueOf2);
        } else {
            valueOf = valueOf2.concat(valueOf);
        }
        throw new IllegalArgumentException(valueOf);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        buy buy;
        m1225a();
        buz buz = this.f2276g;
        switch (buz.f1602d.match(uri)) {
            case 1:
                buy = buz.f1599a;
                break;
            case 2:
                buy = buz.f1600b;
                break;
            case 7:
            case 8:
                buy = buz.f1601c;
                break;
            default:
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder.append("Unrecognized uri: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
        return buy.mo589a(uri, strArr);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    private final void m1225a() {
        if (!this.f2271b.m861a(getCallingPackage())) {
            throw new SecurityException();
        }
    }
}
