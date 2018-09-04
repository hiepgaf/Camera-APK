package p000;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: anx */
final class anx {
    /* renamed from: a */
    private final Queue f795a = arq.m652a(0);

    anx() {
    }

    /* renamed from: a */
    final synchronized add m516a(ByteBuffer byteBuffer) {
        add add;
        add = (add) this.f795a.poll();
        if (add == null) {
            add = new add();
        }
        add.f314b = null;
        Arrays.fill(add.f313a, (byte) 0);
        add.f315c = new adc();
        add.f316d = 0;
        add.f314b = byteBuffer.asReadOnlyBuffer();
        add.f314b.position(0);
        add.f314b.order(ByteOrder.LITTLE_ENDIAN);
        return add;
    }

    /* renamed from: a */
    final synchronized void m517a(add add) {
        add.f314b = null;
        add.f315c = null;
        this.f795a.offer(add);
    }
}
