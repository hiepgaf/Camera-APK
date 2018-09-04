package p000;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout.LayoutParams;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cmz */
public final class cmz extends jl {
    /* renamed from: a */
    public final /* synthetic */ cmp f12188a;

    public cmz(cmp cmp) {
        this.f12188a = cmp;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) this.f12188a.f2171l.get((Uri) obj));
        this.f12188a.f2171l.remove(obj);
    }

    public final int getCount() {
        return this.f12188a.f2161b.size();
    }

    public final int getItemPosition(Object obj) {
        for (int i = 0; i < this.f12188a.f2161b.size(); i++) {
            if (((cot) this.f12188a.f2161b.get(i)).f12527c.f12515e.f4155h.equals(obj)) {
                return i;
            }
        }
        return -2;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        acj a;
        ImageView kvr = new kvr(this.f12188a.f2168i);
        kvr.setLayoutParams(new LayoutParams(-1, -1));
        kvr.setScaleType(ScaleType.FIT_CENTER);
        kvr.setContentDescription(kvr.getResources().getString(R.string.burst_editor_frame_description, new Object[]{Integer.valueOf(i + 1)}));
        kvr.setOnClickListener(new cna(this));
        eru eru = ((cot) this.f12188a.f2161b.get(i)).f12527c.f12515e;
        acj a2 = acc.m100b(this.f12188a.f2168i).m6281a(Drawable.class).m120a(eru.f4155h).m119a(new aqg().m604a(new ColorDrawable(-16777216)).m598a(new are(eru.f4151d, eru.f4153f.getTime(), 0)));
        cmy cmy = this.f12188a.f2160a;
        Uri uri = eru.f4155h;
        for (int i2 = 0; i2 < cmy.f2187a.f12169m.m1178b(); i2++) {
            cmf a3 = cmy.f2187a.f12169m.m1176a(i2);
            if (!a3.m1179a() && kbf.m16436b(a3.f2136a.f12527c.f12515e.f4155h, uri)) {
                cng b = cmy.f2187a.f12166j.m1199b(i2);
                if (b != null) {
                    a = b.f20330t.m118a();
                    break;
                }
            }
        }
        a = null;
        if (a != null) {
            a2.f238c = a;
        }
        a2.m123a(kvr);
        viewGroup.addView(kvr);
        this.f12188a.f2171l.put(eru.f4155h, kvr);
        return eru.f4155h;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return this.f12188a.f2171l.get((Uri) obj) == view;
    }
}
