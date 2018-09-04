package p000;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: PG */
/* renamed from: wq */
public final class wq implements vz {
    /* renamed from: a */
    private int f19656a = 0;
    /* renamed from: b */
    private int f19657b = 0;
    /* renamed from: c */
    private int f19658c = 0;
    /* renamed from: d */
    private int f19659d = 0;
    /* renamed from: e */
    private int f19660e = 0;
    /* renamed from: f */
    private int f19661f = 0;
    /* renamed from: g */
    private TimeZone f19662g = TimeZone.getTimeZone("UTC");
    /* renamed from: h */
    private int f19663h;

    public wq(Calendar calendar) {
        Date time = calendar.getTime();
        TimeZone timeZone = calendar.getTimeZone();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(timeZone);
        gregorianCalendar.setTime(time);
        this.f19656a = gregorianCalendar.get(1);
        this.f19657b = gregorianCalendar.get(2) + 1;
        this.f19658c = gregorianCalendar.get(5);
        this.f19659d = gregorianCalendar.get(11);
        this.f19660e = gregorianCalendar.get(12);
        this.f19661f = gregorianCalendar.get(13);
        this.f19663h = gregorianCalendar.get(14) * FrameMetricsApi24Impl.NANOS_PER_MS;
        this.f19662g = gregorianCalendar.getTimeZone();
    }

    public wq(Date date, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        gregorianCalendar.setTime(date);
        this.f19656a = gregorianCalendar.get(1);
        this.f19657b = gregorianCalendar.get(2) + 1;
        this.f19658c = gregorianCalendar.get(5);
        this.f19659d = gregorianCalendar.get(11);
        this.f19660e = gregorianCalendar.get(12);
        this.f19661f = gregorianCalendar.get(13);
        this.f19663h = gregorianCalendar.get(14) * FrameMetricsApi24Impl.NANOS_PER_MS;
        this.f19662g = timeZone;
    }

    public final int compareTo(Object obj) {
        vz vzVar = (vz) obj;
        long timeInMillis = mo2496a().getTimeInMillis() - vzVar.mo2496a().getTimeInMillis();
        if (timeInMillis != 0) {
            return (int) (timeInMillis % 2);
        }
        return (int) (((long) (this.f19663h - vzVar.mo2507f())) % 2);
    }

    /* renamed from: a */
    public final Calendar mo2496a() {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance(Locale.US);
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.setTimeZone(this.f19662g);
        gregorianCalendar.set(1, this.f19656a);
        gregorianCalendar.set(2, this.f19657b - 1);
        gregorianCalendar.set(5, this.f19658c);
        gregorianCalendar.set(11, this.f19659d);
        gregorianCalendar.set(12, this.f19660e);
        gregorianCalendar.set(13, this.f19661f);
        gregorianCalendar.set(14, this.f19663h / FrameMetricsApi24Impl.NANOS_PER_MS);
        return gregorianCalendar;
    }

    /* renamed from: b */
    public final int mo2499b() {
        return this.f19658c;
    }

    /* renamed from: c */
    public final int mo2501c() {
        return this.f19659d;
    }

    /* renamed from: d */
    public final int mo2503d() {
        return this.f19660e;
    }

    /* renamed from: e */
    public final int mo2505e() {
        return this.f19657b;
    }

    /* renamed from: f */
    public final int mo2507f() {
        return this.f19663h;
    }

    /* renamed from: g */
    public final int mo2509g() {
        return this.f19661f;
    }

    /* renamed from: h */
    public final TimeZone mo2511h() {
        return this.f19662g;
    }

    /* renamed from: i */
    public final int mo2512i() {
        return this.f19656a;
    }

    /* renamed from: a */
    public final void mo2497a(int i) {
        if (i <= 0) {
            this.f19658c = 1;
        } else if (i > 31) {
            this.f19658c = 31;
        } else {
            this.f19658c = i;
        }
    }

    /* renamed from: b */
    public final void mo2500b(int i) {
        this.f19659d = Math.min(Math.abs(i), 23);
    }

    /* renamed from: c */
    public final void mo2502c(int i) {
        this.f19660e = Math.min(Math.abs(i), 59);
    }

    /* renamed from: d */
    public final void mo2504d(int i) {
        if (i <= 0) {
            this.f19657b = 1;
        } else if (i > 12) {
            this.f19657b = 12;
        } else {
            this.f19657b = i;
        }
    }

    /* renamed from: e */
    public final void mo2506e(int i) {
        this.f19663h = i;
    }

    /* renamed from: f */
    public final void mo2508f(int i) {
        this.f19661f = Math.min(Math.abs(i), 59);
    }

    /* renamed from: a */
    public final void mo2498a(TimeZone timeZone) {
        this.f19662g = timeZone;
    }

    /* renamed from: g */
    public final void mo2510g(int i) {
        this.f19656a = Math.min(Math.abs(i), 9999);
    }

    public final String toString() {
        return tz.m5877a((vz) this);
    }
}
