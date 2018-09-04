package p000;

import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: clk */
final class clk implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ cli f2125a;

    clk(cli cli) {
        this.f2125a = cli;
    }

    public final void onClick(View view) {
        cli cli = this.f2125a;
        if (!cli.f2119f) {
            if (cli.f2117d) {
                cli.m1171a();
                return;
            }
            cli.f2117d = true;
            cli.m1174c();
            cli.f2118e.setVisibility(0);
            cli.f2116c.setVisibility(0);
            cli.f2116c.setAlpha(0.0f);
            cli.m1172a(cli.f2117d);
        }
    }
}
