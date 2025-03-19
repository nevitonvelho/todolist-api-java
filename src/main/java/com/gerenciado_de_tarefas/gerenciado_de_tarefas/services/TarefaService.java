package com.gerenciado_de_tarefas.gerenciado_de_tarefas.services;

import com.gerenciado_de_tarefas.gerenciado_de_tarefas.dtos.TarefasDto;
import com.gerenciado_de_tarefas.gerenciado_de_tarefas.models.TarefasModel;
import com.gerenciado_de_tarefas.gerenciado_de_tarefas.repositories.TarefaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TarefaService {
    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    @Transactional
    public TarefasModel saveTarefa(TarefasDto tarefasDto) {
        TarefasModel tarefa = new TarefasModel();
        tarefa.setNome(tarefasDto.getNome());
        tarefa.setDescription(tarefasDto.getDescription());
        return tarefaRepository.save(tarefa);
    }
}
