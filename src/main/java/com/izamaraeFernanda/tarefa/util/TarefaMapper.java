package com.izamaraeFernanda.tarefa.util;

import org.springframework.stereotype.Component;

import com.izamaraeFernanda.tarefa.dto.request.TarefaRequestDTO;
import com.izamaraeFernanda.tarefa.dto.response.TarefaResponseDTO;
import com.izamaraeFernanda.tarefa.entity.Tarefa;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TarefaMapper {

    public Tarefa toPerson(TarefaRequestDTO personDTO) {

        return Tarefa.builder()
                .nome(personDTO.getNome())
                .descricao(personDTO.getDescricao())
                .status(personDTO.getStatus())
                .observacao(personDTO.getObservacao())
                .data_criacao(personDTO.getData_criacao())
                .data_atualizacao(personDTO.getData_atualizacao())
                .build();

    }

    public TarefaResponseDTO toPersonDTO(Tarefa tarefa) {
        return new TarefaResponseDTO(tarefa);
    }

    public List<TarefaResponseDTO> toPeopleDTO(List<Tarefa> peopleList) {
        return peopleList.stream().map(TarefaResponseDTO::new).collect(Collectors.toList());
    }

    public void updatePersonData(Tarefa tarefa, TarefaRequestDTO personDTO) {

        tarefa.setNome(personDTO.getNome());
        tarefa.setDescricao(personDTO.getDescricao());
        tarefa.setStatus(personDTO.getStatus());
        tarefa.setObservacao(personDTO.getObservacao());
        tarefa.setData_criacao(personDTO.getData_criacao());
        tarefa.setData_atualizacao(personDTO.getData_atualizacao());

    }

}
