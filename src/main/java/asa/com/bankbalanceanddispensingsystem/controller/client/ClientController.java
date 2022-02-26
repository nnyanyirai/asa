package asa.com.bankbalanceanddispensingsystem.controller.client;

import asa.com.bankbalanceanddispensingsystem.model.client.Client;
import asa.com.bankbalanceanddispensingsystem.service.client.ClientService;
import org.springframework.web.bind.annotation.*;

@RestController
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @PostMapping("api/v1/createClient")
    public Client createClient(@RequestBody Client client){
        return clientService.createClient(client);
    }
    @PutMapping("api/v1/updateClient/{id}")
    public Client updateClient(@PathVariable Integer id, @RequestBody Client client){
        return clientService.updateClient(id, client);
    }
    @GetMapping("api/v1/getClientById/{id}")
    public Client getClientById(@PathVariable Integer id){
        return clientService.getClientById(id);
    }
    @GetMapping("api/v1/getAllClients")
    Iterable <Client> getAllClients(){
        return clientService.getAllClients();
    }
    @DeleteMapping("api/v1/deleteClient/{id}")
    public  void deleteClient(@PathVariable Integer id){
        clientService.deleteClient(id);
    }
}
