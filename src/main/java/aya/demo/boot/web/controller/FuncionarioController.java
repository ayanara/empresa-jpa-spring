package aya.demo.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/funcionarios")
public class FuncionarioController {

    public String cadastrar(){
        return "funcionario/cadastar.html";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/listar")
    public String listar() {
        return "/funcionario/lista.html";
    }
}


