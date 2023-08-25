package br.unitins.model;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Perfil {
    ADMINISTRADOR(1, "Administrador"),
    TECNICO(2, "Técnico");

    private int id;
    private String label;

    Perfil(int id, String label){
        this.id = id;
        this.label = label;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static Perfil valueOf(Integer id) throws IllegalArgumentException {
        if (id == null) {
            return null;
        }
        for (Perfil perfil : Perfil.values()) {
            if (id.equals(perfil.getId())) {
                return perfil;
            }
        }
        throw new IllegalArgumentException("Id inválido: " + id);
    }

}
