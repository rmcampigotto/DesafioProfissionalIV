public class Paciente {
    private int id;
    private String nome;
    private String dtNasc;  // Alterado para String
    private String genero;
    private String endereco;
    private String cidade;
    private long telefone;
    private String upa;

    public Paciente(int id, String nome, String dtNasc, String genero, String endereco, String cidade, long telefone, String upa) {
        this.id = id;
        this.nome = nome;
        this.dtNasc = formatarData(dtNasc); // Formata a data ao criar o objeto
        this.genero = genero;
        this.endereco = endereco;
        this.cidade = cidade;
        this.telefone = telefone;
        this.upa = upa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public String getUpa() {
        return upa;
    }

    public void setUpa(String upa) {
        this.upa = upa;
    }

    private String formatarData(String data) {
        if (data.length() != 8) {
            // Verifica se a string tem o comprimento esperado
            throw new IllegalArgumentException("A string de data deve ter 8 caracteres no formato ddMMyyyy");
        }

        String dia = data.substring(0, 2);
        String mes = data.substring(2, 4);
        String ano = data.substring(4, 8);

        return dia + "/" + mes + "/" + ano;
    }
}
