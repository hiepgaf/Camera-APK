package p000;

import android.support.v8.renderscript.ScriptIntrinsicBLAS;
import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: jpa */
final class jpa implements jnp {
    jpa() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        if (jcc.f7688a != null) {
            return jcc.f7688a;
        }
        List arrayList = new ArrayList();
        List b = khb.m4885b();
        b.add(new jix(0, 0, 384, 256));
        b.add(new jix(0, 261, 384, 256));
        jiw jiw = jiw.LANDSCAPE;
        r5 = new Integer[2];
        Integer valueOf = Integer.valueOf(0);
        r5[0] = valueOf;
        Integer valueOf2 = Integer.valueOf(1);
        r5[1] = valueOf2;
        arrayList.add(new jiv(400, 533, 8, jiw, Arrays.asList(r5), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 256, 384));
        b.add(new jix(261, 0, 256, 384));
        arrayList.add(new jiv(533, 400, 8, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf, valueOf2}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 240, 118));
        b.add(new jix(0, 122, 118, 118));
        b.add(new jix(122, 122, 118, 118));
        arrayList.add(new jiv(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 5, jiw.LANDSCAPE, Arrays.asList(new Integer[]{valueOf}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 118, 118));
        b.add(new jix(0, 122, 240, 118));
        b.add(new jix(122, 0, 118, 118));
        arrayList.add(new jiv(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 5, jiw.LANDSCAPE, Arrays.asList(new Integer[]{valueOf2}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 118, 118));
        b.add(new jix(122, 0, 118, 118));
        b.add(new jix(0, 122, 240, 118));
        jiw = jiw.LANDSCAPE;
        r5 = new Integer[1];
        Integer valueOf3 = Integer.valueOf(2);
        r5[0] = valueOf3;
        arrayList.add(new jiv(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 5, jiw, Arrays.asList(r5), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 118, 240));
        b.add(new jix(122, 0, 118, 118));
        b.add(new jix(122, 122, 118, 118));
        arrayList.add(new jiv(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 5, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 118, 118));
        b.add(new jix(122, 0, 118, 240));
        b.add(new jix(0, 122, 118, 118));
        arrayList.add(new jiv(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 5, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf2}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 118, 118));
        b.add(new jix(0, 122, 118, 118));
        b.add(new jix(122, 0, 118, 240));
        arrayList.add(new jiv(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 5, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf3}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 118, 118));
        b.add(new jix(122, 0, 118, 118));
        b.add(new jix(0, 122, 118, 118));
        b.add(new jix(122, 122, 118, 118));
        jiw = jiw.LANDSCAPE;
        r5 = new Integer[4];
        r5[0] = valueOf;
        r5[1] = valueOf2;
        r5[2] = valueOf3;
        Integer valueOf4 = Integer.valueOf(3);
        r5[3] = valueOf4;
        arrayList.add(new jiv(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 5, jiw, Arrays.asList(r5), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 118, 118));
        b.add(new jix(122, 0, 118, 118));
        b.add(new jix(0, 122, 118, 118));
        b.add(new jix(122, 122, 118, 118));
        arrayList.add(new jiv(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 5, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf, valueOf2, valueOf3, valueOf4}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 59, 59));
        b.add(new jix(0, 60, 59, 59));
        b.add(new jix(60, 0, 59, 39));
        b.add(new jix(60, 40, 59, 39));
        b.add(new jix(60, 80, 59, 39));
        arrayList.add(new jiv(ScriptIntrinsicBLAS.RsBlas_cgemm, ScriptIntrinsicBLAS.RsBlas_cgemm, 3, jiw.LANDSCAPE, Arrays.asList(new Integer[]{valueOf, valueOf2}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 59, 59));
        b.add(new jix(60, 0, 59, 39));
        b.add(new jix(0, 60, 59, 59));
        b.add(new jix(60, 40, 59, 39));
        b.add(new jix(60, 80, 59, 39));
        arrayList.add(new jiv(ScriptIntrinsicBLAS.RsBlas_cgemm, ScriptIntrinsicBLAS.RsBlas_cgemm, 3, jiw.LANDSCAPE, Arrays.asList(new Integer[]{valueOf3}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 59, 39));
        b.add(new jix(0, 40, 59, 39));
        b.add(new jix(0, 80, 59, 39));
        b.add(new jix(60, 0, 59, 59));
        b.add(new jix(60, 60, 59, 59));
        jiw = jiw.LANDSCAPE;
        r5 = new Integer[2];
        r5[0] = valueOf4;
        r5[1] = Integer.valueOf(4);
        arrayList.add(new jiv(ScriptIntrinsicBLAS.RsBlas_cgemm, ScriptIntrinsicBLAS.RsBlas_cgemm, 3, jiw, Arrays.asList(r5), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 59, 59));
        b.add(new jix(60, 0, 59, 59));
        b.add(new jix(0, 60, 39, 59));
        b.add(new jix(40, 60, 39, 59));
        b.add(new jix(80, 60, 39, 59));
        arrayList.add(new jiv(ScriptIntrinsicBLAS.RsBlas_cgemm, ScriptIntrinsicBLAS.RsBlas_cgemm, 3, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf, valueOf2}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 59, 59));
        b.add(new jix(0, 60, 39, 59));
        b.add(new jix(60, 0, 59, 59));
        b.add(new jix(40, 60, 39, 59));
        b.add(new jix(80, 60, 39, 59));
        arrayList.add(new jiv(ScriptIntrinsicBLAS.RsBlas_cgemm, ScriptIntrinsicBLAS.RsBlas_cgemm, 3, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf3}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 39, 59));
        b.add(new jix(40, 0, 39, 59));
        b.add(new jix(80, 0, 39, 59));
        b.add(new jix(0, 60, 59, 59));
        b.add(new jix(60, 60, 59, 59));
        arrayList.add(new jiv(ScriptIntrinsicBLAS.RsBlas_cgemm, ScriptIntrinsicBLAS.RsBlas_cgemm, 3, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf4, r12}), b));
        jiv[] jivArr = (jiv[]) arrayList.toArray(new jiv[arrayList.size()]);
        jcc.f7688a = jivArr;
        return jivArr;
    }
}
