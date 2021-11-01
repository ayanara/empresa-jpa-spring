package aya.demo.boot.service;

import aya.demo.boot.domain.Cargo;

import java.util.List;

public interface CargoService {

    void salvar(Cargo cargo);

    void editar(Cargo cargo);

    void save(Cargo cargo);

    void update(Cargo cargo);

    void excluir(Long id);

    Cargo buscarPorId(Long id);

    List<Cargo> buscarTodos();
}


