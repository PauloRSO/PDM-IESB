package br.com.paulogabriel.pdm.Classes;



public class Escola {
    private int codEscola;
    private String nome;
    private String email;
    private float latitude;
    private float longitude;

    /*
    private String rede;
    private String esferaAdministrativa;
    private String categoriaEscolaPrivada;
    private String situacaoFuncionamento;
    private String tipoConvenioPoderPublico;
    private String cnpj;
    private String telefone;
    private String seFimLucrativo;
    private String seConveniadaSetorPublico;
    private int qtdSalasExistentes;
    private int qtdSalasUtilizadas;
    private int qtdFuncionarios;
    private int qtdComputadores;
    private int qtdComputadoresPorAluno;
    private int qtdAlunos;
    private Endereco endereco;
    private String zona;
    private Infraestrutura infraestrutura;
    private Links link;
    */

    public Escola(){
    }


    public Escola(int codEscola, String nome, String email, float latitude, float longitude){
        this.codEscola = codEscola;
        this.nome = nome;
        this.email = email;
        this.latitude = latitude;
        this.longitude = longitude;
    }


    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getCodEscola() {
        return codEscola;
    }

    public void setCodEscola(int codEscola) {
        this.codEscola = codEscola;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
/*
    public String getRede() {
        return rede;
    }

    public void setRede(String rede) {
        this.rede = rede;
    }

    public String getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    public void setEsferaAdministrativa(String esferaAdministrativa) {
        this.esferaAdministrativa = esferaAdministrativa;
    }

    public String getCategoriaEscolaPrivada() {
        return categoriaEscolaPrivada;
    }

    public void setCategoriaEscolaPrivada(String categoriaEscolaPrivada) {
        this.categoriaEscolaPrivada = categoriaEscolaPrivada;
    }

    public String getSituacaoFuncionamento() {
        return situacaoFuncionamento;
    }

    public void setSituacaoFuncionamento(String situacaoFuncionamento) {
        this.situacaoFuncionamento = situacaoFuncionamento;
    }

    public String getTipoConvenioPoderPublico() {
        return tipoConvenioPoderPublico;
    }

    public void setTipoConvenioPoderPublico(String tipoConvenioPoderPublico) {
        this.tipoConvenioPoderPublico = tipoConvenioPoderPublico;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSeFimLucrativo() {
        return seFimLucrativo;
    }

    public void setSeFimLucrativo(String seFimLucrativo) {
        this.seFimLucrativo = seFimLucrativo;
    }

    public String getSeConveniadaSetorPublico() {
        return seConveniadaSetorPublico;
    }

    public void setSeConveniadaSetorPublico(String seConveniadaSetorPublico) {
        this.seConveniadaSetorPublico = seConveniadaSetorPublico;
    }

    public int getQtdSalasExistentes() {
        return qtdSalasExistentes;
    }

    public void setQtdSalasExistentes(int qtdSalasExistentes) {
        this.qtdSalasExistentes = qtdSalasExistentes;
    }

    public int getQtdSalasUtilizadas() {
        return qtdSalasUtilizadas;
    }

    public void setQtdSalasUtilizadas(int qtdSalasUtilizadas) {
        this.qtdSalasUtilizadas = qtdSalasUtilizadas;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public int getQtdComputadores() {
        return qtdComputadores;
    }

    public void setQtdComputadores(int qtdComputadores) {
        this.qtdComputadores = qtdComputadores;
    }

    public int getQtdComputadoresPorAluno() {
        return qtdComputadoresPorAluno;
    }

    public void setQtdComputadoresPorAluno(int qtdComputadoresPorAluno) {
        this.qtdComputadoresPorAluno = qtdComputadoresPorAluno;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    */
}
