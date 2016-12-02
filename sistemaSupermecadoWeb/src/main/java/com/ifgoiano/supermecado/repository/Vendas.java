package com.ifgoiano.supermecado.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ifgoiano.supermecado.model.Venda;

public interface Vendas extends JpaRepository<Venda, Long>{
	@Query(value="SELECT saldo FROM aberturas WHERE funcionario = (:funcionarioId) AND pk_abertura = (select max(pk_abertura) from aberturas) ", nativeQuery=true)
	public String selectSaldoCaixa(@Param("funcionarioId")String funcionario);
	
	@Query(value="SELECT SUM(valor_unitario*qtd) FROM vendas INNER JOIN vendas_itens on pk_venda=fk_venda WHERE usuario= (:funcionarioId) AND fk_abertura= (:fkAbertura) ", nativeQuery=true)
	public String selectTotalVendas(@Param("funcionarioId")String funcionario,@Param("fkAbertura")int fkAbertura);
}
