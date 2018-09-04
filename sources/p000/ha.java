package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* renamed from: ha */
public class ha {
    ha() {
    }

    /* renamed from: a */
    public static void m2968a(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    /* renamed from: a */
    public static void m2972a(Object obj, StringBuilder stringBuilder) {
        if (obj == null) {
            stringBuilder.append("null");
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        stringBuilder.append(simpleName);
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    /* renamed from: a */
    public static int m2958a(int i) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: b */
    public static Object m2978b(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static Object m2965a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    /* renamed from: a */
    private static void m2971a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
            }
        }
    }

    /* renamed from: a */
    private static boolean m2976a(File file, Resources resources, int i) {
        Closeable openRawResource;
        Throwable th;
        try {
            openRawResource = resources.openRawResource(i);
            try {
                boolean a = ha.m2977a(file, (InputStream) openRawResource);
                ha.m2971a(openRawResource);
                return a;
            } catch (Throwable th2) {
                th = th2;
                ha.m2971a(openRawResource);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            openRawResource = null;
            ha.m2971a(openRawResource);
            throw th;
        }
    }

    /* renamed from: a */
    private static boolean m2977a(File file, InputStream inputStream) {
        Closeable fileOutputStream;
        IOException e;
        StringBuilder stringBuilder;
        Throwable th;
        try {
            fileOutputStream = new FileOutputStream(file, false);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        ha.m2971a(fileOutputStream);
                        return true;
                    }
                }
            } catch (IOException e2) {
                e = e2;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Error copying resource contents to temp file: ");
                    stringBuilder.append(e.getMessage());
                    Log.e("TypefaceCompatUtil", stringBuilder.toString());
                    ha.m2971a(fileOutputStream);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    ha.m2971a(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                ha.m2971a(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error copying resource contents to temp file: ");
            stringBuilder.append(e.getMessage());
            Log.e("TypefaceCompatUtil", stringBuilder.toString());
            ha.m2971a(fileOutputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            ha.m2971a(fileOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public Typeface mo3067a(Context context, na naVar, Resources resources, int i) {
        qr qrVar = (qr) ha.m2966a(naVar.f19397a, i, new hb());
        return qrVar != null ? gw.m2849a(context, resources, qrVar.f9082f, qrVar.f9077a, i) : null;
    }

    /* renamed from: a */
    public Typeface mo1665a(Context context, hq[] hqVarArr, int i) {
        Closeable openInputStream;
        Throwable th;
        Typeface typeface = null;
        if (hqVarArr.length > 0) {
            try {
                openInputStream = context.getContentResolver().openInputStream(ha.m2963a(hqVarArr, i).f6440a);
                try {
                    typeface = ha.m2959a(context, (InputStream) openInputStream);
                    ha.m2971a(openInputStream);
                } catch (IOException e) {
                    ha.m2971a(openInputStream);
                    return typeface;
                } catch (Throwable th2) {
                    th = th2;
                    ha.m2971a(openInputStream);
                    throw th;
                }
            } catch (IOException e2) {
                openInputStream = typeface;
                ha.m2971a(openInputStream);
                return typeface;
            } catch (Throwable th3) {
                Typeface typeface2 = typeface;
                th = th3;
                openInputStream = typeface2;
                ha.m2971a(openInputStream);
                throw th;
            }
        }
        return typeface;
    }

    /* renamed from: a */
    protected static Typeface m2959a(Context context, InputStream inputStream) {
        Typeface typeface = null;
        File a = ha.m2964a(context);
        if (a != null) {
            try {
                if (ha.m2977a(a, inputStream)) {
                    typeface = Typeface.createFromFile(a.getPath());
                } else {
                    a.delete();
                }
            } catch (RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }

    /* renamed from: a */
    public Typeface mo3066a(Context context, Resources resources, int i, String str, int i2) {
        Typeface typeface = null;
        File a = ha.m2964a(context);
        if (a != null) {
            try {
                if (ha.m2976a(a, resources, i)) {
                    typeface = Typeface.createFromFile(a.getPath());
                } else {
                    a.delete();
                }
            } catch (RuntimeException e) {
            } finally {
                a.delete();
            }
        }
        return typeface;
    }

    /* renamed from: a */
    private static Object m2966a(Object[] objArr, int i, hc hcVar) {
        int i2;
        boolean z;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) == 0) {
            z = false;
        } else {
            z = true;
        }
        int length = objArr.length;
        Object obj = null;
        int i3 = LfuScheduler.MAX_PRIORITY;
        int i4 = 0;
        while (i4 < length) {
            Object obj2;
            Object obj3 = objArr[i4];
            int abs = Math.abs(hcVar.mo1718a(obj3) - i2);
            int i5 = abs + abs;
            if (hcVar.mo1719b(obj3) == z) {
                abs = 0;
            } else {
                abs = 1;
            }
            abs += i5;
            if (obj == null) {
                obj2 = obj3;
            } else if (i3 > abs) {
                obj2 = obj3;
            } else {
                abs = i3;
                obj2 = obj;
            }
            i4++;
            obj = obj2;
            i3 = abs;
        }
        return obj;
    }

    /* renamed from: a */
    protected static hq m2963a(hq[] hqVarArr, int i) {
        return (hq) ha.m2966a((Object[]) hqVarArr, i, new jo());
    }

    /* renamed from: a */
    private static File m2964a(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(".font");
        stringBuilder.append(Process.myPid());
        stringBuilder.append("-");
        stringBuilder.append(Process.myTid());
        stringBuilder.append("-");
        String stringBuilder2 = stringBuilder.toString();
        int i = 0;
        while (i < 100) {
            File cacheDir = context.getCacheDir();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(stringBuilder2);
            stringBuilder3.append(i);
            File file = new File(cacheDir, stringBuilder3.toString());
            try {
                if (file.createNewFile()) {
                    return file;
                }
                i++;
            } catch (IOException e) {
            }
        }
        return null;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static java.nio.ByteBuffer m2967a(android.content.Context r9, android.os.CancellationSignal r10, android.net.Uri r11) {
        /*
        r6 = 0;
        r0 = r9.getContentResolver();
        r1 = "r";
        r7 = r0.openFileDescriptor(r11, r1, r10);	 Catch:{ IOException -> 0x0036 }
        if (r7 == 0) goto L_0x002f;
    L_0x000d:
        r8 = new java.io.FileInputStream;	 Catch:{ all -> 0x0039 }
        r0 = r7.getFileDescriptor();	 Catch:{ all -> 0x0039 }
        r8.<init>(r0);	 Catch:{ all -> 0x0039 }
        r0 = r8.getChannel();	 Catch:{ all -> 0x0042 }
        r4 = r0.size();	 Catch:{ all -> 0x0042 }
        r1 = java.nio.channels.FileChannel.MapMode.READ_ONLY;	 Catch:{ all -> 0x0042 }
        r2 = 0;
        r0 = r0.map(r1, r2, r4);	 Catch:{ all -> 0x0042 }
        r8.close();	 Catch:{ all -> 0x0039 }
        if (r7 == 0) goto L_0x002e;
    L_0x002b:
        r7.close();	 Catch:{ IOException -> 0x0036 }
    L_0x002e:
        return r0;
    L_0x002f:
        if (r7 == 0) goto L_0x0034;
    L_0x0031:
        r7.close();	 Catch:{ IOException -> 0x0036 }
    L_0x0034:
        r0 = r6;
        goto L_0x002e;
    L_0x0036:
        r0 = move-exception;
        r0 = r6;
        goto L_0x002e;
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003b }
    L_0x003b:
        r1 = move-exception;
        if (r7 == 0) goto L_0x0041;
    L_0x003e:
        r7.close();	 Catch:{ all -> 0x0049 }
    L_0x0041:
        throw r1;	 Catch:{ IOException -> 0x0036 }
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0044 }
    L_0x0044:
        r1 = move-exception;
        r8.close();	 Catch:{ all -> 0x004e }
    L_0x0048:
        throw r1;	 Catch:{ all -> 0x0039 }
    L_0x0049:
        r2 = move-exception;
        p000.kqg.m5044a(r0, r2);	 Catch:{ IOException -> 0x0036 }
        goto L_0x0041;
    L_0x004e:
        r2 = move-exception;
        p000.kqg.m5044a(r0, r2);	 Catch:{ all -> 0x0039 }
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.a(android.content.Context, android.os.CancellationSignal, android.net.Uri):java.nio.ByteBuffer");
    }

    /* renamed from: a */
    public static InputConnection m2962a(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof vy) {
                    editorInfo.hintText = ((vy) parent).m6078a();
                    break;
                }
            }
        }
        return inputConnection;
    }

    /* renamed from: a */
    public static boolean m2974a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        try {
            return viewParent.onNestedFling(view, f, f2, z);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(viewParent);
            stringBuilder.append(" does not implement interface ");
            stringBuilder.append("method onNestedFling");
            Log.e("ViewParentCompat", stringBuilder.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m2973a(ViewParent viewParent, View view, float f, float f2) {
        try {
            return viewParent.onNestedPreFling(view, f, f2);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ViewParent ");
            stringBuilder.append(viewParent);
            stringBuilder.append(" does not implement interface ");
            stringBuilder.append("method onNestedPreFling");
            Log.e("ViewParentCompat", stringBuilder.toString(), e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m2975a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof ji) {
            return ((ji) viewParent).mo137a(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append(viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onStartNestedScroll");
                Log.e("ViewParentCompat", stringBuilder.toString(), e);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m2969a(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static void m2970a(TextView textView, int i) {
        ha.m2958a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: a */
    public static Menu m2960a(Context context, hf hfVar) {
        return new pi(context, hfVar);
    }

    /* renamed from: a */
    public static MenuItem m2961a(Context context, hg hgVar) {
        return new oz(context, hgVar);
    }
}
