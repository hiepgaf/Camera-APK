package p000;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.util.Log;
import java.lang.reflect.AbstractMethod;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* renamed from: gy */
public class gy extends gx {
    /* renamed from: a */
    public final Class f21554a;
    /* renamed from: b */
    public final Method f21555b;
    /* renamed from: c */
    private final Constructor f21556c;
    /* renamed from: d */
    private final Method f21557d;
    /* renamed from: e */
    private final Method f21558e;
    /* renamed from: f */
    private final Method f21559f;
    /* renamed from: g */
    private final Method f21560g;

    public gy() {
        Class cls;
        Constructor constructor;
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method a;
        Throwable e;
        StringBuilder stringBuilder;
        AbstractMethod abstractMethod;
        Object obj;
        AbstractMethod abstractMethod2 = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class});
            method2 = cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE});
            method3 = cls.getMethod("freeze", new Class[0]);
            method4 = cls.getMethod("abortCreation", new Class[0]);
            a = mo3452a(cls);
        } catch (ClassNotFoundException e2) {
            e = e2;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect necessary methods for class ");
            stringBuilder.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), e);
            method4 = abstractMethod2;
            method3 = abstractMethod2;
            method2 = abstractMethod2;
            method = abstractMethod2;
            abstractMethod = abstractMethod2;
            obj = abstractMethod2;
            this.f21554a = cls;
            this.f21556c = constructor;
            this.f21557d = method;
            this.f21558e = method2;
            this.f21559f = method3;
            this.f21560g = method4;
            this.f21555b = a;
        } catch (NoSuchMethodException e3) {
            e = e3;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect necessary methods for class ");
            stringBuilder.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", stringBuilder.toString(), e);
            method4 = abstractMethod2;
            method3 = abstractMethod2;
            method2 = abstractMethod2;
            method = abstractMethod2;
            abstractMethod = abstractMethod2;
            obj = abstractMethod2;
            this.f21554a = cls;
            this.f21556c = constructor;
            this.f21557d = method;
            this.f21558e = method2;
            this.f21559f = method3;
            this.f21560g = method4;
            this.f21555b = a;
        }
        this.f21554a = cls;
        this.f21556c = constructor;
        this.f21557d = method;
        this.f21558e = method2;
        this.f21559f = method3;
        this.f21560g = method4;
        this.f21555b = a;
    }

    /* renamed from: c */
    private final void m15853c(Object obj) {
        Throwable e;
        try {
            this.f21560g.invoke(obj, new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private final boolean m15850a(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        Throwable e;
        try {
            return ((Boolean) this.f21557d.invoke(obj, new Object[]{context.getAssets(), str, Integer.valueOf(0), Boolean.valueOf(false), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private final boolean m15851a(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        Throwable e;
        try {
            return ((Boolean) this.f21558e.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    protected Typeface mo3451a(Object obj) {
        Throwable e;
        try {
            Array.set(Array.newInstance(this.f21554a, 1), 0, obj);
            Method method = this.f21555b;
            r2 = new Object[3];
            Integer valueOf = Integer.valueOf(-1);
            r2[1] = valueOf;
            r2[2] = valueOf;
            return (Typeface) method.invoke(null, r2);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public final Typeface mo3067a(Context context, na naVar, Resources resources, int i) {
        if (!m15849a()) {
            return super.mo3067a(context, naVar, resources, i);
        }
        Object b = m15852b();
        qr[] qrVarArr = naVar.f19397a;
        int length = qrVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            qr qrVar = qrVarArr[i2];
            if (m15850a(context, b, qrVar.f9077a, qrVar.f9081e, qrVar.f9078b, qrVar.f9079c, FontVariationAxis.fromFontVariationSettings(qrVar.f9080d))) {
                i2++;
            } else {
                m15853c(b);
                return null;
            }
        }
        if (m15854d(b)) {
            return mo3451a(b);
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final android.graphics.Typeface mo1665a(android.content.Context r11, p000.hq[] r12, int r13) {
        /*
        r10 = this;
        r0 = 0;
        r6 = 0;
        r8 = r12.length;
        if (r8 > 0) goto L_0x0007;
    L_0x0005:
        r0 = r6;
    L_0x0006:
        return r0;
    L_0x0007:
        r1 = r10.m15849a();
        if (r1 != 0) goto L_0x0049;
    L_0x000d:
        r0 = p000.ha.m2963a(r12, r13);
        r1 = r11.getContentResolver();
        r2 = r0.f6440a;	 Catch:{ IOException -> 0x003f }
        r3 = "r";
        r4 = 0;
        r1 = r1.openFileDescriptor(r2, r3, r4);	 Catch:{ IOException -> 0x003f }
        if (r1 == 0) goto L_0x0042;
    L_0x0020:
        r2 = new android.graphics.Typeface$Builder;	 Catch:{ all -> 0x0091 }
        r3 = r1.getFileDescriptor();	 Catch:{ all -> 0x0091 }
        r2.<init>(r3);	 Catch:{ all -> 0x0091 }
        r3 = r0.f6442c;	 Catch:{ all -> 0x0091 }
        r2 = r2.setWeight(r3);	 Catch:{ all -> 0x0091 }
        r0 = r0.f6443d;	 Catch:{ all -> 0x0091 }
        r0 = r2.setItalic(r0);	 Catch:{ all -> 0x0091 }
        r0 = r0.build();	 Catch:{ all -> 0x0091 }
        if (r1 == 0) goto L_0x0006;
    L_0x003b:
        r1.close();	 Catch:{ IOException -> 0x003f }
        goto L_0x0006;
    L_0x003f:
        r0 = move-exception;
        r0 = r6;
        goto L_0x0006;
    L_0x0042:
        if (r1 == 0) goto L_0x0047;
    L_0x0044:
        r1.close();	 Catch:{ IOException -> 0x003f }
    L_0x0047:
        r0 = r6;
        goto L_0x0006;
    L_0x0049:
        r9 = p000.hk.m3218a(r11, r12, r6);
        r1 = r10.m15852b();
        r7 = r0;
    L_0x0052:
        if (r7 >= r8) goto L_0x0078;
    L_0x0054:
        r5 = r12[r7];
        r2 = r5.f6440a;
        r2 = r9.get(r2);
        r2 = (java.nio.ByteBuffer) r2;
        if (r2 != 0) goto L_0x0064;
    L_0x0060:
        r2 = r7 + 1;
        r7 = r2;
        goto L_0x0052;
    L_0x0064:
        r3 = r5.f6441b;
        r4 = r5.f6442c;
        r5 = r5.f6443d;
        r0 = r10;
        r0 = r0.m15851a(r1, r2, r3, r4, r5);
        if (r0 == 0) goto L_0x0073;
    L_0x0071:
        r0 = 1;
        goto L_0x0060;
    L_0x0073:
        r10.m15853c(r1);
        r0 = r6;
        goto L_0x0006;
    L_0x0078:
        if (r0 != 0) goto L_0x007f;
    L_0x007a:
        r10.m15853c(r1);
        r0 = r6;
        goto L_0x0006;
    L_0x007f:
        r0 = r10.m15854d(r1);
        if (r0 != 0) goto L_0x0087;
    L_0x0085:
        r0 = r6;
        goto L_0x0006;
    L_0x0087:
        r0 = r10.mo3451a(r1);
        r0 = android.graphics.Typeface.create(r0, r13);
        goto L_0x0006;
    L_0x0091:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0093 }
    L_0x0093:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0099;
    L_0x0096:
        r1.close();	 Catch:{ all -> 0x009a }
    L_0x0099:
        throw r2;	 Catch:{ IOException -> 0x003f }
    L_0x009a:
        r1 = move-exception;
        p000.kqg.m5044a(r0, r1);	 Catch:{ IOException -> 0x003f }
        goto L_0x0099;
        */
        throw new UnsupportedOperationException("Method not decompiled: gy.a(android.content.Context, hq[], int):android.graphics.Typeface");
    }

    /* renamed from: a */
    public final Typeface mo3066a(Context context, Resources resources, int i, String str, int i2) {
        if (!m15849a()) {
            return super.mo3066a(context, resources, i, str, i2);
        }
        Object b = m15852b();
        if (!m15850a(context, b, str, 0, -1, -1, null)) {
            m15853c(b);
            return null;
        } else if (m15854d(b)) {
            return mo3451a(b);
        } else {
            return null;
        }
    }

    /* renamed from: d */
    private final boolean m15854d(Object obj) {
        Throwable e;
        try {
            return ((Boolean) this.f21559f.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    private final boolean m15849a() {
        if (this.f21557d == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f21557d != null;
    }

    /* renamed from: b */
    private final Object m15852b() {
        Throwable e;
        try {
            return this.f21556c.newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new RuntimeException(e);
        } catch (InstantiationException e3) {
            e = e3;
            throw new RuntimeException(e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    protected Method mo3452a(Class cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
