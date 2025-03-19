package com.gerenciado_de_tarefas.gerenciado_de_tarefas.controllers;

import com.gerenciado_de_tarefas.gerenciado_de_tarefas.dtos.TarefasDto;
import com.gerenciado_de_tarefas.gerenciado_de_tarefas.models.TarefasModel;
import com.gerenciado_de_tarefas.gerenciado_de_tarefas.services.TarefaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/tarefas")
public class TarefaController {
    private final TarefaService tarefaService;

    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @PostMapping
    public ResponseEntity<TarefasModel> saveTarefa(@RequestBody TarefasDto tarefasDto){
        return ResponseEntity.status(HttpStatus.CREATED).body(tarefaService.saveTarefa(tarefasDto));
    }
}
