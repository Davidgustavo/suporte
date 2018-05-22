package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("FuncionarioDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface FuncionarioDAO extends JpaRepository<Funcionario, java.lang.String> {

  /**
   * Obtém a instância de Funcionario utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Funcionario entity WHERE entity.id = :id")
  public Funcionario findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Funcionario utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Funcionario entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);


    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Carro entity WHERE entity.funcionario.id = :id AND (entity.modelo like concat('%',coalesce(:search,''),'%') OR entity.marca like concat('%',coalesce(:search,''),'%'))")
  public Page<Carro> findCarroGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /** 
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Carro entity WHERE entity.funcionario.id = :id AND (:data is null OR entity.data = :data) AND (:modelo is null OR entity.modelo like concat('%',:modelo,'%')) AND (:marca is null OR entity.marca like concat('%',:marca,'%'))")
  public Page<Carro> findCarroSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="data") java.util.Date data, @Param(value="modelo") java.lang.String modelo, @Param(value="marca") java.lang.String marca, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Carro entity WHERE entity.funcionario.id = :id")
  public Page<Carro> findCarro(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Funcionario entity WHERE entity.id like concat('%',coalesce(:search,''),'%')")
  public Page<Funcionario> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Funcionario entity WHERE (:id is null OR entity.id like concat('%',:id,'%'))")
  public Page<Funcionario> specificSearch(@Param(value="id") java.lang.String id, Pageable pageable);
  
}
