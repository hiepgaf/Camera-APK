package p000;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: acc */
public class acc implements ComponentCallbacks2 {
    /* renamed from: i */
    private static volatile acc f185i;
    /* renamed from: j */
    private static volatile boolean f186j;
    /* renamed from: a */
    public final agw f187a;
    /* renamed from: b */
    public final ahw f188b;
    /* renamed from: c */
    public final ace f189c;
    /* renamed from: d */
    public final ach f190d;
    /* renamed from: e */
    public final agu f191e;
    /* renamed from: f */
    public final apf f192f;
    /* renamed from: g */
    public final aow f193g;
    /* renamed from: h */
    public final List f194h = new ArrayList();

    private acc(Context context, afs afs, ahw ahw, agw agw, agu agu, apf apf, aow aow, int i, aqg aqg, Map map) {
        this.f187a = agw;
        this.f191e = agu;
        this.f188b = ahw;
        this.f192f = apf;
        this.f193g = aow;
        aqg.f884s.m6303a(amm.f528a);
        ail ail = new ail();
        Resources resources = context.getResources();
        this.f190d = new ach();
        this.f190d.m103a(new ams());
        this.f190d.m103a(new ama());
        amm amm = new amm(this.f190d.m111a(), resources.getDisplayMetrics(), agw, agu);
        adq anv = new anv(context, this.f190d.m111a(), agw, agu);
        adq anf = new anf(agw, new anl());
        adq alx = new alx(amm);
        adq amz = new amz(amm, agu);
        adq ans = new ans(context);
        akb ako = new ako(resources);
        akb akp = new akp(resources);
        akb akn = new akn(resources);
        akb akm = new akm(resources);
        adr alu = new alu(agu);
        aok aok = new aok();
        aon aon = new aon();
        ContentResolver contentResolver = context.getContentResolver();
        ach a = this.f190d.m104a(ByteBuffer.class, new aix()).m104a(InputStream.class, new akq(agu)).m109a("Bitmap", ByteBuffer.class, Bitmap.class, alx).m109a("Bitmap", InputStream.class, Bitmap.class, amz).m109a("Bitmap", ParcelFileDescriptor.class, Bitmap.class, anf).m109a("Bitmap", AssetFileDescriptor.class, Bitmap.class, new anf(agw, new ani())).m107a(Bitmap.class, Bitmap.class, akw.f9864a).m109a("Bitmap", Bitmap.class, Bitmap.class, new and()).m105a(Bitmap.class, alu);
        alr alr = new alr(resources, alx);
        ach a2 = a.m109a("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, alr);
        alr = new alr(resources, amz);
        alr = new alr(resources, anf);
        adq aoj = new aoj(this.f190d.m111a(), anv, agu);
        String str = "Gif";
        String str2 = "Gif";
        str2 = "Bitmap";
        a2.m109a("BitmapDrawable", InputStream.class, BitmapDrawable.class, alr).m109a("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, alr).m105a(BitmapDrawable.class, new als(agw, alu)).m109a(str, InputStream.class, any.class, aoj).m109a(str2, ByteBuffer.class, any.class, anv).m105a(any.class, new aoa()).m107a(ada.class, ada.class, akw.f9864a).m109a(str2, ada.class, Bitmap.class, new aoh(agw)).m106a(Uri.class, Drawable.class, ans).m106a(Uri.class, Bitmap.class, new amy(ans, agw)).m102a(new ann()).m107a(File.class, ByteBuffer.class, new aja()).m107a(File.class, InputStream.class, new ajg((byte) 0)).m106a(File.class, File.class, new anu()).m107a(File.class, ParcelFileDescriptor.class, new ajg()).m107a(File.class, File.class, akw.f9864a).m102a(new aej(agu)).m107a(Integer.TYPE, InputStream.class, ako).m107a(Integer.TYPE, ParcelFileDescriptor.class, akn).m107a(Integer.class, InputStream.class, ako).m107a(Integer.class, ParcelFileDescriptor.class, akn).m107a(Integer.class, Uri.class, akp).m107a(Integer.TYPE, AssetFileDescriptor.class, akm).m107a(Integer.class, AssetFileDescriptor.class, akm).m107a(Integer.TYPE, Uri.class, akp).m107a(String.class, InputStream.class, new aje()).m107a(Uri.class, InputStream.class, new aje()).m107a(String.class, InputStream.class, new aku()).m107a(String.class, ParcelFileDescriptor.class, new akt()).m107a(String.class, AssetFileDescriptor.class, new aks()).m107a(Uri.class, InputStream.class, new ali()).m107a(Uri.class, InputStream.class, new aip(context.getAssets())).m107a(Uri.class, ParcelFileDescriptor.class, new aio(context.getAssets())).m107a(Uri.class, InputStream.class, new alk(context)).m107a(Uri.class, InputStream.class, new alm(context)).m107a(Uri.class, InputStream.class, new alc(contentResolver)).m107a(Uri.class, ParcelFileDescriptor.class, new ala(contentResolver)).m107a(Uri.class, AssetFileDescriptor.class, new akz(contentResolver)).m107a(Uri.class, InputStream.class, new ale()).m107a(URL.class, InputStream.class, new alo()).m107a(Uri.class, File.class, new ajt(context)).m107a(ajl.class, InputStream.class, new alg()).m107a(byte[].class, ByteBuffer.class, new air()).m107a(byte[].class, InputStream.class, new aiv()).m107a(Uri.class, Uri.class, akw.f9864a).m107a(Drawable.class, Drawable.class, akw.f9864a).m106a(Drawable.class, Drawable.class, new ant()).m108a(Bitmap.class, BitmapDrawable.class, new aol(resources)).m108a(Bitmap.class, byte[].class, (aoo) aok).m108a(Drawable.class, byte[].class, new aom(agw, aok, aon)).m108a(any.class, byte[].class, (aoo) aon);
        aqp aqp = new aqp();
        this.f189c = new ace(context, agu, this.f190d, aqg, map, afs, i);
    }

    /* renamed from: a */
    public static acc m98a(Context context) {
        if (f185i == null) {
            synchronized (acc.class) {
                if (f185i == null) {
                    if (f186j) {
                        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
                    }
                    Iterator it;
                    apn apn;
                    String valueOf;
                    f186j = true;
                    acd acd = new acd();
                    Context applicationContext = context.getApplicationContext();
                    acb a = acc.m97a();
                    Collections.emptyList();
                    List<apn> a2 = new app(applicationContext).m547a();
                    if (!(a == null || a.m14628a().isEmpty())) {
                        Set a3 = a.m14628a();
                        it = a2.iterator();
                        while (it.hasNext()) {
                            apn = (apn) it.next();
                            if (a3.contains(apn.getClass())) {
                                if (Log.isLoggable("Glide", 3)) {
                                    valueOf = String.valueOf(apn);
                                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 46);
                                    stringBuilder.append("AppGlideModule excludes manifest GlideModule: ");
                                    stringBuilder.append(valueOf);
                                    Log.d("Glide", stringBuilder.toString());
                                }
                                it.remove();
                            }
                        }
                    }
                    if (Log.isLoggable("Glide", 3)) {
                        for (apn apn2 : a2) {
                            valueOf = String.valueOf(apn2.getClass());
                            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
                            stringBuilder2.append("Discovered GlideModule from manifest: ");
                            stringBuilder2.append(valueOf);
                            Log.d("Glide", stringBuilder2.toString());
                        }
                    }
                    for (apn apn22 : a2) {
                        apn22.mo318b();
                    }
                    if (acd.f200f == null) {
                        int a4 = aie.m300a();
                        aih aih = aih.f496b;
                        acd.f200f = new aie(new ThreadPoolExecutor(a4, a4, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new aif("source", aih, false)));
                    }
                    if (acd.f201g == null) {
                        acd.f201g = aie.m302c();
                    }
                    if (acd.f207m == null) {
                        acd.f207m = aie.m301b();
                    }
                    if (acd.f203i == null) {
                        acd.f203i = new ahy(new ahz(applicationContext));
                    }
                    if (acd.f204j == null) {
                        acd.f204j = new aow();
                    }
                    if (acd.f197c == null) {
                        int i = acd.f203i.f471a;
                        if (i > 0) {
                            acd.f197c = new ahe((long) i);
                        } else {
                            acd.f197c = new agx();
                        }
                    }
                    if (acd.f198d == null) {
                        acd.f198d = new agu(acd.f203i.f473c);
                    }
                    if (acd.f199e == null) {
                        acd.f199e = new ahv((long) acd.f203i.f472b);
                    }
                    if (acd.f202h == null) {
                        acd.f202h = new ahn(applicationContext);
                    }
                    if (acd.f196b == null) {
                        ahw ahw = acd.f199e;
                        ahn ahn = acd.f202h;
                        aie aie = acd.f201g;
                        aie aie2 = acd.f200f;
                        aie aie3 = new aie(new ThreadPoolExecutor(0, LfuScheduler.MAX_PRIORITY, aie.f487a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new aif("source-unlimited", aih.f496b, false)));
                        acd.f196b = new afs(ahw, ahn, aie, aie2, aie3, aie.m301b());
                    }
                    apf apf = new apf(null);
                    afs afs = acd.f196b;
                    ahw ahw2 = acd.f199e;
                    agw agw = acd.f197c;
                    agu agu = acd.f198d;
                    aow aow = acd.f204j;
                    int i2 = acd.f205k;
                    aqg aqg = acd.f206l;
                    aqg.f887v = true;
                    Object acc = new acc(applicationContext, afs, ahw2, agw, agu, apf, aow, i2, aqg, acd.f195a);
                    for (apn c : a2) {
                        c.mo319c();
                    }
                    applicationContext.registerComponentCallbacks(acc);
                    f185i = acc;
                    f186j = false;
                }
            }
        }
        return f185i;
    }

    /* renamed from: a */
    private static acb m97a() {
        try {
            return (acb) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            if (!Log.isLoggable("Glide", 5)) {
                return null;
            }
            Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (Exception e2) {
            acc.m99a(e2);
            return null;
        } catch (Exception e22) {
            acc.m99a(e22);
            return null;
        } catch (Exception e222) {
            acc.m99a(e222);
            return null;
        } catch (Exception e2222) {
            acc.m99a(e2222);
            return null;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        arq.m653a();
        this.f188b.m292a();
        this.f187a.mo60a();
        this.f191e.m260a();
    }

    public void onTrimMemory(int i) {
        arq.m653a();
        this.f188b.mo84a(i);
        this.f187a.mo62a(i);
        this.f191e.m261a(i);
    }

    /* renamed from: a */
    final boolean m101a(aqs aqs) {
        synchronized (this.f194h) {
            for (acm b : this.f194h) {
                if (b.m6285b(aqs)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private static void m99a(Exception exception) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exception);
    }

    /* renamed from: b */
    public static acm m100b(Context context) {
        aqe.m585a((Object) context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        apf apf = acc.m98a(context).f192f;
        Context context2 = context;
        while (context2 != null) {
            if (arq.m655b() && !(context2 instanceof Application)) {
                acm acm;
                acm a;
                if (context2 instanceof FragmentActivity) {
                    context2 = (FragmentActivity) context2;
                    if ((arq.m655b() ^ 1) != 0) {
                        context2 = context2.getApplicationContext();
                    } else {
                        apf.m537a((Activity) context2);
                        apj a2 = apf.m541a(context2.getSupportFragmentManager(), context2.isFinishing() ^ 1);
                        acm = a2.f19809c;
                        if (acm != null) {
                            return acm;
                        }
                        a = apg.m542a(acc.m98a(context2), a2.f19807a, a2.f19808b, context2);
                        a2.f19809c = a;
                        return a;
                    }
                } else if (context2 instanceof Activity) {
                    context2 = (Activity) context2;
                    if ((arq.m655b() ^ 1) != 0) {
                        context2 = context2.getApplicationContext();
                    } else {
                        apf.m537a((Activity) context2);
                        apd a3 = apf.m540a(context2.getFragmentManager(), context2.isFinishing() ^ 1);
                        acm = a3.f822c;
                        if (acm != null) {
                            return acm;
                        }
                        a = apg.m542a(acc.m98a(context2), a3.f820a, a3.f821b, context2);
                        a3.f822c = a;
                        return a;
                    }
                } else if (context2 instanceof ContextWrapper) {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            }
            return apf.m539a(context2);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }
}
