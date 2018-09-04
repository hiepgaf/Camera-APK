package p000;

/* compiled from: PG */
/* renamed from: dhe */
public final class dhe implements dht {
    /* renamed from: a */
    private final kwk f13246a;
    /* renamed from: b */
    private final kwk f13247b;
    /* renamed from: c */
    private final kwk f13248c;
    /* renamed from: d */
    private final kwk f13249d;
    /* renamed from: e */
    private final kwk f13250e;
    /* renamed from: f */
    private final kwk f13251f;
    /* renamed from: g */
    private final kwk f13252g;
    /* renamed from: h */
    private final kwk f13253h;
    /* renamed from: i */
    private final kwk f13254i;
    /* renamed from: j */
    private final kwk f13255j;
    /* renamed from: k */
    private final kwk f13256k;
    /* renamed from: l */
    private final kwk f13257l;
    /* renamed from: m */
    private final kwk f13258m;

    public dhe(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13) {
        this.f13246a = (kwk) dhe.m9072a(kwk, 1);
        this.f13247b = (kwk) dhe.m9072a(kwk2, 2);
        this.f13248c = (kwk) dhe.m9072a(kwk3, 3);
        this.f13249d = (kwk) dhe.m9072a(kwk4, 4);
        this.f13250e = (kwk) dhe.m9072a(kwk5, 5);
        this.f13251f = (kwk) dhe.m9072a(kwk6, 6);
        this.f13252g = (kwk) dhe.m9072a(kwk7, 7);
        this.f13253h = (kwk) dhe.m9072a(kwk8, 8);
        this.f13254i = (kwk) dhe.m9072a(kwk9, 9);
        this.f13255j = (kwk) dhe.m9072a(kwk10, 10);
        this.f13256k = (kwk) dhe.m9072a(kwk11, 11);
        this.f13257l = (kwk) dhe.m9072a(kwk12, 12);
        this.f13258m = (kwk) dhe.m9072a(kwk13, 13);
    }

    /* renamed from: a */
    private static Object m9072a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ dhs mo1146a(ilp ilp, ipv ipv, bsn bsn) {
        hjf hjf = (hjf) dhe.m9072a((hjf) this.f13246a.mo345a(), 1);
        bfk bfk = (bfk) dhe.m9072a((bfk) this.f13247b.mo345a(), 2);
        dzh dzh = (dzh) dhe.m9072a((dzh) this.f13248c.mo345a(), 3);
        hjw hjw = (hjw) dhe.m9072a((hjw) this.f13249d.mo345a(), 4);
        ilb ilb = (ilb) dhe.m9072a((ilb) this.f13250e.mo345a(), 5);
        fbn fbn = (fbn) dhe.m9072a((fbn) this.f13251f.mo345a(), 6);
        gci gci = (gci) dhe.m9072a((gci) this.f13252g.mo345a(), 7);
        djq djq = (djq) dhe.m9072a((djq) this.f13253h.mo345a(), 8);
        dkb dkb = (dkb) dhe.m9072a((dkb) this.f13254i.mo345a(), 9);
        heq heq = (heq) dhe.m9072a((heq) this.f13255j.mo345a(), 10);
        asu asu = (asu) dhe.m9072a((asu) this.f13256k.mo345a(), 11);
        dim dim = (dim) dhe.m9072a((dim) this.f13257l.mo345a(), 12);
        ilp ilp2 = (ilp) dhe.m9072a(ilp, 13);
        ipv ipv2 = (ipv) dhe.m9072a(ipv, 14);
        dhe.m9072a(bsn, 15);
        return new dhc(hjf, bfk, dzh, hjw, ilb, fbn, gci, djq, dkb, heq, asu, dim, ilp2, ipv2, (how) dhe.m9072a((how) this.f13258m.mo345a(), 16));
    }
}
