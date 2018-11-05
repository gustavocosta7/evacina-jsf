package br.ifam.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

//18 - 2000 : 42000
//18 - 3000 : 66000
//18 - 4000 : 92000
//18 - 5000 : 120000

//18 - 1 : 25
//18 - 2 : 52
//18 - 3 : 81
//18 - 4 : 112


@Entity
//@TableGenerator(name="tab", initialValue=1, allocationSize=2)
public class Paciente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    //@GeneratedValue(strategy = GenerationType.TABLE, generator = "tab")
    private long sus;
    private String nome;
    private String sexo;
    private String nascimento;
    @OneToMany
    @JoinColumn(name="sus")
    private List<Vacinacao> vacinacao;


    public Paciente() {
		// TODO Auto-generated constructor stub
	}

    public Paciente(String nome, String sexo, String nascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    public Paciente(long sus, String nome, String sexo, String nascimento) {
        this.sus = sus;
        this.nome = nome;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    
    
    public Paciente(long sus, String nome, String sexo, String nascimento, List<Vacinacao> vacinacao) {
		this.sus = sus;
		this.nome = nome;
		this.sexo = sexo;
		this.nascimento = nascimento;
		this.vacinacao = vacinacao;
	}

	public long getSus() {
        return sus;
    }

    public void setSus(long sus) {
        this.sus = sus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}
