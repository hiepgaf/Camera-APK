package p000;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: cmv */
final class cmv implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ Uri f2181a;
    /* renamed from: b */
    private final /* synthetic */ cmp f2182b;

    cmv(cmp cmp, Uri uri) {
        this.f2182b = cmp;
        this.f2181a = uri;
    }

    public final void onClick(View view) {
        cmy cmy = this.f2182b.f2160a;
        Parcelable parcelable = this.f2181a;
        Intent a = cls.m8331a("android.intent.action.SEND");
        a.putExtra("android.intent.extra.STREAM", parcelable);
        try {
            cmy.f2187a.startActivity(a);
        } catch (ActivityNotFoundException e) {
            cls cls = cmy.f2187a;
            cls.startActivity(Intent.createChooser(a, cls.getResources().getString(R.string.share_to)));
        }
    }
}
