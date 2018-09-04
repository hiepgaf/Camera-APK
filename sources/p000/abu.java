package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* renamed from: abu */
class abu extends Handler {
    /* renamed from: r */
    public final LinkedList f176r = new LinkedList();

    abu(Looper looper) {
        super(looper);
        this.f176r.offerLast(Integer.valueOf(-1));
    }

    /* renamed from: b */
    final String m82b(int i) {
        String str = new String("HIST");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("_ID");
        stringBuilder.append(i);
        str = stringBuilder.toString();
        Iterator it = this.f176r.iterator();
        String str2 = str;
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str2);
            stringBuilder2.append('_');
            stringBuilder2.append(num.toString());
            str2 = stringBuilder2.toString();
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(str2);
        stringBuilder3.append("_HEND");
        return stringBuilder3.toString();
    }

    public void handleMessage(Message message) {
        this.f176r.offerLast(Integer.valueOf(message.what));
        while (this.f176r.size() > 400) {
            this.f176r.pollFirst();
        }
    }
}
