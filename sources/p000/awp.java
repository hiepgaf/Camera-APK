package p000;

import android.app.KeyguardManager.KeyguardDismissCallback;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: awp */
final class awp extends KeyguardDismissCallback {
    /* renamed from: a */
    private final /* synthetic */ Intent f985a;
    /* renamed from: b */
    private final /* synthetic */ boolean f986b;
    /* renamed from: c */
    private final /* synthetic */ int f987c;
    /* renamed from: d */
    private final /* synthetic */ awo f988d;

    awp(awo awo, Intent intent, boolean z, int i) {
        this.f988d = awo;
        this.f985a = intent;
        this.f986b = z;
        this.f987c = i;
    }

    public final void onDismissCancelled() {
        ((hny) this.f988d.f10441d.mo345a()).m11921a(this.f987c);
    }

    public final void onDismissError() {
        ((hny) this.f988d.f10441d.mo345a()).m11921a(this.f987c);
    }

    public final void onDismissSucceeded() {
        awo awo = this.f988d;
        Context context = awo.f10439b;
        Intent intent = this.f985a;
        boolean z = this.f986b;
        bli.m869c(awo.f10438a, "Device unlocked, firing target intent.");
        Intent intent2 = new Intent(context, awo.f10440c);
        intent2.setFlags(intent2.getFlags() | 67108864).setAction("android.intent.action.MAIN");
        TaskStackBuilder create = TaskStackBuilder.create(context);
        if (z) {
            create.addNextIntent(intent2);
        }
        create.addNextIntent(intent).startActivities();
        ((hny) this.f988d.f10441d.mo345a()).m11921a(this.f987c);
    }
}
