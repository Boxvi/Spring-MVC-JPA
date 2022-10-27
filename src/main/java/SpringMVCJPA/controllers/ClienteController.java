package SpringMVCJPA.controllers;

import SpringMVCJPA.models.dao.IClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ClienteController {

    @Autowired
    private IClienteDao clienteDao;

    /*
    @RequestMapping(value = "/listar", method = RequestMethod.GET)
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de clientes");
        //System.out.println(clienteDao.findAll());
        model.addAttribute("clientes", clienteDao.findAll());
        return "listar";
    }*/


    @GetMapping("/listar")
    public String listar(Model model){
        model.addAttribute("titulo","Listado de clientes");
        model.addAttribute("clientes", clienteDao.findAll());
        System.out.println(clienteDao.findAll());
        return "listar";
    }



}
