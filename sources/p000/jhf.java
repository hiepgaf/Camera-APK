package p000;

import android.annotation.TargetApi;
import android.media.MediaCodec.BufferInfo;
import java.nio.ByteBuffer;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jhf */
public interface jhf extends AutoCloseable {
    /* renamed from: a */
    void mo1295a(ByteBuffer byteBuffer, BufferInfo bufferInfo);

    void close();
}
