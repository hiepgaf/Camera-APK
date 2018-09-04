package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.GoogleCamera.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: qq */
public final class qq {
    /* renamed from: c */
    private static final Mode f9063c = Mode.SRC_IN;
    /* renamed from: d */
    private static qq f9064d;
    /* renamed from: e */
    private static final qs f9065e = new qs();
    /* renamed from: f */
    private static final int[] f9066f = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    /* renamed from: g */
    private static final int[] f9067g = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    /* renamed from: h */
    private static final int[] f9068h = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl_dark, R.drawable.abc_text_select_handle_middle_mtrl_dark, R.drawable.abc_text_select_handle_right_mtrl_dark, R.drawable.abc_text_select_handle_left_mtrl_light, R.drawable.abc_text_select_handle_middle_mtrl_light, R.drawable.abc_text_select_handle_right_mtrl_light};
    /* renamed from: i */
    private static final int[] f9069i = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    /* renamed from: j */
    private static final int[] f9070j = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    /* renamed from: k */
    private static final int[] f9071k = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material};
    /* renamed from: a */
    public final Object f9072a = new Object();
    /* renamed from: b */
    public final WeakHashMap f9073b = new WeakHashMap(0);
    /* renamed from: l */
    private WeakHashMap f9074l;
    /* renamed from: m */
    private TypedValue f9075m;
    /* renamed from: n */
    private boolean f9076n;

    /* renamed from: a */
    private final boolean m5728a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f9072a) {
            in inVar = (in) this.f9073b.get(context);
            if (inVar == null) {
                inVar = new in();
                this.f9073b.put(context, inVar);
            }
            inVar.m3867a(j, new WeakReference(constantState));
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m5729a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static ColorStateList m5730b(Context context, int i) {
        r0 = new int[4][];
        r1 = new int[4];
        int b = vf.m6040b(context, R.attr.colorControlHighlight);
        int a = vf.m6039a(context, R.attr.colorButtonNormal);
        r0[0] = vf.f9407a;
        r1[0] = a;
        r0[1] = vf.f9409c;
        r1[1] = gu.m2829a(b, i);
        r0[2] = vf.f9408b;
        r1[2] = gu.m2829a(b, i);
        r0[3] = vf.f9411e;
        r1[3] = i;
        return new ColorStateList(r0, r1);
    }

    /* renamed from: a */
    public static qq m5725a() {
        if (f9064d == null) {
            f9064d = new qq();
        }
        return f9064d;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final android.graphics.drawable.Drawable m5724a(android.content.Context r5, long r6) {
        /*
        r4 = this;
        r2 = 0;
        r3 = r4.f9072a;
        monitor-enter(r3);
        r0 = r4.f9073b;	 Catch:{ all -> 0x002b }
        r0 = r0.get(r5);	 Catch:{ all -> 0x002b }
        r0 = (p000.in) r0;	 Catch:{ all -> 0x002b }
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
    L_0x0010:
        return r0;
    L_0x0011:
        r1 = r0.m3869b(r6);	 Catch:{ all -> 0x002b }
        r1 = (java.lang.ref.WeakReference) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x0031;
    L_0x0019:
        r1 = r1.get();	 Catch:{ all -> 0x002b }
        r1 = (android.graphics.drawable.Drawable.ConstantState) r1;	 Catch:{ all -> 0x002b }
        if (r1 == 0) goto L_0x002e;
    L_0x0021:
        r0 = r5.getResources();	 Catch:{ all -> 0x002b }
        r0 = r1.newDrawable(r0);	 Catch:{ all -> 0x002b }
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        goto L_0x0010;
    L_0x002b:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        throw r0;
    L_0x002e:
        r0.m3866a(r6);	 Catch:{ all -> 0x002b }
    L_0x0031:
        monitor-exit(r3);	 Catch:{ all -> 0x002b }
        r0 = r2;
        goto L_0x0010;
        */
        throw new UnsupportedOperationException("Method not decompiled: qq.a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final android.graphics.drawable.Drawable m5732a(android.content.Context r13, int r14, boolean r15) {
        /*
        r12 = this;
        r6 = 2130772154; // 0x7f0100ba float:1.7147418E38 double:1.0527413204E-314;
        r3 = 2130772153; // 0x7f0100b9 float:1.7147416E38 double:1.05274132E-314;
        r5 = -1;
        r0 = 0;
        r2 = 1;
        r1 = r12.f9076n;
        if (r1 != 0) goto L_0x003d;
    L_0x000d:
        r12.f9076n = r2;
        r1 = 2130837587; // 0x7f020053 float:1.7280132E38 double:1.0527736486E-314;
        r1 = r12.m5732a(r13, r1, r0);
        if (r1 == 0) goto L_0x002f;
    L_0x0018:
        r4 = r1 instanceof p000.dw;
        if (r4 != 0) goto L_0x003b;
    L_0x001c:
        r4 = "android.graphics.drawable.VectorDrawable";
        r1 = r1.getClass();
        r1 = r1.getName();
        r1 = r4.equals(r1);
        if (r1 != 0) goto L_0x0039;
    L_0x002c:
        r1 = r0;
    L_0x002d:
        if (r1 != 0) goto L_0x003d;
    L_0x002f:
        r12.f9076n = r0;
        r0 = new java.lang.IllegalStateException;
        r1 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.";
        r0.<init>(r1);
        throw r0;
    L_0x0039:
        r1 = r2;
        goto L_0x002d;
    L_0x003b:
        r1 = r2;
        goto L_0x002d;
    L_0x003d:
        r1 = r12.f9075m;
        if (r1 != 0) goto L_0x0048;
    L_0x0041:
        r1 = new android.util.TypedValue;
        r1.<init>();
        r12.f9075m = r1;
    L_0x0048:
        r4 = r12.f9075m;
        r1 = r13.getResources();
        r1.getValue(r14, r4, r2);
        r1 = r4.assetCookie;
        r8 = (long) r1;
        r1 = 32;
        r8 = r8 << r1;
        r1 = r4.data;
        r10 = (long) r1;
        r8 = r8 | r10;
        r1 = r12.m5724a(r13, r8);
        if (r1 != 0) goto L_0x008a;
    L_0x0061:
        r7 = 2130837518; // 0x7f02000e float:1.7279992E38 double:1.0527736145E-314;
        if (r14 != r7) goto L_0x0080;
    L_0x0066:
        r1 = new android.graphics.drawable.LayerDrawable;
        r7 = 2;
        r7 = new android.graphics.drawable.Drawable[r7];
        r10 = 2130837517; // 0x7f02000d float:1.727999E38 double:1.052773614E-314;
        r10 = r12.m5732a(r13, r10, r0);
        r7[r0] = r10;
        r10 = 2130837519; // 0x7f02000f float:1.7279994E38 double:1.052773615E-314;
        r10 = r12.m5732a(r13, r10, r0);
        r7[r2] = r10;
        r1.<init>(r7);
    L_0x0080:
        if (r1 == 0) goto L_0x008a;
    L_0x0082:
        r4 = r4.changingConfigurations;
        r1.setChangingConfigurations(r4);
        r12.m5728a(r13, r8, r1);
    L_0x008a:
        if (r1 != 0) goto L_0x0090;
    L_0x008c:
        r1 = p000.ge.getDrawable(r13, r14);
    L_0x0090:
        if (r1 != 0) goto L_0x0098;
    L_0x0092:
        if (r1 == 0) goto L_0x0097;
    L_0x0094:
        p000.sg.m5805a();
    L_0x0097:
        return r1;
    L_0x0098:
        r4 = r12.m5731a(r13, r14);
        if (r4 == 0) goto L_0x00ba;
    L_0x009e:
        r0 = p000.sg.m5806a(r1);
        if (r0 == 0) goto L_0x00a8;
    L_0x00a4:
        r1 = r1.mutate();
    L_0x00a8:
        r1.setTintList(r4);
        r0 = 2130837571; // 0x7f020043 float:1.72801E38 double:1.0527736407E-314;
        if (r14 != r0) goto L_0x00b8;
    L_0x00b0:
        r0 = android.graphics.PorterDuff.Mode.MULTIPLY;
    L_0x00b2:
        if (r0 == 0) goto L_0x0092;
    L_0x00b4:
        r1.setTintMode(r0);
        goto L_0x0092;
    L_0x00b8:
        r0 = 0;
        goto L_0x00b2;
    L_0x00ba:
        r4 = 2130837568; // 0x7f020040 float:1.7280094E38 double:1.052773639E-314;
        if (r14 != r4) goto L_0x00f2;
    L_0x00bf:
        r0 = r1;
        r0 = (android.graphics.drawable.LayerDrawable) r0;
        r2 = 16908288; // 0x1020000 float:2.387723E-38 double:8.353804E-317;
        r2 = r0.findDrawableByLayerId(r2);
        r4 = p000.vf.m6040b(r13, r3);
        r5 = f9063c;
        p000.qq.m5726a(r2, r4, r5);
        r2 = 16908303; // 0x102000f float:2.387727E-38 double:8.3538116E-317;
        r2 = r0.findDrawableByLayerId(r2);
        r3 = p000.vf.m6040b(r13, r3);
        r4 = f9063c;
        p000.qq.m5726a(r2, r3, r4);
        r2 = 16908301; // 0x102000d float:2.3877265E-38 double:8.3538107E-317;
        r0 = r0.findDrawableByLayerId(r2);
        r2 = p000.vf.m6040b(r13, r6);
        r3 = f9063c;
        p000.qq.m5726a(r0, r2, r3);
        goto L_0x0092;
    L_0x00f2:
        r4 = 2130837559; // 0x7f020037 float:1.7280075E38 double:1.052773635E-314;
        if (r14 == r4) goto L_0x0101;
    L_0x00f7:
        r4 = 2130837558; // 0x7f020036 float:1.7280073E38 double:1.0527736343E-314;
        if (r14 == r4) goto L_0x0101;
    L_0x00fc:
        r4 = 2130837560; // 0x7f020038 float:1.7280078E38 double:1.0527736353E-314;
        if (r14 != r4) goto L_0x0135;
    L_0x0101:
        r0 = r1;
        r0 = (android.graphics.drawable.LayerDrawable) r0;
        r2 = 16908288; // 0x1020000 float:2.387723E-38 double:8.353804E-317;
        r2 = r0.findDrawableByLayerId(r2);
        r3 = p000.vf.m6039a(r13, r3);
        r4 = f9063c;
        p000.qq.m5726a(r2, r3, r4);
        r2 = 16908303; // 0x102000f float:2.387727E-38 double:8.3538116E-317;
        r2 = r0.findDrawableByLayerId(r2);
        r3 = p000.vf.m6040b(r13, r6);
        r4 = f9063c;
        p000.qq.m5726a(r2, r3, r4);
        r2 = 16908301; // 0x102000d float:2.3877265E-38 double:8.3538107E-317;
        r0 = r0.findDrawableByLayerId(r2);
        r2 = p000.vf.m6040b(r13, r6);
        r3 = f9063c;
        p000.qq.m5726a(r0, r2, r3);
        goto L_0x0092;
    L_0x0135:
        r4 = f9063c;
        r7 = f9066f;
        r7 = p000.qq.m5729a(r7, r14);
        if (r7 == 0) goto L_0x0169;
    L_0x013f:
        r6 = r4;
        r7 = r3;
        r3 = r2;
        r4 = r5;
    L_0x0143:
        if (r3 == 0) goto L_0x0160;
    L_0x0145:
        r0 = p000.sg.m5806a(r1);
        if (r0 == 0) goto L_0x0167;
    L_0x014b:
        r0 = r1.mutate();
    L_0x014f:
        r3 = p000.vf.m6040b(r13, r7);
        r3 = p000.qq.m5723a(r3, r6);
        r0.setColorFilter(r3);
        if (r4 == r5) goto L_0x015f;
    L_0x015c:
        r0.setAlpha(r4);
    L_0x015f:
        r0 = r2;
    L_0x0160:
        if (r0 != 0) goto L_0x0092;
    L_0x0162:
        if (r15 == 0) goto L_0x0092;
    L_0x0164:
        r1 = 0;
        goto L_0x0092;
    L_0x0167:
        r0 = r1;
        goto L_0x014f;
    L_0x0169:
        r3 = f9068h;
        r3 = p000.qq.m5729a(r3, r14);
        if (r3 == 0) goto L_0x0176;
    L_0x0171:
        r3 = r2;
        r7 = r6;
        r6 = r4;
        r4 = r5;
        goto L_0x0143;
    L_0x0176:
        r3 = f9069i;
        r3 = p000.qq.m5729a(r3, r14);
        if (r3 == 0) goto L_0x0188;
    L_0x017e:
        r3 = android.graphics.PorterDuff.Mode.MULTIPLY;
        r4 = 16842801; // 0x1010031 float:2.3693695E-38 double:8.3214494E-317;
        r6 = r3;
        r7 = r4;
        r3 = r2;
        r4 = r5;
        goto L_0x0143;
    L_0x0188:
        r3 = 2130837545; // 0x7f020029 float:1.7280047E38 double:1.052773628E-314;
        if (r14 != r3) goto L_0x019c;
    L_0x018d:
        r3 = 1109603123; // 0x42233333 float:40.8 double:5.482167836E-315;
        r3 = java.lang.Math.round(r3);
        r6 = 16842800; // 0x1010030 float:2.3693693E-38 double:8.321449E-317;
        r7 = r6;
        r6 = r4;
        r4 = r3;
        r3 = r2;
        goto L_0x0143;
    L_0x019c:
        r3 = 2130837521; // 0x7f020011 float:1.7279998E38 double:1.052773616E-314;
        if (r14 != r3) goto L_0x01a9;
    L_0x01a1:
        r3 = 16842801; // 0x1010031 float:2.3693695E-38 double:8.3214494E-317;
        r6 = r4;
        r7 = r3;
        r3 = r2;
        r4 = r5;
        goto L_0x0143;
    L_0x01a9:
        r3 = r0;
        r6 = r4;
        r7 = r0;
        r4 = r5;
        goto L_0x0143;
        */
        throw new UnsupportedOperationException("Method not decompiled: qq.a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m5723a(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) f9065e.m3903a(Integer.valueOf(qs.m14330a(i, mode)));
        if (porterDuffColorFilter != null) {
            return porterDuffColorFilter;
        }
        porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
        f9065e.m3904a(Integer.valueOf(qs.m14330a(i, mode)), porterDuffColorFilter);
        return porterDuffColorFilter;
    }

    /* renamed from: a */
    final ColorStateList m5731a(Context context, int i) {
        ja jaVar;
        ColorStateList colorStateList;
        int a;
        WeakHashMap weakHashMap = this.f9074l;
        if (weakHashMap != null) {
            jaVar = (ja) weakHashMap.get(context);
            if (jaVar == null) {
                colorStateList = null;
            } else {
                Object obj;
                a = il.m3809a(jaVar.f7599c, jaVar.f7601e, i);
                if (a < 0) {
                    obj = null;
                } else if (jaVar.f7600d[a] != ja.f7597a) {
                    obj = jaVar.f7600d[a];
                } else {
                    obj = null;
                }
                colorStateList = (ColorStateList) obj;
            }
        } else {
            colorStateList = null;
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ColorStateList a2;
        if (i == R.drawable.abc_edit_text_material) {
            a2 = nj.m5619a(context, R.color.abc_tint_edittext);
        } else if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            a2 = nj.m5619a(context, R.color.abc_tint_switch_track);
        } else if (i != R.drawable.abc_switch_thumb_material) {
            a2 = i != R.drawable.abc_btn_default_mtrl_shape ? i == R.drawable.abc_btn_borderless_material ? qq.m5730b(context, 0) : i != R.drawable.abc_btn_colored_material ? (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) ? nj.m5619a(context, R.color.abc_tint_spinner) : qq.m5729a(f9067g, i) ? vf.m6041c(context, R.attr.colorControlNormal) : qq.m5729a(f9070j, i) ? nj.m5619a(context, R.color.abc_tint_default) : qq.m5729a(f9071k, i) ? nj.m5619a(context, R.color.abc_tint_btn_checkable) : i == R.drawable.abc_seekbar_thumb_material ? nj.m5619a(context, R.color.abc_tint_seek_thumb) : colorStateList : qq.m5730b(context, vf.m6040b(context, R.attr.colorAccent)) : qq.m5730b(context, vf.m6040b(context, R.attr.colorButtonNormal));
        } else {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            a2 = vf.m6041c(context, R.attr.colorSwitchThumbNormal);
            if (a2 == null || !a2.isStateful()) {
                iArr[0] = vf.f9407a;
                iArr2[0] = vf.m6039a(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = vf.f9410d;
                iArr2[1] = vf.m6040b(context, R.attr.colorControlActivated);
                iArr[2] = vf.f9411e;
                iArr2[2] = vf.m6040b(context, R.attr.colorSwitchThumbNormal);
            } else {
                iArr[0] = vf.f9407a;
                iArr2[0] = a2.getColorForState(iArr[0], 0);
                iArr[1] = vf.f9410d;
                iArr2[1] = vf.m6040b(context, R.attr.colorControlActivated);
                iArr[2] = vf.f9411e;
                iArr2[2] = a2.getDefaultColor();
            }
            a2 = new ColorStateList(iArr, iArr2);
        }
        if (a2 == null) {
            return a2;
        }
        if (this.f9074l == null) {
            this.f9074l = new WeakHashMap();
        }
        jaVar = (ja) this.f9074l.get(context);
        if (jaVar == null) {
            jaVar = new ja();
            this.f9074l.put(context, jaVar);
        }
        a = jaVar.f7601e;
        if (a == 0 || i > jaVar.f7599c[a - 1]) {
            if (jaVar.f7598b && a >= jaVar.f7599c.length) {
                jaVar.m4372a();
            }
            a = jaVar.f7601e;
            if (a >= jaVar.f7599c.length) {
                int a3 = il.m3808a(a + 1);
                Object obj2 = new int[a3];
                Object obj3 = new Object[a3];
                Object obj4 = jaVar.f7599c;
                System.arraycopy(obj4, 0, obj2, 0, obj4.length);
                obj4 = jaVar.f7600d;
                System.arraycopy(obj4, 0, obj3, 0, obj4.length);
                jaVar.f7599c = obj2;
                jaVar.f7600d = obj3;
            }
            jaVar.f7599c[a] = i;
            jaVar.f7600d[a] = a2;
            jaVar.f7601e = a + 1;
        } else {
            jaVar.m4373a(i, a2);
        }
        return a2;
    }

    /* renamed from: a */
    private static void m5726a(Drawable drawable, int i, Mode mode) {
        if (sg.m5806a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f9063c;
        }
        drawable.setColorFilter(qq.m5723a(i, mode));
    }

    /* renamed from: a */
    static void m5727a(Drawable drawable, vi viVar, int[] iArr) {
        ColorFilter colorFilter = null;
        if (!sg.m5806a(drawable) || drawable.mutate() == drawable) {
            boolean z = viVar.f9417d;
            if (z || viVar.f9416c) {
                ColorStateList colorStateList;
                Mode mode;
                if (z) {
                    colorStateList = viVar.f9414a;
                } else {
                    colorStateList = null;
                }
                if (viVar.f9416c) {
                    mode = viVar.f9415b;
                } else {
                    mode = f9063c;
                }
                if (!(colorStateList == null || mode == null)) {
                    colorFilter = qq.m5723a(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(colorFilter);
                return;
            }
            drawable.clearColorFilter();
            return;
        }
        Log.d("AppCompatDrawableManag", "Mutated drawable is not the same instance as the input.");
    }
}
