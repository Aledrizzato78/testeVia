package com.example.testevia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
public class TesteViaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TesteViaApplication.class, args);
    }

    @Entity
    public static class Vendedor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        @Column(unique = true)
        private String matricula;

        @NotBlank
        private String nome;

        private LocalDate dataNascimento;

        @NotBlank
        private String cpfCnpj;

        @NotBlank
        @Email
        private String email;

        @NotBlank
        private String tipoContratacao;

        // getters e setters
    }

    @Entity
    public static class Filial {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank
        private String nome;

        @NotBlank
        private String cnpj;

        private String cidade;
        private String uf;
        private String tipo;
        private boolean ativo;

        // getters e setters
    }

    @Repository
    public interface VendedorRepository extends JpaRepository<Vendedor, Long> {
    }

    @Repository
    public interface FilialRepository extends JpaRepository<Filial, Long> {
    }

    @Service
    public class VendedorService {
        @Autowired
        private VendedorRepository vendedorRepository;

        // Métodos CRUD para vendedores
    }

    @Service
    public class FilialService {
        @Autowired
        private FilialRepository filialRepository;

        // Métodos CRUD para filiais
    }

    @RestController
    @RequestMapping("/api/vendedores")
    public class VendedorController {
        private final VendedorService vendedorService;

        public VendedorController(VendedorService vendedorService) {
            this.vendedorService = vendedorService;
        }

        // Endpoints para CRUD de vendedores
    }

    @RestController
    @RequestMapping("/api/filiais")
    public class FilialController {
        private final FilialService filialService;

        public FilialController(FilialService filialService) {
            this.filialService = filialService;
        }

        // Endpoints para CRUD de filiais
    }

    @Bean
    public VendedorRepository vendedorRepository() {
        return new VendedorRepository() {
            @Override
            public List<Vendedor> findAll() {
                return null;
            }

            @Override
            public List<Vendedor> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Vendedor> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public List<Vendedor> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Vendedor entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Vendedor> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Vendedor> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Vendedor> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Vendedor> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Vendedor> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Vendedor> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Vendedor> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Vendedor getOne(Long aLong) {
                return null;
            }

            @Override
            public Vendedor getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Vendedor> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Vendedor> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Vendedor> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Vendedor> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Vendedor> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Vendedor> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Vendedor, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
            // Implementação dos métodos do repositório, se necessário
        };
    }

    @Bean
    public FilialRepository filialRepository() {
        return new FilialRepository() {
            @Override
            public List<Filial> findAll() {
                return null;
            }

            @Override
            public List<Filial> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Filial> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public List<Filial> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(Filial entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends Filial> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public <S extends Filial> S save(S entity) {
                return null;
            }

            @Override
            public <S extends Filial> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<Filial> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public void flush() {

            }

            @Override
            public <S extends Filial> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Filial> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Filial> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Filial getOne(Long aLong) {
                return null;
            }

            @Override
            public Filial getById(Long aLong) {
                return null;
            }

            @Override
            public <S extends Filial> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Filial> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Filial> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Filial> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Filial> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Filial> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Filial, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
            // Implementação dos métodos do repositório, se necessário
        };
    }
}
