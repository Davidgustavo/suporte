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
@Repository("CarroDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface CarroDAO extends JpaRepository<Carro, CarroPK> {

  /**
   * Obtém a instância de Carro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @param contador
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Carro entity WHERE entity.id = :id AND entity.contador = :contador")
  public Carro findOne(@Param(value="id") java.lang.String id, @Param(value="contador") java.lang.String contador);

  /**
   * Remove a instância de Carro utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @param contador
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Carro entity WHERE entity.id = :id AND entity.contador = :contador")
  public void delete(@Param(value="id") java.lang.String id, @Param(value="contador") java.lang.String contador);



  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Carro entity WHERE entity.modelo like concat('%',coalesce(:search,''),'%') OR entity.marca like concat('%',coalesce(:search,''),'%')")
  public Page<Carro> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Carro entity WHERE (:data is null OR entity.data = :data) AND (:modelo is null OR entity.modelo like concat('%',:modelo,'%')) AND (:marca is null OR entity.marca like concat('%',:marca,'%'))")
  public Page<Carro> specificSearch(@Param(value="data") java.util.Date data, @Param(value="modelo") java.lang.String modelo, @Param(value="marca") java.lang.String marca, Pageable pageable);
  
  /**
   * Foreign Key funcionario
   * @generated
   */
  @Query("SELECT entity FROM Carro entity WHERE entity.funcionario.id = :id")
  public Page<Carro> findCarrosByFuncionario(@Param(value="id") java.lang.String id, Pageable pageable);

}
