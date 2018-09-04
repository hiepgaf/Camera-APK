package android.support.v8.renderscript;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PG */
public final class ScriptIntrinsicBLAS extends ScriptIntrinsic {
    public static final int CONJ_TRANSPOSE = 113;
    public static final int INTRINSIC_API_LEVEL = 23;
    public static final int LEFT = 141;
    public static final int LOWER = 122;
    public static final int NON_UNIT = 131;
    public static final int NO_TRANSPOSE = 111;
    public static final int RIGHT = 142;
    public static final int RsBlas_bnnm = 1000;
    public static final int RsBlas_caxpy = 29;
    public static final int RsBlas_ccopy = 28;
    public static final int RsBlas_cdotc_sub = 6;
    public static final int RsBlas_cdotu_sub = 5;
    public static final int RsBlas_cgbmv = 64;
    public static final int RsBlas_cgemm = 125;
    public static final int RsBlas_cgemv = 63;
    public static final int RsBlas_cgerc = 99;
    public static final int RsBlas_cgeru = 98;
    public static final int RsBlas_chbmv = 96;
    public static final int RsBlas_chemm = 137;
    public static final int RsBlas_chemv = 95;
    public static final int RsBlas_cher = 100;
    public static final int RsBlas_cher2 = 102;
    public static final int RsBlas_cher2k = 139;
    public static final int RsBlas_cherk = 138;
    public static final int RsBlas_chpmv = 97;
    public static final int RsBlas_chpr = 101;
    public static final int RsBlas_chpr2 = 103;
    public static final int RsBlas_cscal = 43;
    public static final int RsBlas_csscal = 45;
    public static final int RsBlas_cswap = 27;
    public static final int RsBlas_csymm = 126;
    public static final int RsBlas_csyr2k = 128;
    public static final int RsBlas_csyrk = 127;
    public static final int RsBlas_ctbmv = 66;
    public static final int RsBlas_ctbsv = 69;
    public static final int RsBlas_ctpmv = 67;
    public static final int RsBlas_ctpsv = 70;
    public static final int RsBlas_ctrmm = 129;
    public static final int RsBlas_ctrmv = 65;
    public static final int RsBlas_ctrsm = 130;
    public static final int RsBlas_ctrsv = 68;
    public static final int RsBlas_dasum = 12;
    public static final int RsBlas_daxpy = 26;
    public static final int RsBlas_dcopy = 25;
    public static final int RsBlas_ddot = 4;
    public static final int RsBlas_dgbmv = 56;
    public static final int RsBlas_dgemm = 119;
    public static final int RsBlas_dgemv = 55;
    public static final int RsBlas_dger = 90;
    public static final int RsBlas_dnrm2 = 11;
    public static final int RsBlas_drot = 39;
    public static final int RsBlas_drotg = 37;
    public static final int RsBlas_drotm = 40;
    public static final int RsBlas_drotmg = 38;
    public static final int RsBlas_dsbmv = 88;
    public static final int RsBlas_dscal = 42;
    public static final int RsBlas_dsdot = 2;
    public static final int RsBlas_dspmv = 89;
    public static final int RsBlas_dspr = 92;
    public static final int RsBlas_dspr2 = 94;
    public static final int RsBlas_dswap = 24;
    public static final int RsBlas_dsymm = 120;
    public static final int RsBlas_dsymv = 87;
    public static final int RsBlas_dsyr = 91;
    public static final int RsBlas_dsyr2 = 93;
    public static final int RsBlas_dsyr2k = 122;
    public static final int RsBlas_dsyrk = 121;
    public static final int RsBlas_dtbmv = 58;
    public static final int RsBlas_dtbsv = 61;
    public static final int RsBlas_dtpmv = 59;
    public static final int RsBlas_dtpsv = 62;
    public static final int RsBlas_dtrmm = 123;
    public static final int RsBlas_dtrmv = 57;
    public static final int RsBlas_dtrsm = 124;
    public static final int RsBlas_dtrsv = 60;
    public static final int RsBlas_dzasum = 16;
    public static final int RsBlas_dznrm2 = 15;
    public static final int RsBlas_icamax = 19;
    public static final int RsBlas_idamax = 18;
    public static final int RsBlas_isamax = 17;
    public static final int RsBlas_izamax = 20;
    public static final int RsBlas_sasum = 10;
    public static final int RsBlas_saxpy = 23;
    public static final int RsBlas_scasum = 14;
    public static final int RsBlas_scnrm2 = 13;
    public static final int RsBlas_scopy = 22;
    public static final int RsBlas_sdot = 3;
    public static final int RsBlas_sdsdot = 1;
    public static final int RsBlas_sgbmv = 48;
    public static final int RsBlas_sgemm = 113;
    public static final int RsBlas_sgemv = 47;
    public static final int RsBlas_sger = 82;
    public static final int RsBlas_snrm2 = 9;
    public static final int RsBlas_srot = 35;
    public static final int RsBlas_srotg = 33;
    public static final int RsBlas_srotm = 36;
    public static final int RsBlas_srotmg = 34;
    public static final int RsBlas_ssbmv = 80;
    public static final int RsBlas_sscal = 41;
    public static final int RsBlas_sspmv = 81;
    public static final int RsBlas_sspr = 84;
    public static final int RsBlas_sspr2 = 86;
    public static final int RsBlas_sswap = 21;
    public static final int RsBlas_ssymm = 114;
    public static final int RsBlas_ssymv = 79;
    public static final int RsBlas_ssyr = 83;
    public static final int RsBlas_ssyr2 = 85;
    public static final int RsBlas_ssyr2k = 116;
    public static final int RsBlas_ssyrk = 115;
    public static final int RsBlas_stbmv = 50;
    public static final int RsBlas_stbsv = 53;
    public static final int RsBlas_stpmv = 51;
    public static final int RsBlas_stpsv = 54;
    public static final int RsBlas_strmm = 117;
    public static final int RsBlas_strmv = 49;
    public static final int RsBlas_strsm = 118;
    public static final int RsBlas_strsv = 52;
    public static final int RsBlas_zaxpy = 32;
    public static final int RsBlas_zcopy = 31;
    public static final int RsBlas_zdotc_sub = 8;
    public static final int RsBlas_zdotu_sub = 7;
    public static final int RsBlas_zdscal = 46;
    public static final int RsBlas_zgbmv = 72;
    public static final int RsBlas_zgemm = 131;
    public static final int RsBlas_zgemv = 71;
    public static final int RsBlas_zgerc = 108;
    public static final int RsBlas_zgeru = 107;
    public static final int RsBlas_zhbmv = 105;
    public static final int RsBlas_zhemm = 140;
    public static final int RsBlas_zhemv = 104;
    public static final int RsBlas_zher = 109;
    public static final int RsBlas_zher2 = 111;
    public static final int RsBlas_zher2k = 142;
    public static final int RsBlas_zherk = 141;
    public static final int RsBlas_zhpmv = 106;
    public static final int RsBlas_zhpr = 110;
    public static final int RsBlas_zhpr2 = 112;
    public static final int RsBlas_zscal = 44;
    public static final int RsBlas_zswap = 30;
    public static final int RsBlas_zsymm = 132;
    public static final int RsBlas_zsyr2k = 134;
    public static final int RsBlas_zsyrk = 133;
    public static final int RsBlas_ztbmv = 74;
    public static final int RsBlas_ztbsv = 77;
    public static final int RsBlas_ztpmv = 75;
    public static final int RsBlas_ztpsv = 78;
    public static final int RsBlas_ztrmm = 135;
    public static final int RsBlas_ztrmv = 73;
    public static final int RsBlas_ztrsm = 136;
    public static final int RsBlas_ztrsv = 76;
    public static final int TRANSPOSE = 112;
    public static final int UNIT = 132;
    public static final int UPPER = 121;
    public Allocation mLUT;

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: PG */
    public @interface Diag {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: PG */
    public @interface Side {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: PG */
    public @interface Transpose {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* compiled from: PG */
    public @interface Uplo {
    }

    private ScriptIntrinsicBLAS(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public final void BNNM(Allocation allocation, int i, Allocation allocation2, int i2, Allocation allocation3, int i3, int i4) {
        validateL3(Element.U8(this.mRS), 111, 112, 0, allocation, allocation2, allocation3);
        if (i < 0 || i > 255) {
            throw new RSRuntimeException("Invalid a_offset passed to BNNM");
        } else if (i2 < 0 || i2 > 255) {
            throw new RSRuntimeException("Invalid b_offset passed to BNNM");
        } else {
            int y = allocation.getType().getY();
            int y2 = allocation2.getType().getY();
            int x = allocation.getType().getX();
            boolean isIncSupp = isIncSupp();
            long id = allocation.getID(this.mRS);
            long id2 = allocation2.getID(this.mRS);
            long id3 = allocation3.getID(this.mRS);
            if (isIncSupp) {
                id = getDummyAlloc(allocation);
                id2 = getDummyAlloc(allocation2);
                id3 = getDummyAlloc(allocation3);
            }
            this.mRS.nScriptIntrinsicBLAS_BNNM(getID(this.mRS), y, y2, x, id, i, id2, i2, id3, i3, i4, isIncSupp);
        }
    }

    public final void CGBMV(int i, int i2, int i3, Float2 float2, Allocation allocation, Allocation allocation2, int i4, Float2 float22, Allocation allocation3, int i5) {
        validateGEMV(Element.F32_2(this.mRS), i, allocation, allocation2, i4, allocation3, i5);
        if (i2 < 0 || i3 < 0) {
            throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
        }
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i6 = i;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 64, i6, 0, 0, 0, 0, y, x, 0, float2.f758x, float2.f759y, id, id2, float22.f758x, float22.f759y, id3, i4, i5, i2, i3, isIncSupp);
    }

    public final void CGEMM(int i, int i2, Float2 float2, Allocation allocation, Allocation allocation2, Float2 float22, Allocation allocation3) {
        int x;
        int y;
        int y2;
        validateTranspose(i);
        validateTranspose(i2);
        validateL3(Element.F32_2(this.mRS), i, i2, 0, allocation, allocation2, allocation3);
        if (i != 111) {
            x = allocation.getType().getX();
            y = allocation.getType().getY();
        } else {
            x = allocation.getType().getY();
            y = allocation.getType().getX();
        }
        if (i2 != 111) {
            y2 = allocation2.getType().getY();
        } else {
            y2 = allocation2.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i;
        int i4 = i2;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), RsBlas_cgemm, i3, i4, 0, 0, 0, x, y2, y, float2.f758x, float2.f759y, id, id2, float22.f758x, float22.f759y, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void CGEMV(int i, Float2 float2, Allocation allocation, Allocation allocation2, int i2, Float2 float22, Allocation allocation3, int i3) {
        validateGEMV(Element.F32_2(this.mRS), i, allocation, allocation2, i2, allocation3, i3);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 63, i4, 0, 0, 0, 0, y, x, 0, float2.f758x, float2.f759y, id, id2, float22.f758x, float22.f759y, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void CGERC(Float2 float2, Allocation allocation, int i, Allocation allocation2, int i2, Allocation allocation3) {
        validateGERU(Element.F32_2(this.mRS), allocation, i, allocation2, i2, allocation3);
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 99, 0, 0, 0, 0, 0, y, x, 0, float2.f758x, float2.f759y, id2, id3, 0.0f, 0.0f, id, i, i2, 0, 0, isIncSupp);
    }

    public final void CGERU(Float2 float2, Allocation allocation, int i, Allocation allocation2, int i2, Allocation allocation3) {
        validateGERU(Element.F32_2(this.mRS), allocation, i, allocation2, i2, allocation3);
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 98, 0, 0, 0, 0, 0, y, x, 0, float2.f758x, float2.f759y, id2, id3, 0.0f, 0.0f, id, i, i2, 0, 0, isIncSupp);
    }

    public final void CHBMV(int i, int i2, Float2 float2, Allocation allocation, Allocation allocation2, int i3, Float2 float22, Allocation allocation3, int i4) {
        int validateSYR2 = validateSYR2(Element.F32_2(this.mRS), i, allocation2, i3, allocation3, i4, allocation);
        if (i2 < 0) {
            throw new RSRuntimeException("K must be 0 or greater for HBMV");
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i5 = i;
        int i6 = i2;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 96, 0, 0, 0, i5, 0, 0, validateSYR2, i6, float2.f758x, float2.f759y, id, id2, float22.f758x, float22.f759y, id3, i3, i4, 0, 0, isIncSupp);
    }

    public final void CHEMM(int i, int i2, Float2 float2, Allocation allocation, Allocation allocation2, Float2 float22, Allocation allocation3) {
        validateUplo(i2);
        validateHEMM(Element.F32_2(this.mRS), i, allocation, allocation2, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i;
        int i4 = i2;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), RsBlas_chemm, 0, 0, i3, i4, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, float2.f758x, float2.f759y, id, id2, float22.f758x, float22.f759y, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void CHEMV(int i, Float2 float2, Allocation allocation, Allocation allocation2, int i2, Float2 float22, Allocation allocation3, int i3) {
        int validateSYR2 = validateSYR2(Element.F32_2(this.mRS), i, allocation2, i2, allocation3, i3, allocation);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 95, 0, 0, 0, i4, 0, 0, validateSYR2, 0, float2.f758x, float2.f759y, id, id2, float22.f758x, float22.f759y, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void CHER(int i, float f, Allocation allocation, int i2, Allocation allocation2) {
        int validateSYR = validateSYR(Element.F32_2(this.mRS), i, allocation, i2, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation2.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 100, 0, 0, 0, i, 0, 0, validateSYR, 0, f, 0.0f, id2, 0, 0.0f, 0.0f, id, i2, 0, 0, 0, isIncSupp);
    }

    public final void CHER2(int i, Float2 float2, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        int validateSYR2 = validateSYR2(Element.F32_2(this.mRS), i, allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 102, 0, 0, 0, i4, 0, 0, validateSYR2, 0, float2.f758x, float2.f759y, id2, id3, 0.0f, 0.0f, id, i2, i3, 0, 0, isIncSupp);
    }

    public final void CHER2K(int i, int i2, Float2 float2, Allocation allocation, Allocation allocation2, float f, Allocation allocation3) {
        int x;
        validateUplo(i);
        validateHER2K(Element.F32_2(this.mRS), i2, allocation, allocation2, allocation3);
        if (i2 == 111) {
            x = allocation.getType().getX();
        } else {
            x = allocation.getType().getY();
        }
        boolean isIncSupp = isIncSupp();
        allocation.getID(this.mRS);
        long id = allocation2.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            getDummyAlloc(allocation);
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), RsBlas_cher2k, i2, 0, 0, i, 0, 0, allocation3.getType().getX(), x, float2.f758x, float2.f759y, allocation.getID(this.mRS), id, f, 0.0f, id2, 0, 0, 0, 0, isIncSupp);
    }

    public final void CHERK(int i, int i2, float f, Allocation allocation, float f2, Allocation allocation2) {
        int y;
        validateUplo(i);
        validateHERK(Element.F32_2(this.mRS), i2, allocation, allocation2);
        if (i2 == 113) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), RsBlas_cherk, i2, 0, 0, i, 0, 0, allocation2.getType().getX(), y, f, 0.0f, id, 0, f2, 0.0f, id2, 0, 0, 0, 0, isIncSupp);
    }

    public final void CHPMV(int i, Float2 float2, Allocation allocation, Allocation allocation2, int i2, Float2 float22, Allocation allocation3, int i3) {
        int validateSPR2 = validateSPR2(Element.F32_2(this.mRS), i, allocation2, i2, allocation3, i3, allocation);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 97, 0, 0, 0, i4, 0, 0, validateSPR2, 0, float2.f758x, float2.f759y, id, id2, float22.f758x, float22.f759y, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void CHPR(int i, float f, Allocation allocation, int i2, Allocation allocation2) {
        int validateSPR = validateSPR(Element.F32_2(this.mRS), i, allocation, i2, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation2.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 101, 0, 0, 0, i, 0, 0, validateSPR, 0, f, 0.0f, id2, 0, 0.0f, 0.0f, id, i2, 0, 0, 0, isIncSupp);
    }

    public final void CHPR2(int i, Float2 float2, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        int validateSPR2 = validateSPR2(Element.F32_2(this.mRS), i, allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 103, 0, 0, 0, i4, 0, 0, validateSPR2, 0, float2.f758x, float2.f759y, id2, id3, 0.0f, 0.0f, id, i2, i3, 0, 0, isIncSupp);
    }

    public final void CSYMM(int i, int i2, Float2 float2, Allocation allocation, Allocation allocation2, Float2 float22, Allocation allocation3) {
        validateSide(i);
        validateUplo(i2);
        if (allocation.getType().getX() != allocation.getType().getY()) {
            throw new RSRuntimeException("Matrix A is not symmetric");
        }
        validateL3(Element.F32_2(this.mRS), 0, 0, i, allocation, allocation2, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i;
        int i4 = i2;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), RsBlas_csymm, 0, 0, i3, i4, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, float2.f758x, float2.f759y, id, id2, float22.f758x, float22.f759y, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void CSYR2K(int i, int i2, Float2 float2, Allocation allocation, Allocation allocation2, Float2 float22, Allocation allocation3) {
        int y;
        validateUplo(i);
        validateSYR2K(Element.F32_2(this.mRS), i2, allocation, allocation2, allocation3);
        if (i2 != 111) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i2;
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 128, i3, 0, 0, i4, 0, 0, allocation3.getType().getX(), y, float2.f758x, float2.f759y, id, id2, float22.f758x, float22.f759y, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void CSYRK(int i, int i2, Float2 float2, Allocation allocation, Float2 float22, Allocation allocation2) {
        int y;
        validateTranspose(i2);
        validateUplo(i);
        validateL3(Element.F32_2(this.mRS), i2, 0, 0, allocation, null, allocation2);
        if (i2 != 111) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), RsBlas_csyrk, i2, 0, 0, i, 0, 0, allocation2.getType().getX(), y, float2.f758x, float2.f759y, id, 0, float22.f758x, float22.f759y, allocation2.getID(this.mRS), 0, 0, 0, 0, isIncSupp);
    }

    public final void CTBMV(int i, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        if (i4 < 0) {
            throw new RSRuntimeException("K must be greater than or equal to 0");
        }
        validateTRMV(Element.F32_2(this.mRS), i, i2, i3, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 66, i2, 0, 0, i, i3, 0, y, i4, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public final void CTBSV(int i, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        validateTRMV(Element.F32_2(this.mRS), i, i2, i3, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        if (i4 < 0) {
            throw new RSRuntimeException("Number of diagonals must be positive");
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 69, i2, 0, 0, i, i3, 0, y, i4, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public final void CTPMV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        int validateTPMV = validateTPMV(Element.F32_2(this.mRS), i, i2, i3, allocation, allocation2, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 67, i2, 0, 0, i, i3, 0, validateTPMV, 0, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void CTPSV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        int validateTPMV = validateTPMV(Element.F32_2(this.mRS), i, i2, i3, allocation, allocation2, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 70, i2, 0, 0, i, i3, 0, validateTPMV, 0, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void CTRMM(int i, int i2, int i3, int i4, Float2 float2, Allocation allocation, Allocation allocation2) {
        validateUplo(i2);
        validateDiag(i4);
        validateTRMM(Element.F32_2(this.mRS), i, i3, allocation, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        int i8 = i4;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), RsBlas_ctrmm, i5, 0, i6, i7, i8, allocation2.getType().getY(), allocation2.getType().getX(), 0, float2.f758x, float2.f759y, id, id2, 0.0f, 0.0f, 0, 0, 0, 0, 0, isIncSupp);
    }

    public final void CTRMV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTRMV(Element.F32_2(this.mRS), i, i2, i3, allocation, allocation2, i4);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 65, i2, 0, 0, i, i3, 0, y, 0, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void CTRSM(int i, int i2, int i3, int i4, Float2 float2, Allocation allocation, Allocation allocation2) {
        validateUplo(i2);
        validateDiag(i4);
        validateTRSM(Element.F32_2(this.mRS), i, i3, allocation, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        int i8 = i4;
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), RsBlas_ctrsm, i5, 0, i6, i7, i8, allocation2.getType().getY(), allocation2.getType().getX(), 0, float2.f758x, float2.f759y, id, id2, 0.0f, 0.0f, 0, 0, 0, 0, 0, isIncSupp);
    }

    public final void CTRSV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTRMV(Element.F32_2(this.mRS), i, i2, i3, allocation, allocation2, i4);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Complex(getID(this.mRS), 68, i2, 0, 0, i, i3, 0, y, 0, 0.0f, 0.0f, id, id2, 0.0f, 0.0f, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void DGBMV(int i, int i2, int i3, double d, Allocation allocation, Allocation allocation2, int i4, double d2, Allocation allocation3, int i5) {
        validateGEMV(Element.F64(this.mRS), i, allocation, allocation2, i4, allocation3, i5);
        if (i2 < 0 || i3 < 0) {
            throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
        }
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 56, i, 0, 0, 0, 0, y, x, 0, d, id, id2, d2, id3, i4, i5, i2, i3, isIncSupp);
    }

    public final void DGEMM(int i, int i2, double d, Allocation allocation, Allocation allocation2, double d2, Allocation allocation3) {
        int x;
        int y;
        int y2;
        validateTranspose(i);
        validateTranspose(i2);
        validateL3(Element.F64(this.mRS), i, i2, 0, allocation, allocation2, allocation3);
        if (i != 111) {
            x = allocation.getType().getX();
            y = allocation.getType().getY();
        } else {
            x = allocation.getType().getY();
            y = allocation.getType().getX();
        }
        if (i2 != 111) {
            y2 = allocation2.getType().getY();
        } else {
            y2 = allocation2.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 119, i, i2, 0, 0, 0, x, y2, y, d, id, id2, d2, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void DGEMV(int i, double d, Allocation allocation, Allocation allocation2, int i2, double d2, Allocation allocation3, int i3) {
        validateGEMV(Element.F64(this.mRS), i, allocation, allocation2, i2, allocation3, i3);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 55, i, 0, 0, 0, 0, y, x, 0, d, id, id2, d2, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void DGER(double d, Allocation allocation, int i, Allocation allocation2, int i2, Allocation allocation3) {
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        validateGER(Element.F64(this.mRS), allocation, i, allocation2, i2, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 90, 0, 0, 0, 0, 0, y, x, 0, d, id2, id3, 0.0d, id, i, i2, 0, 0, isIncSupp);
    }

    public final void DSBMV(int i, int i2, double d, Allocation allocation, Allocation allocation2, int i3, double d2, Allocation allocation3, int i4) {
        if (i2 < 0) {
            throw new RSRuntimeException("K must be greater than or equal to 0");
        }
        int validateSYMV = validateSYMV(Element.F64(this.mRS), i, allocation, allocation2, allocation3, i3, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 88, 0, 0, 0, i, 0, 0, validateSYMV, i2, d, id, id2, d2, id3, i3, i4, 0, 0, isIncSupp);
    }

    public final void DSPMV(int i, double d, Allocation allocation, Allocation allocation2, int i2, double d2, Allocation allocation3, int i3) {
        int validateSPMV = validateSPMV(Element.F64(this.mRS), i, allocation, allocation2, i2, allocation3, i3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 89, 0, 0, 0, i, 0, 0, validateSPMV, 0, d, id, id2, d2, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void DSPR(int i, double d, Allocation allocation, int i2, Allocation allocation2) {
        int validateSPR = validateSPR(Element.F64(this.mRS), i, allocation, i2, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation2.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 92, 0, 0, 0, i, 0, 0, validateSPR, 0, d, id2, id, 0.0d, 0, i2, 0, 0, 0, isIncSupp);
    }

    public final void DSPR2(int i, double d, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        int validateSPR2 = validateSPR2(Element.F64(this.mRS), i, allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 94, 0, 0, 0, i, 0, 0, validateSPR2, 0, d, id2, id3, 0.0d, id, i2, i3, 0, 0, isIncSupp);
    }

    public final void DSYMM(int i, int i2, double d, Allocation allocation, Allocation allocation2, double d2, Allocation allocation3) {
        validateSide(i);
        validateUplo(i2);
        if (allocation.getType().getX() != allocation.getType().getY()) {
            throw new RSRuntimeException("Matrix A is not symmetric");
        }
        validateL3(Element.F64(this.mRS), 0, 0, i, allocation, allocation2, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 120, 0, 0, i, i2, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, d, id, id2, d2, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void DSYMV(int i, double d, Allocation allocation, Allocation allocation2, int i2, double d2, Allocation allocation3, int i3) {
        int validateSYMV = validateSYMV(Element.F64(this.mRS), i, allocation, allocation2, allocation3, i2, i3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 87, 0, 0, 0, i, 0, 0, validateSYMV, 0, d, id, id2, d2, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void DSYR(int i, double d, Allocation allocation, int i2, Allocation allocation2) {
        int validateSYR = validateSYR(Element.F64(this.mRS), i, allocation, i2, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation2.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 91, 0, 0, 0, i, 0, 0, validateSYR, 0, d, id2, id, 0.0d, 0, i2, 0, 0, 0, isIncSupp);
    }

    public final void DSYR2(int i, double d, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        int validateSYR2 = validateSYR2(Element.F64(this.mRS), i, allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 93, 0, 0, 0, i, 0, 0, validateSYR2, 0, d, id2, id3, 0.0d, id, i2, i3, 0, 0, isIncSupp);
    }

    public final void DSYR2K(int i, int i2, double d, Allocation allocation, Allocation allocation2, double d2, Allocation allocation3) {
        int y;
        validateUplo(i);
        validateSYR2K(Element.F64(this.mRS), i2, allocation, allocation2, allocation3);
        if (i2 != 111) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 122, i2, 0, 0, i, 0, 0, allocation3.getType().getX(), y, d, id, id2, d2, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void DSYRK(int i, int i2, double d, Allocation allocation, double d2, Allocation allocation2) {
        int y;
        validateTranspose(i2);
        validateUplo(i);
        validateL3(Element.F64(this.mRS), i2, 0, 0, allocation, null, allocation2);
        if (i2 != 111) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 121, i2, 0, 0, i, 0, 0, allocation2.getType().getX(), y, d, id, 0, d2, id2, 0, 0, 0, 0, isIncSupp);
    }

    public final void DTBMV(int i, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        if (i4 < 0) {
            throw new RSRuntimeException("K must be greater than or equal to 0");
        }
        validateTRMV(Element.F64(this.mRS), i, i2, i3, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 58, i2, 0, 0, i, i3, 0, y, i4, 0.0d, id, id2, 0.0d, 0, i5, 0, 0, 0, isIncSupp);
    }

    public final void DTBSV(int i, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        validateTRMV(Element.F64(this.mRS), i, i2, i3, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        if (i4 < 0) {
            throw new RSRuntimeException("Number of diagonals must be positive");
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 61, i2, 0, 0, i, i3, 0, y, i4, 0.0d, id, id2, 0.0d, 0, i5, 0, 0, 0, isIncSupp);
    }

    public final void DTPMV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        int validateTPMV = validateTPMV(Element.F64(this.mRS), i, i2, i3, allocation, allocation2, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 59, i2, 0, 0, i, i3, 0, validateTPMV, 0, 0.0d, id, id2, 0.0d, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void DTPSV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        int validateTPMV = validateTPMV(Element.F64(this.mRS), i, i2, i3, allocation, allocation2, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 62, i2, 0, 0, i, i3, 0, validateTPMV, 0, 0.0d, id, id2, 0.0d, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void DTRMM(int i, int i2, int i3, int i4, double d, Allocation allocation, Allocation allocation2) {
        validateUplo(i2);
        validateDiag(i4);
        validateTRMM(Element.F64(this.mRS), i, i3, allocation, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), RsBlas_dtrmm, i3, 0, i, i2, i4, allocation2.getType().getY(), allocation2.getType().getX(), 0, d, id, id2, 0.0d, 0, 0, 0, 0, 0, isIncSupp);
    }

    public final void DTRMV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTRMV(Element.F64(this.mRS), i, i2, i3, allocation, allocation2, i4);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 57, i2, 0, 0, i, i3, 0, y, 0, 0.0d, id, id2, 0.0d, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void DTRSM(int i, int i2, int i3, int i4, double d, Allocation allocation, Allocation allocation2) {
        validateUplo(i2);
        validateDiag(i4);
        validateTRSM(Element.F64(this.mRS), i, i3, allocation, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), RsBlas_dtrsm, i3, 0, i, i2, i4, allocation2.getType().getY(), allocation2.getType().getX(), 0, d, id, id2, 0.0d, 0, 0, 0, 0, 0, isIncSupp);
    }

    public final void DTRSV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTRMV(Element.F64(this.mRS), i, i2, i3, allocation, allocation2, i4);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Double(getID(this.mRS), 60, i2, 0, 0, i, i3, 0, y, 0, 0.0d, id, id2, 0.0d, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void SGBMV(int i, int i2, int i3, float f, Allocation allocation, Allocation allocation2, int i4, float f2, Allocation allocation3, int i5) {
        validateGEMV(Element.F32(this.mRS), i, allocation, allocation2, i4, allocation3, i5);
        if (i2 < 0 || i3 < 0) {
            throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
        }
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 48, i, 0, 0, 0, 0, y, x, 0, f, id, id2, f2, id3, i4, i5, i2, i3, isIncSupp);
    }

    public final void SGEMM(int i, int i2, float f, Allocation allocation, Allocation allocation2, float f2, Allocation allocation3) {
        int x;
        int y;
        int y2;
        validateTranspose(i);
        validateTranspose(i2);
        validateL3(Element.F32(this.mRS), i, i2, 0, allocation, allocation2, allocation3);
        if (i != 111) {
            x = allocation.getType().getX();
            y = allocation.getType().getY();
        } else {
            x = allocation.getType().getY();
            y = allocation.getType().getX();
        }
        if (i2 != 111) {
            y2 = allocation2.getType().getY();
        } else {
            y2 = allocation2.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 113, i, i2, 0, 0, 0, x, y2, y, f, id, id2, f2, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void SGEMV(int i, float f, Allocation allocation, Allocation allocation2, int i2, float f2, Allocation allocation3, int i3) {
        validateGEMV(Element.F32(this.mRS), i, allocation, allocation2, i2, allocation3, i3);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 47, i, 0, 0, 0, 0, y, x, 0, f, id, id2, f2, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void SGER(float f, Allocation allocation, int i, Allocation allocation2, int i2, Allocation allocation3) {
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        validateGER(Element.F32(this.mRS), allocation, i, allocation2, i2, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 82, 0, 0, 0, 0, 0, y, x, 0, f, id2, id3, 0.0f, id, i, i2, 0, 0, isIncSupp);
    }

    public final void SSBMV(int i, int i2, float f, Allocation allocation, Allocation allocation2, int i3, float f2, Allocation allocation3, int i4) {
        if (i2 < 0) {
            throw new RSRuntimeException("K must be greater than or equal to 0");
        }
        int validateSYMV = validateSYMV(Element.F32(this.mRS), i, allocation, allocation2, allocation3, i3, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 80, 0, 0, 0, i, 0, 0, validateSYMV, i2, f, id, id2, f2, id3, i3, i4, 0, 0, isIncSupp);
    }

    public final void SSPMV(int i, float f, Allocation allocation, Allocation allocation2, int i2, float f2, Allocation allocation3, int i3) {
        int validateSPMV = validateSPMV(Element.F32(this.mRS), i, allocation, allocation2, i2, allocation3, i3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 81, 0, 0, 0, i, 0, 0, validateSPMV, 0, f, id, id2, f2, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void SSPR(int i, float f, Allocation allocation, int i2, Allocation allocation2) {
        int validateSPR = validateSPR(Element.F32(this.mRS), i, allocation, i2, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation2.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 84, 0, 0, 0, i, 0, 0, validateSPR, 0, f, id2, id, 0.0f, 0, i2, 0, 0, 0, isIncSupp);
    }

    public final void SSPR2(int i, float f, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        int validateSPR2 = validateSPR2(Element.F32(this.mRS), i, allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 86, 0, 0, 0, i, 0, 0, validateSPR2, 0, f, id2, id3, 0.0f, id, i2, i3, 0, 0, isIncSupp);
    }

    public final void SSYMM(int i, int i2, float f, Allocation allocation, Allocation allocation2, float f2, Allocation allocation3) {
        validateSide(i);
        validateUplo(i2);
        if (allocation.getType().getX() != allocation.getType().getY()) {
            throw new RSRuntimeException("Matrix A is not symmetric");
        }
        validateL3(Element.F32(this.mRS), 0, 0, i, allocation, allocation2, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i;
        int i4 = i2;
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 114, 0, 0, i3, i4, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, f, id, id2, f2, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void SSYMV(int i, float f, Allocation allocation, Allocation allocation2, int i2, float f2, Allocation allocation3, int i3) {
        int validateSYMV = validateSYMV(Element.F32(this.mRS), i, allocation, allocation2, allocation3, i2, i3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 79, 0, 0, 0, i, 0, 0, validateSYMV, 0, f, id, id2, f2, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void SSYR(int i, float f, Allocation allocation, int i2, Allocation allocation2) {
        int validateSYR = validateSYR(Element.F32(this.mRS), i, allocation, i2, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation2.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 83, 0, 0, 0, i, 0, 0, validateSYR, 0, f, id2, id, 0.0f, 0, i2, 0, 0, 0, isIncSupp);
    }

    public final void SSYR2(int i, float f, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        int validateSYR2 = validateSYR2(Element.F32(this.mRS), i, allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 85, 0, 0, 0, i, 0, 0, validateSYR2, 0, f, id2, id3, 0.0f, id, i2, i3, 0, 0, isIncSupp);
    }

    public final void SSYR2K(int i, int i2, float f, Allocation allocation, Allocation allocation2, float f2, Allocation allocation3) {
        int y;
        validateUplo(i);
        validateSYR2K(Element.F32(this.mRS), i2, allocation, allocation2, allocation3);
        if (i2 != 111) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i2;
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 116, i3, 0, 0, i4, 0, 0, allocation3.getType().getX(), y, f, id, id2, f2, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void SSYRK(int i, int i2, float f, Allocation allocation, float f2, Allocation allocation2) {
        int y;
        validateTranspose(i2);
        validateUplo(i);
        validateL3(Element.F32(this.mRS), i2, 0, 0, allocation, null, allocation2);
        if (i2 != 111) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        int i3 = i2;
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 115, i3, 0, 0, i4, 0, 0, allocation2.getType().getX(), y, f, id, 0, f2, id2, 0, 0, 0, 0, isIncSupp);
    }

    public final void STBMV(int i, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        if (i4 < 0) {
            throw new RSRuntimeException("K must be greater than or equal to 0");
        }
        validateTRMV(Element.F32(this.mRS), i, i2, i3, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 50, i2, 0, 0, i, i3, 0, y, i4, 0.0f, id, id2, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public final void STBSV(int i, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        validateTRMV(Element.F32(this.mRS), i, i2, i3, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        if (i4 < 0) {
            throw new RSRuntimeException("Number of diagonals must be positive");
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 53, i2, 0, 0, i, i3, 0, y, i4, 0.0f, id, id2, 0.0f, 0, i5, 0, 0, 0, isIncSupp);
    }

    public final void STPMV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        int validateTPMV = validateTPMV(Element.F32(this.mRS), i, i2, i3, allocation, allocation2, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 51, i2, 0, 0, i, i3, 0, validateTPMV, 0, 0.0f, id, id2, 0.0f, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void STPSV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        int validateTPMV = validateTPMV(Element.F32(this.mRS), i, i2, i3, allocation, allocation2, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 54, i2, 0, 0, i, i3, 0, validateTPMV, 0, 0.0f, id, id2, 0.0f, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void STRMM(int i, int i2, int i3, int i4, float f, Allocation allocation, Allocation allocation2) {
        validateUplo(i2);
        validateDiag(i4);
        validateTRMM(Element.F32(this.mRS), i, i3, allocation, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        int i8 = i4;
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 117, i5, 0, i6, i7, i8, allocation2.getType().getY(), allocation2.getType().getX(), 0, f, id, id2, 0.0f, 0, 0, 0, 0, 0, isIncSupp);
    }

    public final void STRMV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTRMV(Element.F32(this.mRS), i, i2, i3, allocation, allocation2, i4);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 49, i2, 0, 0, i, i3, 0, y, 0, 0.0f, id, id2, 0.0f, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void STRSM(int i, int i2, int i3, int i4, float f, Allocation allocation, Allocation allocation2) {
        validateUplo(i2);
        validateDiag(i4);
        validateTRSM(Element.F32(this.mRS), i, i3, allocation, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        int i8 = i4;
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 118, i5, 0, i6, i7, i8, allocation2.getType().getY(), allocation2.getType().getX(), 0, f, id, id2, 0.0f, 0, 0, 0, 0, 0, isIncSupp);
    }

    public final void STRSV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTRMV(Element.F32(this.mRS), i, i2, i3, allocation, allocation2, i4);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Single(getID(this.mRS), 52, i2, 0, 0, i, i3, 0, y, 0, 0.0f, id, id2, 0.0f, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void ZGBMV(int i, int i2, int i3, Double2 double2, Allocation allocation, Allocation allocation2, int i4, Double2 double22, Allocation allocation3, int i5) {
        validateGEMV(Element.F64_2(this.mRS), i, allocation, allocation2, i4, allocation3, i5);
        if (i2 < 0 || i3 < 0) {
            throw new RSRuntimeException("KL and KU must be greater than or equal to 0");
        }
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i6 = i;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 72, i6, 0, 0, 0, 0, y, x, 0, double2.f749x, double2.f750y, id, id2, double22.f749x, double22.f750y, id3, i4, i5, i2, i3, isIncSupp);
    }

    public final void ZGEMM(int i, int i2, Double2 double2, Allocation allocation, Allocation allocation2, Double2 double22, Allocation allocation3) {
        int x;
        int y;
        int y2;
        validateTranspose(i);
        validateTranspose(i2);
        validateL3(Element.F64_2(this.mRS), i, i2, 0, allocation, allocation2, allocation3);
        if (i != 111) {
            x = allocation.getType().getX();
            y = allocation.getType().getY();
        } else {
            x = allocation.getType().getY();
            y = allocation.getType().getX();
        }
        if (i2 != 111) {
            y2 = allocation2.getType().getY();
        } else {
            y2 = allocation2.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i;
        int i4 = i2;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 131, i3, i4, 0, 0, 0, x, y2, y, double2.f749x, double2.f750y, id, id2, double22.f749x, double22.f750y, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void ZGEMV(int i, Double2 double2, Allocation allocation, Allocation allocation2, int i2, Double2 double22, Allocation allocation3, int i3) {
        validateGEMV(Element.F64_2(this.mRS), i, allocation, allocation2, i2, allocation3, i3);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 71, i4, 0, 0, 0, 0, y, x, 0, double2.f749x, double2.f750y, id, id2, double22.f749x, double22.f750y, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void ZGERC(Double2 double2, Allocation allocation, int i, Allocation allocation2, int i2, Allocation allocation3) {
        validateGERU(Element.F64_2(this.mRS), allocation, i, allocation2, i2, allocation3);
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 108, 0, 0, 0, 0, 0, y, x, 0, double2.f749x, double2.f750y, id2, id3, 0.0d, 0.0d, id, i, i2, 0, 0, isIncSupp);
    }

    public final void ZGERU(Double2 double2, Allocation allocation, int i, Allocation allocation2, int i2, Allocation allocation3) {
        validateGERU(Element.F64_2(this.mRS), allocation, i, allocation2, i2, allocation3);
        int y = allocation3.getType().getY();
        int x = allocation3.getType().getX();
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 107, 0, 0, 0, 0, 0, y, x, 0, double2.f749x, double2.f750y, id2, id3, 0.0d, 0.0d, id, i, i2, 0, 0, isIncSupp);
    }

    public final void ZHBMV(int i, int i2, Double2 double2, Allocation allocation, Allocation allocation2, int i3, Double2 double22, Allocation allocation3, int i4) {
        int validateSYR2 = validateSYR2(Element.F64_2(this.mRS), i, allocation2, i3, allocation3, i4, allocation);
        if (i2 < 0) {
            throw new RSRuntimeException("K must be 0 or greater for HBMV");
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i5 = i;
        int i6 = i2;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 105, 0, 0, 0, i5, 0, 0, validateSYR2, i6, double2.f749x, double2.f750y, id, id2, double22.f749x, double22.f750y, id3, i3, i4, 0, 0, isIncSupp);
    }

    public final void ZHEMM(int i, int i2, Double2 double2, Allocation allocation, Allocation allocation2, Double2 double22, Allocation allocation3) {
        validateUplo(i2);
        validateHEMM(Element.F64_2(this.mRS), i, allocation, allocation2, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i;
        int i4 = i2;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), RsBlas_zhemm, 0, 0, i3, i4, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, double2.f749x, double2.f750y, id, id2, double22.f749x, double22.f750y, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void ZHEMV(int i, Double2 double2, Allocation allocation, Allocation allocation2, int i2, Double2 double22, Allocation allocation3, int i3) {
        int validateSYR2 = validateSYR2(Element.F64_2(this.mRS), i, allocation2, i2, allocation3, i3, allocation);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 104, 0, 0, 0, i4, 0, 0, validateSYR2, 0, double2.f749x, double2.f750y, id, id2, double22.f749x, double22.f750y, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void ZHER(int i, double d, Allocation allocation, int i2, Allocation allocation2) {
        int validateSYR = validateSYR(Element.F64_2(this.mRS), i, allocation, i2, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation2.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 109, 0, 0, 0, i, 0, 0, validateSYR, 0, d, 0.0d, id2, 0, 0.0d, 0.0d, id, i2, 0, 0, 0, isIncSupp);
    }

    public final void ZHER2(int i, Double2 double2, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        int validateSYR2 = validateSYR2(Element.F64_2(this.mRS), i, allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 111, 0, 0, 0, i4, 0, 0, validateSYR2, 0, double2.f749x, double2.f750y, id2, id3, 0.0d, 0.0d, id, i2, i3, 0, 0, isIncSupp);
    }

    public final void ZHER2K(int i, int i2, Double2 double2, Allocation allocation, Allocation allocation2, double d, Allocation allocation3) {
        int x;
        validateUplo(i);
        validateHER2K(Element.F64_2(this.mRS), i2, allocation, allocation2, allocation3);
        if (i2 == 111) {
            x = allocation.getType().getX();
        } else {
            x = allocation.getType().getY();
        }
        boolean isIncSupp = isIncSupp();
        allocation.getID(this.mRS);
        long id = allocation2.getID(this.mRS);
        long id2 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            getDummyAlloc(allocation);
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation3);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 142, i2, 0, 0, i, 0, 0, allocation3.getType().getX(), x, double2.f749x, double2.f750y, allocation.getID(this.mRS), id, d, 0.0d, id2, 0, 0, 0, 0, isIncSupp);
    }

    public final void ZHERK(int i, int i2, double d, Allocation allocation, double d2, Allocation allocation2) {
        int y;
        validateUplo(i);
        validateHERK(Element.F64_2(this.mRS), i2, allocation, allocation2);
        if (i2 == 113) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 141, i2, 0, 0, i, 0, 0, allocation2.getType().getX(), y, d, 0.0d, id, 0, d2, 0.0d, id2, 0, 0, 0, 0, isIncSupp);
    }

    public final void ZHPMV(int i, Double2 double2, Allocation allocation, Allocation allocation2, int i2, Double2 double22, Allocation allocation3, int i3) {
        int validateSPR2 = validateSPR2(Element.F64_2(this.mRS), i, allocation2, i2, allocation3, i3, allocation);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 106, 0, 0, 0, i4, 0, 0, validateSPR2, 0, double2.f749x, double2.f750y, id, id2, double22.f749x, double22.f750y, id3, i2, i3, 0, 0, isIncSupp);
    }

    public final void ZHPR(int i, double d, Allocation allocation, int i2, Allocation allocation2) {
        int validateSPR = validateSPR(Element.F64_2(this.mRS), i, allocation, i2, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation2.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation2);
            id2 = getDummyAlloc(allocation);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 110, 0, 0, 0, i, 0, 0, validateSPR, 0, d, 0.0d, id2, 0, 0.0d, 0.0d, id, i2, 0, 0, 0, isIncSupp);
    }

    public final void ZHPR2(int i, Double2 double2, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        int validateSPR2 = validateSPR2(Element.F64_2(this.mRS), i, allocation, i2, allocation2, i3, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation3.getID(this.mRS);
        long id2 = allocation.getID(this.mRS);
        long id3 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation3);
            id2 = getDummyAlloc(allocation);
            id3 = getDummyAlloc(allocation2);
        }
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 112, 0, 0, 0, i4, 0, 0, validateSPR2, 0, double2.f749x, double2.f750y, id2, id3, 0.0d, 0.0d, id, i2, i3, 0, 0, isIncSupp);
    }

    public final void ZSYMM(int i, int i2, Double2 double2, Allocation allocation, Allocation allocation2, Double2 double22, Allocation allocation3) {
        validateSide(i);
        validateUplo(i2);
        if (allocation.getType().getX() != allocation.getType().getY()) {
            throw new RSRuntimeException("Matrix A is not symmetric");
        }
        validateL3(Element.F64_2(this.mRS), 0, 0, i, allocation, allocation2, allocation3);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i;
        int i4 = i2;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 132, 0, 0, i3, i4, 0, allocation3.getType().getY(), allocation3.getType().getX(), 0, double2.f749x, double2.f750y, id, id2, double22.f749x, double22.f750y, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void ZSYR2K(int i, int i2, Double2 double2, Allocation allocation, Allocation allocation2, Double2 double22, Allocation allocation3) {
        int y;
        validateUplo(i);
        validateSYR2K(Element.F64_2(this.mRS), i2, allocation, allocation2, allocation3);
        if (i2 != 111) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        long id3 = allocation3.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
            id3 = getDummyAlloc(allocation3);
        }
        int i3 = i2;
        int i4 = i;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), RsBlas_zsyr2k, i3, 0, 0, i4, 0, 0, allocation3.getType().getX(), y, double2.f749x, double2.f750y, id, id2, double22.f749x, double22.f750y, id3, 0, 0, 0, 0, isIncSupp);
    }

    public final void ZSYRK(int i, int i2, Double2 double2, Allocation allocation, Double2 double22, Allocation allocation2) {
        int y;
        validateTranspose(i2);
        validateUplo(i);
        validateL3(Element.F64_2(this.mRS), i2, 0, 0, allocation, null, allocation2);
        if (i2 != 111) {
            y = allocation.getType().getY();
        } else {
            y = allocation.getType().getX();
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), RsBlas_zsyrk, i2, 0, 0, i, 0, 0, allocation2.getType().getX(), y, double2.f749x, double2.f750y, id, 0, double22.f749x, double22.f750y, allocation2.getID(this.mRS), 0, 0, 0, 0, isIncSupp);
    }

    public final void ZTBMV(int i, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        if (i4 < 0) {
            throw new RSRuntimeException("K must be greater than or equal to 0");
        }
        validateTRMV(Element.F64_2(this.mRS), i, i2, i3, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 74, i2, 0, 0, i, i3, 0, y, i4, 0.0d, 0.0d, id, id2, 0.0d, 0.0d, 0, i5, 0, 0, 0, isIncSupp);
    }

    public final void ZTBSV(int i, int i2, int i3, int i4, Allocation allocation, Allocation allocation2, int i5) {
        validateTRMV(Element.F64_2(this.mRS), i, i2, i3, allocation, allocation2, i5);
        int y = allocation.getType().getY();
        if (i4 < 0) {
            throw new RSRuntimeException("Number of diagonals must be positive");
        }
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 77, i2, 0, 0, i, i3, 0, y, i4, 0.0d, 0.0d, id, id2, 0.0d, 0.0d, 0, i5, 0, 0, 0, isIncSupp);
    }

    public final void ZTPMV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        int validateTPMV = validateTPMV(Element.F64_2(this.mRS), i, i2, i3, allocation, allocation2, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 75, i2, 0, 0, i, i3, 0, validateTPMV, 0, 0.0d, 0.0d, id, id2, 0.0d, 0.0d, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void ZTPSV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        int validateTPMV = validateTPMV(Element.F64_2(this.mRS), i, i2, i3, allocation, allocation2, i4);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 78, i2, 0, 0, i, i3, 0, validateTPMV, 0, 0.0d, 0.0d, id, id2, 0.0d, 0.0d, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void ZTRMM(int i, int i2, int i3, int i4, Double2 double2, Allocation allocation, Allocation allocation2) {
        validateUplo(i2);
        validateDiag(i4);
        validateTRMM(Element.F64_2(this.mRS), i, i3, allocation, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        int i8 = i4;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), RsBlas_ztrmm, i5, 0, i6, i7, i8, allocation2.getType().getY(), allocation2.getType().getX(), 0, double2.f749x, double2.f750y, id, id2, 0.0d, 0.0d, 0, 0, 0, 0, 0, isIncSupp);
    }

    public final void ZTRMV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTRMV(Element.F64_2(this.mRS), i, i2, i3, allocation, allocation2, i4);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 73, i2, 0, 0, i, i3, 0, y, 0, 0.0d, 0.0d, id, id2, 0.0d, 0.0d, 0, i4, 0, 0, 0, isIncSupp);
    }

    public final void ZTRSM(int i, int i2, int i3, int i4, Double2 double2, Allocation allocation, Allocation allocation2) {
        validateUplo(i2);
        validateDiag(i4);
        validateTRSM(Element.F64_2(this.mRS), i, i3, allocation, allocation2);
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        int i5 = i3;
        int i6 = i;
        int i7 = i2;
        int i8 = i4;
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), RsBlas_ztrsm, i5, 0, i6, i7, i8, allocation2.getType().getY(), allocation2.getType().getX(), 0, double2.f749x, double2.f750y, id, id2, 0.0d, 0.0d, 0, 0, 0, 0, 0, isIncSupp);
    }

    public final void ZTRSV(int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTRMV(Element.F64_2(this.mRS), i, i2, i3, allocation, allocation2, i4);
        int y = allocation.getType().getY();
        boolean isIncSupp = isIncSupp();
        long id = allocation.getID(this.mRS);
        long id2 = allocation2.getID(this.mRS);
        if (isIncSupp) {
            id = getDummyAlloc(allocation);
            id2 = getDummyAlloc(allocation2);
        }
        this.mRS.nScriptIntrinsicBLAS_Z(getID(this.mRS), 76, i2, 0, 0, i, i3, 0, y, 0, 0.0d, 0.0d, id, id2, 0.0d, 0.0d, 0, i4, 0, 0, 0, isIncSupp);
    }

    public static ScriptIntrinsicBLAS create(RenderScript renderScript) {
        renderScript.isUseNative();
        ScriptIntrinsicBLAS scriptIntrinsicBLAS = new ScriptIntrinsicBLAS(renderScript.nScriptIntrinsicCreate(13, Element.U32(renderScript).getID(renderScript), false), renderScript);
        scriptIntrinsicBLAS.setIncSupp(false);
        return scriptIntrinsicBLAS;
    }

    static void validateConjTranspose(int i) {
        if (i != 111 && i != 113) {
            throw new RSRuntimeException("Invalid transpose passed to BLAS");
        }
    }

    static void validateDiag(int i) {
        if (i != 131 && i != 132) {
            throw new RSRuntimeException("Invalid diag passed to BLAS");
        }
    }

    static void validateGEMV(Element element, int i, Allocation allocation, Allocation allocation2, int i2, Allocation allocation3, int i3) {
        validateTranspose(i);
        int y = allocation.getType().getY();
        int x = allocation.getType().getX();
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element) || !allocation3.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1 || allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (i2 <= 0 || i3 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        } else {
            int i4;
            if (i == 111) {
                i4 = ((x - 1) * i2) + 1;
                y = ((y - 1) * i3) + 1;
            } else {
                i4 = ((y - 1) * i2) + 1;
                y = ((x - 1) * i3) + 1;
            }
            if (allocation2.getType().getX() != i4 || allocation3.getType().getX() != r0) {
                throw new RSRuntimeException("Incorrect vector dimensions for GEMV");
            }
        }
    }

    static void validateGER(Element element, Allocation allocation, int i, Allocation allocation2, int i2, Allocation allocation3) {
        if (!allocation3.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else {
            int y = allocation3.getType().getY();
            int x = allocation3.getType().getX();
            if (x <= 0 || y <= 0) {
                throw new RSRuntimeException("M and N must be 1 or greater for GER");
            } else if (i <= 0 || i2 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else if (allocation.getType().getX() != ((y - 1) * i) + 1) {
                throw new RSRuntimeException("Incorrect vector dimensions for GER");
            } else if (allocation2.getType().getX() != ((x - 1) * i2) + 1) {
                throw new RSRuntimeException("Incorrect vector dimensions for GER");
            }
        }
    }

    static void validateGERU(Element element, Allocation allocation, int i, Allocation allocation2, int i2, Allocation allocation3) {
        if (!allocation3.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else {
            int y = allocation3.getType().getY();
            int x = allocation3.getType().getX();
            if (i <= 0 || i2 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else if (allocation.getType().getX() != ((y - 1) * i) + 1) {
                throw new RSRuntimeException("Incorrect vector dimensions for GERU");
            } else if (allocation2.getType().getX() != ((x - 1) * i2) + 1) {
                throw new RSRuntimeException("Incorrect vector dimensions for GERU");
            }
        }
    }

    static void validateHEMM(Element element, int i, Allocation allocation, Allocation allocation2, Allocation allocation3) {
        validateSide(i);
        if (allocation.getType().getElement().isCompatible(element) && allocation2.getType().getElement().isCompatible(element) && allocation3.getType().getElement().isCompatible(element)) {
            int x = allocation.getType().getX();
            if (x != allocation.getType().getY()) {
                throw new RSRuntimeException("Called HEMM with non-square A");
            } else if ((i == 141 && x != allocation2.getType().getY()) || (i == 142 && x != allocation2.getType().getX())) {
                throw new RSRuntimeException("Called HEMM with invalid B");
            } else if (allocation2.getType().getX() != allocation3.getType().getX() || allocation2.getType().getY() != allocation3.getType().getY()) {
                throw new RSRuntimeException("Called HEMM with mismatched B and C");
            } else {
                return;
            }
        }
        throw new RSRuntimeException("Called BLAS with wrong Element type");
    }

    static void validateHER2K(Element element, int i, Allocation allocation, Allocation allocation2, Allocation allocation3) {
        if (allocation.getType().getElement().isCompatible(element) && allocation2.getType().getElement().isCompatible(element) && allocation3.getType().getElement().isCompatible(element)) {
            validateConjTranspose(i);
            int x = allocation3.getType().getX();
            if (x != allocation3.getType().getY()) {
                throw new RSRuntimeException("Called HER2K with non-square C");
            }
            if (i == 111) {
                if (allocation.getType().getY() != x) {
                    throw new RSRuntimeException("Called HER2K with invalid matrices");
                }
            } else if (allocation.getType().getX() != x) {
                throw new RSRuntimeException("Called HER2K with invalid matrices");
            }
            if (allocation.getType().getX() != allocation2.getType().getX() || allocation.getType().getY() != allocation2.getType().getY()) {
                throw new RSRuntimeException("Called HER2K with invalid A and B matrices");
            }
            return;
        }
        throw new RSRuntimeException("Called BLAS with wrong Element type");
    }

    static void validateHERK(Element element, int i, Allocation allocation, Allocation allocation2) {
        if (allocation.getType().getElement().isCompatible(element) && allocation2.getType().getElement().isCompatible(element)) {
            validateConjTranspose(i);
            int x = allocation2.getType().getX();
            if (x != allocation2.getType().getY()) {
                throw new RSRuntimeException("Called HERK with non-square C");
            } else if (i == 111) {
                if (x != allocation.getType().getY()) {
                    throw new RSRuntimeException("Called HERK with invalid A");
                }
                return;
            } else if (x != allocation.getType().getX()) {
                throw new RSRuntimeException("Called HERK with invalid A");
            } else {
                return;
            }
        }
        throw new RSRuntimeException("Called BLAS with wrong Element type");
    }

    static void validateL3(Element element, int i, int i2, int i3, Allocation allocation, Allocation allocation2, Allocation allocation3) {
        int i4 = -1;
        if ((allocation != null && !allocation.getType().getElement().isCompatible(element)) || ((allocation2 != null && !allocation2.getType().getElement().isCompatible(element)) || (allocation3 != null && !allocation3.getType().getElement().isCompatible(element)))) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation3 == null) {
            throw new RSRuntimeException("Allocation C cannot be null");
        } else {
            int y;
            int x;
            int y2;
            int y3 = allocation3.getType().getY();
            int x2 = allocation3.getType().getX();
            int i5;
            if (i3 == 142) {
                if (allocation == null) {
                    if (allocation2 == null) {
                    }
                    throw new RSRuntimeException("Provided Matrix A without Matrix B, or vice versa");
                }
                if (allocation == null || allocation2 != null) {
                    if (allocation2 != null) {
                        y = allocation.getType().getY();
                        x = allocation.getType().getX();
                    } else {
                        x = -1;
                        y = -1;
                    }
                    if (allocation != null) {
                        y2 = allocation2.getType().getY();
                        i5 = x;
                        x = y;
                        y = allocation2.getType().getX();
                        i4 = i5;
                    } else {
                        y2 = -1;
                        i5 = y;
                        y = -1;
                        i4 = x;
                        x = i5;
                    }
                }
                throw new RSRuntimeException("Provided Matrix A without Matrix B, or vice versa");
            }
            if (allocation == null) {
                x = -1;
                y = -1;
            } else if (i == 112 || i == 113) {
                x = allocation.getType().getY();
                y = allocation.getType().getX();
            } else {
                y = allocation.getType().getY();
                x = allocation.getType().getX();
            }
            if (allocation2 == null) {
                y2 = y;
                y = x;
                x = -1;
            } else if (i2 == 112 || i2 == 113) {
                i4 = allocation2.getType().getY();
                y2 = y;
                y = x;
                x = allocation2.getType().getX();
            } else {
                y2 = allocation2.getType().getY();
                i4 = allocation2.getType().getX();
                i5 = y2;
                y2 = y;
                y = x;
                x = i5;
            }
            if (allocation == null || allocation2 == null || allocation3 == null) {
                if (allocation == null || allocation3 == null) {
                    if (allocation != null && allocation2 != null && y != x) {
                        throw new RSRuntimeException("Called BLAS with invalid dimensions");
                    }
                } else if (y3 != x2) {
                    throw new RSRuntimeException("Matrix C is not symmetric");
                } else if (y2 != y3) {
                    throw new RSRuntimeException("Called BLAS with invalid dimensions");
                }
            } else if (y != x || y2 != y3 || r1 != x2) {
                throw new RSRuntimeException("Called BLAS with invalid dimensions");
            }
        }
    }

    static int validateSPMV(Element element, int i, Allocation allocation, Allocation allocation2, int i2, Allocation allocation3, int i3) {
        validateUplo(i);
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element) || !allocation3.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1 || allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (allocation.getType().getY() > 1) {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        } else {
            double x = (double) allocation.getType().getX();
            int sqrt = (int) Math.sqrt(x + x);
            if (allocation.getType().getX() != ((sqrt + 1) * sqrt) / 2) {
                throw new RSRuntimeException("Invalid dimension for Ap");
            } else if (i2 <= 0 || i3 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else {
                int i4 = sqrt - 1;
                if (allocation2.getType().getX() != (i4 * i2) + 1) {
                    throw new RSRuntimeException("Incorrect vector dimensions for SPMV");
                } else if (allocation3.getType().getX() == (i4 * i3) + 1) {
                    return sqrt;
                } else {
                    throw new RSRuntimeException("Incorrect vector dimensions for SPMV");
                }
            }
        }
    }

    static int validateSPR(Element element, int i, Allocation allocation, int i2, Allocation allocation2) {
        validateUplo(i);
        if (!allocation2.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        } else {
            double x = (double) allocation2.getType().getX();
            int sqrt = (int) Math.sqrt(x + x);
            if (allocation2.getType().getX() != ((sqrt + 1) * sqrt) / 2) {
                throw new RSRuntimeException("Invalid dimension for Ap");
            } else if (i2 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else if (allocation.getType().getX() == ((sqrt - 1) * i2) + 1) {
                return sqrt;
            } else {
                throw new RSRuntimeException("Incorrect vector dimensions for SPR");
            }
        }
    }

    static int validateSPR2(Element element, int i, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        validateUplo(i);
        if (!allocation3.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        } else {
            double x = (double) allocation3.getType().getX();
            int sqrt = (int) Math.sqrt(x + x);
            if (allocation3.getType().getX() != ((sqrt + 1) * sqrt) / 2) {
                throw new RSRuntimeException("Invalid dimension for Ap");
            } else if (i2 <= 0 || i3 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else {
                int i4 = sqrt - 1;
                int i5 = (i4 * i3) + 1;
                if (allocation.getType().getX() == (i4 * i2) + 1 && allocation2.getType().getX() == i5) {
                    return sqrt;
                }
                throw new RSRuntimeException("Incorrect vector dimensions for SPR2");
            }
        }
    }

    static int validateSYMV(Element element, int i, Allocation allocation, Allocation allocation2, Allocation allocation3, int i2, int i3) {
        validateUplo(i);
        int y = allocation.getType().getY();
        if (allocation.getType().getX() != y) {
            throw new RSRuntimeException("A must be a square matrix for SYMV");
        } else if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element) || !allocation3.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1 || allocation3.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (i2 <= 0 || i3 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        } else {
            int i4 = y - 1;
            if (allocation2.getType().getX() != (i4 * i2) + 1) {
                throw new RSRuntimeException("Incorrect vector dimensions for SYMV");
            } else if (allocation3.getType().getX() == (i4 * i3) + 1) {
                return y;
            } else {
                throw new RSRuntimeException("Incorrect vector dimensions for SYMV");
            }
        }
    }

    static int validateSYR(Element element, int i, Allocation allocation, int i2, Allocation allocation2) {
        validateUplo(i);
        if (allocation2.getType().getElement().isCompatible(element) && allocation.getType().getElement().isCompatible(element)) {
            int x = allocation2.getType().getX();
            if (allocation.getType().getY() > 1) {
                throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
            } else if (x != allocation2.getType().getY()) {
                throw new RSRuntimeException("A must be a symmetric matrix");
            } else if (i2 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else if (allocation.getType().getX() == ((x - 1) * i2) + 1) {
                return x;
            } else {
                throw new RSRuntimeException("Incorrect vector dimensions for SYR");
            }
        }
        throw new RSRuntimeException("Called BLAS with wrong Element type");
    }

    static int validateSYR2(Element element, int i, Allocation allocation, int i2, Allocation allocation2, int i3, Allocation allocation3) {
        validateUplo(i);
        if (!allocation3.getType().getElement().isCompatible(element) || !allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation.getType().getY() > 1 || allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else {
            int x = allocation3.getType().getX();
            if (x != allocation3.getType().getY()) {
                throw new RSRuntimeException("A must be a symmetric matrix");
            } else if (i2 <= 0 || i3 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else {
                int i4 = x - 1;
                int i5 = (i4 * i3) + 1;
                if (allocation.getType().getX() == (i4 * i2) + 1 && allocation2.getType().getX() == i5) {
                    return x;
                }
                throw new RSRuntimeException("Incorrect vector dimensions for SYR");
            }
        }
    }

    static void validateSYR2K(Element element, int i, Allocation allocation, Allocation allocation2, Allocation allocation3) {
        validateTranspose(i);
        if (allocation.getType().getElement().isCompatible(element) && allocation2.getType().getElement().isCompatible(element) && allocation3.getType().getElement().isCompatible(element)) {
            int x;
            if (i == 112) {
                x = allocation.getType().getX();
            } else {
                x = allocation.getType().getY();
            }
            if (allocation3.getType().getX() != x || allocation3.getType().getY() != x) {
                throw new RSRuntimeException("Invalid symmetric matrix in SYR2K");
            } else if (allocation.getType().getX() != allocation2.getType().getX() || allocation.getType().getY() != allocation2.getType().getY()) {
                throw new RSRuntimeException("Invalid A and B in SYR2K");
            } else {
                return;
            }
        }
        throw new RSRuntimeException("Called BLAS with wrong Element type");
    }

    static void validateSide(int i) {
        if (i != 141 && i != 142) {
            throw new RSRuntimeException("Invalid side passed to BLAS");
        }
    }

    static int validateTPMV(Element element, int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTranspose(i2);
        validateUplo(i);
        validateDiag(i3);
        if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (allocation.getType().getY() > 1) {
            throw new RSRuntimeException("Ap must have a Y dimension of 0 or 1");
        } else {
            double x = (double) allocation.getType().getX();
            int sqrt = (int) Math.sqrt(x + x);
            if (allocation.getType().getX() != ((sqrt + 1) * sqrt) / 2) {
                throw new RSRuntimeException("Invalid dimension for Ap");
            } else if (i4 <= 0) {
                throw new RSRuntimeException("Vector increments must be greater than 0");
            } else if (allocation2.getType().getX() == ((sqrt - 1) * i4) + 1) {
                return sqrt;
            } else {
                throw new RSRuntimeException("Incorrect vector dimensions for TPMV");
            }
        }
    }

    static void validateTRMM(Element element, int i, int i2, Allocation allocation, Allocation allocation2) {
        validateSide(i);
        validateTranspose(i2);
        if (allocation.getType().getElement().isCompatible(element) && allocation2.getType().getElement().isCompatible(element)) {
            int y = allocation.getType().getY();
            int x = allocation.getType().getX();
            if (y != x) {
                throw new RSRuntimeException("Called TRMM with a non-symmetric matrix A");
            }
            int y2 = allocation2.getType().getY();
            int x2 = allocation2.getType().getX();
            if (i == 141) {
                if (x != y2) {
                    throw new RSRuntimeException("Called TRMM with invalid matrices");
                }
                return;
            } else if (x2 != y) {
                throw new RSRuntimeException("Called TRMM with invalid matrices");
            } else {
                return;
            }
        }
        throw new RSRuntimeException("Called BLAS with wrong Element type");
    }

    static void validateTRMV(Element element, int i, int i2, int i3, Allocation allocation, Allocation allocation2, int i4) {
        validateTranspose(i2);
        validateUplo(i);
        validateDiag(i3);
        int y = allocation.getType().getY();
        if (allocation.getType().getX() != y) {
            throw new RSRuntimeException("A must be a square matrix for TRMV");
        } else if (!allocation.getType().getElement().isCompatible(element) || !allocation2.getType().getElement().isCompatible(element)) {
            throw new RSRuntimeException("Called BLAS with wrong Element type");
        } else if (allocation2.getType().getY() > 1) {
            throw new RSRuntimeException("BLAS vectors must have Y dimension of 0 or 1");
        } else if (i4 <= 0) {
            throw new RSRuntimeException("Vector increments must be greater than 0");
        } else if (allocation2.getType().getX() != ((y - 1) * i4) + 1) {
            throw new RSRuntimeException("Incorrect vector dimensions for TRMV");
        }
    }

    static void validateTRSM(Element element, int i, int i2, Allocation allocation, Allocation allocation2) {
        validateSide(i);
        validateTranspose(i2);
        if (allocation.getType().getElement().isCompatible(element) && allocation2.getType().getElement().isCompatible(element)) {
            int x = allocation.getType().getX();
            if (x != allocation.getType().getY()) {
                throw new RSRuntimeException("Called TRSM with a non-symmetric matrix A");
            }
            int y = allocation2.getType().getY();
            int x2 = allocation2.getType().getX();
            if (i == 141) {
                if (x != y) {
                    throw new RSRuntimeException("Called TRSM with invalid matrix dimensions");
                }
                return;
            } else if (x != x2) {
                throw new RSRuntimeException("Called TRSM with invalid matrix dimensions");
            } else {
                return;
            }
        }
        throw new RSRuntimeException("Called BLAS with wrong Element type");
    }

    static void validateTranspose(int i) {
        if (i != 111 && i != 112 && i != 113) {
            throw new RSRuntimeException("Invalid transpose passed to BLAS");
        }
    }

    static void validateUplo(int i) {
        if (i != 121 && i != 122) {
            throw new RSRuntimeException("Invalid uplo passed to BLAS");
        }
    }
}
