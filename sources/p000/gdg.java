package p000;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gdg */
public final class gdg extends hdz {
    public gdg(Context context, hea hea) {
        super(context, R.layout.portrait_tutorial, hea);
    }

    /* renamed from: a */
    protected final void mo1233a(View view) {
        ((Button) view.findViewById(R.id.next_button)).setOnClickListener(new gdh(this));
    }
}
