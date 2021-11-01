package aya.demo.boot.service;

import aya.demo.boot.dao.CargoDao;
import aya.demo.boot.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class CargoServiceimpl implements CargoService {

    @Autowired
    private CargoDao dao;

    @Override
    public void salvar(Cargo cargo) {
        dao.save(cargo);
    }

    @Override
    public void editar(Cargo cargo) {
        dao.update(cargo);
    }

    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Override
    public Cargo buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Cargo> buscarTodos() {
        return null;
    }

    @Override
    public void save(Cargo cargo) {

    }

    @Override
    public void update(Cargo cargo) {

    }


}


