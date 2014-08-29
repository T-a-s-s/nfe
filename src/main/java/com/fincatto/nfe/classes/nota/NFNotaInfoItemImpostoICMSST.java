package com.fincatto.nfe.classes.nota;

import java.math.BigDecimal;

import org.simpleframework.xml.Element;

import com.fincatto.nfe.classes.NFBase;
import com.fincatto.nfe.classes.NFNotaInfoImpostoTributacaoICMS;
import com.fincatto.nfe.classes.NFOrigem;
import com.fincatto.nfe.validadores.BigDecimalParser;

public class NFNotaInfoItemImpostoICMSST extends NFBase {

    @Element(name = "orig", required = true)
    private NFOrigem origem;

    @Element(name = "CST", required = true)
    private NFNotaInfoImpostoTributacaoICMS situacaoTributaria;

    @Element(name = "vBCSTRet", required = true)
    private String valorBCICMSSTRetidoUFRemetente;

    @Element(name = "vICMSSTRet", required = true)
    private String valorICMSSTRetidoUFRemetente;

    @Element(name = "vBCSTDest", required = true)
    private String valorBCICMSSTUFDestino;

    @Element(name = "vICMSSTDest", required = true)
    private String valorICMSSTUFDestino;

    public void setOrigem(final NFOrigem origem) {
        this.origem = origem;
    }

    public void setSituacaoTributaria(final NFNotaInfoImpostoTributacaoICMS situacaoTributaria) {
        this.situacaoTributaria = situacaoTributaria;
    }

    public void setValorBCICMSSTRetidoUFRemetente(final BigDecimal valorBCICMSSTRetidoUFRemetente) {
        this.valorBCICMSSTRetidoUFRemetente = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMSSTRetidoUFRemetente);
    }

    public void setValorICMSSTRetidoUFRemetente(final BigDecimal valorICMSSTRetidoUFRemetente) {
        this.valorICMSSTRetidoUFRemetente = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSSTRetidoUFRemetente);
    }

    public void setValorBCICMSSTUFDestino(final BigDecimal valorBCICMSSTUFDestino) {
        this.valorBCICMSSTUFDestino = BigDecimalParser.tamanho15Com2CasasDecimais(valorBCICMSSTUFDestino);
    }

    public void setValorICMSSTUFDestino(final BigDecimal valorICMSSTUFDestino) {
        this.valorICMSSTUFDestino = BigDecimalParser.tamanho15Com2CasasDecimais(valorICMSSTUFDestino);
    }
}