package com.gerenciado_de_tarefas.gerenciado_de_tarefas.repositories;

import com.gerenciado_de_tarefas.gerenciado_de_tarefas.models.TarefasModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TarefaRepository  extends JpaRepository<TarefasModel, UUID> {


}
