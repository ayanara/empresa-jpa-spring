package aya.demo.boot.service;

import aya.demo.boot.dao.DepartamentoDao;
import aya.demo.boot.domain.Departamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DepartamentoServiceimpl implements DepartamentoService {

    @Autowired
    private DepartamentoDao dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Departamento departamento) {
        dao.save(departamento);
    }


    @Transactional(readOnly = false)
    @Override
    public void editar(Departamento departamento) {
        dao.update(departamento);
    }

    @Override
    public void save(Departamento departamento) {

    }

    @Override
    public void update(Departamento departamento) {

    }


    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }


    @Transactional(readOnly = true)
    @Override
    public Departamento buscarPorId(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<Departamento> buscarTodos() {
        return dao.findAll();
    }

    @Override
    public boolean departamentoTemCargos(Long id) {
        if (buscarPorId(id).getCargos().isEmpty()) {
            return false;
        }
        return true;
    }
}




