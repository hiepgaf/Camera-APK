package p000;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Property;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import com.google.android.libraries.smartburst.filterfw.filterpacks.video.VideoProviderSource;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: df */
public class df {
    /* renamed from: a */
    public final WeakReference f3022a;
    /* renamed from: b */
    public int f3023b;
    /* renamed from: c */
    public boolean f3024c;

    /* renamed from: a */
    public static void m1597a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* renamed from: a */
    public static int m1576a(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        return i > i3 ? i3 : i;
    }

    /* renamed from: a */
    public static Animator m1582a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, float f) {
        return df.m1583a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* renamed from: a */
    public static Animator m1583a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet, AnimatorSet animatorSet, int i, float f) {
        int depth = xmlPullParser.getDepth();
        Animator animator = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    Object obj;
                    if (name.equals("objectAnimator")) {
                        animator = df.m1586a(context, resources, theme, attributeSet, f, xmlPullParser);
                        obj = null;
                    } else if (name.equals("animator")) {
                        animator = df.m1591a(context, resources, theme, attributeSet, null, f, xmlPullParser);
                        obj = null;
                    } else if (name.equals("set")) {
                        Animator animatorSet2 = new AnimatorSet();
                        TypedArray a = na.m14134a(resources, theme, attributeSet, dr.f3209f);
                        df.m1583a(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, na.m14137b(a, xmlPullParser, "ordering", 0, 0), f);
                        a.recycle();
                        obj = null;
                        animator = animatorSet2;
                    } else if (name.equals("propertyValuesHolder")) {
                        PropertyValuesHolder[] a2 = df.m1606a(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser));
                        if (a2 == null) {
                            obj = 1;
                        } else if (animator == null) {
                            obj = 1;
                        } else if (animator instanceof ValueAnimator) {
                            ((ValueAnimator) animator).setValues(a2);
                            obj = 1;
                        } else {
                            obj = 1;
                        }
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown animator name: ");
                        stringBuilder.append(xmlPullParser.getName());
                        throw new RuntimeException(stringBuilder.toString());
                    }
                    if (animatorSet != null && r1 == null) {
                        ArrayList arrayList2;
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                        } else {
                            arrayList2 = arrayList;
                        }
                        arrayList2.add(animator);
                        arrayList = arrayList2;
                    }
                }
            }
        }
        if (!(animatorSet == null || arrayList == null)) {
            Animator[] animatorArr = new Animator[arrayList.size()];
            int size = arrayList.size();
            next = 0;
            int i2 = 0;
            while (next < size) {
                int i3 = i2 + 1;
                int i4 = next + 1;
                animatorArr[i2] = (Animator) arrayList.get(next);
                next = i4;
                i2 = i3;
            }
            if (i == 0) {
                animatorSet.playTogether(animatorArr);
            } else {
                animatorSet.playSequentially(animatorArr);
            }
        }
        return animator;
    }

    /* renamed from: a */
    public static Interpolator m1594a(Context context, XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        Interpolator interpolator = null;
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return interpolator;
            }
            if (next == 2) {
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
                String name = xmlPullParser.getName();
                if (name.equals("linearInterpolator")) {
                    interpolator = new LinearInterpolator();
                } else if (name.equals("accelerateInterpolator")) {
                    interpolator = new AccelerateInterpolator(context, asAttributeSet);
                } else if (name.equals("decelerateInterpolator")) {
                    interpolator = new DecelerateInterpolator(context, asAttributeSet);
                } else if (name.equals("accelerateDecelerateInterpolator")) {
                    interpolator = new AccelerateDecelerateInterpolator();
                } else if (name.equals("cycleInterpolator")) {
                    interpolator = new CycleInterpolator(context, asAttributeSet);
                } else if (name.equals("anticipateInterpolator")) {
                    interpolator = new AnticipateInterpolator(context, asAttributeSet);
                } else if (name.equals("overshootInterpolator")) {
                    interpolator = new OvershootInterpolator(context, asAttributeSet);
                } else if (name.equals("anticipateOvershootInterpolator")) {
                    interpolator = new AnticipateOvershootInterpolator(context, asAttributeSet);
                } else if (name.equals("bounceInterpolator")) {
                    interpolator = new BounceInterpolator();
                } else if (name.equals("pathInterpolator")) {
                    interpolator = new du(context, asAttributeSet, xmlPullParser);
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown interpolator name: ");
                    stringBuilder.append(xmlPullParser.getName());
                    throw new RuntimeException(stringBuilder.toString());
                }
            }
        }
        return interpolator;
    }

    /* renamed from: a */
    public static Keyframe m1584a(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* renamed from: a */
    public static void m1603a(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((float) ((i2 - i) + 2));
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    /* renamed from: a */
    public static ColorStateList m1592a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = nj.m5619a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m1607b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable b = nj.m5620b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(i);
    }

    /* renamed from: a */
    public static fn m1595a(ViewGroup viewGroup) {
        return new fn(viewGroup);
    }

    /* renamed from: a */
    public static PropertyValuesHolder m1589a(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        int i5;
        TypedValue peekValue = typedArray.peekValue(i2);
        if (peekValue != null) {
            i4 = peekValue.type;
        } else {
            i4 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(i3);
        if (peekValue2 != null) {
            i5 = peekValue2.type;
        } else {
            i5 = 0;
        }
        if (i == 4) {
            i = (peekValue == null || !df.m1605a(i4)) ? peekValue2 != null ? !df.m1605a(i5) ? 0 : 3 : 0 : 3;
        }
        if (i == 2) {
            String string = typedArray.getString(i2);
            String string2 = typedArray.getString(i3);
            qt[] a = qr.m5736a(string);
            qt[] a2 = qr.m5736a(string2);
            if (a == null && a2 == null) {
                return null;
            }
            if (a != null) {
                TypeEvaluator dsVar = new ds();
                if (a2 == null) {
                    return PropertyValuesHolder.ofObject(str, dsVar, new Object[]{a});
                } else if (qr.m5734a(a, a2)) {
                    return PropertyValuesHolder.ofObject(str, dsVar, new Object[]{a, a2});
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(" Can't morph from ");
                    stringBuilder.append(string);
                    stringBuilder.append(" to ");
                    stringBuilder.append(string2);
                    throw new InflateException(stringBuilder.toString());
                }
            } else if (a2 == null) {
                return null;
            } else {
                return PropertyValuesHolder.ofObject(str, new ds(), new Object[]{a2});
            }
        }
        PropertyValuesHolder ofFloat;
        if (i != 3) {
            TypeEvaluator typeEvaluator = null;
        } else {
            Object obj = dt.f3302a;
        }
        if (i == 0) {
            float dimension;
            if (peekValue != null) {
                float dimension2;
                if (i4 == 5) {
                    dimension2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    dimension2 = typedArray.getFloat(i2, 0.0f);
                }
                if (peekValue2 != null) {
                    if (i5 == 5) {
                        dimension = typedArray.getDimension(i3, 0.0f);
                    } else {
                        dimension = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2, dimension});
                } else {
                    ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension2});
                }
            } else {
                if (i5 == 5) {
                    dimension = typedArray.getDimension(i3, 0.0f);
                } else {
                    dimension = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = PropertyValuesHolder.ofFloat(str, new float[]{dimension});
            }
        } else if (peekValue != null) {
            int dimension3;
            if (i4 == 5) {
                dimension3 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (df.m1605a(i4)) {
                dimension3 = typedArray.getColor(i2, 0);
            } else {
                dimension3 = typedArray.getInt(i2, 0);
            }
            if (peekValue2 != null) {
                if (i5 == 5) {
                    i4 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (df.m1605a(i5)) {
                    i4 = typedArray.getColor(i3, 0);
                } else {
                    i4 = typedArray.getInt(i3, 0);
                }
                ofFloat = PropertyValuesHolder.ofInt(str, new int[]{dimension3, i4});
            } else {
                ofFloat = PropertyValuesHolder.ofInt(str, new int[]{dimension3});
            }
        } else if (peekValue2 != null) {
            if (i5 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (df.m1605a(i5)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            ofFloat = PropertyValuesHolder.ofInt(str, new int[]{i4});
        } else {
            ofFloat = null;
        }
        if (ofFloat == null || typeEvaluator == null) {
            return ofFloat;
        }
        ofFloat.setEvaluator(typeEvaluator);
        return ofFloat;
    }

    /* renamed from: a */
    public static int m1578a(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(5);
        int i3;
        if (peekValue != null) {
            i3 = peekValue.type;
        } else {
            i3 = 0;
        }
        TypedValue peekValue2 = typedArray.peekValue(6);
        int i4;
        if (peekValue2 != null) {
            i4 = peekValue2.type;
        } else {
            i4 = 0;
        }
        if (peekValue != null && df.m1605a(r0)) {
            return 3;
        }
        if (peekValue2 == null || !df.m1605a(r3)) {
            return 0;
        }
        return 3;
    }

    /* renamed from: a */
    public static int m1577a(Resources resources, Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        int i = 0;
        TypedArray a = na.m14134a(resources, theme, attributeSet, dr.f3211h);
        TypedValue a2 = na.m14135a(a, xmlPullParser, "value");
        if (a2 != null && df.m1605a(a2.type)) {
            i = 3;
        }
        a.recycle();
        return i;
    }

    /* renamed from: a */
    public static boolean m1605a(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: a */
    static boolean m1604a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static Animator m1579a(Context context, int i) {
        return AnimatorInflater.loadAnimator(context, i);
    }

    /* renamed from: a */
    public static Animator m1580a(Context context, Resources resources, Theme theme, int i) {
        return df.m1581a(context, resources, theme, i, 1.0f);
    }

    /* renamed from: a */
    public static Animator m1581a(Context context, Resources resources, Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser;
        Throwable th;
        Throwable e;
        XmlResourceParser xmlResourceParser2;
        StringBuilder stringBuilder;
        NotFoundException notFoundException;
        XmlResourceParser xmlResourceParser3 = null;
        try {
            xmlResourceParser3 = resources.getAnimation(i);
            try {
                Animator a = df.m1582a(context, resources, theme, (XmlPullParser) xmlResourceParser3, 1.0f);
                if (xmlResourceParser3 != null) {
                    xmlResourceParser3.close();
                }
                return a;
            } catch (Throwable e2) {
                xmlResourceParser = xmlResourceParser3;
                th = e2;
                xmlResourceParser2 = xmlResourceParser;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't load animation resource ID #0x");
                    stringBuilder.append(Integer.toHexString(i));
                    notFoundException = new NotFoundException(stringBuilder.toString());
                    notFoundException.initCause(th);
                    throw notFoundException;
                } catch (Throwable th2) {
                    xmlResourceParser = xmlResourceParser2;
                    e2 = th2;
                    xmlResourceParser3 = xmlResourceParser;
                    if (xmlResourceParser3 != null) {
                        xmlResourceParser3.close();
                    }
                    throw e2;
                }
            } catch (Throwable e22) {
                xmlResourceParser = xmlResourceParser3;
                th2 = e22;
                xmlResourceParser2 = xmlResourceParser;
                try {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Can't load animation resource ID #0x");
                    stringBuilder.append(Integer.toHexString(i));
                    notFoundException = new NotFoundException(stringBuilder.toString());
                    notFoundException.initCause(th2);
                    throw notFoundException;
                } catch (Throwable th22) {
                    xmlResourceParser = xmlResourceParser2;
                    e22 = th22;
                    xmlResourceParser3 = xmlResourceParser;
                    if (xmlResourceParser3 != null) {
                        xmlResourceParser3.close();
                    }
                    throw e22;
                }
            } catch (Throwable th3) {
                e22 = th3;
                if (xmlResourceParser3 != null) {
                    xmlResourceParser3.close();
                }
                throw e22;
            }
        } catch (Throwable e222) {
            xmlResourceParser = xmlResourceParser3;
            th22 = e222;
            xmlResourceParser2 = xmlResourceParser;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't load animation resource ID #0x");
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(th22);
            throw notFoundException;
        } catch (Throwable e2222) {
            xmlResourceParser = xmlResourceParser3;
            th22 = e2222;
            xmlResourceParser2 = xmlResourceParser;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Can't load animation resource ID #0x");
            stringBuilder.append(Integer.toHexString(i));
            notFoundException = new NotFoundException(stringBuilder.toString());
            notFoundException.initCause(th22);
            throw notFoundException;
        } catch (Throwable th4) {
            e2222 = th4;
            if (xmlResourceParser3 != null) {
                xmlResourceParser3.close();
            }
            throw e2222;
        }
    }

    /* renamed from: a */
    public static ValueAnimator m1591a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray a = na.m14134a(resources, theme, attributeSet, dr.f3208e);
        TypedArray a2 = na.m14134a(resources, theme, attributeSet, dr.f3212i);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        df.m1600a(valueAnimator, a, a2, f, xmlPullParser);
        int a3 = na.m14132a(a, xmlPullParser, "interpolator", 0);
        if (a3 > 0) {
            valueAnimator.setInterpolator(df.m1608b(context, a3));
        }
        a.recycle();
        if (a2 != null) {
            a2.recycle();
        }
        return valueAnimator;
    }

    /* renamed from: b */
    public static Interpolator m1608b(Context context, int i) {
        return AnimationUtils.loadInterpolator(context, i);
    }

    /* renamed from: a */
    public static Keyframe m1585a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        int i2;
        Keyframe ofFloat;
        TypedArray a = na.m14134a(resources, theme, attributeSet, dr.f3211h);
        float a2 = na.m14131a(a, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue a3 = na.m14135a(a, xmlPullParser, "value");
        if (a3 == null) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        if (i == 4) {
            if (i2 == 0) {
                i = 0;
            } else if (df.m1605a(a3.type)) {
                i = 3;
            } else {
                i = 0;
            }
        }
        if (i2 != 0) {
            switch (i) {
                case 0:
                    ofFloat = Keyframe.ofFloat(a2, na.m14131a(a, xmlPullParser, "value", 0, 0.0f));
                    break;
                case 1:
                case 3:
                    ofFloat = Keyframe.ofInt(a2, na.m14137b(a, xmlPullParser, "value", 0, 0));
                    break;
                default:
                    ofFloat = null;
                    break;
            }
        } else if (i == 0) {
            ofFloat = Keyframe.ofFloat(a2);
        } else {
            ofFloat = Keyframe.ofInt(a2);
        }
        int a4 = na.m14132a(a, xmlPullParser, "interpolator", 1);
        if (a4 > 0) {
            ofFloat.setInterpolator(df.m1608b(context, a4));
        }
        a.recycle();
        return ofFloat;
    }

    /* renamed from: a */
    public static ObjectAnimator m1586a(Context context, Resources resources, Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ValueAnimator objectAnimator = new ObjectAnimator();
        df.m1591a(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    /* renamed from: a */
    public static PropertyValuesHolder m1588a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        Keyframe a;
        int i2;
        float fraction;
        Keyframe[] keyframeArr;
        Keyframe keyframe;
        int i3;
        int i4;
        PropertyValuesHolder ofKeyframe;
        ArrayList arrayList = null;
        int i5 = i;
        while (true) {
            int size;
            Keyframe keyframe2;
            float fraction2;
            int next = xmlPullParser.next();
            if (next != 3 && next != 1) {
                ArrayList arrayList2;
                if (xmlPullParser.getName().equals("keyframe")) {
                    if (i5 == 4) {
                        i5 = df.m1577a(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                    }
                    a = df.m1585a(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i5, xmlPullParser);
                    if (a != null) {
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                        } else {
                            arrayList2 = arrayList;
                        }
                        arrayList2.add(a);
                    } else {
                        arrayList2 = arrayList;
                    }
                    xmlPullParser.next();
                } else {
                    arrayList2 = arrayList;
                }
                arrayList = arrayList2;
            } else if (arrayList != null) {
                return null;
            } else {
                size = arrayList.size();
                if (size > 0) {
                    return null;
                }
                keyframe2 = (Keyframe) arrayList.get(0);
                a = (Keyframe) arrayList.get(size - 1);
                fraction2 = a.getFraction();
                if (fraction2 < 1.0f) {
                    i2 = size;
                } else if (fraction2 >= 0.0f) {
                    a.setFraction(1.0f);
                    i2 = size;
                } else {
                    arrayList.add(arrayList.size(), df.m1584a(a, 1.0f));
                    i2 = size + 1;
                }
                fraction = keyframe2.getFraction();
                if (fraction != 0.0f) {
                    if (fraction >= 0.0f) {
                        keyframe2.setFraction(0.0f);
                    } else {
                        arrayList.add(0, df.m1584a(keyframe2, 0.0f));
                        i2++;
                    }
                }
                keyframeArr = new Keyframe[i2];
                arrayList.toArray(keyframeArr);
                for (next = 0; next < i2; next++) {
                    keyframe = keyframeArr[next];
                    if (keyframe.getFraction() >= 0.0f) {
                        if (next != 0) {
                            keyframe.setFraction(0.0f);
                        } else {
                            i3 = i2 - 1;
                            if (next != i3) {
                                keyframe.setFraction(1.0f);
                            } else {
                                size = next + 1;
                                i4 = next;
                                while (size < i3 && keyframeArr[size].getFraction() < 0.0f) {
                                    i4 = size;
                                    size++;
                                }
                                df.m1603a(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[next - 1].getFraction(), next, i4);
                            }
                        }
                    }
                }
                ofKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
                if (i5 != 3) {
                    return ofKeyframe;
                }
                ofKeyframe.setEvaluator(dt.f3302a);
                return ofKeyframe;
            }
        }
        if (arrayList != null) {
            return null;
        }
        size = arrayList.size();
        if (size > 0) {
            return null;
        }
        keyframe2 = (Keyframe) arrayList.get(0);
        a = (Keyframe) arrayList.get(size - 1);
        fraction2 = a.getFraction();
        if (fraction2 < 1.0f) {
            i2 = size;
        } else if (fraction2 >= 0.0f) {
            arrayList.add(arrayList.size(), df.m1584a(a, 1.0f));
            i2 = size + 1;
        } else {
            a.setFraction(1.0f);
            i2 = size;
        }
        fraction = keyframe2.getFraction();
        if (fraction != 0.0f) {
            if (fraction >= 0.0f) {
                arrayList.add(0, df.m1584a(keyframe2, 0.0f));
                i2++;
            } else {
                keyframe2.setFraction(0.0f);
            }
        }
        keyframeArr = new Keyframe[i2];
        arrayList.toArray(keyframeArr);
        for (next = 0; next < i2; next++) {
            keyframe = keyframeArr[next];
            if (keyframe.getFraction() >= 0.0f) {
                if (next != 0) {
                    i3 = i2 - 1;
                    if (next != i3) {
                        size = next + 1;
                        i4 = next;
                        while (size < i3) {
                            i4 = size;
                            size++;
                        }
                        df.m1603a(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[next - 1].getFraction(), next, i4);
                    } else {
                        keyframe.setFraction(1.0f);
                    }
                } else {
                    keyframe.setFraction(0.0f);
                }
            }
        }
        ofKeyframe = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i5 != 3) {
            return ofKeyframe;
        }
        ofKeyframe.setEvaluator(dt.f3302a);
        return ofKeyframe;
    }

    /* renamed from: a */
    public static PropertyValuesHolder[] m1606a(Context context, Resources resources, Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        ArrayList arrayList = null;
        while (true) {
            PropertyValuesHolder[] propertyValuesHolderArr;
            int i;
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                if (arrayList != null) {
                    return null;
                }
                int size;
                size = arrayList.size();
                propertyValuesHolderArr = new PropertyValuesHolder[size];
                for (i = 0; i < size; i++) {
                    propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
                }
                return propertyValuesHolderArr;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    Object a;
                    ArrayList arrayList2;
                    TypedArray a2 = na.m14134a(resources, theme, attributeSet, dr.f3210g);
                    String b = na.m14138b(a2, xmlPullParser, "propertyName", 3);
                    int b2 = na.m14137b(a2, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder a3 = df.m1588a(context, resources, theme, xmlPullParser, b, b2);
                    if (a3 == null) {
                        a = df.m1589a(a2, b2, 0, 1, b);
                    } else {
                        PropertyValuesHolder propertyValuesHolder = a3;
                    }
                    if (a != null) {
                        if (arrayList == null) {
                            arrayList2 = new ArrayList();
                        } else {
                            arrayList2 = arrayList;
                        }
                        arrayList2.add(a);
                    } else {
                        arrayList2 = arrayList;
                    }
                    a2.recycle();
                    arrayList = arrayList2;
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            return null;
        }
        size = arrayList.size();
        propertyValuesHolderArr = new PropertyValuesHolder[size];
        for (i = 0; i < size; i++) {
            propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
        }
        return propertyValuesHolderArr;
    }

    /* renamed from: a */
    public static PropertyValuesHolder m1590a(Property property, Path path) {
        return PropertyValuesHolder.ofObject(property, null, path);
    }

    /* renamed from: a */
    public static ObjectAnimator m1587a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, property, null, path);
    }

    public void onCleared() {
    }

    /* renamed from: b */
    public static void m1609b() {
        throw new NoSuchMethodError();
    }

    /* renamed from: c */
    public static void m1611c() {
        throw new NoSuchMethodError();
    }

    /* renamed from: a */
    public static void m1600a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long b = (long) na.m14137b(typedArray, xmlPullParser, "duration", 1, VideoProviderSource.TIMESTAMP_FILTER_SIZE);
        long b2 = (long) na.m14137b(typedArray, xmlPullParser, "startOffset", 2, 0);
        int b3 = na.m14137b(typedArray, xmlPullParser, "valueType", 7, 4);
        if (na.m14136a(xmlPullParser, "valueFrom") && na.m14136a(xmlPullParser, "valueTo")) {
            if (b3 == 4) {
                b3 = df.m1578a(typedArray, 5, 6);
            }
            if (df.m1589a(typedArray, b3, 5, 6, "") != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{df.m1589a(typedArray, b3, 5, 6, "")});
            }
        }
        valueAnimator.setDuration(b);
        valueAnimator.setStartDelay(b2);
        valueAnimator.setRepeatCount(na.m14137b(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(na.m14137b(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            df.m1599a(valueAnimator, typedArray2, f, xmlPullParser);
        }
    }

    /* renamed from: a */
    public static Mode m1593a(int i, Mode mode) {
        switch (i) {
            case 3:
                return Mode.SRC_OVER;
            case 5:
                return Mode.SRC_IN;
            case 9:
                return Mode.SRC_ATOP;
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static void m1596a(Animator animator) {
        animator.pause();
    }

    /* renamed from: a */
    public static void m1598a(AnimatorSet animatorSet, List list) {
        Animator animator;
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        animator = ValueAnimator.ofInt(new int[]{0, 0});
        animator.setDuration(j);
        list.add(0, animator);
        animatorSet.playTogether(list);
    }

    /* renamed from: b */
    public static void m1610b(Animator animator) {
        animator.resume();
    }

    /* renamed from: a */
    public static void m1599a(ValueAnimator valueAnimator, TypedArray typedArray, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String b = na.m14138b(typedArray, xmlPullParser, "pathData", 1);
        if (b != null) {
            String b2 = na.m14138b(typedArray, xmlPullParser, "propertyXName", 2);
            String b3 = na.m14138b(typedArray, xmlPullParser, "propertyYName", 3);
            if (b2 == null && b3 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(stringBuilder.toString());
            }
            df.m1601a(qr.m5738b(b), objectAnimator, 0.5f * f, b2, b3);
            return;
        }
        objectAnimator.setPropertyName(na.m14138b(typedArray, xmlPullParser, "propertyName", 0));
    }

    /* renamed from: a */
    public static void m1601a(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PropertyValuesHolder ofFloat;
        PropertyValuesHolder ofFloat2;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Float.valueOf(0.0f));
        float f2 = 0.0f;
        do {
            f2 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f2));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f2 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f3 = f2 / ((float) (min - 1));
        int i = 0;
        int i2 = 0;
        f2 = 0.0f;
        while (i2 < min) {
            int i3;
            pathMeasure2.getPosTan(f2, fArr3, null);
            fArr[i2] = fArr3[0];
            fArr2[i2] = fArr3[1];
            float f4 = f2 + f3;
            int i4 = i + 1;
            if (i4 >= arrayList.size()) {
                f2 = f4;
                i3 = i;
            } else if (f4 > ((Float) arrayList.get(i4)).floatValue()) {
                f2 = f4 - ((Float) arrayList.get(i4)).floatValue();
                pathMeasure2.nextContour();
                i3 = i4;
            } else {
                f2 = f4;
                i3 = i;
            }
            i2++;
            i = i3;
        }
        if (str != null) {
            ofFloat = PropertyValuesHolder.ofFloat(str, fArr);
        } else {
            ofFloat = null;
        }
        if (str2 != null) {
            ofFloat2 = PropertyValuesHolder.ofFloat(str2, fArr2);
        } else {
            ofFloat2 = null;
        }
        if (ofFloat == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat2});
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator.setValues(new PropertyValuesHolder[]{ofFloat, ofFloat2});
        }
    }

    /* renamed from: a */
    public static void m1602a(ViewGroup viewGroup, boolean z) {
        if (!eu.f4233b) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                eu.f4232a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable e) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e);
            }
            eu.f4233b = true;
        }
        if (eu.f4232a != null) {
            try {
                eu.f4232a.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (Throwable e2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e2);
            } catch (Throwable e22) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e22);
            }
        }
    }
}
