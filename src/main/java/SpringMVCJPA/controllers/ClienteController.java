package SpringMVCJPA.controllers;

import SpringMVCJPA.models.dao.IClienteDao;
import SpringMVCJPA.models.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;


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
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de clientes");
        model.addAttribute("clientes", clienteDao.findAll());
        System.out.println(clienteDao.findAll());
        return "listar";
    }

    @RequestMapping(value ="/form")
    public String crear(Map<String, Object> model) {
        Cliente cliente = new Cliente();
        model.put("cliente", cliente);
        model.put("titulo", "Formulario de cliente");
        return "form";
    }

    @PostMapping("/form")
    public String guardar(Cliente cliente) {
        clienteDao.save(cliente);
        return "redirect:listar";
    }

}
