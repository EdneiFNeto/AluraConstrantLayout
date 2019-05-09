package com.example.aluraconstrantlayout.ui.utils;


public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    public static String formataEmtexto(int qtdDias) {

        if (qtdDias > 1)
            return qtdDias + PLURAL;

        return qtdDias + SINGULAR;

    }
}
