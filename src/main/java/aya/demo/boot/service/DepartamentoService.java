package aya.demo.boot.service;

import aya.demo.boot.domain.Cargo;
import aya.demo.boot.domain.Departamento;

import java.util.List;

public interface DepartamentoService {

    void salvar(Departamento departamento);

    void editar(Departamento departamento);

    void save(Departamento departamento);

    void update(Departamento departamento);

    void excluir(Long id);

    boolean departamentoTemCargos(Long id);

    Departamento buscarPorId(Long id);

    List<Departamento> buscarTodos();
}
