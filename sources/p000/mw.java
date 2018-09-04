package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.Map;

/* compiled from: PG */
/* renamed from: mw */
public class mw {
    /* renamed from: a */
    private static final Class[] f8851a = new Class[]{Context.class, AttributeSet.class};
    /* renamed from: b */
    private static final int[] f8852b = new int[]{16843375};
    /* renamed from: c */
    private static final String[] f8853c = new String[]{"android.widget.", "android.view.", "android.webkit."};
    /* renamed from: d */
    private static final Map f8854d = new ih();
    /* renamed from: e */
    private final Object[] f8855e = new Object[2];

    /* renamed from: a */
    static void m5595a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && jm.m4586t(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8852b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new mx(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    protected static qk m5596b(Context context, AttributeSet attributeSet) {
        return new qk(context, attributeSet);
    }

    /* renamed from: a */
    public qm mo131a(Context context, AttributeSet attributeSet) {
        return new qm(context, attributeSet);
    }

    /* renamed from: c */
    protected static qn m5597c(Context context, AttributeSet attributeSet) {
        return new qn(context, attributeSet);
    }

    /* renamed from: d */
    protected static qo m5598d(Context context, AttributeSet attributeSet) {
        return new qo(context, attributeSet);
    }

    /* renamed from: e */
    protected static qu m5599e(Context context, AttributeSet attributeSet) {
        return new qu(context, attributeSet);
    }

    /* renamed from: f */
    protected static qv m5600f(Context context, AttributeSet attributeSet) {
        return new qv(context, attributeSet);
    }

    /* renamed from: g */
    protected static qx m5601g(Context context, AttributeSet attributeSet) {
        return new qx(context, attributeSet);
    }

    /* renamed from: h */
    protected static qy m5602h(Context context, AttributeSet attributeSet) {
        return new qy(context, attributeSet);
    }

    /* renamed from: i */
    protected static rb m5603i(Context context, AttributeSet attributeSet) {
        return new rb(context, attributeSet);
    }

    /* renamed from: j */
    protected static rc m5604j(Context context, AttributeSet attributeSet) {
        return new rc(context, attributeSet);
    }

    /* renamed from: k */
    protected static rd m5605k(Context context, AttributeSet attributeSet) {
        return new rd(context, attributeSet);
    }

    /* renamed from: l */
    protected static rf m5606l(Context context, AttributeSet attributeSet) {
        return new rf(context, attributeSet);
    }

    /* renamed from: m */
    protected static rn m5607m(Context context, AttributeSet attributeSet) {
        return new rn(context, attributeSet);
    }

    /* renamed from: a */
    private final View m5594a(Context context, String str, String str2) {
        Constructor constructor = (Constructor) f8854d.get(str);
        if (constructor == null) {
            try {
                String stringBuilder;
                ClassLoader classLoader = context.getClassLoader();
                if (str2 != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(str2);
                    stringBuilder2.append(str);
                    stringBuilder = stringBuilder2.toString();
                } else {
                    stringBuilder = str;
                }
                constructor = classLoader.loadClass(stringBuilder).asSubclass(View.class).getConstructor(f8851a);
                f8854d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f8855e);
    }

    /* renamed from: a */
    final View m5609a(Context context, String str, AttributeSet attributeSet) {
        Object[] objArr;
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr2 = this.f8855e;
            objArr2[0] = context;
            objArr2[1] = attributeSet;
            View a;
            if (str.indexOf(46) == -1) {
                for (String a2 : f8853c) {
                    a = m5594a(context, str, a2);
                    if (a != null) {
                        return a;
                    }
                }
                objArr2 = this.f8855e;
                objArr2[0] = null;
                objArr2[1] = null;
                return null;
            }
            a = m5594a(context, str, null);
            objArr = this.f8855e;
            objArr[0] = null;
            objArr[1] = null;
            return a;
        } catch (Exception e) {
            return null;
        } finally {
            objArr = this.f8855e;
            objArr[0] = null;
            objArr[1] = null;
        }
    }

    /* renamed from: n */
    static Context m5608n(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ni.cD, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(ni.cJ, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (resourceId == 0) {
            return context;
        }
        if ((context instanceof nq) && ((nq) context).f8937a == resourceId) {
            return context;
        }
        return new nq(context, resourceId);
    }

    /* renamed from: a */
    final void m5611a(View view, String str) {
        if (view == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(getClass().getName());
            stringBuilder.append(" asked to inflate view for <");
            stringBuilder.append(str);
            stringBuilder.append(">, but returned null");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
