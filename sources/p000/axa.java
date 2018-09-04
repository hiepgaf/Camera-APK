package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;

/* renamed from: axa */
final /* synthetic */ class axa implements OnClickListener {
    /* renamed from: a */
    private final aww f995a;

    axa(aww aww) {
        this.f995a = aww;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aww aww = this.f995a;
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        String valueOf = String.valueOf(aww.f10462a.getPackageName());
        String str = "package:";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        intent.setData(Uri.parse(valueOf));
        aww.f10465d.m721b(intent);
        aww.f10463b.m707a("Closing until required permissions are granted.");
    }
}
