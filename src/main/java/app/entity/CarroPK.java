package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class CarroPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;
  
  /**
   * @generated
   */
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  
  /**
   * @generated
   */
  private java.lang.String contador;
  
  /**
   * Construtor
   * @generated
   */
  public CarroPK(){
  }
  
  /**
   * Obtém id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public CarroPK setId(java.lang.String id){
    this.id = id;
    return this;
  }
  /**
   * Obtém contador
   * return contador
   * @generated
   */
  public java.lang.String getContador(){
    return this.contador;
  }
  
  /**
   * Define contador
   * @param contador contador
   * @generated
   */
  public CarroPK setContador(java.lang.String contador){
    this.contador = contador;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    CarroPK object = (CarroPK)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    if (contador != null ? !contador.equals(object.contador) : object.contador != null) return false;
    return true;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    result = 31 * result + ((contador == null) ? 0 : contador.hashCode());
    return result;
  }

}
