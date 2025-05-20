package com.devsuperior.dslist.services;

import com.devsuperior.dslist.dto.ListDTO;
import com.devsuperior.dslist.repositories.ListRepoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ListService {
    @Autowired
   private ListRepoitory listRepoitory;

    @Transactional(readOnly = true)
    public List<ListDTO> findAll() {
        var gameList = listRepoitory.findAll();

        return gameList.stream()
                .map(ListDTO::new)
                .toList();
    }
}
