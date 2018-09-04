package p000;

import android.text.TextUtils;
import com.google.android.gms.wearable.Asset;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: igj */
public final class igj {
    /* renamed from: a */
    public final HashMap f6999a = new HashMap();

    /* renamed from: a */
    public final Object m3741a(String str) {
        return this.f6999a.get(str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof igj)) {
            return false;
        }
        igj igj = (igj) obj;
        if (this.f6999a.size() == igj.f6999a.size()) {
            for (String str : this.f6999a.keySet()) {
                Object a = m3741a(str);
                Object a2 = igj.m3741a(str);
                if (a instanceof Asset) {
                    if (!(a2 instanceof Asset)) {
                        return false;
                    }
                    Asset asset = (Asset) a;
                    Asset asset2 = (Asset) a2;
                    boolean equals = (asset == null || asset2 == null) ? asset == asset2 : TextUtils.isEmpty(asset.f20650b) ? Arrays.equals(asset.f20649a, asset2.f20649a) : asset.f20650b.equals(asset2.f20650b);
                    if (equals) {
                    }
                } else if (a instanceof String[]) {
                    if (!(a2 instanceof String[])) {
                        return false;
                    }
                    if (Arrays.equals((String[]) a, (String[]) a2)) {
                    }
                } else if (a instanceof long[]) {
                    if (!(a2 instanceof long[])) {
                        return false;
                    }
                    if (Arrays.equals((long[]) a, (long[]) a2)) {
                    }
                } else if (a instanceof float[]) {
                    if (!(a2 instanceof float[])) {
                        return false;
                    }
                    if (Arrays.equals((float[]) a, (float[]) a2)) {
                    }
                } else if (a instanceof byte[]) {
                    if (!(a2 instanceof byte[])) {
                        return false;
                    }
                    if (Arrays.equals((byte[]) a, (byte[]) a2)) {
                    }
                } else if (a == null || a2 == null) {
                    return a == a2;
                } else {
                    if (a.equals(a2)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f6999a.hashCode() * 29;
    }

    public final String toString() {
        return this.f6999a.toString();
    }
}
