package p000;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: PG */
/* renamed from: na */
public final class na implements oq {
    /* renamed from: a */
    public final qr[] f19397a;

    public na(qr[] qrVarArr) {
        this.f19397a = qrVarArr;
    }

    /* renamed from: a */
    public static int m14133a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !na.m14136a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    /* renamed from: a */
    public static float m14131a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !na.m14136a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    /* renamed from: b */
    public static int m14137b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !na.m14136a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    /* renamed from: a */
    public static int m14132a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (na.m14136a(xmlPullParser, str)) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    /* renamed from: b */
    public static String m14138b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (na.m14136a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m14136a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* renamed from: a */
    public static TypedArray m14134a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* renamed from: a */
    public final boolean mo2337a(op opVar, MenuItem menuItem) {
        return false;
    }

    /* renamed from: m */
    public final void mo2352m() {
    }

    /* renamed from: a */
    public static TypedValue m14135a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (na.m14136a(xmlPullParser, str)) {
            return typedArray.peekValue(0);
        }
        return null;
    }
}
