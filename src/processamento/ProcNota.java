package processamento;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProcNota {
    private String nomeClienteFatura;
    private LocalDate dataDaBaixa;

    public ProcNota (String nomeCliente) {
        nomeClienteFatura = nomeCliente;
    }

    public void baixarNota() {
        dataDaBaixa = LocalDate.now();
    }

    public String getDataDaBaixa() {
        if (dataDaBaixa == null) {
            return "Data não definida. Nota não foi dada Baixa.";
        }  
        DateTimeFormatter dtf =
            DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return dataDaBaixa.format(dtf) + "";
    }
    
    public String getNomeClienteFatura() {
        return nomeClienteFatura;
    }
    public void setNomeClienteFatura(String nomeClienteFatura) {
        this.nomeClienteFatura = nomeClienteFatura;
    }
}
