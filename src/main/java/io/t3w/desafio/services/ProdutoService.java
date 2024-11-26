package io.t3w.desafio.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class ProdutoService {

    @Autowired
    private DataSource dataSource;

}
