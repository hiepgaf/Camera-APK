package p000;

import android.media.MediaCodec.BufferInfo;

/* compiled from: PG */
/* renamed from: evj */
final class evj implements jgk {
    /* renamed from: a */
    public final /* synthetic */ evb f15606a;

    evj(evb evb) {
        this.f15606a = evb;
    }

    /* renamed from: a */
    public final void mo1305a(jfw jfw) {
        this.f15606a.f15596d.post(new evk(this));
    }

    /* renamed from: a */
    public final void mo1303a(long j) {
        eto.m2114c();
        eto.m2113b();
    }

    /* renamed from: a */
    public final void mo1304a(BufferInfo bufferInfo) {
        evm evm = this.f15606a.f15595c;
        if (evm != null) {
            evm.f4273a.f15607a.m2202a(bufferInfo.presentationTimeUs, new evq(bufferInfo));
        }
    }

    /* renamed from: a */
    public final void mo1301a() {
    }

    /* renamed from: a */
    public final void mo1302a(int i) {
    }
}
