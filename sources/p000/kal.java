package p000;

import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.libraries.social.licenses.LicenseActivity;

/* compiled from: PG */
/* renamed from: kal */
public final class kal implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f8173a;
    /* renamed from: b */
    private final /* synthetic */ ScrollView f8174b;
    /* renamed from: c */
    private final /* synthetic */ LicenseActivity f8175c;

    public kal(LicenseActivity licenseActivity, int i, ScrollView scrollView) {
        this.f8175c = licenseActivity;
        this.f8173a = i;
        this.f8174b = scrollView;
    }

    public final void run() {
        TextView textView = (TextView) this.f8175c.findViewById(R.id.license_activity_textview);
        this.f8174b.scrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(this.f8173a)));
    }
}
