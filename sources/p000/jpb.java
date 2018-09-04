package p000;

import com.google.android.apps.camera.ui.shutterbutton.ShutterButton;
import com.google.android.libraries.smartburst.filterfw.decoder.MediaDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: jpb */
final class jpb implements jnp {
    jpb() {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo710a(jms jms) {
        if (jiz.f18843a != null) {
            return jiz.f18843a;
        }
        List arrayList = new ArrayList();
        List b = khb.m4885b();
        b.add(new jix(0, 0, 384, 288));
        b.add(new jix(0, 292, 384, 288));
        jiw jiw = jiw.LANDSCAPE;
        r5 = new Integer[2];
        Integer valueOf = Integer.valueOf(0);
        r5[0] = valueOf;
        Integer valueOf2 = Integer.valueOf(1);
        r5[1] = valueOf2;
        arrayList.add(new jiv(400, 596, 8, jiw, Arrays.asList(r5), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 288, 384));
        b.add(new jix(292, 0, 288, 384));
        arrayList.add(new jiv(596, 400, 8, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf, valueOf2}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 240, MediaDecoder.ROTATE_180));
        b.add(new jix(0, 185, 240, MediaDecoder.ROTATE_180));
        b.add(new jix(0, 370, 240, MediaDecoder.ROTATE_180));
        jiw = jiw.LANDSCAPE;
        r5 = new Integer[3];
        r5[0] = valueOf;
        r5[1] = valueOf2;
        Integer valueOf3 = Integer.valueOf(2);
        r5[2] = valueOf3;
        arrayList.add(new jiv(ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 560, 5, jiw, Arrays.asList(r5), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, MediaDecoder.ROTATE_180, 240));
        b.add(new jix(185, 0, MediaDecoder.ROTATE_180, 240));
        b.add(new jix(370, 0, MediaDecoder.ROTATE_180, 240));
        arrayList.add(new jiv(560, ShutterButton.BUTTON_CLICK_SPLASH_IN_DURATION_MS, 5, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf, valueOf2, valueOf3}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 209, 157));
        b.add(new jix(213, 0, 209, 157));
        b.add(new jix(0, 161, 209, 157));
        b.add(new jix(213, 161, 209, 157));
        jiw = jiw.LANDSCAPE;
        r5 = new Integer[4];
        r5[0] = valueOf;
        r5[1] = valueOf2;
        r5[2] = valueOf3;
        Integer valueOf4 = Integer.valueOf(3);
        r5[3] = valueOf4;
        arrayList.add(new jiv(432, 328, 5, jiw, Arrays.asList(r5), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 157, 209));
        b.add(new jix(161, 0, 157, 209));
        b.add(new jix(0, 213, 157, 209));
        b.add(new jix(161, 213, 157, 209));
        arrayList.add(new jiv(328, 432, 5, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf, valueOf2, valueOf3, valueOf4}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 192, 144));
        b.add(new jix(0, 148, 192, 144));
        b.add(new jix(196, 0, 128, 96));
        b.add(new jix(196, 98, 128, 96));
        b.add(new jix(196, 196, 128, 96));
        arrayList.add(new jiv(334, 302, 5, jiw.LANDSCAPE, Arrays.asList(new Integer[]{valueOf, valueOf2}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 192, 144));
        b.add(new jix(196, 0, 128, 96));
        b.add(new jix(0, 148, 192, 144));
        b.add(new jix(196, 98, 128, 96));
        b.add(new jix(196, 196, 128, 96));
        arrayList.add(new jiv(334, 302, 5, jiw.LANDSCAPE, Arrays.asList(new Integer[]{valueOf3}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 128, 96));
        b.add(new jix(0, 98, 128, 96));
        b.add(new jix(0, 196, 128, 96));
        b.add(new jix(132, 0, 192, 144));
        b.add(new jix(132, 148, 192, 144));
        jiw = jiw.LANDSCAPE;
        r5 = new Integer[2];
        r5[0] = valueOf4;
        r5[1] = Integer.valueOf(4);
        arrayList.add(new jiv(334, 302, 5, jiw, Arrays.asList(r5), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 144, 192));
        b.add(new jix(148, 0, 144, 192));
        b.add(new jix(0, 196, 96, 128));
        b.add(new jix(98, 196, 96, 128));
        b.add(new jix(196, 196, 96, 128));
        arrayList.add(new jiv(302, 334, 5, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf, valueOf2}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 144, 192));
        b.add(new jix(0, 196, 96, 128));
        b.add(new jix(148, 0, 144, 192));
        b.add(new jix(98, 196, 96, 128));
        b.add(new jix(196, 196, 96, 128));
        arrayList.add(new jiv(302, 334, 5, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf3}), b));
        b = khb.m4885b();
        b.add(new jix(0, 0, 96, 128));
        b.add(new jix(98, 0, 96, 128));
        b.add(new jix(196, 0, 96, 128));
        b.add(new jix(0, 132, 144, 192));
        b.add(new jix(148, 132, 144, 192));
        arrayList.add(new jiv(302, 334, 5, jiw.PORTRAIT, Arrays.asList(new Integer[]{valueOf4, r12}), b));
        jiv[] jivArr = (jiv[]) arrayList.toArray(new jiv[arrayList.size()]);
        jiz.f18843a = jivArr;
        return jivArr;
    }
}
