package p000;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.VideoView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hky */
public final class hky extends Fragment {
    /* renamed from: a */
    private final hls f6329a = new hli();
    /* renamed from: b */
    private final hkz f6330b = new hlc();
    /* renamed from: c */
    private final hln f6331c = new hlf();
    /* renamed from: d */
    private hlz f6332d;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = true;
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.videoplayer_fragment, viewGroup, false);
        this.f6332d = new hlz(this.f6329a, this.f6330b, this.f6331c, inflate, getActivity().getWindow().getDecorView());
        hlz hlz = this.f6332d;
        hlz.f6351h = hlz.f6347d.findViewById(R.id.video_view_holder);
        hlz.f6351h.setOnClickListener(new hmc(hlz));
        hlz.f6350g = (VideoView) hlz.f6347d.findViewById(R.id.video_view);
        hlz.f6350g.setOnTouchListener(new hmd(hlz));
        hlz.f6353j = (ImageButton) hlz.f6347d.findViewById(R.id.videoplayer_pause_button);
        hlz.f6353j.setOnClickListener(new hmb(hlz));
        hlz.f6352i = (ImageButton) hlz.f6347d.findViewById(R.id.videoplayer_play_button);
        hlz.f6352i.setOnClickListener(new hma(hlz));
        hlz.f6357n = hlz.f6347d.findViewById(R.id.controls_group);
        hlz.f6356m = (SeekBar) hlz.f6347d.findViewById(R.id.video_player_progress);
        hlz.f6356m.setOnSeekBarChangeListener(new hme(hlz));
        hlz.f6354k = (TextView) hlz.f6347d.findViewById(R.id.video_total_time);
        hlz.f6355l = (TextView) hlz.f6347d.findViewById(R.id.video_current_time);
        Uri uri = (Uri) getArguments().getParcelable("video");
        hln hln = this.f6331c;
        hlz = this.f6332d;
        hln.mo3080a(hlz, new hlq(hlz));
        this.f6331c.mo1562a();
        this.f6331c.mo1563b();
        hls hls = this.f6329a;
        hlz hlz2 = this.f6332d;
        hln hln2 = this.f6331c;
        if (bundle != null) {
            i = bundle.getInt("videoplayer_position", 0);
        }
        if (bundle != null) {
            z = bundle.getBoolean("videoplayer_playing", true);
        }
        hls.mo3083a(hlz2, uri, hln2, i, z);
        this.f6329a.mo1562a();
        this.f6330b.mo3077a(this.f6332d);
        this.f6330b.mo1562a();
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        this.f6329a.mo3085T();
    }

    public final void onResume() {
        super.onResume();
        this.f6329a.mo3084U();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        boolean isPlaying = this.f6332d.f6350g.isPlaying();
        int currentPosition = this.f6332d.f6350g.getCurrentPosition();
        bundle.putBoolean("videoplayer_playing", isPlaying);
        bundle.putInt("videoplayer_position", currentPosition);
    }
}
