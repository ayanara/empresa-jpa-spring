package aya.demo.boot.dao;

import aya.demo.boot.domain.Funcionario;
import org.springframework.stereotype.Repository;

@Repository
public class FuncionarioDaoimpl extends AbstractDao<Funcionario,Long>implements FuncionarioDao {
}
