package com.example.aluraconstrantlayout.ui.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {


    public static final String PORTUGUES = "pt";
    public static final String BRASIL = "br";
    public static final String FORMATO_PADRAO_ = "R$";
    public static final String FORMATO_PADRAO = FORMATO_PADRAO_;
    public static final String FORMATO_COM_ESPACO = "R$ ";

    public static String formataParaBrasileiro(BigDecimal pacote) {

        NumberFormat formato = DecimalFormat.getCurrencyInstance(new Locale(PORTUGUES, BRASIL));
        return formato
                .format(pacote)
                .replace(FORMATO_PADRAO, FORMATO_COM_ESPACO);
    }
}
