package com.aula.aulaSpring.component;

import com.aula.aulaSpring.entity.Cliente;
import com.aula.aulaSpring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    @Autowired
    ClienteService clienteService;

    @Override
    public void run(String... args){
        this.criarCliente();
    }

    private void criarCliente(){
        Cliente cli = new Cliente();

        cli.setCpf("12346789015");
        cli.setNome("Taina");

        clienteService.add(cli);
    }
}
