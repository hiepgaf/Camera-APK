package p000;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: hii */
public final class hii {
    /* renamed from: a */
    public hir f6228a = hir.PORTRAIT;

    static {
        bli.m862a("LLRotator");
    }

    /* renamed from: b */
    private static int m3175b(hir hir) {
        switch (hir.ordinal()) {
            case 0:
                return 0;
            case 1:
                return 3;
            case 2:
                return 1;
            case 3:
                return 2;
            default:
                String valueOf = String.valueOf(hir);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
                stringBuilder.append("Invalid orientation to rotate: ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: c */
    private static boolean m3176c(hir hir) {
        return hir == hir.LANDSCAPE || hir == hir.REVERSE_LANDSCAPE;
    }

    /* renamed from: a */
    public static boolean m3173a(hir hir) {
        return hir == hir.LANDSCAPE || hir == hir.REVERSE_PORTRAIT;
    }

    /* renamed from: a */
    private static int[] m3174a(int[] iArr, int i) {
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        while (true) {
            int length = iArr.length;
            if (i2 >= length) {
                return iArr2;
            }
            iArr2[i2] = iArr[Math.floorMod(i2 - i, length)];
            i2++;
        }
    }

    /* renamed from: a */
    public static void m3172a(hir hir, hir hir2, LinearLayout... linearLayoutArr) {
        for (LinearLayout linearLayout : linearLayoutArr) {
            if (!hir.equals(hir2)) {
                int childCount;
                int i;
                if (hii.m3173a(hir2) != hii.m3173a(hir)) {
                    ArrayList arrayList = new ArrayList(linearLayout.getChildCount());
                    for (childCount = linearLayout.getChildCount() - 1; childCount >= 0; childCount--) {
                        arrayList.add(linearLayout.getChildAt(childCount));
                    }
                    linearLayout.removeAllViews();
                    int size = arrayList.size();
                    childCount = 0;
                    while (childCount < size) {
                        i = childCount + 1;
                        linearLayout.addView((View) arrayList.get(childCount));
                        childCount = i;
                    }
                }
                if (hii.m3176c(hir2) != hii.m3176c(hir)) {
                    LayoutParams layoutParams = linearLayout.getLayoutParams();
                    if (layoutParams != null) {
                        i = layoutParams.height;
                        layoutParams.height = layoutParams.width;
                        layoutParams.width = i;
                        linearLayout.setLayoutParams(layoutParams);
                    }
                }
                if (hii.m3176c(hir2) != hii.m3176c(hir)) {
                    if (linearLayout.getOrientation() == 0) {
                        linearLayout.setOrientation(1);
                    } else {
                        linearLayout.setOrientation(0);
                    }
                }
                i = hii.m3175b(hir2) - hii.m3175b(hir);
                int[] a = hii.m3174a(new int[]{linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), linearLayout.getPaddingBottom()}, i);
                linearLayout.setPadding(a[0], a[1], a[2], a[3]);
                if (linearLayout.getLayoutParams() != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) linearLayout.getLayoutParams();
                    int[] a2 = hii.m3174a(new int[]{marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin}, i);
                    ((MarginLayoutParams) linearLayout.getLayoutParams()).setMargins(a2[0], a2[1], a2[2], a2[3]);
                }
                if (linearLayout.getGravity() != 17) {
                    int gravity = linearLayout.getGravity();
                    int[] iArr = new int[4];
                    int i2 = gravity & 7;
                    if (i2 == 3) {
                        childCount = 1;
                    } else {
                        childCount = 0;
                    }
                    iArr[0] = childCount;
                    gravity &= 112;
                    if (gravity == 48) {
                        childCount = 1;
                    } else {
                        childCount = 0;
                    }
                    iArr[1] = childCount;
                    if (i2 == 5) {
                        childCount = 1;
                    } else {
                        childCount = 0;
                    }
                    iArr[2] = childCount;
                    if (gravity == 80) {
                        childCount = 1;
                    } else {
                        childCount = 0;
                    }
                    iArr[3] = childCount;
                    int[] a3 = hii.m3174a(iArr, i);
                    if (a3[0] == 1) {
                        childCount = 3;
                    } else if (a3[2] == 1) {
                        childCount = 5;
                    } else {
                        childCount = 0;
                    }
                    if (a3[1] == 1) {
                        childCount |= 48;
                    } else if (a3[3] == 1) {
                        childCount |= 80;
                    }
                    linearLayout.setGravity(childCount);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3177a(hir hir, LinearLayout... linearLayoutArr) {
        hii.m3172a(this.f6228a, hir, linearLayoutArr);
        this.f6228a = hir;
    }
}
