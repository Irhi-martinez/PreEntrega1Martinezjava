package irina.martinez.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class productos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Double precio;

          public long getId(){
              return id;
          }
          public void setId(Long id){
              this.id= id;
          }
           public String getNombre(){
              return nombre;
           }
           public void setNombre(String nombre){
              this.nombre= nombre;
           }
           public Double getPrecio(){
              return precio;
           }
           public void setPrecio(double precio){
              this.precio = precio;
           }
}

