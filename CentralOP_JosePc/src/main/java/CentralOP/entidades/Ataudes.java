package CentralOP.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "ataudes")

public class Ataud
{
    @IdAtaud
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdAtaud;

    @Column(name = "Descripcion", nullable = false, length = 100)
    private String Descripcion;

    @Column(name = "Material", nullable = false, length = 50)
    private String Material;

    @Column(name = "Dimension", nullable = false, length = 50)
    private String Dimension;

    @Column(name = "Precio", nullable = false)
    private Double Precio;
}
public Ataud( Integer IdAtaud,  String Descripcion, String Material, String Dimension,Double Precio ) {
    this.IdAtaud = IdAtaud;
    this.Descripcion = Descripcion;
    this.Material = Material;
    this.Dimension = Dimension;
    this.Precio = Precio;
}

public Integer getIdAtaud() {
    return IdAtaud;
}

public void setIdAtaud(Integer IdAtaud) {
    this.IdAtaud = IdAtaud;
}

public String getDescripcion() {
    return Descripcion;
}

public void setDescripcionl(String Descripcion) {
    this.Descripcion = Descripcion;
}

public String getMaterialn() {
    return Material;
}

public void setMaterial(String Material) {
    this.Material = Material;
}

public String getDimensionn() {
    return Dimension;
}

public void setDimension(String Dimension) {
    this.Dimension = Dimension;
}

public String getPrecio() {
    return Precio;
}

public void setPrecio(Double Precio) {
    this.Precio = Precio;
}