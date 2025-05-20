package jlpc.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "ataudes")
public class Ataud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idAtaud;

    @Column(name = "Descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "Material", nullable = false, length = 50)
    private String material;

    @Column(name = "Dimension", nullable = false, length = 50)
    private String dimension;

    @Column(name = "Precio", nullable = false)
    private Double precio;

    // Constructor vacío obligatorio para JPA
    public Ataud() {
    }

    // Constructor completo
    public Ataud(Integer idAtaud, String descripcion, String material, String dimension, Double precio) {
        this.idAtaud = idAtaud;
        this.descripcion = descripcion;
        this.material = material;
        this.dimension = dimension;
        this.precio = precio;
    }

    // Getters y Setters
    public Integer getIdAtaud() {
        return idAtaud;
    }

    public void setIdAtaud(Integer idAtaud) {
        this.idAtaud = idAtaud;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}