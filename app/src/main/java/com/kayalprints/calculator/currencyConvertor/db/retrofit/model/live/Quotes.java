
package com.kayalprints.calculator.currencyConvertor.db.retrofit.model.live;

import androidx.room.Ignore;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Quotes {

    @SerializedName("USDAED")
    @Expose
    private Double usdaed;
    @SerializedName("USDAFN")
    @Expose
    private Double usdafn;
    @SerializedName("USDALL")
    @Expose
    private Double usdall;
    @SerializedName("USDAMD")
    @Expose
    private Double usdamd;
    @SerializedName("USDANG")
    @Expose
    private Double usdang;
    @SerializedName("USDAOA")
    @Expose
    private Double usdaoa;
    @SerializedName("USDARS")
    @Expose
    private Double usdars;
    @SerializedName("USDAUD")
    @Expose
    private Double usdaud;
    @SerializedName("USDAWG")
    @Expose
    private Double usdawg;
    @SerializedName("USDAZN")
    @Expose
    private Double usdazn;
    @SerializedName("USDBAM")
    @Expose
    private Double usdbam;
    @SerializedName("USDBBD")
    @Expose
    private Double usdbbd;
    @SerializedName("USDBDT")
    @Expose
    private Double usdbdt;
    @SerializedName("USDBGN")
    @Expose
    private Double usdbgn;
    @SerializedName("USDBHD")
    @Expose
    private Double usdbhd;
    @SerializedName("USDBIF")
    @Expose
    private Double usdbif;
    @SerializedName("USDBMD")
    @Expose
    private Integer usdbmd;
    @SerializedName("USDBND")
    @Expose
    private Double usdbnd;
    @SerializedName("USDBOB")
    @Expose
    private Double usdbob;
    @SerializedName("USDBRL")
    @Expose
    private Double usdbrl;
    @SerializedName("USDBSD")
    @Expose
    private Double usdbsd;
    @SerializedName("USDBTC")
    @Expose
    private Double usdbtc;
    @SerializedName("USDBTN")
    @Expose
    private Double usdbtn;
    @SerializedName("USDBWP")
    @Expose
    private Double usdbwp;
    @SerializedName("USDBYN")
    @Expose
    private Double usdbyn;
    @SerializedName("USDBYR")
    @Expose
    private Integer usdbyr;
    @SerializedName("USDBZD")
    @Expose
    private Double usdbzd;
    @SerializedName("USDCAD")
    @Expose
    private Double usdcad;
    @SerializedName("USDCDF")
    @Expose
    private Double usdcdf;
    @SerializedName("USDCHF")
    @Expose
    private Double usdchf;
    @SerializedName("USDCLF")
    @Expose
    private Double usdclf;
    @SerializedName("USDCLP")
    @Expose
    private Double usdclp;
    @SerializedName("USDCNY")
    @Expose
    private Double usdcny;
    @SerializedName("USDCOP")
    @Expose
    private Double usdcop;
    @SerializedName("USDCRC")
    @Expose
    private Double usdcrc;
    @SerializedName("USDCUC")
    @Expose
    private Integer usdcuc;
    @SerializedName("USDCUP")
    @Expose
    private Double usdcup;
    @SerializedName("USDCVE")
    @Expose
    private Double usdcve;
    @SerializedName("USDCZK")
    @Expose
    private Double usdczk;
    @SerializedName("USDDJF")
    @Expose
    private Double usddjf;
    @SerializedName("USDDKK")
    @Expose
    private Double usddkk;
    @SerializedName("USDDOP")
    @Expose
    private Double usddop;
    @SerializedName("USDDZD")
    @Expose
    private Double usddzd;
    @SerializedName("USDEGP")
    @Expose
    private Double usdegp;
    @SerializedName("USDERN")
    @Expose
    private Integer usdern;
    @SerializedName("USDETB")
    @Expose
    private Double usdetb;
    @SerializedName("USDEUR")
    @Expose
    private Double usdeur;
    @SerializedName("USDFJD")
    @Expose
    private Double usdfjd;
    @SerializedName("USDFKP")
    @Expose
    private Double usdfkp;
    @SerializedName("USDGBP")
    @Expose
    private Double usdgbp;
    @SerializedName("USDGEL")
    @Expose
    private Double usdgel;
    @SerializedName("USDGGP")
    @Expose
    private Double usdggp;
    @SerializedName("USDGHS")
    @Expose
    private Double usdghs;
    @SerializedName("USDGIP")
    @Expose
    private Double usdgip;
    @SerializedName("USDGMD")
    @Expose
    private Double usdgmd;
    @SerializedName("USDGNF")
    @Expose
    private Double usdgnf;
    @SerializedName("USDGTQ")
    @Expose
    private Double usdgtq;
    @SerializedName("USDGYD")
    @Expose
    private Double usdgyd;
    @SerializedName("USDHKD")
    @Expose
    private Double usdhkd;
    @SerializedName("USDHNL")
    @Expose
    private Double usdhnl;
    @SerializedName("USDHRK")
    @Expose
    private Double usdhrk;
    @SerializedName("USDHTG")
    @Expose
    private Double usdhtg;
    @SerializedName("USDHUF")
    @Expose
    private Double usdhuf;
    @SerializedName("USDIDR")
    @Expose
    private Double usdidr;
    @SerializedName("USDILS")
    @Expose
    private Double usdils;
    @SerializedName("USDIMP")
    @Expose
    private Double usdimp;
    @SerializedName("USDINR")
    @Expose
    private Double usdinr;
    @SerializedName("USDIQD")
    @Expose
    private Double usdiqd;
    @SerializedName("USDIRR")
    @Expose
    private Double usdirr;
    @SerializedName("USDISK")
    @Expose
    private Double usdisk;
    @SerializedName("USDJEP")
    @Expose
    private Double usdjep;
    @SerializedName("USDJMD")
    @Expose
    private Double usdjmd;
    @SerializedName("USDJOD")
    @Expose
    private Double usdjod;
    @SerializedName("USDJPY")
    @Expose
    private Double usdjpy;
    @SerializedName("USDKES")
    @Expose
    private Double usdkes;
    @SerializedName("USDKGS")
    @Expose
    private Double usdkgs;
    @SerializedName("USDKHR")
    @Expose
    private Double usdkhr;
    @SerializedName("USDKMF")
    @Expose
    private Double usdkmf;
    @SerializedName("USDKPW")
    @Expose
    private Double usdkpw;
    @SerializedName("USDKRW")
    @Expose
    private Double usdkrw;
    @SerializedName("USDKWD")
    @Expose
    private Double usdkwd;
    @SerializedName("USDKYD")
    @Expose
    private Double usdkyd;
    @SerializedName("USDKZT")
    @Expose
    private Double usdkzt;
    @SerializedName("USDLAK")
    @Expose
    private Double usdlak;
    @SerializedName("USDLBP")
    @Expose
    private Double usdlbp;
    @SerializedName("USDLKR")
    @Expose
    private Double usdlkr;
    @SerializedName("USDLRD")
    @Expose
    private Double usdlrd;
    @SerializedName("USDLSL")
    @Expose
    private Double usdlsl;
    @SerializedName("USDLTL")
    @Expose
    private Double usdltl;
    @SerializedName("USDLVL")
    @Expose
    private Double usdlvl;
    @SerializedName("USDLYD")
    @Expose
    private Double usdlyd;
    @SerializedName("USDMAD")
    @Expose
    private Double usdmad;
    @SerializedName("USDMDL")
    @Expose
    private Double usdmdl;
    @SerializedName("USDMGA")
    @Expose
    private Double usdmga;
    @SerializedName("USDMKD")
    @Expose
    private Double usdmkd;
    @SerializedName("USDMMK")
    @Expose
    private Double usdmmk;
    @SerializedName("USDMNT")
    @Expose
    private Double usdmnt;
    @SerializedName("USDMOP")
    @Expose
    private Double usdmop;
    @SerializedName("USDMRO")
    @Expose
    private Double usdmro;
    @SerializedName("USDMUR")
    @Expose
    private Double usdmur;
    @SerializedName("USDMVR")
    @Expose
    private Double usdmvr;
    @SerializedName("USDMWK")
    @Expose
    private Double usdmwk;
    @SerializedName("USDMXN")
    @Expose
    private Double usdmxn;
    @SerializedName("USDMYR")
    @Expose
    private Double usdmyr;
    @SerializedName("USDMZN")
    @Expose
    private Double usdmzn;
    @SerializedName("USDNAD")
    @Expose
    private Double usdnad;
    @SerializedName("USDNGN")
    @Expose
    private Double usdngn;
    @SerializedName("USDNIO")
    @Expose
    private Double usdnio;
    @SerializedName("USDNOK")
    @Expose
    private Double usdnok;
    @SerializedName("USDNPR")
    @Expose
    private Double usdnpr;
    @SerializedName("USDNZD")
    @Expose
    private Double usdnzd;
    @SerializedName("USDOMR")
    @Expose
    private Double usdomr;
    @SerializedName("USDPAB")
    @Expose
    private Double usdpab;
    @SerializedName("USDPEN")
    @Expose
    private Double usdpen;
    @SerializedName("USDPGK")
    @Expose
    private Double usdpgk;
    @SerializedName("USDPHP")
    @Expose
    private Double usdphp;
    @SerializedName("USDPKR")
    @Expose
    private Double usdpkr;
    @SerializedName("USDPLN")
    @Expose
    private Double usdpln;
    @SerializedName("USDPYG")
    @Expose
    private Double usdpyg;
    @SerializedName("USDQAR")
    @Expose
    private Double usdqar;
    @SerializedName("USDRON")
    @Expose
    private Double usdron;
    @SerializedName("USDRSD")
    @Expose
    private Double usdrsd;
    @SerializedName("USDRUB")
    @Expose
    private Double usdrub;
    @SerializedName("USDRWF")
    @Expose
    private Double usdrwf;
    @SerializedName("USDSAR")
    @Expose
    private Double usdsar;
    @SerializedName("USDSBD")
    @Expose
    private Double usdsbd;
    @SerializedName("USDSCR")
    @Expose
    private Double usdscr;
    @SerializedName("USDSDG")
    @Expose
    private Double usdsdg;
    @SerializedName("USDSEK")
    @Expose
    private Double usdsek;
    @SerializedName("USDSGD")
    @Expose
    private Double usdsgd;
    @SerializedName("USDSHP")
    @Expose
    private Double usdshp;
    @SerializedName("USDSLE")
    @Expose
    private Double usdsle;
    @SerializedName("USDSLL")
    @Expose
    private Double usdsll;
    @SerializedName("USDSOS")
    @Expose
    private Double usdsos;
    @SerializedName("USDSRD")
    @Expose
    private Double usdsrd;
    @SerializedName("USDSTD")
    @Expose
    private Double usdstd;
    @SerializedName("USDSVC")
    @Expose
    private Double usdsvc;
    @SerializedName("USDSYP")
    @Expose
    private Double usdsyp;
    @SerializedName("USDSZL")
    @Expose
    private Double usdszl;
    @SerializedName("USDTHB")
    @Expose
    private Double usdthb;
    @SerializedName("USDTJS")
    @Expose
    private Double usdtjs;
    @SerializedName("USDTMT")
    @Expose
    private Double usdtmt;
    @SerializedName("USDTND")
    @Expose
    private Double usdtnd;
    @SerializedName("USDTOP")
    @Expose
    private Double usdtop;
    @SerializedName("USDTRY")
    @Expose
    private Double usdtry;
    @SerializedName("USDTTD")
    @Expose
    private Double usdttd;
    @SerializedName("USDTWD")
    @Expose
    private Double usdtwd;
    @SerializedName("USDTZS")
    @Expose
    private Double usdtzs;
    @SerializedName("USDUAH")
    @Expose
    private Double usduah;
    @SerializedName("USDUGX")
    @Expose
    private Double usdugx;
    @SerializedName("USDUYU")
    @Expose
    private Double usduyu;
    @SerializedName("USDUZS")
    @Expose
    private Double usduzs;
    @SerializedName("USDVEF")
    @Expose
    private Double usdvef;
    @SerializedName("USDVES")
    @Expose
    private Double usdves;
    @SerializedName("USDVND")
    @Expose
    private Double usdvnd;
    @SerializedName("USDVUV")
    @Expose
    private Double usdvuv;
    @SerializedName("USDWST")
    @Expose
    private Double usdwst;
    @SerializedName("USDXAF")
    @Expose
    private Double usdxaf;
    @SerializedName("USDXAG")
    @Expose
    private Double usdxag;
    @SerializedName("USDXAU")
    @Expose
    private Double usdxau;
    @SerializedName("USDXCD")
    @Expose
    private Double usdxcd;
    @SerializedName("USDXDR")
    @Expose
    private Double usdxdr;
    @SerializedName("USDXOF")
    @Expose
    private Double usdxof;
    @SerializedName("USDXPF")
    @Expose
    private Double usdxpf;
    @SerializedName("USDYER")
    @Expose
    private Double usdyer;
    @SerializedName("USDZAR")
    @Expose
    private Double usdzar;
    @SerializedName("USDZMK")
    @Expose
    private Double usdzmk;
    @SerializedName("USDZMW")
    @Expose
    private Double usdzmw;
    @SerializedName("USDZWL")
    @Expose
    private Double usdzwl;

    public Double getUsdaed() {
        return usdaed;
    }

    public void setUsdaed(Double usdaed) {
        this.usdaed = usdaed;
    }

    public Double getUsdafn() {
        return usdafn;
    }

    public void setUsdafn(Double usdafn) {
        this.usdafn = usdafn;
    }

    public Double getUsdall() {
        return usdall;
    }

    public void setUsdall(Double usdall) {
        this.usdall = usdall;
    }

    public Double getUsdamd() {
        return usdamd;
    }

    public void setUsdamd(Double usdamd) {
        this.usdamd = usdamd;
    }

    public Double getUsdang() {
        return usdang;
    }

    public void setUsdang(Double usdang) {
        this.usdang = usdang;
    }

    public Double getUsdaoa() {
        return usdaoa;
    }

    public void setUsdaoa(Double usdaoa) {
        this.usdaoa = usdaoa;
    }

    public Double getUsdars() {
        return usdars;
    }

    public void setUsdars(Double usdars) {
        this.usdars = usdars;
    }

    public Double getUsdaud() {
        return usdaud;
    }

    public void setUsdaud(Double usdaud) {
        this.usdaud = usdaud;
    }

    public Double getUsdawg() {
        return usdawg;
    }

    public void setUsdawg(Double usdawg) {
        this.usdawg = usdawg;
    }

    public Double getUsdazn() {
        return usdazn;
    }

    public void setUsdazn(Double usdazn) {
        this.usdazn = usdazn;
    }

    public Double getUsdbam() {
        return usdbam;
    }

    public void setUsdbam(Double usdbam) {
        this.usdbam = usdbam;
    }

    public Double getUsdbbd() {
        return usdbbd;
    }

    public void setUsdbbd(Double usdbbd) {
        this.usdbbd = usdbbd;
    }

    public Double getUsdbdt() {
        return usdbdt;
    }

    public void setUsdbdt(Double usdbdt) {
        this.usdbdt = usdbdt;
    }

    public Double getUsdbgn() {
        return usdbgn;
    }

    public void setUsdbgn(Double usdbgn) {
        this.usdbgn = usdbgn;
    }

    public Double getUsdbhd() {
        return usdbhd;
    }

    public void setUsdbhd(Double usdbhd) {
        this.usdbhd = usdbhd;
    }

    public Double getUsdbif() {
        return usdbif;
    }

    public void setUsdbif(Double usdbif) {
        this.usdbif = usdbif;
    }

    public Integer getUsdbmd() {
        return usdbmd;
    }

    public void setUsdbmd(Integer usdbmd) {
        this.usdbmd = usdbmd;
    }

    public Double getUsdbnd() {
        return usdbnd;
    }

    public void setUsdbnd(Double usdbnd) {
        this.usdbnd = usdbnd;
    }

    public Double getUsdbob() {
        return usdbob;
    }

    public void setUsdbob(Double usdbob) {
        this.usdbob = usdbob;
    }

    public Double getUsdbrl() {
        return usdbrl;
    }

    public void setUsdbrl(Double usdbrl) {
        this.usdbrl = usdbrl;
    }

    public Double getUsdbsd() {
        return usdbsd;
    }

    public void setUsdbsd(Double usdbsd) {
        this.usdbsd = usdbsd;
    }

    public Double getUsdbtc() {
        return usdbtc;
    }

    public void setUsdbtc(Double usdbtc) {
        this.usdbtc = usdbtc;
    }

    public Double getUsdbtn() {
        return usdbtn;
    }

    public void setUsdbtn(Double usdbtn) {
        this.usdbtn = usdbtn;
    }

    public Double getUsdbwp() {
        return usdbwp;
    }

    public void setUsdbwp(Double usdbwp) {
        this.usdbwp = usdbwp;
    }

    public Double getUsdbyn() {
        return usdbyn;
    }

    public void setUsdbyn(Double usdbyn) {
        this.usdbyn = usdbyn;
    }

    public Integer getUsdbyr() {
        return usdbyr;
    }

    public void setUsdbyr(Integer usdbyr) {
        this.usdbyr = usdbyr;
    }

    public Double getUsdbzd() {
        return usdbzd;
    }

    public void setUsdbzd(Double usdbzd) {
        this.usdbzd = usdbzd;
    }

    public Double getUsdcad() {
        return usdcad;
    }

    public void setUsdcad(Double usdcad) {
        this.usdcad = usdcad;
    }

    public Double getUsdcdf() {
        return usdcdf;
    }

    public void setUsdcdf(Double usdcdf) {
        this.usdcdf = usdcdf;
    }

    public Double getUsdchf() {
        return usdchf;
    }

    public void setUsdchf(Double usdchf) {
        this.usdchf = usdchf;
    }

    public Double getUsdclf() {
        return usdclf;
    }

    public void setUsdclf(Double usdclf) {
        this.usdclf = usdclf;
    }

    public Double getUsdclp() {
        return usdclp;
    }

    public void setUsdclp(Double usdclp) {
        this.usdclp = usdclp;
    }

    public Double getUsdcny() {
        return usdcny;
    }

    public void setUsdcny(Double usdcny) {
        this.usdcny = usdcny;
    }

    public Double getUsdcop() {
        return usdcop;
    }

    public void setUsdcop(Double usdcop) {
        this.usdcop = usdcop;
    }

    public Double getUsdcrc() {
        return usdcrc;
    }

    public void setUsdcrc(Double usdcrc) {
        this.usdcrc = usdcrc;
    }

    public Integer getUsdcuc() {
        return usdcuc;
    }

    public void setUsdcuc(Integer usdcuc) {
        this.usdcuc = usdcuc;
    }

    public Double getUsdcup() {
        return usdcup;
    }

    public void setUsdcup(Double usdcup) {
        this.usdcup = usdcup;
    }

    public Double getUsdcve() {
        return usdcve;
    }

    public void setUsdcve(Double usdcve) {
        this.usdcve = usdcve;
    }

    public Double getUsdczk() {
        return usdczk;
    }

    public void setUsdczk(Double usdczk) {
        this.usdczk = usdczk;
    }

    public Double getUsddjf() {
        return usddjf;
    }

    public void setUsddjf(Double usddjf) {
        this.usddjf = usddjf;
    }

    public Double getUsddkk() {
        return usddkk;
    }

    public void setUsddkk(Double usddkk) {
        this.usddkk = usddkk;
    }

    public Double getUsddop() {
        return usddop;
    }

    public void setUsddop(Double usddop) {
        this.usddop = usddop;
    }

    public Double getUsddzd() {
        return usddzd;
    }

    public void setUsddzd(Double usddzd) {
        this.usddzd = usddzd;
    }

    public Double getUsdegp() {
        return usdegp;
    }

    public void setUsdegp(Double usdegp) {
        this.usdegp = usdegp;
    }

    public Integer getUsdern() {
        return usdern;
    }

    public void setUsdern(Integer usdern) {
        this.usdern = usdern;
    }

    public Double getUsdetb() {
        return usdetb;
    }

    public void setUsdetb(Double usdetb) {
        this.usdetb = usdetb;
    }

    public Double getUsdeur() {
        return usdeur;
    }

    public void setUsdeur(Double usdeur) {
        this.usdeur = usdeur;
    }

    public Double getUsdfjd() {
        return usdfjd;
    }

    public void setUsdfjd(Double usdfjd) {
        this.usdfjd = usdfjd;
    }

    public Double getUsdfkp() {
        return usdfkp;
    }

    public void setUsdfkp(Double usdfkp) {
        this.usdfkp = usdfkp;
    }

    public Double getUsdgbp() {
        return usdgbp;
    }

    public void setUsdgbp(Double usdgbp) {
        this.usdgbp = usdgbp;
    }

    public Double getUsdgel() {
        return usdgel;
    }

    public void setUsdgel(Double usdgel) {
        this.usdgel = usdgel;
    }

    public Double getUsdggp() {
        return usdggp;
    }

    public void setUsdggp(Double usdggp) {
        this.usdggp = usdggp;
    }

    public Double getUsdghs() {
        return usdghs;
    }

    public void setUsdghs(Double usdghs) {
        this.usdghs = usdghs;
    }

    public Double getUsdgip() {
        return usdgip;
    }

    public void setUsdgip(Double usdgip) {
        this.usdgip = usdgip;
    }

    public Double getUsdgmd() {
        return usdgmd;
    }

    public void setUsdgmd(Double usdgmd) {
        this.usdgmd = usdgmd;
    }

    public Double getUsdgnf() {
        return usdgnf;
    }

    public void setUsdgnf(Double usdgnf) {
        this.usdgnf = usdgnf;
    }

    public Double getUsdgtq() {
        return usdgtq;
    }

    public void setUsdgtq(Double usdgtq) {
        this.usdgtq = usdgtq;
    }

    public Double getUsdgyd() {
        return usdgyd;
    }

    public void setUsdgyd(Double usdgyd) {
        this.usdgyd = usdgyd;
    }

    public Double getUsdhkd() {
        return usdhkd;
    }

    public void setUsdhkd(Double usdhkd) {
        this.usdhkd = usdhkd;
    }

    public Double getUsdhnl() {
        return usdhnl;
    }

    public void setUsdhnl(Double usdhnl) {
        this.usdhnl = usdhnl;
    }

    public Double getUsdhrk() {
        return usdhrk;
    }

    public void setUsdhrk(Double usdhrk) {
        this.usdhrk = usdhrk;
    }

    public Double getUsdhtg() {
        return usdhtg;
    }

    public void setUsdhtg(Double usdhtg) {
        this.usdhtg = usdhtg;
    }

    public Double getUsdhuf() {
        return usdhuf;
    }

    public void setUsdhuf(Double usdhuf) {
        this.usdhuf = usdhuf;
    }

    public Double getUsdidr() {
        return usdidr;
    }

    public void setUsdidr(Double usdidr) {
        this.usdidr = usdidr;
    }

    public Double getUsdils() {
        return usdils;
    }

    public void setUsdils(Double usdils) {
        this.usdils = usdils;
    }

    public Double getUsdimp() {
        return usdimp;
    }

    public void setUsdimp(Double usdimp) {
        this.usdimp = usdimp;
    }

    public Double getUsdinr() {
        return usdinr;
    }

    public void setUsdinr(Double usdinr) {
        this.usdinr = usdinr;
    }

    public Double getUsdiqd() {
        return usdiqd;
    }

    public void setUsdiqd(Double usdiqd) {
        this.usdiqd = usdiqd;
    }

    public Double getUsdirr() {
        return usdirr;
    }

    public void setUsdirr(Double usdirr) {
        this.usdirr = usdirr;
    }

    public Double getUsdisk() {
        return usdisk;
    }

    public void setUsdisk(Double usdisk) {
        this.usdisk = usdisk;
    }

    public Double getUsdjep() {
        return usdjep;
    }

    public void setUsdjep(Double usdjep) {
        this.usdjep = usdjep;
    }

    public Double getUsdjmd() {
        return usdjmd;
    }

    public void setUsdjmd(Double usdjmd) {
        this.usdjmd = usdjmd;
    }

    public Double getUsdjod() {
        return usdjod;
    }

    public void setUsdjod(Double usdjod) {
        this.usdjod = usdjod;
    }

    public Double getUsdjpy() {
        return usdjpy;
    }

    public void setUsdjpy(Double usdjpy) {
        this.usdjpy = usdjpy;
    }

    public Double getUsdkes() {
        return usdkes;
    }

    public void setUsdkes(Double usdkes) {
        this.usdkes = usdkes;
    }

    public Double getUsdkgs() {
        return usdkgs;
    }

    public void setUsdkgs(Double usdkgs) {
        this.usdkgs = usdkgs;
    }

    public Double getUsdkhr() {
        return usdkhr;
    }

    public void setUsdkhr(Double usdkhr) {
        this.usdkhr = usdkhr;
    }

    public Double getUsdkmf() {
        return usdkmf;
    }

    public void setUsdkmf(Double usdkmf) {
        this.usdkmf = usdkmf;
    }

    public Double getUsdkpw() {
        return usdkpw;
    }

    public void setUsdkpw(Double usdkpw) {
        this.usdkpw = usdkpw;
    }

    public Double getUsdkrw() {
        return usdkrw;
    }

    public void setUsdkrw(Double usdkrw) {
        this.usdkrw = usdkrw;
    }

    public Double getUsdkwd() {
        return usdkwd;
    }

    public void setUsdkwd(Double usdkwd) {
        this.usdkwd = usdkwd;
    }

    public Double getUsdkyd() {
        return usdkyd;
    }

    public void setUsdkyd(Double usdkyd) {
        this.usdkyd = usdkyd;
    }

    public Double getUsdkzt() {
        return usdkzt;
    }

    public void setUsdkzt(Double usdkzt) {
        this.usdkzt = usdkzt;
    }

    public Double getUsdlak() {
        return usdlak;
    }

    public void setUsdlak(Double usdlak) {
        this.usdlak = usdlak;
    }

    public Double getUsdlbp() {
        return usdlbp;
    }

    public void setUsdlbp(Double usdlbp) {
        this.usdlbp = usdlbp;
    }

    public Double getUsdlkr() {
        return usdlkr;
    }

    public void setUsdlkr(Double usdlkr) {
        this.usdlkr = usdlkr;
    }

    public Double getUsdlrd() {
        return usdlrd;
    }

    public void setUsdlrd(Double usdlrd) {
        this.usdlrd = usdlrd;
    }

    public Double getUsdlsl() {
        return usdlsl;
    }

    public void setUsdlsl(Double usdlsl) {
        this.usdlsl = usdlsl;
    }

    public Double getUsdltl() {
        return usdltl;
    }

    public void setUsdltl(Double usdltl) {
        this.usdltl = usdltl;
    }

    public Double getUsdlvl() {
        return usdlvl;
    }

    public void setUsdlvl(Double usdlvl) {
        this.usdlvl = usdlvl;
    }

    public Double getUsdlyd() {
        return usdlyd;
    }

    public void setUsdlyd(Double usdlyd) {
        this.usdlyd = usdlyd;
    }

    public Double getUsdmad() {
        return usdmad;
    }

    public void setUsdmad(Double usdmad) {
        this.usdmad = usdmad;
    }

    public Double getUsdmdl() {
        return usdmdl;
    }

    public void setUsdmdl(Double usdmdl) {
        this.usdmdl = usdmdl;
    }

    public Double getUsdmga() {
        return usdmga;
    }

    public void setUsdmga(Double usdmga) {
        this.usdmga = usdmga;
    }

    public Double getUsdmkd() {
        return usdmkd;
    }

    public void setUsdmkd(Double usdmkd) {
        this.usdmkd = usdmkd;
    }

    public Double getUsdmmk() {
        return usdmmk;
    }

    public void setUsdmmk(Double usdmmk) {
        this.usdmmk = usdmmk;
    }

    public Double getUsdmnt() {
        return usdmnt;
    }

    public void setUsdmnt(Double usdmnt) {
        this.usdmnt = usdmnt;
    }

    public Double getUsdmop() {
        return usdmop;
    }

    public void setUsdmop(Double usdmop) {
        this.usdmop = usdmop;
    }

    public Double getUsdmro() {
        return usdmro;
    }

    public void setUsdmro(Double usdmro) {
        this.usdmro = usdmro;
    }

    public Double getUsdmur() {
        return usdmur;
    }

    public void setUsdmur(Double usdmur) {
        this.usdmur = usdmur;
    }

    public Double getUsdmvr() {
        return usdmvr;
    }

    public void setUsdmvr(Double usdmvr) {
        this.usdmvr = usdmvr;
    }

    public Double getUsdmwk() {
        return usdmwk;
    }

    public void setUsdmwk(Double usdmwk) {
        this.usdmwk = usdmwk;
    }

    public Double getUsdmxn() {
        return usdmxn;
    }

    public void setUsdmxn(Double usdmxn) {
        this.usdmxn = usdmxn;
    }

    public Double getUsdmyr() {
        return usdmyr;
    }

    public void setUsdmyr(Double usdmyr) {
        this.usdmyr = usdmyr;
    }

    public Double getUsdmzn() {
        return usdmzn;
    }

    public void setUsdmzn(Double usdmzn) {
        this.usdmzn = usdmzn;
    }

    public Double getUsdnad() {
        return usdnad;
    }

    public void setUsdnad(Double usdnad) {
        this.usdnad = usdnad;
    }

    public Double getUsdngn() {
        return usdngn;
    }

    public void setUsdngn(Double usdngn) {
        this.usdngn = usdngn;
    }

    public Double getUsdnio() {
        return usdnio;
    }

    public void setUsdnio(Double usdnio) {
        this.usdnio = usdnio;
    }

    public Double getUsdnok() {
        return usdnok;
    }

    public void setUsdnok(Double usdnok) {
        this.usdnok = usdnok;
    }

    public Double getUsdnpr() {
        return usdnpr;
    }

    public void setUsdnpr(Double usdnpr) {
        this.usdnpr = usdnpr;
    }

    public Double getUsdnzd() {
        return usdnzd;
    }

    public void setUsdnzd(Double usdnzd) {
        this.usdnzd = usdnzd;
    }

    public Double getUsdomr() {
        return usdomr;
    }

    public void setUsdomr(Double usdomr) {
        this.usdomr = usdomr;
    }

    public Double getUsdpab() {
        return usdpab;
    }

    public void setUsdpab(Double usdpab) {
        this.usdpab = usdpab;
    }

    public Double getUsdpen() {
        return usdpen;
    }

    public void setUsdpen(Double usdpen) {
        this.usdpen = usdpen;
    }

    public Double getUsdpgk() {
        return usdpgk;
    }

    public void setUsdpgk(Double usdpgk) {
        this.usdpgk = usdpgk;
    }

    public Double getUsdphp() {
        return usdphp;
    }

    public void setUsdphp(Double usdphp) {
        this.usdphp = usdphp;
    }

    public Double getUsdpkr() {
        return usdpkr;
    }

    public void setUsdpkr(Double usdpkr) {
        this.usdpkr = usdpkr;
    }

    public Double getUsdpln() {
        return usdpln;
    }

    public void setUsdpln(Double usdpln) {
        this.usdpln = usdpln;
    }

    public Double getUsdpyg() {
        return usdpyg;
    }

    public void setUsdpyg(Double usdpyg) {
        this.usdpyg = usdpyg;
    }

    public Double getUsdqar() {
        return usdqar;
    }

    public void setUsdqar(Double usdqar) {
        this.usdqar = usdqar;
    }

    public Double getUsdron() {
        return usdron;
    }

    public void setUsdron(Double usdron) {
        this.usdron = usdron;
    }

    public Double getUsdrsd() {
        return usdrsd;
    }

    public void setUsdrsd(Double usdrsd) {
        this.usdrsd = usdrsd;
    }

    public Double getUsdrub() {
        return usdrub;
    }

    public void setUsdrub(Double usdrub) {
        this.usdrub = usdrub;
    }

    public Double getUsdrwf() {
        return usdrwf;
    }

    public void setUsdrwf(Double usdrwf) {
        this.usdrwf = usdrwf;
    }

    public Double getUsdsar() {
        return usdsar;
    }

    public void setUsdsar(Double usdsar) {
        this.usdsar = usdsar;
    }

    public Double getUsdsbd() {
        return usdsbd;
    }

    public void setUsdsbd(Double usdsbd) {
        this.usdsbd = usdsbd;
    }

    public Double getUsdscr() {
        return usdscr;
    }

    public void setUsdscr(Double usdscr) {
        this.usdscr = usdscr;
    }

    public Double getUsdsdg() {
        return usdsdg;
    }

    public void setUsdsdg(Double usdsdg) {
        this.usdsdg = usdsdg;
    }

    public Double getUsdsek() {
        return usdsek;
    }

    public void setUsdsek(Double usdsek) {
        this.usdsek = usdsek;
    }

    public Double getUsdsgd() {
        return usdsgd;
    }

    public void setUsdsgd(Double usdsgd) {
        this.usdsgd = usdsgd;
    }

    public Double getUsdshp() {
        return usdshp;
    }

    public void setUsdshp(Double usdshp) {
        this.usdshp = usdshp;
    }

    public Double getUsdsle() {
        return usdsle;
    }

    public void setUsdsle(Double usdsle) {
        this.usdsle = usdsle;
    }

    public Double getUsdsll() {
        return usdsll;
    }

    public void setUsdsll(Double usdsll) {
        this.usdsll = usdsll;
    }

    public Double getUsdsos() {
        return usdsos;
    }

    public void setUsdsos(Double usdsos) {
        this.usdsos = usdsos;
    }

    public Double getUsdsrd() {
        return usdsrd;
    }

    public void setUsdsrd(Double usdsrd) {
        this.usdsrd = usdsrd;
    }

    public Double getUsdstd() {
        return usdstd;
    }

    public void setUsdstd(Double usdstd) {
        this.usdstd = usdstd;
    }

    public Double getUsdsvc() {
        return usdsvc;
    }

    public void setUsdsvc(Double usdsvc) {
        this.usdsvc = usdsvc;
    }

    public Double getUsdsyp() {
        return usdsyp;
    }

    public void setUsdsyp(Double usdsyp) {
        this.usdsyp = usdsyp;
    }

    public Double getUsdszl() {
        return usdszl;
    }

    public void setUsdszl(Double usdszl) {
        this.usdszl = usdszl;
    }

    public Double getUsdthb() {
        return usdthb;
    }

    public void setUsdthb(Double usdthb) {
        this.usdthb = usdthb;
    }

    public Double getUsdtjs() {
        return usdtjs;
    }

    public void setUsdtjs(Double usdtjs) {
        this.usdtjs = usdtjs;
    }

    public Double getUsdtmt() {
        return usdtmt;
    }

    public void setUsdtmt(Double usdtmt) {
        this.usdtmt = usdtmt;
    }

    public Double getUsdtnd() {
        return usdtnd;
    }

    public void setUsdtnd(Double usdtnd) {
        this.usdtnd = usdtnd;
    }

    public Double getUsdtop() {
        return usdtop;
    }

    public void setUsdtop(Double usdtop) {
        this.usdtop = usdtop;
    }

    public Double getUsdtry() {
        return usdtry;
    }

    public void setUsdtry(Double usdtry) {
        this.usdtry = usdtry;
    }

    public Double getUsdttd() {
        return usdttd;
    }

    public void setUsdttd(Double usdttd) {
        this.usdttd = usdttd;
    }

    public Double getUsdtwd() {
        return usdtwd;
    }

    public void setUsdtwd(Double usdtwd) {
        this.usdtwd = usdtwd;
    }

    public Double getUsdtzs() {
        return usdtzs;
    }

    public void setUsdtzs(Double usdtzs) {
        this.usdtzs = usdtzs;
    }

    public Double getUsduah() {
        return usduah;
    }

    public void setUsduah(Double usduah) {
        this.usduah = usduah;
    }

    public Double getUsdugx() {
        return usdugx;
    }

    public void setUsdugx(Double usdugx) {
        this.usdugx = usdugx;
    }

    public Double getUsduyu() {
        return usduyu;
    }

    public void setUsduyu(Double usduyu) {
        this.usduyu = usduyu;
    }

    public Double getUsduzs() {
        return usduzs;
    }

    public void setUsduzs(Double usduzs) {
        this.usduzs = usduzs;
    }

    public Double getUsdvef() {
        return usdvef;
    }

    public void setUsdvef(Double usdvef) {
        this.usdvef = usdvef;
    }

    public Double getUsdves() {
        return usdves;
    }

    public void setUsdves(Double usdves) {
        this.usdves = usdves;
    }

    public Double getUsdvnd() {
        return usdvnd;
    }

    public void setUsdvnd(Double usdvnd) {
        this.usdvnd = usdvnd;
    }

    public Double getUsdvuv() {
        return usdvuv;
    }

    public void setUsdvuv(Double usdvuv) {
        this.usdvuv = usdvuv;
    }

    public Double getUsdwst() {
        return usdwst;
    }

    public void setUsdwst(Double usdwst) {
        this.usdwst = usdwst;
    }

    public Double getUsdxaf() {
        return usdxaf;
    }

    public void setUsdxaf(Double usdxaf) {
        this.usdxaf = usdxaf;
    }

    public Double getUsdxag() {
        return usdxag;
    }

    public void setUsdxag(Double usdxag) {
        this.usdxag = usdxag;
    }

    public Double getUsdxau() {
        return usdxau;
    }

    public void setUsdxau(Double usdxau) {
        this.usdxau = usdxau;
    }

    public Double getUsdxcd() {
        return usdxcd;
    }

    public void setUsdxcd(Double usdxcd) {
        this.usdxcd = usdxcd;
    }

    public Double getUsdxdr() {
        return usdxdr;
    }

    public void setUsdxdr(Double usdxdr) {
        this.usdxdr = usdxdr;
    }

    public Double getUsdxof() {
        return usdxof;
    }

    public void setUsdxof(Double usdxof) {
        this.usdxof = usdxof;
    }

    public Double getUsdxpf() {
        return usdxpf;
    }

    public void setUsdxpf(Double usdxpf) {
        this.usdxpf = usdxpf;
    }

    public Double getUsdyer() {
        return usdyer;
    }

    public void setUsdyer(Double usdyer) {
        this.usdyer = usdyer;
    }

    public Double getUsdzar() {
        return usdzar;
    }

    public void setUsdzar(Double usdzar) {
        this.usdzar = usdzar;
    }

    public Double getUsdzmk() {
        return usdzmk;
    }

    public void setUsdzmk(Double usdzmk) {
        this.usdzmk = usdzmk;
    }

    public Double getUsdzmw() {
        return usdzmw;
    }

    public void setUsdzmw(Double usdzmw) {
        this.usdzmw = usdzmw;
    }

    public Double getUsdzwl() {
        return usdzwl;
    }

    public void setUsdzwl(Double usdzwl) {
        this.usdzwl = usdzwl;
    }

    @Ignore
    private Double getUsdusd() {
        return 1.0;
    }

    public Map<String, Double> allCurrencyNValue() {
        Map<String, Double> curren = new TreeMap<>();
        curren.put("ALL",getUsdall());
        curren.put("AED",getUsdaed());
        curren.put("AFN",getUsdafn());
        curren.put("AMD",getUsdamd());
        curren.put("ANG",getUsdang());
        curren.put("AOA",getUsdaoa());
        curren.put("ARS",getUsdars());
        curren.put("AUD",getUsdaud());
        curren.put("AWG",getUsdawg());
        curren.put("AZN",getUsdazn());
        curren.put("BAM",getUsdbam());
        curren.put("BBD",getUsdbbd());
        curren.put("BDT",getUsdbdt());
        curren.put("BGN",getUsdbgn());
        curren.put("BHD",getUsdbhd());
        curren.put("BIF",getUsdbif());
        curren.put("BMD",(double) getUsdbmd());
        curren.put("BND",getUsdbnd());
        curren.put("BOB",getUsdbob());
        curren.put("BRL",getUsdbrl());
        curren.put("BSD",getUsdbsd());
        curren.put("BTC",getUsdbtc());
        curren.put("BTN",getUsdbtn());
        curren.put("BWP",getUsdbwp());
        curren.put("BYN",getUsdbyn());
        curren.put("BYR",(double) getUsdbyr());
        curren.put("BZD",getUsdbzd());
        curren.put("CAD",getUsdcad());
        curren.put("CDF",getUsdcdf());
        curren.put("CHF",getUsdchf());
        curren.put("CLF",getUsdclf());
        curren.put("CLP",getUsdclp());
        curren.put("CNY",getUsdcny());
        curren.put("COP",getUsdcop());
        curren.put("CRC",getUsdcrc());
        curren.put("CUC",(double) getUsdcuc());
        curren.put("CUP",getUsdcup());
        curren.put("CVE",getUsdcve());
        curren.put("CZK",getUsdczk());
        curren.put("DJF",getUsddjf());
        curren.put("DKK",getUsddkk());
        curren.put("DOP",getUsddop());
        curren.put("DZD",getUsddzd());
        curren.put("EGP",getUsdegp());
        curren.put("ERN",(double) getUsdern());
        curren.put("ETB",getUsdetb());
        curren.put("EUR",getUsdeur());
        curren.put("FJD",getUsdfjd());
        curren.put("FKP",getUsdfkp());
        curren.put("GBP",getUsdgbp());
        curren.put("GEL",getUsdgel());
        curren.put("GGP",getUsdggp());
        curren.put("GHS",getUsdghs());
        curren.put("GMD",getUsdgmd());
        curren.put("GYD",getUsdgyd());
        curren.put("GTQ",getUsdgtq());
        curren.put("GIP",getUsdgip());
        curren.put("GNF",getUsdgnf());
        curren.put("HKD",getUsdhkd());
        curren.put("HNL",getUsdhnl());
        curren.put("HRK",getUsdhrk());
        curren.put("HTG",getUsdhtg());
        curren.put("HUF",getUsdhuf());
        curren.put("IDR",getUsdidr());
        curren.put("ILS",getUsdils());
        curren.put("IMP",getUsdimp());
        curren.put("INR",getUsdinr());
        curren.put("IQD",getUsdiqd());
        curren.put("IRR",getUsdirr());
        curren.put("ISK",getUsdisk());
        curren.put("JEP",getUsdjep());
        curren.put("JMD",getUsdjmd());
        curren.put("JOD",getUsdjod());
        curren.put("JPY",getUsdjpy());
        curren.put("KES",getUsdkes());
        curren.put("KGS",getUsdkgs());
        curren.put("KHR",getUsdkhr());
        curren.put("KMF",getUsdkmf());
        curren.put("KPW",getUsdkpw());
        curren.put("KRW",getUsdkrw());
        curren.put("KWD",getUsdkwd());
        curren.put("KYD",getUsdkyd());
        curren.put("KZT",getUsdkzt());
        curren.put("LAK",getUsdlak());
        curren.put("LBP",getUsdlbp());
        curren.put("LKR",getUsdlkr());
        curren.put("LRD",getUsdlrd());
        curren.put("LSL",getUsdlsl());
        curren.put("LTL",getUsdltl());
        curren.put("LVL",getUsdlvl());
        curren.put("LYD",getUsdlyd());
        curren.put("MAD",getUsdmad());
        curren.put("MDL",getUsdmdl());
        curren.put("MGA",getUsdmga());
        curren.put("MKD",getUsdmkd());
        curren.put("MMK",getUsdmmk());
        curren.put("MNT",getUsdmnt());
        curren.put("MOP",getUsdmop());
        curren.put("MRO",getUsdmro());
        curren.put("MUR",getUsdmur());
        curren.put("MVR",getUsdmvr());
        curren.put("MWK",getUsdmwk());
        curren.put("MXN",getUsdmxn());
        curren.put("MYR",getUsdmyr());
        curren.put("MZN",getUsdmzn());
        curren.put("NAD",getUsdnad());
        curren.put("NGN",getUsdngn());
        curren.put("NIO",getUsdnio());
        curren.put("NOK",getUsdnok());
        curren.put("NPR",getUsdnpr());
        curren.put("NZD",getUsdnzd());
        curren.put("OMR",getUsdomr());
        curren.put("PAB",getUsdpab());
        curren.put("PEN",getUsdpen());
        curren.put("PHP",getUsdphp());
        curren.put("PGK",getUsdpgk());
        curren.put("PKR",getUsdpkr());
        curren.put("PLN",getUsdpln());
        curren.put("PYG",getUsdpyg());
        curren.put("QAR",getUsdqar());
        curren.put("RON",getUsdron());
        curren.put("RSD",getUsdrsd());
        curren.put("RUB",getUsdrub());
        curren.put("RWF",getUsdrwf());
        curren.put("SLE",getUsdsle());
        curren.put("SAR",getUsdsar());
        curren.put("SBD",getUsdsbd());
        curren.put("SCR",getUsdscr());
        curren.put("SDG",getUsdsdg());
        curren.put("SEK",getUsdsek());
        curren.put("SGD",getUsdsgd());
        curren.put("SHP",getUsdshp());
        curren.put("SLL",getUsdsll());
        curren.put("SOS",getUsdsos());
        curren.put("SRD",getUsdsrd());
        curren.put("STD",getUsdstd());
        curren.put("SVC",getUsdsvc());
        curren.put("SYP",getUsdsyp());
        curren.put("SZL",getUsdszl());
        curren.put("THB",getUsdthb());
        curren.put("TJS",getUsdtjs());
        curren.put("TMT",getUsdtmt());
        curren.put("TOP",getUsdtop());
        curren.put("TND",getUsdtnd());
        curren.put("TTD",getUsdttd());
        curren.put("TWD",getUsdtwd());
        curren.put("TZS",getUsdtzs());
        curren.put("TRY",getUsdtry());
        curren.put("UAH",getUsduah());
        curren.put("UGX",getUsdugx());
        curren.put("USD",getUsdusd());
        curren.put("UYU",getUsduyu());
        curren.put("UZS",getUsduzs());
        curren.put("VEF",getUsdvef());
        curren.put("VES",getUsdves());
        curren.put("VND",getUsdvnd());
        curren.put("VUV",getUsdvuv());
        curren.put("WST",getUsdwst());
        curren.put("XAF",getUsdxaf());
        curren.put("XAG",getUsdxag());
        curren.put("XAU",getUsdxau());
        curren.put("XCD",getUsdxcd());
        curren.put("XDR",getUsdxdr());
        curren.put("XOF",getUsdxof());
        curren.put("XPF",getUsdxpf());
        curren.put("YER",getUsdyer());
        curren.put("ZAR",getUsdzar());
        curren.put("ZMK",getUsdzmk());
        curren.put("ZMW",getUsdzmw());
        curren.put("ZWL",getUsdzwl());
        return curren;
    }
}