package p000;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: els */
public final class els extends hdz {
    /* renamed from: a */
    public int f15285a;
    /* renamed from: b */
    public final elu[] f15286b;
    /* renamed from: i */
    private View f15287i;
    /* renamed from: j */
    private TextView f15288j;
    /* renamed from: k */
    private TextView f15289k;
    /* renamed from: l */
    private Button f15290l;

    public els(Context context, int i, hea hea) {
        super(context, R.layout.photosphere_tutorial, hea);
        this.f15286b = new elu[]{new elu(i)};
    }

    /* renamed from: a */
    final void m9753a(int i) {
        this.f15287i.findViewById(R.id.slide_1).setVisibility(8);
        elu elu = this.f15286b[i];
        this.f15287i.findViewById(R.id.slide_1).setVisibility(0);
        this.f15288j.setText(elu.f3948a);
        this.f15289k.setText(R.string.keep_the_camera_centered);
        this.f15290l.setText(R.string.photosphere_tutorial_ok_got_it);
        this.f15285a = i;
    }

    /* renamed from: a */
    protected final void mo1233a(View view) {
        this.f15287i = view;
        this.f15288j = (TextView) this.f15287i.findViewById(R.id.photosphere_tutorial_title);
        this.f15289k = (TextView) view.findViewById(R.id.photosphere_tutorial_body);
        this.f15290l = (Button) this.f15287i.findViewById(R.id.next_button);
        this.f15290l.setOnClickListener(new elt(this));
        m9753a(0);
    }
}
