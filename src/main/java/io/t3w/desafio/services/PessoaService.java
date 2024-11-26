package io.t3w.desafio.services;

import io.t3w.desafio.data.dao.PessoaDAO;
import io.t3w.desafio.data.entity.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private DataSource dataSource;

    public List<Pessoa> findPessoas() {
        try (final var connection = dataSource.getConnection()) {
            return new PessoaDAO(connection).findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Pessoa save(final Pessoa pessoa) {
        // TODO: Implementar update e insert da pessoa
        try (final var connection = dataSource.getConnection()) {
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
