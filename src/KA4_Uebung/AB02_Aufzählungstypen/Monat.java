package KA4_Uebung.AB02_Aufzählungstypen;

public enum Monat {

    DEZ(Jahreszeit.WINTER, 31),JAN(Jahreszeit.WINTER,31),FEB(Jahreszeit.WINTER,28),
    MAE(Jahreszeit.FRUELING, 31),APR(Jahreszeit.FRUELING, 30),MAI(Jahreszeit.FRUELING, 31),
    JUN(Jahreszeit.SOMMER ,30), JUL(Jahreszeit.SOMMER, 31), AUG(Jahreszeit.SOMMER, 31),
    SEP(Jahreszeit.HERBST, 30), OKT(Jahreszeit.HERBST, 31), NOV(Jahreszeit.HERBST, 30);

    Jahreszeit jz;
    int tage;

    Monat(Jahreszeit jz, int tage) {
        this.jz = jz;
        this.tage = tage;
    }
}
