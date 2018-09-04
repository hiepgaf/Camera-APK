package p000;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: bui */
public final class bui implements buh {
    /* renamed from: a */
    private static final String f11293a = bli.m862a("StateMachine");
    /* renamed from: b */
    private iqo f11294b;
    /* renamed from: c */
    private bug f11295c = new buj(this);
    /* renamed from: d */
    private final ReentrantLock f11296d = new ReentrantLock();
    /* renamed from: e */
    private final Condition f11297e = this.f11296d.newCondition();

    public bui(iqo iqo) {
        this.f11294b = iqo;
    }

    /* renamed from: a */
    public final iqo mo572a() {
        return this.f11294b;
    }

    /* renamed from: b */
    private final void m7750b(bug bug) {
        this.f11296d.lock();
        try {
            if (bug.equals(this.f11295c)) {
                bli.m863a(f11293a, "No op since jump to the same state.");
            } else {
                String str = f11293a;
                String valueOf = String.valueOf(this.f11295c);
                String valueOf2 = String.valueOf(bug);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length());
                stringBuilder.append("Change state : ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" => ");
                stringBuilder.append(valueOf2);
                bli.m863a(str, stringBuilder.toString());
                this.f11295c.mo2953c();
                this.f11295c = bug;
                bug b = this.f11295c.mo1134b();
                while (b != null) {
                    valueOf = f11293a;
                    valueOf2 = String.valueOf(this.f11295c);
                    String valueOf3 = String.valueOf(b);
                    StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(valueOf2).length() + 20) + String.valueOf(valueOf3).length());
                    stringBuilder2.append("Forward state : ");
                    stringBuilder2.append(valueOf2);
                    stringBuilder2.append(" => ");
                    stringBuilder2.append(valueOf3);
                    bli.m863a(valueOf, stringBuilder2.toString());
                    this.f11295c.mo2953c();
                    this.f11295c = b;
                    b = this.f11295c.mo1134b();
                }
                this.f11297e.signalAll();
            }
            this.f11296d.unlock();
        } catch (Throwable th) {
            this.f11296d.unlock();
        }
    }

    /* renamed from: a */
    public final void mo573a(Object obj) {
        this.f11296d.lock();
        String str;
        String valueOf;
        StringBuilder stringBuilder;
        try {
            buf a = this.f11295c.mo1133a(obj.getClass());
            if (a != null) {
                str = f11293a;
                valueOf = String.valueOf(obj);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
                stringBuilder.append("Process event : ");
                stringBuilder.append(valueOf);
                bli.m863a(str, stringBuilder.toString());
                bug a2 = a.mo2951a(obj);
                if (a2 != null) {
                    m7750b(a2);
                }
            }
            this.f11296d.unlock();
        } catch (Exception e) {
            str = f11293a;
            valueOf = String.valueOf(obj);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
            stringBuilder.append("Failed to process event: ");
            stringBuilder.append(valueOf);
            bli.m866b(str, stringBuilder.toString());
            throw e;
        } catch (Throwable th) {
            this.f11296d.unlock();
        }
    }

    /* renamed from: a */
    public final boolean mo574a(bug bug) {
        this.f11296d.lock();
        try {
            if (this.f11295c instanceof buj) {
                m7750b(bug);
                return true;
            }
            this.f11296d.unlock();
            return false;
        } finally {
            this.f11296d.unlock();
        }
    }
}
