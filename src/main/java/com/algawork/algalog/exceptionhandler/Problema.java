package com.algawork.algalog.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
public class Problema {
    private Integer status;
    private LocalDateTime dataHora;
    private String titulo;
    private List<campo> campos;

    @Getter
    @AllArgsConstructor
    public static class campo{
        private String nome;
        private String mensagem;
    }
}
