package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco dadosEndereco) {
        this.logradouro = dadosEndereco.logradouro();
        this.bairro = dadosEndereco.bairro();
        this.cep = dadosEndereco.cep();
        this.uf = dadosEndereco.uf();
        this.cidade = dadosEndereco.cidade();
        this.numero = dadosEndereco.numero();
        this.complemento = dadosEndereco.complemento();
    }

    public void atualizarInformacoes(DadosEndereco dadosEndereco) {
        if (dadosEndereco.logradouro() != null){
            this.logradouro = dadosEndereco.logradouro();
        }

        if (dadosEndereco.bairro() != null){
            this.bairro = dadosEndereco.bairro();
        }

        if (dadosEndereco.cep() != null){
            this.cep = dadosEndereco.cep();
        }
        if (dadosEndereco.numero() != null){
            this.numero = dadosEndereco.numero();
        }
        if (dadosEndereco.complemento() != null){
            this.complemento = dadosEndereco.complemento();
        }
        if (dadosEndereco.cidade() != null){
            this.cidade = dadosEndereco.cidade();
        }
        if (dadosEndereco.uf() != null){
            this.uf = dadosEndereco.uf();
        }
    }
}
