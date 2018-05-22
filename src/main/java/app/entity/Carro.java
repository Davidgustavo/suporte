package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CARRO
 * @generated
 */
@Entity
@IdClass(CarroPK.class)
@Table(name = "\"CARRO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Carro")
public class Carro implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "contador", nullable = true, insertable=true, updatable=true)
  private java.lang.String contador;

  /**
  * @generated
  */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date data;

  /**
  * @generated
  */
  @Column(name = "modelo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String modelo;

  /**
  * @generated
  */
  @Column(name = "marca", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String marca;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_funcionario", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Funcionario funcionario;

  /**
   * Construtor
   * @generated
   */
  public Carro(){
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
  public Carro setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém data
   * return data
   * @generated
   */
  
  public java.util.Date getData(){
    return this.data;
  }

  /**
   * Define data
   * @param data data
   * @generated
   */
  public Carro setData(java.util.Date data){
    this.data = data;
    return this;
  }

  /**
   * Obtém modelo
   * return modelo
   * @generated
   */
  
  public java.lang.String getModelo(){
    return this.modelo;
  }

  /**
   * Define modelo
   * @param modelo modelo
   * @generated
   */
  public Carro setModelo(java.lang.String modelo){
    this.modelo = modelo;
    return this;
  }

  /**
   * Obtém marca
   * return marca
   * @generated
   */
  
  public java.lang.String getMarca(){
    return this.marca;
  }

  /**
   * Define marca
   * @param marca marca
   * @generated
   */
  public Carro setMarca(java.lang.String marca){
    this.marca = marca;
    return this;
  }

  /**
   * Obtém funcionario
   * return funcionario
   * @generated
   */
  
  public Funcionario getFuncionario(){
    return this.funcionario;
  }

  /**
   * Define funcionario
   * @param funcionario funcionario
   * @generated
   */
  public Carro setFuncionario(Funcionario funcionario){
    this.funcionario = funcionario;
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
  public Carro setContador(java.lang.String contador){
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
    Carro object = (Carro)obj;
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
