package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela FUNCIONARIO
 * @generated
 */
@Entity
@Table(name = "\"FUNCIONARIO\"")
@XmlRootElement
@CronappSecurity(post = "Administrators;Authenticated", get = "Administrators;Authenticated", delete = "Administrators;Authenticated", put = "Administrators;Authenticated")
@JsonFilter("app.entity.Funcionario")
public class Funcionario implements Serializable {

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
  @OneToOne
  @JoinColumn(name="fk_user", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User user;

  /**
  * @generated
  */
  @OneToOne
  @JoinColumn(name="usuarioadicional", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private User usuarioadicional;

  /**
   * Construtor
   * @generated
   */
  public Funcionario(){
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
  public Funcionario setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém user
   * return user
   * @generated
   */
  
  public User getUser(){
    return this.user;
  }

  /**
   * Define user
   * @param user user
   * @generated
   */
  public Funcionario setUser(User user){
    this.user = user;
    return this;
  }

  /**
   * Obtém usuarioadicional
   * return usuarioadicional
   * @generated
   */
  
  public User getUsuarioadicional(){
    return this.usuarioadicional;
  }

  /**
   * Define usuarioadicional
   * @param usuarioadicional usuarioadicional
   * @generated
   */
  public Funcionario setUsuarioadicional(User usuarioadicional){
    this.usuarioadicional = usuarioadicional;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Funcionario object = (Funcionario)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
