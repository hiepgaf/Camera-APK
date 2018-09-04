package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dtz */
public final class dtz extends imq {
    /* renamed from: b */
    private final bkw f23016b;
    /* renamed from: c */
    private final boolean f23017c;
    /* renamed from: d */
    private final boolean f23018d;
    /* renamed from: e */
    private final boolean f23019e = true;

    static {
        bli.m862a("AHDRPSimpleMtrProc");
    }

    public dtz(bkw bkw, boolean z, boolean z2, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5) {
        super(ilq.m3822a(ilp, ilp2, ilp3, ilp4, ilp5));
        this.f23016b = bkw;
        this.f23017c = z;
        this.f23018d = z2;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo3397b(Object obj) {
        float a;
        float a2;
        fxo fxo;
        boolean z = true;
        List list = (List) obj;
        fxp fxp = new fxp(this.f23017c, this.f23018d, ((fxi) list.get(0)).f4788e, ((fxj) list.get(1)).f4794e, ((Boolean) list.get(2)).booleanValue(), ((Boolean) list.get(3)).booleanValue());
        float floatValue = ((Float) list.get(4)).floatValue();
        if (this.f23018d) {
            a = ije.m3771a(this.f23016b.f1255a, "camera:simple_metering_bright_bmm_threshold_front", 500.0f);
        } else {
            a = ije.m3771a(this.f23016b.f1255a, "camera:simple_metering_bright_bmm_threshold_back", 250.0f);
        }
        if (this.f23018d) {
            a2 = ije.m3771a(this.f23016b.f1255a, "camera:simple_metering_dark_bmm_threshold_front", 80.0f);
        } else {
            a2 = ije.m3771a(this.f23016b.f1255a, "camera:simple_metering_dark_bmm_threshold_back", 80.0f);
        }
        if (this.f23017c || this.f23018d) {
            if (floatValue <= a2) {
                if (fxp.f4805e) {
                    fxo = fxo.HDR_PLUS_WITH_TORCH;
                } else if (fxp.f4804d) {
                    fxo = fxo.NORMAL_WITH_FLASH;
                } else {
                    fxo = fxo.NORMAL;
                }
            } else if (floatValue > a) {
                fxo = fxo.NORMAL;
            } else if (fxp.f4805e) {
                fxo = fxo.HDR_PLUS;
            } else if (fxp.f4804d) {
                fxo = fxo.NORMAL_WITH_FLASH;
            } else {
                fxo = fxo.NORMAL;
            }
        } else if (floatValue > a2 || !fxp.f4805e) {
            fxo = fxo.NORMAL;
        } else {
            fxo = fxo.HDR_PLUS;
        }
        if (this.f23019e) {
            if (fxo == fxo.NORMAL_WITH_FLASH) {
                boolean z2;
                if (!fxp.f4801a) {
                    z2 = false;
                } else if (fxp.f4804d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jri.m13153b(z2);
            } else if (fxo == fxo.HDR_PLUS || fxo == fxo.HDR_PLUS_ZSL || fxo == fxo.HDR_PLUS_WITH_TORCH) {
                jri.m13153b(fxp.f4805e);
            }
            if (fxo == fxo.HDR_PLUS_ZSL) {
                z = false;
            }
            jri.m13153b(z);
            if (fxp.f4802b == go.aA) {
                if (fxp.f4803c == go.aA) {
                    return fxo.NORMAL;
                }
                if (fxp.f4803c == go.aC) {
                    return fxo.HDR_PLUS;
                }
                if (fxp.f4805e) {
                    return fxo.HDR_PLUS_ZSL;
                }
                return fxo.NORMAL;
            } else if (fxp.f4802b != go.aC) {
                if (fxp.f4802b == go.aB) {
                    if (fxp.f4803c == go.aA) {
                        if (fxp.f4801a && fxp.f4804d) {
                            return fxo.NORMAL_WITH_FLASH;
                        }
                        return fxo.NORMAL;
                    } else if (fxp.f4803c == go.aC) {
                        if (fxo == fxo.HDR_PLUS || fxo == fxo.NORMAL) {
                            return fxo.HDR_PLUS;
                        }
                        return fxo.HDR_PLUS_WITH_TORCH;
                    } else if (!fxp.f4805e) {
                        return fxo;
                    } else {
                        if (fxo == fxo.HDR_PLUS_WITH_TORCH || fxo == fxo.NORMAL_WITH_FLASH) {
                            return fxo.HDR_PLUS_WITH_TORCH;
                        }
                        if (fxo == fxo.HDR_PLUS || fxo == fxo.NORMAL) {
                            return fxo.HDR_PLUS_ZSL;
                        }
                    }
                }
                throw new IllegalStateException("Unknown flash setting, or impossible combination!!");
            } else if (fxp.f4803c == go.aA) {
                return fxo.NORMAL_WITH_FLASH;
            } else {
                if (fxp.f4803c == go.aC) {
                    return fxo.HDR_PLUS_WITH_TORCH;
                }
                if (fxp.f4805e) {
                    return fxo.HDR_PLUS_WITH_TORCH;
                }
                return fxo.NORMAL_WITH_FLASH;
            }
        } else if (fxp.f4802b == go.aA) {
            if (fxp.f4803c == go.aA) {
                return fxo.NORMAL;
            }
            if (fxp.f4803c == go.aC) {
                return fxo.HDR_PLUS;
            }
            if (fxo == fxo.NORMAL || fxo == fxo.NORMAL_WITH_FLASH) {
                return fxo.NORMAL;
            }
            if (fxp.f4805e) {
                return fxo.HDR_PLUS;
            }
            return fxo.NORMAL;
        } else if (fxp.f4802b == go.aC) {
            if (fxp.f4803c == go.aA) {
                return fxo.NORMAL_WITH_FLASH;
            }
            if (fxp.f4803c == go.aC) {
                return fxo.HDR_PLUS_WITH_TORCH;
            }
            if (fxo == fxo.NORMAL || fxo == fxo.NORMAL_WITH_FLASH) {
                return fxo.NORMAL_WITH_FLASH;
            }
            if (fxp.f4805e) {
                return fxo.HDR_PLUS_WITH_TORCH;
            }
            return fxo.NORMAL_WITH_FLASH;
        } else if (fxp.f4802b != go.aB) {
            throw new AssertionError("Unknown flash setting!");
        } else if (fxp.f4803c == go.aA) {
            if (fxp.f4801a && fxp.f4804d) {
                return fxo.NORMAL_WITH_FLASH;
            }
            return fxo.NORMAL;
        } else if (fxp.f4803c == go.aC) {
            if (fxo == fxo.HDR_PLUS || fxo == fxo.HDR_PLUS_WITH_TORCH) {
                return fxo;
            }
            if (fxo == fxo.NORMAL) {
                return fxo.HDR_PLUS;
            }
            return fxo.HDR_PLUS_WITH_TORCH;
        } else if (fxo != fxo.NORMAL && fxo != fxo.NORMAL_WITH_FLASH && fxp.f4805e) {
            return fxo;
        } else {
            if (fxp.f4804d) {
                return fxo.NORMAL_WITH_FLASH;
            }
            return fxo.NORMAL;
        }
    }
}
