package p000;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.camera.legacy.app.refocus.ViewerActivity;
import com.google.android.apps.refocus.processing.RenderingTask;

/* compiled from: PG */
/* renamed from: dxg */
final class dxg implements iqb {
    /* renamed from: a */
    public final /* synthetic */ ViewerActivity f14681a;
    /* renamed from: b */
    private final /* synthetic */ Uri f14682b;
    /* renamed from: c */
    private final /* synthetic */ kpw f14683c;
    /* renamed from: d */
    private final /* synthetic */ RenderingTask f14684d;

    dxg(ViewerActivity viewerActivity, Uri uri, kpw kpw, RenderingTask renderingTask) {
        this.f14681a = viewerActivity;
        this.f14682b = uri;
        this.f14683c = kpw;
        this.f14684d = renderingTask;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo369a(Object obj) {
        Object intent = new Intent();
        intent.setData(this.f14682b);
        String str = ViewerActivity.f20374d;
        String valueOf = String.valueOf(this.f14682b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
        stringBuilder.append("finish with ");
        stringBuilder.append(valueOf);
        bli.m863a(str, stringBuilder.toString());
        this.f14683c.mo3557a(intent);
        this.f14684d.removeFinishedCallback(this);
        this.f14681a.f20389s.post(new dxh(this));
    }
}
