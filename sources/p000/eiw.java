package p000;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;

/* compiled from: PG */
/* renamed from: eiw */
public final class eiw implements kwk {
    /* renamed from: a */
    private final kwk f15189a;
    /* renamed from: b */
    private final kwk f15190b;

    public eiw(kwk kwk, kwk kwk2) {
        this.f15189a = kwk;
        this.f15190b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo345a() {
        kwk kwk = this.f15189a;
        awm awm = (awm) kwk.mo345a();
        Intent intent = new Intent((Context) this.f15190b.mo345a(), CameraActivity.class);
        intent.putExtra("open_filmstrip", true);
        return (awk) ktm.m13963a(new awk(awm, intent), "Cannot return null from a non-@Nullable @Provides method");
    }
}
