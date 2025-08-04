package br.com.fiap.bean;

import javax.swing.*;

public class Equipe {
    //atributos
    private String nome;
    private String[] integrantes;

    //construtores
    public Equipe() {

    }

    public Equipe(String nome, String[] integrantes) {
        this.nome = nome;
        this.integrantes = integrantes;
    }
    //métodos get/set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(String[] integrantes) {
        this.integrantes = integrantes;
    }

    //métodos da classe (particulares)
    public void listarEquipe() {
        String exibe = String.format("Nome da equipe: %s \n", nome);
        int cont = 1;
        for (String i : integrantes) {
            exibe += String.format("integrante %d: %s \n", cont, i);
            cont++;
        }
        JOptionPane.showMessageDialog(null, exibe, "Listagem da Equipe", JOptionPane.INFORMATION_MESSAGE);
    }
}
