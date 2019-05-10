package com.example.aluraconstrantlayout.ui.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.aluraconstrantlayout.ui.model.Pacote;

public class PacoteDAO {

    public List<Pacote> lista() {

        List<Pacote> pacotes = new ArrayList<>(
                Arrays.asList(
                        new Pacote("Recife", "recife_pe", 25, new BigDecimal("215.00")),
                        new Pacote("Rio de Janeiro", "rio_de_janeiro_rj", 22, new BigDecimal("235.00")),
                        new Pacote("Salvador", "salvador_ba", 21, new BigDecimal("145.00")),
                        new Pacote("São Paulo", "sao_paulo_sp", 25, new BigDecimal("245.00"))
                ));
        return pacotes;
    }
}
