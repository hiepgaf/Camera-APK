package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cmw */
final class cmw implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ Uri f2183a;
    /* renamed from: b */
    private final /* synthetic */ cmp f2184b;

    cmw(cmp cmp, Uri uri) {
        this.f2184b = cmp;
        this.f2183a = uri;
    }

    public final void onClick(View view) {
        cmy cmy = this.f2184b.f2160a;
        cot a = cmy.f2187a.m8332a(this.f2183a);
        synchronized (cmy.f2187a) {
            cls cls = cmy.f2187a;
            if (cls.f12161e == null) {
                cls.f12161e = new cmn(a);
                cmn cmn = cmy.f2187a.f12161e;
                Intent intent = new Intent("android.intent.action.EDIT");
                eru eru = cmn.f2156a.f12527c.f12515e;
                Intent flags = intent.setDataAndType(eru.f4155h, eru.f4151d).setFlags(1);
                try {
                    cmy.f2187a.startActivityForResult(flags, 1);
                } catch (ActivityNotFoundException e) {
                    cls cls2 = cmy.f2187a;
                    cls2.startActivityForResult(Intent.createChooser(flags, cls2.getResources().getString(R.string.edit_with)), 1);
                }
            } else {
                bli.m866b(cls.f12157a, "Edit request already in progress");
            }
        }
    }
}
